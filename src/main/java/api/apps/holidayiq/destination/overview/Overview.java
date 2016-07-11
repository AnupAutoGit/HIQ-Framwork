package api.apps.holidayiq.destination.overview;

import api.android.Android;

import api.apps.holidayiq.destination.about.About;
import api.apps.holidayiq.destination.photos.Photos;
import api.apps.holidayiq.destination.share.Share;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by apple on 04/07/16.
 */
public class Overview {

    public OverviewUiObject uiObject = new OverviewUiObject();

    public String getDestinationname(){
        try{
            MyLogger.log.info("Getting Destination Name");
            return uiObject.destinationname().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get destination name, element absent or blocked");
        }
    }

    public String getStatename(){
        try{
            MyLogger.log.info("Getting State Name");
            return uiObject.statename().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get State name, element absent or blocked");
        }
    }

    public String getRating(){
        try{
            MyLogger.log.info("Getting Rating");
            return uiObject.rating().getText();
        }catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Rating, element absent or blocked");
        }
    }

    public String getRatingandReviews(){
        try{
            MyLogger.log.info("Getting Rating & Reviews");
            return uiObject.ratingandreviews().getText();
        }catch (NoSuchElementException e) {
            throw new AssertionError("Cant get Rating & Reviews, element absent or blocked");
        }
    }

    public About about(){
        try{
            MyLogger.log.info("Tapping on the Speedtest Menu Button");
            uiObject.about().tap();
            return Android.app.destination.about.waitToLoad();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Speedtest Button, element absent or blocked");
        }
    }

    public Photos tapResults(){
        try{
            MyLogger.log.info("Tapping on the Results Menu Button");
            uiObject.photos().tap();
            return Android.app.destination.photos.waitToLoad();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Results Button, element absent or blocked");
        }
    }



    //Todo return about
    public Share tapAbout(){
        try{
            MyLogger.log.info("Tapping on the About Menu Button");
            uiObject.share().tap();
            return Android.app.destination.share.waitToLoad();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap About Button, element absent or blocked");
        }
    }
}
