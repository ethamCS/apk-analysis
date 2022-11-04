package g6;

import g6.n;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
/* loaded from: classes.dex */
public final class m<T_WRAPPER extends n<T_ENGINE>, T_ENGINE> {

    /* renamed from: d */
    private static final Logger f10582d = Logger.getLogger(m.class.getName());

    /* renamed from: e */
    private static final List<Provider> f10583e;

    /* renamed from: f */
    public static final m<n.a, Cipher> f10584f;

    /* renamed from: g */
    public static final m<n.e, Mac> f10585g;

    /* renamed from: h */
    public static final m<n.g, Signature> f10586h;

    /* renamed from: i */
    public static final m<n.f, MessageDigest> f10587i;

    /* renamed from: j */
    public static final m<n.b, KeyAgreement> f10588j;

    /* renamed from: k */
    public static final m<n.d, KeyPairGenerator> f10589k;

    /* renamed from: l */
    public static final m<n.c, KeyFactory> f10590l;

    /* renamed from: a */
    private T_WRAPPER f10591a;

    /* renamed from: b */
    private List<Provider> f10592b = f10583e;

    /* renamed from: c */
    private boolean f10593c = true;

    static {
        f10583e = v.b() ? b("GmsCore_OpenSSL", "AndroidOpenSSL") : new ArrayList<>();
        f10584f = new m<>(new n.a());
        f10585g = new m<>(new n.e());
        f10586h = new m<>(new n.g());
        f10587i = new m<>(new n.f());
        f10588j = new m<>(new n.b());
        f10589k = new m<>(new n.d());
        f10590l = new m<>(new n.c());
    }

    public m(T_WRAPPER t_wrapper) {
        this.f10591a = t_wrapper;
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f10582d.info(String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public T_ENGINE a(String str) {
        Exception exc = null;
        for (Provider provider : this.f10592b) {
            try {
                return (T_ENGINE) this.f10591a.a(str, provider);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        if (this.f10593c) {
            return (T_ENGINE) this.f10591a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
