package c2;

import android.database.Cursor;
import androidx.room.i0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a */
    private final i0 f6150a;

    /* renamed from: b */
    private final h1.g<j> f6151b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h1.g<j> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0 i0Var) {
            super(i0Var);
            l.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void g(m1.k kVar, j jVar) {
            String str = jVar.f6148a;
            if (str == null) {
                kVar.a0(1);
            } else {
                kVar.K(1, str);
            }
            String str2 = jVar.f6149b;
            if (str2 == null) {
                kVar.a0(2);
            } else {
                kVar.K(2, str2);
            }
        }
    }

    public l(i0 i0Var) {
        this.f6150a = i0Var;
        this.f6151b = new a(i0Var);
    }

    @Override // c2.k
    public void a(j jVar) {
        this.f6150a.d();
        this.f6150a.e();
        try {
            this.f6151b.h(jVar);
            this.f6150a.D();
        } finally {
            this.f6150a.i();
        }
    }

    @Override // c2.k
    public List<String> b(String str) {
        h1.l f10 = h1.l.f("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            f10.a0(1);
        } else {
            f10.K(1, str);
        }
        this.f6150a.d();
        Cursor c10 = j1.c.c(this.f6150a, f10, false, null);
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
