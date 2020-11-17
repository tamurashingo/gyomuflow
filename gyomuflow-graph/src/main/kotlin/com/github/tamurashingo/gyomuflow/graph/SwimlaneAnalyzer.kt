package com.github.tamurashingo.gyomuflow.graph

import com.github.tamurashingo.gyomuflow.model.Activity
import com.github.tamurashingo.gyomuflow.model.Swimlane

import com.github.tamurashingo.gyomuflow.commons.StringUtil

class SwimlaneAnalyzer(swimLane: Swimlane) {

    fun analyze(): Unit {

    }

    private fun calcWidth(activity: Activity): Int {

        StringUtil.lineWidth(activity.node)

        return 0
    }

}