package fd;

import hc.t;
/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a */
        public static final a f10155a = new a();

        private a() {
        }

        @Override // fd.c
        public boolean a() {
            return false;
        }

        @Override // fd.c
        public void b(String str, e eVar, String str2, f fVar, String str3) {
            t.e(str, "filePath");
            t.e(eVar, "position");
            t.e(str2, "scopeFqName");
            t.e(fVar, "scopeKind");
            t.e(str3, "name");
        }
    }

    boolean a();

    void b(String str, e eVar, String str2, f fVar, String str3);
}
