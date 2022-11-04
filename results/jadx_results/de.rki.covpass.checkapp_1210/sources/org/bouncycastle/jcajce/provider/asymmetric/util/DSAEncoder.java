package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public interface DSAEncoder {
    BigInteger[] decode(byte[] bArr);

    byte[] encode(BigInteger bigInteger, BigInteger bigInteger2);
}
