package api.apps.holidayiq.destination.about;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 24/06/16.
 */
public class AboutUiObject {

    private static UiObject
            tapabout
            ;

    public UiObject tapabout() {
        if (tapabout == null) tapabout = new UiSelector().text("ABOUT").makeUiObject();
        return tapabout;
    }



}
