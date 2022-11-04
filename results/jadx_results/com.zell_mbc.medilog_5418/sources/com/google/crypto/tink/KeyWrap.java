package com.google.crypto.tink;

import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
public interface KeyWrap {
    byte[] unwrap(final byte[] data) throws GeneralSecurityException;

    byte[] wrap(final byte[] data) throws GeneralSecurityException;
}
