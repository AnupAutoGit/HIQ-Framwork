package api.apps.holidayiq.search;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by apple on 04/07/16.
 */
public class Search implements Activity {

    public SearchUiObject uiObject = new SearchUiObject();

    public String getsearchoutput(){
        try{
            MyLogger.log.info("Getting Search Output");
            return uiObject.searchoutput().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Ping Speed, element absent or blocked");
        }
    }

    public Search tapSearchoutput(){
        try{
            MyLogger.log.info("Tapping Search output result ");
            uiObject.tapseachoutput().tap().waitToAppear(120);
            return Android.app.holidayiq.search;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Test Again button, element absent or blocked");
        }
    }

    @Override
    public Search waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Home activity");
            uiObject.tapseachoutput().waitToAppear(120);
            return Android.app.holidayiq.search;
        }catch (AssertionError e){
            throw new AssertionError("Home activity failed to load/open");
        }
    }
}
