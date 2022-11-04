package j$.time.format;

import java.util.List;
/* renamed from: j$.time.format.f */
/* loaded from: classes2.dex */
public final class C0490f implements g {

    /* renamed from: a */
    private final g[] f13069a;

    /* renamed from: b */
    private final boolean f13070b;

    public C0490f(List list, boolean z10) {
        this.f13069a = (g[]) list.toArray(new g[list.size()]);
        this.f13070b = z10;
    }

    C0490f(g[] gVarArr) {
        this.f13069a = gVarArr;
        this.f13070b = false;
    }

    public final C0490f a() {
        return !this.f13070b ? this : new C0490f(this.f13069a);
    }

    @Override // j$.time.format.g
    public final boolean b(z zVar, StringBuilder sb2) {
        int length = sb2.length();
        if (this.f13070b) {
            zVar.g();
        }
        try {
            for (g gVar : this.f13069a) {
                if (!gVar.b(zVar, sb2)) {
                    sb2.setLength(length);
                    return true;
                }
            }
            if (this.f13070b) {
                zVar.a();
            }
            return true;
        } finally {
            if (this.f13070b) {
                zVar.a();
            }
        }
    }

    @Override // j$.time.format.g
    public final int d(x xVar, CharSequence charSequence, int i10) {
        if (!this.f13070b) {
            for (g gVar : this.f13069a) {
                i10 = gVar.d(xVar, charSequence, i10);
                if (i10 < 0) {
                    break;
                }
            }
            return i10;
        }
        xVar.r();
        int i11 = i10;
        for (g gVar2 : this.f13069a) {
            i11 = gVar2.d(xVar, charSequence, i11);
            if (i11 < 0) {
                xVar.f(false);
                return i10;
            }
        }
        xVar.f(true);
        return i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f13069a != null) {
            sb2.append(this.f13070b ? "[" : "(");
            for (g gVar : this.f13069a) {
                sb2.append(gVar);
            }
            sb2.append(this.f13070b ? "]" : ")");
        }
        return sb2.toString();
    }
}
