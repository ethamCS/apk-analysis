package rc;

import hc.q0;
import he.k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import oe.m0;
import org.conscrypt.BuildConfig;
import qd.a;
import rc.d0;
import rc.j;
import xc.f1;
import xc.u0;
import yd.i;
@Metadata(bv = {}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001\u001eB\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\bP\u0010QJ\b\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0016J\u0013\u0010\u0017\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR9\u0010#\u001a$\u0012 \u0012\u001e \"*\u000e\u0018\u00010!R\b\u0012\u0004\u0012\u00028\u00000\u00000!R\b\u0012\u0004\u0012\u00028\u00000\u00000 8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001e\u0010*\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010)R\u0016\u00100\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000030\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010)R\u001e\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010)R\u0016\u0010:\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\"\u0010>\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020J8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010L¨\u0006R"}, d2 = {"Lrc/h;", BuildConfig.FLAVOR, "T", "Lrc/j;", "Loc/d;", "Lrc/i;", "Lrc/a0;", BuildConfig.FLAVOR, "Z", "Lwd/f;", "name", BuildConfig.FLAVOR, "Lxc/u0;", "J", "Lxc/y;", "D", BuildConfig.FLAVOR, "index", "E", "value", BuildConfig.FLAVOR, "B", "other", "equals", "hashCode", BuildConfig.FLAVOR, "toString", "Ljava/lang/Class;", "jClass", "Ljava/lang/Class;", "a", "()Ljava/lang/Class;", "Lrc/d0$b;", "Lrc/h$a;", "kotlin.jvm.PlatformType", "data", "Lrc/d0$b;", "U", "()Lrc/d0$b;", "Loc/c;", "x", "()Ljava/util/Collection;", "members", "Lxc/l;", "C", "constructorDescriptors", "G", "()Ljava/lang/String;", "simpleName", "y", "qualifiedName", "Loc/g;", "k", "constructors", "z", "nestedClasses", "I", "()Ljava/lang/Object;", "objectInstance", BuildConfig.FLAVOR, "v", "()Ljava/util/List;", "sealedSubclasses", "A", "()Z", "isCompanion", "Lwd/b;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Lxc/e;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lhe/h;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "<init>", "(Ljava/lang/Class;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class h<T> extends j implements oc.d<T>, i, a0 {

    /* renamed from: q */
    private final Class<T> f20635q;

    /* renamed from: x */
    private final d0.b<h<T>.a> f20636x;

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0016\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b?\u0010@J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002R%\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR%\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR%\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\u0016R-\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u00078FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\fR%\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b#\u0010\fR#\u0010*\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u001f\u001a\u0004\b'\u0010(R)\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000!0+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b-\u0010.R%\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\n\u001a\u0004\b1\u0010\fR%\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b4\u0010\fR%\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\n\u001a\u0004\b7\u0010\fR%\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b:\u0010\fR%\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\n\u001a\u0004\b=\u0010\f¨\u0006A"}, d2 = {"Lrc/h$a;", "Lrc/j$b;", "Lrc/j;", "Ljava/lang/Class;", "jClass", BuildConfig.FLAVOR, "f", BuildConfig.FLAVOR, "Lrc/f;", "declaredStaticMembers$delegate", "Lrc/d0$a;", "m", "()Ljava/util/Collection;", "declaredStaticMembers", "inheritedNonStaticMembers$delegate", "o", "inheritedNonStaticMembers", "inheritedStaticMembers$delegate", "p", "inheritedStaticMembers", "simpleName$delegate", "u", "()Ljava/lang/String;", "simpleName", "qualifiedName$delegate", "s", "qualifiedName", "Loc/g;", "constructors$delegate", "j", "getConstructors$annotations", "()V", "constructors", "Loc/d;", "nestedClasses$delegate", "q", "nestedClasses", "objectInstance$delegate", "Lrc/d0$b;", "r", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", BuildConfig.FLAVOR, "sealedSubclasses$delegate", "t", "()Ljava/util/List;", "sealedSubclasses", "declaredNonStaticMembers$delegate", "l", "declaredNonStaticMembers", "allNonStaticMembers$delegate", "h", "allNonStaticMembers", "allStaticMembers$delegate", "i", "allStaticMembers", "declaredMembers$delegate", "k", "declaredMembers", "allMembers$delegate", "g", "allMembers", "<init>", "(Lrc/h;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public final class a extends j.b {

        /* renamed from: w */
        static final /* synthetic */ oc.k<Object>[] f20637w = {hc.k0.g(new hc.e0(hc.k0.b(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "annotations", "getAnnotations()Ljava/util/List;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: d */
        private final d0.a f20638d;

        /* renamed from: f */
        private final d0.a f20640f;

        /* renamed from: g */
        private final d0.a f20641g;

        /* renamed from: h */
        private final d0.a f20642h;

        /* renamed from: j */
        private final d0.b f20644j;

        /* renamed from: k */
        private final d0.a f20645k;

        /* renamed from: l */
        private final d0.a f20646l;

        /* renamed from: n */
        private final d0.a f20648n;

        /* renamed from: o */
        private final d0.a f20649o;

        /* renamed from: p */
        private final d0.a f20650p;

        /* renamed from: q */
        private final d0.a f20651q;

        /* renamed from: e */
        private final d0.a f20639e = d0.c(new d(this));

        /* renamed from: i */
        private final d0.a f20643i = d0.c(new l(this));

        /* renamed from: m */
        private final d0.a f20647m = d0.c(new o(this));

        /* renamed from: r */
        private final d0.a f20652r = d0.c(new b(this));

        /* renamed from: s */
        private final d0.a f20653s = d0.c(new c(this));

        /* renamed from: t */
        private final d0.a f20654t = d0.c(new f(this));

        /* renamed from: u */
        private final d0.a f20655u = d0.c(new C0334a(this));

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lrc/f;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* renamed from: rc.h$a$a */
        /* loaded from: classes.dex */
        public static final class C0334a extends hc.v implements gc.a<List<? extends rc.f<?>>> {

            /* renamed from: c */
            final /* synthetic */ h<T>.a f20657c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0334a(h<T>.a aVar) {
                super(0);
                this.f20657c = aVar;
            }

            @Override // gc.a
            public final List<? extends rc.f<?>> invoke() {
                List<? extends rc.f<?>> o02;
                o02 = ub.c0.o0(this.f20657c.h(), this.f20657c.i());
                return o02;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lrc/f;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class b extends hc.v implements gc.a<List<? extends rc.f<?>>> {

            /* renamed from: c */
            final /* synthetic */ h<T>.a f20658c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h<T>.a aVar) {
                super(0);
                this.f20658c = aVar;
            }

            @Override // gc.a
            public final List<? extends rc.f<?>> invoke() {
                List<? extends rc.f<?>> o02;
                o02 = ub.c0.o0(this.f20658c.l(), this.f20658c.o());
                return o02;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lrc/f;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class c extends hc.v implements gc.a<List<? extends rc.f<?>>> {

            /* renamed from: c */
            final /* synthetic */ h<T>.a f20659c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(h<T>.a aVar) {
                super(0);
                this.f20659c = aVar;
            }

            @Override // gc.a
            public final List<? extends rc.f<?>> invoke() {
                List<? extends rc.f<?>> o02;
                o02 = ub.c0.o0(this.f20659c.m(), this.f20659c.p());
                return o02;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "T", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class d extends hc.v implements gc.a<List<? extends Annotation>> {

            /* renamed from: c */
            final /* synthetic */ h<T>.a f20660c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(h<T>.a aVar) {
                super(0);
                this.f20660c = aVar;
            }

            @Override // gc.a
            public final List<? extends Annotation> invoke() {
                return j0.e(this.f20660c.n());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Loc/g;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class e extends hc.v implements gc.a<List<? extends oc.g<? extends T>>> {

            /* renamed from: c */
            final /* synthetic */ h<T> f20661c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(h<T> hVar) {
                super(0);
                this.f20661c = hVar;
            }

            @Override // gc.a
            public final List<oc.g<T>> invoke() {
                int s10;
                Collection<xc.l> C = this.f20661c.C();
                h<T> hVar = this.f20661c;
                s10 = ub.v.s(C, 10);
                ArrayList arrayList = new ArrayList(s10);
                for (xc.l lVar : C) {
                    arrayList.add(new rc.k(hVar, lVar));
                }
                return arrayList;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lrc/f;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class f extends hc.v implements gc.a<List<? extends rc.f<?>>> {

            /* renamed from: c */
            final /* synthetic */ h<T>.a f20662c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(h<T>.a aVar) {
                super(0);
                this.f20662c = aVar;
            }

            @Override // gc.a
            public final List<? extends rc.f<?>> invoke() {
                List<? extends rc.f<?>> o02;
                o02 = ub.c0.o0(this.f20662c.l(), this.f20662c.m());
                return o02;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lrc/f;", "kotlin.jvm.PlatformType", "b", "()Ljava/util/Collection;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class g extends hc.v implements gc.a<Collection<? extends rc.f<?>>> {

            /* renamed from: c */
            final /* synthetic */ h<T> f20663c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(h<T> hVar) {
                super(0);
                this.f20663c = hVar;
            }

            /* renamed from: b */
            public final Collection<rc.f<?>> invoke() {
                h<T> hVar = this.f20663c;
                return hVar.F(hVar.X(), j.c.DECLARED);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lrc/f;", "kotlin.jvm.PlatformType", "b", "()Ljava/util/Collection;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: rc.h$a$h */
        /* loaded from: classes.dex */
        public static final class C0335h extends hc.v implements gc.a<Collection<? extends rc.f<?>>> {

            /* renamed from: c */
            final /* synthetic */ h<T> f20664c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0335h(h<T> hVar) {
                super(0);
                this.f20664c = hVar;
            }

            /* renamed from: b */
            public final Collection<rc.f<?>> invoke() {
                h<T> hVar = this.f20664c;
                return hVar.F(hVar.Y(), j.c.DECLARED);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "T", "Lxc/e;", "kotlin.jvm.PlatformType", "b", "()Lxc/e;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class i extends hc.v implements gc.a<xc.e> {

            /* renamed from: c */
            final /* synthetic */ h<T> f20665c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(h<T> hVar) {
                super(0);
                this.f20665c = hVar;
            }

            /* renamed from: b */
            public final xc.e invoke() {
                wd.b T = this.f20665c.T();
                cd.k a10 = this.f20665c.U().invoke().a();
                xc.e b10 = T.k() ? a10.a().b(T) : xc.x.a(a10.b(), T);
                if (b10 != null) {
                    return b10;
                }
                this.f20665c.Z();
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lrc/f;", "kotlin.jvm.PlatformType", "b", "()Ljava/util/Collection;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class j extends hc.v implements gc.a<Collection<? extends rc.f<?>>> {

            /* renamed from: c */
            final /* synthetic */ h<T> f20666c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(h<T> hVar) {
                super(0);
                this.f20666c = hVar;
            }

            /* renamed from: b */
            public final Collection<rc.f<?>> invoke() {
                h<T> hVar = this.f20666c;
                return hVar.F(hVar.X(), j.c.INHERITED);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lrc/f;", "kotlin.jvm.PlatformType", "b", "()Ljava/util/Collection;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class k extends hc.v implements gc.a<Collection<? extends rc.f<?>>> {

            /* renamed from: c */
            final /* synthetic */ h<T> f20667c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(h<T> hVar) {
                super(0);
                this.f20667c = hVar;
            }

            /* renamed from: b */
            public final Collection<rc.f<?>> invoke() {
                h<T> hVar = this.f20667c;
                return hVar.F(hVar.Y(), j.c.INHERITED);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a6\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u0003 \u0004*\u001a\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lrc/h;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class l extends hc.v implements gc.a<List<? extends h<? extends Object>>> {

            /* renamed from: c */
            final /* synthetic */ h<T>.a f20668c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(h<T>.a aVar) {
                super(0);
                this.f20668c = aVar;
            }

            @Override // gc.a
            public final List<? extends h<? extends Object>> invoke() {
                he.h w02 = this.f20668c.n().w0();
                hc.t.d(w02, "descriptor.unsubstitutedInnerClassesScope");
                Collection a10 = k.a.a(w02, null, null, 3, null);
                ArrayList<xc.m> arrayList = new ArrayList();
                for (T t10 : a10) {
                    if (!ae.d.B((xc.m) t10)) {
                        arrayList.add(t10);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (xc.m mVar : arrayList) {
                    xc.e eVar = mVar instanceof xc.e ? (xc.e) mVar : null;
                    Class<?> p10 = eVar != null ? j0.p(eVar) : null;
                    h hVar = p10 != null ? new h(p10) : null;
                    if (hVar != null) {
                        arrayList2.add(hVar);
                    }
                }
                return arrayList2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", BuildConfig.FLAVOR, "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class m extends hc.v implements gc.a<T> {

            /* renamed from: c */
            final /* synthetic */ h<T>.a f20669c;

            /* renamed from: d */
            final /* synthetic */ h<T> f20670d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            m(h<T>.a aVar, h<T> hVar) {
                super(0);
                this.f20669c = aVar;
                this.f20670d = hVar;
            }

            @Override // gc.a
            public final T invoke() {
                xc.e n10 = this.f20669c.n();
                if (n10.h() != xc.f.OBJECT) {
                    return null;
                }
                T t10 = (T) ((!n10.N() || uc.d.a(uc.c.f23400a, n10)) ? this.f20670d.a().getDeclaredField("INSTANCE") : this.f20670d.a().getEnclosingClass().getDeclaredField(n10.getName().b())).get(null);
                hc.t.c(t10, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return t10;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class n extends hc.v implements gc.a<String> {

            /* renamed from: c */
            final /* synthetic */ h<T> f20671c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(h<T> hVar) {
                super(0);
                this.f20671c = hVar;
            }

            /* renamed from: b */
            public final String invoke() {
                if (this.f20671c.a().isAnonymousClass()) {
                    return null;
                }
                wd.b T = this.f20671c.T();
                if (!T.k()) {
                    return T.b().b();
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003 \u0004*\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lrc/h;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class o extends hc.v implements gc.a<List<? extends h<? extends T>>> {

            /* renamed from: c */
            final /* synthetic */ h<T>.a f20672c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            o(h<T>.a aVar) {
                super(0);
                this.f20672c = aVar;
            }

            @Override // gc.a
            public final List<h<? extends T>> invoke() {
                Collection<xc.e> v10 = this.f20672c.n().v();
                hc.t.d(v10, "descriptor.sealedSubclasses");
                ArrayList arrayList = new ArrayList();
                for (xc.e eVar : v10) {
                    hc.t.c(eVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class<?> p10 = j0.p(eVar);
                    h hVar = p10 != null ? new h(p10) : null;
                    if (hVar != null) {
                        arrayList.add(hVar);
                    }
                }
                return arrayList;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class p extends hc.v implements gc.a<String> {

            /* renamed from: c */
            final /* synthetic */ h<T> f20673c;

            /* renamed from: d */
            final /* synthetic */ h<T>.a f20674d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            p(h<T> hVar, h<T>.a aVar) {
                super(0);
                this.f20673c = hVar;
                this.f20674d = aVar;
            }

            /* renamed from: b */
            public final String invoke() {
                if (this.f20673c.a().isAnonymousClass()) {
                    return null;
                }
                wd.b T = this.f20673c.T();
                if (T.k()) {
                    return this.f20674d.f(this.f20673c.a());
                }
                String b10 = T.j().b();
                hc.t.d(b10, "classId.shortClassName.asString()");
                return b10;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lrc/y;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class q extends hc.v implements gc.a<List<? extends y>> {

            /* renamed from: c */
            final /* synthetic */ h<T>.a f20675c;

            /* renamed from: d */
            final /* synthetic */ h<T> f20676d;

            @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "Ljava/lang/reflect/Type;", "b", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 7, 1})
            /* renamed from: rc.h$a$q$a */
            /* loaded from: classes.dex */
            public static final class C0336a extends hc.v implements gc.a<Type> {

                /* renamed from: c */
                final /* synthetic */ oe.e0 f20677c;

                /* renamed from: d */
                final /* synthetic */ h<T>.a f20678d;

                /* renamed from: q */
                final /* synthetic */ h<T> f20679q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0336a(oe.e0 e0Var, h<T>.a aVar, h<T> hVar) {
                    super(0);
                    this.f20677c = e0Var;
                    this.f20678d = aVar;
                    this.f20679q = hVar;
                }

                /* renamed from: b */
                public final Type invoke() {
                    int I;
                    Type type;
                    String str;
                    xc.h z10 = this.f20677c.W0().z();
                    if (!(z10 instanceof xc.e)) {
                        throw new b0("Supertype not a class: " + z10);
                    }
                    Class<?> p10 = j0.p((xc.e) z10);
                    if (p10 == null) {
                        throw new b0("Unsupported superclass of " + this.f20678d + ": " + z10);
                    }
                    if (hc.t.a(this.f20679q.a().getSuperclass(), p10)) {
                        type = this.f20679q.a().getGenericSuperclass();
                        str = "{\n                      …ass\n                    }";
                    } else {
                        Class<?>[] interfaces = this.f20679q.a().getInterfaces();
                        hc.t.d(interfaces, "jClass.interfaces");
                        I = ub.m.I(interfaces, p10);
                        if (I < 0) {
                            throw new b0("No superclass of " + this.f20678d + " in Java reflection for " + z10);
                        }
                        type = this.f20679q.a().getGenericInterfaces()[I];
                        str = "{\n                      …ex]\n                    }";
                    }
                    hc.t.d(type, str);
                    return type;
                }
            }

            @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "Ljava/lang/reflect/Type;", "b", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 7, 1})
            /* loaded from: classes.dex */
            public static final class b extends hc.v implements gc.a<Type> {

                /* renamed from: c */
                public static final b f20680c = new b();

                b() {
                    super(0);
                }

                /* renamed from: b */
                public final Type invoke() {
                    return Object.class;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            q(h<T>.a aVar, h<T> hVar) {
                super(0);
                this.f20675c = aVar;
                this.f20676d = hVar;
            }

            @Override // gc.a
            public final List<? extends y> invoke() {
                boolean z10;
                Collection<oe.e0> l10 = this.f20675c.n().r().l();
                hc.t.d(l10, "descriptor.typeConstructor.supertypes");
                ArrayList<y> arrayList = new ArrayList(l10.size());
                h<T>.a aVar = this.f20675c;
                h<T> hVar = this.f20676d;
                for (oe.e0 e0Var : l10) {
                    hc.t.d(e0Var, "kotlinType");
                    arrayList.add(new y(e0Var, new C0336a(e0Var, aVar, hVar)));
                }
                if (!uc.h.t0(this.f20675c.n())) {
                    boolean z11 = false;
                    if (!arrayList.isEmpty()) {
                        for (y yVar : arrayList) {
                            xc.f h10 = ae.d.e(yVar.l()).h();
                            hc.t.d(h10, "getClassDescriptorForType(it.type).kind");
                            if (h10 == xc.f.INTERFACE || h10 == xc.f.ANNOTATION_CLASS) {
                                z10 = true;
                                continue;
                            } else {
                                z10 = false;
                                continue;
                            }
                            if (!z10) {
                                break;
                            }
                        }
                    }
                    z11 = true;
                    if (z11) {
                        m0 i10 = ee.a.f(this.f20675c.n()).i();
                        hc.t.d(i10, "descriptor.builtIns.anyType");
                        arrayList.add(new y(i10, b.f20680c));
                    }
                }
                return ye.a.c(arrayList);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lrc/z;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class r extends hc.v implements gc.a<List<? extends z>> {

            /* renamed from: c */
            final /* synthetic */ h<T>.a f20681c;

            /* renamed from: d */
            final /* synthetic */ h<T> f20682d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            r(h<T>.a aVar, h<T> hVar) {
                super(0);
                this.f20681c = aVar;
                this.f20682d = hVar;
            }

            @Override // gc.a
            public final List<? extends z> invoke() {
                int s10;
                List<f1> A = this.f20681c.n().A();
                hc.t.d(A, "descriptor.declaredTypeParameters");
                h<T> hVar = this.f20682d;
                s10 = ub.v.s(A, 10);
                ArrayList arrayList = new ArrayList(s10);
                for (f1 f1Var : A) {
                    hc.t.d(f1Var, "descriptor");
                    arrayList.add(new z(hVar, f1Var));
                }
                return arrayList;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super();
            h.this = r2;
            this.f20638d = d0.c(new i(r2));
            this.f20640f = d0.c(new p(r2, this));
            this.f20641g = d0.c(new n(r2));
            this.f20642h = d0.c(new e(r2));
            this.f20644j = d0.b(new m(this, r2));
            this.f20645k = d0.c(new r(this, r2));
            this.f20646l = d0.c(new q(this, r2));
            this.f20648n = d0.c(new g(r2));
            this.f20649o = d0.c(new C0335h(r2));
            this.f20650p = d0.c(new j(r2));
            this.f20651q = d0.c(new k(r2));
        }

        public final String f(Class<?> cls) {
            Method enclosingMethod;
            String I0;
            String str;
            String J0;
            String simpleName = cls.getSimpleName();
            if (cls.getEnclosingMethod() != null) {
                hc.t.d(simpleName, "name");
                str = enclosingMethod.getName() + '$';
            } else {
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                hc.t.d(simpleName, "name");
                if (enclosingConstructor == null) {
                    I0 = bf.y.I0(simpleName, '$', null, 2, null);
                    return I0;
                }
                str = enclosingConstructor.getName() + '$';
            }
            J0 = bf.y.J0(simpleName, str, null, 2, null);
            return J0;
        }

        public final Collection<rc.f<?>> m() {
            T b10 = this.f20649o.b(this, f20637w[11]);
            hc.t.d(b10, "<get-declaredStaticMembers>(...)");
            return (Collection) b10;
        }

        public final Collection<rc.f<?>> o() {
            T b10 = this.f20650p.b(this, f20637w[12]);
            hc.t.d(b10, "<get-inheritedNonStaticMembers>(...)");
            return (Collection) b10;
        }

        public final Collection<rc.f<?>> p() {
            T b10 = this.f20651q.b(this, f20637w[13]);
            hc.t.d(b10, "<get-inheritedStaticMembers>(...)");
            return (Collection) b10;
        }

        public final Collection<rc.f<?>> g() {
            T b10 = this.f20655u.b(this, f20637w[17]);
            hc.t.d(b10, "<get-allMembers>(...)");
            return (Collection) b10;
        }

        public final Collection<rc.f<?>> h() {
            T b10 = this.f20652r.b(this, f20637w[14]);
            hc.t.d(b10, "<get-allNonStaticMembers>(...)");
            return (Collection) b10;
        }

        public final Collection<rc.f<?>> i() {
            T b10 = this.f20653s.b(this, f20637w[15]);
            hc.t.d(b10, "<get-allStaticMembers>(...)");
            return (Collection) b10;
        }

        public final Collection<oc.g<T>> j() {
            T b10 = this.f20642h.b(this, f20637w[4]);
            hc.t.d(b10, "<get-constructors>(...)");
            return (Collection) b10;
        }

        public final Collection<rc.f<?>> k() {
            T b10 = this.f20654t.b(this, f20637w[16]);
            hc.t.d(b10, "<get-declaredMembers>(...)");
            return (Collection) b10;
        }

        public final Collection<rc.f<?>> l() {
            T b10 = this.f20648n.b(this, f20637w[10]);
            hc.t.d(b10, "<get-declaredNonStaticMembers>(...)");
            return (Collection) b10;
        }

        public final xc.e n() {
            T b10 = this.f20638d.b(this, f20637w[0]);
            hc.t.d(b10, "<get-descriptor>(...)");
            return (xc.e) b10;
        }

        public final Collection<oc.d<?>> q() {
            T b10 = this.f20643i.b(this, f20637w[5]);
            hc.t.d(b10, "<get-nestedClasses>(...)");
            return (Collection) b10;
        }

        public final T r() {
            return this.f20644j.b(this, f20637w[6]);
        }

        public final String s() {
            return (String) this.f20641g.b(this, f20637w[3]);
        }

        public final List<oc.d<? extends T>> t() {
            T b10 = this.f20647m.b(this, f20637w[9]);
            hc.t.d(b10, "<get-sealedSubclasses>(...)");
            return (List) b10;
        }

        public final String u() {
            return (String) this.f20640f.b(this, f20637w[2]);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20683a;

        static {
            int[] iArr = new int[a.EnumC0322a.values().length];
            iArr[a.EnumC0322a.FILE_FACADE.ordinal()] = 1;
            iArr[a.EnumC0322a.MULTIFILE_CLASS.ordinal()] = 2;
            iArr[a.EnumC0322a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            iArr[a.EnumC0322a.SYNTHETIC_CLASS.ordinal()] = 4;
            iArr[a.EnumC0322a.UNKNOWN.ordinal()] = 5;
            iArr[a.EnumC0322a.CLASS.ordinal()] = 6;
            f20683a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e \u0004*\u000e\u0018\u00010\u0002R\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002R\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", "Lrc/h$a;", "Lrc/h;", "kotlin.jvm.PlatformType", "b", "()Lrc/h$a;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.a<h<T>.a> {

        /* renamed from: c */
        final /* synthetic */ h<T> f20684c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h<T> hVar) {
            super(0);
            this.f20684c = hVar;
        }

        /* renamed from: b */
        public final h<T>.a invoke() {
            return new a();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class d extends hc.p implements gc.p<ke.w, rd.n, u0> {
        public static final d Y3 = new d();

        d() {
            super(2);
        }

        @Override // hc.h
        public final oc.f e0() {
            return hc.k0.b(ke.w.class);
        }

        @Override // hc.h
        public final String g0() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "loadProperty";
        }

        /* renamed from: i0 */
        public final u0 u(ke.w wVar, rd.n nVar) {
            hc.t.e(wVar, "p0");
            hc.t.e(nVar, "p1");
            return wVar.l(nVar);
        }
    }

    public h(Class<T> cls) {
        hc.t.e(cls, "jClass");
        this.f20635q = cls;
        d0.b<h<T>.a> b10 = d0.b(new c(this));
        hc.t.d(b10, "lazy { Data() }");
        this.f20636x = b10;
    }

    public final wd.b T() {
        return g0.f20633a.c(a());
    }

    public final Void Z() {
        qd.a a10;
        cd.f a11 = cd.f.f6434c.a(a());
        a.EnumC0322a c10 = (a11 == null || (a10 = a11.a()) == null) ? null : a10.c();
        switch (c10 == null ? -1 : b.f20683a[c10.ordinal()]) {
            case -1:
            case 6:
                throw new b0("Unresolved class: " + a());
            case 0:
            default:
                throw new tb.p();
            case 1:
            case 2:
            case 3:
                throw new UnsupportedOperationException("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: " + a());
            case 4:
                throw new UnsupportedOperationException("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: " + a());
            case 5:
                throw new b0("Unknown class: " + a() + " (kind = " + c10 + ')');
        }
    }

    @Override // oc.d
    public boolean A() {
        return getDescriptor().N();
    }

    @Override // oc.d
    public boolean B(Object obj) {
        Integer c10 = dd.d.c(a());
        if (c10 != null) {
            return q0.i(obj, c10.intValue());
        }
        Class g10 = dd.d.g(a());
        if (g10 == null) {
            g10 = a();
        }
        return g10.isInstance(obj);
    }

    @Override // rc.j
    public Collection<xc.l> C() {
        List h10;
        xc.e descriptor = getDescriptor();
        if (descriptor.h() == xc.f.INTERFACE || descriptor.h() == xc.f.OBJECT) {
            h10 = ub.u.h();
            return h10;
        }
        Collection<xc.d> k10 = descriptor.k();
        hc.t.d(k10, "descriptor.constructors");
        return k10;
    }

    @Override // rc.j
    public Collection<xc.y> D(wd.f fVar) {
        List o02;
        hc.t.e(fVar, "name");
        he.h X = X();
        fd.d dVar = fd.d.FROM_REFLECTION;
        o02 = ub.c0.o0(X.b(fVar, dVar), Y().b(fVar, dVar));
        return o02;
    }

    @Override // rc.j
    public u0 E(int i10) {
        Class<?> declaringClass;
        if (hc.t.a(a().getSimpleName(), "DefaultImpls") && (declaringClass = a().getDeclaringClass()) != null && declaringClass.isInterface()) {
            oc.d e10 = fc.a.e(declaringClass);
            hc.t.c(e10, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((h) e10).E(i10);
        }
        xc.e descriptor = getDescriptor();
        me.d dVar = descriptor instanceof me.d ? (me.d) descriptor : null;
        if (dVar == null) {
            return null;
        }
        rd.c k12 = dVar.k1();
        i.f<rd.c, List<rd.n>> fVar = ud.a.f23544j;
        hc.t.d(fVar, "classLocalVariable");
        rd.n nVar = (rd.n) td.e.b(k12, fVar, i10);
        if (nVar == null) {
            return null;
        }
        return (u0) j0.h(a(), nVar, dVar.j1().g(), dVar.j1().j(), dVar.m1(), d.Y3);
    }

    @Override // oc.d
    public String G() {
        return this.f20636x.invoke().u();
    }

    @Override // oc.d
    public T I() {
        return this.f20636x.invoke().r();
    }

    @Override // rc.j
    public Collection<u0> J(wd.f fVar) {
        List o02;
        hc.t.e(fVar, "name");
        he.h X = X();
        fd.d dVar = fd.d.FROM_REFLECTION;
        o02 = ub.c0.o0(X.a(fVar, dVar), Y().a(fVar, dVar));
        return o02;
    }

    public final d0.b<h<T>.a> U() {
        return this.f20636x;
    }

    /* renamed from: V */
    public xc.e getDescriptor() {
        return this.f20636x.invoke().n();
    }

    public final he.h X() {
        return getDescriptor().u().z();
    }

    public final he.h Y() {
        he.h B0 = getDescriptor().B0();
        hc.t.d(B0, "descriptor.staticScope");
        return B0;
    }

    @Override // hc.j
    public Class<T> a() {
        return this.f20635q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && hc.t.a(fc.a.c(this), fc.a.c((oc.d) obj));
    }

    public int hashCode() {
        return fc.a.c(this).hashCode();
    }

    @Override // oc.d
    public Collection<oc.g<T>> k() {
        return this.f20636x.invoke().j();
    }

    public String toString() {
        String str;
        String D;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("class ");
        wd.b T = T();
        wd.c h10 = T.h();
        hc.t.d(h10, "classId.packageFqName");
        if (h10.d()) {
            str = BuildConfig.FLAVOR;
        } else {
            str = h10.b() + '.';
        }
        String b10 = T.i().b();
        hc.t.d(b10, "classId.relativeClassName.asString()");
        D = bf.x.D(b10, '.', '$', false, 4, null);
        sb2.append(str + D);
        return sb2.toString();
    }

    @Override // oc.d
    public List<oc.d<? extends T>> v() {
        return this.f20636x.invoke().t();
    }

    @Override // oc.f
    public Collection<oc.c<?>> x() {
        return this.f20636x.invoke().g();
    }

    @Override // oc.d
    public String y() {
        return this.f20636x.invoke().s();
    }

    @Override // oc.d
    public Collection<oc.d<?>> z() {
        return this.f20636x.invoke().q();
    }
}
