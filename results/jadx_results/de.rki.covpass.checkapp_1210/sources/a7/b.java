package a7;
/* loaded from: classes.dex */
public final class b extends f {
    public b(o6.a aVar) {
        super(aVar);
    }

    @Override // a7.i
    protected void h(StringBuilder sb2, int i10) {
        sb2.append(i10 < 10000 ? "(3202)" : "(3203)");
    }

    @Override // a7.i
    protected int i(int i10) {
        return i10 < 10000 ? i10 : i10 - 10000;
    }
}