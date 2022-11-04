package td;

import hc.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ub.c0;
import ub.l;
import ub.m;
import ub.u;
/* loaded from: classes.dex */
public abstract class a {
    public static final C0391a Companion = new C0391a(null);

    /* renamed from: a */
    private final int[] f22187a;

    /* renamed from: b */
    private final int f22188b;

    /* renamed from: c */
    private final int f22189c;

    /* renamed from: d */
    private final int f22190d;

    /* renamed from: e */
    private final List<Integer> f22191e;

    /* renamed from: td.a$a */
    /* loaded from: classes.dex */
    public static final class C0391a {
        private C0391a() {
        }

        public /* synthetic */ C0391a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(int... iArr) {
        Integer F;
        Integer F2;
        Integer F3;
        List<Integer> list;
        List c10;
        t.e(iArr, "numbers");
        this.f22187a = iArr;
        F = m.F(iArr, 0);
        int i10 = -1;
        this.f22188b = F != null ? F.intValue() : -1;
        F2 = m.F(iArr, 1);
        this.f22189c = F2 != null ? F2.intValue() : -1;
        F3 = m.F(iArr, 2);
        this.f22190d = F3 != null ? F3.intValue() : i10;
        if (iArr.length <= 3) {
            list = u.h();
        } else if (iArr.length > 1024) {
            throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
        } else {
            c10 = l.c(iArr);
            list = c0.F0(c10.subList(3, iArr.length));
        }
        this.f22191e = list;
    }

    public final int a() {
        return this.f22188b;
    }

    public final int b() {
        return this.f22189c;
    }

    public final boolean c(int i10, int i11, int i12) {
        int i13 = this.f22188b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f22189c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f22190d >= i12;
    }

    public final boolean d(a aVar) {
        t.e(aVar, "version");
        return c(aVar.f22188b, aVar.f22189c, aVar.f22190d);
    }

    public final boolean e(int i10, int i11, int i12) {
        int i13 = this.f22188b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f22189c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f22190d <= i12;
    }

    public boolean equals(Object obj) {
        if (obj != null && t.a(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (this.f22188b == aVar.f22188b && this.f22189c == aVar.f22189c && this.f22190d == aVar.f22190d && t.a(this.f22191e, aVar.f22191e)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(a aVar) {
        t.e(aVar, "ourVersion");
        int i10 = this.f22188b;
        if (i10 == 0) {
            if (aVar.f22188b == 0 && this.f22189c == aVar.f22189c) {
                return true;
            }
        } else if (i10 == aVar.f22188b && this.f22189c <= aVar.f22189c) {
            return true;
        }
        return false;
    }

    public final int[] g() {
        return this.f22187a;
    }

    public int hashCode() {
        int i10 = this.f22188b;
        int i11 = i10 + (i10 * 31) + this.f22189c;
        int i12 = i11 + (i11 * 31) + this.f22190d;
        return i12 + (i12 * 31) + this.f22191e.hashCode();
    }

    public String toString() {
        String e02;
        int[] g10 = g();
        ArrayList arrayList = new ArrayList();
        int length = g10.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = g10[i10];
            if (!(i11 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        e02 = c0.e0(arrayList, ".", null, null, 0, null, null, 62, null);
        return e02;
    }
}
