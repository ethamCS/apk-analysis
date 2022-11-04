package uf;

import hc.t;
import java.util.List;
import kotlin.Metadata;
import of.b0;
import of.v;
import of.z;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0011\u001a\u00020\u0015\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(JM\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u0011\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b#\u0010!¨\u0006)"}, d2 = {"Luf/g;", "Lof/v$a;", BuildConfig.FLAVOR, "index", "Ltf/c;", "exchange", "Lof/z;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "d", "(ILtf/c;Lof/z;III)Luf/g;", "Lof/j;", "c", "l", "Lof/e;", "call", "b", "Lof/b0;", "a", "Ltf/e;", "Ltf/e;", "f", "()Ltf/e;", "Ltf/c;", "h", "()Ltf/c;", "Lof/z;", "j", "()Lof/z;", "I", "g", "()I", "i", "k", BuildConfig.FLAVOR, "Lof/v;", "interceptors", "<init>", "(Ltf/e;Ljava/util/List;ILtf/c;Lof/z;III)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class g implements v.a {

    /* renamed from: a */
    private final tf.e f23612a;

    /* renamed from: b */
    private final List<v> f23613b;

    /* renamed from: c */
    private final int f23614c;

    /* renamed from: d */
    private final tf.c f23615d;

    /* renamed from: e */
    private final z f23616e;

    /* renamed from: f */
    private final int f23617f;

    /* renamed from: g */
    private final int f23618g;

    /* renamed from: h */
    private final int f23619h;

    /* renamed from: i */
    private int f23620i;

    /* JADX WARN: Multi-variable type inference failed */
    public g(tf.e eVar, List<? extends v> list, int i10, tf.c cVar, z zVar, int i11, int i12, int i13) {
        t.e(eVar, "call");
        t.e(list, "interceptors");
        t.e(zVar, "request");
        this.f23612a = eVar;
        this.f23613b = list;
        this.f23614c = i10;
        this.f23615d = cVar;
        this.f23616e = zVar;
        this.f23617f = i11;
        this.f23618g = i12;
        this.f23619h = i13;
    }

    public static /* synthetic */ g e(g gVar, int i10, tf.c cVar, z zVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f23614c;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.f23615d;
        }
        tf.c cVar2 = cVar;
        if ((i14 & 4) != 0) {
            zVar = gVar.f23616e;
        }
        z zVar2 = zVar;
        if ((i14 & 8) != 0) {
            i11 = gVar.f23617f;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = gVar.f23618g;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = gVar.f23619h;
        }
        return gVar.d(i10, cVar2, zVar2, i15, i16, i13);
    }

    @Override // of.v.a
    public b0 a(z zVar) {
        t.e(zVar, "request");
        boolean z10 = false;
        if (this.f23614c < this.f23613b.size()) {
            this.f23620i++;
            tf.c cVar = this.f23615d;
            if (cVar != null) {
                if (!cVar.j().g(zVar.j())) {
                    throw new IllegalStateException(("network interceptor " + this.f23613b.get(this.f23614c - 1) + " must retain the same host and port").toString());
                }
                if (!(this.f23620i == 1)) {
                    throw new IllegalStateException(("network interceptor " + this.f23613b.get(this.f23614c - 1) + " must call proceed() exactly once").toString());
                }
            }
            g e10 = e(this, this.f23614c + 1, null, zVar, 0, 0, 0, 58, null);
            v vVar = this.f23613b.get(this.f23614c);
            b0 a10 = vVar.a(e10);
            if (a10 == null) {
                throw new NullPointerException("interceptor " + vVar + " returned null");
            }
            if (this.f23615d != null) {
                if (!(this.f23614c + 1 >= this.f23613b.size() || e10.f23620i == 1)) {
                    throw new IllegalStateException(("network interceptor " + vVar + " must call proceed() exactly once").toString());
                }
            }
            if (a10.b() != null) {
                z10 = true;
            }
            if (z10) {
                return a10;
            }
            throw new IllegalStateException(("interceptor " + vVar + " returned a response with no body").toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // of.v.a
    public z b() {
        return this.f23616e;
    }

    @Override // of.v.a
    public of.j c() {
        tf.c cVar = this.f23615d;
        if (cVar == null) {
            return null;
        }
        return cVar.h();
    }

    @Override // of.v.a
    public of.e call() {
        return this.f23612a;
    }

    public final g d(int i10, tf.c cVar, z zVar, int i11, int i12, int i13) {
        t.e(zVar, "request");
        return new g(this.f23612a, this.f23613b, i10, cVar, zVar, i11, i12, i13);
    }

    public final tf.e f() {
        return this.f23612a;
    }

    public final int g() {
        return this.f23617f;
    }

    public final tf.c h() {
        return this.f23615d;
    }

    public final int i() {
        return this.f23618g;
    }

    public final z j() {
        return this.f23616e;
    }

    public final int k() {
        return this.f23619h;
    }

    public int l() {
        return this.f23618g;
    }
}
