package kf;

import java.util.ArrayList;
import jf.c;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.conscrypt.BuildConfig;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:82)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:60)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:54)
    */
@Metadata(bv = {}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\bW\u0010XJ+\u0010\b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00028\u0000*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH$¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010)\u001a\u00020\nH\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\nH\u0014¢\u0006\u0004\b-\u0010.J-\u00103\u001a\u00028\u0001\"\u0004\b\u0001\u0010/2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u0001002\b\u00102\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b3\u00104J\u000e\u00105\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\nJ\b\u00106\u001a\u00020\u000fH\u0016J\b\u00108\u001a\u0004\u0018\u000107J\u0006\u00109\u001a\u00020\u000fJ\u0006\u0010:\u001a\u00020\u0012J\u0006\u0010;\u001a\u00020\u0015J\u0006\u0010<\u001a\u00020\u000bJ\u0006\u0010=\u001a\u00020\u001aJ\u0006\u0010\u0004\u001a\u00020\u001dJ\u0006\u0010>\u001a\u00020 J\u0006\u0010?\u001a\u00020#J\u0006\u0010@\u001a\u00020&J\u000e\u0010A\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\nJ\u0016\u0010C\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010D\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010E\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010F\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010G\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010H\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010I\u001a\u00020 2\u0006\u0010B\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010J\u001a\u00020#2\u0006\u0010B\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010K\u001a\u00020&2\u0006\u0010B\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ;\u0010L\u001a\u00028\u0001\"\u0004\b\u0001\u0010/2\u0006\u0010B\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u0001002\b\u00102\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bL\u0010MJC\u0010O\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010/*\u00020N2\u0006\u0010B\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0001002\b\u00102\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bO\u0010MJ\u0017\u0010R\u001a\u00020Q2\u0006\u0010P\u001a\u00028\u0000H\u0004¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00028\u0000H\u0004¢\u0006\u0004\bT\u0010UR\u0016\u0010V\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b/\u0010U¨\u0006Y"}, d2 = {"Lkf/l1;", "Tag", "Lkotlinx/serialization/encoding/Decoder;", "Ljf/c;", "E", "tag", "Lkotlin/Function0;", "block", "X", "(Ljava/lang/Object;Lgc/a;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", BuildConfig.FLAVOR, "index", "U", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", BuildConfig.FLAVOR, "I", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "J", "(Ljava/lang/Object;)B", BuildConfig.FLAVOR, "R", "(Ljava/lang/Object;)S", "P", "(Ljava/lang/Object;)I", BuildConfig.FLAVOR, "Q", "(Ljava/lang/Object;)J", BuildConfig.FLAVOR, "N", "(Ljava/lang/Object;)F", BuildConfig.FLAVOR, "L", "(Ljava/lang/Object;)D", BuildConfig.FLAVOR, "K", "(Ljava/lang/Object;)C", BuildConfig.FLAVOR, "S", "(Ljava/lang/Object;)Ljava/lang/String;", "enumDescriptor", "M", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "inlineDescriptor", "O", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "T", "Lkotlinx/serialization/b;", "deserializer", "previousValue", "H", "(Lkotlinx/serialization/b;Ljava/lang/Object;)Ljava/lang/Object;", "t", "l", BuildConfig.FLAVOR, "A", "j", "z", "B", "w", "h", "G", "n", "D", "p", "descriptor", "i", "g", "o", "x", "s", "F", "u", "f", "k", "C", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/b;Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "m", "name", "Ltb/e0;", "W", "(Ljava/lang/Object;)V", "V", "()Ljava/lang/Object;", "currentTagOrNull", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class l1<Tag> implements Decoder, jf.c {

    /* renamed from: a */
    private final ArrayList<Tag> f15187a = new ArrayList<>();

    /* renamed from: b */
    private boolean f15188b;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", BuildConfig.FLAVOR, "Tag", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends hc.v implements gc.a<T> {

        /* renamed from: c */
        final /* synthetic */ l1<Tag> f15189c;

        /* renamed from: d */
        final /* synthetic */ kotlinx.serialization.b<T> f15190d;

        /* renamed from: q */
        final /* synthetic */ T f15191q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l1<Tag> l1Var, kotlinx.serialization.b<T> bVar, T t10) {
            super(0);
            this.f15189c = l1Var;
            this.f15190d = bVar;
            this.f15191q = t10;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Void, T] */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
        @Override // gc.a
        public final T invoke() {
            return this.f15189c.l() ? this.f15189c.H(this.f15190d, this.f15191q) : this.f15189c.A();
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "Tag", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class b extends hc.v implements gc.a<T> {

        /* renamed from: c */
        final /* synthetic */ l1<Tag> f15192c;

        /* renamed from: d */
        final /* synthetic */ kotlinx.serialization.b<T> f15193d;

        /* renamed from: q */
        final /* synthetic */ T f15194q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l1<Tag> l1Var, kotlinx.serialization.b<T> bVar, T t10) {
            super(0);
            this.f15192c = l1Var;
            this.f15193d = bVar;
            this.f15194q = t10;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // gc.a
        public final T invoke() {
            return this.f15192c.H(this.f15193d, this.f15194q);
        }
    }

    public l1() {
    }

    private final <E> E X(Tag tag, gc.a<? extends E> aVar) {
        W(tag);
        E invoke = aVar.invoke();
        if (!this.f15188b) {
            V();
        }
        this.f15188b = false;
        return invoke;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Void A() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short B() {
        return R(V());
    }

    @Override // jf.c
    public final <T> T C(SerialDescriptor serialDescriptor, int i10, kotlinx.serialization.b<T> bVar, T t10) {
        hc.t.e(serialDescriptor, "descriptor");
        hc.t.e(bVar, "deserializer");
        return (T) X(U(serialDescriptor, i10), new b(this, bVar, t10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String D() {
        return S(V());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float E() {
        return N(V());
    }

    @Override // jf.c
    public final float F(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "descriptor");
        return N(U(serialDescriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double G() {
        return L(V());
    }

    protected <T> T H(kotlinx.serialization.b<T> bVar, T t10) {
        hc.t.e(bVar, "deserializer");
        return (T) y(bVar);
    }

    protected abstract boolean I(Tag tag);

    protected abstract byte J(Tag tag);

    protected abstract char K(Tag tag);

    protected abstract double L(Tag tag);

    protected abstract int M(Tag tag, SerialDescriptor serialDescriptor);

    protected abstract float N(Tag tag);

    public Decoder O(Tag tag, SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "inlineDescriptor");
        W(tag);
        return this;
    }

    protected abstract int P(Tag tag);

    protected abstract long Q(Tag tag);

    protected abstract short R(Tag tag);

    protected abstract String S(Tag tag);

    public final Tag T() {
        Object i02;
        i02 = ub.c0.i0(this.f15187a);
        return (Tag) i02;
    }

    protected abstract Tag U(SerialDescriptor serialDescriptor, int i10);

    protected final Tag V() {
        int j10;
        ArrayList<Tag> arrayList = this.f15187a;
        j10 = ub.u.j(arrayList);
        Tag remove = arrayList.remove(j10);
        this.f15188b = true;
        return remove;
    }

    protected final void W(Tag tag) {
        this.f15187a.add(tag);
    }

    @Override // jf.c
    public int e(SerialDescriptor serialDescriptor) {
        return c.b.a(this, serialDescriptor);
    }

    @Override // jf.c
    public final char f(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "descriptor");
        return K(U(serialDescriptor, i10));
    }

    @Override // jf.c
    public final byte g(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "descriptor");
        return J(U(serialDescriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long h() {
        return Q(V());
    }

    @Override // jf.c
    public final boolean i(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "descriptor");
        return I(U(serialDescriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean j() {
        return I(V());
    }

    @Override // jf.c
    public final String k(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "descriptor");
        return S(U(serialDescriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract boolean l();

    @Override // jf.c
    public final <T> T m(SerialDescriptor serialDescriptor, int i10, kotlinx.serialization.b<T> bVar, T t10) {
        hc.t.e(serialDescriptor, "descriptor");
        hc.t.e(bVar, "deserializer");
        return (T) X(U(serialDescriptor, i10), new a(this, bVar, t10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char n() {
        return K(V());
    }

    @Override // jf.c
    public final short o(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "descriptor");
        return R(U(serialDescriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int p(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "enumDescriptor");
        return M(V(), serialDescriptor);
    }

    @Override // jf.c
    public boolean r() {
        return c.b.b(this);
    }

    @Override // jf.c
    public final long s(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "descriptor");
        return Q(U(serialDescriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder t(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "inlineDescriptor");
        return O(V(), serialDescriptor);
    }

    @Override // jf.c
    public final double u(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "descriptor");
        return L(U(serialDescriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int w() {
        return P(V());
    }

    @Override // jf.c
    public final int x(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "descriptor");
        return P(U(serialDescriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract <T> T y(kotlinx.serialization.b<T> bVar);

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte z() {
        return J(V());
    }
}
