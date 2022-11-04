package m1;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public interface h extends Closeable {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        public final int f16248a;

        public a(int i10) {
            this.f16248a = i10;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                m1.b.c(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(g gVar) {
        }

        public void c(g gVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + gVar.l());
            if (!gVar.isOpen()) {
                a(gVar.l());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = gVar.C();
                } catch (SQLiteException unused) {
                }
                try {
                    gVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    for (Pair<String, String> next : list) {
                        a((String) next.second);
                    }
                } else {
                    a(gVar.l());
                }
            }
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i10, int i11);

        public void f(g gVar) {
        }

        public abstract void g(g gVar, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final Context f16249a;

        /* renamed from: b */
        public final String f16250b;

        /* renamed from: c */
        public final a f16251c;

        /* renamed from: d */
        public final boolean f16252d;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            Context f16253a;

            /* renamed from: b */
            String f16254b;

            /* renamed from: c */
            a f16255c;

            /* renamed from: d */
            boolean f16256d;

            a(Context context) {
                this.f16253a = context;
            }

            public b a() {
                if (this.f16255c != null) {
                    if (this.f16253a == null) {
                        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                    }
                    if (this.f16256d && TextUtils.isEmpty(this.f16254b)) {
                        throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                    }
                    return new b(this.f16253a, this.f16254b, this.f16255c, this.f16256d);
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a b(a aVar) {
                this.f16255c = aVar;
                return this;
            }

            public a c(String str) {
                this.f16254b = str;
                return this;
            }

            public a d(boolean z10) {
                this.f16256d = z10;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z10) {
            this.f16249a = context;
            this.f16250b = str;
            this.f16251c = aVar;
            this.f16252d = z10;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        h a(b bVar);
    }

    g U0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
