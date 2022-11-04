package ri;

import gg.v;
import java.security.spec.AlgorithmParameterSpec;
/* loaded from: classes3.dex */
public class l implements AlgorithmParameterSpec, qi.h {

    /* renamed from: a */
    private n f21232a;

    /* renamed from: b */
    private String f21233b;

    /* renamed from: c */
    private String f21234c;

    /* renamed from: d */
    private String f21235d;

    public l(String str) {
        this(str, lg.a.f16032p.H(), null);
    }

    public l(String str, String str2) {
        this(str, str2, null);
    }

    public l(String str, String str2, String str3) {
        lg.e eVar;
        try {
            eVar = lg.d.a(new v(str));
        } catch (IllegalArgumentException unused) {
            v b10 = lg.d.b(str);
            if (b10 != null) {
                str = b10.H();
                eVar = lg.d.a(b10);
            } else {
                eVar = null;
            }
        }
        if (eVar != null) {
            this.f21232a = new n(eVar.m(), eVar.n(), eVar.l());
            this.f21233b = str;
            this.f21234c = str2;
            this.f21235d = str3;
            return;
        }
        throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
    }

    public l(n nVar) {
        this.f21232a = nVar;
        this.f21234c = lg.a.f16032p.H();
        this.f21235d = null;
    }

    public static l e(lg.f fVar) {
        return fVar.m() != null ? new l(fVar.o().H(), fVar.l().H(), fVar.m().H()) : new l(fVar.o().H(), fVar.l().H());
    }

    @Override // qi.h
    public n a() {
        return this.f21232a;
    }

    @Override // qi.h
    public String b() {
        return this.f21233b;
    }

    @Override // qi.h
    public String c() {
        return this.f21234c;
    }

    @Override // qi.h
    public String d() {
        return this.f21235d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (!this.f21232a.equals(lVar.f21232a) || !this.f21234c.equals(lVar.f21234c)) {
                return false;
            }
            String str = this.f21235d;
            String str2 = lVar.f21235d;
            return str == str2 || (str != null && str.equals(str2));
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f21232a.hashCode() ^ this.f21234c.hashCode();
        String str = this.f21235d;
        return hashCode ^ (str != null ? str.hashCode() : 0);
    }
}
