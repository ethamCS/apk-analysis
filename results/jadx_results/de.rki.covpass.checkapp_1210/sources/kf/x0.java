package kf;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
import p000if.j;
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010:\u0012\u0006\u0010(\u001a\u00020\u0005¢\u0006\u0004\b<\u0010=J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016R%\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\"R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0004028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R!\u00109\u001a\b\u0012\u0004\u0012\u00020\u00010\u00198@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u001c\u001a\u0004\b7\u00108¨\u0006>"}, d2 = {"Lkf/x0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkf/k;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "d", "name", BuildConfig.FLAVOR, "isOptional", "Ltb/e0;", "c", "index", "q", "r", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p", "n", "k", BuildConfig.FLAVOR, "other", "equals", "hashCode", "toString", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers$delegate", "Lkotlin/Lazy;", "e", "()[Lkotlinx/serialization/KSerializer;", "childSerializers", "_hashCode$delegate", "g", "()I", "_hashCode", "serialName", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "elementsCount", "I", "m", "Lif/i;", "h", "()Lif/i;", "kind", "j", "()Ljava/util/List;", "annotations", BuildConfig.FLAVOR, "a", "()Ljava/util/Set;", "serialNames", "typeParameterDescriptors$delegate", "f", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors", "Lkf/v;", "generatedSerializer", "<init>", "(Ljava/lang/String;Lkf/v;I)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class x0 implements SerialDescriptor, k {

    /* renamed from: a */
    private final String f15257a;

    /* renamed from: b */
    private final v<?> f15258b;

    /* renamed from: c */
    private final int f15259c;

    /* renamed from: d */
    private int f15260d = -1;

    /* renamed from: e */
    private final String[] f15261e;

    /* renamed from: f */
    private final List<Annotation>[] f15262f;

    /* renamed from: g */
    private List<Annotation> f15263g;

    /* renamed from: h */
    private final boolean[] f15264h;

    /* renamed from: i */
    private Map<String, Integer> f15265i;

    /* renamed from: j */
    private final Lazy f15266j;

    /* renamed from: k */
    private final Lazy f15267k;

    /* renamed from: l */
    private final Lazy f15268l;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.a<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            x0.this = r1;
        }

        /* renamed from: b */
        public final Integer invoke() {
            x0 x0Var = x0.this;
            return Integer.valueOf(y0.a(x0Var, x0Var.f()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "b", "()[Lkotlinx/serialization/KSerializer;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b extends hc.v implements gc.a<KSerializer<?>[]> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            x0.this = r1;
        }

        /* renamed from: b */
        public final KSerializer<?>[] invoke() {
            KSerializer<?>[] childSerializers;
            v vVar = x0.this.f15258b;
            return (vVar == null || (childSerializers = vVar.childSerializers()) == null) ? z0.f15274a : childSerializers;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "i", BuildConfig.FLAVOR, "b", "(I)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    static final class c extends hc.v implements gc.l<Integer, CharSequence> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            x0.this = r1;
        }

        public final CharSequence b(int i10) {
            return x0.this.n(i10) + ": " + x0.this.q(i10).l();
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return b(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {BuildConfig.FLAVOR, "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class d extends hc.v implements gc.a<SerialDescriptor[]> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(0);
            x0.this = r1;
        }

        /* renamed from: b */
        public final SerialDescriptor[] invoke() {
            ArrayList arrayList;
            KSerializer<?>[] typeParametersSerializers;
            v vVar = x0.this.f15258b;
            if (vVar == null || (typeParametersSerializers = vVar.typeParametersSerializers()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(typeParametersSerializers.length);
                for (KSerializer<?> kSerializer : typeParametersSerializers) {
                    arrayList.add(kSerializer.getDescriptor());
                }
            }
            return v0.b(arrayList);
        }
    }

    public x0(String str, v<?> vVar, int i10) {
        Map<String, Integer> h10;
        Lazy b10;
        Lazy b11;
        Lazy b12;
        hc.t.e(str, "serialName");
        this.f15257a = str;
        this.f15258b = vVar;
        this.f15259c = i10;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f15261e = strArr;
        int i12 = this.f15259c;
        this.f15262f = new List[i12];
        this.f15264h = new boolean[i12];
        h10 = ub.q0.h();
        this.f15265i = h10;
        tb.o oVar = tb.o.PUBLICATION;
        b10 = tb.m.b(oVar, new b());
        this.f15266j = b10;
        b11 = tb.m.b(oVar, new d());
        this.f15267k = b11;
        b12 = tb.m.b(oVar, new a());
        this.f15268l = b12;
    }

    private final Map<String, Integer> d() {
        HashMap hashMap = new HashMap();
        int length = this.f15261e.length;
        for (int i10 = 0; i10 < length; i10++) {
            hashMap.put(this.f15261e[i10], Integer.valueOf(i10));
        }
        return hashMap;
    }

    private final KSerializer<?>[] e() {
        return (KSerializer[]) this.f15266j.getValue();
    }

    private final int g() {
        return ((Number) this.f15268l.getValue()).intValue();
    }

    @Override // kf.k
    public Set<String> a() {
        return this.f15265i.keySet();
    }

    public final void c(String str, boolean z10) {
        hc.t.e(str, "name");
        String[] strArr = this.f15261e;
        int i10 = this.f15260d + 1;
        this.f15260d = i10;
        strArr[i10] = str;
        this.f15264h[i10] = z10;
        this.f15262f[i10] = null;
        if (i10 == this.f15259c - 1) {
            this.f15265i = d();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (hc.t.a(l(), serialDescriptor.l()) && Arrays.equals(f(), ((x0) obj).f()) && m() == serialDescriptor.m()) {
                int m10 = m();
                for (int i10 = 0; i10 < m10; i10++) {
                    if (hc.t.a(q(i10).l(), serialDescriptor.q(i10).l()) && hc.t.a(q(i10).h(), serialDescriptor.q(i10).h())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final SerialDescriptor[] f() {
        return (SerialDescriptor[]) this.f15267k.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public p000if.i h() {
        return j.a.f12553a;
    }

    public int hashCode() {
        return g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.a.b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> j() {
        List<Annotation> h10;
        List<Annotation> list = this.f15263g;
        if (list == null) {
            h10 = ub.u.h();
            return h10;
        }
        return list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int k(String str) {
        hc.t.e(str, "name");
        Integer num = this.f15265i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String l() {
        return this.f15257a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int m() {
        return this.f15259c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String n(int i10) {
        return this.f15261e[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean o() {
        return SerialDescriptor.a.c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> p(int i10) {
        List<Annotation> h10;
        List<Annotation> list = this.f15262f[i10];
        if (list == null) {
            h10 = ub.u.h();
            return h10;
        }
        return list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor q(int i10) {
        return e()[i10].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean r(int i10) {
        return this.f15264h[i10];
    }

    public String toString() {
        nc.g i10;
        String e02;
        i10 = nc.m.i(0, this.f15259c);
        e02 = ub.c0.e0(i10, ", ", l() + '(', ")", 0, null, new c(), 24, null);
        return e02;
    }
}
