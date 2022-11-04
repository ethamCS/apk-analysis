package c0;

import android.media.MediaCodec;
import androidx.camera.core.c2;
import androidx.camera.core.h3;
import b0.f;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import w.r0;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    private final boolean f6125a;

    public c() {
        this.f6125a = b0.a.a(f.class) != null;
    }

    private int b(r0 r0Var) {
        if (r0Var.e() == MediaCodec.class || r0Var.e() == h3.class) {
            return 2;
        }
        return r0Var.e() == c2.class ? 0 : 1;
    }

    public /* synthetic */ int c(r0 r0Var, r0 r0Var2) {
        return b(r0Var) - b(r0Var2);
    }

    public void d(List<r0> list) {
        if (!this.f6125a) {
            return;
        }
        Collections.sort(list, new Comparator() { // from class: c0.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c10;
                c10 = c.this.c((r0) obj, (r0) obj2);
                return c10;
            }
        });
    }
}
