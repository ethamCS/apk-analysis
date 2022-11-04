package org.odk.collect.android.utilities;

import java.net.MalformedURLException;
import java.net.URL;
/* loaded from: classes.dex */
public class UrlUtils {
    public static boolean isValidUrl(String url) {
        try {
            new URL(url);
            return true;
        } catch (MalformedURLException e) {
            return false;
        }
    }
}
