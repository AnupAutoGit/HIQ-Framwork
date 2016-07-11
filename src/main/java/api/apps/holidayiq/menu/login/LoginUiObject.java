package api.apps.holidayiq.menu.login;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 08/07/16.
 */
public class LoginUiObject {

    private static UiObject
            tapemail,
            tapsignin;


    public UiObject tapemail() {
        if (tapemail == null) tapemail = new UiSelector().resourceId("com.holidayiq:id/emaillogin").makeUiObject();
        return tapemail;
    }
    public UiObject tapsignin() {
        if (tapsignin == null) tapsignin = new UiSelector().text("Sign In").makeUiObject();
        return tapsignin;
    }
}
