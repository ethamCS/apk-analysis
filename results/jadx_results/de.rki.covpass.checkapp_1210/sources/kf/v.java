package kf;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkf/v;", "T", "Lkotlinx/serialization/KSerializer;", BuildConfig.FLAVOR, "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "typeParametersSerializers", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface v<T> extends KSerializer<T> {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <T> KSerializer<?>[] a(v<T> vVar) {
            return z0.f15274a;
        }
    }

    KSerializer<?>[] childSerializers();

    KSerializer<?>[] typeParametersSerializers();
}
