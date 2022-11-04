package ek;
/* loaded from: classes3.dex */
public class j implements ak.n {

    /* renamed from: c */
    private k f9711c;

    /* renamed from: d */
    private k f9712d;

    /* renamed from: q */
    private l f9713q;

    public l a() {
        return this.f9713q;
    }

    public k c() {
        return this.f9711c;
    }

    @Override // ak.n
    public Object clone() {
        j jVar = new j();
        jVar.f9713q = this.f9713q;
        k kVar = this.f9711c;
        if (kVar != null) {
            jVar.d((k) kVar.clone());
        }
        k kVar2 = this.f9712d;
        if (kVar2 != null) {
            jVar.e((k) kVar2.clone());
        }
        return jVar;
    }

    public void d(k kVar) {
        this.f9711c = kVar;
    }

    public void e(k kVar) {
        this.f9712d = kVar;
    }

    @Override // ak.n
    public boolean z(Object obj) {
        try {
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            k kVar = this.f9711c;
            if (kVar != null && !kVar.z(lVar.a())) {
                return false;
            }
            k kVar2 = this.f9712d;
            if (kVar2 != null && !kVar2.z(lVar.b())) {
                return false;
            }
            l lVar2 = this.f9713q;
            if (lVar2 == null) {
                return true;
            }
            return lVar2.equals(obj);
        } catch (Exception unused) {
            return false;
        }
    }
}
