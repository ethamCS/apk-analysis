package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import c2.p;
import d2.j;
import d2.m;
import java.util.Collections;
import java.util.List;
import u1.k;
/* loaded from: classes.dex */
public class d implements y1.c, v1.b, m.b {
    private static final String Y3 = k.f("DelayMetCommandHandler");
    private PowerManager.WakeLock W3;

    /* renamed from: c */
    private final Context f5343c;

    /* renamed from: d */
    private final int f5344d;

    /* renamed from: q */
    private final String f5345q;

    /* renamed from: x */
    private final e f5346x;

    /* renamed from: y */
    private final y1.d f5347y;
    private boolean X3 = false;
    private int V3 = 0;
    private final Object U3 = new Object();

    public d(Context context, int i10, String str, e eVar) {
        this.f5343c = context;
        this.f5344d = i10;
        this.f5346x = eVar;
        this.f5345q = str;
        this.f5347y = new y1.d(context, eVar.f(), this);
    }

    private void e() {
        synchronized (this.U3) {
            this.f5347y.e();
            this.f5346x.h().c(this.f5345q);
            PowerManager.WakeLock wakeLock = this.W3;
            if (wakeLock != null && wakeLock.isHeld()) {
                k.c().a(Y3, String.format("Releasing wakelock %s for WorkSpec %s", this.W3, this.f5345q), new Throwable[0]);
                this.W3.release();
            }
        }
    }

    private void g() {
        synchronized (this.U3) {
            if (this.V3 < 2) {
                this.V3 = 2;
                k c10 = k.c();
                String str = Y3;
                c10.a(str, String.format("Stopping work for WorkSpec %s", this.f5345q), new Throwable[0]);
                Intent f10 = b.f(this.f5343c, this.f5345q);
                e eVar = this.f5346x;
                eVar.k(new e.b(eVar, f10, this.f5344d));
                if (this.f5346x.e().f(this.f5345q)) {
                    k.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f5345q), new Throwable[0]);
                    Intent e10 = b.e(this.f5343c, this.f5345q);
                    e eVar2 = this.f5346x;
                    eVar2.k(new e.b(eVar2, e10, this.f5344d));
                } else {
                    k.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f5345q), new Throwable[0]);
                }
            } else {
                k.c().a(Y3, String.format("Already stopped work for %s", this.f5345q), new Throwable[0]);
            }
        }
    }

    @Override // v1.b
    public void a(String str, boolean z10) {
        k.c().a(Y3, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        e();
        if (z10) {
            Intent e10 = b.e(this.f5343c, this.f5345q);
            e eVar = this.f5346x;
            eVar.k(new e.b(eVar, e10, this.f5344d));
        }
        if (this.X3) {
            Intent b10 = b.b(this.f5343c);
            e eVar2 = this.f5346x;
            eVar2.k(new e.b(eVar2, b10, this.f5344d));
        }
    }

    @Override // d2.m.b
    public void b(String str) {
        k.c().a(Y3, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // y1.c
    public void c(List<String> list) {
        g();
    }

    @Override // y1.c
    public void d(List<String> list) {
        if (!list.contains(this.f5345q)) {
            return;
        }
        synchronized (this.U3) {
            if (this.V3 == 0) {
                this.V3 = 1;
                k.c().a(Y3, String.format("onAllConstraintsMet for %s", this.f5345q), new Throwable[0]);
                if (this.f5346x.e().i(this.f5345q)) {
                    this.f5346x.h().b(this.f5345q, 600000L, this);
                } else {
                    e();
                }
            } else {
                k.c().a(Y3, String.format("Already started work for %s", this.f5345q), new Throwable[0]);
            }
        }
    }

    public void f() {
        this.W3 = j.b(this.f5343c, String.format("%s (%s)", this.f5345q, Integer.valueOf(this.f5344d)));
        k c10 = k.c();
        String str = Y3;
        c10.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.W3, this.f5345q), new Throwable[0]);
        this.W3.acquire();
        p j10 = this.f5346x.g().p().O().j(this.f5345q);
        if (j10 == null) {
            g();
            return;
        }
        boolean b10 = j10.b();
        this.X3 = b10;
        if (b10) {
            this.f5347y.d(Collections.singletonList(j10));
            return;
        }
        k.c().a(str, String.format("No constraints for %s", this.f5345q), new Throwable[0]);
        d(Collections.singletonList(this.f5345q));
    }
}
