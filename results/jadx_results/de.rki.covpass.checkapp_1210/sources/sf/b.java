package sf;

import hc.p0;
import hc.t;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lsf/a;", "task", "Lsf/d;", "queue", BuildConfig.FLAVOR, "message", "Ltb/e0;", "c", BuildConfig.FLAVOR, "ns", "b", "okhttp"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b {
    public static final /* synthetic */ void a(a aVar, d dVar, String str) {
        c(aVar, dVar, str);
    }

    public static final String b(long j10) {
        StringBuilder sb2;
        long j11;
        long j12;
        long j13;
        if (j10 > -999500000) {
            if (j10 > -999500) {
                if (j10 <= 0) {
                    sb2 = new StringBuilder();
                    j13 = j10 - 500;
                } else if (j10 < 999500) {
                    sb2 = new StringBuilder();
                    j13 = j10 + 500;
                } else if (j10 < 999500000) {
                    sb2 = new StringBuilder();
                    j12 = j10 + 500000;
                } else {
                    sb2 = new StringBuilder();
                    j11 = j10 + 500000000;
                }
                sb2.append(j13 / 1000);
                sb2.append(" µs");
                String sb3 = sb2.toString();
                p0 p0Var = p0.f11777a;
                String format = String.format("%6s", Arrays.copyOf(new Object[]{sb3}, 1));
                t.d(format, "format(format, *args)");
                return format;
            }
            sb2 = new StringBuilder();
            j12 = j10 - 500000;
            sb2.append(j12 / 1000000);
            sb2.append(" ms");
            String sb32 = sb2.toString();
            p0 p0Var2 = p0.f11777a;
            String format2 = String.format("%6s", Arrays.copyOf(new Object[]{sb32}, 1));
            t.d(format2, "format(format, *args)");
            return format2;
        }
        sb2 = new StringBuilder();
        j11 = j10 - 500000000;
        sb2.append(j11 / 1000000000);
        sb2.append(" s ");
        String sb322 = sb2.toString();
        p0 p0Var22 = p0.f11777a;
        String format22 = String.format("%6s", Arrays.copyOf(new Object[]{sb322}, 1));
        t.d(format22, "format(format, *args)");
        return format22;
    }

    public static final void c(a aVar, d dVar, String str) {
        Logger a10 = e.Companion.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.f());
        sb2.append(' ');
        p0 p0Var = p0.f11777a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        t.d(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.b());
        a10.fine(sb2.toString());
    }
}
