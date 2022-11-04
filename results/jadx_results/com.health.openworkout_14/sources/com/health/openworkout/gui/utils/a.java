package com.health.openworkout.gui.utils;

import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.health.openworkout.R;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private Fragment f3488a;

    /* renamed from: b */
    private String f3489b;

    public a(Fragment fragment) {
        this.f3488a = fragment;
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 23 && this.f3488a.t().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    private boolean b() {
        return Build.VERSION.SDK_INT >= 23 && this.f3488a.t().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    private void k(int i) {
        try {
            this.f3488a.g1(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, i);
        } catch (Exception e2) {
            h.a.a.c(e2);
        }
    }

    private void l(int i) {
        try {
            this.f3488a.g1(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, i);
        } catch (Exception e2) {
            h.a.a.c(e2);
        }
    }

    public boolean c(int i, int i2, Intent intent) {
        if (i2 == -1) {
            return i == 40 || i == 30 || i == 10 || i == 20 || i == 50;
        }
        return false;
    }

    public void d(int i, String[] strArr, int[] iArr) {
        if (iArr.length <= 0 || iArr[0] != 0) {
            return;
        }
        if (i == 1) {
            i();
        } else if (i == 2) {
            f();
        } else if (i == 3) {
            h();
        } else if (i != 4) {
        } else {
            j();
        }
    }

    public void e(String str) {
        if (!b()) {
            l(2);
            return;
        }
        Intent action = new Intent().setType("text/plain").putExtra("android.intent.extra.TITLE", str).setAction("android.intent.action.CREATE_DOCUMENT");
        Fragment fragment = this.f3488a;
        fragment.w1(Intent.createChooser(action, fragment.N(R.string.label_select_debug_file)), 50);
    }

    public void f() {
        if (!b()) {
            l(2);
            return;
        }
        Intent action = new Intent().setType("application/zip").putExtra("android.intent.extra.TITLE", this.f3489b).setAction("android.intent.action.CREATE_DOCUMENT");
        Fragment fragment = this.f3488a;
        fragment.w1(Intent.createChooser(action, fragment.N(R.string.label_select_export_file)), 30);
    }

    public void g(String str) {
        this.f3489b = str;
        f();
    }

    public void h() {
        if (!a()) {
            k(3);
            return;
        }
        Intent action = new Intent().setType("image/*").setAction("android.intent.action.OPEN_DOCUMENT");
        Fragment fragment = this.f3488a;
        fragment.w1(Intent.createChooser(action, fragment.N(R.string.label_select_image_file)), 10);
    }

    public void i() {
        if (!a()) {
            k(1);
            return;
        }
        Intent action = new Intent().setType("application/zip").setAction("android.intent.action.OPEN_DOCUMENT");
        Fragment fragment = this.f3488a;
        fragment.w1(Intent.createChooser(action, fragment.N(R.string.label_select_import_file)), 40);
    }

    public void j() {
        if (!a()) {
            k(4);
            return;
        }
        Intent action = new Intent().setType("video/*").setAction("android.intent.action.OPEN_DOCUMENT");
        Fragment fragment = this.f3488a;
        fragment.w1(Intent.createChooser(action, fragment.N(R.string.label_select_video_file)), 20);
    }
}
