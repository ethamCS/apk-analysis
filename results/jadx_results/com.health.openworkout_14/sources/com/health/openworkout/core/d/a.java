package com.health.openworkout.core.d;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.GitHubFile;
import com.health.openworkout.core.datatypes.TrainingPlan;
import com.health.openworkout.core.datatypes.WorkoutItem;
import com.health.openworkout.core.datatypes.WorkoutSession;
import d.a.b.e;
import e.j0;
import g.a0.w;
import g.a0.y;
import g.f;
import g.t;
import g.u;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private Context f3384a;

    /* renamed from: b */
    private e f3385b = new e();

    /* renamed from: c */
    private File f3386c;

    /* renamed from: d */
    private File f3387d;

    /* renamed from: e */
    private File f3388e;

    /* renamed from: f */
    private u f3389f;

    /* renamed from: g */
    private c f3390g;

    /* renamed from: h */
    private d f3391h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.health.openworkout.core.d.a$a */
    /* loaded from: classes.dex */
    public class C0082a implements f<List<GitHubFile>> {
        C0082a() {
            a.this = r1;
        }

        @Override // g.f
        public void a(g.d<List<GitHubFile>> dVar, Throwable th) {
            a.this.f3391h.a(new Exception(a.this.f3384a.getString(R.string.error_no_github_connection)));
            h.a.a.b("GitHub call failed " + th.getMessage(), new Object[0]);
        }

        @Override // g.f
        public void b(g.d<List<GitHubFile>> dVar, t<List<GitHubFile>> tVar) {
            if (!tVar.d()) {
                h.a.a.b("Get GitHub file list error", new Object[0]);
                return;
            }
            h.a.a.a("Successful file list from GitHub received", new Object[0]);
            if (a.this.f3391h == null) {
                return;
            }
            a.this.f3391h.d(tVar.a());
        }
    }

    /* loaded from: classes.dex */
    public class b implements f<j0> {

        /* renamed from: a */
        final /* synthetic */ GitHubFile f3393a;

        /* renamed from: com.health.openworkout.core.d.a$b$a */
        /* loaded from: classes.dex */
        class AsyncTaskC0083a extends AsyncTask<Void, Void, Void> {

            /* renamed from: a */
            final /* synthetic */ t f3395a;

            AsyncTaskC0083a(t tVar) {
                b.this = r1;
                this.f3395a = tVar;
            }

            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                b bVar = b.this;
                if (!a.this.t(bVar.f3393a.getName(), b.this.f3393a.getSize(), (j0) this.f3395a.a()) || a.this.f3391h == null) {
                    return null;
                }
                h.a.a.a("Successful " + b.this.f3393a.getName() + " file downloaded from " + b.this.f3393a.getDownloadURL(), new Object[0]);
                a.this.f3391h.b(new File(a.this.f3384a.getFilesDir(), b.this.f3393a.getName()));
                return null;
            }
        }

        b(GitHubFile gitHubFile) {
            a.this = r1;
            this.f3393a = gitHubFile;
        }

        @Override // g.f
        public void a(g.d<j0> dVar, Throwable th) {
            d dVar2 = a.this.f3391h;
            dVar2.a(new Exception(a.this.f3384a.getString(R.string.error_no_github_download) + "(" + th.getMessage() + ")"));
            StringBuilder sb = new StringBuilder();
            sb.append("Download failed ");
            sb.append(th.getMessage());
            h.a.a.b(sb.toString(), new Object[0]);
        }

        @Override // g.f
        public void b(g.d<j0> dVar, t<j0> tVar) {
            if (tVar.d()) {
                new AsyncTaskC0083a(tVar).execute(new Void[0]);
                return;
            }
            h.a.a.b("Download failed for URL " + this.f3393a.getDownloadURL(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        @w
        @g.a0.f
        g.d<j0> a(@y String str);

        @g.a0.f("repos/oliexdev/openWorkout/contents/pkg")
        g.d<List<GitHubFile>> b();
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(Exception exc);

        void b(File file);

        void c(long j, long j2);

        void d(List<GitHubFile> list);
    }

    public a(Context context) {
        this.f3384a = context;
        u.b bVar = new u.b();
        bVar.b("https://api.github.com/");
        bVar.a(g.z.a.a.f());
        u d2 = bVar.d();
        this.f3389f = d2;
        this.f3390g = (c) d2.b(c.class);
    }

    private void d(File file, File file2, ZipOutputStream zipOutputStream) {
        byte[] bArr = new byte[2048];
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            for (File file3 : listFiles) {
                if (file3.isDirectory()) {
                    d(file, file3, zipOutputStream);
                } else {
                    FileInputStream fileInputStream = new FileInputStream(file3);
                    zipOutputStream.putNextEntry(new ZipEntry(file3.getAbsolutePath().replace(file.getAbsolutePath(), "")));
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 2048);
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 2048);
                        if (read == -1) {
                            break;
                        }
                        zipOutputStream.write(bArr, 0, read);
                    }
                    bufferedInputStream.close();
                }
            }
        }
    }

    private void e(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                inputStream.close();
                outputStream.flush();
                outputStream.close();
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    private String f(String str) {
        Uri parse = Uri.parse(str);
        String l = l(parse);
        File file = new File(this.f3387d, l);
        if (!file.exists()) {
            e(this.f3384a.getContentResolver().openInputStream(parse), new FileOutputStream(file));
            h.a.a.a("Copied file " + l + " to internal storage", new Object[0]);
        }
        return Uri.fromFile(file).toString();
    }

    private String g(String str) {
        Uri parse = Uri.parse(str);
        String l = l(parse);
        File file = new File(this.f3388e, l);
        if (!file.exists()) {
            e(this.f3384a.getContentResolver().openInputStream(parse), new FileOutputStream(file));
            h.a.a.a("Copied file " + l + " to internal storage", new Object[0]);
        }
        return Uri.fromFile(file).toString();
    }

    private void h(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                h(file2);
            }
        }
        file.delete();
    }

    private void k(ZipInputStream zipInputStream, File file) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        byte[] bArr = new byte[2048];
        while (true) {
            int read = zipInputStream.read(bArr);
            if (read == -1) {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                return;
            }
            bufferedOutputStream.write(bArr, 0, read);
        }
    }

    private String l(Uri uri) {
        String str = new String();
        Cursor query = this.f3384a.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(0);
                }
            } finally {
                query.close();
            }
        }
        return str.endsWith(".zip") ? str.substring(0, str.length() - 4) : str;
    }

    private String m(File file) {
        String name = file.getName();
        return name.endsWith(".zip") ? name.substring(0, name.length() - 4) : name;
    }

    private TrainingPlan p(Uri uri, String str) {
        h.a.a.a("Import training plan " + str, new Object[0]);
        try {
            try {
                s(uri, str);
                File filesDir = this.f3384a.getFilesDir();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filesDir, str + "/database.json"))));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                bufferedReader.close();
                TrainingPlan trainingPlan = (TrainingPlan) this.f3385b.i(sb.toString(), TrainingPlan.class);
                h.a.a.a("Read training database " + trainingPlan.getName(), new Object[0]);
                com.health.openworkout.core.a.h().o(trainingPlan);
                Context context = this.f3384a;
                Toast.makeText(context, String.format(context.getString(R.string.label_info_imported), trainingPlan.getName(), str), 1).show();
                File filesDir2 = this.f3384a.getFilesDir();
                File file = new File(filesDir2, str + ".zip");
                if (file.exists()) {
                    h.a.a.a("Delete unzipped local zip file " + file, new Object[0]);
                    file.delete();
                }
                return trainingPlan;
            } catch (IOException e2) {
                Context context2 = this.f3384a;
                String string = context2.getString(R.string.error_no_valid_training_package);
                Toast.makeText(context2, String.format(string, str + ".zip"), 1).show();
                h.a.a.c(e2);
                File filesDir3 = this.f3384a.getFilesDir();
                File file2 = new File(filesDir3, str + ".zip");
                if (!file2.exists()) {
                    return null;
                }
                h.a.a.a("Delete unzipped local zip file " + file2, new Object[0]);
                file2.delete();
                return null;
            }
        } catch (Throwable th) {
            File filesDir4 = this.f3384a.getFilesDir();
            File file3 = new File(filesDir4, str + ".zip");
            if (file3.exists()) {
                h.a.a.a("Delete unzipped local zip file " + file3, new Object[0]);
                file3.delete();
            }
            throw th;
        }
    }

    private void s(Uri uri, String str) {
        ZipInputStream zipInputStream = new ZipInputStream(this.f3384a.getContentResolver().openInputStream(uri));
        new File(this.f3384a.getFilesDir(), str).mkdir();
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                zipInputStream.close();
                return;
            }
            File filesDir = this.f3384a.getFilesDir();
            File file = new File(filesDir, str + "/" + nextEntry.getName());
            if (!nextEntry.isDirectory()) {
                file.getParentFile().mkdir();
                k(zipInputStream, file);
                h.a.a.a("Extract file " + nextEntry.getName(), new Object[0]);
            } else {
                file.mkdir();
                h.a.a.a("Extract folder " + nextEntry.getName(), new Object[0]);
            }
            zipInputStream.closeEntry();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0079 A[Catch: IOException -> 0x0082, TryCatch #5 {IOException -> 0x0082, blocks: (B:3:0x0003, B:14:0x0032, B:15:0x0035, B:34:0x006d, B:36:0x0072, B:40:0x0079, B:42:0x007e, B:43:0x0081), top: B:49:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e A[Catch: IOException -> 0x0082, TryCatch #5 {IOException -> 0x0082, blocks: (B:3:0x0003, B:14:0x0032, B:15:0x0035, B:34:0x006d, B:36:0x0072, B:40:0x0079, B:42:0x007e, B:43:0x0081), top: B:49:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t(java.lang.String r8, long r9, e.j0 r11) {
        /*
            r7 = this;
            java.lang.String r0 = "Error writing to disk "
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L82
            android.content.Context r3 = r7.f3384a     // Catch: java.io.IOException -> L82
            java.io.File r3 = r3.getFilesDir()     // Catch: java.io.IOException -> L82
            r2.<init>(r3, r8)     // Catch: java.io.IOException -> L82
            r8 = 4096(0x1000, float:5.74E-42)
            r3 = 0
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            r4 = 0
            java.io.InputStream r11 = r11.a()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4e
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4e
        L1e:
            int r2 = r11.read(r8)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r3 = -1
            if (r2 != r3) goto L39
            r6.flush()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            com.health.openworkout.core.d.a$d r8 = r7.f3391h     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            if (r8 == 0) goto L2f
            r8.c(r4, r9)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
        L2f:
            r8 = 1
            if (r11 == 0) goto L35
            r11.close()     // Catch: java.io.IOException -> L82
        L35:
            r6.close()     // Catch: java.io.IOException -> L82
            return r8
        L39:
            r6.write(r8, r1, r2)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            long r4 = r4 + r2
            com.health.openworkout.core.d.a$d r2 = r7.f3391h     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            if (r2 == 0) goto L1e
            r2.c(r4, r9)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            goto L1e
        L46:
            r8 = move-exception
            goto L4c
        L48:
            r8 = move-exception
            goto L50
        L4a:
            r8 = move-exception
            r6 = r3
        L4c:
            r3 = r11
            goto L77
        L4e:
            r8 = move-exception
            r6 = r3
        L50:
            r3 = r11
            goto L57
        L52:
            r8 = move-exception
            r6 = r3
            goto L77
        L55:
            r8 = move-exception
            r6 = r3
        L57:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r9.<init>()     // Catch: java.lang.Throwable -> L76
            r9.append(r0)     // Catch: java.lang.Throwable -> L76
            r9.append(r8)     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L76
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L76
            h.a.a.b(r8, r9)     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L70
            r3.close()     // Catch: java.io.IOException -> L82
        L70:
            if (r6 == 0) goto L75
            r6.close()     // Catch: java.io.IOException -> L82
        L75:
            return r1
        L76:
            r8 = move-exception
        L77:
            if (r3 == 0) goto L7c
            r3.close()     // Catch: java.io.IOException -> L82
        L7c:
            if (r6 == 0) goto L81
            r6.close()     // Catch: java.io.IOException -> L82
        L81:
            throw r8     // Catch: java.io.IOException -> L82
        L82:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[r1]
            h.a.a.b(r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.health.openworkout.core.d.a.t(java.lang.String, long, e.j0):boolean");
    }

    private void u(File file, Uri uri) {
        ZipOutputStream zipOutputStream = new ZipOutputStream(this.f3384a.getContentResolver().openOutputStream(uri));
        d(file, file, zipOutputStream);
        zipOutputStream.close();
    }

    public void i(GitHubFile gitHubFile) {
        this.f3390g.a(gitHubFile.getDownloadURL()).N(new b(gitHubFile));
    }

    public void j(TrainingPlan trainingPlan, Uri uri) {
        h.a.a.a("Export training plan " + trainingPlan.getName(), new Object[0]);
        try {
            String l = l(uri);
            this.f3386c = new File(this.f3384a.getFilesDir(), trainingPlan.getName());
            File filesDir = this.f3384a.getFilesDir();
            this.f3387d = new File(filesDir, trainingPlan.getName() + "/image");
            File filesDir2 = this.f3384a.getFilesDir();
            this.f3388e = new File(filesDir2, trainingPlan.getName() + "/video");
            if (this.f3386c.exists()) {
                h(this.f3386c);
            }
            this.f3386c.mkdir();
            this.f3387d.mkdir();
            this.f3388e.mkdir();
            trainingPlan.setTrainingPlanId(0L);
            if (trainingPlan.isImagePathExternal()) {
                trainingPlan.setImagePath(f(trainingPlan.getImagePath()));
            }
            for (WorkoutSession workoutSession : trainingPlan.getWorkoutSessions()) {
                workoutSession.setWorkoutSessionId(0L);
                for (WorkoutItem workoutItem : workoutSession.getWorkoutItems()) {
                    workoutItem.setWorkoutItemId(0L);
                    if (workoutItem.isImagePathExternal()) {
                        workoutItem.setImagePath(f(workoutItem.getImagePath()));
                    }
                    if (workoutItem.isVideoPathExternal()) {
                        workoutItem.setVideoPath(g(workoutItem.getVideoPath()));
                    }
                }
            }
            String r = this.f3385b.r(trainingPlan);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f3386c, "database.json"));
            fileOutputStream.write(r.getBytes());
            fileOutputStream.close();
            h.a.a.a("Written database.json", new Object[0]);
            u(this.f3386c, uri);
            h.a.a.a("Zipped " + trainingPlan.getName(), new Object[0]);
            h(this.f3386c);
            Context context = this.f3384a;
            Toast.makeText(context, String.format(context.getString(R.string.label_info_exported), trainingPlan.getName(), l), 1).show();
        } catch (IOException e2) {
            Toast.makeText(this.f3384a, e2.getLocalizedMessage(), 1).show();
            h.a.a.c(e2);
        }
    }

    public void n() {
        this.f3390g.b().N(new C0082a());
    }

    public TrainingPlan o(Uri uri) {
        return p(uri, l(uri));
    }

    public TrainingPlan q(File file) {
        return p(Uri.fromFile(file), m(file));
    }

    public void r(d dVar) {
        this.f3391h = dVar;
    }
}
