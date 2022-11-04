package com.gigamole.library;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class PulseView extends View {

    /* renamed from: b */
    private final RectF f1364b;

    /* renamed from: c */
    private Bitmap f1365c;
    private int d;
    private final List<d> e;
    private c f;
    private int g;
    private long h;
    private float i;
    private int j;
    private int k;
    private int l;
    private float m;
    private float n;
    private long o;
    private long p;
    private boolean q;
    private boolean r;
    private b s;
    private Interpolator t;
    private final Paint u;

    /* loaded from: classes.dex */
    public class a extends Paint {
        a(PulseView pulseView, int i) {
            super(i);
            setDither(true);
            setFilterBitmap(true);
            setStyle(Paint.Style.FILL);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public enum c {
        WIDTH,
        HEIGHT
    }

    /* loaded from: classes.dex */
    public static class d implements Serializable {

        /* renamed from: b */
        private long f1368b;

        /* renamed from: c */
        private float f1369c;

        public d(long j) {
            this.f1368b = j;
        }

        public float a() {
            return this.f1369c;
        }

        public void a(float f) {
            this.f1369c = f;
        }

        public void a(long j) {
            this.f1368b = j;
        }

        public long b() {
            return this.f1368b;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b */
        public List<d> f1370b;

        /* renamed from: c */
        public boolean f1371c;
        public boolean d;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        private e(Parcel parcel) {
            super(parcel);
            this.f1370b = new ArrayList();
            this.f1370b = (List) parcel.readSerializable();
            boolean z = true;
            this.f1371c = parcel.readByte() != 0;
            this.d = parcel.readByte() == 0 ? false : z;
        }

        /* synthetic */ e(Parcel parcel, a aVar) {
            this(parcel);
        }

        public e(Parcelable parcelable) {
            super(parcelable);
            this.f1370b = new ArrayList();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeSerializable((Serializable) this.f1370b);
            parcel.writeByte(this.f1371c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        }
    }

    public PulseView(Context context) {
        this(context, null);
    }

    public PulseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PulseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1364b = new RectF();
        this.e = new ArrayList();
        this.u = new a(this, 1);
        setWillNotDraw(false);
        Interpolator interpolator = null;
        setLayerType(2, null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.gigamole.library.a.PulseView);
        try {
            setIconRes(obtainStyledAttributes.getResourceId(com.gigamole.library.a.PulseView_pv_icon, 0));
            setIconWidth((int) obtainStyledAttributes.getDimension(com.gigamole.library.a.PulseView_pv_icon_width, 0.0f));
            setIconHeight((int) obtainStyledAttributes.getDimension(com.gigamole.library.a.PulseView_pv_icon_height, 0.0f));
            setPulseCount(obtainStyledAttributes.getInteger(com.gigamole.library.a.PulseView_pv_count, 5));
            setPulseSpawnPeriod(obtainStyledAttributes.getInteger(com.gigamole.library.a.PulseView_pv_spawn_period, 700));
            setPulseAlpha(obtainStyledAttributes.getInteger(com.gigamole.library.a.PulseView_pv_alpha, 70));
            setPulseColor(obtainStyledAttributes.getColor(com.gigamole.library.a.PulseView_pv_color, -12303292));
            setPulseMeasure(obtainStyledAttributes.getInt(com.gigamole.library.a.PulseView_pv_measure, 0));
            try {
                int resourceId = obtainStyledAttributes.getResourceId(com.gigamole.library.a.PulseView_pv_interpolator, 0);
                if (resourceId != 0) {
                    interpolator = AnimationUtils.loadInterpolator(context, resourceId);
                }
            } catch (Resources.NotFoundException e2) {
                e2.printStackTrace();
            }
            setInterpolator(interpolator);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void c() {
        Bitmap bitmap;
        if (this.d != 0) {
            Drawable c2 = a.g.d.a.c(getContext(), this.d);
            if (c2 != null) {
                int i = this.k;
                if (i == 0) {
                    i = c2.getIntrinsicWidth();
                }
                int i2 = this.l;
                if (i2 == 0) {
                    i2 = c2.getIntrinsicHeight();
                }
                if (!(c2 instanceof BitmapDrawable)) {
                    this.f1365c = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(this.f1365c);
                    c2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    c2.draw(canvas);
                    return;
                }
                bitmap = Bitmap.createScaledBitmap(((BitmapDrawable) c2).getBitmap(), i, i2, true);
            } else {
                bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
            }
            this.f1365c = bitmap;
            return;
        }
        throw new IllegalArgumentException("Icon not found. Please select the icon and set to PulseView");
    }

    private void d() {
        int i;
        float f;
        if (this.f == c.HEIGHT) {
            f = this.f1364b.height() - this.f1365c.getHeight();
            i = this.f1365c.getHeight();
        } else {
            f = this.f1364b.width() - this.f1365c.getWidth();
            i = this.f1365c.getWidth();
        }
        this.n = f / i;
        this.m = (float) (this.g * this.h);
        postInvalidate();
    }

    private void e() {
        long currentTimeMillis = System.currentTimeMillis();
        this.o = currentTimeMillis;
        this.p = currentTimeMillis - this.h;
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).a(this.o - (this.h * i));
        }
        postInvalidate();
    }

    private void setPulseMeasure(int i) {
        setPulseMeasure(i != 1 ? c.WIDTH : c.HEIGHT);
    }

    public void a() {
        this.r = true;
        postInvalidate();
    }

    public void b() {
        this.q = true;
        this.r = false;
        b bVar = this.s;
        if (bVar != null) {
            bVar.a();
        }
        postInvalidate();
    }

    public Bitmap getIconBitmap() {
        return this.f1365c;
    }

    public int getIconHeight() {
        return this.l;
    }

    public int getIconRes() {
        return this.d;
    }

    public int getIconWidth() {
        return this.k;
    }

    public Interpolator getInterpolator() {
        return this.t;
    }

    public float getPulseAlpha() {
        return this.i;
    }

    public int getPulseColor() {
        return this.j;
    }

    public int getPulseCount() {
        return this.g;
    }

    public b getPulseListener() {
        return this.s;
    }

    public c getPulseMeasure() {
        return this.f;
    }

    public long getPulseSpawnPeriod() {
        return this.h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float centerX = this.f1364b.centerX() - (this.f1365c.getWidth() * 0.5f);
        float centerY = this.f1364b.centerY() - (this.f1365c.getHeight() * 0.5f);
        if (this.q) {
            if (hasWindowFocus()) {
                this.o = System.currentTimeMillis();
            }
            if (!this.r) {
                long j = this.o;
                if (j > this.p + this.h) {
                    this.p = j;
                    if (this.e.size() < this.g) {
                        this.e.add(0, new d(this.o));
                    }
                }
            }
            for (int i = 0; i < this.e.size(); i++) {
                d dVar = this.e.get(i);
                dVar.a(((float) (this.o - dVar.b())) / this.m);
                canvas.save();
                float interpolation = (this.t.getInterpolation(dVar.a()) * this.n) + 1.0f;
                canvas.scale(interpolation, interpolation, this.f1364b.centerX(), this.f1364b.centerY());
                this.u.setAlpha((int) (this.i - (dVar.a() * this.i)));
                canvas.drawBitmap(this.f1365c, centerX, centerY, this.u);
                canvas.restore();
            }
            if (!this.e.isEmpty()) {
                List<d> list = this.e;
                if (1.0f == ((float) Math.floor(list.get(list.size() - 1).a()))) {
                    List<d> list2 = this.e;
                    list2.remove(list2.size() - 1);
                }
            }
            if (this.r && this.e.isEmpty()) {
                this.r = false;
                this.q = false;
                b bVar = this.s;
                if (bVar != null) {
                    bVar.b();
                }
            }
        }
        canvas.drawBitmap(this.f1365c, centerX, centerY, (Paint) null);
        if (hasWindowFocus()) {
            postInvalidate();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f1364b.set(0.0f, 0.0f, View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        d();
        if (isInEditMode()) {
            for (int i3 = 0; i3 < this.g; i3++) {
                this.e.add(new d(0L));
            }
            e();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.e.clear();
        this.e.addAll(eVar.f1370b);
        this.q = eVar.f1371c;
        this.r = eVar.d;
        e();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f1370b = this.e;
        eVar.f1371c = this.q;
        eVar.d = this.r;
        return eVar;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        e();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            e();
        }
    }

    public void setIconHeight(int i) {
        this.l = i;
        c();
    }

    public void setIconRes(int i) {
        this.d = i;
        c();
    }

    public void setIconWidth(int i) {
        this.k = i;
        c();
    }

    public void setInterpolator(Interpolator interpolator) {
        if (interpolator == null) {
            interpolator = new LinearInterpolator();
        }
        this.t = interpolator;
    }

    public void setPulseAlpha(float f) {
        this.i = Math.max(0.0f, Math.min(f, 255.0f));
        postInvalidate();
    }

    public void setPulseColor(int i) {
        this.j = i;
        this.u.setColor(i);
        this.u.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        postInvalidate();
    }

    public void setPulseCount(int i) {
        this.g = i;
        d();
    }

    public void setPulseListener(b bVar) {
        this.s = bVar;
    }

    public void setPulseMeasure(c cVar) {
        this.f = cVar;
        requestLayout();
    }

    public void setPulseSpawnPeriod(long j) {
        this.h = j;
        d();
    }
}
