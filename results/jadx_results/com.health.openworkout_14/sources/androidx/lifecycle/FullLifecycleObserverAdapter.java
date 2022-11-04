package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements g {

    /* renamed from: a */
    private final c f1197a;

    /* renamed from: b */
    private final g f1198b;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1199a;

        static {
            int[] iArr = new int[e.a.values().length];
            f1199a = iArr;
            try {
                iArr[e.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1199a[e.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1199a[e.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1199a[e.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1199a[e.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1199a[e.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1199a[e.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(c cVar, g gVar) {
        this.f1197a = cVar;
        this.f1198b = gVar;
    }

    @Override // androidx.lifecycle.g
    public void d(i iVar, e.a aVar) {
        switch (a.f1199a[aVar.ordinal()]) {
            case 1:
                this.f1197a.c(iVar);
                break;
            case 2:
                this.f1197a.g(iVar);
                break;
            case 3:
                this.f1197a.a(iVar);
                break;
            case 4:
                this.f1197a.e(iVar);
                break;
            case 5:
                this.f1197a.f(iVar);
                break;
            case 6:
                this.f1197a.b(iVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        g gVar = this.f1198b;
        if (gVar != null) {
            gVar.d(iVar, aVar);
        }
    }
}
