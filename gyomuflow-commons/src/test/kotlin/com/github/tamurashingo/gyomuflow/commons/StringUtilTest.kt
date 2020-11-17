/*-
 * The MIT License
 *
 * Copyright (c) 2020 tamura shingo
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject
 * to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE
 * OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */
package com.github.tamurashingo.gyomuflow.commons

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals

object  StringUtilTest: Spek({
    describe("lineWidth") {
        context("空文字") {
            it("戻り値が0であること") {
                assertEquals(0, StringUtil.lineWidth(""))
            }
        }
        context("1行文字列") {
            context("英字") {
                it("文字列の長さが返ってくること") {
                    assertEquals(1, StringUtil.lineWidth("a"))
                    assertEquals(2, StringUtil.lineWidth("ab"))
                }
            }
            context("日本語") {
                assertEquals(1, StringUtil.lineWidth("あ"))
                assertEquals(2, StringUtil.lineWidth("あい"))
            }
            context("英字日本語の混在") {
                assertEquals(6, StringUtil.lineWidth("abcあいう"))
            }
        }

        context("複数行の文字列") {
            it("1行の文字数が最大のものが返ってくること") {
                assertEquals(1, StringUtil.lineWidth("""a
b"""))

                assertEquals(2, StringUtil.lineWidth("""a
bc"""))
                assertEquals(3, StringUtil.lineWidth("""
あいう
え
お
"""))
            }
        }
    }

    describe("lineHeight") {
        context("空文字") {
            it("戻り値が0であること") {
                assertEquals(0, StringUtil.lineHeight(""))
            }
        }
        context("1文字") {
            it("戻り値が1であること") {
                assertEquals(1, StringUtil.lineHeight("a"))
            }
        }
        context("2行") {
            it("戻り値が2であること") {
                assertEquals(2, StringUtil.lineHeight("""a
b"""))
            }
            context("改行が一つのみ") {
                it("戻り値が2であること") {
                    assertEquals(2, StringUtil.lineHeight("""
"""))
                }
            }
            context("最終行が空行でもカウントされることの確認") {
                it("戻り値が2であること") {
                    assertEquals(2, StringUtil.lineHeight("""this is a pen
"""))
                }
            }
        }
    }
})
