package com.androidplot.util;

import java.util.List;
/* loaded from: classes2.dex */
public interface Layerable<ElementType> {
    List<ElementType> elements();

    boolean moveAbove(ElementType elementtype, ElementType elementtype2);

    boolean moveBeneath(ElementType elementtype, ElementType elementtype2);

    boolean moveDown(ElementType elementtype);

    boolean moveToBottom(ElementType elementtype);

    boolean moveToTop(ElementType elementtype);

    boolean moveUp(ElementType elementtype);
}
