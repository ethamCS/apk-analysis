package org.commonmark.ext.gfm.tables;

import org.commonmark.node.CustomNode;
/* loaded from: classes2.dex */
public class TableCell extends CustomNode {
    private Alignment alignment;
    private boolean header;

    /* loaded from: classes2.dex */
    public enum Alignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public boolean isHeader() {
        return this.header;
    }

    public void setHeader(boolean z) {
        this.header = z;
    }

    public Alignment getAlignment() {
        return this.alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }
}
