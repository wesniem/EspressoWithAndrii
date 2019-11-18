package com.example.espressoactivity.presenter

import com.example.espressoactivity.MainInterface.MainInterface
import com.example.espressoactivity.model.MainActivityModel

class MainActivityPresenter(_view: MainInterface.View): MainInterface.Presenter {

    private var view: MainInterface.View = _view
    private var model: MainActivityModel = MainActivityModel()

    init {
        view.initView()
    }

    override fun changePreviousString(string: String) {
        model.updateString(string)
        view.updateViewData()
    }

    override fun getUserString() = model.getUserString()
}