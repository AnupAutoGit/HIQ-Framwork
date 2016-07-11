package api.apps.holidayiq.splashscreen;

import api.android.Android;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by apple on 30/06/16.
 */
public class Splashscreen {

    public SplashscreenUiObject uiObject = new SplashscreenUiObject();

    public Splashscreen tapclose(){

        try{
            MyLogger.log.info("Tapping on the Popup close Button");
            uiObject.tapclose().waitToAppear(12000);
            uiObject.tapclose().tap();
            return Android.app.holidayiq.splashsceen;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Popup close Button, element absent or blocked");
        }
    }

    public Splashscreen tapguest(){

        try{
            MyLogger.log.info("Tapping on the Guest Button");

            uiObject.tapguest().tap();
            return Android.app.holidayiq.splashsceen;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Popup close Button, element absent or blocked");
        }
    }


}
