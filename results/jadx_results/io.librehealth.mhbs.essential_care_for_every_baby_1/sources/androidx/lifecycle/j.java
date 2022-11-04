package androidx.lifecycle;

import androidx.lifecycle.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class j extends e {

    /* renamed from: c */
    private final WeakReference<i> f261c;

    /* renamed from: a */
    private b.a.a.a.a<h, b> f259a = new b.a.a.a.a<>();

    /* renamed from: d */
    private int f262d = 0;

    /* renamed from: e */
    private boolean f263e = false;
    private boolean f = false;
    private ArrayList<e.b> g = new ArrayList<>();

    /* renamed from: b */
    private e.b f260b = e.b.INITIALIZED;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f264a;

        /* renamed from: b */
        static final /* synthetic */ int[] f265b;

        static {
            int[] iArr = new int[e.b.values().length];
            f265b = iArr;
            try {
                iArr[e.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f265b[e.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f265b[e.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f265b[e.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f265b[e.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f264a = iArr2;
            try {
                iArr2[e.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f264a[e.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f264a[e.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f264a[e.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f264a[e.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f264a[e.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f264a[e.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        e.b f266a;

        /* renamed from: b */
        g f267b;

        void a(i iVar, e.a aVar) {
            e.b f = j.f(aVar);
            this.f266a = j.i(this.f266a, f);
            this.f267b.g(iVar, aVar);
            this.f266a = f;
        }
    }

    public j(i iVar) {
        this.f261c = new WeakReference<>(iVar);
    }

    private void c(i iVar) {
        Iterator<Map.Entry<h, b>> a2 = this.f259a.a();
        while (a2.hasNext() && !this.f) {
            Map.Entry<h, b> next = a2.next();
            b value = next.getValue();
            while (value.f266a.compareTo(this.f260b) > 0 && !this.f && this.f259a.contains(next.getKey())) {
                e.a d2 = d(value.f266a);
                l(f(d2));
                value.a(iVar, d2);
                k();
            }
        }
    }

    private static e.a d(e.b bVar) {
        int i = a.f265b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return e.a.ON_DESTROY;
            }
            if (i == 3) {
                return e.a.ON_STOP;
            }
            if (i == 4) {
                return e.a.ON_PAUSE;
            }
            if (i == 5) {
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(i iVar) {
        b.a.a.a.b<h, b>.d d2 = this.f259a.d();
        while (d2.hasNext() && !this.f) {
            Map.Entry next = d2.next();
            b bVar = (b) next.getValue();
            while (bVar.f266a.compareTo(this.f260b) < 0 && !this.f && this.f259a.contains(next.getKey())) {
                l(bVar.f266a);
                bVar.a(iVar, n(bVar.f266a));
                k();
            }
        }
    }

    static e.b f(e.a aVar) {
        switch (a.f264a[aVar.ordinal()]) {
            case 1:
            case 2:
                return e.b.CREATED;
            case 3:
            case 4:
                return e.b.STARTED;
            case 5:
                return e.b.RESUMED;
            case 6:
                return e.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean h() {
        if (this.f259a.size() == 0) {
            return true;
        }
        e.b bVar = this.f259a.b().getValue().f266a;
        e.b bVar2 = this.f259a.e().getValue().f266a;
        return bVar == bVar2 && this.f260b == bVar2;
    }

    static e.b i(e.b bVar, e.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void j(e.b bVar) {
        if (this.f260b == bVar) {
            return;
        }
        this.f260b = bVar;
        if (this.f263e || this.f262d != 0) {
            this.f = true;
            return;
        }
        this.f263e = true;
        m();
        this.f263e = false;
    }

    private void k() {
        ArrayList<e.b> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void l(e.b bVar) {
        this.g.add(bVar);
    }

    private void m() {
        i iVar = this.f261c.get();
        if (iVar != null) {
            while (true) {
                boolean h = h();
                this.f = false;
                if (h) {
                    return;
                }
                if (this.f260b.compareTo(this.f259a.b().getValue().f266a) < 0) {
                    c(iVar);
                }
                Map.Entry<h, b> e2 = this.f259a.e();
                if (!this.f && e2 != null && this.f260b.compareTo(e2.getValue().f266a) > 0) {
                    e(iVar);
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    private static e.a n(e.b bVar) {
        int i = a.f265b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return e.a.ON_START;
            }
            if (i == 3) {
                return e.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return e.a.ON_CREATE;
    }

    @Override // androidx.lifecycle.e
    public e.b a() {
        return this.f260b;
    }

    @Override // androidx.lifecycle.e
    public void b(h hVar) {
        this.f259a.f(hVar);
    }

    public void g(e.a aVar) {
        j(f(aVar));
    }
}
