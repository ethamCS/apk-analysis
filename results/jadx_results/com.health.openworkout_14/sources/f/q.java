package f;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class q {
    @Nullable

    /* renamed from: a */
    static p f4477a;

    /* renamed from: b */
    static long f4478b;

    private q() {
    }

    public static void a(p pVar) {
        if (pVar.f4475f == null && pVar.f4476g == null) {
            if (pVar.f4473d) {
                return;
            }
            synchronized (q.class) {
                long j = f4478b;
                if (j + 8192 > 65536) {
                    return;
                }
                f4478b = j + 8192;
                pVar.f4475f = f4477a;
                pVar.f4472c = 0;
                pVar.f4471b = 0;
                f4477a = pVar;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static p b() {
        synchronized (q.class) {
            p pVar = f4477a;
            if (pVar != null) {
                f4477a = pVar.f4475f;
                pVar.f4475f = null;
                f4478b -= 8192;
                return pVar;
            }
            return new p();
        }
    }
}
