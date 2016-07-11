package api.apps.holidayiq.home;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 27/06/16.
 */
public class HomeUiObject {
    private static UiObject
    tapsearch,
    taphotels,
    tapsightseen,
    tapweekendideas,
    tapvideo,
    searchinput,
    selectoutput,
    tapmenu;

    public UiObject tapsearch() {
        if (tapsearch == null) tapsearch = new UiSelector().text("Search HolidayIQ").makeUiObject();
        return tapsearch;
    }

    public UiObject taphotels() {
        if (taphotels == null) taphotels = new UiSelector().xPath("//android.widget.ImageView[@bounds='[42,930][1068,1096]']").makeUiObject();
        return taphotels;
    }

    public UiObject tapsightseen() {
        if (tapsightseen == null) tapsightseen = new UiSelector().xPath("//android.widget.ImageView[@bounds='[42,1132][1068,1298]'").makeUiObject();
        return tapsightseen;
    }

    public UiObject tapweekendideas() {
        if (tapweekendideas == null) tapweekendideas = new UiSelector().xPath("//android.widget.ImageView[@bounds='[42,1334][1068,1500]'").makeUiObject();
        return tapweekendideas;
    }

    public UiObject tapmenu() {
        if (tapmenu == null) tapmenu = new UiSelector().resourceId("com.holidayiq:id/img_Slidingmenu").makeUiObject();
        return tapmenu;
    }

    public UiObject searchinput() {
        if (searchinput == null) searchinput = new UiSelector().text("Search").makeUiObject();
        return searchinput;
    }
    public UiObject selectoutput() {
        if (selectoutput == null) selectoutput = new UiSelector().xPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]").makeUiObject();
        return selectoutput;
    }
    public UiObject tapvideo() {
        if (tapvideo == null) tapvideo = new UiSelector().resourceId("com.holidayiq:id/fab").makeUiObject();
        return tapvideo;
    }


}
