package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    private CharSequence[] W;
    private CharSequence[] X;
    private Set<String> Y;

    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0024a();

        /* renamed from: b */
        Set<String> f1429b;

        /* renamed from: androidx.preference.MultiSelectListPreference$a$a */
        /* loaded from: classes.dex */
        static class C0024a implements Parcelable.Creator<a> {
            C0024a() {
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
            int readInt = parcel.readInt();
            this.f1429b = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f1429b, strArr);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1429b.size());
            Set<String> set = this.f1429b;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.g.d.c.g.a(context, m.c_res_0x7f04010f, 16842897));
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Y = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.E, i, i2);
        this.W = b.g.d.c.g.q(obtainStyledAttributes, t.H, t.F);
        this.X = b.g.d.c.g.q(obtainStyledAttributes, t.I, t.G);
        obtainStyledAttributes.recycle();
    }

    public CharSequence[] M0() {
        return this.W;
    }

    public CharSequence[] N0() {
        return this.X;
    }

    public Set<String> O0() {
        return this.Y;
    }

    public void P0(Set<String> set) {
        this.Y.clear();
        this.Y.addAll(set);
        i0(set);
        L();
    }

    @Override // androidx.preference.Preference
    protected Object V(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public void Y(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.Y(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.Y(aVar.getSuperState());
        P0(aVar.f1429b);
    }

    @Override // androidx.preference.Preference
    public Parcelable Z() {
        Parcelable Z = super.Z();
        if (I()) {
            return Z;
        }
        a aVar = new a(Z);
        aVar.f1429b = O0();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void a0(Object obj) {
        P0(x((Set) obj));
    }
}
