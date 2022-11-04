package com.google.crypto.tink;

import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.Keyset;
import java.io.IOException;
/* loaded from: classes2.dex */
public interface KeysetWriter {
    void write(EncryptedKeyset keyset) throws IOException;

    void write(Keyset keyset) throws IOException;
}
