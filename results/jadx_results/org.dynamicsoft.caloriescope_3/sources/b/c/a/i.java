package b.c.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import b.c.a.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    final b f1292a;

    /* renamed from: b */
    final Context f1293b;

    /* renamed from: c */
    final ExecutorService f1294c;
    final j d;
    final Handler i;
    final Handler j;
    final d k;
    final z l;
    final c n;
    final boolean o;
    boolean p;
    final Map<String, b.c.a.c> e = new LinkedHashMap();
    final Map<Object, b.c.a.a> f = new WeakHashMap();
    final Map<Object, b.c.a.a> g = new WeakHashMap();
    final Set<Object> h = new HashSet();
    final List<b.c.a.c> m = new ArrayList(4);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends Handler {

        /* renamed from: a */
        private final i f1295a;

        /* renamed from: b.c.a.i$a$a */
        /* loaded from: classes.dex */
        class RunnableC0058a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Message f1296b;

            RunnableC0058a(a aVar, Message message) {
                this.f1296b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f1296b.what);
            }
        }

        public a(Looper looper, i iVar) {
            super(looper);
            this.f1295a = iVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.f1295a.d((b.c.a.a) message.obj);
                    return;
                case 2:
                    this.f1295a.c((b.c.a.a) message.obj);
                    return;
                case 3:
                case 8:
                default:
                    s.p.post(new RunnableC0058a(this, message));
                    return;
                case 4:
                    this.f1295a.d((b.c.a.c) message.obj);
                    return;
                case 5:
                    this.f1295a.e((b.c.a.c) message.obj);
                    return;
                case 6:
                    this.f1295a.a((b.c.a.c) message.obj, false);
                    return;
                case 7:
                    this.f1295a.a();
                    return;
                case 9:
                    this.f1295a.b((NetworkInfo) message.obj);
                    return;
                case 10:
                    i iVar = this.f1295a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    iVar.b(z);
                    return;
                case 11:
                    this.f1295a.a(message.obj);
                    return;
                case 12:
                    this.f1295a.b(message.obj);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: a */
        private final i f1297a;

        c(i iVar) {
            this.f1297a = iVar;
        }

        void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f1297a.o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f1297a.f1293b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (!intent.hasExtra("state")) {
                    return;
                }
                this.f1297a.a(intent.getBooleanExtra("state", false));
            } else if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            } else {
                this.f1297a.a(((ConnectivityManager) d0.a(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    public i(Context context, ExecutorService executorService, Handler handler, j jVar, d dVar, z zVar) {
        b bVar = new b();
        this.f1292a = bVar;
        bVar.start();
        d0.a(this.f1292a.getLooper());
        this.f1293b = context;
        this.f1294c = executorService;
        this.i = new a(this.f1292a.getLooper(), this);
        this.d = jVar;
        this.j = handler;
        this.k = dVar;
        this.l = zVar;
        this.p = d0.d(this.f1293b);
        this.o = d0.b(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.n = cVar;
        cVar.a();
    }

    private void a(List<b.c.a.c> list) {
        if (list == null || list.isEmpty() || !list.get(0).i().n) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (b.c.a.c cVar : list) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(d0.a(cVar));
        }
        d0.a("Dispatcher", "delivered", sb.toString());
    }

    private void b() {
        if (!this.f.isEmpty()) {
            Iterator<b.c.a.a> it = this.f.values().iterator();
            while (it.hasNext()) {
                b.c.a.a next = it.next();
                it.remove();
                if (next.f().n) {
                    d0.a("Dispatcher", "replaying", next.h().d());
                }
                a(next, false);
            }
        }
    }

    private void e(b.c.a.a aVar) {
        Object j = aVar.j();
        if (j != null) {
            aVar.k = true;
            this.f.put(j, aVar);
        }
    }

    private void f(b.c.a.c cVar) {
        if (cVar.m()) {
            return;
        }
        this.m.add(cVar);
        if (this.i.hasMessages(7)) {
            return;
        }
        this.i.sendEmptyMessageDelayed(7, 200L);
    }

    private void g(b.c.a.c cVar) {
        b.c.a.a b2 = cVar.b();
        if (b2 != null) {
            e(b2);
        }
        List<b.c.a.a> c2 = cVar.c();
        if (c2 != null) {
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                e(c2.get(i));
            }
        }
    }

    void a() {
        ArrayList arrayList = new ArrayList(this.m);
        this.m.clear();
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        a((List<b.c.a.c>) arrayList);
    }

    void a(NetworkInfo networkInfo) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    public void a(b.c.a.a aVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    void a(b.c.a.a aVar, boolean z) {
        if (this.h.contains(aVar.i())) {
            this.g.put(aVar.j(), aVar);
            if (!aVar.f().n) {
                return;
            }
            String d = aVar.f1268b.d();
            d0.a("Dispatcher", "paused", d, "because tag '" + aVar.i() + "' is paused");
            return;
        }
        b.c.a.c cVar = this.e.get(aVar.c());
        if (cVar != null) {
            cVar.a(aVar);
        } else if (this.f1294c.isShutdown()) {
            if (!aVar.f().n) {
                return;
            }
            d0.a("Dispatcher", "ignored", aVar.f1268b.d(), "because shut down");
        } else {
            b.c.a.c a2 = b.c.a.c.a(aVar.f(), this, this.k, this.l, aVar);
            a2.o = this.f1294c.submit(a2);
            this.e.put(aVar.c(), a2);
            if (z) {
                this.f.remove(aVar.j());
            }
            if (!aVar.f().n) {
                return;
            }
            d0.a("Dispatcher", "enqueued", aVar.f1268b.d());
        }
    }

    public void a(b.c.a.c cVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    void a(b.c.a.c cVar, boolean z) {
        if (cVar.i().n) {
            String a2 = d0.a(cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z ? " (will replay)" : "");
            d0.a("Dispatcher", "batched", a2, sb.toString());
        }
        this.e.remove(cVar.f());
        f(cVar);
    }

    void a(Object obj) {
        if (!this.h.add(obj)) {
            return;
        }
        Iterator<b.c.a.c> it = this.e.values().iterator();
        while (it.hasNext()) {
            b.c.a.c next = it.next();
            boolean z = next.i().n;
            b.c.a.a b2 = next.b();
            List<b.c.a.a> c2 = next.c();
            boolean z2 = c2 != null && !c2.isEmpty();
            if (b2 != null || z2) {
                if (b2 != null && b2.i().equals(obj)) {
                    next.b(b2);
                    this.g.put(b2.j(), b2);
                    if (z) {
                        d0.a("Dispatcher", "paused", b2.f1268b.d(), "because tag '" + obj + "' was paused");
                    }
                }
                if (z2) {
                    for (int size = c2.size() - 1; size >= 0; size--) {
                        b.c.a.a aVar = c2.get(size);
                        if (aVar.i().equals(obj)) {
                            next.b(aVar);
                            this.g.put(aVar.j(), aVar);
                            if (z) {
                                d0.a("Dispatcher", "paused", aVar.f1268b.d(), "because tag '" + obj + "' was paused");
                            }
                        }
                    }
                }
                if (next.a()) {
                    it.remove();
                    if (z) {
                        d0.a("Dispatcher", "canceled", d0.a(next), "all actions paused");
                    }
                }
            }
        }
    }

    void a(boolean z) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    void b(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f1294c;
        if (executorService instanceof u) {
            ((u) executorService).a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        b();
    }

    public void b(b.c.a.a aVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    public void b(b.c.a.c cVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    void b(Object obj) {
        if (!this.h.remove(obj)) {
            return;
        }
        ArrayList arrayList = null;
        Iterator<b.c.a.a> it = this.g.values().iterator();
        while (it.hasNext()) {
            b.c.a.a next = it.next();
            if (next.i().equals(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
                it.remove();
            }
        }
        if (arrayList == null) {
            return;
        }
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(13, arrayList));
    }

    void b(boolean z) {
        this.p = z;
    }

    void c(b.c.a.a aVar) {
        String c2 = aVar.c();
        b.c.a.c cVar = this.e.get(c2);
        if (cVar != null) {
            cVar.b(aVar);
            if (cVar.a()) {
                this.e.remove(c2);
                if (aVar.f().n) {
                    d0.a("Dispatcher", "canceled", aVar.h().d());
                }
            }
        }
        if (this.h.contains(aVar.i())) {
            this.g.remove(aVar.j());
            if (aVar.f().n) {
                d0.a("Dispatcher", "canceled", aVar.h().d(), "because paused request got canceled");
            }
        }
        b.c.a.a remove = this.f.remove(aVar.j());
        if (remove == null || !remove.f().n) {
            return;
        }
        d0.a("Dispatcher", "canceled", remove.h().d(), "from replaying");
    }

    public void c(b.c.a.c cVar) {
        Handler handler = this.i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500L);
    }

    void d(b.c.a.a aVar) {
        a(aVar, true);
    }

    void d(b.c.a.c cVar) {
        if (p.b(cVar.h())) {
            this.k.a(cVar.f(), cVar.k());
        }
        this.e.remove(cVar.f());
        f(cVar);
        if (cVar.i().n) {
            d0.a("Dispatcher", "batched", d0.a(cVar), "for completion");
        }
    }

    void e(b.c.a.c cVar) {
        if (cVar.m()) {
            return;
        }
        boolean z = false;
        if (this.f1294c.isShutdown()) {
            a(cVar, false);
            return;
        }
        NetworkInfo networkInfo = null;
        if (this.o) {
            networkInfo = ((ConnectivityManager) d0.a(this.f1293b, "connectivity")).getActiveNetworkInfo();
        }
        boolean z2 = networkInfo != null && networkInfo.isConnected();
        boolean a2 = cVar.a(this.p, networkInfo);
        boolean n = cVar.n();
        if (!a2) {
            if (this.o && n) {
                z = true;
            }
            a(cVar, z);
            if (!z) {
                return;
            }
            g(cVar);
        } else if (this.o && !z2) {
            a(cVar, n);
            if (!n) {
                return;
            }
            g(cVar);
        } else {
            if (cVar.i().n) {
                d0.a("Dispatcher", "retrying", d0.a(cVar));
            }
            if (cVar.e() instanceof r.a) {
                cVar.j |= q.NO_CACHE.f1314b;
            }
            cVar.o = this.f1294c.submit(cVar);
        }
    }
}
