package nf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.j;
import org.conscrypt.BuildConfig;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H'J9\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00028\u0000H'¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0010\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH'J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H'\u0082\u0001\u0001\u0018¨\u0006\u0019"}, d2 = {"Lnf/d;", BuildConfig.FLAVOR, "T", "Loc/d;", "kClass", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "b", "baseClass", "value", "Lkotlinx/serialization/j;", "e", "(Loc/d;Ljava/lang/Object;)Lkotlinx/serialization/j;", BuildConfig.FLAVOR, "serializedClassName", "Lkotlinx/serialization/b;", "d", "Lnf/f;", "collector", "Ltb/e0;", "a", "<init>", "()V", "Lnf/b;", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class d {
    private d() {
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KSerializer c(d dVar, oc.d dVar2, List list, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                list = u.h();
            }
            return dVar.b(dVar2, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    public abstract void a(f fVar);

    public abstract <T> KSerializer<T> b(oc.d<T> dVar, List<? extends KSerializer<?>> list);

    public abstract <T> kotlinx.serialization.b<? extends T> d(oc.d<? super T> dVar, String str);

    public abstract <T> j<T> e(oc.d<? super T> dVar, T t10);
}
