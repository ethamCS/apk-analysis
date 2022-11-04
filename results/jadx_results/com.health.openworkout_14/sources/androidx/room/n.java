package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
/* loaded from: classes.dex */
class n implements b.o.a.c {

    /* renamed from: a */
    private final Context f1914a;

    /* renamed from: b */
    private final String f1915b;

    /* renamed from: c */
    private final File f1916c;

    /* renamed from: d */
    private final int f1917d;

    /* renamed from: e */
    private final b.o.a.c f1918e;

    /* renamed from: f */
    private a f1919f;

    /* renamed from: g */
    private boolean f1920g;

    public n(Context context, String str, File file, int i, b.o.a.c cVar) {
        this.f1914a = context;
        this.f1915b = str;
        this.f1916c = file;
        this.f1917d = i;
        this.f1918e = cVar;
    }

    private void d(File file) {
        ReadableByteChannel readableByteChannel;
        if (this.f1915b != null) {
            readableByteChannel = Channels.newChannel(this.f1914a.getAssets().open(this.f1915b));
        } else if (this.f1916c == null) {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        } else {
            readableByteChannel = new FileInputStream(this.f1916c).getChannel();
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f1914a.getCacheDir());
        createTempFile.deleteOnExit();
        androidx.room.s.d.a(readableByteChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (createTempFile.renameTo(file)) {
        } else {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }

    private void f() {
        String c2 = c();
        File databasePath = this.f1914a.getDatabasePath(c2);
        a aVar = this.f1919f;
        androidx.room.s.a aVar2 = new androidx.room.s.a(c2, this.f1914a.getFilesDir(), aVar == null || aVar.j);
        try {
            aVar2.b();
            if (!databasePath.exists()) {
                try {
                    d(databasePath);
                    aVar2.c();
                    return;
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to copy database file.", e2);
                }
            } else if (this.f1919f == null) {
                aVar2.c();
                return;
            } else {
                try {
                    int c3 = androidx.room.s.c.c(databasePath);
                    int i = this.f1917d;
                    if (c3 == i) {
                        aVar2.c();
                        return;
                    } else if (this.f1919f.a(c3, i)) {
                        aVar2.c();
                        return;
                    } else {
                        if (this.f1914a.deleteDatabase(c2)) {
                            try {
                                d(databasePath);
                            } catch (IOException e3) {
                                Log.w("ROOM", "Unable to copy database file.", e3);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + c2 + ") for a copy destructive migration.");
                        }
                        aVar2.c();
                        return;
                    }
                } catch (IOException e4) {
                    Log.w("ROOM", "Unable to read database version.", e4);
                    aVar2.c();
                    return;
                }
            }
        } catch (Throwable th) {
            aVar2.c();
            throw th;
        }
        aVar2.c();
        throw th;
    }

    @Override // b.o.a.c
    public void a(boolean z) {
        this.f1918e.a(z);
    }

    @Override // b.o.a.c
    public synchronized b.o.a.b b() {
        if (!this.f1920g) {
            f();
            this.f1920g = true;
        }
        return this.f1918e.b();
    }

    @Override // b.o.a.c
    public String c() {
        return this.f1918e.c();
    }

    public void e(a aVar) {
        this.f1919f = aVar;
    }
}
