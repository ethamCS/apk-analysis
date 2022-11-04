package n1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import m1.g;
import m1.h;
/* loaded from: classes.dex */
class b implements h {
    private a U3;
    private boolean V3;

    /* renamed from: c */
    private final Context f16848c;

    /* renamed from: d */
    private final String f16849d;

    /* renamed from: q */
    private final h.a f16850q;

    /* renamed from: x */
    private final boolean f16851x;

    /* renamed from: y */
    private final Object f16852y = new Object();

    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: c */
        final n1.a[] f16853c;

        /* renamed from: d */
        final h.a f16854d;

        /* renamed from: q */
        private boolean f16855q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n1.b$a$a */
        /* loaded from: classes.dex */
        public class C0256a implements DatabaseErrorHandler {

            /* renamed from: a */
            final /* synthetic */ h.a f16856a;

            /* renamed from: b */
            final /* synthetic */ n1.a[] f16857b;

            C0256a(h.a aVar, n1.a[] aVarArr) {
                this.f16856a = aVar;
                this.f16857b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f16856a.c(a.e(this.f16857b, sQLiteDatabase));
            }
        }

        a(Context context, String str, n1.a[] aVarArr, h.a aVar) {
            super(context, str, null, aVar.f16248a, new C0256a(aVar, aVarArr));
            this.f16854d = aVar;
            this.f16853c = aVarArr;
        }

        static n1.a e(n1.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            n1.a aVar = aVarArr[0];
            if (aVar == null || !aVar.b(sQLiteDatabase)) {
                aVarArr[0] = new n1.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        n1.a b(SQLiteDatabase sQLiteDatabase) {
            return e(this.f16853c, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f16853c[0] = null;
        }

        synchronized g f() {
            this.f16855q = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f16855q) {
                return b(writableDatabase);
            }
            close();
            return f();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f16854d.b(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f16854d.d(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f16855q = true;
            this.f16854d.e(b(sQLiteDatabase), i10, i11);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f16855q) {
                this.f16854d.f(b(sQLiteDatabase));
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f16855q = true;
            this.f16854d.g(b(sQLiteDatabase), i10, i11);
        }
    }

    public b(Context context, String str, h.a aVar, boolean z10) {
        this.f16848c = context;
        this.f16849d = str;
        this.f16850q = aVar;
        this.f16851x = z10;
    }

    private a b() {
        a aVar;
        synchronized (this.f16852y) {
            if (this.U3 == null) {
                n1.a[] aVarArr = new n1.a[1];
                if (this.f16849d == null || !this.f16851x) {
                    this.U3 = new a(this.f16848c, this.f16849d, aVarArr, this.f16850q);
                } else {
                    this.U3 = new a(this.f16848c, new File(m1.d.a(this.f16848c), this.f16849d).getAbsolutePath(), aVarArr, this.f16850q);
                }
                m1.b.f(this.U3, this.V3);
            }
            aVar = this.U3;
        }
        return aVar;
    }

    @Override // m1.h
    public g U0() {
        return b().f();
    }

    @Override // m1.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b().close();
    }

    @Override // m1.h
    public String getDatabaseName() {
        return this.f16849d;
    }

    @Override // m1.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f16852y) {
            a aVar = this.U3;
            if (aVar != null) {
                m1.b.f(aVar, z10);
            }
            this.V3 = z10;
        }
    }
}
