package ek;

import java.math.BigInteger;
import java.security.cert.X509Extension;
import java.util.Date;
/* loaded from: classes3.dex */
public interface h extends X509Extension {
    a b();

    f[] c(String str);

    void checkValidity(Date date);

    b e();

    byte[] getEncoded();

    Date getNotAfter();

    BigInteger getSerialNumber();
}
