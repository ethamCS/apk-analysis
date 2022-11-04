package rc;

import kotlin.Lazy;
import kotlin.Metadata;
import oc.l;
import org.conscrypt.BuildConfig;
import rc.d0;
import rc.w;
import xc.u0;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0017B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B+\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0016J\u000f\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, d2 = {"Lrc/r;", "V", "Loc/l;", "Lrc/w;", "get", "()Ljava/lang/Object;", "invoke", "Lrc/r$a;", "S", "()Lrc/r$a;", "getter", "Lrc/j;", "container", "Lxc/u0;", "descriptor", "<init>", "(Lrc/j;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", BuildConfig.FLAVOR, "name", "signature", BuildConfig.FLAVOR, "boundReceiver", "(Lrc/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class r<V> extends w<V> implements oc.l<V> {

    /* renamed from: a4 */
    private final d0.b<a<V>> f20739a4;

    /* renamed from: b4 */
    private final Lazy<Object> f20740b4;

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lrc/r$a;", "R", "Lrc/w$c;", "Loc/l$a;", "invoke", "()Ljava/lang/Object;", "Lrc/r;", "property", "Lrc/r;", "O", "()Lrc/r;", "<init>", "(Lrc/r;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a<R> extends w.c<R> implements l.a<R> {
        private final r<R> W3;

        /* JADX WARN: Multi-variable type inference failed */
        public a(r<? extends R> rVar) {
            hc.t.e(rVar, "property");
            this.W3 = rVar;
        }

        /* renamed from: O */
        public r<R> a() {
            return this.W3;
        }

        @Override // gc.a
        public R invoke() {
            return a().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0002*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lrc/r$a;", "kotlin.jvm.PlatformType", "b", "()Lrc/r$a;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<a<? extends V>> {

        /* renamed from: c */
        final /* synthetic */ r<V> f20741c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(r<? extends V> rVar) {
            super(0);
            this.f20741c = rVar;
        }

        /* renamed from: b */
        public final a<V> invoke() {
            return new a<>(this.f20741c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "V", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.a<Object> {

        /* renamed from: c */
        final /* synthetic */ r<V> f20742c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(r<? extends V> rVar) {
            super(0);
            this.f20742c = rVar;
        }

        @Override // gc.a
        public final Object invoke() {
            r<V> rVar = this.f20742c;
            return rVar.L(rVar.J(), null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(j jVar, String str, String str2, Object obj) {
        super(jVar, str, str2, obj);
        Lazy<Object> b10;
        hc.t.e(jVar, "container");
        hc.t.e(str, "name");
        hc.t.e(str2, "signature");
        d0.b<a<V>> b11 = d0.b(new b(this));
        hc.t.d(b11, "lazy { Getter(this) }");
        this.f20739a4 = b11;
        b10 = tb.m.b(tb.o.PUBLICATION, new c(this));
        this.f20740b4 = b10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(j jVar, u0 u0Var) {
        super(jVar, u0Var);
        Lazy<Object> b10;
        hc.t.e(jVar, "container");
        hc.t.e(u0Var, "descriptor");
        d0.b<a<V>> b11 = d0.b(new b(this));
        hc.t.d(b11, "lazy { Getter(this) }");
        this.f20739a4 = b11;
        b10 = tb.m.b(tb.o.PUBLICATION, new c(this));
        this.f20740b4 = b10;
    }

    /* renamed from: S */
    public a<V> i() {
        a<V> invoke = this.f20739a4.invoke();
        hc.t.d(invoke, "_getter()");
        return invoke;
    }

    @Override // oc.l
    public V get() {
        return i().g(new Object[0]);
    }

    @Override // gc.a
    public V invoke() {
        return get();
    }
}
