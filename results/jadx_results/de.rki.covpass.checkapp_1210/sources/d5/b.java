package d5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import b5.d;
import b5.i;
import b5.j;
import b5.k;
import b5.l;
import com.google.android.material.internal.m;
import java.util.Locale;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private final a f8349a;

    /* renamed from: b */
    private final a f8350b;

    /* renamed from: c */
    final float f8351c;

    /* renamed from: d */
    final float f8352d;

    /* renamed from: e */
    final float f8353e;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0121a();
        private int U3;
        private Locale V3;
        private CharSequence W3;
        private int X3;
        private int Y3;
        private Integer Z3;

        /* renamed from: a4 */
        private Boolean f8354a4;

        /* renamed from: b4 */
        private Integer f8355b4;

        /* renamed from: c */
        private int f8356c;

        /* renamed from: c4 */
        private Integer f8357c4;

        /* renamed from: d */
        private Integer f8358d;

        /* renamed from: d4 */
        private Integer f8359d4;

        /* renamed from: e4 */
        private Integer f8360e4;

        /* renamed from: f4 */
        private Integer f8361f4;

        /* renamed from: g4 */
        private Integer f8362g4;

        /* renamed from: q */
        private Integer f8363q;

        /* renamed from: x */
        private int f8364x;

        /* renamed from: y */
        private int f8365y;

        /* renamed from: d5.b$a$a */
        /* loaded from: classes.dex */
        class C0121a implements Parcelable.Creator<a> {
            C0121a() {
            }

            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* renamed from: b */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
            this.f8364x = 255;
            this.f8365y = -2;
            this.U3 = -2;
            this.f8354a4 = Boolean.TRUE;
        }

        a(Parcel parcel) {
            this.f8364x = 255;
            this.f8365y = -2;
            this.U3 = -2;
            this.f8354a4 = Boolean.TRUE;
            this.f8356c = parcel.readInt();
            this.f8358d = (Integer) parcel.readSerializable();
            this.f8363q = (Integer) parcel.readSerializable();
            this.f8364x = parcel.readInt();
            this.f8365y = parcel.readInt();
            this.U3 = parcel.readInt();
            this.W3 = parcel.readString();
            this.X3 = parcel.readInt();
            this.Z3 = (Integer) parcel.readSerializable();
            this.f8355b4 = (Integer) parcel.readSerializable();
            this.f8357c4 = (Integer) parcel.readSerializable();
            this.f8359d4 = (Integer) parcel.readSerializable();
            this.f8360e4 = (Integer) parcel.readSerializable();
            this.f8361f4 = (Integer) parcel.readSerializable();
            this.f8362g4 = (Integer) parcel.readSerializable();
            this.f8354a4 = (Boolean) parcel.readSerializable();
            this.V3 = (Locale) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f8356c);
            parcel.writeSerializable(this.f8358d);
            parcel.writeSerializable(this.f8363q);
            parcel.writeInt(this.f8364x);
            parcel.writeInt(this.f8365y);
            parcel.writeInt(this.U3);
            CharSequence charSequence = this.W3;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.X3);
            parcel.writeSerializable(this.Z3);
            parcel.writeSerializable(this.f8355b4);
            parcel.writeSerializable(this.f8357c4);
            parcel.writeSerializable(this.f8359d4);
            parcel.writeSerializable(this.f8360e4);
            parcel.writeSerializable(this.f8361f4);
            parcel.writeSerializable(this.f8362g4);
            parcel.writeSerializable(this.f8354a4);
            parcel.writeSerializable(this.V3);
        }
    }

    public b(Context context, int i10, int i11, int i12, a aVar) {
        int i13;
        Integer valueOf;
        a aVar2 = new a();
        this.f8350b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i10 != 0) {
            aVar.f8356c = i10;
        }
        TypedArray a10 = a(context, aVar.f8356c, i11, i12);
        Resources resources = context.getResources();
        this.f8351c = a10.getDimensionPixelSize(l.f5723y, resources.getDimensionPixelSize(d.G));
        this.f8353e = a10.getDimensionPixelSize(l.A, resources.getDimensionPixelSize(d.F));
        this.f8352d = a10.getDimensionPixelSize(l.B, resources.getDimensionPixelSize(d.I));
        aVar2.f8364x = aVar.f8364x == -2 ? 255 : aVar.f8364x;
        aVar2.W3 = aVar.W3 == null ? context.getString(j.i_res_0x7f100154) : aVar.W3;
        aVar2.X3 = aVar.X3 == 0 ? i.f5486a : aVar.X3;
        aVar2.Y3 = aVar.Y3 == 0 ? j.k_res_0x7f100156 : aVar.Y3;
        int i14 = 0;
        aVar2.f8354a4 = Boolean.valueOf(aVar.f8354a4 == null || aVar.f8354a4.booleanValue());
        aVar2.U3 = aVar.U3 == -2 ? a10.getInt(l.E, 4) : aVar.U3;
        if (aVar.f8365y != -2) {
            i13 = aVar.f8365y;
        } else {
            int i15 = l.F;
            i13 = a10.hasValue(i15) ? a10.getInt(i15, 0) : -1;
        }
        aVar2.f8365y = i13;
        aVar2.f8358d = Integer.valueOf(aVar.f8358d == null ? t(context, a10, l.f5706w) : aVar.f8358d.intValue());
        if (aVar.f8363q != null) {
            valueOf = aVar.f8363q;
        } else {
            int i16 = l.f5731z;
            valueOf = Integer.valueOf(a10.hasValue(i16) ? t(context, a10, i16) : new q5.d(context, k.e_res_0x7f110214).i().getDefaultColor());
        }
        aVar2.f8363q = valueOf;
        aVar2.Z3 = Integer.valueOf(aVar.Z3 == null ? a10.getInt(l.f5715x, 8388661) : aVar.Z3.intValue());
        aVar2.f8355b4 = Integer.valueOf(aVar.f8355b4 == null ? a10.getDimensionPixelOffset(l.C, 0) : aVar.f8355b4.intValue());
        aVar2.f8357c4 = Integer.valueOf(aVar.f8355b4 == null ? a10.getDimensionPixelOffset(l.G, 0) : aVar.f8357c4.intValue());
        aVar2.f8359d4 = Integer.valueOf(aVar.f8359d4 == null ? a10.getDimensionPixelOffset(l.D, aVar2.f8355b4.intValue()) : aVar.f8359d4.intValue());
        aVar2.f8360e4 = Integer.valueOf(aVar.f8360e4 == null ? a10.getDimensionPixelOffset(l.H, aVar2.f8357c4.intValue()) : aVar.f8360e4.intValue());
        aVar2.f8361f4 = Integer.valueOf(aVar.f8361f4 == null ? 0 : aVar.f8361f4.intValue());
        aVar2.f8362g4 = Integer.valueOf(aVar.f8362g4 != null ? aVar.f8362g4.intValue() : i14);
        a10.recycle();
        aVar2.V3 = aVar.V3 == null ? Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault() : aVar.V3;
        this.f8349a = aVar;
    }

    private TypedArray a(Context context, int i10, int i11, int i12) {
        AttributeSet attributeSet;
        int i13;
        if (i10 != 0) {
            AttributeSet a10 = k5.a.a(context, i10, "badge");
            i13 = a10.getStyleAttribute();
            attributeSet = a10;
        } else {
            attributeSet = null;
            i13 = 0;
        }
        return m.h(context, attributeSet, l.f5697v, i11, i13 == 0 ? i12 : i13, new int[0]);
    }

    private static int t(Context context, TypedArray typedArray, int i10) {
        return q5.c.a(context, typedArray, i10).getDefaultColor();
    }

    public int b() {
        return this.f8350b.f8361f4.intValue();
    }

    public int c() {
        return this.f8350b.f8362g4.intValue();
    }

    public int d() {
        return this.f8350b.f8364x;
    }

    public int e() {
        return this.f8350b.f8358d.intValue();
    }

    public int f() {
        return this.f8350b.Z3.intValue();
    }

    public int g() {
        return this.f8350b.f8363q.intValue();
    }

    public int h() {
        return this.f8350b.Y3;
    }

    public CharSequence i() {
        return this.f8350b.W3;
    }

    public int j() {
        return this.f8350b.X3;
    }

    public int k() {
        return this.f8350b.f8359d4.intValue();
    }

    public int l() {
        return this.f8350b.f8355b4.intValue();
    }

    public int m() {
        return this.f8350b.U3;
    }

    public int n() {
        return this.f8350b.f8365y;
    }

    public Locale o() {
        return this.f8350b.V3;
    }

    public int p() {
        return this.f8350b.f8360e4.intValue();
    }

    public int q() {
        return this.f8350b.f8357c4.intValue();
    }

    public boolean r() {
        return this.f8350b.f8365y != -1;
    }

    public boolean s() {
        return this.f8350b.f8354a4.booleanValue();
    }

    public void u(int i10) {
        this.f8349a.f8364x = i10;
        this.f8350b.f8364x = i10;
    }
}
