package api.apps.holidayiq.destination;

import api.android.Android;
import api.apps.holidayiq.destination.about.About;
import api.apps.holidayiq.destination.overview.Overview;
import api.apps.holidayiq.destination.shortlist.Shortlist;
import api.apps.holidayiq.destination.photos.Photos;
import api.apps.holidayiq.destination.reviews.Reviews;
import api.apps.holidayiq.destination.share.Share;
import api.apps.holidayiq.destination.waricon.Waricon;
import api.interfaces.Application;
/**
 * Created by apple on 24/06/16.
 */
public class Destination implements Application {


    public About about = new About();
    public Photos photos = new Photos();
    public Reviews reviews = new Reviews();
    public Waricon waricon = new Waricon();
    public Share share = new Share();
    public Shortlist shortlist = new Shortlist();
    public Overview overview = new Overview();




    @Override
    public void forceStop() {
        Android.adb.forceStopApp(packageID());
    }

    @Override
    public void clearData() {
        Android.adb.clearAppsData(packageID());
    }

    @Override
    public Object open() {
        Android.adb.openAppsActivity(packageID(), activityID());
        return null;
    }

    @Override
    public String packageID() { return "com.holidayiq";}

    @Override
    public String activityID() { return "com.holidayiq.BookingWebActivity"; }
}
