package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface n1 extends AutoCloseable {

    /* loaded from: classes.dex */
    public interface a {
        ByteBuffer c();

        int d();

        int e();
    }

    void D(Rect rect);

    k1 I();

    int a();

    @Override // java.lang.AutoCloseable
    void close();

    int d();

    int getFormat();

    Image o0();

    @SuppressLint({"ArrayReturn"})
    a[] w();
}
