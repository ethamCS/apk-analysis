package org.javarosa.core.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
/* loaded from: classes.dex */
public class OrderedHashtable extends Hashtable {
    private Vector orderedKeys;

    public OrderedHashtable() {
        this.orderedKeys = new Vector();
    }

    public OrderedHashtable(int i) {
        super(i);
        this.orderedKeys = new Vector(i);
    }

    @Override // java.util.Hashtable, java.util.Map
    public void clear() {
        this.orderedKeys.removeAllElements();
        super.clear();
    }

    public Object elementAt(int i) {
        return get(keyAt(i));
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration elements() {
        Vector vector = new Vector();
        for (int i = 0; i < size(); i++) {
            vector.addElement(elementAt(i));
        }
        return vector.elements();
    }

    public int indexOfKey(Object obj) {
        return this.orderedKeys.indexOf(obj);
    }

    public Object keyAt(int i) {
        return this.orderedKeys.elementAt(i);
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration keys() {
        return this.orderedKeys.elements();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException();
        }
        int indexOf = this.orderedKeys.indexOf(obj);
        if (indexOf == -1) {
            this.orderedKeys.addElement(obj);
        } else {
            this.orderedKeys.setElementAt(obj, indexOf);
        }
        return super.put(obj, obj2);
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object remove(Object obj) {
        this.orderedKeys.removeElement(obj);
        return super.remove(obj);
    }

    public void removeAt(int i) {
        remove(keyAt(i));
        this.orderedKeys.removeElementAt(i);
    }

    @Override // java.util.Hashtable
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        Enumeration keys = keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            stringBuffer.append(nextElement.toString());
            stringBuffer.append(" => ");
            stringBuffer.append(get(nextElement).toString());
            if (keys.hasMoreElements()) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
