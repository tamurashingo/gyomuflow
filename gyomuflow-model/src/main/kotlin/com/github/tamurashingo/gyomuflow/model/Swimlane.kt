package com.github.tamurashingo.gyomuflow.model

data class Swimlane(val name: String, var prev: Swimlane, var next: Swimlane, val activities: List<Swimlane>)

