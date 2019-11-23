package com.example.espressoactivity.presenter

import com.example.espressoactivity.MainInterface.MainInterface
import com.example.espressoactivity.model.MainActivityModel
import com.example.espressoactivity.utils.Observer

class MainActivityPresenter(private val view: MainInterface.View,
                            private var model: MainActivityModel): MainInterface.Presenter {

    private val userStringObserver = object : Observer<String> {
        override fun onValueChanged(newValue: String) {
            view.setText(newValue)
        }
    }

    private val whenNewStringSubmitted = object: Observer<String> {
        override fun onValueChanged(newValue: String) {
            model.updateString(newValue)
        }
    }

    init {
        model.whenUserStringChanged().subscribe(userStringObserver)
        view.whenStringSubmitted().subscribe(whenNewStringSubmitted)
    }

}