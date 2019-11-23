package org.reactnative.camera.utils;

import android.content.Context;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Edited by dinhdanvu on 23/11/19.
 */

public class ScopedContext {

    private File cacheDirectory = null;

    public ScopedContext(Context context) {
        createCacheDirectory(context);
    }

    public void createCacheDirectory(Context context) {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        int year = calendar.get(Calendar.YEAR); //Year
        int month = calendar.get(Calendar.MONTH) + 1; //Month
        int day = calendar.get(Calendar.DAY_OF_MONTH); //Day of the month
        cacheDirectory = new File("/sdcard/CameraApp/"+ year + "/"+ month + "/"+ day + "/");
    }

    public File getCacheDirectory() {
        return cacheDirectory;
    }

}
