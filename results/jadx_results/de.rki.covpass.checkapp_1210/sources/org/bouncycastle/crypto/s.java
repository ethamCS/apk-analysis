package org.bouncycastle.crypto;
/* loaded from: classes3.dex */
public class s {

    /* renamed from: a */
    private b f18665a;

    /* renamed from: b */
    private v f18666b;

    public s(b bVar, v vVar) {
        this.f18665a = bVar;
        this.f18666b = vVar;
    }

    public byte[] a() {
        return this.f18666b.getEncoded(this.f18665a.b());
    }

    public b b() {
        return this.f18665a;
    }
}
