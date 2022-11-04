package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;
import w.h1;
/* loaded from: classes.dex */
public class d implements w.h1 {

    /* renamed from: a */
    private final ImageReader f2157a;

    /* renamed from: b */
    private final Object f2158b = new Object();

    public d(ImageReader imageReader) {
        this.f2157a = imageReader;
    }

    private boolean l(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    public /* synthetic */ void m(h1.a aVar) {
        aVar.a(this);
    }

    public /* synthetic */ void n(Executor executor, final h1.a aVar, ImageReader imageReader) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.c
            @Override // java.lang.Runnable
            public final void run() {
                d.this.m(aVar);
            }
        });
    }

    @Override // w.h1
    public int a() {
        int height;
        synchronized (this.f2158b) {
            height = this.f2157a.getHeight();
        }
        return height;
    }

    @Override // w.h1
    public Surface b() {
        Surface surface;
        synchronized (this.f2158b) {
            surface = this.f2157a.getSurface();
        }
        return surface;
    }

    @Override // w.h1
    public void close() {
        synchronized (this.f2158b) {
            this.f2157a.close();
        }
    }

    @Override // w.h1
    public int d() {
        int width;
        synchronized (this.f2158b) {
            width = this.f2157a.getWidth();
        }
        return width;
    }

    @Override // w.h1
    public n1 e() {
        Image image;
        synchronized (this.f2158b) {
            try {
                image = this.f2157a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if (!l(e10)) {
                    throw e10;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new a(image);
        }
    }

    @Override // w.h1
    public int f() {
        int imageFormat;
        synchronized (this.f2158b) {
            imageFormat = this.f2157a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // w.h1
    public void g(final h1.a aVar, final Executor executor) {
        synchronized (this.f2158b) {
            this.f2157a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    d.this.n(executor, aVar, imageReader);
                }
            }, androidx.camera.core.impl.utils.k.a());
        }
    }

    @Override // w.h1
    public void h() {
        synchronized (this.f2158b) {
            this.f2157a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // w.h1
    public int i() {
        int maxImages;
        synchronized (this.f2158b) {
            maxImages = this.f2157a.getMaxImages();
        }
        return maxImages;
    }

    @Override // w.h1
    public n1 j() {
        Image image;
        synchronized (this.f2158b) {
            try {
                image = this.f2157a.acquireNextImage();
            } catch (RuntimeException e10) {
                if (!l(e10)) {
                    throw e10;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new a(image);
        }
    }
}
