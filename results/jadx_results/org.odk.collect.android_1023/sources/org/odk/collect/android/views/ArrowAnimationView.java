package org.odk.collect.android.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import org.odk.collect.android.R;
/* loaded from: classes.dex */
public class ArrowAnimationView extends View {
    private static final String t = "ArrowAnimationView";
    private Animation mAnimation;
    private Bitmap mArrow;
    private int mImgXOffset;

    public ArrowAnimationView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.i(t, "called constructor");
        init();
    }

    public ArrowAnimationView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.mArrow = BitmapFactory.decodeResource(getResources(), R.drawable.left_arrow);
        this.mImgXOffset = this.mArrow.getWidth() / 2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mAnimation == null) {
            createAnim(canvas);
        }
        int centerX = canvas.getWidth() / 2;
        canvas.drawBitmap(this.mArrow, centerX - this.mImgXOffset, this.mArrow.getHeight() / 4.0f, (Paint) null);
    }

    private void createAnim(Canvas canvas) {
        this.mAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.start_arrow);
        startAnimation(this.mAnimation);
    }
}
