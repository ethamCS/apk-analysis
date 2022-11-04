package o7;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    private int f17639a;

    /* renamed from: b */
    private WindowManager f17640b;

    /* renamed from: c */
    private OrientationEventListener f17641c;

    /* renamed from: d */
    private o f17642d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends OrientationEventListener {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, int i10) {
            super(context, i10);
            p.this = r1;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation;
            WindowManager windowManager = p.this.f17640b;
            o oVar = p.this.f17642d;
            if (p.this.f17640b == null || oVar == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == p.this.f17639a) {
                return;
            }
            p.this.f17639a = rotation;
            oVar.a(rotation);
        }
    }

    public void e(Context context, o oVar) {
        f();
        Context applicationContext = context.getApplicationContext();
        this.f17642d = oVar;
        this.f17640b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(applicationContext, 3);
        this.f17641c = aVar;
        aVar.enable();
        this.f17639a = this.f17640b.getDefaultDisplay().getRotation();
    }

    public void f() {
        OrientationEventListener orientationEventListener = this.f17641c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f17641c = null;
        this.f17640b = null;
        this.f17642d = null;
    }
}
