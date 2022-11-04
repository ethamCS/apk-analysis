package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;
/* JADX WARN: Init of enum DISTINCT can be incorrect */
/* JADX WARN: Init of enum ORDERED can be incorrect */
/* JADX WARN: Init of enum SHORT_CIRCUIT can be incorrect */
/* JADX WARN: Init of enum SIZED can be incorrect */
/* JADX WARN: Init of enum SORTED can be incorrect */
/* renamed from: j$.util.stream.d3 */
/* loaded from: classes2.dex */
public enum EnumC0539d3 {
    DISTINCT(0, r2),
    SORTED(1, r5),
    ORDERED(2, r7),
    SIZED(3, r11),
    SHORT_CIRCUIT(12, r13);
    

    /* renamed from: f */
    static final int f13653f;

    /* renamed from: g */
    static final int f13654g;

    /* renamed from: h */
    static final int f13655h;

    /* renamed from: i */
    private static final int f13656i;

    /* renamed from: j */
    private static final int f13657j;

    /* renamed from: k */
    private static final int f13658k;

    /* renamed from: l */
    static final int f13659l;

    /* renamed from: m */
    static final int f13660m;

    /* renamed from: n */
    static final int f13661n;

    /* renamed from: o */
    static final int f13662o;

    /* renamed from: p */
    static final int f13663p;

    /* renamed from: q */
    static final int f13664q;

    /* renamed from: r */
    static final int f13665r;

    /* renamed from: s */
    static final int f13666s;

    /* renamed from: t */
    static final int f13667t;

    /* renamed from: u */
    static final int f13668u;

    /* renamed from: a */
    private final Map f13670a;

    /* renamed from: b */
    private final int f13671b;

    /* renamed from: c */
    private final int f13672c;

    /* renamed from: d */
    private final int f13673d;

    /* renamed from: e */
    private final int f13674e;

    static {
        EnumC0534c3 enumC0534c3 = EnumC0534c3.SPLITERATOR;
        C0529b3 k10 = k(enumC0534c3);
        EnumC0534c3 enumC0534c32 = EnumC0534c3.STREAM;
        k10.b(enumC0534c32);
        EnumC0534c3 enumC0534c33 = EnumC0534c3.OP;
        k10.c(enumC0534c33);
        C0529b3 k11 = k(enumC0534c3);
        k11.b(enumC0534c32);
        k11.c(enumC0534c33);
        C0529b3 k12 = k(enumC0534c3);
        k12.b(enumC0534c32);
        k12.c(enumC0534c33);
        EnumC0534c3 enumC0534c34 = EnumC0534c3.TERMINAL_OP;
        k12.a(enumC0534c34);
        EnumC0534c3 enumC0534c35 = EnumC0534c3.UPSTREAM_TERMINAL_OP;
        k12.a(enumC0534c35);
        C0529b3 k13 = k(enumC0534c3);
        k13.b(enumC0534c32);
        k13.a(enumC0534c33);
        k(enumC0534c33).b(enumC0534c34);
        f13653f = d(enumC0534c3);
        f13654g = d(enumC0534c32);
        f13655h = d(enumC0534c33);
        d(enumC0534c34);
        d(enumC0534c35);
        int i10 = 0;
        for (EnumC0539d3 enumC0539d3 : values()) {
            i10 |= enumC0539d3.f13674e;
        }
        f13656i = i10;
        int i11 = f13654g;
        f13657j = i11;
        int i12 = i11 << 1;
        f13658k = i12;
        f13659l = i11 | i12;
        EnumC0539d3 enumC0539d32 = DISTINCT;
        f13660m = enumC0539d32.f13672c;
        f13661n = enumC0539d32.f13673d;
        EnumC0539d3 enumC0539d33 = SORTED;
        f13662o = enumC0539d33.f13672c;
        f13663p = enumC0539d33.f13673d;
        EnumC0539d3 enumC0539d34 = ORDERED;
        f13664q = enumC0539d34.f13672c;
        f13665r = enumC0539d34.f13673d;
        EnumC0539d3 enumC0539d35 = SIZED;
        f13666s = enumC0539d35.f13672c;
        f13667t = enumC0539d35.f13673d;
        f13668u = SHORT_CIRCUIT.f13672c;
    }

    EnumC0539d3(int i10, C0529b3 c0529b3) {
        for (EnumC0534c3 enumC0534c3 : EnumC0534c3.values()) {
            AbstractC0516o.q(c0529b3.f13631a, enumC0534c3, 0);
        }
        this.f13670a = c0529b3.f13631a;
        int i11 = i10 * 2;
        this.f13671b = i11;
        this.f13672c = 1 << i11;
        this.f13673d = 2 << i11;
        this.f13674e = 3 << i11;
    }

    public static int b(int i10, int i11) {
        return i10 | (i11 & (i10 == 0 ? f13656i : ~(((f13657j & i10) << 1) | i10 | ((f13658k & i10) >> 1))));
    }

    private static int d(EnumC0534c3 enumC0534c3) {
        EnumC0539d3[] values;
        int i10 = 0;
        for (EnumC0539d3 enumC0539d3 : values()) {
            i10 |= ((Integer) enumC0539d3.f13670a.get(enumC0534c3)).intValue() << enumC0539d3.f13671b;
        }
        return i10;
    }

    public static int f(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        return ((characteristics & 4) == 0 || spliterator.getComparator() == null) ? f13653f & characteristics : f13653f & characteristics & (-5);
    }

    private static C0529b3 k(EnumC0534c3 enumC0534c3) {
        C0529b3 c0529b3 = new C0529b3(new EnumMap(EnumC0534c3.class));
        c0529b3.b(enumC0534c3);
        return c0529b3;
    }

    public static int l(int i10) {
        return i10 & ((~i10) >> 1) & f13657j;
    }

    public final boolean h(int i10) {
        return (i10 & this.f13674e) == this.f13672c;
    }

    public final boolean i(int i10) {
        int i11 = this.f13674e;
        return (i10 & i11) == i11;
    }
}
