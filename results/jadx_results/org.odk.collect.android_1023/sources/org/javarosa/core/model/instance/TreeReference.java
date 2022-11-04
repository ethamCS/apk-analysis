package org.javarosa.core.model.instance;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapList;
import org.javarosa.core.util.externalizable.ExtWrapListPoly;
import org.javarosa.core.util.externalizable.ExtWrapNullable;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.xpath.expr.XPathExpression;
/* loaded from: classes.dex */
public class TreeReference implements Externalizable {
    public static final int DEFAULT_MUTLIPLICITY = 0;
    public static final int INDEX_ATTRIBUTE = -4;
    public static final int INDEX_REPEAT_JUNCTURE = -10;
    public static final int INDEX_TEMPLATE = -2;
    public static final int INDEX_UNBOUND = -1;
    public static final String NAME_WILDCARD = "*";
    public static final int REF_ABSOLUTE = -1;
    private FormInstance instance;
    private String instanceName;
    private int refLevel;
    private Vector names = new Vector(0);
    private Vector multiplicity = new Vector(0);
    private Hashtable<Integer, Vector<XPathExpression>> predicates = new Hashtable<>();

    public static TreeReference rootRef() {
        TreeReference treeReference = new TreeReference();
        treeReference.refLevel = -1;
        return treeReference;
    }

    public static TreeReference selfRef() {
        TreeReference treeReference = new TreeReference();
        treeReference.refLevel = 0;
        return treeReference;
    }

    public TreeReference() {
        this.instance = null;
        this.instanceName = null;
        this.instance = null;
        this.instanceName = null;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String str) {
        this.instanceName = str;
    }

    public FormInstance getInstance() {
        return this.instance;
    }

    public void setInstance(FormInstance formInstance) {
        this.instance = formInstance;
    }

    public int getMultiplicity(int i) {
        return ((Integer) this.multiplicity.elementAt(i)).intValue();
    }

    public String getName(int i) {
        return (String) this.names.elementAt(i);
    }

    public int getMultLast() {
        return ((Integer) this.multiplicity.lastElement()).intValue();
    }

    public String getNameLast() {
        return (String) this.names.lastElement();
    }

    public void setMultiplicity(int i, int i2) {
        this.multiplicity.setElementAt(new Integer(i2), i);
    }

    public int size() {
        return this.names.size();
    }

    public void add(String str, int i) {
        this.names.addElement(str);
        this.multiplicity.addElement(new Integer(i));
    }

    public void addPredicate(int i, Vector<XPathExpression> vector) {
        this.predicates.put(new Integer(i), vector);
    }

    public Vector<XPathExpression> getPredicate(int i) {
        return this.predicates.get(new Integer(i));
    }

    public int getRefLevel() {
        return this.refLevel;
    }

    public void setRefLevel(int i) {
        this.refLevel = i;
    }

    public void incrementRefLevel() {
        if (!isAbsolute()) {
            this.refLevel++;
        }
    }

    public boolean isAbsolute() {
        return this.refLevel == -1;
    }

    public boolean isAmbiguous() {
        for (int i = 1; i < size(); i++) {
            if (getMultiplicity(i) == -1) {
                return true;
            }
        }
        return false;
    }

    public TreeReference clone() {
        TreeReference treeReference = new TreeReference();
        treeReference.setRefLevel(this.refLevel);
        for (int i = 0; i < size(); i++) {
            treeReference.add(getName(i), getMultiplicity(i));
        }
        Enumeration<Integer> keys = this.predicates.keys();
        while (keys.hasMoreElements()) {
            Integer nextElement = keys.nextElement();
            treeReference.addPredicate(nextElement.intValue(), this.predicates.get(nextElement));
        }
        if (this.instanceName != null) {
            treeReference.setInstanceName(this.instanceName);
        }
        if (this.instance != null) {
            treeReference.setInstance(this.instance);
        }
        return treeReference;
    }

    public boolean removeLastLevel() {
        int size = size();
        if (size == 0) {
            if (isAbsolute()) {
                return false;
            }
            this.refLevel++;
            return true;
        }
        this.names.removeElementAt(size - 1);
        this.multiplicity.removeElementAt(size - 1);
        return true;
    }

    public TreeReference getParentRef() {
        TreeReference clone = clone();
        if (clone.removeLastLevel()) {
            return clone;
        }
        return null;
    }

