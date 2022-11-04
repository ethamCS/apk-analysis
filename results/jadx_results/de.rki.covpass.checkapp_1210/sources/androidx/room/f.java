package androidx.room;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class f implements m1.h, k {

    /* renamed from: c */
    private final m1.h f4856c;

    /* renamed from: d */
    private final a f4857d;

    /* renamed from: q */
    private final androidx.room.a f4858q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements m1.g {

        /* renamed from: c */
        private final androidx.room.a f4859c;

        a(androidx.room.a aVar) {
            this.f4859c = aVar;
        }

        public static /* synthetic */ Boolean n(m1.g gVar) {
            return Boolean.valueOf(gVar.x0());
        }

        public static /* synthetic */ Object p(m1.g gVar) {
            return null;
        }

        @Override // m1.g
        public List<Pair<String, String>> C() {
            return (List) this.f4859c.c(h1.a.f11139a);
        }

        @Override // m1.g
        public void C0() {
            m1.g d10 = this.f4859c.d();
            if (d10 != null) {
                d10.C0();
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
        }

        @Override // m1.g
        public void F0(final String str, final Object[] objArr) {
            this.f4859c.c(new o.a() { // from class: androidx.room.c
                @Override // o.a
                public final Object apply(Object obj) {
                    Object F0;
                    F0 = ((m1.g) obj).F0(str, objArr);
                    return F0;
                }
            });
        }

        @Override // m1.g
        public void H(final String str) {
            this.f4859c.c(new o.a() { // from class: androidx.room.b
                @Override // o.a
                public final Object apply(Object obj) {
                    Object H;
                    H = ((m1.g) obj).H(str);
                    return H;
                }
            });
        }

        @Override // m1.g
        public void H0() {
            try {
                this.f4859c.e().H0();
            } catch (Throwable th2) {
                this.f4859c.b();
                throw th2;
            }
        }

        @Override // m1.g
        public Cursor J(m1.j jVar) {
            try {
                return new c(this.f4859c.e().J(jVar), this.f4859c);
            } catch (Throwable th2) {
                this.f4859c.b();
                throw th2;
            }
        }

        @Override // m1.g
        public Cursor R(m1.j jVar, CancellationSignal cancellationSignal) {
            try {
                return new c(this.f4859c.e().R(jVar, cancellationSignal), this.f4859c);
            } catch (Throwable th2) {
                this.f4859c.b();
                throw th2;
            }
        }

        @Override // m1.g
        public m1.k T(String str) {
            return new b(str, this.f4859c);
        }

        @Override // m1.g
        public Cursor Y0(String str) {
            try {
                return new c(this.f4859c.e().Y0(str), this.f4859c);
            } catch (Throwable th2) {
                this.f4859c.b();
                throw th2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f4859c.a();
        }

        @Override // m1.g
        public boolean isOpen() {
            m1.g d10 = this.f4859c.d();
            if (d10 == null) {
                return false;
            }
            return d10.isOpen();
        }

        @Override // m1.g
        public String l() {
            return (String) this.f4859c.c(h1.b.f11140a);
        }

        @Override // m1.g
        public boolean n0() {
            if (this.f4859c.d() == null) {
                return false;
            }
            return ((Boolean) this.f4859c.c(h1.c.f11141a)).booleanValue();
        }

        @Override // m1.g
        public void q() {
            if (this.f4859c.d() != null) {
                try {
                    this.f4859c.d().q();
                    return;
                } finally {
                    this.f4859c.b();
                }
            }
            throw new IllegalStateException("End transaction called but delegateDb is null");
        }

        void r() {
            this.f4859c.c(e.f4854a);
        }

        @Override // m1.g
        public void t() {
            try {
                this.f4859c.e().t();
            } catch (Throwable th2) {
                this.f4859c.b();
                throw th2;
            }
        }

        @Override // m1.g
        public boolean x0() {
            return ((Boolean) this.f4859c.c(d.f4852a)).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public static class b implements m1.k {

        /* renamed from: c */
        private final String f4860c;

        /* renamed from: d */
        private final ArrayList<Object> f4861d = new ArrayList<>();

        /* renamed from: q */
        private final androidx.room.a f4862q;

        b(String str, androidx.room.a aVar) {
            this.f4860c = str;
            this.f4862q = aVar;
        }

        private void e(m1.k kVar) {
            int i10 = 0;
            while (i10 < this.f4861d.size()) {
                int i11 = i10 + 1;
                Object obj = this.f4861d.get(i10);
                if (obj == null) {
                    kVar.a0(i11);
                } else if (obj instanceof Long) {
                    kVar.A0(i11, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.d0(i11, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.K(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.L0(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private <T> T f(final o.a<m1.k, T> aVar) {
            return (T) this.f4862q.c(new o.a() { // from class: androidx.room.g
                @Override // o.a
                public final Object apply(Object obj) {
                    Object h10;
                    h10 = f.b.this.h(aVar, (m1.g) obj);
                    return h10;
                }
            });
        }

        public /* synthetic */ Object h(o.a aVar, m1.g gVar) {
            m1.k T = gVar.T(this.f4860c);
            e(T);
            return aVar.apply(T);
        }

        private void i(int i10, Object obj) {
            int i11 = i10 - 1;
            if (i11 >= this.f4861d.size()) {
                for (int size = this.f4861d.size(); size <= i11; size++) {
                    this.f4861d.add(null);
                }
            }
            this.f4861d.set(i11, obj);
        }

        @Override // m1.i
        public void A0(int i10, long j10) {
            i(i10, Long.valueOf(j10));
        }

        @Override // m1.i
        public void K(int i10, String str) {
            i(i10, str);
        }

        @Override // m1.i
        public void L0(int i10, byte[] bArr) {
            i(i10, bArr);
        }

        @Override // m1.k
        public int S() {
            return ((Integer) f(h1.d.f11142a)).intValue();
        }

        @Override // m1.k
        public long X0() {
            return ((Long) f(h1.e.f11143a)).longValue();
        }

        @Override // m1.i
        public void a0(int i10) {
            i(i10, null);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // m1.i
        public void d0(int i10, double d10) {
            i(i10, Double.valueOf(d10));
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements Cursor {

        /* renamed from: c */
        private final Cursor f4863c;

        /* renamed from: d */
        private final androidx.room.a f4864d;

        c(Cursor cursor, androidx.room.a aVar) {
            this.f4863c = cursor;
            this.f4864d = aVar;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f4863c.close();
            this.f4864d.b();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f4863c.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @Deprecated
        public void deactivate() {
            this.f4863c.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f4863c.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f4863c.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f4863c.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f4863c.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f4863c.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f4863c.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f4863c.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f4863c.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f4863c.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f4863c.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f4863c.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f4863c.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return m1.c.a(this.f4863c);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return m1.f.a(this.f4863c);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f4863c.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f4863c.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f4863c.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f4863c.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f4863c.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f4863c.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f4863c.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f4863c.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f4863c.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f4863c.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f4863c.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f4863c.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f4863c.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f4863c.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f4863c.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f4863c.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f4863c.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f4863c.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f4863c.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @Deprecated
        public boolean requery() {
            return this.f4863c.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f4863c.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            m1.e.a(this.f4863c, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f4863c.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List<Uri> list) {
            m1.f.b(this.f4863c, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f4863c.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f4863c.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public f(m1.h hVar, androidx.room.a aVar) {
        this.f4856c = hVar;
        this.f4858q = aVar;
        aVar.f(hVar);
        this.f4857d = new a(aVar);
    }

    @Override // m1.h
    public m1.g U0() {
        this.f4857d.r();
        return this.f4857d;
    }

    @Override // androidx.room.k
    public m1.h b() {
        return this.f4856c;
    }

    @Override // m1.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f4857d.close();
        } catch (IOException e10) {
            j1.e.a(e10);
        }
    }

    public androidx.room.a e() {
        return this.f4858q;
    }

    @Override // m1.h
    public String getDatabaseName() {
        return this.f4856c.getDatabaseName();
    }

    @Override // m1.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f4856c.setWriteAheadLoggingEnabled(z10);
    }
}
