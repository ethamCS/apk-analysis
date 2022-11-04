package b.c.a;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import b.c.a.j;
import b.c.a.s;
import b.c.a.x;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class r extends x {

    /* renamed from: a */
    private final j f1315a;

    /* renamed from: b */
    private final z f1316b;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public r(j jVar, z zVar) {
        this.f1315a = jVar;
        this.f1316b = zVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b.c.a.x
    public int a() {
        return 2;
    }

    @Override // b.c.a.x
    public x.a a(v vVar, int i) {
        j.a a2 = this.f1315a.a(vVar.d, vVar.f1337c);
        if (a2 == null) {
            return null;
        }
        s.e eVar = a2.f1300c ? s.e.DISK : s.e.NETWORK;
        Bitmap a3 = a2.a();
        if (a3 != null) {
            return new x.a(a3, eVar);
        }
        InputStream c2 = a2.c();
        if (c2 == null) {
            return null;
        }
        if (eVar == s.e.DISK && a2.b() == 0) {
            d0.a(c2);
            throw new a("Received response with 0 content-length header.");
        }
        if (eVar == s.e.NETWORK && a2.b() > 0) {
            this.f1316b.a(a2.b());
        }
        return new x.a(c2, eVar);
    }

    @Override // b.c.a.x
    public boolean a(v vVar) {
        String scheme = vVar.d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b.c.a.x
    public boolean a(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b.c.a.x
    public boolean b() {
        return true;
    }
}
