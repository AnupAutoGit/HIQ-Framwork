package api.apps.holidayiq.destination.overview;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 04/07/16.
 */
public class OverviewUiObject {
    private static UiObject
            about,
            photos,
            reviews,
            destinationname,
            statename,
            rating,
            ratingandreviews,
            share;

    public UiObject about(){
        if(about == null) about = new UiSelector().text("ABOUT").makeUiObject();
        return about;
    }

    public UiObject photos(){
        if(photos == null) photos = new UiSelector().text("RESULTS").makeUiObject();
        return photos;
    }

    public UiObject reviews(){
        if(reviews == null) reviews = new UiSelector().text("SETTINGS").makeUiObject();
        return reviews;
    }

    public UiObject share(){
        if(share == null) share = new UiSelector().text("ABOUT").makeUiObject();
        return share;
    }
    public UiObject destinationname() {
        if (destinationname == null) destinationname = new UiSelector().resourceId("com.holidayiq:id/dest_name").makeUiObject();
        return destinationname;
    }

    public UiObject rating() {
        if (rating == null) rating = new UiSelector().resourceId("com.holidayiq:id/ratingbar_text").makeUiObject();
        return rating;
    }

    public UiObject statename() {
        if (statename == null) statename = new UiSelector().resourceId("com.holidayiq:id/state_name_text").makeUiObject();
        return statename;
    }

    public UiObject ratingandreviews() {
        if (ratingandreviews == null) ratingandreviews = new UiSelector().resourceId("com.holidayiq:id/rating_text").makeUiObject();
        return ratingandreviews;
    }


}
