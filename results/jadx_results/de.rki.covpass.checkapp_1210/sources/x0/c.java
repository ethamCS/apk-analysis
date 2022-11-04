package x0;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    protected int f25354a;

    /* renamed from: b */
    protected ByteBuffer f25355b;

    /* renamed from: c */
    private int f25356c;

    /* renamed from: d */
    private int f25357d;

    /* renamed from: e */
    d f25358e = d.a();

    public int a(int i10) {
        return i10 + this.f25355b.getInt(i10);
    }

    public int b(int i10) {
        if (i10 < this.f25357d) {
            return this.f25355b.getShort(this.f25356c + i10);
        }
        return 0;
    }

    public void c(int i10, ByteBuffer byteBuffer) {
        short s10;
        this.f25355b = byteBuffer;
        if (byteBuffer != null) {
            this.f25354a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f25356c = i11;
            s10 = this.f25355b.getShort(i11);
        } else {
            s10 = 0;
            this.f25354a = 0;
            this.f25356c = 0;
        }
        this.f25357d = s10;
    }

    public int d(int i10) {
        int i11 = i10 + this.f25354a;
        return i11 + this.f25355b.getInt(i11) + 4;
    }

    public int e(int i10) {
        int i11 = i10 + this.f25354a;
        return this.f25355b.getInt(i11 + this.f25355b.getInt(i11));
    }
}
