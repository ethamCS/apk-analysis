package c2;

import android.database.Cursor;
import androidx.room.i0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a */
    private final i0 f6210a;

    /* renamed from: b */
    private final h1.g<s> f6211b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h1.g<s> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0 i0Var) {
            super(i0Var);
            u.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void g(m1.k kVar, s sVar) {
            String str = sVar.f6208a;
            if (str == null) {
                kVar.a0(1);
            } else {
                kVar.K(1, str);
            }
            String str2 = sVar.f6209b;
            if (str2 == null) {
                kVar.a0(2);
            } else {
                kVar.K(2, str2);
            }
        }
    }

    public u(i0 i0Var) {
        this.f6210a = i0Var;
        this.f6211b = new a(i0Var);
    }

    @Override // c2.t
    public void a(s sVar) {
        this.f6210a.d();
        this.f6210a.e();
        try {
            this.f6211b.h(sVar);
            this.f6210a.D();
        } finally {
            this.f6210a.i();
        }
    }

    @Override // c2.t
    public List<String> b(String str) {
        h1.l f10 = h1.l.f("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            f10.a0(1);
        } else {
            f10.K(1, str);
        }
        this.f6210a.d();
        Cursor c10 = j1.c.c(this.f6210a, f10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                arrayList.add(c10.getString(0));
            }
            return arrayList;
        } finally {
            c10.close();
            f10.j();
        }
    }
}
