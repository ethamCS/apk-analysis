package b.c.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import b.c.a.a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public class s {
    static final Handler p = new a(Looper.getMainLooper());
    static volatile s q = null;

    /* renamed from: a */
    private final d f1317a;

    /* renamed from: b */
    private final g f1318b;

    /* renamed from: c */
    private final c f1319c;
    private final List<x> d;
    final Context e;
    final i f;
    final b.c.a.d g;
    final z h;
    final Map<Object, b.c.a.a> i;
    final Map<ImageView, h> j;
    final ReferenceQueue<Object> k;
    final Bitmap.Config l;
    boolean m;
    volatile boolean n;
    boolean o;

    /* loaded from: classes.dex */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                b.c.a.a aVar = (b.c.a.a) message.obj;
                if (aVar.f().n) {
                    d0.a("Main", "canceled", aVar.f1268b.d(), "target got garbage collected");
                }
                aVar.f1267a.a(aVar.j());
                return;
            }
            int i2 = 0;
            if (i == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i2 < size) {
                    b.c.a.c cVar = (b.c.a.c) list.get(i2);
                    cVar.f1277c.a(cVar);
                    i2++;
                }
            } else if (i != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            } else {
                List list2 = (List) message.obj;
                int size2 = list2.size();
                while (i2 < size2) {
                    b.c.a.a aVar2 = (b.c.a.a) list2.get(i2);
                    aVar2.f1267a.b(aVar2);
                    i2++;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final Context f1320a;

        /* renamed from: b */
        private j f1321b;

        /* renamed from: c */
        private ExecutorService f1322c;
        private b.c.a.d d;
        private d e;
        private g f;
        private List<x> g;
        private Bitmap.Config h;
        private boolean i;
        private boolean j;

        public b(Context context) {
            if (context != null) {
                this.f1320a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public s a() {
            Context context = this.f1320a;
            if (this.f1321b == null) {
                this.f1321b = d0.c(context);
            }
            if (this.d == null) {
                this.d = new m(context);
            }
            if (this.f1322c == null) {
                this.f1322c = new u();
            }
            if (this.f == null) {
                this.f = g.f1330a;
            }
            z zVar = new z(this.d);
            return new s(context, new i(context, this.f1322c, s.p, this.f1321b, this.d, zVar), this.d, this.e, this.f, this.g, zVar, this.h, this.i, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends Thread {

        /* renamed from: b */
        private final ReferenceQueue<Object> f1323b;

        /* renamed from: c */
        private final Handler f1324c;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Exception f1325b;

            a(c cVar, Exception exc) {
                this.f1325b = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f1325b);
            }
        }

        c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f1323b = referenceQueue;
            this.f1324c = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0056a c0056a = (a.C0056a) this.f1323b.remove(1000L);
                    Message obtainMessage = this.f1324c.obtainMessage();
                    if (c0056a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0056a.f1270a;
                        this.f1324c.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f1324c.post(new a(this, e));
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(s sVar, Uri uri, Exception exc);
    }

    /* loaded from: classes.dex */
    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: b */
        final int f1327b;

        e(int i) {
            this.f1327b = i;
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    /* loaded from: classes.dex */
    public interface g {

        /* renamed from: a */
        public static final g f1330a = new a();

        /* loaded from: classes.dex */
        static class a implements g {
            a() {
            }

            @Override // b.c.a.s.g
            public v a(v vVar) {
                return vVar;
            }
        }

        v a(v vVar);
    }

    s(Context context, i iVar, b.c.a.d dVar, d dVar2, g gVar, List<x> list, z zVar, Bitmap.Config config, boolean z, boolean z2) {
        this.e = context;
        this.f = iVar;
        this.g = dVar;
        this.f1317a = dVar2;
        this.f1318b = gVar;
        this.l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new y(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new b.c.a.f(context));
        arrayList.add(new o(context));
        arrayList.add(new b.c.a.g(context));
        arrayList.add(new b.c.a.b(context));
        arrayList.add(new k(context));
        arrayList.add(new r(iVar.d, zVar));
        this.d = Collections.unmodifiableList(arrayList);
        this.h = zVar;
        this.i = new WeakHashMap();
        this.j = new WeakHashMap();
        this.m = z;
        this.n = z2;
        this.k = new ReferenceQueue<>();
        c cVar = new c(this.k, p);
        this.f1319c = cVar;
        cVar.start();
    }

    public static s a(Context context) {
        if (q == null) {
            synchronized (s.class) {
                if (q == null) {
                    q = new b(context).a();
                }
            }
        }
        return q;
    }

    private void a(Bitmap bitmap, e eVar, b.c.a.a aVar) {
        if (aVar.k()) {
            return;
        }
        if (!aVar.l()) {
            this.i.remove(aVar.j());
        }
        if (bitmap == null) {
            aVar.b();
            if (!this.n) {
                return;
            }
            d0.a("Main", "errored", aVar.f1268b.d());
        } else if (eVar == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        } else {
            aVar.a(bitmap, eVar);
            if (!this.n) {
                return;
            }
            String d2 = aVar.f1268b.d();
            d0.a("Main", "completed", d2, "from " + eVar);
        }
    }

    public void a(Object obj) {
        d0.a();
        b.c.a.a remove = this.i.remove(obj);
        if (remove != null) {
            remove.a();
            this.f.a(remove);
        }
        if (obj instanceof ImageView) {
            h remove2 = this.j.remove((ImageView) obj);
            if (remove2 == null) {
                return;
            }
            remove2.a();
        }
    }

    public v a(v vVar) {
        this.f1318b.a(vVar);
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("Request transformer " + this.f1318b.getClass().getCanonicalName() + " returned null for " + vVar);
    }

    public w a(Uri uri) {
        return new w(this, uri, 0);
    }

    public w a(String str) {
        if (str == null) {
            return new w(this, null, 0);
        }
        if (str.trim().length() == 0) {
            throw new IllegalArgumentException("Path must not be empty.");
        }
        return a(Uri.parse(str));
    }

    public List<x> a() {
        return this.d;
    }

    public void a(ImageView imageView) {
        a((Object) imageView);
    }

    public void a(ImageView imageView, h hVar) {
        this.j.put(imageView, hVar);
    }

    public void a(b.c.a.a aVar) {
        Object j = aVar.j();
        if (j != null && this.i.get(j) != aVar) {
            a(j);
            this.i.put(j, aVar);
        }
        c(aVar);
    }

    void a(b.c.a.c cVar) {
        b.c.a.a b2 = cVar.b();
        List<b.c.a.a> c2 = cVar.c();
        boolean z = true;
        boolean z2 = c2 != null && !c2.isEmpty();
        if (b2 == null && !z2) {
            z = false;
        }
        if (!z) {
            return;
        }
        Uri uri = cVar.d().d;
        Exception e2 = cVar.e();
        Bitmap k = cVar.k();
        e g2 = cVar.g();
        if (b2 != null) {
            a(k, g2, b2);
        }
        if (z2) {
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                a(k, g2, c2.get(i));
            }
        }
        d dVar = this.f1317a;
        if (dVar == null || e2 == null) {
            return;
        }
        dVar.a(this, uri, e2);
    }

    public Bitmap b(String str) {
        Bitmap a2 = this.g.a(str);
        z zVar = this.h;
        if (a2 != null) {
            zVar.b();
        } else {
            zVar.c();
        }
        return a2;
    }

    void b(b.c.a.a aVar) {
        Bitmap b2 = p.a(aVar.e) ? b(aVar.c()) : null;
        if (b2 == null) {
            a(aVar);
            if (!this.n) {
                return;
            }
            d0.a("Main", "resumed", aVar.f1268b.d());
            return;
        }
        a(b2, e.MEMORY, aVar);
        if (!this.n) {
            return;
        }
        String d2 = aVar.f1268b.d();
        d0.a("Main", "completed", d2, "from " + e.MEMORY);
    }

    void c(b.c.a.a aVar) {
        this.f.b(aVar);
    }
}
