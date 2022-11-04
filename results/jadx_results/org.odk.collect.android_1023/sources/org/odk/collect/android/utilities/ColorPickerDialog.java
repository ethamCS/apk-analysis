package org.odk.collect.android.utilities;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import org.odk.collect.android.R;
/* loaded from: classes.dex */
public class ColorPickerDialog extends Dialog {
    private int mDefaultColor;
    private int mInitialColor;
    private String mKey;
    private OnColorChangedListener mListener;

    /* loaded from: classes.dex */
    public interface OnColorChangedListener {
        void colorChanged(String str, int i);
    }

    /* loaded from: classes.dex */
    private static class ColorPickerView extends View {
        private int mCurrentColor;
        private float mCurrentHue;
        private int mDefaultColor;
        private OnColorChangedListener mListener;
        private Paint mPaint;
        private int mCurrentX = 0;
        private int mCurrentY = 0;
        private final int[] mHueBarColors = new int[258];
        private int[] mMainColors = new int[65536];

        ColorPickerView(Context c, OnColorChangedListener l, int color, int defaultColor) {
            super(c);
            this.mCurrentHue = 0.0f;
            this.mListener = l;
            this.mDefaultColor = defaultColor;
            float[] hsv = new float[3];
            Color.colorToHSV(color, hsv);
            this.mCurrentHue = hsv[0];
            updateMainColors();
            this.mCurrentColor = color;
            int index = 0;
            for (float i = 0.0f; i < 256.0f; i += 6.0f) {
                this.mHueBarColors[index] = Color.rgb(255, 0, (int) i);
                index++;
            }
            for (float i2 = 0.0f; i2 < 256.0f; i2 += 6.0f) {
                this.mHueBarColors[index] = Color.rgb(255 - ((int) i2), 0, 255);
                index++;
            }
            for (float i3 = 0.0f; i3 < 256.0f; i3 += 6.0f) {
                this.mHueBarColors[index] = Color.rgb(0, (int) i3, 255);
                index++;
            }
            for (float i4 = 0.0f; i4 < 256.0f; i4 += 6.0f) {
                this.mHueBarColors[index] = Color.rgb(0, 255, 255 - ((int) i4));
                index++;
            }
            for (float i5 = 0.0f; i5 < 256.0f; i5 += 6.0f) {
                this.mHueBarColors[index] = Color.rgb((int) i5, 255, 0);
                index++;
            }
            for (float i6 = 0.0f; i6 < 256.0f; i6 += 6.0f) {
                this.mHueBarColors[index] = Color.rgb(255, 255 - ((int) i6), 0);
                index++;
            }
            this.mPaint = new Paint(1);
            this.mPaint.setTextAlign(Paint.Align.CENTER);
            this.mPaint.setTextSize(12.0f);
        }

        private int getCurrentMainColor() {
            int translatedHue = 255 - ((int) ((this.mCurrentHue * 255.0f) / 360.0f));
            int index = 0;
            for (float i = 0.0f; i < 256.0f; i += 6.0f) {
                if (index == translatedHue) {
                    return Color.rgb(255, 0, (int) i);
                }
                index++;
            }
            for (float i2 = 0.0f; i2 < 256.0f; i2 += 6.0f) {
                if (index == translatedHue) {
                    return Color.rgb(255 - ((int) i2), 0, 255);
                }
                index++;
            }
            for (float i3 = 0.0f; i3 < 256.0f; i3 += 6.0f) {
                if (index == translatedHue) {
                    return Color.rgb(0, (int) i3, 255);
                }
                index++;
            }
            for (float i4 = 0.0f; i4 < 256.0f; i4 += 6.0f) {
                if (index == translatedHue) {
                    return Color.rgb(0, 255, 255 - ((int) i4));
                }
                index++;
            }
            for (float i5 = 0.0f; i5 < 256.0f; i5 += 6.0f) {
                if (index == translatedHue) {
                    return Color.rgb((int) i5, 255, 0);
                }
                index++;
            }
            for (float i6 = 0.0f; i6 < 256.0f; i6 += 6.0f) {
                if (index == translatedHue) {
                    return Color.rgb(255, 255 - ((int) i6), 0);
                }
                index++;
            }
            return -65536;
        }

