package api.apps.holidayiq.destination.about;

import api.android.Android;
import api.interfaces.Activity;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by apple on 24/06/16.
 */
public class About implements Activity{

    public AboutUiObject uiObject = new AboutUiObject();




    public About tapabout(){
        try{
            MyLogger.log.info("Tapping Destination About Section");
            uiObject.tapabout().tap();
            Android.app.destination.about.uiObject.tapabout().waitToAppear(120);
            return Android.app.destination.about;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Destination About Section, element absent or blocked");
        }catch (AssertionError e){
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }

    @Override
    public About waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Destination About Section");
            uiObject.tapabout().waitToAppear(10);
            return Android.app.destination.about.tapabout();
        }catch (AssertionError e){
            throw new AssertionError("About Section activity failed to load/open");
        }
    }
}
