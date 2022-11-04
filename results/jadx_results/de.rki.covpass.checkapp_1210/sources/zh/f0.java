package zh;

import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class f0 extends org.bouncycastle.crypto.w {
    public f0(SecureRandom secureRandom) {
        super(secureRandom, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }
}
