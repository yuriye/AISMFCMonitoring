package com.yelisoft.mfc.util;

import com.yelisoft.mfc.util.exception.NotFoundException;

/**
 * Created by eliseev on 05.06.2017.
 */


public class ValidationUtil {

    public static void checkNotFoundWithId(boolean found, long id) {
        checkNotFound(found, "id=" + id);
    }

    public static <T> T checkNotFoundWithId(T object, long id) {
        return checkNotFound(object, "id=" + id);
    }

    public static <T> T checkNotFound(T object, String msg) {
        checkNotFound(object != null, msg);
        return object;
    }

    public static void checkNotFound(boolean found, String msg) {
        if (!found) {
            throw new NotFoundException("Not found entity with " + msg);
        }
    }
}
