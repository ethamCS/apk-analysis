package e1;

import androidx.lifecycle.s0;
import gc.l;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Le1/f;", "Landroidx/lifecycle/s0;", "T", BuildConfig.FLAVOR, "Ljava/lang/Class;", "clazz", "Ljava/lang/Class;", "a", "()Ljava/lang/Class;", "Lkotlin/Function1;", "Le1/a;", "initializer", "Lgc/l;", "b", "()Lgc/l;", "<init>", "(Ljava/lang/Class;Lgc/l;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f<T extends s0> {

    /* renamed from: a */
    private final Class<T> f9344a;

    /* renamed from: b */
    private final l<a, T> f9345b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Class<T> cls, l<? super a, ? extends T> lVar) {
        t.e(cls, "clazz");
        t.e(lVar, "initializer");
        this.f9344a = cls;
        this.f9345b = lVar;
    }

    public final Class<T> a() {
        return this.f9344a;
    }

    public final l<a, T> b() {
        return this.f9345b;
    }
}
