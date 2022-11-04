package j$.util.concurrent;
/* loaded from: classes2.dex */
public final class s extends m {

    /* renamed from: e */
    s f13335e;

    /* renamed from: f */
    s f13336f;

    /* renamed from: g */
    s f13337g;

    /* renamed from: h */
    s f13338h;

    /* renamed from: i */
    boolean f13339i;

    public s(int i10, Object obj, Object obj2, m mVar, s sVar) {
        super(i10, obj, obj2, mVar);
        this.f13335e = sVar;
    }

    @Override // j$.util.concurrent.m
    public final m a(int i10, Object obj) {
        return b(i10, obj, null);
    }

    public final s b(int i10, Object obj, Class cls) {
        int compareComparables;
        if (obj != null) {
            s sVar = this;
            do {
                s sVar2 = sVar.f13336f;
                s sVar3 = sVar.f13337g;
                int i11 = sVar.f13314a;
                if (i11 <= i10) {
                    if (i11 >= i10) {
                        Object obj2 = sVar.f13315b;
                        if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                            return sVar;
                        }
                        if (sVar2 != null) {
                            if (sVar3 != null) {
                                if ((cls == null && (cls = ConcurrentHashMap.comparableClassFor(obj)) == null) || (compareComparables = ConcurrentHashMap.compareComparables(cls, obj, obj2)) == 0) {
                                    s b10 = sVar3.b(i10, obj, cls);
                                    if (b10 != null) {
                                        return b10;
                                    }
                                } else if (compareComparables >= 0) {
                                    sVar2 = sVar3;
                                }
                            }
                        }
                    }
                    sVar = sVar3;
                    continue;
                }
                sVar = sVar2;
                continue;
            } while (sVar != null);
            return null;
        }
        return null;
    }
}
