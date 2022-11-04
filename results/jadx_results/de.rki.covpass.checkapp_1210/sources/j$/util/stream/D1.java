package j$.util.stream;
/* loaded from: classes2.dex */
public class D1 extends E1 {

    /* renamed from: c */
    public final /* synthetic */ int f13438c;

    /* renamed from: d */
    private final Object f13439d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D1(O0 o02, Object obj) {
        this(o02, obj, 0);
        this.f13438c = 0;
    }

    @Override // j$.util.stream.E1
    final void a() {
        switch (this.f13438c) {
            case 0:
                ((O0) this.f13442a).g(this.f13439d, this.f13443b);
                return;
            default:
                this.f13442a.m((Object[]) this.f13439d, this.f13443b);
                return;
        }
    }

    @Override // j$.util.stream.E1
    final E1 b(int i10, int i11) {
        switch (this.f13438c) {
            case 0:
                return new D1(this, ((O0) this.f13442a).b(i10), i11);
            default:
                return new D1(this, this.f13442a.b(i10), i11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D1(P0 p02, Object obj, int i10) {
        super(p02);
        this.f13438c = i10;
        this.f13439d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D1(P0 p02, Object[] objArr) {
        this(p02, objArr, 1);
        this.f13438c = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(D1 d12, O0 o02, int i10) {
        super(d12, o02, i10);
        this.f13438c = 0;
        this.f13439d = d12.f13439d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(D1 d12, P0 p02, int i10) {
        super(d12, p02, i10);
        this.f13438c = 1;
        this.f13439d = (Object[]) d12.f13439d;
    }
}
