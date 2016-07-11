package api.apps.holidayiq.menu.signin;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 08/07/16.
 */
public class SignInUiObject {
    private static UiObject
    emailid,
    password,
    logon;

    public UiObject emailid() {
        if (emailid == null) emailid = new UiSelector().resourceId("com.holidayiq:id/fs_edittext_email").makeUiObject();
        return emailid;
    }
    public UiObject password() {
        if (password == null) password = new UiSelector().resourceId("com.holidayiq:id/fs_edittext_password").makeUiObject();
        return password;
    }
    public UiObject logon() {
        if (logon == null) logon = new UiSelector().text("LOGIN").makeUiObject();
        return logon;
    }
}
