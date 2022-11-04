package kotlinx.serialization.encoding;

import hc.t;
import jf.c;
import kotlin.Metadata;
import kotlinx.serialization.b;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nf.d;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H'J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0013H&J\b\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017H'J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0017H&J#\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lkotlinx/serialization/encoding/Decoder;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "l", BuildConfig.FLAVOR, "A", "j", BuildConfig.FLAVOR, "z", BuildConfig.FLAVOR, "B", BuildConfig.FLAVOR, "n", BuildConfig.FLAVOR, "w", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "E", BuildConfig.FLAVOR, "G", BuildConfig.FLAVOR, "D", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "p", "inlineDescriptor", "t", "descriptor", "Ljf/c;", "b", "T", "Lkotlinx/serialization/b;", "deserializer", "y", "(Lkotlinx/serialization/b;)Ljava/lang/Object;", "Lnf/d;", "a", "()Lnf/d;", "serializersModule", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface Decoder {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <T> T a(Decoder decoder, b<T> bVar) {
            t.e(bVar, "deserializer");
            return bVar.deserialize(decoder);
        }
    }

    Void A();

    short B();

    String D();

    float E();

    double G();

    d a();

    c b(SerialDescriptor serialDescriptor);

    long h();

    boolean j();

    boolean l();

    char n();

    int p(SerialDescriptor serialDescriptor);

    Decoder t(SerialDescriptor serialDescriptor);

    int w();

    <T> T y(b<T> bVar);

    byte z();
}
