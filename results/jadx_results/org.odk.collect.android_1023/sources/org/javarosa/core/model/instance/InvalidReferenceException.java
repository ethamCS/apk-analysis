package org.javarosa.core.model.instance;
/* loaded from: classes.dex */
public class InvalidReferenceException extends Exception {
    TreeReference invalid;

    public InvalidReferenceException(String str, TreeReference treeReference) {
        super(str);
        this.invalid = treeReference;
    }

    public TreeReference getInvalidReference() {
        return this.invalid;
    }
}
