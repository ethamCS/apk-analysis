package e1;

import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import gc.l;
import hc.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006J\u0006\u0010\f\u001a\u00020\u000b¨\u0006\u000f"}, d2 = {"Le1/c;", BuildConfig.FLAVOR, "Landroidx/lifecycle/s0;", "T", "Loc/d;", "clazz", "Lkotlin/Function1;", "Le1/a;", "initializer", "Ltb/e0;", "a", "Landroidx/lifecycle/v0$b;", "b", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final List<f<?>> f9343a = new ArrayList();

    public final <T extends s0> void a(oc.d<T> dVar, l<? super a, ? extends T> lVar) {
        t.e(dVar, "clazz");
        t.e(lVar, "initializer");
        this.f9343a.add(new f<>(fc.a.b(dVar), lVar));
    }

    public final v0.b b() {
        Object[] array = this.f9343a.toArray(new f[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        f[] fVarArr = (f[]) array;
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
