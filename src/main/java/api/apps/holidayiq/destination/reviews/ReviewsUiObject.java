package api.apps.holidayiq.destination.reviews;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 24/06/16.
 */
public class ReviewsUiObject {

    private static UiObject
            tapreviews;

    public UiObject tapreviews() {
        if (tapreviews == null) tapreviews = new UiSelector().text("REVIEWS").makeUiObject();
        return tapreviews;
    }
}
