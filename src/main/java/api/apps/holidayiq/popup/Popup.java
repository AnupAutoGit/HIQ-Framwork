package api.apps.holidayiq.popup;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by apple on 29/06/16.
 */
public class Popup implements Activity {

    public PopupUiObject uiObject = new PopupUiObject();



    public Popup plannow() {
        try {
            MyLogger.log.info("Tapping Login with Facebook button");
            uiObject.plannow().waitToAppear(120);
            uiObject.plannow().tap();
            Android.app.holidayiq.popup.uiObject.plannow().waitToAppear(120);
            return Android.app.holidayiq.popup;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Login with Facebook button, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }

    @Override
    public Popup waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Home activity");
            uiObject.close().waitToAppear(10000);
            return Android.app.holidayiq.popup;
        }catch (AssertionError e){
            throw new AssertionError("Home activity failed to load/open");
        }


}}
