package n1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import m1.g;
import m1.j;
import m1.k;
import org.conscrypt.BuildConfig;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a implements g {

    /* renamed from: d */
    private static final String[] f16841d = {BuildConfig.FLAVOR, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: q */
    private static final String[] f16842q = new String[0];

    /* renamed from: c */
    private final SQLiteDatabase f16843c;

    /* renamed from: n1.a$a */
    /* loaded from: classes.dex */
    public class C0255a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ j f16844a;

        C0255a(j jVar) {
            a.this = r1;
            this.f16844a = jVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f16844a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* loaded from: classes.dex */
    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ j f16846a;

        b(j jVar) {
            a.this = r1;
            this.f16846a = jVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f16846a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f16843c = sQLiteDatabase;
    }

    @Override // m1.g
    public List<Pair<String, String>> C() {
        return this.f16843c.getAttachedDbs();
    }

    @Override // m1.g
    public void C0() {
        this.f16843c.setTransactionSuccessful();
    }

    @Override // m1.g
    public void F0(String str, Object[] objArr) {
        this.f16843c.execSQL(str, objArr);
    }

    @Override // m1.g
    public void H(String str) {
        this.f16843c.execSQL(str);
    }

    @Override // m1.g
    public void H0() {
        this.f16843c.beginTransactionNonExclusive();
    }

    @Override // m1.g
    public Cursor J(j jVar) {
        return this.f16843c.rawQueryWithFactory(new C0255a(jVar), jVar.e(), f16842q, null);
    }

    @Override // m1.g
    public Cursor R(j jVar, CancellationSignal cancellationSignal) {
        return m1.b.e(this.f16843c, jVar.e(), f16842q, null, cancellationSignal, new b(jVar));
    }

    @Override // m1.g
    public k T(String str) {
        return new e(this.f16843c.compileStatement(str));
    }

    @Override // m1.g
    public Cursor Y0(String str) {
        return J(new m1.a(str));
    }

    public boolean b(SQLiteDatabase sQLiteDatabase) {
        return this.f16843c == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16843c.close();
    }

    @Override // m1.g
    public boolean isOpen() {
        return this.f16843c.isOpen();
    }

    @Override // m1.g
    public String l() {
        return this.f16843c.getPath();
    }

    @Override // m1.g
    public boolean n0() {
        return this.f16843c.inTransaction();
    }

    @Override // m1.g
    public void q() {
        this.f16843c.endTransaction();
    }

    @Override // m1.g
    public void t() {
        this.f16843c.beginTransaction();
    }

    @Override // m1.g
    public boolean x0() {
        return m1.b.d(this.f16843c);
    }
}
