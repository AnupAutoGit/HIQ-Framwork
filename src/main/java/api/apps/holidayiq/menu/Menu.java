package api.apps.holidayiq.menu;

import api.android.Android;
import api.apps.holidayiq.menu.profile.Profile;
import api.apps.holidayiq.menu.signin.SignIn;
import api.interfaces.Application;
import api.apps.holidayiq.menu.home.Home;
import api.apps.holidayiq.menu.login.Login;
/**
 * Created by apple on 08/07/16.
 */
public class Menu implements Application {


    public Home home = new Home();
    public Login login = new Login();
    public SignIn signIn = new SignIn();
    public Profile profile = new Profile();




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

