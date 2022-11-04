package kotlinx.serialization;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/serialization/a;", "Lkotlinx/serialization/g;", "T", "Lkotlinx/serialization/j;", "serializer", "value", BuildConfig.FLAVOR, "b", "(Lkotlinx/serialization/j;Ljava/lang/Object;)[B", "Lkotlinx/serialization/b;", "deserializer", "bytes", "e", "(Lkotlinx/serialization/b;[B)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface a extends g {
    <T> byte[] b(j<? super T> jVar, T t10);

    <T> T e(b<T> bVar, byte[] bArr);
}