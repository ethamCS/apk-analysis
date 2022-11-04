package z9;

import android.content.Context;
import bf.x;
import hc.t;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", BuildConfig.FLAVOR, "path", "a", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {
    public static final String a(Context context, String str) {
        String E;
        t.e(context, "<this>");
        t.e(str, "path");
        InputStream open = context.getAssets().open(str);
        t.d(open, "assets.open(path)");
        InputStreamReader inputStreamReader = new InputStreamReader(open, bf.d.f5986b);
        th = null;
        try {
            E = x.E(dc.c.c(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192)), "\r\n", "\n", false, 4, null);
            return E;
        } finally {
        }
    }
}
