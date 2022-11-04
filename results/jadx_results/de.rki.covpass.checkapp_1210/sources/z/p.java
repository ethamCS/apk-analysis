package z;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.utils.g;
import androidx.camera.core.n1;
import androidx.camera.core.s1;
import androidx.concurrent.futures.c;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import w.g1;
import w.l0;
/* loaded from: classes.dex */
public class p implements l0 {

    /* renamed from: k */
    private static final Rect f26360k = new Rect(0, 0, 0, 0);

    /* renamed from: a */
    private final int f26361a;

    /* renamed from: c */
    private int f26363c;

    /* renamed from: g */
    private ImageWriter f26367g;

    /* renamed from: i */
    c.a<Void> f26369i;

    /* renamed from: j */
    private x5.a<Void> f26370j;

    /* renamed from: b */
    private final Object f26362b = new Object();

    /* renamed from: d */
    private int f26364d = 0;

    /* renamed from: e */
    private boolean f26365e = false;

    /* renamed from: f */
    private int f26366f = 0;

    /* renamed from: h */
    private Rect f26368h = f26360k;

    /* loaded from: classes.dex */
    private static final class a extends OutputStream {

        /* renamed from: c */
        private final ByteBuffer f26371c;

        a(ByteBuffer byteBuffer) {
            this.f26371c = byteBuffer;
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            if (this.f26371c.hasRemaining()) {
                this.f26371c.put((byte) i10);
                return;
            }
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            int i12;
            Objects.requireNonNull(bArr);
            if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i11 == 0) {
                return;
            }
            if (this.f26371c.remaining() < i11) {
                throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
            }
            this.f26371c.put(bArr, i10, i11);
        }
    }

    public p(int i10, int i11) {
        this.f26363c = i10;
        this.f26361a = i11;
    }

    private static androidx.camera.core.impl.utils.g f(n1 n1Var, int i10) {
        g.b a10 = androidx.camera.core.impl.utils.g.a();
        n1Var.I().b(a10);
        a10.m(i10);
        return a10.j(n1Var.d()).i(n1Var.a()).a();
    }

    public /* synthetic */ Object g(c.a aVar) {
        synchronized (this.f26362b) {
            this.f26369i = aVar;
        }
        return "YuvToJpegProcessor-close";
    }

    @Override // w.l0
    public void a(g1 g1Var) {
        ImageWriter imageWriter;
        boolean z10;
        Rect rect;
        int i10;
        int i11;
        Image image;
        n1 n1Var;
        Throwable th2;
        c.a<Void> aVar;
        Exception e10;
        c.a<Void> aVar2;
        ByteBuffer buffer;
        int position;
        c.a<Void> aVar3;
        List<Integer> b10 = g1Var.b();
        boolean z11 = false;
        androidx.core.util.h.b(b10.size() == 1, "Processing image bundle have single capture id, but found " + b10.size());
        x5.a<n1> a10 = g1Var.a(b10.get(0).intValue());
        androidx.core.util.h.a(a10.isDone());
        synchronized (this.f26362b) {
            imageWriter = this.f26367g;
            z10 = !this.f26365e;
            rect = this.f26368h;
            if (z10) {
                this.f26366f++;
            }
            i10 = this.f26363c;
            i11 = this.f26364d;
        }
        try {
            try {
                n1Var = a10.get();
                try {
                } catch (Exception e11) {
                    e10 = e11;
                    image = null;
                } catch (Throwable th3) {
                    th2 = th3;
                    image = null;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Exception e12) {
            e10 = e12;
            n1Var = null;
            image = null;
        } catch (Throwable th5) {
            th2 = th5;
            n1Var = null;
            image = null;
        }
        if (!z10) {
            s1.k("YuvToJpegProcessor", "Image enqueued for processing on closed processor.");
            n1Var.close();
            synchronized (this.f26362b) {
                if (z10) {
                    try {
                        int i12 = this.f26366f;
                        this.f26366f = i12 - 1;
                        if (i12 == 0 && this.f26365e) {
                            z11 = true;
                        }
                    } finally {
                    }
                }
                aVar3 = this.f26369i;
            }
            if (!z11) {
                return;
            }
            imageWriter.close();
            s1.a("YuvToJpegProcessor", "Closed after completion of last image processed.");
            if (aVar3 == null) {
                return;
            }
            aVar3.c(null);
            return;
        }
        image = imageWriter.dequeueInputImage();
        try {
            n1 n1Var2 = a10.get();
            try {
                androidx.core.util.h.j(n1Var2.getFormat() == 35, "Input image is not expected YUV_420_888 image format");
                YuvImage yuvImage = new YuvImage(d0.a.j(n1Var2), 17, n1Var2.d(), n1Var2.a(), null);
                buffer = image.getPlanes()[0].getBuffer();
                position = buffer.position();
                yuvImage.compressToJpeg(rect, i10, new androidx.camera.core.impl.utils.h(new a(buffer), f(n1Var2, i11)));
                n1Var2.close();
            } catch (Exception e13) {
                e10 = e13;
                n1Var = n1Var2;
            } catch (Throwable th6) {
                th2 = th6;
                n1Var = n1Var2;
            }
        } catch (Exception e14) {
            e10 = e14;
        }
        try {
            buffer.limit(buffer.position());
            buffer.position(position);
            imageWriter.queueInputImage(image);
            synchronized (this.f26362b) {
                if (z10) {
                    try {
                        int i13 = this.f26366f;
                        this.f26366f = i13 - 1;
                        if (i13 == 0 && this.f26365e) {
                            z11 = true;
                        }
                    } finally {
                    }
                }
                aVar2 = this.f26369i;
            }
        } catch (Exception e15) {
            e10 = e15;
            n1Var = null;
            if (z10) {
                s1.d("YuvToJpegProcessor", "Failed to process YUV -> JPEG", e10);
                image = imageWriter.dequeueInputImage();
                ByteBuffer buffer2 = image.getPlanes()[0].getBuffer();
                buffer2.rewind();
                buffer2.limit(0);
                imageWriter.queueInputImage(image);
            }
            synchronized (this.f26362b) {
                if (z10) {
                    try {
                        int i14 = this.f26366f;
                        this.f26366f = i14 - 1;
                        if (i14 == 0 && this.f26365e) {
                            z11 = true;
                        }
                    } finally {
                    }
                }
                aVar2 = this.f26369i;
            }
            if (image != null) {
                image.close();
            }
            if (n1Var != null) {
                n1Var.close();
            }
            if (!z11) {
                return;
            }
            imageWriter.close();
            s1.a("YuvToJpegProcessor", "Closed after completion of last image processed.");
            if (aVar2 == null) {
                return;
            }
            aVar2.c(null);
        } catch (Throwable th7) {
            th2 = th7;
            n1Var = null;
            synchronized (this.f26362b) {
                if (z10) {
                    try {
                        int i15 = this.f26366f;
                        this.f26366f = i15 - 1;
                        if (i15 == 0 && this.f26365e) {
                            z11 = true;
                        }
                    } finally {
                    }
                }
                aVar = this.f26369i;
            }
            if (image != null) {
                image.close();
            }
            if (n1Var != null) {
                n1Var.close();
            }
            if (z11) {
                imageWriter.close();
                s1.a("YuvToJpegProcessor", "Closed after completion of last image processed.");
                if (aVar != null) {
                    aVar.c(null);
                }
            }
            throw th2;
        }
        if (!z11) {
            return;
        }
        imageWriter.close();
        s1.a("YuvToJpegProcessor", "Closed after completion of last image processed.");
        if (aVar2 == null) {
            return;
        }
        aVar2.c(null);
    }

    @Override // w.l0
    public void b(Size size) {
        synchronized (this.f26362b) {
            this.f26368h = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    @Override // w.l0
    public void c(Surface surface, int i10) {
        androidx.core.util.h.j(i10 == 256, "YuvToJpegProcessor only supports JPEG output format.");
        synchronized (this.f26362b) {
            if (this.f26365e) {
                s1.k("YuvToJpegProcessor", "Cannot set output surface. Processor is closed.");
            } else if (this.f26367g != null) {
                throw new IllegalStateException("Output surface already set.");
            } else {
                this.f26367g = a0.a.d(surface, this.f26361a, i10);
            }
        }
    }

    @Override // w.l0
    public void close() {
        c.a<Void> aVar;
        synchronized (this.f26362b) {
            if (this.f26365e) {
                return;
            }
            this.f26365e = true;
            if (this.f26366f != 0 || this.f26367g == null) {
                s1.a("YuvToJpegProcessor", "close() called while processing. Will close after completion.");
                aVar = null;
            } else {
                s1.a("YuvToJpegProcessor", "No processing in progress. Closing immediately.");
                this.f26367g.close();
                aVar = this.f26369i;
            }
            if (aVar == null) {
                return;
            }
            aVar.c(null);
        }
    }

    @Override // w.l0
    public x5.a<Void> d() {
        x5.a<Void> aVar;
        synchronized (this.f26362b) {
            if (!this.f26365e || this.f26366f != 0) {
                if (this.f26370j == null) {
                    this.f26370j = androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: z.o
                        @Override // androidx.concurrent.futures.c.AbstractC0023c
                        public final Object a(c.a aVar2) {
                            Object g10;
                            g10 = p.this.g(aVar2);
                            return g10;
                        }
                    });
                }
                aVar = y.f.j(this.f26370j);
            } else {
                aVar = y.f.h(null);
            }
        }
        return aVar;
    }

    public void h(int i10) {
        synchronized (this.f26362b) {
            this.f26363c = i10;
        }
    }

    public void i(int i10) {
        synchronized (this.f26362b) {
            this.f26364d = i10;
        }
    }
}
