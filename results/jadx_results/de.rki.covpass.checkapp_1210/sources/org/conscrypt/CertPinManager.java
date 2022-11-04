package org.conscrypt;

import java.security.cert.X509Certificate;
import java.util.List;
/* loaded from: classes3.dex */
public interface CertPinManager {
    void checkChainPinning(String str, List<X509Certificate> list);
}
