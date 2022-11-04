package td;

import hc.t;
import java.util.LinkedList;
import java.util.List;
import rd.o;
import rd.p;
import tb.w;
import ub.c0;
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a */
    private final p f22221a;

    /* renamed from: b */
    private final o f22222b;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22223a;

        static {
            int[] iArr = new int[o.c.EnumC0344c.values().length];
            iArr[o.c.EnumC0344c.CLASS.ordinal()] = 1;
            iArr[o.c.EnumC0344c.PACKAGE.ordinal()] = 2;
            iArr[o.c.EnumC0344c.LOCAL.ordinal()] = 3;
            f22223a = iArr;
        }
    }

    public d(p pVar, o oVar) {
        t.e(pVar, "strings");
        t.e(oVar, "qualifiedNames");
        this.f22221a = pVar;
        this.f22222b = oVar;
    }

    private final w<List<String>, List<String>, Boolean> c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            o.c M = this.f22222b.M(i10);
            String M2 = this.f22221a.M(M.b0());
            o.c.EnumC0344c V = M.V();
            t.b(V);
            int i11 = a.f22223a[V.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(M2);
            } else if (i11 == 2) {
                linkedList.addFirst(M2);
            } else if (i11 == 3) {
                linkedList2.addFirst(M2);
                z10 = true;
            }
            i10 = M.W();
        }
        return new w<>(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // td.c
    public boolean a(int i10) {
        return c(i10).h().booleanValue();
    }

    @Override // td.c
    public String b(int i10) {
        String e02;
        String e03;
        w<List<String>, List<String>, Boolean> c10 = c(i10);
        List<String> b10 = c10.b();
        e02 = c0.e0(c10.c(), ".", null, null, 0, null, null, 62, null);
        if (b10.isEmpty()) {
            return e02;
        }
        StringBuilder sb2 = new StringBuilder();
        e03 = c0.e0(b10, "/", null, null, 0, null, null, 62, null);
        sb2.append(e03);
        sb2.append('/');
        sb2.append(e02);
        return sb2.toString();
    }

    @Override // td.c
    public String getString(int i10) {
        String M = this.f22221a.M(i10);
        t.d(M, "strings.getString(index)");
        return M;
    }
}
