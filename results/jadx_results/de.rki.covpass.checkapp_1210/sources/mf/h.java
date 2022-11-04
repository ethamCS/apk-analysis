package mf;

import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lmf/h;", "Lmf/f;", "Ltb/e0;", "b", "p", "c", "o", "Lmf/t;", "sb", "Llf/a;", "json", "<init>", "(Lmf/t;Llf/a;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class h extends f {

    /* renamed from: c */
    private final lf.a f16629c;

    /* renamed from: d */
    private int f16630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t tVar, lf.a aVar) {
        super(tVar);
        hc.t.e(tVar, "sb");
        hc.t.e(aVar, "json");
        this.f16629c = aVar;
    }

    @Override // mf.f
    public void b() {
        n(true);
        this.f16630d++;
    }

    @Override // mf.f
    public void c() {
        n(false);
        j("\n");
        int i10 = this.f16630d;
        for (int i11 = 0; i11 < i10; i11++) {
            j(this.f16629c.f().i());
        }
    }

    @Override // mf.f
    public void o() {
        e(' ');
    }

    @Override // mf.f
    public void p() {
        this.f16630d--;
    }
}
