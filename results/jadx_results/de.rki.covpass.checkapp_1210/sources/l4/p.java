package l4;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class p implements c {

    /* renamed from: a */
    private final String f15787a;

    /* renamed from: b */
    private final List<c> f15788b;

    /* renamed from: c */
    private final boolean f15789c;

    public p(String str, List<c> list, boolean z10) {
        this.f15787a = str;
        this.f15788b = list;
        this.f15789c = z10;
    }

    @Override // l4.c
    public g4.c a(com.airbnb.lottie.n nVar, m4.b bVar) {
        return new g4.d(nVar, bVar, this);
    }

    public List<c> b() {
        return this.f15788b;
    }

    public String c() {
        return this.f15787a;
    }

    public boolean d() {
        return this.f15789c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f15787a + "' Shapes: " + Arrays.toString(this.f15788b.toArray()) + '}';
    }
}
