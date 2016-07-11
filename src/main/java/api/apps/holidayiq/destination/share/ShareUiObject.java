package api.apps.holidayiq.destination.share;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 24/06/16.
 */
public class ShareUiObject {

    private static UiObject
            tapshare,
            whatsapp,
            facebook,
            tweet,
            hangouts,
            gmail,
            googlepluse;

    public UiObject tapshare() {
        if (tapshare == null) tapshare = new UiSelector().resourceId("com.holidayiq:id/share").makeUiObject();
        return tapshare;
    }

    public UiObject whatsapp() {
        if (whatsapp == null) whatsapp = new UiSelector().text("WhatsApp").makeUiObject();
        return whatsapp;
    }

    public UiObject facebook() {
        if (facebook == null) facebook = new UiSelector().text("Facebook").makeUiObject();
        return facebook;
    }

    public UiObject tweet() {
        if (tweet == null) tweet = new UiSelector().text("Tweet").makeUiObject();
        return tweet;
    }

    public UiObject hangouts() {
        if (hangouts == null) hangouts = new UiSelector().text("Hangouts").makeUiObject();
        return hangouts;
    }

    public UiObject gmail() {
        if (gmail == null) gmail = new UiSelector().text("Gmail").makeUiObject();
        return gmail;
    }

    public UiObject googlepluse() {
        if (googlepluse == null) googlepluse = new UiSelector().text("Google+").makeUiObject();
        return googlepluse;
    }
}
