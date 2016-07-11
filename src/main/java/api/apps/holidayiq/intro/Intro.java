package api.apps.holidayiq.intro;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by apple on 28/06/16.
 */
public class Intro implements Activity{

    public IntroUiObject uiObject = new IntroUiObject();

    public Intro guest() {
        try {
            MyLogger.log.info("Tapping Continue as Guest");

            uiObject.guest().tap();
            Android.app.holidayiq.intro.uiObject.guest().waitToAppear(120);
            return Android.app.holidayiq.intro;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Continue as Guest, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }

    public Intro facebooklogin() {
        try {
            MyLogger.log.info("Tapping Login with Facebook button");
            uiObject.facebooklogin().waitToAppear(120);
            uiObject.facebooklogin().tap();
            Android.app.holidayiq.intro.uiObject.facebooklogin().waitToAppear(120);
            return Android.app.holidayiq.intro;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Login with Facebook button, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }

    @Override
    public Intro waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Home activity");
            uiObject.guest().waitToAppear(120);
            return Android.app.holidayiq.intro;
        }catch (AssertionError e){
            throw new AssertionError("Home activity failed to load/open");
        }


    }
}
