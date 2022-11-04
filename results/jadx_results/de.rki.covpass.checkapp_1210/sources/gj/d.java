package gj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class d extends g {

    /* renamed from: d */
    private final int f11013d;

    /* renamed from: q */
    private final i f11014q;

    public d(int i10, i iVar) {
        super(false);
        this.f11013d = i10;
        this.f11014q = iVar;
    }

    public static d b(Object obj) {
        Throwable th2;
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj instanceof DataInputStream) {
            return new d(((DataInputStream) obj).readInt(), i.b(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return b(ck.b.d((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                d b10 = b(dataInputStream2);
                dataInputStream2.close();
                return b10;
            } catch (Throwable th3) {
                th2 = th3;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public int c() {
        return this.f11013d;
    }

    public i d() {
        return this.f11014q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f11013d == dVar.f11013d) {
            return this.f11014q.equals(dVar.f11014q);
        }
        return false;
    }

    @Override // gj.g, ak.d
    public byte[] getEncoded() {
        return a.f().i(this.f11013d).d(this.f11014q.getEncoded()).b();
    }

    public int hashCode() {
        return (this.f11013d * 31) + this.f11014q.hashCode();
    }
}
