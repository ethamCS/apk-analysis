package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.d;
import androidx.room.e;
import androidx.room.g;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    final Context f1864a;

    /* renamed from: b */
    final String f1865b;

    /* renamed from: c */
    int f1866c;

    /* renamed from: d */
    final g f1867d;

    /* renamed from: e */
    final g.c f1868e;

    /* renamed from: f */
    androidx.room.e f1869f;

    /* renamed from: g */
    final Executor f1870g;
    final ServiceConnection j;

    /* renamed from: h */
    final androidx.room.d f1871h = new a();
    final AtomicBoolean i = new AtomicBoolean(false);
    final Runnable k = new c();
    final Runnable l = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends d.a {

        /* renamed from: androidx.room.h$a$a */
        /* loaded from: classes.dex */
        class RunnableC0033a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ String[] f1873b;

            RunnableC0033a(String[] strArr) {
                a.this = r1;
                this.f1873b = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.f1867d.e(this.f1873b);
            }
        }

        a() {
            h.this = r1;
        }

        @Override // androidx.room.d
        public void l(String[] strArr) {
            h.this.f1870g.execute(new RunnableC0033a(strArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ServiceConnection {
        b() {
            h.this = r1;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            h.this.f1869f = e.a.t(iBinder);
            h hVar = h.this;
            hVar.f1870g.execute(hVar.k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            h hVar = h.this;
            hVar.f1870g.execute(hVar.l);
            h.this.f1869f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
            h.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                h hVar = h.this;
                androidx.room.e eVar = hVar.f1869f;
                if (eVar == null) {
                    return;
                }
                hVar.f1866c = eVar.f(hVar.f1871h, hVar.f1865b);
                h hVar2 = h.this;
                hVar2.f1867d.a(hVar2.f1868e);
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        d() {
            h.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f1867d.g(hVar.f1868e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends g.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String[] strArr) {
            super(strArr);
            h.this = r1;
        }

        @Override // androidx.room.g.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.g.c
        public void b(Set<String> set) {
            if (h.this.i.get()) {
                return;
            }
            try {
                h hVar = h.this;
                androidx.room.e eVar = hVar.f1869f;
                if (eVar == null) {
                    return;
                }
                eVar.j(hVar.f1866c, (String[]) set.toArray(new String[0]));
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot broadcast invalidation", e2);
            }
        }
    }

    public h(Context context, String str, g gVar, Executor executor) {
        b bVar = new b();
        this.j = bVar;
        Context applicationContext = context.getApplicationContext();
        this.f1864a = applicationContext;
        this.f1865b = str;
        this.f1867d = gVar;
        this.f1870g = executor;
        this.f1868e = new e((String[]) gVar.f1845a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), bVar, 1);
    }
}
