package l3;

import java.nio.ByteBuffer;
import k3.b;
import ll.d;
import ok.i;
/* loaded from: classes.dex */
public class a {
    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14, d<i> dVar, b.h hVar) {
        RuntimeException runtimeException;
        int i15;
        ByteBuffer byteBuffer4 = byteBuffer;
        ByteBuffer byteBuffer5 = byteBuffer2;
        ByteBuffer byteBuffer6 = byteBuffer3;
        int i16 = i11;
        int round = (int) Math.round(i10 / (i13 / i14));
        int i17 = i12 + i13;
        dVar.f();
        int i18 = 0;
        byte[] b10 = v3.a.b(dVar.d(), i17 + i13, false);
        int i19 = (((i10 / round) - 1) * i14) + 1;
        int limit = byteBuffer.limit();
        int limit2 = byteBuffer2.limit();
        int limit3 = byteBuffer3.limit();
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        while (i18 < i16) {
            try {
                ByteBuffer byteBuffer7 = (ByteBuffer) byteBuffer4.position(i24);
                i15 = 0;
                byteBuffer4.get(b10, 0, i10);
                i24 += i12;
                if (i18 % round == 0) {
                    ByteBuffer byteBuffer8 = (ByteBuffer) byteBuffer5.position(i25);
                    byteBuffer5.get(b10, i12, i19);
                    ByteBuffer byteBuffer9 = (ByteBuffer) byteBuffer6.position(i25);
                    byteBuffer6.get(b10, i17, i19);
                    i25 += i13;
                }
                i21 = 0;
                i22 = i12;
                i23 = i17;
                while (i15 < i10) {
                    try {
                        int i26 = i17;
                        hVar.a(b10[i21] & 255, b10[i22] & 255, b10[i23] & 255);
                        int i27 = i15 + 1;
                        int i28 = (i27 % round == 0 ? 1 : 0) * i14;
                        i22 += i28;
                        i23 += i28;
                        i21++;
                        i15 = i27;
                        i17 = i26;
                    } catch (RuntimeException e10) {
                        runtimeException = e10;
                        runtimeException.printStackTrace();
                        throw new RuntimeException("Crashed in YUV. " + runtimeException.getMessage() + " bytes Y=" + limit + " U=" + limit2 + " V=" + limit3 + " width=" + i10 + " height=" + i11 + " work.length=" + b10.length + " strideY=" + i12 + " strideUV=" + i13 + " stridePixelUV=" + i14 + " periodUV=" + round + " x=" + i15 + " y=" + i18 + " indexY=" + i21 + " indexU=" + i22 + " indexV=" + i23, runtimeException);
                    }
                }
                i18++;
                byteBuffer4 = byteBuffer;
                byteBuffer5 = byteBuffer2;
                byteBuffer6 = byteBuffer3;
                i20 = i15;
                i17 = i17;
                i16 = i11;
            } catch (RuntimeException e11) {
                runtimeException = e11;
                i15 = i20;
            }
        }
    }
}
