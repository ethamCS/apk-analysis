package io.flutter.plugins.b;

import android.os.Build;
import android.os.Environment;
/* loaded from: classes.dex */
class i {
    public static String a(Integer num) {
        if (num == null) {
            return null;
        }
        switch (num.intValue()) {
            case 0:
                return Environment.DIRECTORY_MUSIC;
            case 1:
                return Environment.DIRECTORY_PODCASTS;
            case 2:
                return Environment.DIRECTORY_RINGTONES;
            case 3:
                return Environment.DIRECTORY_ALARMS;
            case 4:
                return Environment.DIRECTORY_NOTIFICATIONS;
            case 5:
                return Environment.DIRECTORY_PICTURES;
            case 6:
                return Environment.DIRECTORY_MOVIES;
            case 7:
                return Environment.DIRECTORY_DOWNLOADS;
            case 8:
                return Environment.DIRECTORY_DCIM;
            case 9:
                if (Build.VERSION.SDK_INT < 19) {
                    throw new IllegalArgumentException("Documents directory is unsupported.");
                }
                return Environment.DIRECTORY_DOCUMENTS;
            default:
                throw new IllegalArgumentException("Unknown index: " + num);
        }
    }
}
