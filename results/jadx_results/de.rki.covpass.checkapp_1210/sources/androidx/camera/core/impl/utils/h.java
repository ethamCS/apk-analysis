package androidx.camera.core.impl.utils;

import androidx.camera.core.impl.utils.g;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
/* loaded from: classes.dex */
public final class h extends FilterOutputStream {
    private static final byte[] V3 = "Exif\u0000\u0000".getBytes(f.f2335e);
    private int U3;

    /* renamed from: c */
    private final g f2369c;

    /* renamed from: d */
    private final byte[] f2370d = new byte[1];

    /* renamed from: q */
    private final ByteBuffer f2371q = ByteBuffer.allocate(4);

    /* renamed from: x */
    private int f2372x = 0;

    /* renamed from: y */
    private int f2373y;

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(short s10) {
            return (s10 < -64 || s10 > -49 || s10 == -60 || s10 == -56 || s10 == -52) ? false : true;
        }
    }

    public h(OutputStream outputStream, g gVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f2369c = gVar;
    }

    private int b(int i10, byte[] bArr, int i11, int i12) {
        int min = Math.min(i12, i10 - this.f2371q.position());
        this.f2371q.put(bArr, i11, min);
        return min;
    }

    private void e(androidx.camera.core.impl.utils.a aVar) {
        i[] iVarArr;
        i[][] iVarArr2 = g.f2349i;
        int[] iArr = new int[iVarArr2.length];
        int[] iArr2 = new int[iVarArr2.length];
        for (i iVar : g.f2347g) {
            for (int i10 = 0; i10 < g.f2349i.length; i10++) {
                this.f2369c.b(i10).remove(iVar.f2375b);
            }
        }
        if (!this.f2369c.b(1).isEmpty()) {
            this.f2369c.b(0).put(g.f2347g[1].f2375b, f.f(0L, this.f2369c.c()));
        }
        if (!this.f2369c.b(2).isEmpty()) {
            this.f2369c.b(0).put(g.f2347g[2].f2375b, f.f(0L, this.f2369c.c()));
        }
        if (!this.f2369c.b(3).isEmpty()) {
            this.f2369c.b(1).put(g.f2347g[3].f2375b, f.f(0L, this.f2369c.c()));
        }
        for (int i11 = 0; i11 < g.f2349i.length; i11++) {
            int i12 = 0;
            for (Map.Entry<String, f> entry : this.f2369c.b(i11).entrySet()) {
                int j10 = entry.getValue().j();
                if (j10 > 4) {
                    i12 += j10;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < g.f2349i.length; i14++) {
            if (!this.f2369c.b(i14).isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f2369c.b(i14).size() * 12) + 2 + 4 + iArr2[i14];
            }
        }
        int i15 = i13 + 8;
        if (!this.f2369c.b(1).isEmpty()) {
            this.f2369c.b(0).put(g.f2347g[1].f2375b, f.f(iArr[1], this.f2369c.c()));
        }
        if (!this.f2369c.b(2).isEmpty()) {
            this.f2369c.b(0).put(g.f2347g[2].f2375b, f.f(iArr[2], this.f2369c.c()));
        }
        if (!this.f2369c.b(3).isEmpty()) {
            this.f2369c.b(1).put(g.f2347g[3].f2375b, f.f(iArr[3], this.f2369c.c()));
        }
        aVar.j(i15);
        aVar.write(V3);
        aVar.h(this.f2369c.c() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        aVar.b(this.f2369c.c());
        aVar.j(42);
        aVar.i(8L);
        for (int i16 = 0; i16 < g.f2349i.length; i16++) {
            if (!this.f2369c.b(i16).isEmpty()) {
                aVar.j(this.f2369c.b(i16).size());
                int size = iArr[i16] + 2 + (this.f2369c.b(i16).size() * 12) + 4;
                for (Map.Entry<String, f> entry2 : this.f2369c.b(i16).entrySet()) {
                    int i17 = ((i) androidx.core.util.h.h(g.b.f2358f.get(i16).get(entry2.getKey()), "Tag not supported: " + entry2.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f2374a;
                    f value = entry2.getValue();
                    int j11 = value.j();
                    aVar.j(i17);
                    aVar.j(value.f2339a);
                    aVar.f(value.f2340b);
                    if (j11 > 4) {
                        aVar.i(size);
                        size += j11;
                    } else {
                        aVar.write(value.f2342d);
                        if (j11 < 4) {
                            while (j11 < 4) {
                                aVar.e(0);
                                j11++;
                            }
                        }
                    }
                }
                aVar.i(0L);
                for (Map.Entry<String, f> entry3 : this.f2369c.b(i16).entrySet()) {
                    byte[] bArr = entry3.getValue().f2342d;
                    if (bArr.length > 4) {
                        aVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        aVar.b(ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        byte[] bArr = this.f2370d;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
        if (r9 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0107, code lost:
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(byte[] r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.h.write(byte[], int, int):void");
    }
}
