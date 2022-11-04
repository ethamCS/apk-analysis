package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    final b.d.g<String, Long> Q;
    private List<Preference> R;
    private boolean S;
    private int T;
    private boolean U;
    private int V;
    private a W;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes.dex */
    public static class b extends Preference.b {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b */
        int f1439b;

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
            this.f1439b = parcel.readInt();
        }

        b(Parcelable parcelable, int i) {
            super(parcelable);
            this.f1439b = i;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1439b);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Q = new b.d.g<>();
        new Handler();
        this.S = true;
        this.T = 0;
        this.U = false;
        this.V = Integer.MAX_VALUE;
        this.W = null;
        this.R = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.z0, i, i2);
        int i3 = t.B0;
        this.S = b.g.d.c.g.b(obtainStyledAttributes, i3, i3, true);
        int i4 = t.A0;
        if (obtainStyledAttributes.hasValue(i4)) {
            P0(b.g.d.c.g.d(obtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    public void G0(Preference preference) {
        H0(preference);
    }

    public boolean H0(Preference preference) {
        long j;
        if (this.R.contains(preference)) {
            return true;
        }
        if (preference.p() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.s() != null) {
                preferenceGroup = preferenceGroup.s();
            }
            String p = preference.p();
            if (preferenceGroup.I0(p) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + p + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.r() == Integer.MAX_VALUE) {
            if (this.S) {
                int i = this.T;
                this.T = i + 1;
                preference.v0(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).Q0(this.S);
            }
        }
        int binarySearch = Collections.binarySearch(this.R, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        if (!O0(preference)) {
            return false;
        }
        synchronized (this) {
            this.R.add(binarySearch, preference);
        }
        j z = z();
        String p2 = preference.p();
        if (p2 == null || !this.Q.containsKey(p2)) {
            j = z.f();
        } else {
            j = this.Q.get(p2).longValue();
            this.Q.remove(p2);
        }
        preference.Q(z, j);
        preference.a(this);
        if (this.U) {
            preference.O();
        }
        N();
        return true;
    }

    public <T extends Preference> T I0(CharSequence charSequence) {
        T t;
        if (charSequence != null) {
            if (TextUtils.equals(p(), charSequence)) {
                return this;
            }
            int M0 = M0();
            for (int i = 0; i < M0; i++) {
                T t2 = (T) L0(i);
                if (TextUtils.equals(t2.p(), charSequence)) {
                    return t2;
                }
                if ((t2 instanceof PreferenceGroup) && (t = (T) ((PreferenceGroup) t2).I0(charSequence)) != null) {
                    return t;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    public int J0() {
        return this.V;
    }

    public a K0() {
        return this.W;
    }

    public Preference L0(int i) {
        return this.R.get(i);
    }

    @Override // androidx.preference.Preference
    public void M(boolean z) {
        super.M(z);
        int M0 = M0();
        for (int i = 0; i < M0; i++) {
            L0(i).X(this, z);
        }
    }

    public int M0() {
        return this.R.size();
    }

    public boolean N0() {
        return true;
    }

    @Override // androidx.preference.Preference
    public void O() {
        super.O();
        this.U = true;
        int M0 = M0();
        for (int i = 0; i < M0; i++) {
            L0(i).O();
        }
    }

    protected boolean O0(Preference preference) {
        preference.X(this, B0());
        return true;
    }

    public void P0(int i) {
        if (i != Integer.MAX_VALUE && !F()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.V = i;
    }

    public void Q0(boolean z) {
        this.S = z;
    }

    public void R0() {
        synchronized (this) {
            Collections.sort(this.R);
        }
    }

    @Override // androidx.preference.Preference
    public void U() {
        super.U();
        this.U = false;
        int M0 = M0();
        for (int i = 0; i < M0; i++) {
            L0(i).U();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void Y(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(b.class)) {
            super.Y(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        this.V = bVar.f1439b;
        super.Y(bVar.getSuperState());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public Parcelable Z() {
        return new b(super.Z(), this.V);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void e(Bundle bundle) {
        super.e(bundle);
        int M0 = M0();
        for (int i = 0; i < M0; i++) {
            L0(i).e(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void f(Bundle bundle) {
        super.f(bundle);
        int M0 = M0();
        for (int i = 0; i < M0; i++) {
            L0(i).f(bundle);
        }
    }
}
