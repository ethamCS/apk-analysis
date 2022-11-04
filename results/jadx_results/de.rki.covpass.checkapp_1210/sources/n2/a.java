package n2;
/* loaded from: classes.dex */
public class a {
    public static int a(int i10) {
        int i11 = i10 - ((i10 >> 1) & 1431655765);
        int i12 = (i11 & 858993459) + ((i11 >> 2) & 858993459);
        return ((252645135 & (i12 + (i12 >> 4))) * 16843009) >> 24;
    }
}
