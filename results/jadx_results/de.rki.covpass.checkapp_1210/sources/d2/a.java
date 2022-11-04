package d2;

import androidx.work.impl.WorkDatabase;
import c2.q;
import java.util.LinkedList;
import java.util.UUID;
import u1.n;
import u1.s;
/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: c */
    private final v1.c f8205c = new v1.c();

    /* renamed from: d2.a$a */
    /* loaded from: classes.dex */
    public class C0118a extends a {

        /* renamed from: d */
        final /* synthetic */ v1.i f8206d;

        /* renamed from: q */
        final /* synthetic */ UUID f8207q;

        C0118a(v1.i iVar, UUID uuid) {
            this.f8206d = iVar;
            this.f8207q = uuid;
        }

        @Override // d2.a
        void h() {
            WorkDatabase p10 = this.f8206d.p();
            p10.e();
            try {
                a(this.f8206d, this.f8207q.toString());
                p10.D();
                p10.i();
                g(this.f8206d);
            } catch (Throwable th2) {
                p10.i();
                throw th2;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends a {

        /* renamed from: d */
        final /* synthetic */ v1.i f8208d;

        /* renamed from: q */
        final /* synthetic */ String f8209q;

        b(v1.i iVar, String str) {
            this.f8208d = iVar;
            this.f8209q = str;
        }

        @Override // d2.a
        void h() {
            WorkDatabase p10 = this.f8208d.p();
            p10.e();
            try {
                for (String str : p10.O().n(this.f8209q)) {
                    a(this.f8208d, str);
                }
                p10.D();
                p10.i();
                g(this.f8208d);
            } catch (Throwable th2) {
                p10.i();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends a {

        /* renamed from: d */
        final /* synthetic */ v1.i f8210d;

        /* renamed from: q */
        final /* synthetic */ String f8211q;

        /* renamed from: x */
        final /* synthetic */ boolean f8212x;

        c(v1.i iVar, String str, boolean z10) {
            this.f8210d = iVar;
            this.f8211q = str;
            this.f8212x = z10;
        }

        @Override // d2.a
        void h() {
            WorkDatabase p10 = this.f8210d.p();
            p10.e();
            try {
                for (String str : p10.O().e(this.f8211q)) {
                    a(this.f8210d, str);
                }
                p10.D();
                p10.i();
                if (!this.f8212x) {
                    return;
                }
                g(this.f8210d);
            } catch (Throwable th2) {
                p10.i();
                throw th2;
            }
        }
    }

    public static a b(UUID uuid, v1.i iVar) {
        return new C0118a(iVar, uuid);
    }

    public static a c(String str, v1.i iVar, boolean z10) {
        return new c(iVar, str, z10);
    }

    public static a d(String str, v1.i iVar) {
        return new b(iVar, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        q O = workDatabase.O();
        c2.b G = workDatabase.G();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            s.a h10 = O.h(str2);
            if (h10 != s.a.SUCCEEDED && h10 != s.a.FAILED) {
                O.l(s.a.CANCELLED, str2);
            }
            linkedList.addAll(G.d(str2));
        }
    }

    void a(v1.i iVar, String str) {
        f(iVar.p(), str);
        iVar.m().k(str);
        for (v1.e eVar : iVar.o()) {
            eVar.b(str);
        }
    }

    public n e() {
        return this.f8205c;
    }

    void g(v1.i iVar) {
        v1.f.b(iVar.i(), iVar.p(), iVar.o());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f8205c.a(n.f22565a);
        } catch (Throwable th2) {
            this.f8205c.a(new n.b.a(th2));
        }
    }
}
