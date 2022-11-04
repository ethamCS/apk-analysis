package androidx.lifecycle;

import androidx.lifecycle.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class i extends e {

    /* renamed from: c */
    private final WeakReference<h> f988c;

    /* renamed from: a */
    private a.b.a.b.a<g, b> f986a = new a.b.a.b.a<>();
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<e.b> g = new ArrayList<>();

    /* renamed from: b */
    private e.b f987b = e.b.INITIALIZED;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f989a;

        /* renamed from: b */
        static final /* synthetic */ int[] f990b;

        static {
            int[] iArr = new int[e.b.values().length];
            f990b = iArr;
            try {
                iArr[e.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f990b[e.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f990b[e.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f990b[e.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f990b[e.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f989a = iArr2;
            try {
                iArr2[e.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f989a[e.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f989a[e.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f989a[e.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f989a[e.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f989a[e.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f989a[e.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        e.b f991a;

        /* renamed from: b */
        f f992b;

        b(g gVar, e.b bVar) {
            this.f992b = k.a(gVar);
            this.f991a = bVar;
        }

        void a(h hVar, e.a aVar) {
            e.b b2 = i.b(aVar);
            this.f991a = i.a(this.f991a, b2);
            this.f992b.a(hVar, aVar);
            this.f991a = b2;
        }
    }

    public i(h hVar) {
        this.f988c = new WeakReference<>(hVar);
    }

    static e.b a(e.b bVar, e.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void a(h hVar) {
        Iterator<Map.Entry<g, b>> a2 = this.f986a.a();
        while (a2.hasNext() && !this.f) {
            Map.Entry<g, b> next = a2.next();
            b value = next.getValue();
            while (value.f991a.compareTo(this.f987b) > 0 && !this.f && this.f986a.contains(next.getKey())) {
                e.a c2 = c(value.f991a);
                e(b(c2));
                value.a(hVar, c2);
                c();
            }
        }
    }

    static e.b b(e.a aVar) {
        switch (a.f989a[aVar.ordinal()]) {
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

    /* JADX WARN: Multi-variable type inference failed */
    private void b(h hVar) {
        a.b.a.b.b<g, b>.d c2 = this.f986a.c();
        while (c2.hasNext() && !this.f) {
            Map.Entry next = c2.next();
            b bVar = (b) next.getValue();
            while (bVar.f991a.compareTo(this.f987b) < 0 && !this.f && this.f986a.contains(next.getKey())) {
                e(bVar.f991a);
                bVar.a(hVar, f(bVar.f991a));
                c();
            }
        }
    }

    private boolean b() {
        if (this.f986a.size() == 0) {
            return true;
        }
        e.b bVar = this.f986a.b().getValue().f991a;
        e.b bVar2 = this.f986a.d().getValue().f991a;
        return bVar == bVar2 && this.f987b == bVar2;
    }

    private static e.a c(e.b bVar) {
        int i = a.f990b[bVar.ordinal()];
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

    private e.b c(g gVar) {
        Map.Entry<g, b> b2 = this.f986a.b(gVar);
        e.b bVar = null;
        e.b bVar2 = b2 != null ? b2.getValue().f991a : null;
        if (!this.g.isEmpty()) {
            ArrayList<e.b> arrayList = this.g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.f987b, bVar2), bVar);
    }

    private void c() {
        ArrayList<e.b> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void d() {
        h hVar = this.f988c.get();
        if (hVar != null) {
            while (true) {
                boolean b2 = b();
                this.f = false;
                if (b2) {
                    return;
                }
                if (this.f987b.compareTo(this.f986a.b().getValue().f991a) < 0) {
                    a(hVar);
                }
                Map.Entry<g, b> d = this.f986a.d();
                if (!this.f && d != null && this.f987b.compareTo(d.getValue().f991a) > 0) {
                    b(hVar);
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    private void d(e.b bVar) {
        if (this.f987b == bVar) {
            return;
        }
        this.f987b = bVar;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        d();
        this.e = false;
    }

    private void e(e.b bVar) {
        this.g.add(bVar);
    }

    private static e.a f(e.b bVar) {
        int i = a.f990b[bVar.ordinal()];
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
        return this.f987b;
    }

    public void a(e.a aVar) {
        d(b(aVar));
    }

    @Deprecated
    public void a(e.b bVar) {
        b(bVar);
    }

    @Override // androidx.lifecycle.e
    public void a(g gVar) {
        h hVar;
        e.b bVar = this.f987b;
        e.b bVar2 = e.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = e.b.INITIALIZED;
        }
        b bVar3 = new b(gVar, bVar2);
        if (this.f986a.b(gVar, bVar3) == null && (hVar = this.f988c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            e.b c2 = c(gVar);
            this.d++;
            while (bVar3.f991a.compareTo(c2) < 0 && this.f986a.contains(gVar)) {
                e(bVar3.f991a);
                bVar3.a(hVar, f(bVar3.f991a));
                c();
                c2 = c(gVar);
            }
            if (!z) {
                d();
            }
            this.d--;
        }
    }

    public void b(e.b bVar) {
        d(bVar);
    }

    @Override // androidx.lifecycle.e
    public void b(g gVar) {
        this.f986a.remove(gVar);
    }
}
