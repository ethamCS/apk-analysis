package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import m0.e;
/* loaded from: classes.dex */
public class g extends View {

    /* renamed from: c */
    private int f3058c;

    /* renamed from: d */
    private View f3059d;

    /* renamed from: q */
    private int f3060q;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f3059d == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f3059d.getLayoutParams();
        bVar2.f2896v0.g1(0);
        e.b y10 = bVar.f2896v0.y();
        e.b bVar3 = e.b.FIXED;
        if (y10 != bVar3) {
            bVar.f2896v0.h1(bVar2.f2896v0.U());
        }
        if (bVar.f2896v0.R() != bVar3) {
            bVar.f2896v0.I0(bVar2.f2896v0.v());
        }
        bVar2.f2896v0.g1(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f3058c == -1 && !isInEditMode()) {
            setVisibility(this.f3060q);
        }
        View findViewById = constraintLayout.findViewById(this.f3058c);
        this.f3059d = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f2872j0 = true;
            this.f3059d.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f3059d;
    }

    public int getEmptyVisibility() {
        return this.f3060q;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f3058c == i10) {
            return;
        }
        View view = this.f3059d;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f3059d.getLayoutParams()).f2872j0 = false;
            this.f3059d = null;
        }
        this.f3058c = i10;
        if (i10 == -1 || (findViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f3060q = i10;
    }
}
