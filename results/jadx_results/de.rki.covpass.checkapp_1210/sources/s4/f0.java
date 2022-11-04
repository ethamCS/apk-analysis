package s4;

import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0007\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\r\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Ls4/f0;", "T", "Lkc/c;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "result$delegate", "Lkotlin/Lazy;", "d", "()Ljava/lang/Object;", "result", "Lkotlin/Function1;", "block", "<init>", "(Lgc/l;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f0<T> implements kc.c<Object, T> {

    /* renamed from: a */
    private oc.k<?> f21395a;

    /* renamed from: b */
    private final Lazy f21396b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<T> {

        /* renamed from: c */
        final /* synthetic */ gc.l<oc.k<?>, T> f21397c;

        /* renamed from: d */
        final /* synthetic */ f0<T> f21398d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(gc.l<? super oc.k<?>, ? extends T> lVar, f0<T> f0Var) {
            super(0);
            this.f21397c = lVar;
            this.f21398d = f0Var;
        }

        @Override // gc.a
        public final T invoke() {
            gc.l<oc.k<?>, T> lVar = this.f21397c;
            oc.k<?> kVar = ((f0) this.f21398d).f21395a;
            if (kVar == null) {
                hc.t.s("property");
                kVar = null;
            }
            return lVar.invoke(kVar);
        }
    }

    public f0(gc.l<? super oc.k<?>, ? extends T> lVar) {
        Lazy a10;
        hc.t.e(lVar, "block");
        a10 = tb.m.a(new a(lVar, this));
        this.f21396b = a10;
    }

    private final T d() {
        return (T) this.f21396b.getValue();
    }

    @Override // kc.c
    public T a(Object obj, oc.k<?> kVar) {
        hc.t.e(kVar, "property");
        this.f21395a = kVar;
        return d();
    }
}
