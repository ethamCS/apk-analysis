package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private CharSequence[] W;
    private CharSequence[] X;
    private String Y;
    private String Z;
    private boolean a0;

    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0023a();

        /* renamed from: b */
        String f1427b;

        /* renamed from: androidx.preference.ListPreference$a$a */
        /* loaded from: classes.dex */
        static class C0023a implements Parcelable.Creator<a> {
            C0023a() {
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
            this.f1427b = parcel.readString();
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f1427b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Preference.g<ListPreference> {

        /* renamed from: a */
        private static b f1428a;

        private b() {
        }

        public static b b() {
            if (f1428a == null) {
                f1428a = new b();
            }
            return f1428a;
        }

        /* renamed from: c */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.O0()) ? listPreference.i().getString(r.c_res_0x7f1000c0) : listPreference.O0();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.g.d.c.g.a(context, m.c_res_0x7f04010f, 16842897));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.y, i, i2);
        this.W = b.g.d.c.g.q(obtainStyledAttributes, t.B, t.z);
        this.X = b.g.d.c.g.q(obtainStyledAttributes, t.C, t.A);
        int i3 = t.D;
        if (b.g.d.c.g.b(obtainStyledAttributes, i3, i3, false)) {
            x0(b.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, t.J, i, i2);
        this.Z = b.g.d.c.g.o(obtainStyledAttributes2, t.r0, t.R);
        obtainStyledAttributes2.recycle();
    }

    private int R0() {
        return M0(this.Y);
    }

    @Override // androidx.preference.Preference
    public CharSequence B() {
        if (C() != null) {
            return C().a(this);
        }
        CharSequence O0 = O0();
        CharSequence B = super.B();
        String str = this.Z;
        if (str == null) {
            return B;
        }
        Object[] objArr = new Object[1];
        if (O0 == null) {
            O0 = "";
        }
        objArr[0] = O0;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, B)) {
            return B;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public int M0(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.X) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.X[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] N0() {
        return this.W;
    }

    public CharSequence O0() {
        CharSequence[] charSequenceArr;
        int R0 = R0();
        if (R0 < 0 || (charSequenceArr = this.W) == null) {
            return null;
        }
        return charSequenceArr[R0];
    }

    public CharSequence[] P0() {
        return this.X;
    }

    public String Q0() {
        return this.Y;
    }

    public void S0(String str) {
        boolean z = !TextUtils.equals(this.Y, str);
        if (z || !this.a0) {
            this.Y = str;
            this.a0 = true;
            h0(str);
            if (!z) {
                return;
            }
            L();
        }
    }

    @Override // androidx.preference.Preference
    protected Object V(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public void Y(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.Y(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.Y(aVar.getSuperState());
        S0(aVar.f1427b);
    }

    @Override // androidx.preference.Preference
    public Parcelable Z() {
        Parcelable Z = super.Z();
        if (I()) {
            return Z;
        }
        a aVar = new a(Z);
        aVar.f1427b = Q0();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void a0(Object obj) {
        S0(w((String) obj));
    }
}
