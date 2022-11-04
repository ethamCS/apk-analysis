package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import p000if.i;
import ub.u;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H'R\u001a\u0010\u0012\u001a\u00020\u00048&X§\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0017\u001a\u00020\u00138&X§\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010!\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\b \u0010\u0011\u001a\u0004\b\u001e\u0010\u001fR \u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0011\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "n", "name", "k", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p", "q", BuildConfig.FLAVOR, "r", "l", "()Ljava/lang/String;", "getSerialName$annotations", "()V", "serialName", "Lif/i;", "h", "()Lif/i;", "getKind$annotations", "kind", "o", "()Z", "isNullable$annotations", "isNullable", "isInline", "isInline$annotations", "m", "()I", "getElementsCount$annotations", "elementsCount", "j", "()Ljava/util/List;", "getAnnotations$annotations", "annotations", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface SerialDescriptor {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static List<Annotation> a(SerialDescriptor serialDescriptor) {
            List<Annotation> h10;
            h10 = u.h();
            return h10;
        }

        public static boolean b(SerialDescriptor serialDescriptor) {
            return false;
        }

        public static boolean c(SerialDescriptor serialDescriptor) {
            return false;
        }
    }

    i h();

    boolean isInline();

    List<Annotation> j();

    int k(String str);

    String l();

    int m();

    String n(int i10);

    boolean o();

    List<Annotation> p(int i10);

    SerialDescriptor q(int i10);

    boolean r(int i10);
}
