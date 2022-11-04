package rc;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oc.h;
import oc.k;
import org.conscrypt.BuildConfig;
import rc.d0;
import rc.e;
import ud.a;
import vd.d;
import xc.t0;
import xc.u0;
import xc.v0;
import xc.w0;
import yc.g;
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004;<=>B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u00104\u001a\u000201¢\u0006\u0004\b5\u00106B5\b\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0010\u0012\b\u00107\u001a\u0004\u0018\u000101\u0012\b\u00108\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b5\u00109B+\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0010\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b5\u0010:J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004J(\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0004J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010&\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0018\u0010.\u001a\u0006\u0012\u0002\b\u00030+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u0006?"}, d2 = {"Lrc/w;", "V", "Lrc/f;", "Loc/k;", "Ljava/lang/reflect/Member;", "J", "fieldOrMethod", BuildConfig.FLAVOR, "receiver1", "receiver2", "L", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "Lrc/j;", "container", "Lrc/j;", "C", "()Lrc/j;", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "signature", "R", "K", "()Ljava/lang/Object;", "boundReceiver", "H", "()Z", "isBound", "Ljava/lang/reflect/Field;", "Q", "()Ljava/lang/reflect/Field;", "javaField", "Lrc/w$c;", "P", "()Lrc/w$c;", "getter", "Lsc/d;", "w", "()Lsc/d;", "caller", "D", "defaultCaller", "Lxc/u0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lrc/j;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "rawBoundReceiver", "(Lrc/j;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "(Lrc/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "b", "c", "d", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class w<V> extends rc.f<V> implements oc.k<V> {
    public static final b Companion = new b(null);
    private static final Object Z3 = new Object();
    private final String U3;
    private final String V3;
    private final Object W3;
    private final d0.b<Field> X3;
    private final d0.a<u0> Y3;

    /* renamed from: y */
    private final j f20751y;

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lrc/w$a;", "PropertyType", "ReturnType", "Lrc/f;", "Loc/k$a;", "Loc/g;", "Lrc/w;", "K", "()Lrc/w;", "property", "Lrc/j;", "C", "()Lrc/j;", "container", "Lsc/d;", "D", "()Lsc/d;", "defaultCaller", BuildConfig.FLAVOR, "H", "()Z", "isBound", "Lxc/t0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static abstract class a<PropertyType, ReturnType> extends rc.f<ReturnType> implements oc.g<ReturnType>, k.a<PropertyType> {
        @Override // rc.f
        public j C() {
            return K().C();
        }

        @Override // rc.f
        public sc.d<?> D() {
            return null;
        }

        @Override // rc.f
        public boolean H() {
            return K().H();
        }

        public abstract t0 J();

        public abstract w<PropertyType> K();
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrc/w$b;", BuildConfig.FLAVOR, "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lrc/w$c;", "V", "Lrc/w$a;", "Loc/k$b;", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", "getName", "()Ljava/lang/String;", "name", "Lsc/d;", "caller$delegate", "Lrc/d0$b;", "w", "()Lsc/d;", "caller", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static abstract class c<V> extends a<V, V> implements k.b<V> {
        static final /* synthetic */ oc.k<Object>[] V3 = {hc.k0.g(new hc.e0(hc.k0.b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), hc.k0.g(new hc.e0(hc.k0.b(c.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: y */
        private final d0.a f20752y = d0.c(new b(this));
        private final d0.b U3 = d0.b(new a(this));

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lsc/d;", "kotlin.jvm.PlatformType", "b", "()Lsc/d;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends hc.v implements gc.a<sc.d<?>> {

            /* renamed from: c */
            final /* synthetic */ c<V> f20753c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? extends V> cVar) {
                super(0);
                this.f20753c = cVar;
            }

            /* renamed from: b */
            public final sc.d<?> invoke() {
                sc.d<?> b10;
                b10 = x.b(this.f20753c, true);
                return b10;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lxc/v0;", "kotlin.jvm.PlatformType", "b", "()Lxc/v0;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class b extends hc.v implements gc.a<v0> {

            /* renamed from: c */
            final /* synthetic */ c<V> f20754c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(c<? extends V> cVar) {
                super(0);
                this.f20754c = cVar;
            }

            /* renamed from: b */
            public final v0 invoke() {
                v0 i10 = this.f20754c.K().E().i();
                return i10 == null ? ae.c.d(this.f20754c.K().E(), yc.g.Companion.b()) : i10;
            }
        }

        /* renamed from: L */
        public v0 J() {
            T b10 = this.f20752y.b(this, V3[0]);
            hc.t.d(b10, "<get-descriptor>(...)");
            return (v0) b10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && hc.t.a(K(), ((c) obj).K());
        }

        @Override // oc.c
        public String getName() {
            return "<get-" + K().getName() + '>';
        }

        public int hashCode() {
            return K().hashCode();
        }

        public String toString() {
            return "getter of " + K();
        }

        @Override // rc.f
        public sc.d<?> w() {
            T b10 = this.U3.b(this, V3[1]);
            hc.t.d(b10, "<get-caller>(...)");
            return (sc.d) b10;
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lrc/w$d;", "V", "Lrc/w$a;", "Ltb/e0;", "Loc/h$a;", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", "getName", "()Ljava/lang/String;", "name", "Lsc/d;", "caller$delegate", "Lrc/d0$b;", "w", "()Lsc/d;", "caller", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static abstract class d<V> extends a<V, tb.e0> implements h.a<V> {
        static final /* synthetic */ oc.k<Object>[] V3 = {hc.k0.g(new hc.e0(hc.k0.b(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), hc.k0.g(new hc.e0(hc.k0.b(d.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: y */
        private final d0.a f20755y = d0.c(new b(this));
        private final d0.b U3 = d0.b(new a(this));

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lsc/d;", "kotlin.jvm.PlatformType", "b", "()Lsc/d;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends hc.v implements gc.a<sc.d<?>> {

            /* renamed from: c */
            final /* synthetic */ d<V> f20756c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d<V> dVar) {
                super(0);
                this.f20756c = dVar;
            }

            /* renamed from: b */
            public final sc.d<?> invoke() {
                sc.d<?> b10;
                b10 = x.b(this.f20756c, false);
                return b10;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lxc/w0;", "kotlin.jvm.PlatformType", "b", "()Lxc/w0;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class b extends hc.v implements gc.a<w0> {

            /* renamed from: c */
            final /* synthetic */ d<V> f20757c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d<V> dVar) {
                super(0);
                this.f20757c = dVar;
            }

            /* renamed from: b */
            public final w0 invoke() {
                w0 n10 = this.f20757c.K().E().n();
                if (n10 == null) {
                    u0 E = this.f20757c.K().E();
                    g.a aVar = yc.g.Companion;
                    return ae.c.e(E, aVar.b(), aVar.b());
                }
                return n10;
            }
        }

        /* renamed from: L */
        public w0 J() {
            T b10 = this.f20755y.b(this, V3[0]);
            hc.t.d(b10, "<get-descriptor>(...)");
            return (w0) b10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && hc.t.a(K(), ((d) obj).K());
        }

        @Override // oc.c
        public String getName() {
            return "<set-" + K().getName() + '>';
        }

        public int hashCode() {
            return K().hashCode();
        }

        public String toString() {
            return "setter of " + K();
        }

        @Override // rc.f
        public sc.d<?> w() {
            T b10 = this.U3.b(this, V3[1]);
            hc.t.d(b10, "<get-caller>(...)");
            return (sc.d) b10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lxc/u0;", "kotlin.jvm.PlatformType", "b", "()Lxc/u0;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends hc.v implements gc.a<u0> {

        /* renamed from: c */
        final /* synthetic */ w<V> f20758c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(w<? extends V> wVar) {
            super(0);
            this.f20758c = wVar;
        }

        /* renamed from: b */
        public final u0 invoke() {
            return this.f20758c.C().u(this.f20758c.getName(), this.f20758c.R());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"V", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends hc.v implements gc.a<Field> {

        /* renamed from: c */
        final /* synthetic */ w<V> f20759c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(w<? extends V> wVar) {
            super(0);
            this.f20759c = wVar;
        }

        /* renamed from: b */
        public final Field invoke() {
            Class<?> cls;
            rc.e f10 = g0.f20633a.f(this.f20759c.E());
            if (!(f10 instanceof e.c)) {
                if (f10 instanceof e.a) {
                    return ((e.a) f10).b();
                }
                if ((f10 instanceof e.b) || (f10 instanceof e.d)) {
                    return null;
                }
                throw new tb.p();
            }
            e.c cVar = (e.c) f10;
            u0 b10 = cVar.b();
            d.a d10 = vd.i.d(vd.i.f24018a, cVar.e(), cVar.d(), cVar.g(), false, 8, null);
            if (d10 == null) {
                return null;
            }
            w<V> wVar = this.f20759c;
            if (gd.k.e(b10) || vd.i.f(cVar.e())) {
                cls = wVar.C().a().getEnclosingClass();
            } else {
                xc.m b11 = b10.b();
                cls = b11 instanceof xc.e ? j0.p((xc.e) b11) : wVar.C().a();
            }
            if (cls == null) {
                return null;
            }
            try {
                return cls.getDeclaredField(d10.c());
            } catch (NoSuchFieldException unused) {
                return null;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(j jVar, String str, String str2, Object obj) {
        this(jVar, str, str2, null, obj);
        hc.t.e(jVar, "container");
        hc.t.e(str, "name");
        hc.t.e(str2, "signature");
    }

    private w(j jVar, String str, String str2, u0 u0Var, Object obj) {
        this.f20751y = jVar;
        this.U3 = str;
        this.V3 = str2;
        this.W3 = obj;
        d0.b<Field> b10 = d0.b(new f(this));
        hc.t.d(b10, "lazy {\n        when (val…y -> null\n        }\n    }");
        this.X3 = b10;
        d0.a<u0> d10 = d0.d(u0Var, new e(this));
        hc.t.d(d10, "lazySoft(descriptorIniti…or(name, signature)\n    }");
        this.Y3 = d10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(rc.j r8, xc.u0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            hc.t.e(r8, r0)
            java.lang.String r0 = "descriptor"
            hc.t.e(r9, r0)
            wd.f r0 = r9.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "descriptor.name.asString()"
            hc.t.d(r3, r0)
            rc.g0 r0 = rc.g0.f20633a
            rc.e r0 = r0.f(r9)
            java.lang.String r4 = r0.a()
            java.lang.Object r6 = hc.h.V3
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.w.<init>(rc.j, xc.u0):void");
    }

    @Override // rc.f
    public j C() {
        return this.f20751y;
    }

    @Override // rc.f
    public sc.d<?> D() {
        return P().D();
    }

    @Override // rc.f
    public boolean H() {
        return !hc.t.a(this.W3, hc.h.V3);
    }

    public final Member J() {
        if (!E().q0()) {
            return null;
        }
        rc.e f10 = g0.f20633a.f(E());
        if (f10 instanceof e.c) {
            e.c cVar = (e.c) f10;
            if (cVar.f().g0()) {
                a.c b02 = cVar.f().b0();
                if (!b02.b0() || !b02.W()) {
                    return null;
                }
                return C().s(cVar.d().getString(b02.V()), cVar.d().getString(b02.N()));
            }
        }
        return Q();
    }

    public final Object K() {
        return sc.h.a(this.W3, E());
    }

    public final Object L(Member member, Object obj, Object obj2) {
        try {
            Object obj3 = Z3;
            if ((obj == obj3 || obj2 == obj3) && E().U() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object K = H() ? K() : obj;
            if (!(K != obj3)) {
                K = null;
            }
            if (!H()) {
                obj = obj2;
            }
            if (!(obj != obj3)) {
                obj = null;
            }
            if (member == null) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(K);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, new Object[0]);
            }
            if (length == 1) {
                Method method = (Method) member;
                Object[] objArr = new Object[1];
                if (K == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    hc.t.d(cls, "fieldOrMethod.parameterTypes[0]");
                    K = j0.g(cls);
                }
                objArr[0] = K;
                return method.invoke(null, objArr);
            } else if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            } else {
                Method method2 = (Method) member;
                Object[] objArr2 = new Object[2];
                objArr2[0] = K;
                if (obj == null) {
                    Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                    hc.t.d(cls2, "fieldOrMethod.parameterTypes[1]");
                    obj = j0.g(cls2);
                }
                objArr2[1] = obj;
                return method2.invoke(null, objArr2);
            }
        } catch (IllegalAccessException e10) {
            throw new pc.b(e10);
        }
    }

    /* renamed from: O */
    public u0 E() {
        u0 invoke = this.Y3.invoke();
        hc.t.d(invoke, "_descriptor()");
        return invoke;
    }

    public abstract c<V> P();

    public final Field Q() {
        return this.X3.invoke();
    }

    public final String R() {
        return this.V3;
    }

    public boolean equals(Object obj) {
        w<?> d10 = j0.d(obj);
        return d10 != null && hc.t.a(C(), d10.C()) && hc.t.a(getName(), d10.getName()) && hc.t.a(this.V3, d10.V3) && hc.t.a(this.W3, d10.W3);
    }

    @Override // oc.c
    public String getName() {
        return this.U3;
    }

    public int hashCode() {
        return (((C().hashCode() * 31) + getName().hashCode()) * 31) + this.V3.hashCode();
    }

    public String toString() {
        return f0.f20627a.g(E());
    }

    @Override // rc.f
    public sc.d<?> w() {
        return P().w();
    }
}
