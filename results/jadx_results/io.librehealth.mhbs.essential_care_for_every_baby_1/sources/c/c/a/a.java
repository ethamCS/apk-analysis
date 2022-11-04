package c.c.a;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    final boolean f608a;

    /* renamed from: b */
    final String f609b;

    /* renamed from: c */
    final int f610c;

    /* renamed from: d */
    final int f611d;

    /* renamed from: e */
    SQLiteDatabase f612e;
    boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c.c.a.a$a */
    /* loaded from: classes.dex */
    public class C0033a implements DatabaseErrorHandler {
        C0033a(a aVar) {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    public a(String str, int i, boolean z, int i2) {
        this.f609b = str;
        this.f608a = z;
        this.f610c = i;
        this.f611d = i2;
    }

    public static void b(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    public void a() {
        this.f612e.close();
    }

    public SQLiteDatabase c() {
        return this.f612e;
    }

    public String d() {
        return "[" + e() + "] ";
    }

    String e() {
        Thread currentThread = Thread.currentThread();
        return "" + this.f610c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    public SQLiteDatabase f() {
        return this.f612e;
    }

    public void g() {
        this.f612e = SQLiteDatabase.openDatabase(this.f609b, null, 268435456);
    }

    public void h() {
        this.f612e = SQLiteDatabase.openDatabase(this.f609b, null, 1, new C0033a(this));
    }
}
