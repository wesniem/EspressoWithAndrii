package com.example.espressoactivity.view

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.example.espressoactivity.R
import org.hamcrest.CoreMatchers.containsString
import org.junit.Rule

import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityEspressoTest {
@get:Rule
val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test fun screenHasSubmitButtonAndIsVisible() {
        onView(withId(R.id.submit_button))
            .check(matches(isDisplayed()))
    }

    @Test fun checkTextIsVisibleOnButtonClick() {
        onView(withId(R.id.user_input_edit_text))
            .perform(typeText("Hello"), click())

        onView(withId(R.id.display_view_text_view))
            .check(matches(withText(containsString("Hello"))))

    }
}
