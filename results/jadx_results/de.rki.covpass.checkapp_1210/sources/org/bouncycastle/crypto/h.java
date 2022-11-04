package org.bouncycastle.crypto;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a */
    protected SecureRandom f18649a;

    /* renamed from: b */
    protected int f18650b;

    public byte[] a() {
        byte[] bArr = new byte[this.f18650b];
        this.f18649a.nextBytes(bArr);
        return bArr;
    }

    public void b(w wVar) {
        this.f18649a = wVar.a();
        this.f18650b = (wVar.b() + 7) / 8;
    }
}
