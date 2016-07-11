package api.apps.holidayiq.menu.profile;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 08/07/16.
 */
public class ProfileUiObject {

    private static UiObject
    tapclose;

    public UiObject tapclose() {
        if (tapclose == null) tapclose = new UiSelector().resourceId("com.holidayiq:id/close_btn").makeUiObject();
        return tapclose;
    }
}
