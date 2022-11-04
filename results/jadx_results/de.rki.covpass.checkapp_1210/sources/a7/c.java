package a7;
/* loaded from: classes.dex */
public final class c extends h {
    public c(o6.a aVar) {
        super(aVar);
    }

    @Override // a7.j
    public String d() {
        if (c().l() >= 48) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 8);
            int f10 = b().f(48, 2);
            sb2.append("(392");
            sb2.append(f10);
            sb2.append(')');
            sb2.append(b().c(50, null).b());
            return sb2.toString();
        }
        throw h6.m.b();
    }
}
