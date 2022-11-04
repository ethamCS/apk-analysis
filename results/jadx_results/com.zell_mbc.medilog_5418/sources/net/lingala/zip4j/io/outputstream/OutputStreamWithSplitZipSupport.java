package net.lingala.zip4j.io.outputstream;

import java.io.IOException;
/* loaded from: classes2.dex */
public interface OutputStreamWithSplitZipSupport {
    int getCurrentSplitFileCounter();

    long getFilePointer() throws IOException;
}
