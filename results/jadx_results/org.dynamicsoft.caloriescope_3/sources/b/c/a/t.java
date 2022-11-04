package b.c.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import b.c.a.s;
/* loaded from: classes.dex */
public final class t extends BitmapDrawable {
    private static final Paint h = new Paint();

    /* renamed from: a */
    private final boolean f1331a;

    /* renamed from: b */
    private final float f1332b;

    /* renamed from: c */
    private final s.e f1333c;
    Drawable d;
    long e;
    boolean f;
    int g = 255;

    t(Context context, Bitmap bitmap, Drawable drawable, s.e eVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f1331a = z2;
        this.f1332b = context.getResources().getDisplayMetrics().density;
        this.f1333c = eVar;
        if (eVar != s.e.MEMORY && !z) {
            this.d = drawable;
            this.f = true;
            this.e = SystemClock.uptimeMillis();
        }
    }

    private static Path a(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        return path;
    }

    private void a(Canvas canvas) {
        h.setColor(-1);
        canvas.drawPath(a(new Point(0, 0), (int) (this.f1332b * 16.0f)), h);
        h.setColor(this.f1333c.f1327b);
        canvas.drawPath(a(new Point(0, 0), (int) (this.f1332b * 15.0f)), h);
    }

    public static void a(ImageView imageView, Context context, Bitmap bitmap, s.e eVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new t(context, bitmap, drawable, eVar, z, z2));
    }

    public static void a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            boolean r0 = r4.f
            if (r0 != 0) goto L8
        L4:
            super.draw(r5)
            goto L41
        L8:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r4.e
            long r0 = r0 - r2
            float r0 = (float) r0
            r1 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L20
            r0 = 0
            r4.f = r0
            r0 = 0
            r4.d = r0
            goto L4
        L20:
            android.graphics.drawable.Drawable r1 = r4.d
            if (r1 == 0) goto L27
            r1.draw(r5)
        L27:
            int r1 = r4.g
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = (int) r1
            super.setAlpha(r0)
            super.draw(r5)
            int r0 = r4.g
            super.setAlpha(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 10
            if (r0 > r1) goto L41
            r4.invalidateSelf()
        L41:
            boolean r0 = r4.f1331a
            if (r0 == 0) goto L48
            r4.a(r5)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.a.t.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.g = i;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
