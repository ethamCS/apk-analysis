package org.javarosa.core.model;

import java.util.Vector;
import org.javarosa.core.model.instance.TreeReference;
/* loaded from: classes.dex */
public class FormIndex {
    private boolean beginningOfForm;
    private boolean endOfForm;
    private int instanceIndex;
    private int localIndex;
    private FormIndex nextLevel;
    private TreeReference reference;

    public static FormIndex createBeginningOfFormIndex() {
        FormIndex formIndex = new FormIndex(-1, (TreeReference) null);
        formIndex.beginningOfForm = true;
        return formIndex;
    }

    public static FormIndex createEndOfFormIndex() {
        FormIndex formIndex = new FormIndex(-1, (TreeReference) null);
        formIndex.endOfForm = true;
        return formIndex;
    }

    public FormIndex(int i, TreeReference treeReference) {
        this.beginningOfForm = false;
        this.endOfForm = false;
        this.instanceIndex = -1;
        this.localIndex = i;
        this.reference = treeReference;
    }

    public FormIndex(int i, int i2, TreeReference treeReference) {
        this.beginningOfForm = false;
        this.endOfForm = false;
        this.instanceIndex = -1;
        this.localIndex = i;
        this.instanceIndex = i2;
        this.reference = treeReference;
    }

    public FormIndex(FormIndex formIndex, int i, TreeReference treeReference) {
        this(i, treeReference);
        this.nextLevel = formIndex;
    }

    public FormIndex(FormIndex formIndex, FormIndex formIndex2) {
        this.beginningOfForm = false;
        this.endOfForm = false;
        this.instanceIndex = -1;
        if (formIndex2 == null) {
            this.nextLevel = formIndex.nextLevel;
            this.localIndex = formIndex.localIndex;
            this.instanceIndex = formIndex.instanceIndex;
            this.reference = formIndex.reference;
            return;
        }
        this.nextLevel = formIndex;
        this.localIndex = formIndex2.getLocalIndex();
        this.instanceIndex = formIndex2.getInstanceIndex();
        this.reference = formIndex2.reference;
    }

    public FormIndex(FormIndex formIndex, int i, int i2, TreeReference treeReference) {
        this(formIndex, i, treeReference);
        this.instanceIndex = i2;
    }

    public boolean isInForm() {
        return !this.beginningOfForm && !this.endOfForm;
    }

    public int getLocalIndex() {
        return this.localIndex;
    }

    public int getInstanceIndex() {
        return this.instanceIndex;
    }

    public int getElementMultiplicity() {
        return getTerminal().instanceIndex;
    }

    public FormIndex getNextLevel() {
        return this.nextLevel;
    }

    public TreeReference getLocalReference() {
        return this.reference;
    }

    public TreeReference getReference() {
        return getTerminal().reference;
    }

    public FormIndex getTerminal() {
        while (this.nextLevel != null) {
            this = this.nextLevel;
        }
        return this;
    }

    public boolean isTerminal() {
        return this.nextLevel == null;
    }

    public boolean isEndOfFormIndex() {
        return this.endOfForm;
    }

    public boolean isBeginningOfFormIndex() {
        return this.beginningOfForm;
    }

    public boolean equals(Object obj) {
        return (obj instanceof FormIndex) && compareTo((FormIndex) obj) == 0;
    }

    public int compareTo(Object obj) {
        int i = 0;
        if (!(obj instanceof FormIndex)) {
            throw new IllegalArgumentException("Attempt to compare Object of type " + obj.getClass().getName() + " to a FormIndex");
        }
        FormIndex formIndex = (FormIndex) obj;
        if (this.beginningOfForm) {
            if (!formIndex.beginningOfForm) {
                i = -1;
            }
            return i;
        } else if (this.endOfForm) {
            if (!formIndex.endOfForm) {
                i = 1;
            }
            return i;
        } else if (formIndex.beginningOfForm) {
            return 1;
        } else {
            if (formIndex.endOfForm) {
                return -1;
            }
            if (this.localIndex != formIndex.localIndex) {
                return this.localIndex >= formIndex.localIndex ? 1 : -1;
            } else if (this.instanceIndex != formIndex.instanceIndex) {
                return this.instanceIndex >= formIndex.instanceIndex ? 1 : -1;
            } else {
                if ((getNextLevel() == null) != (formIndex.getNextLevel() == null)) {
                    return getNextLevel() != null ? 1 : -1;
                } else if (getNextLevel() == null) {
                    return 0;
                } else {
                    return getNextLevel().compareTo(formIndex.getNextLevel());
                }
            }
        }
    }

    public FormIndex snip() {
        return new FormIndex(this.localIndex, this.instanceIndex, this.reference);
    }

    public FormIndex diff(FormIndex formIndex) {
        if (formIndex != null) {
            if (isSubIndex(this, formIndex) && !formIndex.equals(this)) {
                return new FormIndex(this.nextLevel.diff(formIndex), snip());
            }
            return null;
        }
        return this;
    }

    public String toString() {
        String str = "";
        while (this != null) {
            str = (str + this.getLocalIndex()) + (this.getInstanceIndex() == -1 ? ", " : "_" + this.getInstanceIndex() + ", ");
            this = this.nextLevel;
        }
        return str;
    }

    public int getDepth() {
        int i = 0;
        while (this != null) {
            this = this.nextLevel;
            i++;
        }
        return i;
    }

    public static FormIndex trimNegativeIndices(FormIndex formIndex) {
        if (!formIndex.isTerminal()) {
            return new FormIndex(trimNegativeIndices(formIndex.nextLevel), formIndex);
        }
        if (formIndex.getLocalIndex() < 0) {
            return null;
        }
        return formIndex;
    }

    public static boolean isSubIndex(FormIndex formIndex, FormIndex formIndex2) {
        if (formIndex2.equals(formIndex)) {
            return true;
        }
        if (formIndex == null) {
            return false;
        }
        return isSubIndex(formIndex.nextLevel, formIndex2);
    }

    public static boolean isSubElement(FormIndex formIndex, FormIndex formIndex2) {
        while (!formIndex.isTerminal() && !formIndex2.isTerminal()) {
            if (formIndex.getLocalIndex() != formIndex2.getLocalIndex() || formIndex.getInstanceIndex() != formIndex2.getInstanceIndex()) {
                return false;
            }
            formIndex = formIndex.nextLevel;
            formIndex2 = formIndex2.nextLevel;
        }
        if ((formIndex.isTerminal() || !formIndex2.isTerminal()) && formIndex.getLocalIndex() == formIndex2.getLocalIndex()) {
            return formIndex.getInstanceIndex() == -1 || formIndex.getInstanceIndex() == formIndex2.getInstanceIndex();
        }
        return false;
    }

    public void assignRefs(FormDef formDef) {
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        formDef.collapseIndex(this, vector, vector2, vector3);
        Vector vector4 = new Vector();
        Vector vector5 = new Vector();
        int i = 0;
        while (this != null) {
            vector4.addElement(vector2.elementAt(i));
            vector5.addElement(vector3.elementAt(i));
            this.reference = formDef.getChildInstanceRef(vector5, vector4);
            this = this.getNextLevel();
            i++;
        }
    }
}
