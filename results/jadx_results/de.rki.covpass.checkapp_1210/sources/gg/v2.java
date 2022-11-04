package gg;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
class v2 implements Enumeration {

    /* renamed from: a */
    private p f10906a;

    /* renamed from: b */
    private Object f10907b = a();

    public v2(byte[] bArr) {
        this.f10906a = new p(bArr, true);
    }

    private Object a() {
        try {
            return this.f10906a.s();
        } catch (IOException e10) {
            throw new z("malformed ASN.1: " + e10, e10);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f10907b != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.f10907b;
        if (obj != null) {
            this.f10907b = a();
            return obj;
        }
        throw new NoSuchElementException();
    }
}
