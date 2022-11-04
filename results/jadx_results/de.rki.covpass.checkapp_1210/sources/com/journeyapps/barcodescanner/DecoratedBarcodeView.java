package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import h6.s;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m6.f;
import m6.g;
import m6.k;
import m6.l;
import m6.o;
import o7.h;
import p7.i;
/* loaded from: classes.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: c */
    private BarcodeView f8139c;

    /* renamed from: d */
    private ViewfinderView f8140d;

    /* renamed from: q */
    private TextView f8141q;

    /* renamed from: x */
    private a f8142x;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements o7.a {

        /* renamed from: a */
        private o7.a f8143a;

        public b(o7.a aVar) {
            DecoratedBarcodeView.this = r1;
            this.f8143a = aVar;
        }

        @Override // o7.a
        public void a(o7.c cVar) {
            this.f8143a.a(cVar);
        }

        @Override // o7.a
        public void b(List<s> list) {
            for (s sVar : list) {
                DecoratedBarcodeView.this.f8140d.a(sVar);
            }
            this.f8143a.b(list);
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
    }

    private void c(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f16389t);
        int resourceId = obtainStyledAttributes.getResourceId(o.f16390u, l.a_res_0x7f0c009d);
        obtainStyledAttributes.recycle();
        FrameLayout.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(k.b_res_0x7f0902c9);
        this.f8139c = barcodeView;
        if (barcodeView != null) {
            barcodeView.q(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(k.l_res_0x7f0902d3);
            this.f8140d = viewfinderView;
            if (viewfinderView == null) {
                throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
            }
            viewfinderView.setCameraPreview(this.f8139c);
            this.f8141q = (TextView) findViewById(k.k_res_0x7f0902d2);
            return;
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    public void b(o7.a aVar) {
        this.f8139c.I(new b(aVar));
    }

    public void d(Intent intent) {
        int intExtra;
        Set<h6.a> a10 = f.a(intent);
        Map<h6.e, ?> a11 = g.a(intent);
        i iVar = new i();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            iVar.i(intExtra);
        }
        if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
            i();
        }
        String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
        new h6.k().e(a11);
        this.f8139c.setCameraSettings(iVar);
        this.f8139c.setDecoderFactory(new o7.k(a10, a11, stringExtra2, intExtra2));
    }

    public void e() {
        this.f8139c.u();
    }

    public void f() {
        this.f8139c.v();
    }

    public void g() {
        this.f8139c.y();
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(k.b_res_0x7f0902c9);
    }

    public i getCameraSettings() {
        return this.f8139c.getCameraSettings();
    }

    public h getDecoderFactory() {
        return this.f8139c.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f8141q;
    }

    public ViewfinderView getViewFinder() {
        return this.f8140d;
    }

    public void h() {
        this.f8139c.setTorch(false);
        a aVar = this.f8142x;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void i() {
        this.f8139c.setTorch(true);
        a aVar = this.f8142x;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 24) {
            i();
            return true;
        } else if (i10 == 25) {
            h();
            return true;
        } else if (i10 != 27 && i10 != 80) {
            return super.onKeyDown(i10, keyEvent);
        } else {
            return true;
        }
    }

    public void setCameraSettings(i iVar) {
        this.f8139c.setCameraSettings(iVar);
    }

    public void setDecoderFactory(h hVar) {
        this.f8139c.setDecoderFactory(hVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.f8141q;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(a aVar) {
        this.f8142x = aVar;
    }
}
