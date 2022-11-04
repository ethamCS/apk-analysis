package ki;

import java.security.Key;
import java.security.PublicKey;
/* loaded from: classes3.dex */
public interface b extends Key, PublicKey {
    byte[] getPointEncoding();
}
