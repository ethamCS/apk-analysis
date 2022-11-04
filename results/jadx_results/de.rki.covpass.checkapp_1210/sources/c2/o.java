package c2;

import androidx.room.i0;
/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a */
    private final i0 f6155a;

    /* renamed from: b */
    private final h1.g<m> f6156b;

    /* renamed from: c */
    private final h1.m f6157c;

    /* renamed from: d */
    private final h1.m f6158d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h1.g<m> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0 i0Var) {
            super(i0Var);
            o.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void g(m1.k kVar, m mVar) {
            String str = mVar.f6153a;
            if (str == null) {
                kVar.a0(1);
            } else {
                kVar.K(1, str);
            }
            byte[] k10 = androidx.work.a.k(mVar.f6154b);
            if (k10 == null) {
                kVar.a0(2);
            } else {
                kVar.L0(2, k10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i0 i0Var) {
            super(i0Var);
            o.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i0 i0Var) {
            super(i0Var);
            o.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(i0 i0Var) {
        this.f6155a = i0Var;
        this.f6156b = new a(i0Var);
        this.f6157c = new b(i0Var);
        this.f6158d = new c(i0Var);
    }

    @Override // c2.n
    public void a(String str) {
        this.f6155a.d();
        m1.k a10 = this.f6157c.a();
        if (str == null) {
            a10.a0(1);
        } else {
            a10.K(1, str);
        }
        this.f6155a.e();
        try {
            a10.S();
            this.f6155a.D();
        } finally {
            this.f6155a.i();
            this.f6157c.f(a10);
        }
    }

    @Override // c2.n
    public void b() {
        this.f6155a.d();
        m1.k a10 = this.f6158d.a();
        this.f6155a.e();
        try {
            a10.S();
            this.f6155a.D();
        } finally {
            this.f6155a.i();
            this.f6158d.f(a10);
        }
    }
}
