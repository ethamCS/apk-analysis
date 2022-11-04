package org.bouncycastle.crypto;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class w {

    /* renamed from: a */
    private SecureRandom f18667a;

    /* renamed from: b */
    private int f18668b;

    public w(SecureRandom secureRandom, int i10) {
        this.f18667a = l.c(secureRandom);
        this.f18668b = i10;
    }

    public SecureRandom a() {
        return this.f18667a;
    }

    public int b() {
        return this.f18668b;
    }
}
