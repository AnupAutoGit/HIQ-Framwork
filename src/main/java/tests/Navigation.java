package tests;

import api.android.Android;
import api.apps.holidayiq.Holidayiq;
import core.managers.TestManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Anup on 6/2/2016.
 */
public class Navigation extends TestManager {

    private static Holidayiq holidayiq = Android.app.holidayiq;
    //private static Menu menu= Android.app.menu;

    @BeforeClass
    public static void beforeclass(){
        holidayiq.open();


    }
    @Before
    public void before(){
        testInfo.suite("Navigation");
    }

    @Test
    public void test1(){
        testInfo.id("test1").name("Open Intro Screen");
    }

    @Test
    public void test2(){
        testInfo.id("test2").name("Verify Intro Screen object");
        holidayiq.intro.uiObject.guest().waitToAppear(300);

        Assert.assertTrue(holidayiq.intro.uiObject.guest().exists());
        Assert.assertTrue(holidayiq.intro.uiObject.facebooklogin().exists());
    }
    @Test
    public void test3() throws InterruptedException {
        testInfo.id("test3").suite("Navigation").name("Click on Guest Button");
        holidayiq.splashsceen.tapguest();
    }
    @Test
    public void test4() throws InterruptedException {
        testInfo.id("test4").suite("Navigation").name("Click on Menu Icon");
        holidayiq.home.tapmenu();
    }




}
