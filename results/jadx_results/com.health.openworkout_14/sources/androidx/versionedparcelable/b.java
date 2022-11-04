package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d */
    private final SparseIntArray f1976d;

    /* renamed from: e */
    private final Parcel f1977e;

    /* renamed from: f */
    private final int f1978f;

    /* renamed from: g */
    private final int f1979g;

    /* renamed from: h */
    private final String f1980h;
    private int i;
    private int j;
    private int k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new b.d.a(), new b.d.a(), new b.d.a());
    }

    private b(Parcel parcel, int i, int i2, String str, b.d.a<String, Method> aVar, b.d.a<String, Method> aVar2, b.d.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f1976d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.f1977e = parcel;
        this.f1978f = i;
        this.f1979g = i2;
        this.j = i;
        this.f1980h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f1977e.writeInt(-1);
            return;
        }
        this.f1977e.writeInt(bArr.length);
        this.f1977e.writeByteArray(bArr);
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1977e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i) {
        this.f1977e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f1977e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f1977e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.f1976d.get(i);
            int dataPosition = this.f1977e.dataPosition();
            this.f1977e.setDataPosition(i2);
            this.f1977e.writeInt(dataPosition - i2);
            this.f1977e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f1977e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f1978f) {
            i = this.f1979g;
        }
        int i2 = i;
        return new b(parcel, dataPosition, i2, this.f1980h + "  ", this.f1973a, this.f1974b, this.f1975c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f1977e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f1977e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1977e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1977e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i) {
        while (this.j < this.f1979g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f1977e.setDataPosition(this.j);
            int readInt = this.f1977e.readInt();
            this.k = this.f1977e.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f1977e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f1977e.readParcelable(b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f1977e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i) {
        a();
        this.i = i;
        this.f1976d.put(i, this.f1977e.dataPosition());
        E(0);
        E(i);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z) {
        this.f1977e.writeInt(z ? 1 : 0);
    }
}
