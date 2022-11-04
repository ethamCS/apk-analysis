package jf;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.j;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH&J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fH&J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eH&J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H&J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0013H&J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0015H&J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0017H&J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0019H&J;\u0010\u001e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010 \u001a\u00020\u0004\"\b\b\u0000\u0010\u001b*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H'¢\u0006\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Ljf/d;", BuildConfig.FLAVOR, "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Ltb/e0;", "c", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "p", "value", "B", BuildConfig.FLAVOR, "g", BuildConfig.FLAVOR, "u", BuildConfig.FLAVOR, "C", "z", BuildConfig.FLAVOR, "A", BuildConfig.FLAVOR, "n", BuildConfig.FLAVOR, "v", BuildConfig.FLAVOR, "E", "T", "Lkotlinx/serialization/j;", "serializer", "t", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/j;Ljava/lang/Object;)V", "m", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface d {
    void A(SerialDescriptor serialDescriptor, int i10, long j10);

    void B(SerialDescriptor serialDescriptor, int i10, boolean z10);

    void C(SerialDescriptor serialDescriptor, int i10, char c10);

    void E(SerialDescriptor serialDescriptor, int i10, String str);

    void c(SerialDescriptor serialDescriptor);

    void g(SerialDescriptor serialDescriptor, int i10, byte b10);

    <T> void m(SerialDescriptor serialDescriptor, int i10, j<? super T> jVar, T t10);

    void n(SerialDescriptor serialDescriptor, int i10, float f10);

    boolean p(SerialDescriptor serialDescriptor, int i10);

    <T> void t(SerialDescriptor serialDescriptor, int i10, j<? super T> jVar, T t10);

    void u(SerialDescriptor serialDescriptor, int i10, short s10);

    void v(SerialDescriptor serialDescriptor, int i10, double d10);

    void z(SerialDescriptor serialDescriptor, int i10, int i11);
}
