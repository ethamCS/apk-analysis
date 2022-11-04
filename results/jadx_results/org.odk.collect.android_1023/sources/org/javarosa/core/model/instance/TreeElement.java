package org.javarosa.core.model.instance;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.FormElementStateListener;
import org.javarosa.core.model.condition.Constraint;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.SelectMultiData;
import org.javarosa.core.model.data.SelectOneData;
import org.javarosa.core.model.data.UncastData;
import org.javarosa.core.model.instance.utils.CompactInstanceWrapper;
import org.javarosa.core.model.instance.utils.ITreeVisitor;
import org.javarosa.core.model.util.restorable.RestoreUtils;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapNullable;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.ExternalizableWrapper;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class TreeElement implements Externalizable {
    private Vector<TreeElement> attributes;
    private Vector<TreeElement> bindAttributes;
    private Vector children;
    private Constraint constraint;
    public int dataType;
    private boolean enabled;
    private boolean enabledInherited;
    private String instanceName;
    public boolean isAttribute;
    public int multiplicity;
    private String name;
    private String namespace;
    private Vector observers;
    private TreeElement parent;
    private String preloadHandler;
    private String preloadParams;
    private boolean relevant;
    private boolean relevantInherited;
    public boolean repeatable;
    public boolean required;
    private IAnswerData value;

    public TreeElement() {
        this(null, 0);
    }

    public TreeElement(String str) {
        this(str, 0);
    }

    public TreeElement(String str, int i) {
        this.children = new Vector();
        this.dataType = 0;
        this.required = false;
        this.constraint = null;
        this.preloadHandler = null;
        this.preloadParams = null;
        this.bindAttributes = new Vector<>();
        this.relevant = true;
        this.enabled = true;
        this.relevantInherited = true;
        this.enabledInherited = true;
        this.instanceName = null;
        this.name = str;
        this.multiplicity = i;
        this.parent = null;
        this.attributes = new Vector<>(0);
    }

    public static TreeElement constructAttributeElement(String str, String str2, String str3) {
        TreeElement treeElement = new TreeElement(str2);
        treeElement.isAttribute = true;
        if (str == null) {
            str = "";
        }
        treeElement.namespace = str;
        treeElement.multiplicity = -4;
        treeElement.value = new UncastData(str3);
        return treeElement;
    }

    public static TreeElement getAttribute(Vector<TreeElement> vector, String str, String str2) {
        Iterator<TreeElement> it = vector.iterator();
        while (it.hasNext()) {
            TreeElement next = it.next();
            if (next.getName().equals(str2) && (str == null || str.equals(next.namespace))) {
                return next;
            }
        }
        return null;
    }

    public static void setAttribute(TreeElement treeElement, Vector<TreeElement> vector, String str, String str2, String str3) {
        TreeElement attribute = getAttribute(vector, str, str2);
        if (attribute != null) {
            if (str3 == null) {
                vector.removeElement(attribute);
            } else {
                attribute.setValue(new UncastData(str3));
            }
        } else if (str3 != null) {
            TreeElement constructAttributeElement = constructAttributeElement(str, str2, str3);
            constructAttributeElement.setParent(treeElement);
            vector.addElement(constructAttributeElement);
        }
    }

    public boolean isLeaf() {
        return this.children.size() == 0;
    }

    public boolean isChildable() {
        return this.value == null;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String str) {
        this.instanceName = str;
    }

    public void setValue(IAnswerData iAnswerData) {
        if (isLeaf()) {
            this.value = iAnswerData;
            return;
        }
        throw new RuntimeException("Can't set data value for node that has children!");
    }

    public TreeElement getChild(String str, int i) {
        if (str.equals(TreeReference.NAME_WILDCARD)) {
            if (i != -2 && this.children.size() >= i + 1) {
                return (TreeElement) this.children.elementAt(i);
            }
            return null;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.children.size()) {
                return null;
            }
            TreeElement treeElement = (TreeElement) this.children.elementAt(i3);
            if (!str.equals(treeElement.getName()) || treeElement.getMult() != i) {
                i2 = i3 + 1;
            } else {
                return treeElement;
            }
        }
    }

    public Vector<TreeElement> getChildrenWithName(String str) {
        return getChildrenWithName(str, false);
    }

    private Vector<TreeElement> getChildrenWithName(String str, boolean z) {
        Vector<TreeElement> vector = new Vector<>();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.children.size()) {
                TreeElement treeElement = (TreeElement) this.children.elementAt(i2);
                if ((treeElement.getName().equals(str) || str.equals(TreeReference.NAME_WILDCARD)) && (z || treeElement.multiplicity != -2)) {
                    vector.addElement(treeElement);
                }
                i = i2 + 1;
            } else {
                return vector;
            }
        }
    }

    public int getNumChildren() {
        return this.children.size();
    }

    public TreeElement getChildAt(int i) {
        return (TreeElement) this.children.elementAt(i);
    }

    public void addChild(TreeElement treeElement) {
        addChild(treeElement, false);
    }

    private void addChild(TreeElement treeElement, boolean z) {
        int i = -2;
        if (!isChildable()) {
            throw new RuntimeException("Can't add children to node that has data value!");
        }
        if (treeElement.multiplicity == -1) {
            throw new RuntimeException("Cannot add child with an unbound index!");
        }
        if (z && getChild(treeElement.name, treeElement.multiplicity) != null) {
            throw new RuntimeException("Attempted to add duplicate child!");
        }
        int size = this.children.size();
        if (treeElement.getMult() == -2) {
            TreeElement child = getChild(treeElement.getName(), 0);
            if (child != null) {
                size = this.children.indexOf(child);
            }
        } else {
            String name = treeElement.getName();
            if (treeElement.getMult() != 0) {
                i = treeElement.getMult() - 1;
            }
            TreeElement child2 = getChild(name, i);
            if (child2 != null) {
                size = this.children.indexOf(child2) + 1;
            }
        }
        this.children.insertElementAt(treeElement, size);
        treeElement.setParent(this);
        treeElement.setRelevant(isRelevant(), true);
        treeElement.setEnabled(isEnabled(), true);
        treeElement.setInstanceName(getInstanceName());
    }

    public void removeChild(TreeElement treeElement) {
        this.children.removeElement(treeElement);
    }

    public void removeChild(String str, int i) {
        TreeElement child = getChild(str, i);
        if (child != null) {
            removeChild(child);
        }
    }

    public void removeChildren(String str) {
        removeChildren(str, false);
    }

    public void removeChildren(String str, boolean z) {
        Vector<TreeElement> childrenWithName = getChildrenWithName(str, z);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < childrenWithName.size()) {
                removeChild(childrenWithName.elementAt(i2));
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public void removeChildAt(int i) {
        this.children.removeElementAt(i);
    }

    public int getChildMultiplicity(String str) {
        return getChildrenWithName(str, false).size();
    }

    public TreeElement shallowCopy() {
        TreeElement treeElement = new TreeElement(this.name, this.multiplicity);
        treeElement.parent = this.parent;
        treeElement.repeatable = this.repeatable;
        treeElement.dataType = this.dataType;
        treeElement.relevant = this.relevant;
        treeElement.required = this.required;
        treeElement.enabled = this.enabled;
        treeElement.constraint = this.constraint;
        treeElement.preloadHandler = this.preloadHandler;
        treeElement.preloadParams = this.preloadParams;
        treeElement.instanceName = this.instanceName;
        treeElement.bindAttributes = this.bindAttributes;
        treeElement.attributes = new Vector<>();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.attributes.size()) {
                break;
            }
            TreeElement elementAt = this.attributes.elementAt(i2);
            treeElement.setAttribute(elementAt.getNamespace(), elementAt.getName(), elementAt.getAttributeValue());
            i = i2 + 1;
        }
        if (this.value != null) {
            treeElement.value = this.value.clone();
        }
        treeElement.children = this.children;
        return treeElement;
    }

    public TreeElement deepCopy(boolean z) {
        TreeElement shallowCopy = shallowCopy();
        shallowCopy.children = new Vector();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.children.size()) {
                TreeElement treeElement = (TreeElement) this.children.elementAt(i2);
                if (z || treeElement.getMult() != -2) {
                    shallowCopy.addChild(treeElement.deepCopy(z));
                }
                i = i2 + 1;
            } else {
                return shallowCopy;
            }
        }
    }

    public boolean isRelevant() {
        return this.relevantInherited && this.relevant;
    }

    public boolean isEnabled() {
        return this.enabledInherited && this.enabled;
    }

    public boolean setAnswer(IAnswerData iAnswerData) {
        if (this.value == null && iAnswerData == null) {
            return false;
        }
        setValue(iAnswerData);
        alertStateObservers(1);
        return true;
    }

    public void setRequired(boolean z) {
        if (this.required != z) {
            this.required = z;
            alertStateObservers(16);
        }
    }

    public void setRelevant(boolean z) {
        setRelevant(z, false);
    }

    private void setRelevant(boolean z, boolean z2) {
        boolean isRelevant = isRelevant();
        if (z2) {
            this.relevantInherited = z;
        } else {
            this.relevant = z;
        }
        if (isRelevant() != isRelevant) {
            for (int i = 0; i < this.children.size(); i++) {
                ((TreeElement) this.children.elementAt(i)).setRelevant(isRelevant(), true);
            }
            for (int i2 = 0; i2 < this.attributes.size(); i2++) {
                this.attributes.elementAt(i2).setRelevant(isRelevant(), true);
            }
            alertStateObservers(8);
        }
    }

    public void setBindAttributes(Vector<TreeElement> vector) {
        Iterator<TreeElement> it = vector.iterator();
        while (it.hasNext()) {
            TreeElement next = it.next();
            setBindAttribute(next.getNamespace(), next.getName(), next.getAttributeValue());
        }
    }

    public Vector<TreeElement> getBindAttributes() {
        return this.bindAttributes;
    }

    public TreeElement getBindAttribute(String str, String str2) {
        return getAttribute(this.bindAttributes, str, str2);
    }

    public String getBindAttributeValue(String str, String str2) {
        TreeElement bindAttribute = getBindAttribute(str, str2);
        if (bindAttribute == null) {
            return null;
        }
        return getAttributeValue(bindAttribute);
    }

    public void setBindAttribute(String str, String str2, String str3) {
        setAttribute(this, this.bindAttributes, str, str2, str3);
    }

    public void setEnabled(boolean z) {
        setEnabled(z, false);
    }

    public void setEnabled(boolean z, boolean z2) {
        boolean isEnabled = isEnabled();
        if (z2) {
            this.enabledInherited = z;
        } else {
            this.enabled = z;
        }
        if (isEnabled() != isEnabled) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.children.size()) {
                    ((TreeElement) this.children.elementAt(i2)).setEnabled(isEnabled(), true);
                    i = i2 + 1;
                } else {
                    alertStateObservers(4);
                    return;
                }
            }
        }
    }

    public void registerStateObserver(FormElementStateListener formElementStateListener) {
        if (this.observers == null) {
            this.observers = new Vector();
        }
        if (!this.observers.contains(formElementStateListener)) {
            this.observers.addElement(formElementStateListener);
        }
    }

    public void unregisterStateObserver(FormElementStateListener formElementStateListener) {
        if (this.observers != null) {
            this.observers.removeElement(formElementStateListener);
            if (this.observers.isEmpty()) {
                this.observers = null;
            }
        }
    }

    public void unregisterAll() {
        this.observers = null;
    }

    public void alertStateObservers(int i) {
        if (this.observers != null) {
            Enumeration elements = this.observers.elements();
            while (elements.hasMoreElements()) {
                ((FormElementStateListener) elements.nextElement()).formElementStateChanged(this, i);
            }
        }
    }

    public void accept(ITreeVisitor iTreeVisitor) {
        iTreeVisitor.visit(this);
        Enumeration elements = this.children.elements();
        while (elements.hasMoreElements()) {
            ((TreeElement) elements.nextElement()).accept(iTreeVisitor);
        }
    }

    public int getAttributeCount() {
        return this.attributes.size();
    }

    public String getAttributeNamespace(int i) {
        return this.attributes.elementAt(i).namespace;
    }

    public String getAttributeName(int i) {
        return this.attributes.elementAt(i).name;
    }

    public String getAttributeValue(int i) {
        return getAttributeValue(this.attributes.elementAt(i));
    }

    private String getAttributeValue(TreeElement treeElement) {
        if (treeElement.getValue() == null) {
            return null;
        }
        return treeElement.getValue().uncast().getString();
    }

    public String getAttributeValue() {
        if (!this.isAttribute) {
            throw new IllegalStateException("this is not an attribute");
        }
        return getValue().uncast().getString();
    }

    public TreeElement getAttribute(String str, String str2) {
        return getAttribute(this.attributes, str, str2);
    }

    public String getAttributeValue(String str, String str2) {
        TreeElement attribute = getAttribute(str, str2);
        if (attribute == null) {
            return null;
        }
        return getAttributeValue(attribute);
    }

    public void setAttribute(String str, String str2, String str3) {
        setAttribute(this, this.attributes, str, str2, str3);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        TreeElement treeElement;
        this.name = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.multiplicity = ExtUtil.readInt(dataInputStream);
        this.repeatable = ExtUtil.readBool(dataInputStream);
        this.value = (IAnswerData) ExtUtil.read(dataInputStream, new ExtWrapNullable((ExternalizableWrapper) new ExtWrapTagged()), prototypeFactory);
        if (!ExtUtil.readBool(dataInputStream)) {
            this.children = null;
        } else {
            this.children = new Vector();
            int readNumeric = (int) ExtUtil.readNumeric(dataInputStream);
            for (int i = 0; i < readNumeric; i++) {
                if (ExtUtil.readBool(dataInputStream)) {
                    treeElement = new TreeElement();
                    treeElement.readExternal(dataInputStream, prototypeFactory);
                } else {
                    treeElement = (TreeElement) ExtUtil.read(dataInputStream, new ExtWrapTagged(), prototypeFactory);
                }
                treeElement.setParent(this);
                this.children.addElement(treeElement);
            }
        }
        this.dataType = ExtUtil.readInt(dataInputStream);
        this.relevant = ExtUtil.readBool(dataInputStream);
        this.required = ExtUtil.readBool(dataInputStream);
        this.enabled = ExtUtil.readBool(dataInputStream);
        this.instanceName = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.relevantInherited = ExtUtil.readBool(dataInputStream);
        this.enabledInherited = ExtUtil.readBool(dataInputStream);
        this.constraint = (Constraint) ExtUtil.read(dataInputStream, new ExtWrapNullable(Constraint.class), prototypeFactory);
        this.preloadHandler = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.preloadParams = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.bindAttributes = ExtUtil.readAttributes(dataInputStream, this);
        this.attributes = ExtUtil.readAttributes(dataInputStream, this);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.name));
        ExtUtil.writeNumeric(dataOutputStream, this.multiplicity);
        ExtUtil.writeBool(dataOutputStream, this.repeatable);
        ExtUtil.write(dataOutputStream, new ExtWrapNullable((ExternalizableWrapper) (this.value == null ? null : new ExtWrapTagged(this.value))));
        if (this.children == null) {
            ExtUtil.writeBool(dataOutputStream, false);
        } else {
            ExtUtil.writeBool(dataOutputStream, true);
            ExtUtil.writeNumeric(dataOutputStream, this.children.size());
            Enumeration elements = this.children.elements();
            while (elements.hasMoreElements()) {
                TreeElement treeElement = (TreeElement) elements.nextElement();
                if (treeElement.getClass() == TreeElement.class) {
                    ExtUtil.writeBool(dataOutputStream, true);
                    treeElement.writeExternal(dataOutputStream);
                } else {
                    ExtUtil.writeBool(dataOutputStream, false);
                    ExtUtil.write(dataOutputStream, new ExtWrapTagged(treeElement));
                }
            }
        }
        ExtUtil.writeNumeric(dataOutputStream, this.dataType);
        ExtUtil.writeBool(dataOutputStream, this.relevant);
        ExtUtil.writeBool(dataOutputStream, this.required);
        ExtUtil.writeBool(dataOutputStream, this.enabled);
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.instanceName));
        ExtUtil.writeBool(dataOutputStream, this.relevantInherited);
        ExtUtil.writeBool(dataOutputStream, this.enabledInherited);
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.constraint));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.preloadHandler));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.preloadParams));
        ExtUtil.writeAttributes(dataOutputStream, this.bindAttributes);
        ExtUtil.writeAttributes(dataOutputStream, this.attributes);
    }

    public void populate(TreeElement treeElement, FormDef formDef) {
        if (isLeaf()) {
            IAnswerData value = treeElement.getValue();
            if (value == null) {
                setValue(null);
                return;
            } else if (this.dataType == 1 || this.dataType == 0) {
                setValue(value);
                return;
            } else {
                setValue(RestoreUtils.xfFact.parseData((String) value.getValue(), this.dataType, getRef(), formDef));
                return;
            }
        }
        Vector vector = new Vector();
        for (int i = 0; i < getNumChildren(); i++) {
            TreeElement childAt = getChildAt(i);
            if (!vector.contains(childAt.getName())) {
                vector.addElement(childAt.getName());
            }
        }
        int i2 = 0;
        while (i2 < getNumChildren()) {
            TreeElement childAt2 = getChildAt(i2);
            if (childAt2.repeatable && childAt2.getMult() != -2) {
                removeChildAt(i2);
                i2--;
            }
            i2++;
        }
        if (getNumChildren() != vector.size()) {
            throw new RuntimeException("sanity check failed");
        }
        for (int i3 = 0; i3 < getNumChildren(); i3++) {
            TreeElement childAt3 = getChildAt(i3);
            String str = (String) vector.elementAt(i3);
            if (!childAt3.getName().equals(str)) {
                int i4 = i3 + 1;
                TreeElement treeElement2 = null;
                while (i4 < getNumChildren()) {
                    treeElement2 = getChildAt(i4);
                    if (treeElement2.getName().equals(str)) {
                        break;
                    }
                    i4++;
                }
                if (i4 == getNumChildren()) {
                    throw new RuntimeException("sanity check failed");
                }
                removeChildAt(i4);
                this.children.insertElementAt(treeElement2, i3);
            }
        }
        int i5 = 0;
        while (i5 < getNumChildren()) {
            TreeElement childAt4 = getChildAt(i5);
            Vector<TreeElement> childrenWithName = treeElement.getChildrenWithName(childAt4.getName());
            if (childAt4.repeatable) {
                for (int i6 = 0; i6 < childrenWithName.size(); i6++) {
                    TreeElement deepCopy = childAt4.deepCopy(true);
                    deepCopy.setMult(i6);
                    this.children.insertElementAt(deepCopy, i5 + i6 + 1);
                    deepCopy.populate(childrenWithName.elementAt(i6), formDef);
                }
                i5 += childrenWithName.size();
            } else if (childrenWithName.size() == 0) {
                childAt4.setRelevant(false);
            } else {
                childAt4.populate(childrenWithName.elementAt(0), formDef);
            }
            i5++;
        }
    }

    public void populateTemplate(TreeElement treeElement, FormDef formDef) {
        if (isLeaf()) {
            IAnswerData value = treeElement.getValue();
            if (value == null) {
                setValue(null);
                return;
            }
            Class classForDataType = CompactInstanceWrapper.classForDataType(this.dataType);
            if (classForDataType == null) {
                throw new RuntimeException("data type [" + value.getClass().getName() + "] not supported inside itemset");
            }
            if (classForDataType.isAssignableFrom(value.getClass()) && !(value instanceof SelectOneData) && !(value instanceof SelectMultiData)) {
                setValue(value);
                return;
            }
            setValue(RestoreUtils.xfFact.parseData(RestoreUtils.xfFact.serializeData(value), this.dataType, getRef(), formDef));
            return;
        }
        int i = 0;
        while (i < getNumChildren()) {
            TreeElement childAt = getChildAt(i);
            Vector<TreeElement> childrenWithName = treeElement.getChildrenWithName(childAt.getName());
            if (childAt.repeatable) {
                for (int i2 = 0; i2 < childrenWithName.size(); i2++) {
                    TreeElement deepCopy = formDef.getMainInstance().getTemplate(childAt.getRef()).deepCopy(false);
                    deepCopy.setMult(i2);
                    this.children.insertElementAt(deepCopy, i + i2 + 1);
                    deepCopy.populateTemplate(childrenWithName.elementAt(i2), formDef);
                }
                i += childrenWithName.size();
            } else {
                childAt.populateTemplate(childrenWithName.elementAt(0), formDef);
            }
            i++;
        }
    }

    public TreeReference getRef() {
        TreeReference rootRef;
        TreeReference selfRef = TreeReference.selfRef();
        TreeElement treeElement = this;
        while (treeElement != null) {
            if (treeElement.name != null) {
                rootRef = TreeReference.selfRef();
                rootRef.add(treeElement.name, treeElement.multiplicity);
                rootRef.setInstanceName(treeElement.getInstanceName());
            } else {
                rootRef = TreeReference.rootRef();
                rootRef.setInstanceName(getInstanceName());
            }
            TreeReference parent = selfRef.parent(rootRef);
            treeElement = treeElement.parent;
            selfRef = parent;
        }
        return selfRef;
    }

    public int getDepth() {
        int i = 0;
        while (this.name != null) {
            i++;
            this = this.parent;
        }
        return i;
    }

    public String getPreloadHandler() {
        return this.preloadHandler;
    }

    public Constraint getConstraint() {
        return this.constraint;
    }

    public void setPreloadHandler(String str) {
        this.preloadHandler = str;
    }

    public void setConstraint(Constraint constraint) {
        this.constraint = constraint;
    }

    public String getPreloadParams() {
        return this.preloadParams;
    }

    public void setPreloadParams(String str) {
        this.preloadParams = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public int getMult() {
        return this.multiplicity;
    }

    public void setMult(int i) {
        this.multiplicity = i;
    }

    public void setParent(TreeElement treeElement) {
        this.parent = treeElement;
    }

    public TreeElement getParent() {
        return this.parent;
    }

    public IAnswerData getValue() {
        return this.value;
    }

    public String toString() {
        String str = "NULL";
        if (this.name != null) {
            str = this.name;
        }
        String str2 = "-1";
        if (this.children != null) {
            str2 = Integer.toString(this.children.size());
        }
        return str + " - Children: " + str2;
    }
}
