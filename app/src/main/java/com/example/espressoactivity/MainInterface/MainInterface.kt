package com.example.espressoactivity.MainInterface

interface MainInterface {
    interface View {
        fun initView()
        fun updateViewData()
    }

    interface Presenter {
        fun changePreviousString()
        fun getUserString()
    }

    interface Model {
        fun updateString()
        fun getUserString()
    }
}