package com.journeyapps.barcodescanner;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.journeyapps.barcodescanner.a;
import com.journeyapps.barcodescanner.e;
import h6.r;
import h6.s;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import m6.h;
import m6.n;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class e {

    /* renamed from: o */
    private static final String f8185o = "e";

    /* renamed from: p */
    private static int f8186p = 250;

    /* renamed from: a */
    private Activity f8187a;

    /* renamed from: b */
    private DecoratedBarcodeView f8188b;

    /* renamed from: h */
    private h f8194h;

    /* renamed from: i */
    private m6.e f8195i;

    /* renamed from: m */
    private final a.f f8199m;

    /* renamed from: c */
    private int f8189c = -1;

    /* renamed from: d */
    private boolean f8190d = false;

    /* renamed from: e */
    private boolean f8191e = true;

    /* renamed from: f */
    private String f8192f = BuildConfig.FLAVOR;

    /* renamed from: g */
    private boolean f8193g = false;

    /* renamed from: k */
    private boolean f8197k = false;

    /* renamed from: l */
    private o7.a f8198l = new a();

    /* renamed from: n */
    private boolean f8200n = false;

    /* renamed from: j */
    private Handler f8196j = new Handler();

    /* loaded from: classes.dex */
    public class a implements o7.a {
        a() {
            e.this = r1;
        }

        public /* synthetic */ void d(o7.c cVar) {
            e.this.B(cVar);
        }

        @Override // o7.a
        public void a(final o7.c cVar) {
            e.this.f8188b.e();
            e.this.f8195i.f();
            e.this.f8196j.post(new Runnable() { // from class: com.journeyapps.barcodescanner.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.a.this.d(cVar);
                }
            });
        }

        @Override // o7.a
        public void b(List<s> list) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements a.f {
        b() {
            e.this = r1;
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void a() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void b(Exception exc) {
            e eVar = e.this;
            eVar.m(eVar.f8187a.getString(n.c_res_0x7f10021e));
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void c() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void d() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void e() {
            if (e.this.f8197k) {
                Log.d(e.f8185o, "Camera closed; finishing activity");
                e.this.n();
            }
        }
    }

    public e(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        b bVar = new b();
        this.f8199m = bVar;
        this.f8187a = activity;
        this.f8188b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().i(bVar);
        this.f8194h = new h(activity, new Runnable() { // from class: o7.f
            @Override // java.lang.Runnable
            public final void run() {
                com.journeyapps.barcodescanner.e.this.s();
            }
        });
        this.f8195i = new m6.e(activity);
    }

    public static Intent A(o7.c cVar, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", cVar.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", cVar.a().toString());
        byte[] c10 = cVar.c();
        if (c10 != null && c10.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", c10);
        }
        Map<r, Object> d10 = cVar.d();
        if (d10 != null) {
            r rVar = r.UPC_EAN_EXTENSION;
            if (d10.containsKey(rVar)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", d10.get(rVar).toString());
            }
            Number number = (Number) d10.get(r.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str2 = (String) d10.get(r.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
            }
            Iterable<byte[]> iterable = (Iterable) d10.get(r.BYTE_SEGMENTS);
            if (iterable != null) {
                int i10 = 0;
                for (byte[] bArr : iterable) {
                    intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i10, bArr);
                    i10++;
                }
            }
        }
        if (str != null) {
            intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
        }
        return intent;
    }

    private void D() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("MISSING_CAMERA_PERMISSION", true);
        this.f8187a.setResult(0, intent);
    }

    public void n() {
        this.f8187a.finish();
    }

    private String o(o7.c cVar) {
        if (this.f8190d) {
            Bitmap b10 = cVar.b();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.f8187a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                b10.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException e10) {
                String str = f8185o;
                Log.w(str, "Unable to create temporary file and store bitmap! " + e10);
            }
        }
        return null;
    }

    public /* synthetic */ void q(DialogInterface dialogInterface, int i10) {
        n();
    }

    public /* synthetic */ void r(DialogInterface dialogInterface) {
        n();
    }

    public /* synthetic */ void s() {
        Log.d(f8185o, "Finishing due to inactivity");
        n();
    }

    @TargetApi(23)
    private void z() {
        if (androidx.core.content.a.a(this.f8187a, "android.permission.CAMERA") == 0) {
            this.f8188b.g();
        } else if (this.f8200n) {
        } else {
            androidx.core.app.b.n(this.f8187a, new String[]{"android.permission.CAMERA"}, f8186p);
            this.f8200n = true;
        }
    }

    protected void B(o7.c cVar) {
        this.f8187a.setResult(-1, A(cVar, o(cVar)));
        k();
    }

    public void C() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f8187a.setResult(0, intent);
        k();
    }

    public void E(boolean z10, String str) {
        this.f8191e = z10;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.f8192f = str;
    }

    protected void k() {
        if (this.f8188b.getBarcodeView().s()) {
            n();
        } else {
            this.f8197k = true;
        }
        this.f8188b.e();
        this.f8194h.d();
    }

    public void l() {
        this.f8188b.b(this.f8198l);
    }

    protected void m(String str) {
        if (this.f8187a.isFinishing() || this.f8193g || this.f8197k) {
            return;
        }
        if (str.isEmpty()) {
            str = this.f8187a.getString(n.c_res_0x7f10021e);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f8187a);
        builder.setTitle(this.f8187a.getString(n.a_res_0x7f10021c));
        builder.setMessage(str);
        builder.setPositiveButton(n.b_res_0x7f10021d, new DialogInterface.OnClickListener() { // from class: o7.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                com.journeyapps.barcodescanner.e.this.q(dialogInterface, i10);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o7.d
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.journeyapps.barcodescanner.e.this.r(dialogInterface);
            }
        });
        builder.show();
    }

    public void p(Intent intent, Bundle bundle) {
        this.f8187a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f8189c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                t();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f8188b.d(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f8195i.g(false);
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                E(intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true), intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE"));
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.f8196j.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.C();
                    }
                }, intent.getLongExtra("TIMEOUT", 0L));
            }
            if (!intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                return;
            }
            this.f8190d = true;
        }
    }

    protected void t() {
        if (this.f8189c == -1) {
            int rotation = this.f8187a.getWindowManager().getDefaultDisplay().getRotation();
            int i10 = this.f8187a.getResources().getConfiguration().orientation;
            int i11 = 0;
            if (i10 == 2) {
                if (rotation != 0 && rotation != 1) {
                    i11 = 8;
                }
            } else if (i10 == 1) {
                i11 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f8189c = i11;
        }
        this.f8187a.setRequestedOrientation(this.f8189c);
    }

    public void u() {
        this.f8193g = true;
        this.f8194h.d();
        this.f8196j.removeCallbacksAndMessages(null);
    }

    public void v() {
        this.f8194h.d();
        this.f8188b.f();
    }

    public void w(int i10, String[] strArr, int[] iArr) {
        if (i10 == f8186p) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f8188b.g();
                return;
            }
            D();
            if (this.f8191e) {
                m(this.f8192f);
            } else {
                k();
            }
        }
    }

    public void x() {
        z();
        this.f8194h.h();
    }

    public void y(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f8189c);
    }
}
