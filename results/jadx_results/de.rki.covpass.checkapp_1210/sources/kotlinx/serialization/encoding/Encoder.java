package kotlinx.serialization.encoding;

import hc.t;
import jf.d;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.j;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0004\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0010H&J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0012H&J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0014H&J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0016H&J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000eH&J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018H'J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0018H&J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u000eH\u0016J+\u0010&\u001a\u00020\u0002\"\u0004\b\u0000\u0010#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", BuildConfig.FLAVOR, "Ltb/e0;", "y", "f", BuildConfig.FLAVOR, "value", "l", BuildConfig.FLAVOR, "k", BuildConfig.FLAVOR, "i", BuildConfig.FLAVOR, "x", BuildConfig.FLAVOR, "q", BuildConfig.FLAVOR, "w", BuildConfig.FLAVOR, "s", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "D", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "index", "o", "inlineDescriptor", "r", "descriptor", "Ljf/d;", "b", "collectionSize", "j", "T", "Lkotlinx/serialization/j;", "serializer", "e", "(Lkotlinx/serialization/j;Ljava/lang/Object;)V", "Lnf/d;", "a", "()Lnf/d;", "serializersModule", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface Encoder {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static d a(Encoder encoder, SerialDescriptor serialDescriptor, int i10) {
            t.e(serialDescriptor, "descriptor");
            return encoder.b(serialDescriptor);
        }

        public static void b(Encoder encoder) {
        }

        public static <T> void c(Encoder encoder, j<? super T> jVar, T t10) {
            t.e(jVar, "serializer");
            if (jVar.getDescriptor().o()) {
                encoder.e(jVar, t10);
            } else if (t10 == null) {
                encoder.f();
            } else {
                encoder.y();
                encoder.e(jVar, t10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> void d(Encoder encoder, j<? super T> jVar, T t10) {
            t.e(jVar, "serializer");
            jVar.serialize(encoder, t10);
        }
    }

    void D(String str);

    nf.d a();

    d b(SerialDescriptor serialDescriptor);

    <T> void e(j<? super T> jVar, T t10);

    void f();

    void h(double d10);

    void i(short s10);

    d j(SerialDescriptor serialDescriptor, int i10);

    void k(byte b10);

    void l(boolean z10);

    void o(SerialDescriptor serialDescriptor, int i10);

    void q(int i10);

    Encoder r(SerialDescriptor serialDescriptor);

    void s(float f10);

    void w(long j10);

    void x(char c10);

    void y();
}
