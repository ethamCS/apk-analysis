package androidx.lifecycle;

import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import e1.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/u0;", "Landroidx/lifecycle/s0;", "VM", "Lkotlin/Lazy;", BuildConfig.FLAVOR, "c", "y", "Landroidx/lifecycle/s0;", "cached", "a", "()Landroidx/lifecycle/s0;", "value", "Loc/d;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/y0;", "storeProducer", "Landroidx/lifecycle/v0$b;", "factoryProducer", "Le1/a;", "extrasProducer", "<init>", "(Loc/d;Lgc/a;Lgc/a;Lgc/a;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class u0<VM extends s0> implements Lazy<VM> {

    /* renamed from: c */
    private final oc.d<VM> f4380c;

    /* renamed from: d */
    private final gc.a<y0> f4381d;

    /* renamed from: q */
    private final gc.a<v0.b> f4382q;

    /* renamed from: x */
    private final gc.a<e1.a> f4383x;

    /* renamed from: y */
    private VM f4384y;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Le1/a$a;", "b", "()Le1/a$a;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<a.C0136a> {

        /* renamed from: c */
        public static final a f4385c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final a.C0136a invoke() {
            return a.C0136a.f9341b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u0(oc.d<VM> dVar, gc.a<? extends y0> aVar, gc.a<? extends v0.b> aVar2) {
        this(dVar, aVar, aVar2, null, 8, null);
        hc.t.e(dVar, "viewModelClass");
        hc.t.e(aVar, "storeProducer");
        hc.t.e(aVar2, "factoryProducer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u0(oc.d<VM> dVar, gc.a<? extends y0> aVar, gc.a<? extends v0.b> aVar2, gc.a<? extends e1.a> aVar3) {
        hc.t.e(dVar, "viewModelClass");
        hc.t.e(aVar, "storeProducer");
        hc.t.e(aVar2, "factoryProducer");
        hc.t.e(aVar3, "extrasProducer");
        this.f4380c = dVar;
        this.f4381d = aVar;
        this.f4382q = aVar2;
        this.f4383x = aVar3;
    }

    public /* synthetic */ u0(oc.d dVar, gc.a aVar, gc.a aVar2, gc.a aVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, aVar, aVar2, (i10 & 8) != 0 ? a.f4385c : aVar3);
    }

    /* renamed from: a */
    public VM getValue() {
        VM vm = this.f4384y;
        if (vm == null) {
            VM vm2 = (VM) new v0(this.f4381d.invoke(), this.f4382q.invoke(), this.f4383x.invoke()).a(fc.a.b(this.f4380c));
            this.f4384y = vm2;
            return vm2;
        }
        return vm;
    }

    @Override // kotlin.Lazy
    public boolean c() {
        return this.f4384y != null;
    }
}
