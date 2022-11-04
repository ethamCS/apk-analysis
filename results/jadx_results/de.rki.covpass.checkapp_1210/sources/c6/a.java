package c6;

import android.content.Context;
import android.util.Log;
import c6.c;
import com.google.crypto.tink.shaded.protobuf.c0;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.annotation.concurrent.GuardedBy;
import y5.g;
import y5.i;
import y5.j;
import y5.k;
import y5.l;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d */
    private static final String f6290d = "a";

    /* renamed from: a */
    private final l f6291a;

    /* renamed from: b */
    private final y5.a f6292b;
    @GuardedBy("this")

    /* renamed from: c */
    private j f6293c;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private k f6294a = null;

        /* renamed from: b */
        private l f6295b = null;

        /* renamed from: c */
        private String f6296c = null;

        /* renamed from: d */
        private y5.a f6297d = null;

        /* renamed from: e */
        private boolean f6298e = true;

        /* renamed from: f */
        private g f6299f = null;

        /* renamed from: g */
        private KeyStore f6300g = null;
        @GuardedBy("this")

        /* renamed from: h */
        private j f6301h;

        private j e() {
            y5.a aVar = this.f6297d;
            if (aVar != null) {
                try {
                    return j.j(i.j(this.f6294a, aVar));
                } catch (c0 | GeneralSecurityException e10) {
                    Log.w(a.f6290d, "cannot decrypt keyset: ", e10);
                }
            }
            return j.j(y5.b.a(this.f6294a));
        }

        private j f() {
            try {
                return e();
            } catch (FileNotFoundException e10) {
                Log.w(a.f6290d, "keyset not found, will generate a new one", e10);
                if (this.f6299f == null) {
                    throw new GeneralSecurityException("cannot read or generate keyset");
                }
                j a10 = j.i().a(this.f6299f);
                j h10 = a10.h(a10.c().g().S(0).S());
                if (this.f6297d != null) {
                    h10.c().k(this.f6295b, this.f6297d);
                } else {
                    y5.b.b(h10.c(), this.f6295b);
                }
                return h10;
            }
        }

        private y5.a g() {
            if (!a.d()) {
                Log.w(a.f6290d, "Android Keystore requires at least Android M");
                return null;
            }
            c a10 = this.f6300g != null ? new c.b().b(this.f6300g).a() : new c();
            boolean e10 = a10.e(this.f6296c);
            if (!e10) {
                try {
                    c.d(this.f6296c);
                } catch (GeneralSecurityException | ProviderException e11) {
                    Log.w(a.f6290d, "cannot use Android Keystore, it'll be disabled", e11);
                    return null;
                }
            }
            try {
                return a10.b(this.f6296c);
            } catch (GeneralSecurityException | ProviderException e12) {
                if (e10) {
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f6296c), e12);
                }
                Log.w(a.f6290d, "cannot use Android Keystore, it'll be disabled", e12);
                return null;
            }
        }

        public synchronized a d() {
            if (this.f6296c != null) {
                this.f6297d = g();
            }
            this.f6301h = f();
            return new a(this);
        }

        public b h(g gVar) {
            this.f6299f = gVar;
            return this;
        }

        public b i(String str) {
            if (str.startsWith("android-keystore://")) {
                if (!this.f6298e) {
                    throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
                }
                this.f6296c = str;
                return this;
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }

        public b j(Context context, String str, String str2) {
            if (context != null) {
                if (str == null) {
                    throw new IllegalArgumentException("need a keyset name");
                }
                this.f6294a = new d(context, str, str2);
                this.f6295b = new e(context, str, str2);
                return this;
            }
            throw new IllegalArgumentException("need an Android context");
        }
    }

    private a(b bVar) {
        this.f6291a = bVar.f6295b;
        this.f6292b = bVar.f6297d;
        this.f6293c = bVar.f6301h;
    }

    public static boolean d() {
        return true;
    }

    public synchronized i c() {
        return this.f6293c.c();
    }
}
