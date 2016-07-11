package tests;

import api.android.Android;
import api.apps.holidayiq.destination.Destination;
import core.MyLogger;
import core.managers.TestManager;
import org.junit.Test;

/**
 * Created by apple on 04/07/16.
 */
public class DestFuntionality extends TestManager {

    private static Destination destination = Android.app.destination;

    @Test
    public void test8()  {
        testInfo.id("test8").suite("Funtionality").name("Getting Destination page object value");

        MyLogger.log.info("Rating: "+destination.overview.getRating());
        MyLogger.log.info("Destination: "+destination.overview.getDestinationname());
        MyLogger.log.info("State: "+destination.overview.getStatename());
        MyLogger.log.info("Rating & Reviews: "+destination.overview.getRatingandReviews());


    }




}