    public TreeReference parent(TreeReference treeReference) {
        if (!isAbsolute()) {
            TreeReference clone = treeReference.clone();
            if (this.refLevel > 0) {
                if (treeReference.isAbsolute() || treeReference.size() != 0) {
                    return null;
                }
                treeReference.refLevel += this.refLevel;
            }
            for (int i = 0; i < this.names.size(); i++) {
                clone.add(getName(i), getMultiplicity(i));
            }
            return clone;
        }
        return this;
    }

    public TreeReference anchor(TreeReference treeReference) {
        if (isAbsolute()) {
            return clone();
        }
        if (!treeReference.isAbsolute()) {
            return null;
        }
        TreeReference clone = treeReference.clone();
        if (this.refLevel > treeReference.size()) {
            return null;
        }
        for (int i = 0; i < this.refLevel; i++) {
            clone.removeLastLevel();
        }
        for (int i2 = 0; i2 < size(); i2++) {
            clone.add(getName(i2), getMultiplicity(i2));
        }
        Enumeration<Integer> keys = this.predicates.keys();
        while (keys.hasMoreElements()) {
            Integer nextElement = keys.nextElement();
            clone.addPredicate(nextElement.intValue(), this.predicates.get(nextElement));
        }
        return clone;
    }

    public TreeReference contextualize(TreeReference treeReference) {
        if (!treeReference.isAbsolute()) {
            return null;
        }
        TreeReference anchor = anchor(treeReference);
        for (int i = 0; i < treeReference.size() && i < anchor.size(); i++) {
            if (NAME_WILDCARD.equals(anchor.getName(i)) && !NAME_WILDCARD.equals(treeReference.getName(i))) {
                anchor.names.setElementAt(treeReference.getName(i), i);
            }
            if (!treeReference.getName(i).equals(anchor.getName(i))) {
                break;
            }
            anchor.setMultiplicity(i, treeReference.getMultiplicity(i));
        }
        return anchor;
    }

    public TreeReference relativize(TreeReference treeReference) {
        if (treeReference.isParentOf(this, false)) {
            TreeReference selfRef = selfRef();
            for (int size = treeReference.size(); size < size(); size++) {
                selfRef.add(getName(size), -1);
            }
            return selfRef;
        }
        return null;
    }

    public TreeReference genericize() {
        TreeReference clone = clone();
        for (int i = 0; i < clone.size(); i++) {
            clone.setMultiplicity(i, -1);
        }
        return clone;
    }

    public boolean isParentOf(TreeReference treeReference, boolean z) {
        if (this.refLevel != treeReference.refLevel) {
            return false;
        }
        if (treeReference.size() < (z ? 1 : 0) + size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            if (!getName(i).equals(treeReference.getName(i))) {
                return false;
            }
            int multiplicity = getMultiplicity(i);
            int multiplicity2 = treeReference.getMultiplicity(i);
            if (multiplicity != -1 && multiplicity != multiplicity2 && (i != 0 || multiplicity != 0 || multiplicity2 != -1)) {
                return false;
            }
        }
        return true;
    }

