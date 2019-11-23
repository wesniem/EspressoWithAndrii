package com.example.espressoactivity.model

import com.example.espressoactivity.MainInterface.MainInterface
import com.example.espressoactivity.utils.IObservable
import com.example.espressoactivity.utils.Observable

class MainActivityModel : MainInterface.Model {

    private val _whenUserStringChanged = Observable("")
    fun whenUserStringChanged(): IObservable<String> = _whenUserStringChanged

    override fun updateString(string: String) {
        _whenUserStringChanged.pushValue(string)
    }


    /*

        1) replace our observable with RxJava BehaviorSubject
        2) add delay to _whenUserStringChanged on background thread
        3) fix espresso tests
    4) Come up with anything I don't understand questions
     */

}