package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.journeyapps.barcodescanner.a;
import h6.s;
import java.util.ArrayList;
import java.util.List;
import m6.j;
import m6.o;
import o7.q;
/* loaded from: classes.dex */
public class ViewfinderView extends View {

    /* renamed from: c4 */
    protected static final String f8145c4 = ViewfinderView.class.getSimpleName();

    /* renamed from: d4 */
    protected static final int[] f8146d4 = {0, 64, 128, 192, 255, 192, 128, 64};
    protected final int U3;
    protected boolean V3;
    protected com.journeyapps.barcodescanner.a Z3;

    /* renamed from: a4 */
    protected Rect f8147a4;

    /* renamed from: b4 */
    protected q f8148b4;

    /* renamed from: d */
    protected Bitmap f8150d;

    /* renamed from: q */
    protected int f8151q;

    /* renamed from: x */
    protected final int f8152x;

    /* renamed from: y */
    protected final int f8153y;

    /* renamed from: c */
    protected final Paint f8149c = new Paint(1);
    protected int W3 = 0;
    protected List<s> X3 = new ArrayList(20);
    protected List<s> Y3 = new ArrayList(20);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a.f {
        a() {
            ViewfinderView.this = r1;
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void a() {
            ViewfinderView.this.b();
            ViewfinderView.this.invalidate();
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void b(Exception exc) {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void c() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void d() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void e() {
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f16383n);
        this.f8151q = obtainStyledAttributes.getColor(o.f16388s, resources.getColor(j.d_res_0x7f05032b));
        this.f8152x = obtainStyledAttributes.getColor(o.f16385p, resources.getColor(j.b_res_0x7f050327));
        this.f8153y = obtainStyledAttributes.getColor(o.f16386q, resources.getColor(j.c_res_0x7f05032a));
        this.U3 = obtainStyledAttributes.getColor(o.f16384o, resources.getColor(j.a_res_0x7f050326));
        this.V3 = obtainStyledAttributes.getBoolean(o.f16387r, true);
        obtainStyledAttributes.recycle();
    }

    public void a(s sVar) {
        if (this.X3.size() < 20) {
            this.X3.add(sVar);
        }
    }

    protected void b() {
        com.journeyapps.barcodescanner.a aVar = this.Z3;
        if (aVar == null) {
            return;
        }
        Rect framingRect = aVar.getFramingRect();
        q previewSize = this.Z3.getPreviewSize();
        if (framingRect == null || previewSize == null) {
            return;
        }
        this.f8147a4 = framingRect;
        this.f8148b4 = previewSize;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        q qVar;
        b();
        Rect rect = this.f8147a4;
        if (rect == null || (qVar = this.f8148b4) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.f8149c.setColor(this.f8150d != null ? this.f8152x : this.f8151q);
        float f10 = width;
        canvas.drawRect(0.0f, 0.0f, f10, rect.top, this.f8149c);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.f8149c);
        canvas.drawRect(rect.right + 1, rect.top, f10, rect.bottom + 1, this.f8149c);
        canvas.drawRect(0.0f, rect.bottom + 1, f10, height, this.f8149c);
        if (this.f8150d != null) {
            this.f8149c.setAlpha(160);
            canvas.drawBitmap(this.f8150d, (Rect) null, rect, this.f8149c);
            return;
        }
        if (this.V3) {
            this.f8149c.setColor(this.f8153y);
            Paint paint = this.f8149c;
            int[] iArr = f8146d4;
            paint.setAlpha(iArr[this.W3]);
            this.W3 = (this.W3 + 1) % iArr.length;
            int height2 = (rect.height() / 2) + rect.top;
            canvas.drawRect(rect.left + 2, height2 - 1, rect.right - 1, height2 + 2, this.f8149c);
        }
        float width2 = getWidth() / qVar.f17644c;
        float height3 = getHeight() / qVar.f17645d;
        if (!this.Y3.isEmpty()) {
            this.f8149c.setAlpha(80);
            this.f8149c.setColor(this.U3);
            for (s sVar : this.Y3) {
                canvas.drawCircle((int) (sVar.c() * width2), (int) (sVar.d() * height3), 3.0f, this.f8149c);
            }
            this.Y3.clear();
        }
        if (!this.X3.isEmpty()) {
            this.f8149c.setAlpha(160);
            this.f8149c.setColor(this.U3);
            for (s sVar2 : this.X3) {
                canvas.drawCircle((int) (sVar2.c() * width2), (int) (sVar2.d() * height3), 6.0f, this.f8149c);
            }
            List<s> list = this.X3;
            List<s> list2 = this.Y3;
            this.X3 = list2;
            this.Y3 = list;
            list2.clear();
        }
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }

    public void setCameraPreview(com.journeyapps.barcodescanner.a aVar) {
        this.Z3 = aVar;
        aVar.i(new a());
    }

    public void setLaserVisibility(boolean z10) {
        this.V3 = z10;
    }

    public void setMaskColor(int i10) {
        this.f8151q = i10;
    }
}
