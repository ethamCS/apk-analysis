package pj;

import gg.v;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
/* loaded from: classes3.dex */
public class a extends Provider implements ConfigurableProvider {

    /* renamed from: c */
    private static String f19238c = "BouncyCastle Post-Quantum Security Provider v1.70";

    /* renamed from: d */
    public static String f19239d = "BCPQC";

    /* renamed from: q */
    public static final ProviderConfiguration f19240q = null;

    /* renamed from: x */
    private static final Map f19241x = new HashMap();

    /* renamed from: y */
    private static final String[] f19242y = {"Rainbow", "McEliece", "SPHINCS", "LMS", "NH", "XMSS", "QTESLA"};

    /* renamed from: pj.a$a */
    /* loaded from: classes3.dex */
    class C0311a implements PrivilegedAction {
        C0311a() {
            a.this = r1;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            a.this.h();
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements PrivilegedAction {

        /* renamed from: a */
        final /* synthetic */ String f19244a;

        b(String str) {
            this.f19244a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.f19244a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public a() {
        super(f19239d, 1.7d, f19238c);
        AccessController.doPrivileged(new C0311a());
    }

    private void f(String str, String[] strArr) {
        for (int i10 = 0; i10 != strArr.length; i10++) {
            Class g10 = g(a.class, str + strArr[i10] + "$Mappings");
            if (g10 != null) {
                try {
                    ((AlgorithmProvider) g10.newInstance()).configure(this);
                } catch (Exception e10) {
                    throw new InternalError("cannot create instance of " + str + strArr[i10] + "$Mappings : " + e10);
                }
            }
        }
    }

    static Class g(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new b(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void h() {
        f("org.bouncycastle.pqc.jcajce.provider.", f19242y);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, v vVar, String str2) {
        if (!containsKey(str + "." + str2)) {
            throw new IllegalStateException("primary key (" + str + "." + str2 + ") not found");
        }
        addAlgorithm(str + "." + vVar, str2);
        addAlgorithm(str + ".OID." + vVar, str2);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException("duplicate provider key (" + str + ") found");
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAttributes(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            String str3 = str + " " + str2;
            if (containsKey(str3)) {
                throw new IllegalStateException("duplicate provider attribute key (" + str3 + ") found");
            }
            put(str3, map.get(str2));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addKeyInfoConverter(v vVar, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        Map map = f19241x;
        synchronized (map) {
            map.put(vVar, asymmetricKeyInfoConverter);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public AsymmetricKeyInfoConverter getKeyInfoConverter(v vVar) {
        return (AsymmetricKeyInfoConverter) f19241x.get(vVar);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public boolean hasAlgorithm(String str, String str2) {
        if (!containsKey(str + "." + str2)) {
            if (!containsKey("Alg.Alias." + str + "." + str2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void setParameter(String str, Object obj) {
        synchronized (f19240q) {
        }
    }
}
