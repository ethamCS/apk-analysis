package e1;

import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\"\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Le1/b;", "Landroidx/lifecycle/v0$b;", "Landroidx/lifecycle/s0;", "T", "Ljava/lang/Class;", "modelClass", "Le1/a;", "extras", "b", "(Ljava/lang/Class;Le1/a;)Landroidx/lifecycle/s0;", BuildConfig.FLAVOR, "Le1/f;", "initializers", "<init>", "([Le1/f;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b implements v0.b {

    /* renamed from: a */
    private final f<?>[] f9342a;

    public b(f<?>... fVarArr) {
        t.e(fVarArr, "initializers");
        this.f9342a = fVarArr;
    }

    @Override // androidx.lifecycle.v0.b
    public /* synthetic */ s0 a(Class cls) {
        return w0.a(this, cls);
    }

    @Override // androidx.lifecycle.v0.b
    public <T extends s0> T b(Class<T> cls, a aVar) {
        f<?>[] fVarArr;
        t.e(cls, "modelClass");
        t.e(aVar, "extras");
        T t10 = null;
        for (f<?> fVar : this.f9342a) {
            if (t.a(fVar.a(), cls)) {
                Object invoke = fVar.b().invoke(aVar);
                t10 = invoke instanceof s0 ? (T) invoke : null;
            }
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
