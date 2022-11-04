package rc;

import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import rc.d0;
import rc.w;
import xc.u0;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\b\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\tR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lrc/t;", "D", "E", "V", BuildConfig.FLAVOR, "Lrc/w;", "receiver1", "receiver2", "S", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "u", "Lrc/t$a;", "T", "()Lrc/t$a;", "getter", "Lrc/j;", "container", "Lxc/u0;", "descriptor", "<init>", "(Lrc/j;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class t<D, E, V> extends w<V> implements gc.p {

    /* renamed from: a4 */
    private final d0.b<a<D, E, V>> f20747a4;

    /* renamed from: b4 */
    private final Lazy<Member> f20748b4;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\b\u001a\u00028\u00052\u0006\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0007\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR,\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lrc/t$a;", "D", "E", "V", "Lrc/w$c;", BuildConfig.FLAVOR, "receiver1", "receiver2", "u", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lrc/t;", "property", "Lrc/t;", "O", "()Lrc/t;", "<init>", "(Lrc/t;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a<D, E, V> extends w.c<V> implements gc.p {
        private final t<D, E, V> W3;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t<D, E, ? extends V> tVar) {
            hc.t.e(tVar, "property");
            this.W3 = tVar;
        }

        /* renamed from: O */
        public t<D, E, V> a() {
            return this.W3;
        }

        @Override // gc.p
        public V u(D d10, E e10) {
            return a().S(d10, e10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(j jVar, u0 u0Var) {
        super(jVar, u0Var);
        Lazy<Member> b10;
        hc.t.e(jVar, "container");
        hc.t.e(u0Var, "descriptor");
        d0.b<a<D, E, V>> b11 = d0.b(new u(this));
        hc.t.d(b11, "lazy { Getter(this) }");
        this.f20747a4 = b11;
        b10 = tb.m.b(tb.o.PUBLICATION, new v(this));
        this.f20748b4 = b10;
    }

    public V S(D d10, E e10) {
        return i().g(d10, e10);
    }

    /* renamed from: T */
    public a<D, E, V> i() {
        a<D, E, V> invoke = this.f20747a4.invoke();
        hc.t.d(invoke, "_getter()");
        return invoke;
    }

    @Override // gc.p
    public V u(D d10, E e10) {
        return S(d10, e10);
    }
}
