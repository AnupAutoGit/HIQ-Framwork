package api.apps.holidayiq.destination.shortlist;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 24/06/16.
 */
public class ShortlistUiObject {

    private static UiObject
            tapshortlist;

    public UiObject tapshortlist() {
        if (tapshortlist == null) tapshortlist = new UiSelector().resourceId("com.holidayiq:id/ibShortList").makeUiObject();
        return tapshortlist;
    }
}
