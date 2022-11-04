package le;

import hc.t;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
/* loaded from: classes3.dex */
public final class d {
    public final InputStream a(String str) {
        t.e(str, "path");
        ClassLoader classLoader = d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}
