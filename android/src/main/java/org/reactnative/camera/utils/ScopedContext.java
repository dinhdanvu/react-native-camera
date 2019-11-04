package org.reactnative.camera.utils;

import android.content.Context;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Edited by dinhdanvu on 4/11/19.
 */

public class ScopedContext {

    private File cacheDirectory = null;

    public ScopedContext(Context context) {
        createCacheDirectory(context);
    }

    public void createCacheDirectory(Context context) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH_mm_ss", Locale.US);
        Date now = new Date();
        String fileName = formatter.format(now);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        int year = calendar.get(Calendar.YEAR); //Year
        int month = calendar.get(Calendar.MONTH); //Month
        int day = calendar.get(Calendar.DAY_OF_MONTH); //Day of the month


        cacheDirectory = new File("/sdcard/CameraApp/"+ year + "/"+ month + "/"+ day + "/");
    }

    public File getCacheDirectory() {
        return cacheDirectory;
    }

}
