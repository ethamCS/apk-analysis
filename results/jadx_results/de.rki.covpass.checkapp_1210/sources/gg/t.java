package gg;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
/* loaded from: classes3.dex */
public abstract class t implements g, ak.d {
    @Override // gg.g
    public abstract a0 b();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return b().s(((g) obj).b());
        }
        return false;
    }

    @Override // ak.d
    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b().o(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return b().hashCode();
    }

    public void i(OutputStream outputStream, String str) {
        b().i(outputStream, str);
    }

    public byte[] k(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b().i(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
