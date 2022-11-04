package com.androidplot.util;

import java.util.List;
/* loaded from: classes2.dex */
public class LayerListOrganizer<ElementType> implements Layerable<ElementType> {
    private static final int ONE = 1;
    private static final int ZERO = 0;
    private List<ElementType> list;

    public LayerListOrganizer(List<ElementType> list) {
        this.list = list;
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveToTop(ElementType elementtype) {
        if (this.list.remove(elementtype)) {
            List<ElementType> list = this.list;
            list.add(list.size(), elementtype);
            return true;
        }
        return false;
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveAbove(ElementType elementtype, ElementType elementtype2) {
        if (elementtype == elementtype2) {
            throw new IllegalArgumentException("Illegal argument to moveAbove(A, B); A cannot be equal to B.");
        }
        this.list.remove(elementtype);
        this.list.add(this.list.indexOf(elementtype2) + 1, elementtype);
        return true;
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveBeneath(ElementType elementtype, ElementType elementtype2) {
        if (elementtype == elementtype2) {
            throw new IllegalArgumentException("Illegal argument to moveBeaneath(A, B); A cannot be equal to B.");
        }
        this.list.remove(elementtype);
        this.list.add(this.list.indexOf(elementtype2), elementtype);
        return true;
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveToBottom(ElementType elementtype) {
        this.list.remove(elementtype);
        this.list.add(0, elementtype);
        return true;
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveUp(ElementType elementtype) {
        int indexOf = this.list.indexOf(elementtype);
        if (indexOf == -1) {
            return false;
        }
        if (indexOf < this.list.size() - 1) {
            return moveAbove(elementtype, this.list.get(indexOf + 1));
        }
        return true;
    }

    @Override // com.androidplot.util.Layerable
    public boolean moveDown(ElementType elementtype) {
        int indexOf = this.list.indexOf(elementtype);
        if (indexOf == -1) {
            return false;
        }
        if (indexOf > 0) {
            return moveBeneath(elementtype, this.list.get(indexOf - 1));
        }
        return true;
    }

    @Override // com.androidplot.util.Layerable
    public List<ElementType> elements() {
        return this.list;
    }

    public void addToBottom(ElementType elementtype) {
        this.list.add(0, elementtype);
    }

    public void addToTop(ElementType elementtype) {
        List<ElementType> list = this.list;
        list.add(list.size(), elementtype);
    }
}
