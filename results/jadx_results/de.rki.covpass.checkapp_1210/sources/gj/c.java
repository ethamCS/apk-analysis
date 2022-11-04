package gj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public class c extends g {
    private final long U3;
    private long V3;
    private d W3;

    /* renamed from: d */
    private final int f11009d;

    /* renamed from: q */
    private final boolean f11010q;

    /* renamed from: x */
    private List<h> f11011x;

    /* renamed from: y */
    private List<j> f11012y;

    private c(int i10, List<h> list, List<j> list2, long j10, long j11, boolean z10) {
        super(true);
        this.V3 = 0L;
        this.f11009d = i10;
        this.f11011x = Collections.unmodifiableList(list);
        this.f11012y = Collections.unmodifiableList(list2);
        this.V3 = j10;
        this.U3 = j11;
        this.f11010q = z10;
    }

    public static c b(Object obj) {
        Throwable th2;
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException("unknown version for hss private key");
            }
            int readInt = dataInputStream.readInt();
            long readLong = dataInputStream.readLong();
            long readLong2 = dataInputStream.readLong();
            boolean readBoolean = dataInputStream.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(h.f(obj));
            }
            for (int i11 = 0; i11 < readInt - 1; i11++) {
                arrayList2.add(j.a(obj));
            }
            return new c(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
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
                    c b10 = b(dataInputStream3);
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

    public static c c(byte[] bArr, byte[] bArr2) {
        c b10 = b(bArr);
        b10.W3 = d.b(bArr2);
        return b10;
    }

    private static c g(c cVar) {
        try {
            return b(cVar.getEncoded());
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    protected Object clone() {
        return g(this);
    }

    public int d() {
        return this.f11009d;
    }

    public synchronized d e() {
        return new d(this.f11009d, f().j());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11009d != cVar.f11009d || this.f11010q != cVar.f11010q || this.U3 != cVar.U3 || this.V3 != cVar.V3 || !this.f11011x.equals(cVar.f11011x)) {
            return false;
        }
        return this.f11012y.equals(cVar.f11012y);
    }

    h f() {
        return this.f11011x.get(0);
    }

    @Override // gj.g, ak.d
    public synchronized byte[] getEncoded() {
        a a10;
        a10 = a.f().i(0).i(this.f11009d).j(this.V3).j(this.U3).a(this.f11010q);
        for (h hVar : this.f11011x) {
            a10.c(hVar);
        }
        for (j jVar : this.f11012y) {
            a10.c(jVar);
        }
        return a10.b();
    }

    public int hashCode() {
        long j10 = this.U3;
        long j11 = this.V3;
        return (((((((((this.f11009d * 31) + (this.f11010q ? 1 : 0)) * 31) + this.f11011x.hashCode()) * 31) + this.f11012y.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }
}
