package b.g.l;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private final a f2539a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(MotionEvent motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements a {
        private static final int v = ViewConfiguration.getLongPressTimeout();
        private static final int w = ViewConfiguration.getTapTimeout();
        private static final int x = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a */
        private int f2540a;

        /* renamed from: b */
        private int f2541b;

        /* renamed from: c */
        private int f2542c;

        /* renamed from: d */
        private int f2543d;

        /* renamed from: e */
        private final Handler f2544e;

        /* renamed from: f */
        final GestureDetector.OnGestureListener f2545f;

        /* renamed from: g */
        GestureDetector.OnDoubleTapListener f2546g;

        /* renamed from: h */
        boolean f2547h;
        boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        MotionEvent m;
        private MotionEvent n;
        private boolean o;
        private float p;
        private float q;
        private float r;
        private float s;
        private boolean t;
        private VelocityTracker u;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class a extends Handler {
            a() {
                b.this = r1;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Handler handler) {
                super(handler.getLooper());
                b.this = r1;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    b bVar = b.this;
                    bVar.f2545f.onShowPress(bVar.m);
                } else if (i == 2) {
                    b.this.d();
                } else if (i != 3) {
                    throw new RuntimeException("Unknown message " + message);
                } else {
                    b bVar2 = b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.f2546g;
                    if (onDoubleTapListener == null) {
                        return;
                    }
                    if (!bVar2.f2547h) {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.m);
                    } else {
                        bVar2.i = true;
                    }
                }
            }
        }

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f2544e = new a(handler);
            } else {
                this.f2544e = new a();
            }
            this.f2545f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                g((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            e(context);
        }

        private void b() {
            this.f2544e.removeMessages(1);
            this.f2544e.removeMessages(2);
            this.f2544e.removeMessages(3);
            this.u.recycle();
            this.u = null;
            this.o = false;
            this.f2547h = false;
            this.k = false;
            this.l = false;
            this.i = false;
            if (this.j) {
                this.j = false;
            }
        }

        private void c() {
            this.f2544e.removeMessages(1);
            this.f2544e.removeMessages(2);
            this.f2544e.removeMessages(3);
            this.o = false;
            this.k = false;
            this.l = false;
            this.i = false;
            if (this.j) {
                this.j = false;
            }
        }

        private void e(Context context) {
            if (context != null) {
                if (this.f2545f == null) {
                    throw new IllegalArgumentException("OnGestureListener must not be null");
                }
                this.t = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f2542c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f2543d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f2540a = scaledTouchSlop * scaledTouchSlop;
                this.f2541b = scaledDoubleTapSlop * scaledDoubleTapSlop;
                return;
            }
            throw new IllegalArgumentException("Context must not be null");
        }

        private boolean f(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (this.l && motionEvent3.getEventTime() - motionEvent2.getEventTime() <= x) {
                int x2 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
                int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
                return (x2 * x2) + (y * y) < this.f2541b;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x021f  */
        @Override // b.g.l.d.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(android.view.MotionEvent r13) {
            /*
                Method dump skipped, instructions count: 591
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b.g.l.d.b.a(android.view.MotionEvent):boolean");
        }

        void d() {
            this.f2544e.removeMessages(3);
            this.i = false;
            this.j = true;
            this.f2545f.onLongPress(this.m);
        }

        public void g(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f2546g = onDoubleTapListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements a {

        /* renamed from: a */
        private final GestureDetector f2549a;

        c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f2549a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // b.g.l.d.a
        public boolean a(MotionEvent motionEvent) {
            return this.f2549a.onTouchEvent(motionEvent);
        }
    }

    public d(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public d(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f2539a = Build.VERSION.SDK_INT > 17 ? new c(context, onGestureListener, handler) : new b(context, onGestureListener, handler);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f2539a.a(motionEvent);
    }
}
