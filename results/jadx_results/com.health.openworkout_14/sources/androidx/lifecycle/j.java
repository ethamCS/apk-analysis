package androidx.lifecycle;

import androidx.lifecycle.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class j extends e {

    /* renamed from: c */
    private final WeakReference<i> f1238c;

    /* renamed from: a */
    private b.b.a.b.a<h, b> f1236a = new b.b.a.b.a<>();

    /* renamed from: d */
    private int f1239d = 0;

    /* renamed from: e */
    private boolean f1240e = false;

    /* renamed from: f */
    private boolean f1241f = false;

    /* renamed from: g */
    private ArrayList<e.b> f1242g = new ArrayList<>();

    /* renamed from: b */
    private e.b f1237b = e.b.INITIALIZED;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1243a;

        /* renamed from: b */
        static final /* synthetic */ int[] f1244b;

        static {
            int[] iArr = new int[e.b.values().length];
            f1244b = iArr;
            try {
                iArr[e.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1244b[e.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1244b[e.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1244b[e.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1244b[e.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f1243a = iArr2;
            try {
                iArr2[e.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1243a[e.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1243a[e.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1243a[e.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1243a[e.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1243a[e.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1243a[e.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        e.b f1245a;

        /* renamed from: b */
        g f1246b;

        b(h hVar, e.b bVar) {
            this.f1246b = l.f(hVar);
            this.f1245a = bVar;
        }

        void a(i iVar, e.a aVar) {
            e.b h2 = j.h(aVar);
            this.f1245a = j.l(this.f1245a, h2);
            this.f1246b.d(iVar, aVar);
            this.f1245a = h2;
        }
    }

    public j(i iVar) {
        this.f1238c = new WeakReference<>(iVar);
    }

    private void d(i iVar) {
        Iterator<Map.Entry<h, b>> a2 = this.f1236a.a();
        while (a2.hasNext() && !this.f1241f) {
            Map.Entry<h, b> next = a2.next();
            b value = next.getValue();
            while (value.f1245a.compareTo(this.f1237b) > 0 && !this.f1241f && this.f1236a.contains(next.getKey())) {
                e.a f2 = f(value.f1245a);
                o(h(f2));
                value.a(iVar, f2);
                n();
            }
        }
    }

    private e.b e(h hVar) {
        Map.Entry<h, b> i = this.f1236a.i(hVar);
        e.b bVar = null;
        e.b bVar2 = i != null ? i.getValue().f1245a : null;
        if (!this.f1242g.isEmpty()) {
            ArrayList<e.b> arrayList = this.f1242g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return l(l(this.f1237b, bVar2), bVar);
    }

    private static e.a f(e.b bVar) {
        int i = a.f1244b[bVar.ordinal()];
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
    private void g(i iVar) {
        b.b.a.b.b<h, b>.d d2 = this.f1236a.d();
        while (d2.hasNext() && !this.f1241f) {
            Map.Entry next = d2.next();
            b bVar = (b) next.getValue();
            while (bVar.f1245a.compareTo(this.f1237b) < 0 && !this.f1241f && this.f1236a.contains(next.getKey())) {
                o(bVar.f1245a);
                bVar.a(iVar, r(bVar.f1245a));
                n();
            }
        }
    }

    static e.b h(e.a aVar) {
        switch (a.f1243a[aVar.ordinal()]) {
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

    private boolean j() {
        if (this.f1236a.size() == 0) {
            return true;
        }
        e.b bVar = this.f1236a.b().getValue().f1245a;
        e.b bVar2 = this.f1236a.e().getValue().f1245a;
        return bVar == bVar2 && this.f1237b == bVar2;
    }

    static e.b l(e.b bVar, e.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void m(e.b bVar) {
        if (this.f1237b == bVar) {
            return;
        }
        this.f1237b = bVar;
        if (this.f1240e || this.f1239d != 0) {
            this.f1241f = true;
            return;
        }
        this.f1240e = true;
        q();
        this.f1240e = false;
    }

    private void n() {
        ArrayList<e.b> arrayList = this.f1242g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void o(e.b bVar) {
        this.f1242g.add(bVar);
    }

    private void q() {
        i iVar = this.f1238c.get();
        if (iVar != null) {
            while (true) {
                boolean j = j();
                this.f1241f = false;
                if (j) {
                    return;
                }
                if (this.f1237b.compareTo(this.f1236a.b().getValue().f1245a) < 0) {
                    d(iVar);
                }
                Map.Entry<h, b> e2 = this.f1236a.e();
                if (!this.f1241f && e2 != null && this.f1237b.compareTo(e2.getValue().f1245a) > 0) {
                    g(iVar);
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    private static e.a r(e.b bVar) {
        int i = a.f1244b[bVar.ordinal()];
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
    public void a(h hVar) {
        i iVar;
        e.b bVar = this.f1237b;
        e.b bVar2 = e.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = e.b.INITIALIZED;
        }
        b bVar3 = new b(hVar, bVar2);
        if (this.f1236a.g(hVar, bVar3) == null && (iVar = this.f1238c.get()) != null) {
            boolean z = this.f1239d != 0 || this.f1240e;
            e.b e2 = e(hVar);
            this.f1239d++;
            while (bVar3.f1245a.compareTo(e2) < 0 && this.f1236a.contains(hVar)) {
                o(bVar3.f1245a);
                bVar3.a(iVar, r(bVar3.f1245a));
                n();
                e2 = e(hVar);
            }
            if (!z) {
                q();
            }
            this.f1239d--;
        }
    }

    @Override // androidx.lifecycle.e
    public e.b b() {
        return this.f1237b;
    }

    @Override // androidx.lifecycle.e
    public void c(h hVar) {
        this.f1236a.h(hVar);
    }

    public void i(e.a aVar) {
        m(h(aVar));
    }

    @Deprecated
    public void k(e.b bVar) {
        p(bVar);
    }

    public void p(e.b bVar) {
        m(bVar);
    }
}
