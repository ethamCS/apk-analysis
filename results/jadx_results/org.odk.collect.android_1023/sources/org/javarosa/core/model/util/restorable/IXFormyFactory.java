package org.javarosa.core.model.util.restorable;

import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.condition.IConditionExpr;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.services.transport.payload.IDataPayload;
/* loaded from: classes.dex */
public interface IXFormyFactory {
    IAnswerData parseData(String str, int i, TreeReference treeReference, FormDef formDef);

    FormInstance parseRestore(byte[] bArr, Class cls);

    TreeReference ref(String str);

    IConditionExpr refToPathExpr(TreeReference treeReference);

    String serializeData(IAnswerData iAnswerData);

    IDataPayload serializeInstance(FormInstance formInstance);
}
