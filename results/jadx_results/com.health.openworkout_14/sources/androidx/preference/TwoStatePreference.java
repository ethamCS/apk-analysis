package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    protected boolean Q;
    private CharSequence R;
    private CharSequence S;
    private boolean T;
    private boolean U;

    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0025a();

        /* renamed from: b */
        boolean f1447b;

        /* renamed from: androidx.preference.TwoStatePreference$a$a */
        /* loaded from: classes.dex */
        static class C0025a implements Parcelable.Creator<a> {
            C0025a() {
            }

            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* renamed from: b */
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        a(Parcel parcel) {
            super(parcel);
            this.f1447b = parcel.readInt() != 1 ? false : true;
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1447b ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public boolean B0() {
        return (this.U ? this.Q : !this.Q) || super.B0();
    }

    public boolean G0() {
        return this.Q;
    }

    public void H0(boolean z) {
        boolean z2 = this.Q != z;
        if (z2 || !this.T) {
            this.Q = z;
            this.T = true;
            e0(z);
            if (!z2) {
                return;
            }
            M(B0());
            L();
        }
    }

    public void I0(boolean z) {
        this.U = z;
    }

    public void J0(CharSequence charSequence) {
        this.S = charSequence;
        if (!G0()) {
            L();
        }
    }

    public void K0(CharSequence charSequence) {
        this.R = charSequence;
        if (G0()) {
            L();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L0(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.Q
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.CharSequence r1 = r4.R
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1c
            java.lang.CharSequence r0 = r4.R
        L17:
            r5.setText(r0)
            r0 = 0
            goto L2b
        L1c:
            boolean r1 = r4.Q
            if (r1 != 0) goto L2b
            java.lang.CharSequence r1 = r4.S
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2b
            java.lang.CharSequence r0 = r4.S
            goto L17
        L2b:
            if (r0 == 0) goto L3b
            java.lang.CharSequence r1 = r4.B()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L3b
            r5.setText(r1)
            r0 = 0
        L3b:
            r1 = 8
            if (r0 != 0) goto L40
            goto L42
        L40:
            r2 = 8
        L42:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L4b
            r5.setVisibility(r2)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.L0(android.view.View):void");
    }

    public void M0(l lVar) {
        L0(lVar.M(16908304));
    }

    @Override // androidx.preference.Preference
    public void S() {
        super.S();
        boolean z = !G0();
        if (b(Boolean.valueOf(z))) {
            H0(z);
        }
    }

    @Override // androidx.preference.Preference
    protected Object V(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    public void Y(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.Y(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.Y(aVar.getSuperState());
        H0(aVar.f1447b);
    }

    @Override // androidx.preference.Preference
    public Parcelable Z() {
        Parcelable Z = super.Z();
        if (I()) {
            return Z;
        }
        a aVar = new a(Z);
        aVar.f1447b = G0();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void a0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        H0(t(((Boolean) obj).booleanValue()));
    }
}
