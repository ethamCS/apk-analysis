package androidx.lifecycle;

import androidx.lifecycle.m;
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements s {

    /* renamed from: c */
    private final j f4249c;

    /* renamed from: d */
    private final s f4250d;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4251a;

        static {
            int[] iArr = new int[m.b.values().length];
            f4251a = iArr;
            try {
                iArr[m.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4251a[m.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4251a[m.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4251a[m.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4251a[m.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4251a[m.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4251a[m.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(j jVar, s sVar) {
        this.f4249c = jVar;
        this.f4250d = sVar;
    }

    @Override // androidx.lifecycle.s
    public void f(v vVar, m.b bVar) {
        switch (a.f4251a[bVar.ordinal()]) {
            case 1:
                this.f4249c.c(vVar);
                break;
            case 2:
                this.f4249c.onStart(vVar);
                break;
            case 3:
                this.f4249c.onResume(vVar);
                break;
            case 4:
                this.f4249c.onPause(vVar);
                break;
            case 5:
                this.f4249c.onStop(vVar);
                break;
            case 6:
                this.f4249c.onDestroy(vVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        s sVar = this.f4250d;
        if (sVar != null) {
            sVar.f(vVar, bVar);
        }
    }
}
