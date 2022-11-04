package oj;

import oj.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class i extends o {

    /* renamed from: e */
    private final int f18506e;

    /* renamed from: f */
    private final int f18507f;

    /* renamed from: g */
    private final int f18508g;

    /* loaded from: classes3.dex */
    public static class b extends o.a<b> {

        /* renamed from: e */
        private int f18509e = 0;

        /* renamed from: f */
        private int f18510f = 0;

        /* renamed from: g */
        private int f18511g = 0;

        public b() {
            super(1);
        }

        public o l() {
            return new i(this);
        }

        /* renamed from: m */
        public b e() {
            return this;
        }

        public b n(int i10) {
            this.f18509e = i10;
            return this;
        }

        public b o(int i10) {
            this.f18510f = i10;
            return this;
        }

        public b p(int i10) {
            this.f18511g = i10;
            return this;
        }
    }

    private i(b bVar) {
        super(bVar);
        this.f18506e = bVar.f18509e;
        this.f18507f = bVar.f18510f;
        this.f18508g = bVar.f18511g;
    }

    @Override // oj.o
    public byte[] d() {
        byte[] d10 = super.d();
        ak.l.f(this.f18506e, d10, 16);
        ak.l.f(this.f18507f, d10, 20);
        ak.l.f(this.f18508g, d10, 24);
        return d10;
    }

    public int e() {
        return this.f18506e;
    }

    public int f() {
        return this.f18507f;
    }

    public int g() {
        return this.f18508g;
    }
}
