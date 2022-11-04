package i3;

import android.media.Image;
import android.support.annotation.Nullable;
import c4.n;
/* loaded from: classes.dex */
public class a extends w3.a {
    @Nullable

    /* renamed from: a */
    public static AbstractC0183a f12305a;

    /* renamed from: i3.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0183a<T extends n<T>> {
        void a(Image image, m2.a aVar, n nVar);
    }

    static {
        w3.b.a(a.class);
    }

    public static boolean a(Image image, m2.a aVar, n nVar) {
        AbstractC0183a abstractC0183a = f12305a;
        if (abstractC0183a != null) {
            try {
                abstractC0183a.a(image, aVar, nVar);
                return true;
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }
}
