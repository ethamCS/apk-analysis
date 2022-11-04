package p7;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import p7.a;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i */
    private static final String f18912i = "a";

    /* renamed from: j */
    private static final Collection<String> f18913j;

    /* renamed from: a */
    private boolean f18914a;

    /* renamed from: b */
    private boolean f18915b;

    /* renamed from: c */
    private final boolean f18916c;

    /* renamed from: d */
    private final Camera f18917d;

    /* renamed from: e */
    private Handler f18918e;

    /* renamed from: g */
    private final Handler.Callback f18920g;

    /* renamed from: f */
    private int f18919f = 1;

    /* renamed from: h */
    private final Camera.AutoFocusCallback f18921h = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p7.a$a */
    /* loaded from: classes.dex */
    public class C0294a implements Handler.Callback {
        C0294a() {
            a.this = r1;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == a.this.f18919f) {
                a.this.h();
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Camera.AutoFocusCallback {
        b() {
            a.this = r1;
        }

        public /* synthetic */ void b() {
            a.this.f18915b = false;
            a.this.f();
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z10, Camera camera) {
            a.this.f18918e.post(new Runnable() { // from class: p7.b
                @Override // java.lang.Runnable
                public final void run() {
                    a.b.this.b();
                }
            });
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f18913j = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public a(Camera camera, i iVar) {
        boolean z10 = true;
        C0294a c0294a = new C0294a();
        this.f18920g = c0294a;
        this.f18918e = new Handler(c0294a);
        this.f18917d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        z10 = (!iVar.c() || !f18913j.contains(focusMode)) ? false : z10;
        this.f18916c = z10;
        String str = f18912i;
        Log.i(str, "Current focus mode '" + focusMode + "'; use auto focus? " + z10);
        i();
    }

    public synchronized void f() {
        if (!this.f18914a && !this.f18918e.hasMessages(this.f18919f)) {
            Handler handler = this.f18918e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f18919f), 2000L);
        }
    }

    private void g() {
        this.f18918e.removeMessages(this.f18919f);
    }

    public void h() {
        if (!this.f18916c || this.f18914a || this.f18915b) {
            return;
        }
        try {
            this.f18917d.autoFocus(this.f18921h);
            this.f18915b = true;
        } catch (RuntimeException e10) {
            Log.w(f18912i, "Unexpected exception while focusing", e10);
            f();
        }
    }

    public void i() {
        this.f18914a = false;
        h();
    }

    public void j() {
        this.f18914a = true;
        this.f18915b = false;
        g();
        if (this.f18916c) {
            try {
                this.f18917d.cancelAutoFocus();
            } catch (RuntimeException e10) {
                Log.w(f18912i, "Unexpected exception while cancelling focusing", e10);
            }
        }
    }
}
