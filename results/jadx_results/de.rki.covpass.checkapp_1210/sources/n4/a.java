package n4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: c */
    private final HttpURLConnection f16865c;

    public a(HttpURLConnection httpURLConnection) {
        this.f16865c = httpURLConnection;
    }

    private String b(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    @Override // n4.d
    public String P0() {
        return this.f16865c.getContentType();
    }

    @Override // n4.d
    public String W0() {
        try {
            if (m0()) {
                return null;
            }
            return "Unable to fetch " + this.f16865c.getURL() + ". Failed with " + this.f16865c.getResponseCode() + "\n" + b(this.f16865c);
        } catch (IOException e10) {
            q4.d.d("get error failed ", e10);
            return e10.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16865c.disconnect();
    }

    @Override // n4.d
    public boolean m0() {
        try {
            return this.f16865c.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // n4.d
    public InputStream v() {
        return this.f16865c.getInputStream();
    }
}
