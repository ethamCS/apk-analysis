package n4;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a */
    private final e f16870a;

    public g(e eVar) {
        this.f16870a = eVar;
    }

    private static String b(String str, c cVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", BuildConfig.FLAVOR));
        sb2.append(z10 ? cVar.b() : cVar.f16869c);
        return sb2.toString();
    }

    private File c(String str) {
        File file = new File(d(), b(str, c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(d(), b(str, c.ZIP, false));
        if (!file2.exists()) {
            return null;
        }
        return file2;
    }

    private File d() {
        File a10 = this.f16870a.a();
        if (a10.isFile()) {
            a10.delete();
        }
        if (!a10.exists()) {
            a10.mkdirs();
        }
        return a10;
    }

    public Pair<c, InputStream> a(String str) {
        try {
            File c10 = c(str);
            if (c10 == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(c10);
            c cVar = c10.getAbsolutePath().endsWith(".zip") ? c.ZIP : c.JSON;
            q4.d.a("Cache hit for " + str + " at " + c10.getAbsolutePath());
            return new Pair<>(cVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public void e(String str, c cVar) {
        File file = new File(d(), b(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", BuildConfig.FLAVOR));
        boolean renameTo = file.renameTo(file2);
        q4.d.a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            q4.d.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    public File f(String str, InputStream inputStream, c cVar) {
        File file = new File(d(), b(str, cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } finally {
            inputStream.close();
        }
    }
}
