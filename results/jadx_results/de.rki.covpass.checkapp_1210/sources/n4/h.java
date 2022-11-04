package n4;

import android.util.Pair;
import e4.p;
import e4.v;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    private final g f16871a;

    /* renamed from: b */
    private final f f16872b;

    public h(g gVar, f fVar) {
        this.f16871a = gVar;
        this.f16872b = fVar;
    }

    private e4.h a(String str, String str2) {
        Pair<c, InputStream> a10;
        if (str2 == null || (a10 = this.f16871a.a(str)) == null) {
            return null;
        }
        c cVar = (c) a10.first;
        InputStream inputStream = (InputStream) a10.second;
        v<e4.h> y10 = cVar == c.ZIP ? p.y(new ZipInputStream(inputStream), str) : p.o(inputStream, str);
        if (y10.b() == null) {
            return null;
        }
        return y10.b();
    }

    private v<e4.h> b(String str, String str2) {
        q4.d.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d a10 = this.f16872b.a(str);
                if (!a10.m0()) {
                    v<e4.h> vVar = new v<>(new IllegalArgumentException(a10.W0()));
                    try {
                        a10.close();
                    } catch (IOException e10) {
                        q4.d.d("LottieFetchResult close failed ", e10);
                    }
                    return vVar;
                }
                v<e4.h> d10 = d(str, a10.v(), a10.P0(), str2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Completed fetch from network. Success: ");
                sb2.append(d10.b() != null);
                q4.d.a(sb2.toString());
                try {
                    a10.close();
                } catch (IOException e11) {
                    q4.d.d("LottieFetchResult close failed ", e11);
                }
                return d10;
            } catch (Exception e12) {
                v<e4.h> vVar2 = new v<>(e12);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e13) {
                        q4.d.d("LottieFetchResult close failed ", e13);
                    }
                }
                return vVar2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e14) {
                    q4.d.d("LottieFetchResult close failed ", e14);
                }
            }
            throw th2;
        }
    }

    private v<e4.h> d(String str, InputStream inputStream, String str2, String str3) {
        c cVar;
        v<e4.h> vVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            q4.d.a("Handling zip response.");
            cVar = c.ZIP;
            vVar = f(str, inputStream, str3);
        } else {
            q4.d.a("Received json response.");
            cVar = c.JSON;
            vVar = e(str, inputStream, str3);
        }
        if (str3 != null && vVar.b() != null) {
            this.f16871a.e(str, cVar);
        }
        return vVar;
    }

    private v<e4.h> e(String str, InputStream inputStream, String str2) {
        return str2 == null ? p.o(inputStream, null) : p.o(new FileInputStream(this.f16871a.f(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    private v<e4.h> f(String str, InputStream inputStream, String str2) {
        return str2 == null ? p.y(new ZipInputStream(inputStream), null) : p.y(new ZipInputStream(new FileInputStream(this.f16871a.f(str, inputStream, c.ZIP))), str);
    }

    public v<e4.h> c(String str, String str2) {
        e4.h a10 = a(str, str2);
        if (a10 != null) {
            return new v<>(a10);
        }
        q4.d.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(str, str2);
    }
}
