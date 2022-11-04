package gj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;
/* loaded from: classes3.dex */
class f implements ak.d {

    /* renamed from: c */
    private final e f11027c;

    /* renamed from: d */
    private final byte[] f11028d;

    /* renamed from: q */
    private final byte[] f11029q;

    public f(e eVar, byte[] bArr, byte[] bArr2) {
        this.f11027c = eVar;
        this.f11028d = bArr;
        this.f11029q = bArr2;
    }

    public static f a(Object obj) {
        Throwable th2;
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            e e10 = e.e(dataInputStream.readInt());
            byte[] bArr = new byte[e10.c()];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[e10.d() * e10.c()];
            dataInputStream.readFully(bArr2);
            return new f(e10, bArr, bArr2);
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
                    f a10 = a(dataInputStream3);
                    dataInputStream3.close();
                    return a10;
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
        f fVar = (f) obj;
        e eVar = this.f11027c;
        if (eVar == null ? fVar.f11027c != null : !eVar.equals(fVar.f11027c)) {
            return false;
        }
        if (Arrays.equals(this.f11028d, fVar.f11028d)) {
            return Arrays.equals(this.f11029q, fVar.f11029q);
        }
        return false;
    }

    @Override // ak.d
    public byte[] getEncoded() {
        return a.f().i(this.f11027c.f()).d(this.f11028d).d(this.f11029q).b();
    }

    public int hashCode() {
        e eVar = this.f11027c;
        return ((((eVar != null ? eVar.hashCode() : 0) * 31) + Arrays.hashCode(this.f11028d)) * 31) + Arrays.hashCode(this.f11029q);
    }
}
