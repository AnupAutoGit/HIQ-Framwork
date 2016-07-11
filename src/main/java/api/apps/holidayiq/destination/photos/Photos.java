package api.apps.holidayiq.destination.photos;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by apple on 24/06/16.
 */
public class Photos implements Activity {

    public PhotosUiObject uiObject = new PhotosUiObject();

    public Photos tapphotos() {
        try {
            MyLogger.log.info("Tapping Destination Photo Section");
            uiObject.tapphoto().tap();
            Android.app.destination.photos.uiObject.tapphoto().waitToAppear(120);
            return Android.app.destination.photos;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Destination Photo Section, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }

    @Override
    public Photos waitToLoad() {
        try {
            MyLogger.log.info("Waiting for Destination Photo Section");
            uiObject.tapphoto().waitToAppear(10);
            return Android.app.destination.photos.tapphotos();
        } catch (AssertionError e) {
            throw new AssertionError("Photo Section activity failed to load/open");
        }
    }
}