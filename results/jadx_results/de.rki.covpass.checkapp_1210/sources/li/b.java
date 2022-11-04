package li;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import javax.crypto.Cipher;
/* loaded from: classes3.dex */
public class b extends FilterOutputStream {

    /* renamed from: c */
    private final Cipher f16083c;

    /* renamed from: d */
    private final byte[] f16084d = new byte[1];

    public b(OutputStream outputStream, Cipher cipher) {
        super(outputStream);
        this.f16083c = cipher;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(4:20|2|(1:4)|5)|18|11|(1:16)(1:17)) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r4 = this;
            javax.crypto.Cipher r0 = r4.f16083c     // Catch: java.lang.Exception -> Lf java.security.GeneralSecurityException -> L27
            byte[] r0 = r0.doFinal()     // Catch: java.lang.Exception -> Lf java.security.GeneralSecurityException -> L27
            if (r0 == 0) goto Ld
            java.io.OutputStream r1 = r4.out     // Catch: java.lang.Exception -> Lf java.security.GeneralSecurityException -> L27
            r1.write(r0)     // Catch: java.lang.Exception -> Lf java.security.GeneralSecurityException -> L27
        Ld:
            r0 = 0
            goto L30
        Lf:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error closing stream: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            goto L2f
        L27:
            r0 = move-exception
            th.d r1 = new th.d
            java.lang.String r2 = "Error during cipher finalisation"
            r1.<init>(r2, r0)
        L2f:
            r0 = r1
        L30:
            r4.flush()     // Catch: java.io.IOException -> L39
            java.io.OutputStream r1 = r4.out     // Catch: java.io.IOException -> L39
            r1.close()     // Catch: java.io.IOException -> L39
            goto L3d
        L39:
            r1 = move-exception
            if (r0 != 0) goto L3d
            r0 = r1
        L3d:
            if (r0 != 0) goto L40
            return
        L40:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: li.b.close():void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        byte[] bArr = this.f16084d;
        bArr[0] = (byte) i10;
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        byte[] update = this.f16083c.update(bArr, i10, i11);
        if (update != null) {
            ((FilterOutputStream) this).out.write(update);
        }
    }
}
