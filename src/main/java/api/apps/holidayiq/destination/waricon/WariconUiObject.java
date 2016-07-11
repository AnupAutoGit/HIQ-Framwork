package api.apps.holidayiq.destination.waricon;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 24/06/16.
 */
public class WariconUiObject {

    private static UiObject
            tapwaricon;

    public UiObject tapwaricon() {
        if (tapwaricon == null) tapwaricon = new UiSelector().resourceId("com.holidayiq:id/fab").makeUiObject();
        return tapwaricon;
    }
}
