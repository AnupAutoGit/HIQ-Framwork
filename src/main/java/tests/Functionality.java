package tests;

import api.android.Android;
import api.apps.holidayiq.Holidayiq;
import core.managers.TestManager;
import org.junit.Test;


/**
 * Created by Anup on 6/2/2016.
 */
public class Functionality extends TestManager {

    private static Holidayiq holidayiq = Android.app.holidayiq;


    @Test
    public void test12() throws InterruptedException {

        testInfo.id("test12").suite("Functionality").name("Click on hotel link");
        holidayiq.home.taphotels();


    }
}
