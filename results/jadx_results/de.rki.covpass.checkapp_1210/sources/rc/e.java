package rc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import rc.d;
import ud.a;
import vd.d;
import xc.l0;
import xc.u0;
import yd.i;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lrc/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "<init>", "()V", "b", "c", "d", "Lrc/e$a;", "Lrc/e$b;", "Lrc/e$c;", "Lrc/e$d;", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class e {

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lrc/e$a;", "Lrc/e;", BuildConfig.FLAVOR, "a", "Ljava/lang/reflect/Field;", "field", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends e {

        /* renamed from: a */
        private final Field f20603a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            hc.t.e(field, "field");
            this.f20603a = field;
        }

        @Override // rc.e
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.f20603a.getName();
            hc.t.d(name, "field.name");
            sb2.append(gd.z.b(name));
            sb2.append("()");
            Class<?> type = this.f20603a.getType();
            hc.t.d(type, "field.type");
            sb2.append(dd.d.b(type));
            return sb2.toString();
        }

        public final Field b() {
            return this.f20603a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lrc/e$b;", "Lrc/e;", BuildConfig.FLAVOR, "a", "Ljava/lang/reflect/Method;", "getterMethod", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "setterMethod", "c", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends e {

        /* renamed from: a */
        private final Method f20604a;

        /* renamed from: b */
        private final Method f20605b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method method, Method method2) {
            super(null);
            hc.t.e(method, "getterMethod");
            this.f20604a = method;
            this.f20605b = method2;
        }

        @Override // rc.e
        public String a() {
            String b10;
            b10 = h0.b(this.f20604a);
            return b10;
        }

        public final Method b() {
            return this.f20604a;
        }

        public final Method c() {
            return this.f20605b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, d2 = {"Lrc/e$c;", "Lrc/e;", BuildConfig.FLAVOR, "c", "a", "Lxc/u0;", "descriptor", "Lrd/n;", "proto", "Lud/a$d;", "signature", "Ltd/c;", "nameResolver", "Ltd/g;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends e {

        /* renamed from: a */
        private final u0 f20606a;

        /* renamed from: b */
        private final rd.n f20607b;

        /* renamed from: c */
        private final a.d f20608c;

        /* renamed from: d */
        private final td.c f20609d;

        /* renamed from: e */
        private final td.g f20610e;

        /* renamed from: f */
        private final String f20611f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u0 u0Var, rd.n nVar, a.d dVar, td.c cVar, td.g gVar) {
            super(null);
            String str;
            hc.t.e(u0Var, "descriptor");
            hc.t.e(nVar, "proto");
            hc.t.e(dVar, "signature");
            hc.t.e(cVar, "nameResolver");
            hc.t.e(gVar, "typeTable");
            this.f20606a = u0Var;
            this.f20607b = nVar;
            this.f20608c = dVar;
            this.f20609d = cVar;
            this.f20610e = gVar;
            if (dVar.i0()) {
                str = cVar.getString(dVar.d0().V()) + cVar.getString(dVar.d0().N());
            } else {
                d.a d10 = vd.i.d(vd.i.f24018a, nVar, cVar, gVar, false, 8, null);
                if (d10 == null) {
                    throw new b0("No field signature for property: " + u0Var);
                }
                String d11 = d10.d();
                str = gd.z.b(d11) + c() + "()" + d10.e();
            }
            this.f20611f = str;
        }

        private final String c() {
            StringBuilder sb2;
            String b10;
            String str;
            xc.m b11 = this.f20606a.b();
            hc.t.d(b11, "descriptor.containingDeclaration");
            if (hc.t.a(this.f20606a.g(), xc.t.f25580d) && (b11 instanceof me.d)) {
                rd.c k12 = ((me.d) b11).k1();
                i.f<rd.c, Integer> fVar = ud.a.f23543i;
                hc.t.d(fVar, "classModuleName");
                Integer num = (Integer) td.e.a(k12, fVar);
                if (num == null || (str = this.f20609d.getString(num.intValue())) == null) {
                    str = "main";
                }
                sb2 = new StringBuilder();
                sb2.append('$');
                b10 = wd.g.a(str);
            } else if (!hc.t.a(this.f20606a.g(), xc.t.f25577a) || !(b11 instanceof l0)) {
                return BuildConfig.FLAVOR;
            } else {
                u0 u0Var = this.f20606a;
                hc.t.c(u0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                me.f E = ((me.j) u0Var).E();
                if (!(E instanceof pd.k)) {
                    return BuildConfig.FLAVOR;
                }
                pd.k kVar = (pd.k) E;
                if (kVar.f() == null) {
                    return BuildConfig.FLAVOR;
                }
                sb2 = new StringBuilder();
                sb2.append('$');
                b10 = kVar.h().b();
            }
            sb2.append(b10);
            return sb2.toString();
        }

        @Override // rc.e
        public String a() {
            return this.f20611f;
        }

        public final u0 b() {
            return this.f20606a;
        }

        public final td.c d() {
            return this.f20609d;
        }

        public final rd.n e() {
            return this.f20607b;
        }

        public final a.d f() {
            return this.f20608c;
        }

        public final td.g g() {
            return this.f20610e;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lrc/e$d;", "Lrc/e;", BuildConfig.FLAVOR, "a", "Lrc/d$e;", "getterSignature", "Lrc/d$e;", "b", "()Lrc/d$e;", "setterSignature", "c", "<init>", "(Lrc/d$e;Lrc/d$e;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends e {

        /* renamed from: a */
        private final d.e f20612a;

        /* renamed from: b */
        private final d.e f20613b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d.e eVar, d.e eVar2) {
            super(null);
            hc.t.e(eVar, "getterSignature");
            this.f20612a = eVar;
            this.f20613b = eVar2;
        }

        @Override // rc.e
        public String a() {
            return this.f20612a.a();
        }

        public final d.e b() {
            return this.f20612a;
        }

        public final d.e c() {
            return this.f20613b;
        }
    }

    private e() {
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();
}
