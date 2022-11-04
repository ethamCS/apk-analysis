package b.o.a.g;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import b.o.a.f;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a implements b.o.a.b {

    /* renamed from: c */
    private static final String[] f2667c = new String[0];

    /* renamed from: b */
    private final SQLiteDatabase f2668b;

    /* renamed from: b.o.a.g.a$a */
    /* loaded from: classes.dex */
    public class C0061a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ b.o.a.e f2669a;

        C0061a(a aVar, b.o.a.e eVar) {
            this.f2669a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f2669a.c(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* loaded from: classes.dex */
    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ b.o.a.e f2670a;

        b(a aVar, b.o.a.e eVar) {
            this.f2670a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f2670a.c(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f2668b = sQLiteDatabase;
    }

    @Override // b.o.a.b
    public void B() {
        this.f2668b.setTransactionSuccessful();
    }

    @Override // b.o.a.b
    public f D(String str) {
        return new e(this.f2668b.compileStatement(str));
    }

    @Override // b.o.a.b
    public Cursor G(b.o.a.e eVar) {
        return this.f2668b.rawQueryWithFactory(new C0061a(this, eVar), eVar.a(), f2667c, null);
    }

    @Override // b.o.a.b
    public Cursor V(String str) {
        return G(new b.o.a.a(str));
    }

    @Override // b.o.a.b
    public String X() {
        return this.f2668b.getPath();
    }

    @Override // b.o.a.b
    public Cursor Z(b.o.a.e eVar, CancellationSignal cancellationSignal) {
        return this.f2668b.rawQueryWithFactory(new b(this, eVar), eVar.a(), f2667c, null, cancellationSignal);
    }

    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f2668b == sQLiteDatabase;
    }

    @Override // b.o.a.b
    public boolean b0() {
        return this.f2668b.inTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2668b.close();
    }

    @Override // b.o.a.b
    public void g() {
        this.f2668b.endTransaction();
    }

    @Override // b.o.a.b
    public void h() {
        this.f2668b.beginTransaction();
    }

    @Override // b.o.a.b
    public boolean isOpen() {
        return this.f2668b.isOpen();
    }

    @Override // b.o.a.b
    public List<Pair<String, String>> p() {
        return this.f2668b.getAttachedDbs();
    }

    @Override // b.o.a.b
    public void r(boolean z) {
        this.f2668b.setForeignKeyConstraintsEnabled(z);
    }

    @Override // b.o.a.b
    public void t(String str) {
        this.f2668b.execSQL(str);
    }
}
