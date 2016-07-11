package api.apps.holidayiq.destination.waricon;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by apple on 24/06/16.
 */
public class Waricon implements Activity {

    public WariconUiObject uiObject = new WariconUiObject();

    public Waricon tapwaricon() {
        try {
            MyLogger.log.info("Tapping Destination WAR Icon");
            uiObject.tapwaricon().tap();
            Android.app.destination.waricon.uiObject.tapwaricon().waitToAppear(120);
            return Android.app.destination.waricon;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Destination WAR Icon, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }

    @Override
    public Waricon waitToLoad() {
        try {
            MyLogger.log.info("Waiting for Destination WAR Icon");
            uiObject.tapwaricon().waitToAppear(10);
            return Android.app.destination.waricon.tapwaricon();
        } catch (AssertionError e) {
            throw new AssertionError("WAR Icon activity failed to load/open");
        }
    }
}
