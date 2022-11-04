package ve;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public final class d<T> extends c<T> {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private Object[] f24022c;

    /* renamed from: d */
    private int f24023d;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends ub.b<T> {

        /* renamed from: q */
        private int f24024q = -1;

        /* renamed from: x */
        final /* synthetic */ d<T> f24025x;

        b(d<T> dVar) {
            this.f24025x = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ub.b
        protected void b() {
            do {
                int i10 = this.f24024q + 1;
                this.f24024q = i10;
                if (i10 >= ((d) this.f24025x).f24022c.length) {
                    break;
                }
            } while (((d) this.f24025x).f24022c[this.f24024q] == null);
            if (this.f24024q >= ((d) this.f24025x).f24022c.length) {
                d();
                return;
            }
            Object obj = ((d) this.f24025x).f24022c[this.f24024q];
            hc.t.c(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            e(obj);
        }
    }

    public d() {
        this(new Object[20], 0);
    }

    private d(Object[] objArr, int i10) {
        super(null);
        this.f24022c = objArr;
        this.f24023d = i10;
    }

    private final void e(int i10) {
        Object[] objArr = this.f24022c;
        if (objArr.length <= i10) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            hc.t.d(copyOf, "copyOf(this, newSize)");
            this.f24022c = copyOf;
        }
    }

    @Override // ve.c
    public int a() {
        return this.f24023d;
    }

    @Override // ve.c
    public void b(int i10, T t10) {
        hc.t.e(t10, "value");
        e(i10);
        if (this.f24022c[i10] == null) {
            this.f24023d = a() + 1;
        }
        this.f24022c[i10] = t10;
    }

    @Override // ve.c
    public T get(int i10) {
        Object G;
        G = ub.m.G(this.f24022c, i10);
        return (T) G;
    }

    @Override // ve.c, java.lang.Iterable
    public Iterator<T> iterator() {
        return new b(this);
    }
}
