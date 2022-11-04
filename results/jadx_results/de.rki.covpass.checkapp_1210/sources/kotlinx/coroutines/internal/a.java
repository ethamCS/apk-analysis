package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/internal/a;", BuildConfig.FLAVOR, "T", "Ltb/e0;", "b", "element", "a", "(Ljava/lang/Object;)V", "d", "()Ljava/lang/Object;", BuildConfig.FLAVOR, "[Ljava/lang/Object;", "elements", BuildConfig.FLAVOR, "I", "head", "c", "tail", BuildConfig.FLAVOR, "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class a<T> {

    /* renamed from: a */
    private Object[] f15403a = new Object[16];

    /* renamed from: b */
    private int f15404b;

    /* renamed from: c */
    private int f15405c;

    private final void b() {
        Object[] objArr = this.f15403a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        ub.l.h(objArr, objArr2, 0, this.f15404b, 0, 10, null);
        Object[] objArr3 = this.f15403a;
        int length2 = objArr3.length;
        int i10 = this.f15404b;
        ub.l.h(objArr3, objArr2, length2 - i10, 0, i10, 4, null);
        this.f15403a = objArr2;
        this.f15404b = 0;
        this.f15405c = length;
    }

    public final void a(T t10) {
        Object[] objArr = this.f15403a;
        int i10 = this.f15405c;
        objArr[i10] = t10;
        int length = (objArr.length - 1) & (i10 + 1);
        this.f15405c = length;
        if (length == this.f15404b) {
            b();
        }
    }

    public final boolean c() {
        return this.f15404b == this.f15405c;
    }

    public final T d() {
        int i10 = this.f15404b;
        if (i10 == this.f15405c) {
            return null;
        }
        Object[] objArr = this.f15403a;
        T t10 = (T) objArr[i10];
        objArr[i10] = null;
        this.f15404b = (i10 + 1) & (objArr.length - 1);
        Objects.requireNonNull(t10, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t10;
    }
}
