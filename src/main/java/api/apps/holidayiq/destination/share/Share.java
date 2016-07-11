package api.apps.holidayiq.destination.share;

import api.android.Android;

import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by apple on 24/06/16.
 */
public class Share implements Activity {

    public ShareUiObject uiObject = new ShareUiObject();

    public Share tapshare() {
        try {
            MyLogger.log.info("Tapping Destination Share Icon");
            uiObject.tapshare().tap();
            Android.app.destination.share.uiObject.tapshare().waitToAppear(120);
            return Android.app.destination.share;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Destination Share Icon, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }

    public Share shareBy(String shareType){
        try{
            shareType = shareType.toLowerCase();
            MyLogger.log.info("Sharing by "+shareType);
            if(shareType.equals("whatapp")) uiObject.whatsapp().tap();
            else if(shareType.equals("facebook")) uiObject.facebook().tap();
            else if(shareType.equals("tweet")) uiObject.tweet().tap();
            else if(shareType.equals("hangouts")) uiObject.hangouts().tap();
            else if(shareType.equals("gmail")) uiObject.gmail().tap();
            else if(shareType.equals("googlepluse")) uiObject.googlepluse().tap();
            else throw new RuntimeException("Sharing by type: "+shareType+" is not supported");
            return Android.app.destination.share;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant share by "+shareType+", element absent or blocked");
        }
    }

    @Override
    public Share waitToLoad() {
        try {
            MyLogger.log.info("Waiting for Destination Share Icon");
            uiObject.tapshare().waitToAppear(10);
            return Android.app.destination.share.tapshare();
        } catch (AssertionError e) {
            throw new AssertionError("Share Icon activity failed to load/open");
        }
    }
}

