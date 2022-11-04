package kotlinx.serialization;

import hc.k0;
import hc.t;
import kotlin.Metadata;
import kotlinx.serialization.encoding.Encoder;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {BuildConfig.FLAVOR, "T", "Lkf/b;", "Ljf/c;", "decoder", BuildConfig.FLAVOR, "klassName", "Lkotlinx/serialization/b;", "a", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlinx/serialization/j;", "b", "(Lkf/b;Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/j;", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class f {
    public static final <T> b<? extends T> a(kf.b<T> bVar, jf.c cVar, String str) {
        t.e(bVar, "<this>");
        t.e(cVar, "decoder");
        b<? extends T> c10 = bVar.c(cVar, str);
        if (c10 != null) {
            return c10;
        }
        kf.c.a(str, bVar.e());
        throw new tb.i();
    }

    public static final <T> j<T> b(kf.b<T> bVar, Encoder encoder, T t10) {
        t.e(bVar, "<this>");
        t.e(encoder, "encoder");
        t.e(t10, "value");
        j<T> d10 = bVar.d(encoder, t10);
        if (d10 != null) {
            return d10;
        }
        kf.c.b(k0.b(t10.getClass()), bVar.e());
        throw new tb.i();
    }
}
