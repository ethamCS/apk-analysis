package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements g {

    /* renamed from: a */
    private final c f237a;

    /* renamed from: b */
    private final g f238b;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f239a;

        static {
            int[] iArr = new int[e.a.values().length];
            f239a = iArr;
            try {
                iArr[e.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f239a[e.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f239a[e.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f239a[e.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f239a[e.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f239a[e.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f239a[e.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.lifecycle.g
    public void g(i iVar, e.a aVar) {
        switch (a.f239a[aVar.ordinal()]) {
            case 1:
                this.f237a.e(iVar);
                break;
            case 2:
                this.f237a.f(iVar);
                break;
            case 3:
                this.f237a.a(iVar);
                break;
            case 4:
                this.f237a.b(iVar);
                break;
            case 5:
                this.f237a.d(iVar);
                break;
            case 6:
                this.f237a.c(iVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        g gVar = this.f238b;
        if (gVar != null) {
            gVar.g(iVar, aVar);
        }
    }
}
