package org.javarosa.core.services.storage;

import java.util.Hashtable;
/* loaded from: classes.dex */
public interface IMetaData {
    Object getMetaData(String str);

    Hashtable getMetaData();

    String[] getMetaDataFields();
}
