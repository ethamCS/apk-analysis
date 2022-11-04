package j$.util.concurrent;
/* loaded from: classes2.dex */
public class q {

    /* renamed from: a */
    m[] f13322a;

    /* renamed from: b */
    m f13323b = null;

    /* renamed from: c */
    p f13324c;

    /* renamed from: d */
    p f13325d;

    /* renamed from: e */
    int f13326e;

    /* renamed from: f */
    int f13327f;

    /* renamed from: g */
    int f13328g;

    /* renamed from: h */
    final int f13329h;

    public q(m[] mVarArr, int i10, int i11, int i12) {
        this.f13322a = mVarArr;
        this.f13329h = i10;
        this.f13326e = i11;
        this.f13327f = i11;
        this.f13328g = i12;
    }

    public final m a() {
        m[] mVarArr;
        int length;
        int i10;
        p pVar;
        m mVar = this.f13323b;
        if (mVar != null) {
            mVar = mVar.f13317d;
        }
        while (mVar == null) {
            if (this.f13327f >= this.f13328g || (mVarArr = this.f13322a) == null || (length = mVarArr.length) <= (i10 = this.f13326e) || i10 < 0) {
                this.f13323b = null;
                return null;
            }
            m tabAt = ConcurrentHashMap.tabAt(mVarArr, i10);
            if (tabAt == null || tabAt.f13314a >= 0) {
                mVar = tabAt;
            } else if (tabAt instanceof h) {
                this.f13322a = ((h) tabAt).f13307e;
                p pVar2 = this.f13325d;
                if (pVar2 != null) {
                    this.f13325d = pVar2.f13321d;
                } else {
                    pVar2 = new p();
                }
                pVar2.f13320c = mVarArr;
                pVar2.f13318a = length;
                pVar2.f13319b = i10;
                pVar2.f13321d = this.f13324c;
                this.f13324c = pVar2;
                mVar = null;
            } else {
                mVar = tabAt instanceof r ? ((r) tabAt).f13333f : null;
            }
            if (this.f13324c != null) {
                while (true) {
                    pVar = this.f13324c;
                    if (pVar == null) {
                        break;
                    }
                    int i11 = this.f13326e;
                    int i12 = pVar.f13318a;
                    int i13 = i11 + i12;
                    this.f13326e = i13;
                    if (i13 < length) {
                        break;
                    }
                    this.f13326e = pVar.f13319b;
                    this.f13322a = pVar.f13320c;
                    pVar.f13320c = null;
                    p pVar3 = pVar.f13321d;
                    pVar.f13321d = this.f13325d;
                    this.f13324c = pVar3;
                    this.f13325d = pVar;
                    length = i12;
                }
                if (pVar == null) {
                    int i14 = this.f13326e + this.f13329h;
                    this.f13326e = i14;
                    if (i14 >= length) {
                        int i15 = this.f13327f + 1;
                        this.f13327f = i15;
                        this.f13326e = i15;
                    }
                }
            } else {
                int i16 = i10 + this.f13329h;
                this.f13326e = i16;
                if (i16 >= length) {
                    int i17 = this.f13327f + 1;
                    this.f13327f = i17;
                    this.f13326e = i17;
                }
            }
        }
        this.f13323b = mVar;
        return mVar;
    }
}
