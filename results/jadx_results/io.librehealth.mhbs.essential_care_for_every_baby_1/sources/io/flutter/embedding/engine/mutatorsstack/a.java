package io.flutter.embedding.engine.mutatorsstack;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.android.b;
/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: a */
    private FlutterMutatorsStack f1118a;

    /* renamed from: b */
    private float f1119b;

    /* renamed from: c */
    private int f1120c;

    /* renamed from: d */
    private int f1121d;

    /* renamed from: e */
    private int f1122e;
    private int f;
    private final b g;

    public a(Context context, float f, b bVar) {
        super(context, null);
        this.f1119b = f;
        this.g = bVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f1118a.getFinalMatrix());
        float f = this.f1119b;
        matrix.preScale(1.0f / f, 1.0f / f);
        matrix.postTranslate(-this.f1120c, -this.f1121d);
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int i, int i2, int i3, int i4) {
        this.f1118a = flutterMutatorsStack;
        this.f1120c = i;
        this.f1121d = i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f1118a.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset(-this.f1120c, -this.f1121d);
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float f;
        if (this.g == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i2 = this.f1120c;
            this.f1122e = i2;
            i = this.f1121d;
            this.f = i;
            f = i2;
        } else if (action == 2) {
            matrix.postTranslate(this.f1122e, this.f);
            this.f1122e = this.f1120c;
            this.f = this.f1121d;
            return this.g.f(motionEvent, matrix);
        } else {
            f = this.f1120c;
            i = this.f1121d;
        }
        matrix.postTranslate(f, i);
        return this.g.f(motionEvent, matrix);
    }
}
