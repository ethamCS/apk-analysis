package rb;

import hc.t;
import java.io.Closeable;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lrb/f;", BuildConfig.FLAVOR, "T", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "c0", "()Ljava/lang/Object;", "instance", "Ltb/e0;", "B0", "(Ljava/lang/Object;)V", "g", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface f<T> extends Closeable {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public static <T> void a(f<T> fVar) {
            t.e(fVar, "this");
            fVar.g();
        }
    }

    void B0(T t10);

    T c0();

    void g();
}
