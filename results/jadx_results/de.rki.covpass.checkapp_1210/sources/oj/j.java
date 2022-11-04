package oj;

import oj.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class j extends o {

    /* renamed from: e */
    private final int f18512e;

    /* renamed from: f */
    private final int f18513f;

    /* renamed from: g */
    private final int f18514g;

    /* loaded from: classes3.dex */
    public static class b extends o.a<b> {

        /* renamed from: e */
        private int f18515e = 0;

        /* renamed from: f */
        private int f18516f = 0;

        /* renamed from: g */
        private int f18517g = 0;

        public b() {
            super(0);
        }

        public o l() {
            return new j(this);
        }

        /* renamed from: m */
        public b e() {
            return this;
        }

        public b n(int i10) {
            this.f18516f = i10;
            return this;
        }

        public b o(int i10) {
            this.f18517g = i10;
            return this;
        }

        public b p(int i10) {
            this.f18515e = i10;
            return this;
        }
    }

    private j(b bVar) {
        super(bVar);
        this.f18512e = bVar.f18515e;
        this.f18513f = bVar.f18516f;
        this.f18514g = bVar.f18517g;
    }

    @Override // oj.o
    public byte[] d() {
        byte[] d10 = super.d();
        ak.l.f(this.f18512e, d10, 16);
        ak.l.f(this.f18513f, d10, 20);
        ak.l.f(this.f18514g, d10, 24);
        return d10;
    }

    public int e() {
        return this.f18513f;
    }

    public int f() {
        return this.f18514g;
    }

    public int g() {
        return this.f18512e;
    }
}
