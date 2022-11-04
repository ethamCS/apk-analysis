package androidx.camera.core;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import w.c2;
import w.o2;
import w.p2;
/* loaded from: classes.dex */
public final class h3 extends c3 {
    public static final d J = new d();
    private static final int[] K = {8, 6, 5, 4};
    private volatile int A;
    private volatile boolean B;
    private int C;
    private int D;
    private int E;
    private w.r0 F;
    private final AtomicBoolean G;
    private e H;
    private Throwable I;

    /* renamed from: l */
    private final Object f2275l;

    /* renamed from: m */
    private final AtomicBoolean f2276m;

    /* renamed from: n */
    private final AtomicBoolean f2277n;

    /* renamed from: o */
    private HandlerThread f2278o;

    /* renamed from: p */
    private Handler f2279p;

    /* renamed from: q */
    private HandlerThread f2280q;

    /* renamed from: r */
    private Handler f2281r;

    /* renamed from: s */
    MediaCodec f2282s;

    /* renamed from: t */
    private MediaCodec f2283t;

    /* renamed from: u */
    private x5.a<Void> f2284u;

    /* renamed from: v */
    private c2.b f2285v;

    /* renamed from: w */
    private int f2286w;

    /* renamed from: x */
    private int f2287x;

    /* renamed from: y */
    Surface f2288y;

    /* renamed from: z */
    private volatile AudioRecord f2289z;

    /* loaded from: classes.dex */
    public class a implements c2.c {

        /* renamed from: a */
        final /* synthetic */ String f2290a;

        /* renamed from: b */
        final /* synthetic */ Size f2291b;

        a(String str, Size size) {
            h3.this = r1;
            this.f2290a = str;
            this.f2291b = size;
        }

