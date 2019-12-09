package com.example.espressoactivity.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.espressoactivity.MainInterface.MainInterface
import com.example.espressoactivity.R
import com.example.espressoactivity.model.MainActivityModel
import com.example.espressoactivity.presenter.MainActivityPresenter
import com.example.espressoactivity.utils.IObservable
import com.example.espressoactivity.utils.Observable
import rx.subjects.PublishSubject

class MainActivity : AppCompatActivity(), MainInterface.View {

    private var presenter: MainActivityPresenter? = null

    private lateinit var displayView: TextView

    private lateinit var userInputView: EditText

    private lateinit var submitButton: Button

    private val whenStringSubmitted = Observable("")

//    private lateinit var publishSubject: PublishSubject<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayView = findViewById(R.id.display_view_text_view)
        userInputView = findViewById(R.id.user_input_edit_text)
        submitButton = findViewById(R.id.submit_button)
        presenter = MainActivityPresenter(this, MainActivityModel())
        submitButton.setOnClickListener {
            val subject = PublishSubject.create<String>()

            subject.map { whenStringSubmitted.pushValue(userInputView.text.toString()) }.subscribe()
            subject.onNext(userInputView.text.toString())
            subject.hasCompleted()
//            whenStringSubmitted.pushValue(userInputView.text.toString())
        }
    }

    override fun setText(text: String) {
        displayView.text = text
    }

    override fun whenStringSubmitted(): Observable<String> {
       return whenStringSubmitted
    }

}
