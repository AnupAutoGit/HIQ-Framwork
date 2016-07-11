package api.apps.holidayiq;

import api.android.Android;
import api.apps.holidayiq.home.Home;
import api.apps.holidayiq.intro.Intro;
import api.apps.holidayiq.popup.Popup;
import api.apps.holidayiq.search.Search;
import api.apps.holidayiq.splashscreen.Splashscreen;
import api.interfaces.Application;



/**
 * Created by apple on 24/06/16.
 */
public class Holidayiq implements Application {


    public Home home = new Home();
    public Intro intro = new Intro();
    public Popup popup = new Popup();
    public Splashscreen splashsceen = new Splashscreen();
    public Search search = new Search();

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
    public String packageID() {
        return "com.holidayiq";
    }

    @Override
    public String activityID() { return "com.holidayiq.CustomGalleryActivity"; }
}
