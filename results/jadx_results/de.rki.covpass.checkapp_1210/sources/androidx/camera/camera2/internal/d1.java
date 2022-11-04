package androidx.camera.camera2.internal;

import android.content.Context;
import w.c2;
import w.k0;
import w.p2;
/* loaded from: classes.dex */
public final class d1 implements w.p2 {

    /* renamed from: b */
    final v1 f1641b;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1642a;

        static {
            int[] iArr = new int[p2.b.values().length];
            f1642a = iArr;
            try {
                iArr[p2.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1642a[p2.b.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1642a[p2.b.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1642a[p2.b.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public d1(Context context) {
        this.f1641b = v1.b(context);
    }

    @Override // w.p2
    public w.o0 a(p2.b bVar, int i10) {
        w.q1 L = w.q1.L();
        c2.b bVar2 = new c2.b();
        int[] iArr = a.f1642a;
        int i11 = iArr[bVar.ordinal()];
        int i12 = 5;
        if (i11 == 1) {
            bVar2.s(i10 == 2 ? 5 : 1);
        } else if (i11 == 2 || i11 == 3) {
            bVar2.s(1);
        } else if (i11 == 4) {
            bVar2.s(3);
        }
        p2.b bVar3 = p2.b.PREVIEW;
        if (bVar == bVar3) {
            u.m.a(bVar2);
        }
        L.g(w.o2.f24554n, bVar2.m());
        L.g(w.o2.f24556p, c1.f1632a);
        k0.a aVar = new k0.a();
        int i13 = iArr[bVar.ordinal()];
        if (i13 == 1) {
            if (i10 != 2) {
                i12 = 2;
            }
            aVar.p(i12);
        } else if (i13 == 2 || i13 == 3) {
            aVar.p(1);
        } else if (i13 == 4) {
            aVar.p(3);
        }
        L.g(w.o2.f24555o, aVar.h());
        L.g(w.o2.f24557q, bVar == p2.b.IMAGE_CAPTURE ? f2.f1687c : l0.f1801a);
        if (bVar == bVar3) {
            L.g(w.f1.f24455l, this.f1641b.d());
        }
        L.g(w.f1.f24451h, Integer.valueOf(this.f1641b.c().getRotation()));
        return w.u1.J(L);
    }
}
