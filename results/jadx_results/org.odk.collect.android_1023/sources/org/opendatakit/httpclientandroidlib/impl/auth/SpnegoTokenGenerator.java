package org.opendatakit.httpclientandroidlib.impl.auth;

import java.io.IOException;
@Deprecated
/* loaded from: classes.dex */
public interface SpnegoTokenGenerator {
    byte[] generateSpnegoDERObject(byte[] bArr) throws IOException;
}
