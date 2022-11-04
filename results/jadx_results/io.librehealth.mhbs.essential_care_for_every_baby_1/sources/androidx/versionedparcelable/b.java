package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d */
    private final SparseIntArray f304d;

    /* renamed from: e */
    private final Parcel f305e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new b.b.a(), new b.b.a(), new b.b.a());
    }

    private b(Parcel parcel, int i, int i2, String str, b.b.a<String, Method> aVar, b.b.a<String, Method> aVar2, b.b.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f304d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.f305e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f305e.writeInt(-1);
            return;
        }
        this.f305e.writeInt(bArr.length);
        this.f305e.writeByteArray(bArr);
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f305e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i) {
        this.f305e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f305e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f305e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.f304d.get(i);
            int dataPosition = this.f305e.dataPosition();
            this.f305e.setDataPosition(i2);
            this.f305e.writeInt(dataPosition - i2);
            this.f305e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f305e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        int i2 = i;
        return new b(parcel, dataPosition, i2, this.h + "  ", this.f301a, this.f302b, this.f303c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f305e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f305e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f305e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f305e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f305e.setDataPosition(this.j);
            int readInt = this.f305e.readInt();
            this.k = this.f305e.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f305e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f305e.readParcelable(b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f305e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i) {
        a();
        this.i = i;
        this.f304d.put(i, this.f305e.dataPosition());
        E(0);
        E(i);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z) {
        this.f305e.writeInt(z ? 1 : 0);
    }
}
