package dk;

import ak.q;
import java.io.BufferedWriter;
import java.io.Writer;
/* loaded from: classes3.dex */
public class f extends BufferedWriter {

    /* renamed from: c */
    private final int f9167c;

    /* renamed from: d */
    private char[] f9168d = new char[64];

    public f(Writer writer) {
        super(writer);
        String d10 = q.d();
        this.f9167c = d10 != null ? d10.length() : 2;
    }

    private void b(byte[] bArr) {
        char[] cArr;
        int i10;
        byte[] b10 = bk.a.b(bArr);
        int i11 = 0;
        while (i11 < b10.length) {
            int i12 = 0;
            while (true) {
                cArr = this.f9168d;
                if (i12 != cArr.length && (i10 = i11 + i12) < b10.length) {
                    cArr[i12] = (char) b10[i10];
                    i12++;
                }
            }
            write(cArr, 0, i12);
            newLine();
            i11 += this.f9168d.length;
        }
    }

    private void f(String str) {
        write("-----END " + str + "-----");
        newLine();
    }

    private void h(String str) {
        write("-----BEGIN " + str + "-----");
        newLine();
    }

    public void e(c cVar) {
        b a10 = cVar.a();
        h(a10.d());
        if (!a10.c().isEmpty()) {
            for (a aVar : a10.c()) {
                write(aVar.b());
                write(": ");
                write(aVar.c());
                newLine();
            }
            newLine();
        }
        b(a10.b());
        f(a10.d());
    }
}
