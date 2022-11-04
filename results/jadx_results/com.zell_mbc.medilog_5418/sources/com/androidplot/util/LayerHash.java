package com.androidplot.util;

import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class LayerHash<KeyType, ValueType> implements Layerable<KeyType> {
    private HashMap<KeyType, ValueType> hash = new HashMap<>();
    private LinkedLayerList<KeyType> zlist = new LinkedLayerList<>();

    public int size() {
        return this.zlist.size();
    }

    public ValueType get(KeyType keytype) {
        return this.hash.get(keytype);
    }

    public List<KeyType> getKeysAsList() {
        return this.zlist;
    }

    public synchronized void addToTop(KeyType keytype, ValueType valuetype) {
        if (this.hash.containsKey(keytype)) {
            this.hash.put(keytype, valuetype);
        } else {
            this.hash.put(keytype, valuetype);
            this.zlist.addToTop(keytype);
        }
    }

    public synchronized void addToBottom(KeyType keytype, ValueType valuetype) {
        if (this.hash.containsKey(keytype)) {
            this.hash.put(keytype, valuetype);
        } else {
            this.hash.put(keytype, valuetype);
            this.zlist.addToBottom(keytype);
        }
    }

    @Override // com.androidplot.util.Layerable
    public synchronized boolean moveToTop(KeyType keytype) {
        if (!this.hash.containsKey(keytype)) {
            return false;
        }
        return this.zlist.moveToTop(keytype);
    }

    @Override // com.androidplot.util.Layerable
    public synchronized boolean moveAbove(KeyType keytype, KeyType keytype2) {
        if (keytype == keytype2) {
            throw new IllegalArgumentException("Illegal argument to moveAbove(A, B); A cannot be equal to B.");
        }
        if (this.hash.containsKey(keytype2) && this.hash.containsKey(keytype)) {
            return this.zlist.moveAbove(keytype, keytype2);
        }
        return false;
    }

    @Override // com.androidplot.util.Layerable
    public synchronized boolean moveBeneath(KeyType keytype, KeyType keytype2) {
        if (keytype == keytype2) {
            throw new IllegalArgumentException("Illegal argument to moveBeaneath(A, B); A cannot be equal to B.");
        }
        if (this.hash.containsKey(keytype2) && this.hash.containsKey(keytype)) {
            return this.zlist.moveBeneath(keytype, keytype2);
        }
        return false;
    }

    @Override // com.androidplot.util.Layerable
    public synchronized boolean moveToBottom(KeyType keytype) {
        if (!this.hash.containsKey(keytype)) {
            return false;
        }
        return this.zlist.moveToBottom(keytype);
    }

    @Override // com.androidplot.util.Layerable
    public synchronized boolean moveUp(KeyType keytype) {
        if (!this.hash.containsKey(keytype)) {
            return false;
        }
        return this.zlist.moveUp(keytype);
    }

    @Override // com.androidplot.util.Layerable
    public synchronized boolean moveDown(KeyType keytype) {
        if (!this.hash.containsKey(keytype)) {
            return false;
        }
        return this.zlist.moveDown(keytype);
    }

    @Override // com.androidplot.util.Layerable
    public List<KeyType> elements() {
        return this.zlist;
    }

    public List<KeyType> keys() {
        return elements();
    }

    public synchronized boolean remove(KeyType keytype) {
        if (this.hash.containsKey(keytype)) {
            this.hash.remove(keytype);
            this.zlist.remove(keytype);
            return true;
        }
        return false;
    }

    public ValueType getTop() {
        return this.hash.get(this.zlist.getLast());
    }

    public ValueType getBottom() {
        return this.hash.get(this.zlist.getFirst());
    }

    public ValueType getAbove(KeyType keytype) {
        int indexOf = this.zlist.indexOf(keytype);
        if (indexOf < 0 || indexOf >= size() - 1) {
            return null;
        }
        return this.hash.get(this.zlist.get(indexOf + 1));
    }

    public ValueType getBeneath(KeyType keytype) {
        int indexOf = this.zlist.indexOf(keytype);
        if (indexOf > 0) {
            return this.hash.get(this.zlist.get(indexOf - 1));
        }
        return null;
    }
}
