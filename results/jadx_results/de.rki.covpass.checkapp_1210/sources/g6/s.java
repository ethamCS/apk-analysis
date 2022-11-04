package g6;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
@Immutable
/* loaded from: classes.dex */
public final class s implements e6.a {

    /* renamed from: a */
    private final ThreadLocal<Mac> f10597a;

    /* renamed from: b */
    private final String f10598b;

    /* renamed from: c */
    private final Key f10599c;

    /* renamed from: d */
    private final int f10600d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends ThreadLocal<Mac> {
        a() {
            s.this = r1;
        }

        /* renamed from: a */
        public Mac initialValue() {
            try {
                Mac a10 = m.f10585g.a(s.this.f10598b);
                a10.init(s.this.f10599c);
                return a10;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public s(String str, Key key) {
        int i10;
        a aVar = new a();
        this.f10597a = aVar;
        this.f10598b = str;
        this.f10599c = key;
        if (key.getEncoded().length >= 16) {
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    i10 = 20;
                    break;
                case 1:
                    i10 = 32;
                    break;
                case 2:
                    i10 = 48;
                    break;
                case 3:
                    i10 = 64;
                    break;
                default:
                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
            }
            this.f10600d = i10;
            aVar.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }

    @Override // e6.a
    public byte[] a(byte[] bArr, int i10) {
        if (i10 <= this.f10600d) {
            this.f10597a.get().update(bArr);
            return Arrays.copyOf(this.f10597a.get().doFinal(), i10);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
