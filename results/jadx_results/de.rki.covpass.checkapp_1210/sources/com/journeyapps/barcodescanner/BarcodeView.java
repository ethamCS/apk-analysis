package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import h6.s;
import java.util.HashMap;
import java.util.List;
import m6.k;
import o7.g;
import o7.h;
import o7.i;
import o7.j;
/* loaded from: classes.dex */
public class BarcodeView extends com.journeyapps.barcodescanner.a {

    /* renamed from: s4 */
    private j f8128s4;

    /* renamed from: t4 */
    private h f8129t4;

    /* renamed from: u4 */
    private Handler f8130u4;

    /* renamed from: q4 */
    private b f8126q4 = b.NONE;

    /* renamed from: r4 */
    private o7.a f8127r4 = null;

    /* renamed from: v4 */
    private final Handler.Callback f8131v4 = new a();

    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
            BarcodeView.this = r1;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == k.g_res_0x7f0902ce) {
                o7.c cVar = (o7.c) message.obj;
                if (cVar != null && BarcodeView.this.f8127r4 != null && BarcodeView.this.f8126q4 != b.NONE) {
                    BarcodeView.this.f8127r4.a(cVar);
                    if (BarcodeView.this.f8126q4 == b.SINGLE) {
                        BarcodeView.this.M();
                    }
                }
                return true;
            } else if (i10 == k.f_res_0x7f0902cd) {
                return true;
            } else {
                if (i10 != k.h_res_0x7f0902cf) {
                    return false;
                }
                List<s> list = (List) message.obj;
                if (BarcodeView.this.f8127r4 != null && BarcodeView.this.f8126q4 != b.NONE) {
                    BarcodeView.this.f8127r4.b(list);
                }
                return true;
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        J();
    }

    private g G() {
        if (this.f8129t4 == null) {
            this.f8129t4 = H();
        }
        i iVar = new i();
        HashMap hashMap = new HashMap();
        hashMap.put(h6.e.NEED_RESULT_POINT_CALLBACK, iVar);
        g a10 = this.f8129t4.a(hashMap);
        iVar.b(a10);
        return a10;
    }

    private void J() {
        this.f8129t4 = new o7.k();
        this.f8130u4 = new Handler(this.f8131v4);
    }

    private void K() {
        L();
        if (this.f8126q4 == b.NONE || !t()) {
            return;
        }
        j jVar = new j(getCameraInstance(), G(), this.f8130u4);
        this.f8128s4 = jVar;
        jVar.i(getPreviewFramingRect());
        this.f8128s4.k();
    }

    private void L() {
        j jVar = this.f8128s4;
        if (jVar != null) {
            jVar.l();
            this.f8128s4 = null;
        }
    }

    protected h H() {
        return new o7.k();
    }

    public void I(o7.a aVar) {
        this.f8126q4 = b.SINGLE;
        this.f8127r4 = aVar;
        K();
    }

    public void M() {
        this.f8126q4 = b.NONE;
        this.f8127r4 = null;
        L();
    }

    public h getDecoderFactory() {
        return this.f8129t4;
    }

    public void setDecoderFactory(h hVar) {
        o7.s.a();
        this.f8129t4 = hVar;
        j jVar = this.f8128s4;
        if (jVar != null) {
            jVar.j(G());
        }
    }

    @Override // com.journeyapps.barcodescanner.a
    public void u() {
        L();
        super.u();
    }

    @Override // com.journeyapps.barcodescanner.a
    public void x() {
        super.x();
        K();
    }
}
