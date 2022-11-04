package org.javarosa.core.data;

import java.io.InputStream;
import org.javarosa.core.util.externalizable.Externalizable;
/* loaded from: classes.dex */
public interface IDataPointer extends Externalizable {
    boolean deleteData();

    byte[] getData();

    InputStream getDataStream();

    String getDisplayText();

    long getLength();
}
