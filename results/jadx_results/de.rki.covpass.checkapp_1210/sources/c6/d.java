package c6;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.shaded.protobuf.q;
import f6.c0;
import f6.t;
import g6.o;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import y5.k;
/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: a */
    private final SharedPreferences f6309a;

    /* renamed from: b */
    private final String f6310b;

    public d(Context context, String str, String str2) {
        if (str != null) {
            this.f6310b = str;
            Context applicationContext = context.getApplicationContext();
            this.f6309a = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0);
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    private byte[] b() {
        try {
            String string = this.f6309a.getString(this.f6310b, null);
            if (string == null) {
                throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.f6310b));
            }
            return o.a(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.f6310b));
        }
    }

    @Override // y5.k
    public t a() {
        return t.S(b(), q.b());
    }

    @Override // y5.k
    public c0 read() {
        return c0.X(b(), q.b());
    }
}
