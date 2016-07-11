package api.apps.holidayiq.home;

import api.android.Android;
import api.apps.holidayiq.destination.overview.Overview;
import api.apps.holidayiq.menu.login.Login;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by anup on 27/06/16.
 */
public class Home  {

    public HomeUiObject uiObject = new HomeUiObject();

    public Home tapsearch() {
        try {
            MyLogger.log.info("Tapping Search Box");

            uiObject.tapsearch().tap();

            return Android.app.holidayiq.home;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Search Box, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }

    }

    public Home searchinput() {
        try {
            MyLogger.log.info("Enter value Search Box");

            uiObject.searchinput().typeText("Bangalore");

            return Android.app.holidayiq.home;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Search Box, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }

    }
    public Overview Search() {
        try {
            MyLogger.log.info("Tap Search otput ");
            uiObject.selectoutput().waitToAppear(120);
            uiObject.selectoutput().tap().waitToAppear(120);
            return Android.app.destination.overview;

        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Search Box, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }

    }

    public Login tapmenu() {
        try {
            MyLogger.log.info("Tap Menu Icon ");
            uiObject.tapmenu().tap();
            return Android.app.menu.login;

        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Menu Icon, element absent or blocked");

        }
    }




    public Home taphotels() {
        try {
            MyLogger.log.info("Tapping Hotel Section");
            uiObject.taphotels().tap();
            Android.app.holidayiq.home.uiObject.taphotels().waitToAppear(120);
            return Android.app.holidayiq.home;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Hotel Section, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }

    public Home tapsightseen() {
        try {
            MyLogger.log.info("Tapping Sightseen Section");
            uiObject.tapsightseen().tap();
            Android.app.holidayiq.home.uiObject.tapsightseen().waitToAppear(120);
            return Android.app.holidayiq.home;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Sightseen Section, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }

    public Home tapweekendideas() {
        try {
            MyLogger.log.info("Tapping Weekend Ideas Section");
            uiObject.tapweekendideas().tap();
            Android.app.holidayiq.home.uiObject.tapweekendideas().waitToAppear(120);
            return Android.app.holidayiq.home;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Weekend Ideas Section, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }

    public Home tapvideo() {
        try {
            MyLogger.log.info("Tapping Video Section");
            uiObject.tapvideo().tap();
            Android.app.holidayiq.home.uiObject.tapvideo().waitToAppear(120);
            return Android.app.holidayiq.home;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap Video Section, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }
    }



}
