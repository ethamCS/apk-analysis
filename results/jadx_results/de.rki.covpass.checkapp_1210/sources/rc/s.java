package rc;

import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.Metadata;
import oc.m;
import org.conscrypt.BuildConfig;
import rc.d0;
import rc.w;
import xc.u0;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0019B\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B+\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0011\u0010\u0018J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\u0007R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lrc/s;", "T", "V", "Loc/m;", "Lrc/w;", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "Lrc/s$a;", "S", "()Lrc/s$a;", "getter", "Lrc/j;", "container", "Lxc/u0;", "descriptor", "<init>", "(Lrc/j;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", BuildConfig.FLAVOR, "name", "signature", BuildConfig.FLAVOR, "boundReceiver", "(Lrc/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class s<T, V> extends w<V> implements oc.m<T, V> {

    /* renamed from: a4 */
    private final d0.b<a<T, V>> f20743a4;

    /* renamed from: b4 */
    private final Lazy<Member> f20744b4;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0005\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lrc/s$a;", "T", "V", "Lrc/w$c;", "Loc/m$a;", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lrc/s;", "property", "Lrc/s;", "O", "()Lrc/s;", "<init>", "(Lrc/s;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a<T, V> extends w.c<V> implements m.a<T, V> {
        private final s<T, V> W3;

        /* JADX WARN: Multi-variable type inference failed */
        public a(s<T, ? extends V> sVar) {
            hc.t.e(sVar, "property");
            this.W3 = sVar;
        }

        /* renamed from: O */
        public s<T, V> a() {
            return this.W3;
        }

        @Override // gc.l
        public V invoke(T t10) {
            return a().get(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0003*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "V", "Lrc/s$a;", "kotlin.jvm.PlatformType", "b", "()Lrc/s$a;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<a<T, ? extends V>> {

        /* renamed from: c */
        final /* synthetic */ s<T, V> f20745c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(s<T, ? extends V> sVar) {
            super(0);
            this.f20745c = sVar;
        }

        /* renamed from: b */
        public final a<T, V> invoke() {
            return new a<>(this.f20745c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "V", "Ljava/lang/reflect/Member;", "b", "()Ljava/lang/reflect/Member;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.a<Member> {

        /* renamed from: c */
        final /* synthetic */ s<T, V> f20746c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(s<T, ? extends V> sVar) {
            super(0);
            this.f20746c = sVar;
        }

        /* renamed from: b */
        public final Member invoke() {
            return this.f20746c.J();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(j jVar, String str, String str2, Object obj) {
        super(jVar, str, str2, obj);
        Lazy<Member> b10;
        hc.t.e(jVar, "container");
        hc.t.e(str, "name");
        hc.t.e(str2, "signature");
        d0.b<a<T, V>> b11 = d0.b(new b(this));
        hc.t.d(b11, "lazy { Getter(this) }");
        this.f20743a4 = b11;
        b10 = tb.m.b(tb.o.PUBLICATION, new c(this));
        this.f20744b4 = b10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(j jVar, u0 u0Var) {
        super(jVar, u0Var);
        Lazy<Member> b10;
        hc.t.e(jVar, "container");
        hc.t.e(u0Var, "descriptor");
        d0.b<a<T, V>> b11 = d0.b(new b(this));
        hc.t.d(b11, "lazy { Getter(this) }");
        this.f20743a4 = b11;
        b10 = tb.m.b(tb.o.PUBLICATION, new c(this));
        this.f20744b4 = b10;
    }

    /* renamed from: S */
    public a<T, V> i() {
        a<T, V> invoke = this.f20743a4.invoke();
        hc.t.d(invoke, "_getter()");
        return invoke;
    }

    @Override // oc.m
    public V get(T t10) {
        return i().g(t10);
    }

    @Override // gc.l
    public V invoke(T t10) {
        return get(t10);
    }
}
