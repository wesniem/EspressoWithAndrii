package com.example.espressoactivity.MainInterface

import com.example.espressoactivity.utils.IObservable

interface MainInterface {
    interface View {
        fun setText(text: String)
        fun whenStringSubmitted(): IObservable<String>
    }

    interface Presenter
    interface Model {
        fun updateString(string: String)
    }
}