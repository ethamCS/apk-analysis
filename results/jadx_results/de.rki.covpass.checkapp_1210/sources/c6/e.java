package c6;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import f6.c0;
import f6.t;
import g6.o;
import java.io.IOException;
import y5.l;
/* loaded from: classes.dex */
public final class e implements l {

    /* renamed from: a */
    private final SharedPreferences.Editor f6311a;

    /* renamed from: b */
    private final String f6312b;

    public e(Context context, String str, String str2) {
        if (str != null) {
            this.f6312b = str;
            Context applicationContext = context.getApplicationContext();
            this.f6311a = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    @Override // y5.l
    public void a(t tVar) {
        if (this.f6311a.putString(this.f6312b, o.b(tVar.j())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }

    @Override // y5.l
    public void b(c0 c0Var) {
        if (this.f6311a.putString(this.f6312b, o.b(c0Var.j())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }
}
