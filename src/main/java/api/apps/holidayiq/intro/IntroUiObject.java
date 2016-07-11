package api.apps.holidayiq.intro;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 28/06/16.
 */
public class IntroUiObject {
    private static UiObject
            guest,
            facebooklogin;


    public UiObject guest() {
        if (guest == null) guest = new UiSelector().text("Continue as Guest").makeUiObject();
        return guest;
    }

    public UiObject facebooklogin() {
        if (facebooklogin == null) facebooklogin = new UiSelector().text("Login with Facebook").makeUiObject();
        return facebooklogin;
    }


}
