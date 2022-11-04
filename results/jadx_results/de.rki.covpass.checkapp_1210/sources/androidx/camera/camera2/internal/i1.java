package androidx.camera.camera2.internal;

import androidx.camera.core.t;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import w.d0;
/* loaded from: classes.dex */
public class i1 {

    /* renamed from: a */
    private final w.g0 f1773a;

    /* renamed from: b */
    private final androidx.lifecycle.d0<androidx.camera.core.t> f1774b;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1775a;

        static {
            int[] iArr = new int[d0.a.values().length];
            f1775a = iArr;
            try {
                iArr[d0.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1775a[d0.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1775a[d0.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1775a[d0.a.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1775a[d0.a.RELEASING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1775a[d0.a.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1775a[d0.a.RELEASED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public i1(w.g0 g0Var) {
        this.f1773a = g0Var;
        androidx.lifecycle.d0<androidx.camera.core.t> d0Var = new androidx.lifecycle.d0<>();
        this.f1774b = d0Var;
        d0Var.k(androidx.camera.core.t.a(t.b.CLOSED));
    }

    private androidx.camera.core.t b() {
        return androidx.camera.core.t.a(this.f1773a.a() ? t.b.OPENING : t.b.PENDING_OPEN);
    }

    public LiveData<androidx.camera.core.t> a() {
        return this.f1774b;
    }

    public void c(d0.a aVar, t.a aVar2) {
        androidx.camera.core.t tVar;
        t.b bVar;
        switch (a.f1775a[aVar.ordinal()]) {
            case 1:
                tVar = b();
                break;
            case 2:
                bVar = t.b.OPENING;
                tVar = androidx.camera.core.t.b(bVar, aVar2);
                break;
            case 3:
                bVar = t.b.OPEN;
                tVar = androidx.camera.core.t.b(bVar, aVar2);
                break;
            case 4:
            case 5:
                bVar = t.b.CLOSING;
                tVar = androidx.camera.core.t.b(bVar, aVar2);
                break;
            case 6:
            case 7:
                bVar = t.b.CLOSED;
                tVar = androidx.camera.core.t.b(bVar, aVar2);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        androidx.camera.core.s1.a("CameraStateMachine", "New public camera state " + tVar + " from " + aVar + " and " + aVar2);
        if (!Objects.equals(this.f1774b.e(), tVar)) {
            androidx.camera.core.s1.a("CameraStateMachine", "Publishing new public camera state " + tVar);
            this.f1774b.k(tVar);
        }
    }
}
