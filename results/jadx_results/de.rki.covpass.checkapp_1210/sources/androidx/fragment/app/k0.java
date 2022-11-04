package androidx.fragment.app;

import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import kotlin.Lazy;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aJ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u0007\u001aZ\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u0007¨\u0006\u0011²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/fragment/app/Fragment;", "Loc/d;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/y0;", "storeProducer", "Landroidx/lifecycle/v0$b;", "factoryProducer", "Lkotlin/Lazy;", "a", "Le1/a;", "extrasProducer", "b", "Landroidx/lifecycle/z0;", "owner", "fragment-ktx_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class k0 {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Le1/a;", "b", "()Le1/a;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<e1.a> {

        /* renamed from: c */
        final /* synthetic */ Fragment f4141c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Fragment fragment) {
            super(0);
            this.f4141c = fragment;
        }

        /* renamed from: b */
        public final e1.a invoke() {
            e1.a x10 = this.f4141c.x();
            hc.t.d(x10, "defaultViewModelCreationExtras");
            return x10;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/lifecycle/v0$b;", "b", "()Landroidx/lifecycle/v0$b;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<v0.b> {

        /* renamed from: c */
        final /* synthetic */ Fragment f4142c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Fragment fragment) {
            super(0);
            this.f4142c = fragment;
        }

        /* renamed from: b */
        public final v0.b invoke() {
            v0.b U = this.f4142c.U();
            hc.t.d(U, "defaultViewModelProviderFactory");
            return U;
        }
    }

    public static final /* synthetic */ Lazy a(Fragment fragment, oc.d dVar, gc.a aVar, gc.a aVar2) {
        hc.t.e(fragment, "<this>");
        hc.t.e(dVar, "viewModelClass");
        hc.t.e(aVar, "storeProducer");
        return b(fragment, dVar, aVar, new a(fragment), aVar2);
    }

    public static final <VM extends s0> Lazy<VM> b(Fragment fragment, oc.d<VM> dVar, gc.a<? extends y0> aVar, gc.a<? extends e1.a> aVar2, gc.a<? extends v0.b> aVar3) {
        hc.t.e(fragment, "<this>");
        hc.t.e(dVar, "viewModelClass");
        hc.t.e(aVar, "storeProducer");
        hc.t.e(aVar2, "extrasProducer");
        if (aVar3 == null) {
            aVar3 = new b(fragment);
        }
        return new u0(dVar, aVar, aVar3, aVar2);
    }
}
