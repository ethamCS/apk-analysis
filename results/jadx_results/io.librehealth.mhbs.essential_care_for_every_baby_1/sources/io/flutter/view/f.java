package io.flutter.view;

import android.view.Choreographer;
import android.view.WindowManager;
import io.flutter.embedding.engine.FlutterJNI;
/* loaded from: classes.dex */
public class f {

    /* renamed from: c */
    private static f f1305c;

    /* renamed from: a */
    private final WindowManager f1306a;

    /* renamed from: b */
    private final FlutterJNI.b f1307b = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements FlutterJNI.b {

        /* renamed from: io.flutter.view.f$a$a */
        /* loaded from: classes.dex */
        class Choreographer$FrameCallbackC0061a implements Choreographer.FrameCallback {

            /* renamed from: a */
            final /* synthetic */ long f1309a;

            Choreographer$FrameCallbackC0061a(long j) {
                a.this = r1;
                this.f1309a = j;
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                double refreshRate = f.this.f1306a.getDefaultDisplay().getRefreshRate();
                Double.isNaN(refreshRate);
                FlutterJNI.nativeOnVsync(j, j + ((long) (1.0E9d / refreshRate)), this.f1309a);
            }
        }

        a() {
            f.this = r1;
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j) {
            Choreographer.getInstance().postFrameCallback(new Choreographer$FrameCallbackC0061a(j));
        }
    }

    private f(WindowManager windowManager) {
        this.f1306a = windowManager;
    }

    public static f b(WindowManager windowManager) {
        if (f1305c == null) {
            f1305c = new f(windowManager);
        }
        return f1305c;
    }

    public void c() {
        FlutterJNI.setAsyncWaitForVsyncDelegate(this.f1307b);
        FlutterJNI.setRefreshRateFPS(this.f1306a.getDefaultDisplay().getRefreshRate());
    }
}
