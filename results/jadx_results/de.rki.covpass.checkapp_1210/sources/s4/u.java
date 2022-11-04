package s4;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\u001a\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0007\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Ls4/u;", "T", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/Function0;", "invalidateOn", "<init>", "(Lgc/l;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class u<T> implements kc.d<Object, T> {

    /* renamed from: a */
    private T f21453a;

    /* renamed from: b */
    private boolean f21454b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<tb.e0> {

        /* renamed from: c */
        final /* synthetic */ u<T> f21455c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u<T> uVar) {
            super(0);
            this.f21455c = uVar;
        }

        public final void b() {
            ((u) this.f21455c).f21453a = null;
            ((u) this.f21455c).f21454b = false;
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ tb.e0 invoke() {
            b();
            return tb.e0.f22152a;
        }
    }

    public u(gc.l<? super gc.a<tb.e0>, ? extends Object> lVar) {
        hc.t.e(lVar, "invalidateOn");
        lVar.invoke(new a(this));
    }

    @Override // kc.d, kc.c
    public T a(Object obj, oc.k<?> kVar) {
        hc.t.e(kVar, "property");
        if (this.f21454b) {
            return this.f21453a;
        }
        throw new IllegalStateException("The property is not set. Maybe it was disposed?");
    }

    @Override // kc.d
    public void b(Object obj, oc.k<?> kVar, T t10) {
        hc.t.e(kVar, "property");
        this.f21453a = t10;
        this.f21454b = true;
    }
}
