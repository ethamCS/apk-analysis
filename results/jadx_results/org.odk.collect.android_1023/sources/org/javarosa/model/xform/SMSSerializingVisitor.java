package org.javarosa.model.xform;

import java.io.IOException;
import java.util.Vector;
import org.javarosa.core.data.IDataPointer;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.IAnswerDataSerializer;
import org.javarosa.core.model.IDataReference;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.model.utils.IInstanceSerializingVisitor;
import org.javarosa.core.services.transport.payload.ByteArrayPayload;
import org.javarosa.core.services.transport.payload.IDataPayload;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.kxml2.kdom.Element;
import org.opendatakit.httpclientandroidlib.protocol.HTTP;
/* loaded from: classes.dex */
public class SMSSerializingVisitor implements IInstanceSerializingVisitor {
    Vector dataPointers;
    private TreeReference rootRef;
    FormDef schema;
    IAnswerDataSerializer serializer;
    private String theSmsStr = null;
    private String nodeSet = null;
    private String xmlns = null;
    private String delimeter = null;
    private String prefix = null;
    private String method = null;

    private void init() {
        this.theSmsStr = null;
        this.schema = null;
        this.dataPointers = new Vector();
        this.theSmsStr = "";
    }

    @Override // org.javarosa.core.model.utils.IInstanceSerializingVisitor
    public byte[] serializeInstance(FormInstance formInstance, FormDef formDef) throws IOException {
        init();
        this.schema = formDef;
        return serializeInstance(formInstance);
    }

    @Override // org.javarosa.core.model.utils.IInstanceSerializingVisitor
    public byte[] serializeInstance(FormInstance formInstance) throws IOException {
        return serializeInstance(formInstance, new XPathReference("/"));
    }

    @Override // org.javarosa.core.model.utils.IInstanceSerializingVisitor
    public byte[] serializeInstance(FormInstance formInstance, IDataReference iDataReference) throws IOException {
        init();
        this.rootRef = FormInstance.unpackReference(iDataReference);
        if (this.serializer == null) {
            setAnswerDataSerializer(new XFormAnswerDataSerializer());
        }
        formInstance.accept(this);
        if (this.theSmsStr != null) {
            return this.theSmsStr.getBytes("UTF-16BE");
        }
        return null;
    }

    @Override // org.javarosa.core.model.utils.IInstanceSerializingVisitor
    public IDataPayload createSerializedPayload(FormInstance formInstance) throws IOException {
        return createSerializedPayload(formInstance, new XPathReference("/"));
    }

    @Override // org.javarosa.core.model.utils.IInstanceSerializingVisitor
    public IDataPayload createSerializedPayload(FormInstance formInstance, IDataReference iDataReference) throws IOException {
        init();
        this.rootRef = FormInstance.unpackReference(iDataReference);
        if (this.serializer == null) {
            setAnswerDataSerializer(new XFormAnswerDataSerializer());
        }
        formInstance.accept(this);
        if (this.theSmsStr != null) {
            return new ByteArrayPayload(this.theSmsStr.getBytes(HTTP.UTF_16), null, 5);
        }
        return null;
    }

    @Override // org.javarosa.core.model.utils.IInstanceVisitor
    public void visit(FormInstance formInstance) {
        this.nodeSet = new String();
        TreeElement resolveReference = formInstance.resolveReference(this.rootRef);
        this.xmlns = resolveReference.getAttributeValue("", "xmlns");
        this.delimeter = resolveReference.getAttributeValue("", "delimeter");
        this.prefix = resolveReference.getAttributeValue("", "prefix");
        this.xmlns = this.xmlns != null ? this.xmlns : XFormAnswerDataSerializer.DELIMITER;
        this.delimeter = this.delimeter != null ? this.delimeter : XFormAnswerDataSerializer.DELIMITER;
        this.prefix = this.prefix != null ? this.prefix : XFormAnswerDataSerializer.DELIMITER;
        this.theSmsStr = this.prefix;
        for (int i = 0; i < resolveReference.getNumChildren(); i++) {
            String serializeNode = serializeNode(resolveReference.getChildAt(i));
            if (serializeNode != null) {
                this.theSmsStr += serializeNode;
            }
        }
        this.theSmsStr = this.theSmsStr.trim();
    }

    public String serializeNode(TreeElement treeElement) {
        String attributeValue;
        if (!treeElement.isRelevant() || treeElement.getMult() == -2) {
            return null;
        }
        if (treeElement.getValue() == null) {
            return "";
        }
        Object serializeAnswerData = this.serializer.serializeAnswerData(treeElement.getValue(), treeElement.dataType);
        if (serializeAnswerData instanceof Element) {
            throw new RuntimeException("Can't handle serialized output for" + treeElement.getValue().toString() + ", " + serializeAnswerData);
        }
        if (serializeAnswerData instanceof String) {
            Element element = new Element();
            element.addChild(4, (String) serializeAnswerData);
            String str = "" + (treeElement.getAttributeValue("", "tag") != null ? attributeValue + this.delimeter : this.delimeter);
            for (int i = 0; i < element.getChildCount(); i++) {
                str = str + element.getChild(i).toString() + this.delimeter;
            }
            if (this.serializer.containsExternalData(treeElement.getValue()).booleanValue()) {
                for (IDataPointer iDataPointer : this.serializer.retrieveExternalDataPointer(treeElement.getValue())) {
                    this.dataPointers.addElement(iDataPointer);
                }
                return str;
            }
            return str;
        }
        throw new RuntimeException("Can't handle serialized output for" + treeElement.getValue().toString() + ", " + serializeAnswerData);
    }

    @Override // org.javarosa.core.model.utils.IInstanceSerializingVisitor
    public void setAnswerDataSerializer(IAnswerDataSerializer iAnswerDataSerializer) {
        this.serializer = iAnswerDataSerializer;
    }

    @Override // org.javarosa.core.model.utils.IInstanceSerializingVisitor
    public IInstanceSerializingVisitor newInstance() {
        XFormSerializingVisitor xFormSerializingVisitor = new XFormSerializingVisitor();
        xFormSerializingVisitor.setAnswerDataSerializer(this.serializer);
        return xFormSerializingVisitor;
    }
}
