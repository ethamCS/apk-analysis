package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.preference.Preference;
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    private String W;
    private a X;

    /* loaded from: classes.dex */
    public interface a {
        void a(EditText editText);
    }

    /* loaded from: classes.dex */
    public static class b extends Preference.b {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b */
        String f1425b;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* renamed from: b */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        b(Parcel parcel) {
            super(parcel);
            this.f1425b = parcel.readString();
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f1425b);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Preference.g<EditTextPreference> {

        /* renamed from: a */
        private static c f1426a;

        private c() {
        }

        public static c b() {
            if (f1426a == null) {
                f1426a = new c();
            }
            return f1426a;
        }

        /* renamed from: c */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.N0()) ? editTextPreference.i().getString(r.c_res_0x7f1000c0) : editTextPreference.N0();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.g.d.c.g.a(context, m.e_res_0x7f04012e, 16842898));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.w, i, i2);
        int i3 = t.x;
        if (b.g.d.c.g.b(obtainStyledAttributes, i3, i3, false)) {
            x0(c.b());
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public boolean B0() {
        return TextUtils.isEmpty(this.W) || super.B0();
    }

    public a M0() {
        return this.X;
    }

    public String N0() {
        return this.W;
    }

    public void O0(String str) {
        boolean B0 = B0();
        this.W = str;
        h0(str);
        boolean B02 = B0();
        if (B02 != B0) {
            M(B02);
        }
        L();
    }

    @Override // androidx.preference.Preference
    protected Object V(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public void Y(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(b.class)) {
            super.Y(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.Y(bVar.getSuperState());
        O0(bVar.f1425b);
    }

    @Override // androidx.preference.Preference
    public Parcelable Z() {
        Parcelable Z = super.Z();
        if (I()) {
            return Z;
        }
        b bVar = new b(Z);
        bVar.f1425b = N0();
        return bVar;
    }

    @Override // androidx.preference.Preference
    protected void a0(Object obj) {
        O0(w((String) obj));
    }
}
