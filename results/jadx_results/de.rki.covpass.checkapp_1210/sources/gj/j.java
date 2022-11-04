package gj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;
/* loaded from: classes3.dex */
class j implements ak.d {

    /* renamed from: c */
    private final int f11041c;

    /* renamed from: d */
    private final f f11042d;

    /* renamed from: q */
    private final k f11043q;

    /* renamed from: x */
    private final byte[][] f11044x;

    public j(int i10, f fVar, k kVar, byte[][] bArr) {
        this.f11041c = i10;
        this.f11042d = fVar;
        this.f11043q = kVar;
        this.f11044x = bArr;
    }

    public static j a(Object obj) {
        Throwable th2;
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int readInt = dataInputStream.readInt();
            f a10 = f.a(obj);
            k e10 = k.e(dataInputStream.readInt());
            int c10 = e10.c();
            byte[][] bArr = new byte[c10];
            for (int i10 = 0; i10 < c10; i10++) {
                bArr[i10] = new byte[e10.d()];
                dataInputStream.readFully(bArr[i10]);
            }
            return new j(readInt, a10, e10, bArr);
        } else if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(ck.b.d((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        } else {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    j a11 = a(dataInputStream3);
                    dataInputStream3.close();
                    return a11;
                } catch (Throwable th3) {
                    th2 = th3;
                    dataInputStream2 = dataInputStream3;
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f11041c != jVar.f11041c) {
            return false;
        }
        f fVar = this.f11042d;
        if (fVar == null ? jVar.f11042d != null : !fVar.equals(jVar.f11042d)) {
            return false;
        }
        k kVar = this.f11043q;
        if (kVar == null ? jVar.f11043q != null : !kVar.equals(jVar.f11043q)) {
            return false;
        }
        return Arrays.deepEquals(this.f11044x, jVar.f11044x);
    }

    @Override // ak.d
    public byte[] getEncoded() {
        return a.f().i(this.f11041c).d(this.f11042d.getEncoded()).i(this.f11043q.f()).e(this.f11044x).b();
    }

    public int hashCode() {
        int i10 = this.f11041c * 31;
        f fVar = this.f11042d;
        int i11 = 0;
        int hashCode = (i10 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        k kVar = this.f11043q;
        if (kVar != null) {
            i11 = kVar.hashCode();
        }
        return ((hashCode + i11) * 31) + Arrays.deepHashCode(this.f11044x);
    }
}
