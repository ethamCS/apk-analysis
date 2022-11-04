package v1;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import u1.k;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    private static final String f23861a = k.f("WrkDbPathHelper");

    /* renamed from: b */
    private static final String[] f23862b = {"-journal", "-shm", "-wal"};

    public static File a(Context context) {
        return c(context, "androidx.work.workdb");
    }

    public static File b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    private static File c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static String d() {
        return "androidx.work.workdb";
    }

    public static void e(Context context) {
        if (b(context).exists()) {
            k.c().a(f23861a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> f10 = f(context);
            for (File file : f10.keySet()) {
                File file2 = f10.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        k.c().h(f23861a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    k.c().a(f23861a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
                }
            }
        }
    }

    public static Map<File, File> f(Context context) {
        File b10;
        File a10;
        String[] strArr;
        HashMap hashMap = new HashMap();
        hashMap.put(b(context), a(context));
        for (String str : f23862b) {
            hashMap.put(new File(b10.getPath() + str), new File(a10.getPath() + str));
        }
        return hashMap;
    }
}
