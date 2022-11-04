package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.q;
import com.airbnb.lottie.LottieAnimationView;
import e4.a0;
import e4.b0;
import e4.c0;
import e4.p;
import e4.r;
import e4.t;
import e4.u;
import e4.v;
import e4.x;
import e4.y;
import e4.z;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class LottieAnimationView extends q {

    /* renamed from: g4 */
    private static final String f6646g4 = LottieAnimationView.class.getSimpleName();

    /* renamed from: h4 */
    private static final r<Throwable> f6647h4 = e4.e.f9389a;
    private r<Throwable> U3;
    private String X3;
    private int Y3;

    /* renamed from: e4 */
    private o<e4.h> f6652e4;

    /* renamed from: f4 */
    private e4.h f6653f4;

    /* renamed from: x */
    private final r<e4.h> f6654x = new r() { // from class: e4.d
        @Override // e4.r
        public final void a(Object obj) {
            LottieAnimationView.this.setComposition((h) obj);
        }
    };

    /* renamed from: y */
    private final r<Throwable> f6655y = new a();
    private int V3 = 0;
    private final n W3 = new n();
    private boolean Z3 = false;

    /* renamed from: a4 */
    private boolean f6648a4 = false;

    /* renamed from: b4 */
    private boolean f6649b4 = true;

    /* renamed from: c4 */
    private final Set<c> f6650c4 = new HashSet();

    /* renamed from: d4 */
    private final Set<t> f6651d4 = new HashSet();

    /* loaded from: classes.dex */
    public class a implements r<Throwable> {
        a() {
            LottieAnimationView.this = r1;
        }

        /* renamed from: b */
        public void a(Throwable th2) {
            if (LottieAnimationView.this.V3 != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.V3);
            }
            (LottieAnimationView.this.U3 == null ? LottieAnimationView.f6647h4 : LottieAnimationView.this.U3).a(th2);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();
        int U3;
        int V3;

        /* renamed from: c */
        String f6657c;

        /* renamed from: d */
        int f6658d;

        /* renamed from: q */
        float f6659q;

        /* renamed from: x */
        boolean f6660x;

        /* renamed from: y */
        String f6661y;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f6657c = parcel.readString();
            this.f6659q = parcel.readFloat();
            this.f6660x = parcel.readInt() != 1 ? false : true;
            this.f6661y = parcel.readString();
            this.U3 = parcel.readInt();
            this.V3 = parcel.readInt();
        }

        /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f6657c);
            parcel.writeFloat(this.f6659q);
            parcel.writeInt(this.f6660x ? 1 : 0);
            parcel.writeString(this.f6661y);
            parcel.writeInt(this.U3);
            parcel.writeInt(this.V3);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o(attributeSet, y.a_res_0x7f030288);
    }

    private void j() {
        o<e4.h> oVar = this.f6652e4;
        if (oVar != null) {
            oVar.j(this.f6654x);
            this.f6652e4.i(this.f6655y);
        }
    }

    private void k() {
        this.f6653f4 = null;
        this.W3.s();
    }

    private o<e4.h> m(final String str) {
        return isInEditMode() ? new o<>(new Callable() { // from class: e4.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                v q10;
                q10 = LottieAnimationView.this.q(str);
                return q10;
            }
        }, true) : this.f6649b4 ? p.j(getContext(), str) : p.k(getContext(), str, null);
    }

    private o<e4.h> n(final int i10) {
        return isInEditMode() ? new o<>(new Callable() { // from class: e4.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                v r10;
                r10 = LottieAnimationView.this.r(i10);
                return r10;
            }
        }, true) : this.f6649b4 ? p.s(getContext(), i10) : p.t(getContext(), i10, null);
    }

    private void o(AttributeSet attributeSet, int i10) {
        String string;
        boolean z10 = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z.C, i10, 0);
        this.f6649b4 = obtainStyledAttributes.getBoolean(z.E, true);
        int i11 = z.O;
        boolean hasValue = obtainStyledAttributes.hasValue(i11);
        int i12 = z.J;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i12);
        int i13 = z.T;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i13);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(i11, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(i12);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(i13)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(z.I, 0));
            if (obtainStyledAttributes.getBoolean(z.D, false)) {
                this.f6648a4 = true;
            }
            if (obtainStyledAttributes.getBoolean(z.M, false)) {
                this.W3.O0(-1);
            }
            int i14 = z.R;
            if (obtainStyledAttributes.hasValue(i14)) {
                setRepeatMode(obtainStyledAttributes.getInt(i14, 1));
            }
            int i15 = z.Q;
            if (obtainStyledAttributes.hasValue(i15)) {
                setRepeatCount(obtainStyledAttributes.getInt(i15, -1));
            }
            int i16 = z.S;
            if (obtainStyledAttributes.hasValue(i16)) {
                setSpeed(obtainStyledAttributes.getFloat(i16, 1.0f));
            }
            int i17 = z.F;
            if (obtainStyledAttributes.hasValue(i17)) {
                setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i17, true));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(z.L));
            setProgress(obtainStyledAttributes.getFloat(z.N, 0.0f));
            l(obtainStyledAttributes.getBoolean(z.H, false));
            int i18 = z.G;
            if (obtainStyledAttributes.hasValue(i18)) {
                i(new j4.e("**"), u.K, new r4.c(new b0(g.a.a(getContext(), obtainStyledAttributes.getResourceId(i18, -1)).getDefaultColor())));
            }
            int i19 = z.P;
            if (obtainStyledAttributes.hasValue(i19)) {
                a0 a0Var = a0.AUTOMATIC;
                int i20 = obtainStyledAttributes.getInt(i19, a0Var.ordinal());
                if (i20 >= a0.values().length) {
                    i20 = a0Var.ordinal();
                }
                setRenderMode(a0.values()[i20]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(z.K, false));
            obtainStyledAttributes.recycle();
            n nVar = this.W3;
            if (q4.h.f(getContext()) != 0.0f) {
                z10 = true;
            }
            nVar.S0(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    public /* synthetic */ v q(String str) {
        return this.f6649b4 ? p.l(getContext(), str) : p.m(getContext(), str, null);
    }

    public /* synthetic */ v r(int i10) {
        return this.f6649b4 ? p.u(getContext(), i10) : p.v(getContext(), i10, null);
    }

    public static /* synthetic */ void s(Throwable th2) {
        if (q4.h.k(th2)) {
            q4.d.d("Unable to load composition.", th2);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th2);
    }

    private void setCompositionTask(o<e4.h> oVar) {
        this.f6650c4.add(c.SET_ANIMATION);
        k();
        j();
        this.f6652e4 = oVar.d(this.f6654x).c(this.f6655y);
    }

    private void x() {
        boolean p10 = p();
        setImageDrawable(null);
        setImageDrawable(this.W3);
        if (p10) {
            this.W3.r0();
        }
    }

    public boolean getClipToCompositionBounds() {
        return this.W3.D();
    }

    public e4.h getComposition() {
        return this.f6653f4;
    }

    public long getDuration() {
        e4.h hVar = this.f6653f4;
        if (hVar != null) {
            return hVar.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.W3.H();
    }

    public String getImageAssetsFolder() {
        return this.W3.J();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.W3.L();
    }

    public float getMaxFrame() {
        return this.W3.M();
    }

    public float getMinFrame() {
        return this.W3.N();
    }

    public x getPerformanceTracker() {
        return this.W3.O();
    }

    public float getProgress() {
        return this.W3.P();
    }

    public a0 getRenderMode() {
        return this.W3.Q();
    }

    public int getRepeatCount() {
        return this.W3.R();
    }

    public int getRepeatMode() {
        return this.W3.S();
    }

    public float getSpeed() {
        return this.W3.T();
    }

    public <T> void i(j4.e eVar, T t10, r4.c<T> cVar) {
        this.W3.p(eVar, t10, cVar);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (!(drawable instanceof n) || ((n) drawable).Q() != a0.SOFTWARE) {
            return;
        }
        this.W3.invalidateSelf();
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        n nVar = this.W3;
        if (drawable2 == nVar) {
            super.invalidateDrawable(nVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void l(boolean z10) {
        this.W3.x(z10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f6648a4) {
            return;
        }
        this.W3.o0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.X3 = bVar.f6657c;
        Set<c> set = this.f6650c4;
        c cVar = c.SET_ANIMATION;
        if (!set.contains(cVar) && !TextUtils.isEmpty(this.X3)) {
            setAnimation(this.X3);
        }
        this.Y3 = bVar.f6658d;
        if (!this.f6650c4.contains(cVar) && (i10 = this.Y3) != 0) {
            setAnimation(i10);
        }
        if (!this.f6650c4.contains(c.SET_PROGRESS)) {
            setProgress(bVar.f6659q);
        }
        if (!this.f6650c4.contains(c.PLAY_OPTION) && bVar.f6660x) {
            u();
        }
        if (!this.f6650c4.contains(c.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(bVar.f6661y);
        }
        if (!this.f6650c4.contains(c.SET_REPEAT_MODE)) {
            setRepeatMode(bVar.U3);
        }
        if (this.f6650c4.contains(c.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(bVar.V3);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f6657c = this.X3;
        bVar.f6658d = this.Y3;
        bVar.f6659q = this.W3.P();
        bVar.f6660x = this.W3.Y();
        bVar.f6661y = this.W3.J();
        bVar.U3 = this.W3.S();
        bVar.V3 = this.W3.R();
        return bVar;
    }

    public boolean p() {
        return this.W3.X();
    }

    public void setAnimation(int i10) {
        this.Y3 = i10;
        this.X3 = null;
        setCompositionTask(n(i10));
    }

    public void setAnimation(String str) {
        this.X3 = str;
        this.Y3 = 0;
        setCompositionTask(m(str));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        w(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f6649b4 ? p.w(getContext(), str) : p.x(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.W3.t0(z10);
    }

    public void setCacheComposition(boolean z10) {
        this.f6649b4 = z10;
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.W3.u0(z10);
    }

    public void setComposition(e4.h hVar) {
        if (e4.c.f9377a) {
            String str = f6646g4;
            Log.v(str, "Set Composition \n" + hVar);
        }
        this.W3.setCallback(this);
        this.f6653f4 = hVar;
        this.Z3 = true;
        boolean v02 = this.W3.v0(hVar);
        this.Z3 = false;
        if (getDrawable() != this.W3 || v02) {
            if (!v02) {
                x();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (t tVar : this.f6651d4) {
                tVar.a(hVar);
            }
        }
    }

    public void setFailureListener(r<Throwable> rVar) {
        this.U3 = rVar;
    }

    public void setFallbackResource(int i10) {
        this.V3 = i10;
    }

    public void setFontAssetDelegate(e4.a aVar) {
        this.W3.w0(aVar);
    }

    public void setFrame(int i10) {
        this.W3.x0(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.W3.y0(z10);
    }

    public void setImageAssetDelegate(e4.b bVar) {
        this.W3.z0(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.W3.A0(str);
    }

    @Override // androidx.appcompat.widget.q, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        j();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.q, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        j();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.q, android.widget.ImageView
    public void setImageResource(int i10) {
        j();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.W3.B0(z10);
    }

    public void setMaxFrame(int i10) {
        this.W3.C0(i10);
    }

    public void setMaxFrame(String str) {
        this.W3.D0(str);
    }

    public void setMaxProgress(float f10) {
        this.W3.E0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.W3.G0(str);
    }

    public void setMinFrame(int i10) {
        this.W3.H0(i10);
    }

    public void setMinFrame(String str) {
        this.W3.I0(str);
    }

    public void setMinProgress(float f10) {
        this.W3.J0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.W3.K0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.W3.L0(z10);
    }

    public void setProgress(float f10) {
        this.f6650c4.add(c.SET_PROGRESS);
        this.W3.M0(f10);
    }

    public void setRenderMode(a0 a0Var) {
        this.W3.N0(a0Var);
    }

    public void setRepeatCount(int i10) {
        this.f6650c4.add(c.SET_REPEAT_COUNT);
        this.W3.O0(i10);
    }

    public void setRepeatMode(int i10) {
        this.f6650c4.add(c.SET_REPEAT_MODE);
        this.W3.P0(i10);
    }

    public void setSafeMode(boolean z10) {
        this.W3.Q0(z10);
    }

    public void setSpeed(float f10) {
        this.W3.R0(f10);
    }

    public void setTextDelegate(c0 c0Var) {
        this.W3.T0(c0Var);
    }

    public void t() {
        this.f6648a4 = false;
        this.W3.n0();
    }

    public void u() {
        this.f6650c4.add(c.PLAY_OPTION);
        this.W3.o0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        n nVar;
        if (!this.Z3 && drawable == (nVar = this.W3) && nVar.X()) {
            t();
        } else if (!this.Z3 && (drawable instanceof n)) {
            n nVar2 = (n) drawable;
            if (nVar2.X()) {
                nVar2.n0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v(InputStream inputStream, String str) {
        setCompositionTask(p.n(inputStream, str));
    }

    public void w(String str, String str2) {
        v(new ByteArrayInputStream(str.getBytes()), str2);
    }
}
