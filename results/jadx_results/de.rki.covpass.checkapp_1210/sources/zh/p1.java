package zh;

import java.util.Enumeration;
import java.util.Hashtable;
/* loaded from: classes3.dex */
public class p1 implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private Hashtable f26977c;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private Hashtable f26978a = new Hashtable();

        public b() {
        }

        public b(Hashtable hashtable) {
            Enumeration keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                Integer num = (Integer) keys.nextElement();
                this.f26978a.put(num, hashtable.get(num));
            }
        }

        public p1 a() {
            return new p1(this.f26978a);
        }

        public b b(int i10, byte[] bArr) {
            if (bArr != null) {
                if (i10 != 0 && (i10 < 4 || i10 >= 63 || i10 == 48)) {
                    throw new IllegalArgumentException("Parameter types must be in the range 0,5..47,49..62.");
                }
                if (i10 == 4) {
                    throw new IllegalArgumentException("Parameter type 4 is reserved for internal use.");
                }
                this.f26978a.put(ak.g.e(i10), bArr);
                return this;
            }
            throw new IllegalArgumentException("Parameter value must not be null.");
        }

        public b c(byte[] bArr) {
            return b(0, bArr);
        }
    }

    public p1() {
        this(new Hashtable());
    }

    private p1(Hashtable hashtable) {
        this.f26977c = hashtable;
    }

    public byte[] a() {
        return (byte[]) this.f26977c.get(ak.g.e(0));
    }

    public Hashtable b() {
        return this.f26977c;
    }
}
