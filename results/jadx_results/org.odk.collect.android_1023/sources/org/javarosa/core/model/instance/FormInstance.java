package org.javarosa.core.model.instance;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.IDataReference;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.instance.utils.ITreeVisitor;
import org.javarosa.core.model.util.restorable.Restorable;
import org.javarosa.core.model.util.restorable.RestoreUtils;
import org.javarosa.core.model.utils.IInstanceVisitor;
import org.javarosa.core.services.storage.Persistable;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapMap;
import org.javarosa.core.util.externalizable.ExtWrapNullable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class FormInstance implements Persistable, Restorable {
    public static final String STORAGE_KEY = "FORMDATA";
    private Date dateSaved;
    private int formId;
    public String formVersion;
    private int id;
    private String name;
    public String schema;
    public String uiVersion;
    private TreeElement root = new TreeElement();
    private Hashtable namespaces = new Hashtable();

    public FormInstance() {
    }

    public FormInstance(TreeElement treeElement) {
        setID(-1);
        setFormId(-1);
        setRoot(treeElement);
    }

    public void setRoot(TreeElement treeElement) {
        this.root = new TreeElement();
        if (getName() != null) {
            this.root.setInstanceName(getName());
        }
        if (treeElement != null) {
            this.root.addChild(treeElement);
        }
    }

    public TreeElement getBase() {
        return this.root;
    }

    public TreeElement getRoot() {
        if (this.root.getNumChildren() == 0) {
            throw new RuntimeException("root node has no children");
        }
        return this.root.getChildAt(0);
    }

    public static TreeReference unpackReference(IDataReference iDataReference) {
        return (TreeReference) iDataReference.getReference();
    }

    public TreeReference copyNode(TreeReference treeReference, TreeReference treeReference2) throws InvalidReferenceException {
        if (!treeReference.isAbsolute()) {
            throw new InvalidReferenceException("Source reference must be absolute for copying", treeReference);
        }
        TreeElement resolveReference = resolveReference(treeReference);
        if (resolveReference == null) {
            throw new InvalidReferenceException("Null Source reference while attempting to copy node", treeReference);
        }
        return copyNode(resolveReference, treeReference2).getRef();
    }

    public TreeElement copyNode(TreeElement treeElement, TreeReference treeReference) throws InvalidReferenceException {
        if (!treeReference.isAbsolute()) {
            throw new InvalidReferenceException("Destination reference must be absolute for copying", treeReference);
        }
        String nameLast = treeReference.getNameLast();
        int multLast = treeReference.getMultLast();
        TreeReference parentRef = treeReference.getParentRef();
        TreeElement resolveReference = resolveReference(parentRef);
        if (resolveReference == null) {
            throw new InvalidReferenceException("Null parent reference whle attempting to copy", parentRef);
        }
        if (!resolveReference.isChildable()) {
            throw new InvalidReferenceException("Invalid Parent Node: cannot accept children.", parentRef);
        }
        if (multLast == -1) {
            multLast = resolveReference.getChildMultiplicity(nameLast);
        } else if (resolveReference.getChild(nameLast, multLast) != null) {
            throw new InvalidReferenceException("Destination already exists!", treeReference);
        }
        TreeElement deepCopy = treeElement.deepCopy(false);
        deepCopy.setName(nameLast);
        deepCopy.multiplicity = multLast;
        resolveReference.addChild(deepCopy);
        return deepCopy;
    }

    public void copyItemsetNode(TreeElement treeElement, TreeReference treeReference, FormDef formDef) throws InvalidReferenceException {
        copyNode(getTemplate(treeReference), treeReference).populateTemplate(treeElement, formDef);
    }

    public IAnswerData getDataValue(IDataReference iDataReference) {
        TreeElement resolveReference = resolveReference(iDataReference);
        if (resolveReference != null) {
            return resolveReference.getValue();
        }
        return null;
    }

    public TreeElement resolveReference(TreeReference treeReference) {
        if (!treeReference.isAbsolute()) {
            return null;
        }
        TreeElement treeElement = this.root;
        int i = 0;
        while (true) {
            if (i >= treeReference.size()) {
                break;
            }
            String name = treeReference.getName(i);
            int multiplicity = treeReference.getMultiplicity(i);
            if (multiplicity == -4) {
                treeElement = treeElement.getAttribute(null, name);
            } else {
                if (multiplicity == -1) {
                    if (treeElement.getChildMultiplicity(name) != 1) {
                        treeElement = null;
                        break;
                    }
                    multiplicity = 0;
                }
                treeElement = treeElement.getChild(name, multiplicity);
                if (treeElement == null) {
                    break;
                }
            }
            i++;
        }
        if (treeElement == this.root) {
            return null;
        }
        return treeElement;
    }

    public Vector explodeReference(TreeReference treeReference) {
        if (!treeReference.isAbsolute()) {
            return null;
        }
        Vector vector = new Vector();
        TreeElement treeElement = this.root;
        for (int i = 0; i < treeReference.size(); i++) {
            String name = treeReference.getName(i);
            int multiplicity = treeReference.getMultiplicity(i);
            if (multiplicity == -4) {
                if (treeElement != this.root) {
                    vector.addElement(treeElement);
                }
                treeElement = treeElement.getAttribute(null, name);
            } else {
                if (multiplicity == -1) {
                    if (treeElement.getChildMultiplicity(name) != 1) {
                        return null;
                    }
                    multiplicity = 0;
                }
                if (treeElement != this.root) {
                    vector.addElement(treeElement);
                }
                treeElement = treeElement.getChild(name, multiplicity);
                if (treeElement == null) {
                    return null;
                }
            }
        }
        return vector;
    }

    public TreeElement getTemplate(TreeReference treeReference) {
        TreeElement templatePath = getTemplatePath(treeReference);
        if (templatePath == null) {
            return null;
        }
        if (!templatePath.repeatable && !templatePath.isAttribute) {
            return null;
        }
        return templatePath;
    }

    public TreeElement getTemplatePath(TreeReference treeReference) {
        if (!treeReference.isAbsolute()) {
            return null;
        }
        TreeElement treeElement = this.root;
        for (int i = 0; i < treeReference.size(); i++) {
            String name = treeReference.getName(i);
            if (treeReference.getMultiplicity(i) == -4) {
                treeElement = treeElement.getAttribute(null, name);
            } else {
                TreeElement child = treeElement.getChild(name, -2);
                treeElement = child == null ? treeElement.getChild(name, 0) : child;
                if (treeElement == null) {
                    return null;
                }
            }
        }
        return treeElement;
    }

    public static boolean isHomogeneous(TreeElement treeElement, TreeElement treeElement2) {
        if (!treeElement.isLeaf() || !treeElement2.isLeaf()) {
            if (!treeElement.isChildable() || !treeElement2.isChildable()) {
                return false;
            }
            int i = 0;
            while (i < 2) {
                TreeElement treeElement3 = i == 0 ? treeElement : treeElement2;
                TreeElement treeElement4 = i == 0 ? treeElement2 : treeElement;
                for (int i2 = 0; i2 < treeElement3.getNumChildren(); i2++) {
                    TreeElement childAt = treeElement3.getChildAt(i2);
                    if (!childAt.repeatable) {
                        TreeElement child = treeElement4.getChild(childAt.getName(), 0);
                        if (child == null) {
                            return false;
                        }
                        if (child.repeatable) {
                            throw new RuntimeException("shouldn't happen");
                        }
                    }
                }
                i++;
            }
            for (int i3 = 0; i3 < treeElement.getNumChildren(); i3++) {
                TreeElement childAt2 = treeElement.getChildAt(i3);
                if (!childAt2.repeatable && !isHomogeneous(childAt2, treeElement2.getChild(childAt2.getName(), 0))) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public TreeElement resolveReference(IDataReference iDataReference) {
        return resolveReference(unpackReference(iDataReference));
    }

    public void accept(IInstanceVisitor iInstanceVisitor) {
        iInstanceVisitor.visit(this);
        if (iInstanceVisitor instanceof ITreeVisitor) {
            this.root.accept((ITreeVisitor) iInstanceVisitor);
        }
    }

    public void setDateSaved(Date date) {
        this.dateSaved = date;
    }

    public void setFormId(int i) {
        this.formId = i;
    }

    public Date getDateSaved() {
        return this.dateSaved;
    }

    public int getFormId() {
        return this.formId;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.id = ExtUtil.readInt(dataInputStream);
        this.formId = ExtUtil.readInt(dataInputStream);
        this.name = (String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory);
        this.schema = (String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory);
        this.dateSaved = (Date) ExtUtil.read(dataInputStream, new ExtWrapNullable(Date.class), prototypeFactory);
        this.namespaces = (Hashtable) ExtUtil.read(dataInputStream, new ExtWrapMap(String.class, String.class));
        setRoot((TreeElement) ExtUtil.read(dataInputStream, TreeElement.class, prototypeFactory));
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeNumeric(dataOutputStream, this.id);
        ExtUtil.writeNumeric(dataOutputStream, this.formId);
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.name));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.schema));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.dateSaved));
        ExtUtil.write(dataOutputStream, new ExtWrapMap(this.namespaces));
        ExtUtil.write(dataOutputStream, getRoot());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // org.javarosa.core.services.storage.Persistable
    public int getID() {
        return this.id;
    }

    @Override // org.javarosa.core.services.storage.Persistable
    public void setID(int i) {
        this.id = i;
    }

    public TreeReference addNode(TreeReference treeReference) {
        TreeReference clone = treeReference.clone();
        if (createNode(clone) != null) {
            return clone;
        }
        return null;
    }

    public TreeReference addNode(TreeReference treeReference, IAnswerData iAnswerData, int i) {
        TreeReference clone = treeReference.clone();
        TreeElement createNode = createNode(clone);
        if (createNode != null) {
            if (i >= 0) {
                createNode.dataType = i;
            }
            createNode.setValue(iAnswerData);
            return clone;
        }
        return null;
    }

    private TreeElement createNode(TreeReference treeReference) {
        TreeElement treeElement = this.root;
        for (int i = 0; i < treeReference.size(); i++) {
            String name = treeReference.getName(i);
            int childMultiplicity = treeElement.getChildMultiplicity(name);
            int multiplicity = treeReference.getMultiplicity(i);
            if (i < treeReference.size() - 1) {
                if (multiplicity == -1) {
                    if (childMultiplicity > 1) {
                        return null;
                    }
                    treeReference.setMultiplicity(i, 0);
                    multiplicity = 0;
                }
                TreeElement child = treeElement.getChild(name, multiplicity);
                if (child != null) {
                    treeElement = child;
                } else if (multiplicity != 0) {
                    return null;
                } else {
                    TreeElement treeElement2 = new TreeElement(name, childMultiplicity);
                    treeElement.addChild(treeElement2);
                    treeReference.setMultiplicity(i, childMultiplicity);
                    treeElement = treeElement2;
                }
            } else if (multiplicity != -1 && multiplicity != childMultiplicity) {
                return null;
            } else {
                if ((i != 0 || this.root.getNumChildren() == 0) && treeElement.isChildable()) {
                    TreeElement treeElement3 = new TreeElement(name, childMultiplicity);
                    treeElement.addChild(treeElement3);
                    treeReference.setMultiplicity(i, childMultiplicity);
                    treeElement = treeElement3;
                }
                return null;
            }
        }
        return treeElement;
    }

    public void addNamespace(String str, String str2) {
        this.namespaces.put(str, str2);
    }

    public String[] getNamespacePrefixes() {
        String[] strArr = new String[this.namespaces.size()];
        int i = 0;
        Enumeration keys = this.namespaces.keys();
        while (true) {
            int i2 = i;
            if (keys.hasMoreElements()) {
                strArr[i2] = (String) keys.nextElement();
                i = i2 + 1;
            } else {
                return strArr;
            }
        }
    }

    public String getNamespaceURI(String str) {
        return (String) this.namespaces.get(str);
    }

    @Override // org.javarosa.core.model.util.restorable.Restorable
    public String getRestorableType() {
        return "form";
    }

    @Override // org.javarosa.core.model.util.restorable.Restorable
    public FormInstance exportData() {
        FormInstance createDataModel = RestoreUtils.createDataModel(this);
        RestoreUtils.addData(createDataModel, "name", this.name);
        RestoreUtils.addData(createDataModel, "form-id", new Integer(this.formId));
        RestoreUtils.addData(createDataModel, "saved-on", this.dateSaved, 6);
        RestoreUtils.addData(createDataModel, "schema", this.schema);
        throw new RuntimeException("FormInstance.exportData(): must be updated to use new transport layer");
    }

    @Override // org.javarosa.core.model.util.restorable.Restorable
    public void templateData(FormInstance formInstance, TreeReference treeReference) {
        RestoreUtils.applyDataType(formInstance, "name", treeReference, String.class);
        RestoreUtils.applyDataType(formInstance, "form-id", treeReference, Integer.class);
        RestoreUtils.applyDataType(formInstance, "saved-on", treeReference, 6);
        RestoreUtils.applyDataType(formInstance, "schema", treeReference, String.class);
        RestoreUtils.applyDataType(formInstance, "sent", treeReference, Boolean.class);
    }

    @Override // org.javarosa.core.model.util.restorable.Restorable
    public void importData(FormInstance formInstance) {
        this.name = (String) RestoreUtils.getValue("name", formInstance);
        this.formId = ((Integer) RestoreUtils.getValue("form-id", formInstance)).intValue();
        this.dateSaved = (Date) RestoreUtils.getValue("saved-on", formInstance);
        this.schema = (String) RestoreUtils.getValue("schema", formInstance);
        RestoreUtils.getBoolean(RestoreUtils.getValue("sent", formInstance));
        TreeElement resolveReference = formInstance.resolveReference(RestoreUtils.absRef("namespace", formInstance));
        if (resolveReference != null) {
            for (int i = 0; i < resolveReference.getNumChildren(); i++) {
                String name = resolveReference.getChildAt(i).getName();
                Object value = RestoreUtils.getValue("namespace/" + name, formInstance);
                if (value != null) {
                    this.namespaces.put(name, value);
                }
            }
        }
        throw new RuntimeException("FormInstance.importData(): must be updated to use new transport layer");
    }

    public TreeElement processSaved(FormInstance formInstance, FormDef formDef) {
        TreeElement deepCopy = formInstance.getRoot().deepCopy(true);
        TreeElement childAt = this.root.getChildAt(0);
        if (!deepCopy.getName().equals(childAt.getName()) || childAt.getMult() != 0) {
            throw new RuntimeException("Saved form instance to restore does not match form definition");
        }
        deepCopy.populate(childAt, formDef);
        return deepCopy;
    }

    public FormInstance clone() {
        FormInstance formInstance = new FormInstance(getRoot().deepCopy(true));
        formInstance.setID(getID());
        formInstance.setFormId(getFormId());
        formInstance.setName(getName());
        formInstance.setDateSaved(getDateSaved());
        formInstance.schema = this.schema;
        formInstance.formVersion = this.formVersion;
        formInstance.uiVersion = this.uiVersion;
        formInstance.namespaces = new Hashtable();
        Enumeration keys = this.namespaces.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            formInstance.namespaces.put(nextElement, this.namespaces.get(nextElement));
        }
        return formInstance;
    }

    public String toString() {
        if (this.name == null) {
            return "NULL";
        }
        return this.name;
    }
}
