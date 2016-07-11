package api.apps.holidayiq.destination.reviews;

import api.android.Android;
import api.interfaces.Activity;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by apple on 24/06/16.
 */
public class Reviews implements Activity {

    public ReviewsUiObject uiObject = new ReviewsUiObject();

    public Reviews tapreviews() {
        try {
            MyLogger.log.info("Tapping Destination Reviews Section");
            uiObject.tapreviews().tap();
            Android.app.destination.reviews.uiObject.tapreviews().waitToAppear(120);
            return Android.app.destination.reviews;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Destination Reviews Section, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }

    @Override
    public Reviews waitToLoad() {
        try {
            MyLogger.log.info("Waiting for Destination Reviews Section");
            uiObject.tapreviews().waitToAppear(10);
            return Android.app.destination.reviews.tapreviews();
        } catch (AssertionError e) {
            throw new AssertionError("Reviews Section activity failed to load/open");
        }
    }
}
