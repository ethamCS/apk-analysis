package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import b.e.b.k.e;
/* loaded from: classes.dex */
public class h extends View {

    /* renamed from: b */
    private int f832b;

    /* renamed from: c */
    private View f833c;

    /* renamed from: d */
    private int f834d;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f833c == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f833c.getLayoutParams();
        bVar2.m0.T0(0);
        e.b y = bVar.m0.y();
        e.b bVar3 = e.b.FIXED;
        if (y != bVar3) {
            bVar.m0.U0(bVar2.m0.R());
        }
        if (bVar.m0.O() != bVar3) {
            bVar.m0.v0(bVar2.m0.v());
        }
        bVar2.m0.T0(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f832b == -1 && !isInEditMode()) {
            setVisibility(this.f834d);
        }
        View findViewById = constraintLayout.findViewById(this.f832b);
        this.f833c = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).a0 = true;
            this.f833c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f833c;
    }

    public int getEmptyVisibility() {
        return this.f834d;
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

    public void setContentId(int i) {
        View findViewById;
        if (this.f832b == i) {
            return;
        }
        View view = this.f833c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f833c.getLayoutParams()).a0 = false;
            this.f833c = null;
        }
        this.f832b = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f834d = i;
    }
}
