package pd;

import java.util.List;
/* loaded from: classes.dex */
public interface w {

    /* loaded from: classes.dex */
    public static final class a implements w {

        /* renamed from: a */
        public static final a f19140a = new a();

        private a() {
        }

        @Override // pd.w
        public List<String> a(String str) {
            List<String> h10;
            hc.t.e(str, "packageFqName");
            h10 = ub.u.h();
            return h10;
        }
    }

    List<String> a(String str);
}
