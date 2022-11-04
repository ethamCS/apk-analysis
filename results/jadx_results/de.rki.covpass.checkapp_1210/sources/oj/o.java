package oj;
/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a */
    private final int f18533a;

    /* renamed from: b */
    private final long f18534b;

    /* renamed from: c */
    private final int f18535c;

    /* renamed from: d */
    private final int f18536d;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static abstract class a<T extends a> {

        /* renamed from: a */
        private final int f18537a;

        /* renamed from: b */
        private int f18538b = 0;

        /* renamed from: c */
        private long f18539c = 0;

        /* renamed from: d */
        private int f18540d = 0;

        public a(int i10) {
            this.f18537a = i10;
        }

        protected abstract T e();

        public T f(int i10) {
            this.f18540d = i10;
            return e();
        }

        public T g(int i10) {
            this.f18538b = i10;
            return e();
        }

        public T h(long j10) {
            this.f18539c = j10;
            return e();
        }
    }

    public o(a aVar) {
        this.f18533a = aVar.f18538b;
        this.f18534b = aVar.f18539c;
        this.f18535c = aVar.f18537a;
        this.f18536d = aVar.f18540d;
    }

    public final int a() {
        return this.f18536d;
    }

    public final int b() {
        return this.f18533a;
    }

    public final long c() {
        return this.f18534b;
    }

    public byte[] d() {
        byte[] bArr = new byte[32];
        ak.l.f(this.f18533a, bArr, 0);
        ak.l.s(this.f18534b, bArr, 4);
        ak.l.f(this.f18535c, bArr, 12);
        ak.l.f(this.f18536d, bArr, 28);
        return bArr;
    }
}
