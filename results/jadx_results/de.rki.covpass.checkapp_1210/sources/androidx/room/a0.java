package androidx.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class a0 implements m1.g {

    /* renamed from: c */
    private final m1.g f4840c;

    /* renamed from: d */
    private final i0.f f4841d;

    /* renamed from: q */
    private final Executor f4842q;

    public a0(m1.g gVar, i0.f fVar, Executor executor) {
        this.f4840c = gVar;
        this.f4841d = fVar;
        this.f4842q = executor;
    }

    public /* synthetic */ void B(String str) {
        this.f4841d.a(str, new ArrayList(0));
    }

    public /* synthetic */ void G(String str, List list) {
        this.f4841d.a(str, list);
    }

    public /* synthetic */ void M(String str) {
        this.f4841d.a(str, Collections.emptyList());
    }

    public /* synthetic */ void V(m1.j jVar, d0 d0Var) {
        this.f4841d.a(jVar.e(), d0Var.b());
    }

    public /* synthetic */ void W(m1.j jVar, d0 d0Var) {
        this.f4841d.a(jVar.e(), d0Var.b());
    }

    public /* synthetic */ void e0() {
        this.f4841d.a("TRANSACTION SUCCESSFUL", Collections.emptyList());
    }

    public /* synthetic */ void s() {
        this.f4841d.a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    public /* synthetic */ void u() {
        this.f4841d.a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    public /* synthetic */ void z() {
        this.f4841d.a("END TRANSACTION", Collections.emptyList());
    }

    @Override // m1.g
    public List<Pair<String, String>> C() {
        return this.f4840c.C();
    }

    @Override // m1.g
    public void C0() {
        this.f4842q.execute(new Runnable() { // from class: androidx.room.t
            @Override // java.lang.Runnable
            public final void run() {
                a0.this.e0();
            }
        });
        this.f4840c.C0();
    }

    @Override // m1.g
    public void F0(final String str, Object[] objArr) {
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.f4842q.execute(new Runnable() { // from class: androidx.room.x
            @Override // java.lang.Runnable
            public final void run() {
                a0.this.G(str, arrayList);
            }
        });
        this.f4840c.F0(str, arrayList.toArray());
    }

    @Override // m1.g
    public void H(final String str) {
        this.f4842q.execute(new Runnable() { // from class: androidx.room.v
            @Override // java.lang.Runnable
            public final void run() {
                a0.this.B(str);
            }
        });
        this.f4840c.H(str);
    }

    @Override // m1.g
    public void H0() {
        this.f4842q.execute(new Runnable() { // from class: androidx.room.s
            @Override // java.lang.Runnable
            public final void run() {
                a0.this.u();
            }
        });
        this.f4840c.H0();
    }

    @Override // m1.g
    public Cursor J(final m1.j jVar) {
        final d0 d0Var = new d0();
        jVar.b(d0Var);
        this.f4842q.execute(new Runnable() { // from class: androidx.room.y
            @Override // java.lang.Runnable
            public final void run() {
                a0.this.V(jVar, d0Var);
            }
        });
        return this.f4840c.J(jVar);
    }

    @Override // m1.g
    public Cursor R(final m1.j jVar, CancellationSignal cancellationSignal) {
        final d0 d0Var = new d0();
        jVar.b(d0Var);
        this.f4842q.execute(new Runnable() { // from class: androidx.room.z
            @Override // java.lang.Runnable
            public final void run() {
                a0.this.W(jVar, d0Var);
            }
        });
        return this.f4840c.J(jVar);
    }

    @Override // m1.g
    public m1.k T(String str) {
        return new g0(this.f4840c.T(str), this.f4841d, str, this.f4842q);
    }

    @Override // m1.g
    public Cursor Y0(final String str) {
        this.f4842q.execute(new Runnable() { // from class: androidx.room.w
            @Override // java.lang.Runnable
            public final void run() {
                a0.this.M(str);
            }
        });
        return this.f4840c.Y0(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4840c.close();
    }

    @Override // m1.g
    public boolean isOpen() {
        return this.f4840c.isOpen();
    }

    @Override // m1.g
    public String l() {
        return this.f4840c.l();
    }

    @Override // m1.g
    public boolean n0() {
        return this.f4840c.n0();
    }

    @Override // m1.g
    public void q() {
        this.f4842q.execute(new Runnable() { // from class: androidx.room.r
            @Override // java.lang.Runnable
            public final void run() {
                a0.this.z();
            }
        });
        this.f4840c.q();
    }

    @Override // m1.g
    public void t() {
        this.f4842q.execute(new Runnable() { // from class: androidx.room.u
            @Override // java.lang.Runnable
            public final void run() {
                a0.this.s();
            }
        });
        this.f4840c.t();
    }

    @Override // m1.g
    public boolean x0() {
        return this.f4840c.x0();
    }
}
