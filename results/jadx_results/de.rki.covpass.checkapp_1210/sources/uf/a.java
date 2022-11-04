package uf;

import bf.x;
import hc.t;
import java.util.List;
import kotlin.Metadata;
import of.a0;
import of.b0;
import of.c0;
import of.m;
import of.n;
import of.v;
import of.w;
import of.z;
import org.conscrypt.BuildConfig;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Luf/a;", "Lof/v;", BuildConfig.FLAVOR, "Lof/m;", "cookies", BuildConfig.FLAVOR, "b", "Lof/v$a;", "chain", "Lof/b0;", "a", "Lof/n;", "cookieJar", "<init>", "(Lof/n;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a implements v {

    /* renamed from: a */
    private final n f23603a;

    public a(n nVar) {
        t.e(nVar, "cookieJar");
        this.f23603a = nVar;
    }

    private final String b(List<m> list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                u.r();
            }
            m mVar = (m) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(mVar.i());
            sb2.append('=');
            sb2.append(mVar.n());
            i10 = i11;
        }
        String sb3 = sb2.toString();
        t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // of.v
    public b0 a(v.a aVar) {
        boolean v10;
        c0 b10;
        t.e(aVar, "chain");
        z b11 = aVar.b();
        z.a i10 = b11.i();
        a0 a10 = b11.a();
        if (a10 != null) {
            w b12 = a10.b();
            if (b12 != null) {
                i10.d("Content-Type", b12.toString());
            }
            long a11 = a10.a();
            if (a11 != -1) {
                i10.d("Content-Length", String.valueOf(a11));
                i10.g("Transfer-Encoding");
            } else {
                i10.d("Transfer-Encoding", "chunked");
                i10.g("Content-Length");
            }
        }
        boolean z10 = false;
        if (b11.d("Host") == null) {
            i10.d("Host", pf.d.T(b11.j(), false, 1, null));
        }
        if (b11.d("Connection") == null) {
            i10.d("Connection", "Keep-Alive");
        }
        if (b11.d("Accept-Encoding") == null && b11.d("Range") == null) {
            i10.d("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<m> a12 = this.f23603a.a(b11.j());
        if (!a12.isEmpty()) {
            i10.d("Cookie", b(a12));
        }
        if (b11.d("User-Agent") == null) {
            i10.d("User-Agent", "okhttp/4.10.0");
        }
        b0 a13 = aVar.a(i10.b());
        e.f(this.f23603a, b11.j(), a13.s());
        b0.a s10 = a13.B().s(b11);
        if (z10) {
            v10 = x.v("gzip", b0.r(a13, "Content-Encoding", null, 2, null), true);
            if (v10 && e.b(a13) && (b10 = a13.b()) != null) {
                eg.k kVar = new eg.k(b10.f());
                s10.l(a13.s().e().g("Content-Encoding").g("Content-Length").d());
                s10.b(new h(b0.r(a13, "Content-Type", null, 2, null), -1L, eg.n.d(kVar)));
            }
        }
        return s10.c();
    }
}
