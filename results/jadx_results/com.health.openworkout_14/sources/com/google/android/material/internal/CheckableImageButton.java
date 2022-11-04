package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import b.g.l.t;
/* loaded from: classes.dex */
public class CheckableImageButton extends androidx.appcompat.widget.m implements Checkable {

    /* renamed from: g */
    private static final int[] f3164g = {16842912};

    /* renamed from: d */
    private boolean f3165d;

    /* renamed from: e */
    private boolean f3166e;

    /* renamed from: f */
    private boolean f3167f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends b.g.l.a {
        a() {
            CheckableImageButton.this = r1;
        }

        @Override // b.g.l.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // b.g.l.a
        public void g(View view, b.g.l.c0.c cVar) {
            super.g(view, cVar);
            cVar.Z(CheckableImageButton.this.a());
            cVar.a0(CheckableImageButton.this.isChecked());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends b.i.a.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: d */
        boolean f3169d;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            c(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void c(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f3169d = z;
        }

        @Override // b.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3169d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.D_res_0x7f0401a4);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3166e = true;
        this.f3167f = true;
        t.i0(this, new a());
    }

    public boolean a() {
        return this.f3166e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f3165d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.f3165d) {
            int[] iArr = f3164g;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f3169d);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f3169d = this.f3165d;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f3166e != z) {
            this.f3166e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f3166e || this.f3165d == z) {
            return;
        }
        this.f3165d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f3167f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f3167f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f3165d);
    }
}