    public TreeReference extendRef(String str, int i) {
        TreeReference clone = clone();
        clone.add(str, i);
        return clone;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TreeReference)) {
            return false;
        }
        TreeReference treeReference = (TreeReference) obj;
        if (this.refLevel != treeReference.refLevel || size() != treeReference.size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            String name = getName(i);
            String name2 = treeReference.getName(i);
            int multiplicity = getMultiplicity(i);
            int multiplicity2 = treeReference.getMultiplicity(i);
            if (!name.equals(name2)) {
                return false;
            }
            if (multiplicity != multiplicity2) {
                if (i != 0) {
                    return false;
                }
                if (multiplicity != 0 && multiplicity != -1) {
                    return false;
                }
                if (multiplicity2 != 0 && multiplicity2 != -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = new Integer(this.refLevel).hashCode();
        for (int i = 0; i < size(); i++) {
            Integer num = new Integer(getMultiplicity(i));
            if (i == 0 && num.intValue() == -1) {
                num = new Integer(0);
            }
            hashCode = (hashCode ^ getName(i).hashCode()) ^ num.hashCode();
        }
        return hashCode;
    }

    public String toString() {
        return toString(true);
    }

    public String toString(boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.instanceName != null) {
            stringBuffer.append("instance(" + this.instanceName + ")");
        }
        if (isAbsolute()) {
            stringBuffer.append("/");
        } else {
            for (int i = 0; i < this.refLevel; i++) {
                stringBuffer.append("../");
            }
        }
        for (int i2 = 0; i2 < size(); i2++) {
            String name = getName(i2);
            int multiplicity = getMultiplicity(i2);
            if (multiplicity == -4) {
                stringBuffer.append("@");
            }
            stringBuffer.append(name);
            if (z) {
                switch (multiplicity) {
                    case INDEX_REPEAT_JUNCTURE /* -10 */:
                        stringBuffer.append("[@juncture]");
                        break;
                    case -2:
                        stringBuffer.append("[@template]");
                        break;
                    case -1:
                        break;
                    default:
                        if (i2 > 0 || multiplicity != 0) {
                            stringBuffer.append("[" + (multiplicity + 1) + "]");
                            break;
                        }
                }
            }
            if (i2 < size() - 1) {
                stringBuffer.append("/");
            }
        }
        return stringBuffer.toString();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.refLevel = ExtUtil.readInt(dataInputStream);
        this.names = (Vector) ExtUtil.read(dataInputStream, new ExtWrapList(String.class), prototypeFactory);
        this.multiplicity = (Vector) ExtUtil.read(dataInputStream, new ExtWrapList(Integer.class), prototypeFactory);
        this.instanceName = (String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory);
        this.instance = (FormInstance) ExtUtil.read(dataInputStream, new ExtWrapNullable(FormInstance.class), prototypeFactory);
        Iterator it = ((Vector) ExtUtil.read(dataInputStream, new ExtWrapListPoly(), prototypeFactory)).iterator();
        while (it.hasNext()) {
            this.predicates.put((Integer) it.next(), (Vector) ExtUtil.read(dataInputStream, new ExtWrapListPoly(), prototypeFactory));
        }
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeNumeric(dataOutputStream, this.refLevel);
        ExtUtil.write(dataOutputStream, new ExtWrapList(this.names));
        ExtUtil.write(dataOutputStream, new ExtWrapList(this.multiplicity));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.instanceName));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.instance));
        Vector vector = new Vector();
        Enumeration<Integer> keys = this.predicates.keys();
        while (keys.hasMoreElements()) {
            vector.addElement(keys.nextElement());
        }
        ExtUtil.write(dataOutputStream, new ExtWrapListPoly(vector));
        Enumeration<Integer> keys2 = this.predicates.keys();
        while (keys2.hasMoreElements()) {
            ExtUtil.write(dataOutputStream, new ExtWrapListPoly(this.predicates.get(keys2.nextElement())));
        }
    }

    public TreeReference intersect(TreeReference treeReference) {
        TreeReference clone;
        TreeReference clone2;
        if (!isAbsolute() || !treeReference.isAbsolute()) {
            return rootRef();
        }
        if (!equals(treeReference)) {
            if (size() < treeReference.size()) {
                clone = treeReference.clone();
                clone2 = clone();
            } else {
                clone = clone();
                clone2 = treeReference.clone();
            }
            int size = clone.size() - clone2.size();
            for (int i = 0; i < size; i++) {
                clone.removeLastLevel();
            }
            int size2 = clone.size();
            for (int i2 = 0; i2 <= size2; i2++) {
                if (clone.equals(clone2)) {
                    return clone;
                }
                if (clone.size() == 0) {
                    return rootRef();
                }
                if (!clone.removeLastLevel() || !clone2.removeLastLevel()) {
                    throw new RuntimeException("Dug too deply into TreeReference during intersection");
                }
            }
            throw new RuntimeException("Impossible state");
        }
        return this;
    }

    public TreeReference getSubReference(int i) {
        if (!isAbsolute()) {
            throw new IllegalArgumentException("Cannot subreference a non-absolute ref");
        }
        TreeReference treeReference = new TreeReference();
        treeReference.setRefLevel(this.refLevel);
        for (int i2 = 0; i2 <= i; i2++) {
            treeReference.add(getName(i2), getMultiplicity(i2));
        }
        Enumeration<Integer> keys = this.predicates.keys();
        while (keys.hasMoreElements()) {
            Integer nextElement = keys.nextElement();
            treeReference.addPredicate(nextElement.intValue(), this.predicates.get(nextElement));
        }
        if (this.instanceName != null) {
            treeReference.setInstanceName(this.instanceName);
        }
        if (this.instance != null) {
            treeReference.setInstance(this.instance);
        }
        return treeReference;
    }
}
