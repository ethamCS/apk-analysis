package org.javarosa.model.xform;

import java.io.IOException;
import java.util.Enumeration;
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
import org.javarosa.core.services.transport.payload.DataPointerPayload;
import org.javarosa.core.services.transport.payload.IDataPayload;
import org.javarosa.core.services.transport.payload.MultiMessagePayload;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.javarosa.xform.util.XFormSerializer;
import org.kxml2.kdom.Document;
import org.kxml2.kdom.Element;
/* loaded from: classes.dex */
public class XFormSerializingVisitor implements IInstanceSerializingVisitor {
    Vector dataPointers;
    TreeReference rootRef;
    FormDef schema;
    IAnswerDataSerializer serializer;
    Document theXmlDoc;

    private void init() {
        this.theXmlDoc = null;
        this.schema = null;
        this.dataPointers = new Vector();
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
        if (this.theXmlDoc != null) {
            return XFormSerializer.getString(this.theXmlDoc).getBytes("UTF-8");
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
        if (this.theXmlDoc != null) {
            byte[] bytes = XFormSerializer.getString(this.theXmlDoc).getBytes("UTF-8");
            if (this.dataPointers.size() == 0) {
                return new ByteArrayPayload(bytes, null, 1);
            }
            MultiMessagePayload multiMessagePayload = new MultiMessagePayload();
            multiMessagePayload.addPayload(new ByteArrayPayload(bytes, null, 1));
            Enumeration elements = this.dataPointers.elements();
            while (elements.hasMoreElements()) {
                multiMessagePayload.addPayload(new DataPointerPayload((IDataPointer) elements.nextElement()));
            }
            return multiMessagePayload;
        }
        return null;
    }

    @Override // org.javarosa.core.model.utils.IInstanceVisitor
    public void visit(FormInstance formInstance) {
        this.theXmlDoc = new Document();
        TreeElement resolveReference = formInstance.resolveReference(this.rootRef);
        if (resolveReference == null) {
            resolveReference = formInstance.getRoot();
        }
        for (int i = 0; i < resolveReference.getNumChildren(); i++) {
            resolveReference.getChildAt(i);
        }
        if (resolveReference != null) {
            this.theXmlDoc.addChild(2, serializeNode(resolveReference));
        }
        Element element = this.theXmlDoc.getElement(0);
        String[] namespacePrefixes = formInstance.getNamespacePrefixes();
        for (int i2 = 0; i2 < namespacePrefixes.length; i2++) {
            element.setPrefix(namespacePrefixes[i2], formInstance.getNamespaceURI(namespacePrefixes[i2]));
        }
        if (formInstance.schema != null) {
            element.setNamespace(formInstance.schema);
            element.setPrefix("", formInstance.schema);
        }
    }

    public Element serializeNode(TreeElement treeElement) {
        Element element;
        Element element2 = new Element();
        if (!treeElement.isRelevant() || treeElement.getMult() == -2) {
            return null;
        }
        if (treeElement.getValue() != null) {
            Object serializeAnswerData = this.serializer.serializeAnswerData(treeElement.getValue(), treeElement.dataType);
            if (serializeAnswerData instanceof Element) {
                element = (Element) serializeAnswerData;
            } else if (serializeAnswerData instanceof String) {
                Element element3 = new Element();
                element3.addChild(4, (String) serializeAnswerData);
                element = element3;
            } else {
                throw new RuntimeException("Can't handle serialized output for" + treeElement.getValue().toString() + ", " + serializeAnswerData);
            }
            if (this.serializer.containsExternalData(treeElement.getValue()).booleanValue()) {
                for (IDataPointer iDataPointer : this.serializer.retrieveExternalDataPointer(treeElement.getValue())) {
                    this.dataPointers.addElement(iDataPointer);
                }
            }
        } else {
            Vector vector = new Vector();
            for (int i = 0; i < treeElement.getNumChildren(); i++) {
                String name = treeElement.getChildAt(i).getName();
                System.out.println("CHILDNAME: " + name);
                if (!vector.contains(name)) {
                    vector.addElement(name);
                }
            }
            for (int i2 = 0; i2 < vector.size(); i2++) {
                String str = (String) vector.elementAt(i2);
                int childMultiplicity = treeElement.getChildMultiplicity(str);
                for (int i3 = 0; i3 < childMultiplicity; i3++) {
                    Element serializeNode = serializeNode(treeElement.getChild(str, i3));
                    if (serializeNode != null) {
                        element2.addChild(2, serializeNode);
                    }
                }
            }
            element = element2;
        }
        element.setName(treeElement.getName());
        for (int i4 = 0; i4 < treeElement.getAttributeCount(); i4++) {
            element.setAttribute(treeElement.getAttributeNamespace(i4), treeElement.getAttributeName(i4), treeElement.getAttributeValue(i4));
        }
        return element;
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
