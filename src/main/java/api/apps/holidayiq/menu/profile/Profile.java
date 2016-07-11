package api.apps.holidayiq.menu.profile;

import api.android.Android;
import api.apps.holidayiq.home.Home;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by apple on 08/07/16.
 */
public class Profile {
    public ProfileUiObject uiObject = new ProfileUiObject();

    public Home tapback() {
        try {
            MyLogger.log.info("Tapping Login link");
            uiObject.tapclose().tap();
            uiObject.tapclose().tap().waitToAppear(120);
            return Android.app.holidayiq.home;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Login link element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }

}
