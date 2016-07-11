package api.apps.holidayiq.popup;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 29/06/16.
 */
public class PopupUiObject {

    private static UiObject
            close,
            plannow;


    public UiObject close() {
        if (close == null) close = new UiSelector().xPath("//android.widget.ImageView[@bounds='[966,114][1080,234]']").makeUiObject();
        return close;
    }

    public UiObject plannow() {
        if (plannow == null) plannow = new UiSelector().text("Plan Now").makeUiObject();
        return plannow;
    }
}
