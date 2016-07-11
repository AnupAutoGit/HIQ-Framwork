package api.apps.holidayiq.menu.login;

import api.android.Android;
import api.apps.holidayiq.menu.signin.SignIn;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by apple on 08/07/16.
 */
public class Login {

    public LoginUiObject uiObject = new LoginUiObject();

    public SignIn tapemaillogin() {
        try {
            MyLogger.log.info("Tapping Email Login Button");
            uiObject.tapemail().tap();

            return Android.app.menu.signIn;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Email Login Button element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }

    public SignIn signin() {
        try {
            MyLogger.log.info("Tapping Sign In link");
            uiObject.tapsignin().tap();

            return Android.app.menu.signIn;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Sign In link element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }


}
