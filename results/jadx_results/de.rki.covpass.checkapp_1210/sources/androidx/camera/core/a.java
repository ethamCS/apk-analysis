package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.n1;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
final class a implements n1 {

    /* renamed from: c */
    private final Image f2083c;

    /* renamed from: d */
    private final C0018a[] f2084d;

    /* renamed from: q */
    private final k1 f2085q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.a$a */
    /* loaded from: classes.dex */
    public static final class C0018a implements n1.a {

        /* renamed from: a */
        private final Image.Plane f2086a;

        C0018a(Image.Plane plane) {
            this.f2086a = plane;
        }

        @Override // androidx.camera.core.n1.a
        public synchronized ByteBuffer c() {
            return this.f2086a.getBuffer();
        }

        @Override // androidx.camera.core.n1.a
        public synchronized int d() {
            return this.f2086a.getRowStride();
        }

        @Override // androidx.camera.core.n1.a
        public synchronized int e() {
            return this.f2086a.getPixelStride();
        }
    }

    public a(Image image) {
        this.f2083c = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f2084d = new C0018a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f2084d[i10] = new C0018a(planes[i10]);
            }
        } else {
            this.f2084d = new C0018a[0];
        }
        this.f2085q = q1.f(w.j2.a(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.n1
    public synchronized void D(Rect rect) {
        this.f2083c.setCropRect(rect);
    }

    @Override // androidx.camera.core.n1
    public k1 I() {
        return this.f2085q;
    }

    @Override // androidx.camera.core.n1
    public synchronized int a() {
        return this.f2083c.getHeight();
    }

    @Override // androidx.camera.core.n1, java.lang.AutoCloseable
    public synchronized void close() {
        this.f2083c.close();
    }

    @Override // androidx.camera.core.n1
    public synchronized int d() {
        return this.f2083c.getWidth();
    }

    @Override // androidx.camera.core.n1
    public synchronized int getFormat() {
        return this.f2083c.getFormat();
    }

    @Override // androidx.camera.core.n1
    public synchronized Image o0() {
        return this.f2083c;
    }

    @Override // androidx.camera.core.n1
    public synchronized n1.a[] w() {
        return this.f2084d;
    }
}
