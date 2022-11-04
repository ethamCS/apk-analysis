package u1;

import java.util.List;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a */
    private static final String f22556a = k.f("InputMerger");

    public static i a(String str) {
        try {
            return (i) Class.forName(str).newInstance();
        } catch (Exception e10) {
            k c10 = k.c();
            String str2 = f22556a;
            c10.b(str2, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    public abstract androidx.work.a b(List<androidx.work.a> list);
}
