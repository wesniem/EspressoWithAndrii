package com.example.espressoactivity.MainInterface

interface MainInterface {
    interface View {
        fun initView()
        fun updateViewData()
    }

    interface Presenter {
        fun changePreviousString(string: String)
        fun getUserString(): String
    }

    interface Model {
        fun updateString(string: String)
        fun getUserString(): String
    }
}