package com.example.nico.nicotaxi;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by nico on 08/09/2016.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);
    @Rule
    public ActivityTestRule<ActivityTwo> mActivityRule2 = new ActivityTestRule<>(ActivityTwo.class);
    @Rule
    public ActivityTestRule<ActivityThree> mActivityRule3 = new ActivityTestRule<>(ActivityThree.class);
    @Rule
    public ActivityTestRule<ActivityFour> mActivityRule4 = new ActivityTestRule<>(ActivityFour.class);
    @Rule
    public ActivityTestRule<ActivityFife> mActivityRule5 = new ActivityTestRule<>(ActivityFife.class);

    @Test
    public void testCase(){
        for (int i = 0; i < 5; i++) {
            onView(withId(R.id.btnAct)).perform(click());
        }
    }
}
