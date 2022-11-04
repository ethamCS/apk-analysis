package gh;
/* loaded from: classes3.dex */
public class b extends c {
    public static final fh.e R = new b();

    @Override // gh.a, fh.e
    public boolean b(fh.c cVar, fh.c cVar2) {
        fh.b[] o10 = cVar.o();
        fh.b[] o11 = cVar2.o();
        if (o10.length != o11.length) {
            return false;
        }
        for (int i10 = 0; i10 != o10.length; i10++) {
            if (!k(o10[i10], o11[i10])) {
                return false;
            }
        }
        return true;
    }
}
