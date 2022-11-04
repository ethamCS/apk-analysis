package n4;

import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes.dex */
public class b implements f {
    @Override // n4.f
    public d a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}
