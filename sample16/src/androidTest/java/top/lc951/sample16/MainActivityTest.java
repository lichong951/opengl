package top.lc951.sample16;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.lang.Thread.sleep;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity
            .class);

    @Test
    public void mainActivityTest() {

        ViewInteraction appCompatButton2 = onView(
                allOf(withText("Sample16_1:AABB包围盒"), isDisplayed()));
        appCompatButton2.perform(click());

        sleep(3000);

        pressBack();

        ViewInteraction appCompatButton3 = onView(
                allOf(withText("Sample16_2:AABB包围盒-旋转"), isDisplayed()));
        appCompatButton3.perform(click());
        sleep(3000);
        pressBack();

        ViewInteraction appCompatButton4 = onView(
                allOf(withText("Sample16_3:穿透效应"), isDisplayed()));
        appCompatButton4.perform(click());
        sleep(3000);
        pressBack();

        ViewInteraction appCompatButton5 = onView(
                allOf(withText("Sample16_4：粒子系统-CPU"), isDisplayed()));
        appCompatButton5.perform(click());
        sleep(3000);
        pressBack();

    }

    private void sleep(int time) {
        try {
            Thread.currentThread().sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
