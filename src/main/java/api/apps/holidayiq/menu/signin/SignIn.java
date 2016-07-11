package api.apps.holidayiq.menu.signin;

import api.android.Android;
import api.apps.holidayiq.menu.profile.Profile;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

;

/**
 * Created by apple on 08/07/16.
 */
public class SignIn {

    public SignInUiObject uiObject = new SignInUiObject();

    public SignIn emailid() {
        try {
            MyLogger.log.info("Enter EmailID");

            uiObject.emailid().clearText().typeText("anoop.xing@gmail.com");
            Android.app.menu.signIn.uiObject.emailid().waitToAppear(120);
            return Android.app.menu.signIn;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant enater emailid, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }
    public SignIn password() {
        try {
            MyLogger.log.info("Enter Password");

            uiObject.password().typeText("pass123");

            return Android.app.menu.signIn;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant enater Password, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }
    public Profile taplogon() {
        try {
            MyLogger.log.info("Tapping Login link");
            uiObject.logon().tap();
            return Android.app.menu.profile;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Login link element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }
}
