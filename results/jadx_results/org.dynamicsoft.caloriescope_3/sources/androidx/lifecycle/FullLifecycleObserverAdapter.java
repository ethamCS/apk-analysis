package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements f {

    /* renamed from: a */
    private final b f963a;

    /* renamed from: b */
    private final f f964b;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f965a;

        static {
            int[] iArr = new int[e.a.values().length];
            f965a = iArr;
            try {
                iArr[e.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f965a[e.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f965a[e.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f965a[e.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f965a[e.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f965a[e.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f965a[e.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(b bVar, f fVar) {
        this.f963a = bVar;
        this.f964b = fVar;
    }

    @Override // androidx.lifecycle.f
    public void a(h hVar, e.a aVar) {
        switch (a.f965a[aVar.ordinal()]) {
            case 1:
                this.f963a.e(hVar);
                break;
            case 2:
                this.f963a.f(hVar);
                break;
            case 3:
                this.f963a.a(hVar);
                break;
            case 4:
                this.f963a.b(hVar);
                break;
            case 5:
                this.f963a.d(hVar);
                break;
            case 6:
                this.f963a.c(hVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        f fVar = this.f964b;
        if (fVar != null) {
            fVar.a(hVar, aVar);
        }
    }
}
