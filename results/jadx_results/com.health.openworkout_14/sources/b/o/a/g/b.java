package b.o.a.g;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import b.o.a.c;
/* loaded from: classes.dex */
class b implements b.o.a.c {

    /* renamed from: a */
    private final a f2671a;

    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: b */
        final b.o.a.g.a[] f2672b;

        /* renamed from: c */
        final c.a f2673c;

        /* renamed from: d */
        private boolean f2674d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b.o.a.g.b$a$a */
        /* loaded from: classes.dex */
        public class C0062a implements DatabaseErrorHandler {

            /* renamed from: a */
            final /* synthetic */ c.a f2675a;

            /* renamed from: b */
            final /* synthetic */ b.o.a.g.a[] f2676b;

            C0062a(c.a aVar, b.o.a.g.a[] aVarArr) {
                this.f2675a = aVar;
                this.f2676b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f2675a.c(a.c(this.f2676b, sQLiteDatabase));
            }
        }

        a(Context context, String str, b.o.a.g.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.f2660a, new C0062a(aVar, aVarArr));
            this.f2673c = aVar;
            this.f2672b = aVarArr;
        }

        static b.o.a.g.a c(b.o.a.g.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            b.o.a.g.a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new b.o.a.g.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        b.o.a.g.a a(SQLiteDatabase sQLiteDatabase) {
            return c(this.f2672b, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f2672b[0] = null;
        }

        synchronized b.o.a.b k() {
            this.f2674d = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f2674d) {
                return a(writableDatabase);
            }
            close();
            return k();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f2673c.b(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f2673c.d(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f2674d = true;
            this.f2673c.e(a(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f2674d) {
                this.f2673c.f(a(sQLiteDatabase));
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f2674d = true;
            this.f2673c.g(a(sQLiteDatabase), i, i2);
        }
    }

    public b(Context context, String str, c.a aVar) {
        this.f2671a = d(context, str, aVar);
    }

    private a d(Context context, String str, c.a aVar) {
        return new a(context, str, new b.o.a.g.a[1], aVar);
    }

    @Override // b.o.a.c
    public void a(boolean z) {
        this.f2671a.setWriteAheadLoggingEnabled(z);
    }

    @Override // b.o.a.c
    public b.o.a.b b() {
        return this.f2671a.k();
    }

    @Override // b.o.a.c
    public String c() {
        return this.f2671a.getDatabaseName();
    }
}