        private void updateMainColors() {
            int mainColor = getCurrentMainColor();
            int index = 0;
            int[] topColors = new int[EncryptionUtils.SYMMETRIC_KEY_LENGTH];
            for (int y = 0; y < 256; y++) {
                for (int x = 0; x < 256; x++) {
                    if (y == 0) {
                        this.mMainColors[index] = Color.rgb(255 - (((255 - Color.red(mainColor)) * x) / 255), 255 - (((255 - Color.green(mainColor)) * x) / 255), 255 - (((255 - Color.blue(mainColor)) * x) / 255));
                        topColors[x] = this.mMainColors[index];
                    } else {
                        this.mMainColors[index] = Color.rgb(((255 - y) * Color.red(topColors[x])) / 255, ((255 - y) * Color.green(topColors[x])) / 255, ((255 - y) * Color.blue(topColors[x])) / 255);
                    }
                    index++;
                }
            }
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int translatedHue = 255 - ((int) ((this.mCurrentHue * 255.0f) / 360.0f));
            for (int x = 0; x < 256; x++) {
                if (translatedHue != x) {
                    this.mPaint.setColor(this.mHueBarColors[x]);
                    this.mPaint.setStrokeWidth(1.0f);
                } else {
                    this.mPaint.setColor(-16777216);
                    this.mPaint.setStrokeWidth(3.0f);
                }
                canvas.drawLine(x + 10, 0.0f, x + 10, 40.0f, this.mPaint);
            }
            for (int x2 = 0; x2 < 256; x2++) {
                int[] colors = {this.mMainColors[x2], -16777216};
                Shader shader = new LinearGradient(0.0f, 50.0f, 0.0f, 306.0f, colors, (float[]) null, Shader.TileMode.REPEAT);
                this.mPaint.setShader(shader);
                canvas.drawLine(x2 + 10, 50.0f, x2 + 10, 306.0f, this.mPaint);
            }
            this.mPaint.setShader(null);
            if (this.mCurrentX != 0 && this.mCurrentY != 0) {
                this.mPaint.setStyle(Paint.Style.STROKE);
                this.mPaint.setColor(-16777216);
                canvas.drawCircle(this.mCurrentX, this.mCurrentY, 10.0f, this.mPaint);
            }
            this.mPaint.setStyle(Paint.Style.FILL);
            this.mPaint.setColor(this.mCurrentColor);
            canvas.drawRect(10.0f, 316.0f, 138.0f, 356.0f, this.mPaint);
            this.mPaint.setColor(getInverseColor(this.mCurrentColor));
            canvas.drawText(getContext().getString(R.string.ok), 74.0f, 340.0f, this.mPaint);
            this.mPaint.setStyle(Paint.Style.FILL);
            this.mPaint.setColor(this.mDefaultColor);
            canvas.drawRect(138.0f, 316.0f, 266.0f, 356.0f, this.mPaint);
            this.mPaint.setColor(getInverseColor(this.mDefaultColor));
            canvas.drawText(getContext().getString(R.string.cancel), 202.0f, 340.0f, this.mPaint);
        }

        private int getInverseColor(int color) {
            int red = Color.red(color);
            int green = Color.green(color);
            int blue = Color.blue(color);
            int alpha = Color.alpha(color);
            return Color.argb(alpha, 255 - red, 255 - green, 255 - blue);
        }

        @Override // android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            setMeasuredDimension(276, 366);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            if (event.getAction() != 0 && event.getAction() != 2) {
                return true;
            }
            float x = event.getX();
            float y = event.getY();
            if (x > 10.0f && x < 266.0f && y > 0.0f && y < 40.0f) {
                this.mCurrentHue = ((255.0f - x) * 360.0f) / 255.0f;
                updateMainColors();
                int transX = this.mCurrentX - 10;
                int transY = this.mCurrentY - 60;
                int index = ((transY - 1) * EncryptionUtils.SYMMETRIC_KEY_LENGTH) + transX;
                if (index > 0 && index < this.mMainColors.length) {
                    this.mCurrentColor = this.mMainColors[((transY - 1) * EncryptionUtils.SYMMETRIC_KEY_LENGTH) + transX];
                }
                invalidate();
            }
            if (x > 10.0f && x < 266.0f && y > 50.0f && y < 306.0f) {
                this.mCurrentX = (int) x;
                this.mCurrentY = (int) y;
                int index2 = (((this.mCurrentY - 60) - 1) * EncryptionUtils.SYMMETRIC_KEY_LENGTH) + (this.mCurrentX - 10);
                if (index2 > 0 && index2 < this.mMainColors.length) {
                    this.mCurrentColor = this.mMainColors[index2];
                    invalidate();
                }
            }
            if (x > 10.0f && x < 138.0f && y > 316.0f && y < 356.0f) {
                this.mListener.colorChanged("", this.mCurrentColor);
            }
            if (x > 138.0f && x < 266.0f && y > 316.0f && y < 356.0f) {
                this.mListener.colorChanged("", this.mDefaultColor);
            }
            return true;
        }
    }

    public ColorPickerDialog(Context context, OnColorChangedListener listener, String key, int initialColor, int defaultColor, String title) {
        super(context);
        this.mListener = listener;
        this.mKey = key;
        this.mInitialColor = initialColor;
        this.mDefaultColor = defaultColor;
        setTitle(title);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OnColorChangedListener l = new OnColorChangedListener() { // from class: org.odk.collect.android.utilities.ColorPickerDialog.1
            @Override // org.odk.collect.android.utilities.ColorPickerDialog.OnColorChangedListener
            public void colorChanged(String key, int color) {
                ColorPickerDialog.this.mListener.colorChanged(ColorPickerDialog.this.mKey, color);
                ColorPickerDialog.this.dismiss();
            }
        };
        setContentView(new ColorPickerView(getContext(), l, this.mInitialColor, this.mDefaultColor));
    }
}
