package org.javarosa.core.model.util.restorable;

import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeReference;
/* loaded from: classes.dex */
public interface Restorable {
    FormInstance exportData();

    String getRestorableType();

    void importData(FormInstance formInstance);

    void templateData(FormInstance formInstance, TreeReference treeReference);
}
