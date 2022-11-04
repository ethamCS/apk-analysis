package org.commonmark.node;
/* loaded from: classes2.dex */
public abstract class ListBlock extends Block {
    private boolean tight;

    public boolean isTight() {
        return this.tight;
    }

    public void setTight(boolean z) {
        this.tight = z;
    }
}
