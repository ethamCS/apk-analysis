package d2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    private final WorkDatabase f8218a;

    public e(WorkDatabase workDatabase) {
        this.f8218a = workDatabase;
    }

    public static void b(Context context, m1.g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = 0;
            long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j10 = 1;
            }
            gVar.t();
            try {
                gVar.F0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                gVar.F0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j10)});
                sharedPreferences.edit().clear().apply();
                gVar.C0();
            } finally {
                gVar.q();
            }
        }
    }

    public boolean a() {
        Long a10 = this.f8218a.K().a("reschedule_needed");
        return a10 != null && a10.longValue() == 1;
    }

    public void c(boolean z10) {
        this.f8218a.K().b(new c2.d("reschedule_needed", z10));
    }
}
