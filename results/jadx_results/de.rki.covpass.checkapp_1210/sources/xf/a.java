package xf;

import eg.a0;
import eg.n;
import eg.o;
import eg.y;
import hc.t;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H&¨\u0006\u0014"}, d2 = {"Lxf/a;", BuildConfig.FLAVOR, "Ljava/io/File;", "file", "Leg/a0;", "b", "Leg/y;", "c", "e", "Ltb/e0;", "a", BuildConfig.FLAVOR, "f", BuildConfig.FLAVOR, "h", "from", "to", "g", "directory", "d", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface a {
    public static final C0452a Companion = C0452a.f25607a;

    /* renamed from: a */
    public static final a f25606a = new C0452a.C0453a();

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\b"}, d2 = {"Lxf/a$a;", BuildConfig.FLAVOR, "Lxf/a;", "SYSTEM", "Lxf/a;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* renamed from: xf.a$a */
    /* loaded from: classes3.dex */
    public static final class C0452a {

        /* renamed from: a */
        static final /* synthetic */ C0452a f25607a = new C0452a();

        @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0018"}, d2 = {"Lxf/a$a$a;", "Lxf/a;", "Ljava/io/File;", "file", "Leg/a0;", "b", "Leg/y;", "c", "e", "Ltb/e0;", "a", BuildConfig.FLAVOR, "f", BuildConfig.FLAVOR, "h", "from", "to", "g", "directory", "d", BuildConfig.FLAVOR, "toString", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* renamed from: xf.a$a$a */
        /* loaded from: classes3.dex */
        private static final class C0453a implements a {
            @Override // xf.a
            public void a(File file) {
                t.e(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException(t.l("failed to delete ", file));
            }

            @Override // xf.a
            public a0 b(File file) {
                t.e(file, "file");
                return n.j(file);
            }

            @Override // xf.a
            public y c(File file) {
                y g10;
                y g11;
                t.e(file, "file");
                try {
                    g11 = o.g(file, false, 1, null);
                    return g11;
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    g10 = o.g(file, false, 1, null);
                    return g10;
                }
            }

            @Override // xf.a
            public void d(File file) {
                t.e(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int i10 = 0;
                    int length = listFiles.length;
                    while (i10 < length) {
                        File file2 = listFiles[i10];
                        i10++;
                        if (file2.isDirectory()) {
                            t.d(file2, "file");
                            d(file2);
                        }
                        if (!file2.delete()) {
                            throw new IOException(t.l("failed to delete ", file2));
                        }
                    }
                    return;
                }
                throw new IOException(t.l("not a readable directory: ", file));
            }

            @Override // xf.a
            public y e(File file) {
                t.e(file, "file");
                try {
                    return n.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return n.a(file);
                }
            }

            @Override // xf.a
            public boolean f(File file) {
                t.e(file, "file");
                return file.exists();
            }

            @Override // xf.a
            public void g(File file, File file2) {
                t.e(file, "from");
                t.e(file2, "to");
                a(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // xf.a
            public long h(File file) {
                t.e(file, "file");
                return file.length();
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C0452a() {
        }
    }

    void a(File file);

    a0 b(File file);

    y c(File file);

    void d(File file);

    y e(File file);

    boolean f(File file);

    void g(File file, File file2);

    long h(File file);
}
