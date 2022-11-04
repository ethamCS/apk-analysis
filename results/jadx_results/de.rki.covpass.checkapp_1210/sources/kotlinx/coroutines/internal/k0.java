package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.z2;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR$\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/internal/k0;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/z2;", "element", "value", "Ltb/e0;", "a", "Lxb/g;", "context", "b", BuildConfig.FLAVOR, "[Ljava/lang/Object;", "values", "c", "[Lkotlinx/coroutines/z2;", "elements", BuildConfig.FLAVOR, "d", "I", "i", "n", "<init>", "(Lxb/g;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a */
    public final xb.g f15436a;

    /* renamed from: b */
    private final Object[] f15437b;

    /* renamed from: c */
    private final z2<Object>[] f15438c;

    /* renamed from: d */
    private int f15439d;

    public k0(xb.g gVar, int i10) {
        this.f15436a = gVar;
        this.f15437b = new Object[i10];
        this.f15438c = new z2[i10];
    }

    public final void a(z2<?> z2Var, Object obj) {
        Object[] objArr = this.f15437b;
        int i10 = this.f15439d;
        objArr[i10] = obj;
        z2<Object>[] z2VarArr = this.f15438c;
        this.f15439d = i10 + 1;
        z2VarArr[i10] = z2Var;
    }

    public final void b(xb.g gVar) {
        int length = this.f15438c.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                z2<Object> z2Var = this.f15438c[length];
                hc.t.b(z2Var);
                z2Var.z0(gVar, this.f15437b[length]);
                if (i10 < 0) {
                    return;
                }
                length = i10;
            }
        }
    }
}
