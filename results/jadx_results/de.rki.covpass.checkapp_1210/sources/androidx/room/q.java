package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.l;
import androidx.room.m;
import androidx.room.p;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class q {

    /* renamed from: a */
    final Context f5000a;

    /* renamed from: b */
    final String f5001b;

    /* renamed from: c */
    int f5002c;

    /* renamed from: d */
    final p f5003d;

    /* renamed from: e */
    final p.c f5004e;

    /* renamed from: f */
    m f5005f;

    /* renamed from: g */
    final Executor f5006g;

    /* renamed from: j */
    final ServiceConnection f5009j;

    /* renamed from: h */
    final l f5007h = new a();

    /* renamed from: i */
    final AtomicBoolean f5008i = new AtomicBoolean(false);

    /* renamed from: k */
    final Runnable f5010k = new c();

    /* renamed from: l */
    final Runnable f5011l = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends l.a {

        /* renamed from: androidx.room.q$a$a */
        /* loaded from: classes.dex */
        class RunnableC0063a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ String[] f5013c;

            RunnableC0063a(String[] strArr) {
                a.this = r1;
                this.f5013c = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                q.this.f5003d.f(this.f5013c);
            }
        }

        a() {
            q.this = r1;
        }

        @Override // androidx.room.l
        public void a(String[] strArr) {
            q.this.f5006g.execute(new RunnableC0063a(strArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ServiceConnection {
        b() {
            q.this = r1;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            q.this.f5005f = m.a.e(iBinder);
            q qVar = q.this;
            qVar.f5006g.execute(qVar.f5010k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            q qVar = q.this;
            qVar.f5006g.execute(qVar.f5011l);
            q.this.f5005f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
            q.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q qVar = q.this;
                m mVar = qVar.f5005f;
                if (mVar == null) {
                    return;
                }
                qVar.f5002c = mVar.b(qVar.f5007h, qVar.f5001b);
                q qVar2 = q.this;
                qVar2.f5003d.a(qVar2.f5004e);
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        d() {
            q.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            q qVar = q.this;
            qVar.f5003d.i(qVar.f5004e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends p.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String[] strArr) {
            super(strArr);
            q.this = r1;
        }

        @Override // androidx.room.p.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.p.c
        public void b(Set<String> set) {
            if (q.this.f5008i.get()) {
                return;
            }
            try {
                q qVar = q.this;
                m mVar = qVar.f5005f;
                if (mVar == null) {
                    return;
                }
                mVar.c(qVar.f5002c, (String[]) set.toArray(new String[0]));
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    public q(Context context, String str, Intent intent, p pVar, Executor executor) {
        b bVar = new b();
        this.f5009j = bVar;
        Context applicationContext = context.getApplicationContext();
        this.f5000a = applicationContext;
        this.f5001b = str;
        this.f5003d = pVar;
        this.f5006g = executor;
        this.f5004e = new e((String[]) pVar.f4976a.keySet().toArray(new String[0]));
        applicationContext.bindService(intent, bVar, 1);
    }
}
