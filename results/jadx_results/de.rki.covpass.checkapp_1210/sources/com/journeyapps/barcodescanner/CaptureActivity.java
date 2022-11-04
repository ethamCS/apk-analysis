package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import m6.k;
import m6.l;
/* loaded from: classes.dex */
public class CaptureActivity extends Activity {

    /* renamed from: c */
    private e f8137c;

    /* renamed from: d */
    private DecoratedBarcodeView f8138d;

    protected DecoratedBarcodeView a() {
        setContentView(l.b_res_0x7f0c009e);
        return (DecoratedBarcodeView) findViewById(k.a_res_0x7f0902c8);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8138d = a();
        e eVar = new e(this, this.f8138d);
        this.f8137c = eVar;
        eVar.p(getIntent(), bundle);
        this.f8137c.l();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f8137c.u();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.f8138d.onKeyDown(i10, keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f8137c.v();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f8137c.w(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f8137c.x();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f8137c.y(bundle);
    }
}