        @Override // w.c2.c
        public void a(w.c2 c2Var, c2.e eVar) {
            if (h3.this.p(this.f2290a)) {
                h3.this.X(this.f2290a, this.f2291b);
                h3.this.t();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        static int a(MediaCodec.CodecException codecException) {
            return codecException.getErrorCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements o2.a<h3, w.q2, c> {

        /* renamed from: a */
        private final w.q1 f2293a;

        public c() {
            this(w.q1.L());
        }

        private c(w.q1 q1Var) {
            this.f2293a = q1Var;
            Class cls = (Class) q1Var.a(z.i.f26356w, null);
            if (cls == null || cls.equals(h3.class)) {
                n(h3.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        static c c(w.o0 o0Var) {
            return new c(w.q1.M(o0Var));
        }

        @Override // androidx.camera.core.h0
        public w.p1 a() {
            return this.f2293a;
        }

        /* renamed from: d */
        public w.q2 b() {
            return new w.q2(w.u1.J(this.f2293a));
        }

        public c e(int i10) {
            a().g(w.q2.D, Integer.valueOf(i10));
            return this;
        }

        public c f(int i10) {
            a().g(w.q2.F, Integer.valueOf(i10));
            return this;
        }

        public c g(int i10) {
            a().g(w.q2.G, Integer.valueOf(i10));
            return this;
        }

        public c h(int i10) {
            a().g(w.q2.E, Integer.valueOf(i10));
            return this;
        }

        public c i(int i10) {
            a().g(w.q2.B, Integer.valueOf(i10));
            return this;
        }

        public c j(int i10) {
            a().g(w.q2.C, Integer.valueOf(i10));
            return this;
        }

        public c k(Size size) {
            a().g(w.f1.f24455l, size);
            return this;
        }

        public c l(int i10) {
            a().g(w.o2.f24558r, Integer.valueOf(i10));
            return this;
        }

        public c m(int i10) {
            a().g(w.f1.f24450g, Integer.valueOf(i10));
            return this;
        }

        public c n(Class<h3> cls) {
            a().g(z.i.f26356w, cls);
            if (a().a(z.i.f26355v, null) == null) {
                o(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c o(String str) {
            a().g(z.i.f26355v, str);
            return this;
        }

        public c p(int i10) {
            a().g(w.q2.A, Integer.valueOf(i10));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private static final Size f2294a;

        /* renamed from: b */
        private static final w.q2 f2295b;

        static {
            Size size = new Size(1920, 1080);
            f2294a = size;
            f2295b = new c().p(30).i(8388608).j(1).e(64000).h(8000).f(1).g(1024).k(size).l(3).m(1).b();
        }

        public w.q2 a() {
            return f2295b;
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED,
        VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED,
        VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE,
        VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED
    }

    private AudioRecord N(w.q2 q2Var) {
        int i10 = this.C == 1 ? 16 : 12;
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(this.D, i10, 2);
            if (minBufferSize <= 0) {
                minBufferSize = q2Var.J();
            }
            int i11 = minBufferSize;
            AudioRecord audioRecord = new AudioRecord(5, this.D, i10, 2, i11 * 2);
            if (audioRecord.getState() != 1) {
                return null;
            }
            this.A = i11;
            s1.e("VideoCapture", "source: 5 audioSampleRate: " + this.D + " channelConfig: " + i10 + " audioFormat: 2 bufferSize: " + i11);
            return audioRecord;
        } catch (Exception e10) {
            s1.d("VideoCapture", "Exception, keep trying.", e10);
            return null;
        }
    }

    private MediaFormat O() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.D, this.C);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", this.E);
        return createAudioFormat;
    }

    private static MediaFormat P(w.q2 q2Var, Size size) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", q2Var.L());
        createVideoFormat.setInteger("frame-rate", q2Var.N());
        createVideoFormat.setInteger("i-frame-interval", q2Var.M());
        return createVideoFormat;
    }

    public static /* synthetic */ void R(boolean z10, MediaCodec mediaCodec) {
        if (!z10 || mediaCodec == null) {
            return;
        }
        mediaCodec.release();
    }

    private void T() {
        this.f2280q.quitSafely();
        MediaCodec mediaCodec = this.f2283t;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.f2283t = null;
        }
        if (this.f2289z != null) {
            this.f2289z.release();
            this.f2289z = null;
        }
    }

    private void U(final boolean z10) {
        w.r0 r0Var = this.F;
        if (r0Var == null) {
            return;
        }
        final MediaCodec mediaCodec = this.f2282s;
        r0Var.c();
        this.F.i().b(new Runnable() { // from class: androidx.camera.core.g3
            @Override // java.lang.Runnable
            public final void run() {
                h3.R(z10, mediaCodec);
            }
        }, x.a.d());
        if (z10) {
            this.f2282s = null;
        }
        this.f2288y = null;
        this.F = null;
    }

    /* renamed from: V */
    public void Q() {
        this.f2278o.quitSafely();
        T();
        if (this.f2288y != null) {
            U(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        r7.C = r4.audioChannels;
        r7.D = r4.audioSampleRate;
        r7.E = r4.audioBitRate;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void W(android.util.Size r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            int[] r1 = androidx.camera.core.h3.K     // Catch: java.lang.NumberFormatException -> L3d
            int r2 = r1.length     // Catch: java.lang.NumberFormatException -> L3d
            r3 = r0
        L5:
            if (r3 >= r2) goto L44
            r4 = r1[r3]     // Catch: java.lang.NumberFormatException -> L3d
            int r5 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L3d
            boolean r5 = android.media.CamcorderProfile.hasProfile(r5, r4)     // Catch: java.lang.NumberFormatException -> L3d
            if (r5 == 0) goto L3a
            int r5 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L3d
            android.media.CamcorderProfile r4 = android.media.CamcorderProfile.get(r5, r4)     // Catch: java.lang.NumberFormatException -> L3d
            int r5 = r8.getWidth()     // Catch: java.lang.NumberFormatException -> L3d
            int r6 = r4.videoFrameWidth     // Catch: java.lang.NumberFormatException -> L3d
            if (r5 != r6) goto L3a
            int r5 = r8.getHeight()     // Catch: java.lang.NumberFormatException -> L3d
            int r6 = r4.videoFrameHeight     // Catch: java.lang.NumberFormatException -> L3d
            if (r5 != r6) goto L3a
            int r8 = r4.audioChannels     // Catch: java.lang.NumberFormatException -> L3d
            r7.C = r8     // Catch: java.lang.NumberFormatException -> L3d
            int r8 = r4.audioSampleRate     // Catch: java.lang.NumberFormatException -> L3d
            r7.D = r8     // Catch: java.lang.NumberFormatException -> L3d
            int r8 = r4.audioBitRate     // Catch: java.lang.NumberFormatException -> L3d
            r7.E = r8     // Catch: java.lang.NumberFormatException -> L3d
            r8 = 1
            r0 = r8
            goto L44
        L3a:
            int r3 = r3 + 1
            goto L5
        L3d:
            java.lang.String r8 = "VideoCapture"
            java.lang.String r9 = "The camera Id is not an integer because the camera may be a removable device. Use the default values for the audio related settings."
            androidx.camera.core.s1.e(r8, r9)
        L44:
            if (r0 != 0) goto L5e
            w.o2 r8 = r7.g()
            w.q2 r8 = (w.q2) r8
            int r9 = r8.I()
            r7.C = r9
            int r9 = r8.K()
            r7.D = r9
            int r8 = r8.H()
            r7.E = r8
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.h3.W(android.util.Size, java.lang.String):void");
    }

    @Override // androidx.camera.core.c3
    public void A() {
        S();
        x5.a<Void> aVar = this.f2284u;
        if (aVar != null) {
            aVar.b(new Runnable() { // from class: androidx.camera.core.f3
                @Override // java.lang.Runnable
                public final void run() {
                    h3.this.Q();
                }
            }, x.a.d());
        } else {
            Q();
        }
    }

    @Override // androidx.camera.core.c3
    public void D() {
        S();
    }

    @Override // androidx.camera.core.c3
    protected Size E(Size size) {
        if (this.f2288y != null) {
            this.f2282s.stop();
            this.f2282s.release();
            this.f2283t.stop();
            this.f2283t.release();
            U(false);
        }
        try {
            this.f2282s = MediaCodec.createEncoderByType("video/avc");
            this.f2283t = MediaCodec.createEncoderByType("audio/mp4a-latm");
            X(f(), size);
            r();
            return size;
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to create MediaCodec due to: " + e10.getCause());
        }
    }

    void X(String str, Size size) {
        e eVar;
        Throwable e10;
        w.q2 q2Var = (w.q2) g();
        this.f2282s.reset();
        this.H = e.VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED;
        try {
            this.f2282s.configure(P(q2Var, size), (Surface) null, (MediaCrypto) null, 1);
            if (this.f2288y != null) {
                U(false);
            }
            final Surface createInputSurface = this.f2282s.createInputSurface();
            this.f2288y = createInputSurface;
            this.f2285v = c2.b.o(q2Var);
            w.r0 r0Var = this.F;
            if (r0Var != null) {
                r0Var.c();
            }
            w.i1 i1Var = new w.i1(this.f2288y, size, i());
            this.F = i1Var;
            x5.a<Void> i10 = i1Var.i();
            Objects.requireNonNull(createInputSurface);
            i10.b(new Runnable() { // from class: androidx.camera.core.d3
                @Override // java.lang.Runnable
                public final void run() {
                    createInputSurface.release();
                }
            }, x.a.d());
            this.f2285v.h(this.F);
            this.f2285v.f(new a(str, size));
            I(this.f2285v.m());
            this.G.set(true);
            W(size, str);
            this.f2283t.reset();
            this.f2283t.configure(O(), (Surface) null, (MediaCrypto) null, 1);
            if (this.f2289z != null) {
                this.f2289z.release();
            }
            this.f2289z = N(q2Var);
            if (this.f2289z == null) {
                s1.c("VideoCapture", "AudioRecord object cannot initialized correctly!");
                this.G.set(false);
            }
            synchronized (this.f2275l) {
                this.f2286w = -1;
                this.f2287x = -1;
            }
            this.B = false;
        } catch (MediaCodec.CodecException e11) {
            int a10 = b.a(e11);
            String diagnosticInfo = e11.getDiagnosticInfo();
            if (a10 != 1100) {
                if (a10 == 1101) {
                    s1.e("VideoCapture", "CodecException: code: " + a10 + " diagnostic: " + diagnosticInfo);
                    eVar = e.VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED;
                }
                this.I = e11;
            }
            s1.e("VideoCapture", "CodecException: code: " + a10 + " diagnostic: " + diagnosticInfo);
            eVar = e.VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE;
            this.H = eVar;
            this.I = e11;
        } catch (IllegalArgumentException e12) {
            e10 = e12;
            this.H = e.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            this.I = e10;
        } catch (IllegalStateException e13) {
            e10 = e13;
            this.H = e.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            this.I = e10;
        }
    }

    /* renamed from: Y */
    public void S() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            x.a.d().execute(new Runnable() { // from class: androidx.camera.core.e3
                @Override // java.lang.Runnable
                public final void run() {
                    h3.this.S();
                }
            });
            return;
        }
        s1.e("VideoCapture", "stopRecording");
        this.f2285v.n();
        this.f2285v.h(this.F);
        I(this.f2285v.m());
        v();
        if (!this.B) {
            return;
        }
        (this.G.get() ? this.f2277n : this.f2276m).set(true);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [w.o2<?>, w.o2] */
    @Override // androidx.camera.core.c3
    public w.o2<?> h(boolean z10, w.p2 p2Var) {
        w.o0 a10 = p2Var.a(p2.b.VIDEO_CAPTURE, 1);
        if (z10) {
            a10 = w.n0.b(a10, J.a());
        }
        if (a10 == null) {
            return null;
        }
        return n(a10).b();
    }

    @Override // androidx.camera.core.c3
    public o2.a<?, ?, ?> n(w.o0 o0Var) {
        return c.c(o0Var);
    }

    @Override // androidx.camera.core.c3
    public void x() {
        this.f2278o = new HandlerThread("CameraX-video encoding thread");
        this.f2280q = new HandlerThread("CameraX-audio encoding thread");
        this.f2278o.start();
        this.f2279p = new Handler(this.f2278o.getLooper());
        this.f2280q.start();
        this.f2281r = new Handler(this.f2280q.getLooper());
    }
}
