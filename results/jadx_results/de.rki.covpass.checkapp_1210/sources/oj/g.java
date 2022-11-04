package oj;

import oj.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g extends o {

    /* renamed from: e */
    private final int f18499e;

    /* renamed from: f */
    private final int f18500f;

    /* renamed from: g */
    private final int f18501g;

    /* loaded from: classes3.dex */
    public static class b extends o.a<b> {

        /* renamed from: e */
        private int f18502e = 0;

        /* renamed from: f */
        private int f18503f = 0;

        public b() {
            super(2);
        }

        public o k() {
            return new g(this);
        }

        /* renamed from: l */
        public b e() {
            return this;
        }

        public b m(int i10) {
            this.f18502e = i10;
            return this;
        }

        public b n(int i10) {
            this.f18503f = i10;
            return this;
        }
    }

    private g(b bVar) {
        super(bVar);
        this.f18499e = 0;
        this.f18500f = bVar.f18502e;
        this.f18501g = bVar.f18503f;
    }

    @Override // oj.o
    public byte[] d() {
        byte[] d10 = super.d();
        ak.l.f(this.f18499e, d10, 16);
        ak.l.f(this.f18500f, d10, 20);
        ak.l.f(this.f18501g, d10, 24);
        return d10;
    }

    public int e() {
        return this.f18500f;
    }

    public int f() {
        return this.f18501g;
    }
}
