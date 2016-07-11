package tests;

import api.android.Android;
import api.apps.holidayiq.menu.Menu;
import core.managers.TestManager;
import org.junit.Test;

/**
 * Created by apple on 08/07/16.
 */
public class MenuNavigation extends TestManager {

    private static Menu menu = Android.app.menu;

    @Test
    public void test5()  {
        testInfo.id("test5").suite("MenuNavigation").name("Click on Email Login");
        menu.login.tapemaillogin();
    }
    @Test
    public void test6()  {
        testInfo.id("test6").suite("MenuNavigation").name("Click on Sign In link");
        menu.login.signin();
    }
    @Test
    public void test7()  {
        testInfo.id("test7").suite("MenuNavigation").name("Click on Email Login");
        menu.signIn.emailid();
    }
    @Test
    public void test8()  {
        testInfo.id("test8").suite("MenuNavigation").name("Enter emailid");
        menu.signIn.emailid();
    }
    @Test
    public void test9()  {
        testInfo.id("test9").suite("MenuNavigation").name("Enter password");
        menu.signIn.password();
    }


}
