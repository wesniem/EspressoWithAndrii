package com.example.espressoactivity.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.espressoactivity.MainInterface.MainInterface
import com.example.espressoactivity.R
import com.example.espressoactivity.presenter.MainActivityPresenter

class MainActivity : AppCompatActivity(), MainInterface.View {
    private var presenter: MainActivityPresenter? = null

    private lateinit var displayView: TextView
    private lateinit var userInputView: EditText
    private lateinit var submitButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayView = findViewById(R.id.display_view_text_view)
        userInputView = findViewById(R.id.user_input_edit_text)
        submitButton = findViewById(R.id.submit_button)
        presenter = MainActivity(this)
    }

    override fun initView() {
displayView.text = presenter    }

    override fun updateViewData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
