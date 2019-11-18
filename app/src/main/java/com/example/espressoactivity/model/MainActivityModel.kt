package com.example.espressoactivity.model

import com.example.espressoactivity.MainInterface.MainInterface

class MainActivityModel: MainInterface.Model {

    private var userString: String = ""

    override fun updateString(string: String) {
        userString = string
    }

    override fun getUserString() = userString
}