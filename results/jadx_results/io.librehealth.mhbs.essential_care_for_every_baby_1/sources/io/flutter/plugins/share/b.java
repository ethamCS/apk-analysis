package io.flutter.plugins.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
class b {

    /* renamed from: a */
    private Context f1234a;

    /* renamed from: b */
    private Activity f1235b;

    public b(Context context, Activity activity) {
        this.f1234a = context;
        this.f1235b = activity;
    }

    private void a() {
        File f = f();
        if (f.exists()) {
            for (File file : f.listFiles()) {
                file.delete();
            }
            f.delete();
        }
    }

    private static void b(File file, File file2) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } finally {
            fileInputStream.close();
        }
    }

    private File c(File file) {
        File f = f();
        if (!f.exists()) {
            f.mkdirs();
        }
        File file2 = new File(f, file.getName());
        b(file, file2);
        return file2;
    }

    private boolean d(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            File externalFilesDir = this.f1234a.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                return false;
            }
            return canonicalPath.startsWith(externalFilesDir.getCanonicalPath());
        } catch (IOException unused) {
            return false;
        }
    }

    private Context e() {
        Activity activity = this.f1235b;
        if (activity != null) {
            return activity;
        }
        Context context = this.f1234a;
        if (context == null) {
            throw new IllegalStateException("Both context and activity are null");
        }
        return context;
    }

    private File f() {
        return new File(e().getExternalCacheDir(), "share");
    }

    private String g(String str) {
        return (str == null || !str.contains("/")) ? "*" : str.substring(0, str.indexOf("/"));
    }

    private ArrayList<Uri> h(List<String> list) {
        ArrayList<Uri> arrayList = new ArrayList<>(list.size());
        for (String str : list) {
            File file = new File(str);
            if (!d(file)) {
                file = c(file);
            }
            Context e2 = e();
            arrayList.add(b.c.f.b.e(e2, e().getPackageName() + ".flutter.share_provider", file));
        }
        return arrayList;
    }

    private String i(List<String> list) {
        if (list.size() <= 1) {
            return list.size() == 1 ? list.get(0) : "*/*";
        }
        String str = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            String str2 = list.get(i);
            if (!str.equals(str2)) {
                if (!g(str2).equals(g(str))) {
                    return "*/*";
                }
                str = g(str2) + "/*";
            }
        }
        return str;
    }

    private void m(Intent intent) {
        Activity activity = this.f1235b;
        if (activity != null) {
            activity.startActivity(intent);
        } else if (this.f1234a == null) {
            throw new IllegalStateException("Both context and activity are null");
        } else {
            intent.addFlags(268435456);
            this.f1234a.startActivity(intent);
        }
    }

    public void j(Activity activity) {
        this.f1235b = activity;
    }

    public void k(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Non-empty text expected");
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.setType("text/plain");
        m(Intent.createChooser(intent, null));
    }

    public void l(List<String> list, List<String> list2, String str, String str2) {
        String str3;
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Non-empty path expected");
        }
        a();
        ArrayList<Uri> h = h(list);
        Intent intent = new Intent();
        if (h.isEmpty()) {
            k(str, str2);
            return;
        }
        if (h.size() == 1) {
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", h.get(0));
            str3 = (list2.isEmpty() || list2.get(0) == null) ? "*/*" : list2.get(0);
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", h);
            str3 = i(list2);
        }
        intent.setType(str3);
        if (str != null) {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        intent.addFlags(1);
        Intent createChooser = Intent.createChooser(intent, null);
        for (ResolveInfo resolveInfo : e().getPackageManager().queryIntentActivities(createChooser, 65536)) {
            String str4 = resolveInfo.activityInfo.packageName;
            Iterator<Uri> it = h.iterator();
            while (it.hasNext()) {
                e().grantUriPermission(str4, it.next(), 3);
            }
        }
        m(createChooser);
    }
}
