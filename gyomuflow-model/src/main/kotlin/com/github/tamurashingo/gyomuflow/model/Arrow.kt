package com.github.tamurashingo.gyomuflow.model

import com.github.tamurashingo.gyomuflow.model.base.Edge
import com.github.tamurashingo.gyomuflow.model.base.Node

open class Arrow(override val from: Node<BaseActivity>, override val to: Node<BaseActivity>): Edge<BaseActivity, BaseActivity>
