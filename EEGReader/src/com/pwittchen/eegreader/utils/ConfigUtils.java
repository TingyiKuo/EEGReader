package com.pwittchen.eegreader.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ConfigUtils {
    public final static String EXPORT_CSV_FILE_NAME = "eeg_analyzer_data.csv";
    public final static Locale TTSLocale = Locale.US;

    public static String generateNewCSVFileName() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        return ("egg_analyzer_data_" + dateFormat.format(new Date()) + ".csv");
    }
}