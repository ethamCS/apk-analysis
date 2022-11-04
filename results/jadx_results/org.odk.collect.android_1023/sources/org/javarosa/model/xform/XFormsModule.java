package org.javarosa.model.xform;

import java.io.IOException;
import org.javarosa.core.api.IModule;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.condition.IConditionExpr;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.model.util.restorable.IXFormyFactory;
import org.javarosa.core.model.util.restorable.RestoreUtils;
import org.javarosa.core.services.PrototypeManager;
import org.javarosa.core.services.transport.payload.IDataPayload;
import org.javarosa.xform.parse.XFormParser;
import org.javarosa.xform.util.XFormAnswerDataParser;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.javarosa.xpath.XPathConditional;
import org.javarosa.xpath.XPathParseTool;
import org.javarosa.xpath.expr.XPathPathExpr;
/* loaded from: classes.dex */
public class XFormsModule implements IModule {
    @Override // org.javarosa.core.api.IModule
    public void registerModule() {
        PrototypeManager.registerPrototypes(new String[]{"org.javarosa.model.xform.XPathReference", "org.javarosa.xpath.XPathConditional"});
        PrototypeManager.registerPrototypes(XPathParseTool.xpathClasses);
        RestoreUtils.xfFact = new IXFormyFactory() { // from class: org.javarosa.model.xform.XFormsModule.1
            @Override // org.javarosa.core.model.util.restorable.IXFormyFactory
            public TreeReference ref(String str) {
                return FormInstance.unpackReference(new XPathReference(str));
            }

            @Override // org.javarosa.core.model.util.restorable.IXFormyFactory
            public IDataPayload serializeInstance(FormInstance formInstance) {
                try {
                    return new XFormSerializingVisitor().createSerializedPayload(formInstance);
                } catch (IOException e) {
                    return null;
                }
            }

            @Override // org.javarosa.core.model.util.restorable.IXFormyFactory
            public FormInstance parseRestore(byte[] bArr, Class cls) {
                return XFormParser.restoreDataModel(bArr, cls);
            }

            @Override // org.javarosa.core.model.util.restorable.IXFormyFactory
            public IAnswerData parseData(String str, int i, TreeReference treeReference, FormDef formDef) {
                return XFormAnswerDataParser.getAnswerData(str, i, XFormParser.ghettoGetQuestionDef(i, formDef, treeReference));
            }

            @Override // org.javarosa.core.model.util.restorable.IXFormyFactory
            public String serializeData(IAnswerData iAnswerData) {
                return (String) new XFormAnswerDataSerializer().serializeAnswerData(iAnswerData);
            }

            @Override // org.javarosa.core.model.util.restorable.IXFormyFactory
            public IConditionExpr refToPathExpr(TreeReference treeReference) {
                return new XPathConditional(XPathPathExpr.fromRef(treeReference));
            }
        };
    }
}
