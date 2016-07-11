package api.apps.holidayiq.splashscreen;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 30/06/16.
 */
public class SplashscreenUiObject {

    private static UiObject
            tapclose,
            tapguest;

    public UiObject tapclose(){
        if(tapclose == null) tapclose = new UiSelector().xPath("//android.widget.ImageView[@bounds='[966,114][1080,234]']").makeUiObject();
        return tapclose;
    }

    public UiObject tapguest() {
        if (tapguest == null) tapguest = new UiSelector().text("Continue as Guest").makeUiObject();
        return tapguest;
    }

}
