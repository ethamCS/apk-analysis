package p000if;

import gc.l;
import hc.t;
import hc.v;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kf.k;
import kf.v0;
import kf.y0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nc.g;
import org.conscrypt.BuildConfig;
import tb.x;
import ub.c0;
import ub.h0;
import ub.m;
import ub.q0;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u001b\u0010\u0018\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0017R \u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00063"}, d2 = {"Lif/f;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkf/k;", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "n", "name", "k", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p", "q", BuildConfig.FLAVOR, "r", BuildConfig.FLAVOR, "other", "equals", "hashCode", "toString", "_hashCode$delegate", "Lkotlin/Lazy;", "c", "()I", "_hashCode", "serialName", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "Lif/i;", "kind", "Lif/i;", "h", "()Lif/i;", "elementsCount", "I", "m", "annotations", "Ljava/util/List;", "j", "()Ljava/util/List;", BuildConfig.FLAVOR, "serialNames", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "typeParameters", "Lif/a;", "builder", "<init>", "(Ljava/lang/String;Lif/i;ILjava/util/List;Lif/a;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: if.f */
/* loaded from: classes3.dex */
public final class f implements SerialDescriptor, k {

    /* renamed from: a */
    private final String f12533a;

    /* renamed from: b */
    private final i f12534b;

    /* renamed from: c */
    private final int f12535c;

    /* renamed from: d */
    private final List<Annotation> f12536d;

    /* renamed from: e */
    private final Set<String> f12537e;

    /* renamed from: f */
    private final String[] f12538f;

    /* renamed from: g */
    private final SerialDescriptor[] f12539g;

    /* renamed from: h */
    private final List<Annotation>[] f12540h;

    /* renamed from: i */
    private final boolean[] f12541i;

    /* renamed from: j */
    private final Map<String, Integer> f12542j;

    /* renamed from: k */
    private final SerialDescriptor[] f12543k;

    /* renamed from: l */
    private final Lazy f12544l;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: if.f$a */
    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.a<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            f.this = r1;
        }

        /* renamed from: b */
        public final Integer invoke() {
            f fVar = f.this;
            return Integer.valueOf(y0.a(fVar, fVar.f12543k));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR, "b", "(I)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: if.f$b */
    /* loaded from: classes3.dex */
    static final class b extends v implements l<Integer, CharSequence> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(1);
            f.this = r1;
        }

        public final CharSequence b(int i10) {
            return f.this.n(i10) + ": " + f.this.q(i10).l();
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return b(num.intValue());
        }
    }

    public f(String str, i iVar, int i10, List<? extends SerialDescriptor> list, p000if.a aVar) {
        HashSet D0;
        boolean[] A0;
        Iterable<h0> v02;
        int s10;
        Map<String, Integer> q10;
        Lazy a10;
        t.e(str, "serialName");
        t.e(iVar, "kind");
        t.e(list, "typeParameters");
        t.e(aVar, "builder");
        this.f12533a = str;
        this.f12534b = iVar;
        this.f12535c = i10;
        this.f12536d = aVar.c();
        D0 = c0.D0(aVar.f());
        this.f12537e = D0;
        Object[] array = aVar.f().toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        this.f12538f = strArr;
        this.f12539g = v0.b(aVar.e());
        Object[] array2 = aVar.d().toArray(new List[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f12540h = (List[]) array2;
        A0 = c0.A0(aVar.g());
        this.f12541i = A0;
        v02 = m.v0(strArr);
        s10 = ub.v.s(v02, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (h0 h0Var : v02) {
            arrayList.add(x.a(h0Var.d(), Integer.valueOf(h0Var.c())));
        }
        q10 = q0.q(arrayList);
        this.f12542j = q10;
        this.f12543k = v0.b(list);
        a10 = tb.m.a(new a());
        this.f12544l = a10;
    }

    private final int c() {
        return ((Number) this.f12544l.getValue()).intValue();
    }

    @Override // kf.k
    public Set<String> a() {
        return this.f12537e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (t.a(l(), serialDescriptor.l()) && Arrays.equals(this.f12543k, ((f) obj).f12543k) && m() == serialDescriptor.m()) {
                int m10 = m();
                for (int i10 = 0; i10 < m10; i10++) {
                    if (t.a(q(i10).l(), serialDescriptor.q(i10).l()) && t.a(q(i10).h(), serialDescriptor.q(i10).h())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public i h() {
        return this.f12534b;
    }

    public int hashCode() {
        return c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.a.b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> j() {
        return this.f12536d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int k(String str) {
        t.e(str, "name");
        Integer num = this.f12542j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String l() {
        return this.f12533a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int m() {
        return this.f12535c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String n(int i10) {
        return this.f12538f[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean o() {
        return SerialDescriptor.a.c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> p(int i10) {
        return this.f12540h[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor q(int i10) {
        return this.f12539g[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean r(int i10) {
        return this.f12541i[i10];
    }

    public String toString() {
        g i10;
        String e02;
        i10 = nc.m.i(0, m());
        e02 = c0.e0(i10, ", ", l() + '(', ")", 0, null, new b(), 24, null);
        return e02;
    }
}
