package org.javarosa.core.util;

import java.util.Enumeration;
import java.util.Vector;
/* loaded from: classes.dex */
public class Map {
    Vector keys = new Vector();
    Vector elements = new Vector();

    public void put(Object obj, Object obj2) {
        if (containsKey(obj)) {
            remove(obj);
        }
        this.keys.addElement(obj);
        this.elements.addElement(obj2);
    }

    public Enumeration keys() {
        return this.keys.elements();
    }

    public int size() {
        return this.keys.size();
    }

    public Object get(Object obj) {
        int index = getIndex(obj);
        if (index == -1) {
            return null;
        }
        return this.elements.elementAt(index);
    }

    public void remove(Object obj) {
        int index = getIndex(obj);
        if (index != -1) {
            this.keys.removeElementAt(index);
            this.elements.removeElementAt(index);
            if (this.keys.size() != this.elements.size()) {
            }
        }
    }

    public void clear() {
        this.keys.removeAllElements();
        this.elements.removeAllElements();
    }

    public boolean containsKey(Object obj) {
        return getIndex(obj) != -1;
    }

    private int getIndex(Object obj) {
        for (int i = 0; i < this.keys.size(); i++) {
            if (this.keys.elementAt(i).equals(obj)) {
                return i;
            }
        }
        return -1;
    }
}
