package b.o.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        public final int f2660a;

        public a(int i) {
            this.f2660a = i;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } else {
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e2) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e2);
                    }
                }
            } catch (Exception e3) {
                Log.w("SupportSQLite", "delete failed: ", e3);
            }
        }

        public void b(b.o.a.b bVar) {
        }

        public void c(b.o.a.b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.X());
            if (!bVar.isOpen()) {
                a(bVar.X());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = bVar.p();
                } catch (SQLiteException unused) {
                }
                try {
                    bVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    for (Pair<String, String> next : list) {
                        a((String) next.second);
                    }
                } else {
                    a(bVar.X());
                }
            }
        }

        public abstract void d(b.o.a.b bVar);

        public abstract void e(b.o.a.b bVar, int i, int i2);

        public void f(b.o.a.b bVar) {
        }

        public abstract void g(b.o.a.b bVar, int i, int i2);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final Context f2661a;

        /* renamed from: b */
        public final String f2662b;

        /* renamed from: c */
        public final a f2663c;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            Context f2664a;

            /* renamed from: b */
            String f2665b;

            /* renamed from: c */
            a f2666c;

            a(Context context) {
                this.f2664a = context;
            }

            public b a() {
                a aVar = this.f2666c;
                if (aVar != null) {
                    Context context = this.f2664a;
                    if (context == null) {
                        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                    }
                    return new b(context, this.f2665b, aVar);
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a b(a aVar) {
                this.f2666c = aVar;
                return this;
            }

            public a c(String str) {
                this.f2665b = str;
                return this;
            }
        }

        b(Context context, String str, a aVar) {
            this.f2661a = context;
            this.f2662b = str;
            this.f2663c = aVar;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: b.o.a.c$c */
    /* loaded from: classes.dex */
    public interface AbstractC0060c {
        c a(b bVar);
    }

    void a(boolean z);

    b.o.a.b b();

    String c();
}
