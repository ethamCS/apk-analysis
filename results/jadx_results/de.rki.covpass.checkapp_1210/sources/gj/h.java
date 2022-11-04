package gj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.crypto.r;
/* loaded from: classes3.dex */
public class h extends g {

    /* renamed from: a4 */
    private static a f11030a4;

    /* renamed from: b4 */
    private static a[] f11031b4;
    private final byte[] U3;
    private final Map<a, byte[]> V3 = new WeakHashMap();
    private final int W3;
    private final r X3;
    private int Y3;
    private i Z3;

    /* renamed from: d */
    private final byte[] f11032d;

    /* renamed from: q */
    private final k f11033q;

    /* renamed from: x */
    private final e f11034x;

    /* renamed from: y */
    private final int f11035y;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private final int f11036a;

        a(int i10) {
            this.f11036a = i10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && ((a) obj).f11036a == this.f11036a;
        }

        public int hashCode() {
            return this.f11036a;
        }
    }

    static {
        a aVar = new a(1);
        f11030a4 = aVar;
        a[] aVarArr = new a[129];
        f11031b4 = aVarArr;
        aVarArr[1] = aVar;
        int i10 = 2;
        while (true) {
            a[] aVarArr2 = f11031b4;
            if (i10 < aVarArr2.length) {
                aVarArr2[i10] = new a(i10);
                i10++;
            } else {
                return;
            }
        }
    }

    public h(k kVar, e eVar, int i10, byte[] bArr, int i11, byte[] bArr2) {
        super(true);
        this.f11033q = kVar;
        this.f11034x = eVar;
        this.Y3 = i10;
        this.f11032d = ak.a.h(bArr);
        this.f11035y = i11;
        this.U3 = ak.a.h(bArr2);
        this.W3 = 1 << (kVar.c() + 1);
        this.X3 = b.a(kVar.b());
    }

    private byte[] b(int i10) {
        int c10 = 1 << k().c();
        if (i10 >= c10) {
            m.a(e(), this.X3);
            m.c(i10, this.X3);
            m.b((short) -32126, this.X3);
            m.a(l.a(i(), e(), i10 - c10, h()), this.X3);
            byte[] bArr = new byte[this.X3.getDigestSize()];
            this.X3.doFinal(bArr, 0);
            return bArr;
        }
        int i11 = i10 * 2;
        byte[] c11 = c(i11);
        byte[] c12 = c(i11 + 1);
        m.a(e(), this.X3);
        m.c(i10, this.X3);
        m.b((short) -31869, this.X3);
        m.a(c11, this.X3);
        m.a(c12, this.X3);
        byte[] bArr2 = new byte[this.X3.getDigestSize()];
        this.X3.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] d(a aVar) {
        synchronized (this.V3) {
            byte[] bArr = this.V3.get(aVar);
            if (bArr != null) {
                return bArr;
            }
            byte[] b10 = b(aVar.f11036a);
            this.V3.put(aVar, b10);
            return b10;
        }
    }

    public static h f(Object obj) {
        Throwable th2;
        DataInputStream dataInputStream;
        if (obj instanceof h) {
            return (h) obj;
        }
        if (!(obj instanceof DataInputStream)) {
            if (!(obj instanceof byte[])) {
                if (obj instanceof InputStream) {
                    return f(ck.b.d((InputStream) obj));
                }
                throw new IllegalArgumentException("cannot parse " + obj);
            }
            DataInputStream dataInputStream2 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                h f10 = f(dataInputStream);
                dataInputStream.close();
                return f10;
            } catch (Throwable th4) {
                th2 = th4;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th2;
            }
        }
        DataInputStream dataInputStream3 = (DataInputStream) obj;
        if (dataInputStream3.readInt() != 0) {
            throw new IllegalStateException("expected version 0 lms private key");
        }
        k e10 = k.e(dataInputStream3.readInt());
        e e11 = e.e(dataInputStream3.readInt());
        byte[] bArr = new byte[16];
        dataInputStream3.readFully(bArr);
        int readInt = dataInputStream3.readInt();
        int readInt2 = dataInputStream3.readInt();
        int readInt3 = dataInputStream3.readInt();
        if (readInt3 < 0) {
            throw new IllegalStateException("secret length less than zero");
        }
        if (readInt3 <= dataInputStream3.available()) {
            byte[] bArr2 = new byte[readInt3];
            dataInputStream3.readFully(bArr2);
            return new h(e10, e11, readInt, bArr, readInt2, bArr2);
        }
        throw new IOException("secret length exceeded " + dataInputStream3.available());
    }

    public static h g(byte[] bArr, byte[] bArr2) {
        h f10 = f(bArr);
        f10.Z3 = i.b(bArr2);
        return f10;
    }

    byte[] c(int i10) {
        if (i10 < this.W3) {
            a[] aVarArr = f11031b4;
            return d(i10 < aVarArr.length ? aVarArr[i10] : new a(i10));
        }
        return b(i10);
    }

    public byte[] e() {
        return ak.a.h(this.f11032d);
    }

    public boolean equals(Object obj) {
        i iVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.Y3 != hVar.Y3 || this.f11035y != hVar.f11035y || !ak.a.c(this.f11032d, hVar.f11032d)) {
            return false;
        }
        k kVar = this.f11033q;
        if (kVar == null ? hVar.f11033q != null : !kVar.equals(hVar.f11033q)) {
            return false;
        }
        e eVar = this.f11034x;
        if (eVar == null ? hVar.f11034x != null : !eVar.equals(hVar.f11034x)) {
            return false;
        }
        if (!ak.a.c(this.U3, hVar.U3)) {
            return false;
        }
        i iVar2 = this.Z3;
        if (iVar2 != null && (iVar = hVar.Z3) != null) {
            return iVar2.equals(iVar);
        }
        return true;
    }

    @Override // gj.g, ak.d
    public byte[] getEncoded() {
        return gj.a.f().i(0).i(this.f11033q.f()).i(this.f11034x.f()).d(this.f11032d).i(this.Y3).i(this.f11035y).i(this.U3.length).d(this.U3).b();
    }

    public byte[] h() {
        return ak.a.h(this.U3);
    }

    public int hashCode() {
        int F = ((this.Y3 * 31) + ak.a.F(this.f11032d)) * 31;
        k kVar = this.f11033q;
        int i10 = 0;
        int hashCode = (F + (kVar != null ? kVar.hashCode() : 0)) * 31;
        e eVar = this.f11034x;
        int hashCode2 = (((((hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f11035y) * 31) + ak.a.F(this.U3)) * 31;
        i iVar = this.Z3;
        if (iVar != null) {
            i10 = iVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public e i() {
        return this.f11034x;
    }

    public i j() {
        i iVar;
        synchronized (this) {
            if (this.Z3 == null) {
                this.Z3 = new i(this.f11033q, this.f11034x, d(f11030a4), this.f11032d);
            }
            iVar = this.Z3;
        }
        return iVar;
    }

    public k k() {
        return this.f11033q;
    }
}
