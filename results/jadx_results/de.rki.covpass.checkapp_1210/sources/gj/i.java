package gj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class i extends g {

    /* renamed from: d */
    private final k f11037d;

    /* renamed from: q */
    private final e f11038q;

    /* renamed from: x */
    private final byte[] f11039x;

    /* renamed from: y */
    private final byte[] f11040y;

    public i(k kVar, e eVar, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f11037d = kVar;
        this.f11038q = eVar;
        this.f11039x = ak.a.h(bArr2);
        this.f11040y = ak.a.h(bArr);
    }

    public static i b(Object obj) {
        Throwable th2;
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            k e10 = k.e(dataInputStream.readInt());
            e e11 = e.e(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[e10.d()];
            dataInputStream.readFully(bArr2);
            return new i(e10, e11, bArr2, bArr);
        } else if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return b(ck.b.d((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        } else {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    i b10 = b(dataInputStream3);
                    dataInputStream3.close();
                    return b10;
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

    byte[] c() {
        return a.f().i(this.f11037d.f()).i(this.f11038q.f()).d(this.f11039x).d(this.f11040y).b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f11037d.equals(iVar.f11037d) || !this.f11038q.equals(iVar.f11038q) || !ak.a.c(this.f11039x, iVar.f11039x)) {
            return false;
        }
        return ak.a.c(this.f11040y, iVar.f11040y);
    }

    @Override // gj.g, ak.d
    public byte[] getEncoded() {
        return c();
    }

    public int hashCode() {
        return (((((this.f11037d.hashCode() * 31) + this.f11038q.hashCode()) * 31) + ak.a.F(this.f11039x)) * 31) + ak.a.F(this.f11040y);
    }
}
