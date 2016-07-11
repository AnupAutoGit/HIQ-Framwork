package api.apps.holidayiq.destination.photos;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 24/06/16.
 */
public class PhotosUiObject {

    private static UiObject
    tapphoto;


    public UiObject tapphoto() {
        if (tapphoto == null) tapphoto = new UiSelector().text("PHOTOS").makeUiObject();
        return tapphoto;
    }

}
