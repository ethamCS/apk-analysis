package a7;
/* loaded from: classes.dex */
abstract class f extends i {
    public f(o6.a aVar) {
        super(aVar);
    }

    @Override // a7.j
    public String d() {
        if (c().l() == 60) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 5);
            j(sb2, 45, 15);
            return sb2.toString();
        }
        throw h6.m.b();
    }
}
