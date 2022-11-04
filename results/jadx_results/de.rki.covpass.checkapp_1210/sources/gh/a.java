package gh;

import gg.b2;
import gg.g;
import gg.v;
import gg.z;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
/* loaded from: classes3.dex */
public abstract class a implements fh.e {
    private int g(g gVar) {
        return d.d(gVar).hashCode();
    }

    public static Hashtable h(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    private boolean j(boolean z10, fh.b bVar, fh.b[] bVarArr) {
        if (z10) {
            for (int length = bVarArr.length - 1; length >= 0; length--) {
                if (bVarArr[length] != null && k(bVar, bVarArr[length])) {
                    bVarArr[length] = null;
                    return true;
                }
            }
        } else {
            for (int i10 = 0; i10 != bVarArr.length; i10++) {
                if (bVarArr[i10] != null && k(bVar, bVarArr[i10])) {
                    bVarArr[i10] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // fh.e
    public g a(v vVar, String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return i(vVar, str);
        }
        try {
            return d.p(str, 1);
        } catch (IOException unused) {
            throw new z("can't recode value for oid " + vVar.H());
        }
    }

    @Override // fh.e
    public boolean b(fh.c cVar, fh.c cVar2) {
        fh.b[] o10 = cVar.o();
        fh.b[] o11 = cVar2.o();
        if (o10.length != o11.length) {
            return false;
        }
        boolean z10 = (o10[0].m() == null || o11[0].m() == null) ? false : !o10[0].m().m().s(o11[0].m().m());
        for (int i10 = 0; i10 != o10.length; i10++) {
            if (!j(z10, o10[i10], o11)) {
                return false;
            }
        }
        return true;
    }

    @Override // fh.e
    public int f(fh.c cVar) {
        fh.b[] o10 = cVar.o();
        int i10 = 0;
        for (int i11 = 0; i11 != o10.length; i11++) {
            if (o10[i11].q()) {
                fh.a[] o11 = o10[i11].o();
                for (int i12 = 0; i12 != o11.length; i12++) {
                    i10 = (i10 ^ o11[i12].m().hashCode()) ^ g(o11[i12].n());
                }
            } else {
                i10 = (i10 ^ o10[i11].m().m().hashCode()) ^ g(o10[i11].m().n());
            }
        }
        return i10;
    }

    public g i(v vVar, String str) {
        return new b2(str);
    }

    public boolean k(fh.b bVar, fh.b bVar2) {
        return d.j(bVar, bVar2);
    }
}
