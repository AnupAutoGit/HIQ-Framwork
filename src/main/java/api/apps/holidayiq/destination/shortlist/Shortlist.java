package api.apps.holidayiq.destination.shortlist;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by apple on 24/06/16.
 */
public class Shortlist implements Activity {

    public ShortlistUiObject uiObject = new ShortlistUiObject();

    public Shortlist tapshortlist() {
        try {
            MyLogger.log.info("Tapping Destination Shortlist Icon");
            uiObject.tapshortlist().tap();
            Android.app.destination.shortlist.uiObject.tapshortlist().waitToAppear(120);
            return Android.app.destination.shortlist;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Destination Shortlist Icon, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }

    @Override
    public Shortlist waitToLoad() {
        try {
            MyLogger.log.info("Waiting for Destination Shortlist Icon");
            uiObject.tapshortlist().waitToAppear(10);
            return Android.app.destination.shortlist.tapshortlist();
        } catch (AssertionError e) {
            throw new AssertionError("Shortlist Icon activity failed to load/open");
        }
    }
}
