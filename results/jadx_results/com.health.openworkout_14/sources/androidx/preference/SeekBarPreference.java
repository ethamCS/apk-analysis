package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    int Q;
    int R;
    private int S;
    private int T;
    boolean U;
    SeekBar V;
    private TextView W;
    boolean X;
    private boolean Y;
    boolean Z;
    private SeekBar.OnSeekBarChangeListener a0;
    private View.OnKeyListener b0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        a() {
            SeekBarPreference.this = r1;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.Z || !seekBarPreference.U) {
                    seekBarPreference.K0(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.L0(i + seekBarPreference2.R);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.U = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.U = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.R != seekBarPreference.Q) {
                seekBarPreference.K0(seekBar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnKeyListener {
        b() {
            SeekBarPreference.this = r1;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.X && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.V;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b */
        int f1442b;

        /* renamed from: c */
        int f1443c;

        /* renamed from: d */
        int f1444d;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<c> {
            a() {
            }

            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            /* renamed from: b */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        c(Parcel parcel) {
            super(parcel);
            this.f1442b = parcel.readInt();
            this.f1443c = parcel.readInt();
            this.f1444d = parcel.readInt();
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1442b);
            parcel.writeInt(this.f1443c);
            parcel.writeInt(this.f1444d);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.k_res_0x7f0402b8);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a0 = new a();
        this.b0 = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.F0, i, i2);
        this.R = obtainStyledAttributes.getInt(t.I0, 0);
        G0(obtainStyledAttributes.getInt(t.G0, 100));
        H0(obtainStyledAttributes.getInt(t.J0, 0));
        this.X = obtainStyledAttributes.getBoolean(t.H0, true);
        this.Y = obtainStyledAttributes.getBoolean(t.K0, false);
        this.Z = obtainStyledAttributes.getBoolean(t.L0, false);
        obtainStyledAttributes.recycle();
    }

    private void J0(int i, boolean z) {
        int i2 = this.R;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.S;
        if (i > i3) {
            i = i3;
        }
        if (i != this.Q) {
            this.Q = i;
            L0(i);
            f0(i);
            if (!z) {
                return;
            }
            L();
        }
    }

    public final void G0(int i) {
        int i2 = this.R;
        if (i < i2) {
            i = i2;
        }
        if (i != this.S) {
            this.S = i;
            L();
        }
    }

    public final void H0(int i) {
        if (i != this.T) {
            this.T = Math.min(this.S - this.R, Math.abs(i));
            L();
        }
    }

    public void I0(int i) {
        J0(i, true);
    }

    void K0(SeekBar seekBar) {
        int progress = this.R + seekBar.getProgress();
        if (progress != this.Q) {
            if (b(Integer.valueOf(progress))) {
                J0(progress, false);
                return;
            }
            seekBar.setProgress(this.Q - this.R);
            L0(this.Q);
        }
    }

    void L0(int i) {
        TextView textView = this.W;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // androidx.preference.Preference
    public void R(l lVar) {
        super.R(lVar);
        lVar.f1551a.setOnKeyListener(this.b0);
        this.V = (SeekBar) lVar.M(p.c_res_0x7f090189);
        TextView textView = (TextView) lVar.M(p.d_res_0x7f09018a);
        this.W = textView;
        if (this.Y) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.W = null;
        }
        SeekBar seekBar = this.V;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.a0);
        this.V.setMax(this.S - this.R);
        int i = this.T;
        if (i != 0) {
            this.V.setKeyProgressIncrement(i);
        } else {
            this.T = this.V.getKeyProgressIncrement();
        }
        this.V.setProgress(this.Q - this.R);
        L0(this.Q);
        this.V.setEnabled(H());
    }

    @Override // androidx.preference.Preference
    protected Object V(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public void Y(Parcelable parcelable) {
        if (!parcelable.getClass().equals(c.class)) {
            super.Y(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.Y(cVar.getSuperState());
        this.Q = cVar.f1442b;
        this.R = cVar.f1443c;
        this.S = cVar.f1444d;
        L();
    }

    @Override // androidx.preference.Preference
    public Parcelable Z() {
        Parcelable Z = super.Z();
        if (I()) {
            return Z;
        }
        c cVar = new c(Z);
        cVar.f1442b = this.Q;
        cVar.f1443c = this.R;
        cVar.f1444d = this.S;
        return cVar;
    }

    @Override // androidx.preference.Preference
    protected void a0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        I0(u(((Integer) obj).intValue()));
    }
}
