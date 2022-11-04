package d6;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.q;
import f6.u;
import f6.v;
import f6.w;
import f6.x;
import f6.y;
import g6.s;
import g6.t;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
import y5.h;
import y5.o;
import y5.r;
/* loaded from: classes.dex */
public final class b extends h<v> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.b<o, v> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public o a(v vVar) {
            u P = vVar.T().P();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.S().b0(), "HMAC");
            int Q = vVar.T().Q();
            int i10 = c.f8369a[P.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return new t(new s("HMACSHA256", secretKeySpec), Q);
                }
                if (i10 != 3) {
                    throw new GeneralSecurityException("unknown hash");
                }
                return new t(new s("HMACSHA512", secretKeySpec), Q);
            }
            return new t(new s("HMACSHA1", secretKeySpec), Q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d6.b$b */
    /* loaded from: classes.dex */
    public class C0123b extends h.a<w, v> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0123b(Class cls) {
            super(cls);
            b.this = r1;
        }

        /* renamed from: e */
        public v a(w wVar) {
            return v.V().D(b.this.k()).C(wVar.Q()).B(i.i(g6.u.c(wVar.P()))).b();
        }

        /* renamed from: f */
        public w c(i iVar) {
            return w.R(iVar, q.b());
        }

        /* renamed from: g */
        public void d(w wVar) {
            if (wVar.P() >= 16) {
                b.o(wVar.Q());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f8369a;

        static {
            int[] iArr = new int[u.values().length];
            f8369a = iArr;
            try {
                iArr[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8369a[u.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8369a[u.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b() {
        super(v.class, new a(o.class));
    }

    public static void m(boolean z10) {
        r.q(new b(), z10);
    }

    public static void o(x xVar) {
        if (xVar.Q() >= 10) {
            int i10 = c.f8369a[xVar.P().ordinal()];
            if (i10 == 1) {
                if (xVar.Q() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (i10 == 2) {
                if (xVar.Q() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (i10 != 3) {
                throw new GeneralSecurityException("unknown hash type");
            } else {
                if (xVar.Q() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // y5.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // y5.h
    public h.a<?, v> e() {
        return new C0123b(w.class);
    }

    @Override // y5.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public v g(i iVar) {
        return v.W(iVar, q.b());
    }

    /* renamed from: n */
    public void i(v vVar) {
        g6.w.c(vVar.U(), k());
        if (vVar.S().size() >= 16) {
            o(vVar.T());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
