package t;

import android.os.Build;
import android.util.Size;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w.h2;
import w.x1;
/* loaded from: classes.dex */
public class o implements x1 {

    /* renamed from: a */
    private static final List<String> f21775a = Arrays.asList("SM-T580", "SM-J710MN", "SM-A320FL", "SM-G570M", "SM-G610F", "SM-G610M");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21776a;

        static {
            int[] iArr = new int[h2.b.values().length];
            f21776a = iArr;
            try {
                iArr[h2.b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21776a[h2.b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21776a[h2.b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static boolean b() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && f21775a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean c() {
        return b();
    }

    public Size a(h2.b bVar) {
        if (b()) {
            int i10 = a.f21776a[bVar.ordinal()];
            if (i10 == 1) {
                return new Size(1920, 1080);
            }
            if (i10 == 2) {
                return new Size(1280, 720);
            }
            if (i10 == 3) {
                return new Size(3264, 1836);
            }
            return null;
        }
        return null;
    }
}
