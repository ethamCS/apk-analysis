package a7;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i extends h {
    public i(o6.a aVar) {
        super(aVar);
    }

    protected abstract void h(StringBuilder sb2, int i10);

    protected abstract int i(int i10);

    public final void j(StringBuilder sb2, int i10, int i11) {
        int f10 = b().f(i10, i11);
        h(sb2, f10);
        int i12 = i(f10);
        int i13 = 100000;
        for (int i14 = 0; i14 < 5; i14++) {
            if (i12 / i13 == 0) {
                sb2.append('0');
            }
            i13 /= 10;
        }
        sb2.append(i12);
    }
}
