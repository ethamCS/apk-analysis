package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d */
    private final SparseIntArray f5136d;

    /* renamed from: e */
    private final Parcel f5137e;

    /* renamed from: f */
    private final int f5138f;

    /* renamed from: g */
    private final int f5139g;

    /* renamed from: h */
    private final String f5140h;

    /* renamed from: i */
    private int f5141i;

    /* renamed from: j */
    private int f5142j;

    /* renamed from: k */
    private int f5143k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new i0.a(), new i0.a(), new i0.a());
    }

    private b(Parcel parcel, int i10, int i11, String str, i0.a<String, Method> aVar, i0.a<String, Method> aVar2, i0.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f5136d = new SparseIntArray();
        this.f5141i = -1;
        this.f5143k = -1;
        this.f5137e = parcel;
        this.f5138f = i10;
        this.f5139g = i11;
        this.f5142j = i10;
        this.f5140h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f5137e.writeInt(-1);
            return;
        }
        this.f5137e.writeInt(bArr.length);
        this.f5137e.writeByteArray(bArr);
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f5137e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i10) {
        this.f5137e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f5137e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f5137e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f5141i;
        if (i10 >= 0) {
            int i11 = this.f5136d.get(i10);
            int dataPosition = this.f5137e.dataPosition();
            this.f5137e.setDataPosition(i11);
            this.f5137e.writeInt(dataPosition - i11);
            this.f5137e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f5137e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f5142j;
        if (i10 == this.f5138f) {
            i10 = this.f5139g;
        }
        int i11 = i10;
        return new b(parcel, dataPosition, i11, this.f5140h + "  ", this.f5133a, this.f5134b, this.f5135c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f5137e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f5137e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f5137e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f5137e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i10) {
        while (this.f5142j < this.f5139g) {
            int i11 = this.f5143k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f5137e.setDataPosition(this.f5142j);
            int readInt = this.f5137e.readInt();
            this.f5143k = this.f5137e.readInt();
            this.f5142j += readInt;
        }
        return this.f5143k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f5137e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f5137e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f5137e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i10) {
        a();
        this.f5141i = i10;
        this.f5136d.put(i10, this.f5137e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z10) {
        this.f5137e.writeInt(z10 ? 1 : 0);
    }
}
