package da;

import java.util.List;
/* loaded from: classes.dex */
public class g {
    public static boolean a(List<ka.c> list) {
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            int i12 = i10 + 1;
            i11 = b(list.get(i10), list.get(i12 % size), list.get((i10 + 2) % size)) ? i11 + 1 : i11 - 1;
            i10 = i12;
        }
        return i11 < 0;
    }

    public static boolean b(ka.c cVar, ka.c cVar2, ka.c cVar3) {
        int i10 = cVar.f14865c;
        int i11 = cVar2.f14865c;
        int i12 = cVar.f14866d;
        int i13 = cVar2.f14866d;
        return ((i10 - i11) * (cVar3.f14866d - i13)) - ((i12 - i13) * (cVar3.f14865c - i11)) > 0;
    }
}
