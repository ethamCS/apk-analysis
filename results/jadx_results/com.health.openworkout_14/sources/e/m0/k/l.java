package e.m0.k;

import java.util.List;
/* loaded from: classes.dex */
public interface l {

    /* renamed from: a */
    public static final l f4334a = new a();

    /* loaded from: classes.dex */
    class a implements l {
        a() {
        }

        @Override // e.m0.k.l
        public boolean a(int i, List<c> list) {
            return true;
        }

        @Override // e.m0.k.l
        public boolean b(int i, List<c> list, boolean z) {
            return true;
        }

        @Override // e.m0.k.l
        public void c(int i, b bVar) {
        }

        @Override // e.m0.k.l
        public boolean d(int i, f.e eVar, int i2, boolean z) {
            eVar.w(i2);
            return true;
        }
    }

    boolean a(int i, List<c> list);

    boolean b(int i, List<c> list, boolean z);

    void c(int i, b bVar);

    boolean d(int i, f.e eVar, int i2, boolean z);
}
