package org.commonmark.node;
/* loaded from: classes2.dex */
public abstract class CustomNode extends Node {
    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
