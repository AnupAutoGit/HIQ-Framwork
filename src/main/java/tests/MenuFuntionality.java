package tests;

import api.android.Android;
import api.apps.holidayiq.menu.Menu;
import core.managers.TestManager;
import org.junit.Test;

/**
 * Created by apple on 08/07/16.
 */
public class MenuFuntionality extends TestManager {

    private static Menu menu = Android.app.menu;
    @Test
    public void test10()  {
        testInfo.id("test10").suite("MenuFuntionality").name("Enter login link");
        menu.signIn.taplogon();
    }
    @Test
    public void test11()  {
        testInfo.id("test11").suite("MenuFuntionality").name("Back Profile page");
        menu.profile.tapback();
    }
}
