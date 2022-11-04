package org.commonmark.node;
/* loaded from: classes2.dex */
public class Heading extends Block {
    private int level;

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int i) {
        this.level = i;
    }
}
