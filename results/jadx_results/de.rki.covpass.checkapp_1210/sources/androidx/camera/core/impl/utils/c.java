package androidx.camera.core.impl.utils;

import android.util.Size;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class c implements Comparator<Size> {

    /* renamed from: c */
    private boolean f2325c;

    public c() {
        this(false);
    }

    public c(boolean z10) {
        this.f2325c = z10;
    }

    /* renamed from: a */
    public int compare(Size size, Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f2325c ? signum * (-1) : signum;
    }
}
