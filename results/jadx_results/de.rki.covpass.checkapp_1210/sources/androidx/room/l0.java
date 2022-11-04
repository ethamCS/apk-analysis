package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
class l0 implements m1.h, k {
    private final m1.h U3;
    private j V3;
    private boolean W3;

    /* renamed from: c */
    private final Context f4956c;

    /* renamed from: d */
    private final String f4957d;

    /* renamed from: q */
    private final File f4958q;

    /* renamed from: x */
    private final Callable<InputStream> f4959x;

    /* renamed from: y */
    private final int f4960y;

    public l0(Context context, String str, File file, Callable<InputStream> callable, int i10, m1.h hVar) {
        this.f4956c = context;
        this.f4957d = str;
        this.f4958q = file;
        this.f4959x = callable;
        this.f4960y = i10;
        this.U3 = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e(java.io.File r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.f4957d
            if (r0 == 0) goto L15
            android.content.Context r0 = r4.f4956c
            android.content.res.AssetManager r0 = r0.getAssets()
            java.lang.String r1 = r4.f4957d
            java.io.InputStream r0 = r0.open(r1)
        L10:
            java.nio.channels.ReadableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
            goto L30
        L15:
            java.io.File r0 = r4.f4958q
            if (r0 == 0) goto L25
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r4.f4958q
            r0.<init>(r1)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            goto L30
        L25:
            java.util.concurrent.Callable<java.io.InputStream> r0 = r4.f4959x
            if (r0 == 0) goto Lba
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> Lb1
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.lang.Exception -> Lb1
            goto L10
        L30:
            android.content.Context r1 = r4.f4956c
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r2 = "room-copy-helper"
            java.lang.String r3 = ".tmp"
            java.io.File r1 = java.io.File.createTempFile(r2, r3, r1)
            r1.deleteOnExit()
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r1)
            java.nio.channels.FileChannel r2 = r2.getChannel()
            j1.d.a(r0, r2)
            java.io.File r0 = r5.getParentFile()
            if (r0 == 0) goto L7b
            boolean r2 = r0.exists()
            if (r2 != 0) goto L7b
            boolean r0 = r0.mkdirs()
            if (r0 == 0) goto L60
            goto L7b
        L60:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to create directories for "
            r0.append(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L7b:
            r4.f(r1, r6)
            boolean r6 = r1.renameTo(r5)
            if (r6 == 0) goto L85
            return
        L85:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to move intermediate file ("
            r0.append(r2)
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = ") to destination ("
            r0.append(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            r0.append(r5)
            java.lang.String r5 = ")."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        Lb1:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "inputStreamCallable exception on call"
            r6.<init>(r0, r5)
            throw r6
        Lba:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "copyFromAssetPath, copyFromFile and copyFromInputStream are all null!"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.l0.e(java.io.File, boolean):void");
    }

    private void f(File file, boolean z10) {
        j jVar = this.V3;
        if (jVar != null) {
            Objects.requireNonNull(jVar);
        }
    }

    private void i(boolean z10) {
        String databaseName = getDatabaseName();
        File databasePath = this.f4956c.getDatabasePath(databaseName);
        j jVar = this.V3;
        j1.a aVar = new j1.a(databaseName, this.f4956c.getFilesDir(), jVar == null || jVar.f4929l);
        try {
            aVar.b();
            if (!databasePath.exists()) {
                try {
                    e(databasePath, z10);
                    aVar.c();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            } else if (this.V3 == null) {
                aVar.c();
                return;
            } else {
                try {
                    int d10 = j1.c.d(databasePath);
                    int i10 = this.f4960y;
                    if (d10 == i10) {
                        aVar.c();
                        return;
                    } else if (this.V3.a(d10, i10)) {
                        aVar.c();
                        return;
                    } else {
                        if (this.f4956c.deleteDatabase(databaseName)) {
                            try {
                                e(databasePath, z10);
                            } catch (IOException e11) {
                                Log.w("ROOM", "Unable to copy database file.", e11);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar.c();
                        return;
                    }
                } catch (IOException e12) {
                    Log.w("ROOM", "Unable to read database version.", e12);
                    aVar.c();
                    return;
                }
            }
        } catch (Throwable th2) {
            aVar.c();
            throw th2;
        }
        aVar.c();
        throw th2;
    }

    @Override // m1.h
    public synchronized m1.g U0() {
        if (!this.W3) {
            i(true);
            this.W3 = true;
        }
        return this.U3.U0();
    }

    @Override // androidx.room.k
    public m1.h b() {
        return this.U3;
    }

    @Override // m1.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.U3.close();
        this.W3 = false;
    }

    @Override // m1.h
    public String getDatabaseName() {
        return this.U3.getDatabaseName();
    }

    public void h(j jVar) {
        this.V3 = jVar;
    }

    @Override // m1.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.U3.setWriteAheadLoggingEnabled(z10);
    }
}
