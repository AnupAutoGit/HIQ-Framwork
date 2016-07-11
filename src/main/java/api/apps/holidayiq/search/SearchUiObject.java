package api.apps.holidayiq.search;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 04/07/16.
 */
public class SearchUiObject {

    private static UiObject
    searchoutput,
    tapseachoutput;

    public UiObject tapseachoutput() {
        if (tapseachoutput == null) tapseachoutput = new UiSelector().xPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]").makeUiObject();
        return tapseachoutput;
    }
    public UiObject searchoutput() {
        if (searchoutput == null) searchoutput = new UiSelector().xPath("//android.widget.LinearLayout[@bounds='[168,272][1056,388]']").makeUiObject();
        return searchoutput;
    }
}
