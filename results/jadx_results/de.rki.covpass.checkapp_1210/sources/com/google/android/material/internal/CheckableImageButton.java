package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.core.view.y;
/* loaded from: classes.dex */
public class CheckableImageButton extends androidx.appcompat.widget.o implements Checkable {
    private static final int[] V3 = {16842912};
    private boolean U3;

    /* renamed from: x */
    private boolean f7313x;

    /* renamed from: y */
    private boolean f7314y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.core.view.a {
        a() {
            CheckableImageButton.this = r1;
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            super.g(view, dVar);
            dVar.V(CheckableImageButton.this.a());
            dVar.W(CheckableImageButton.this.isChecked());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends v0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: q */
        boolean f7316q;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<b> {
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
            public b[] newArray(int i10) {
                return new b[i10];
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
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f7316q = z10;
        }

        @Override // v0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7316q ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.C);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7314y = true;
        this.U3 = true;
        y.o0(this, new a());
    }

    public boolean a() {
        return this.f7314y;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7313x;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.f7313x) {
            int[] iArr = V3;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f7316q);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f7316q = this.f7313x;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f7314y != z10) {
            this.f7314y = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f7314y || this.f7313x == z10) {
            return;
        }
        this.f7313x = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.U3 = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.U3) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f7313x);
    }
}
