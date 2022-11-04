package org.javarosa.core.model;

import org.javarosa.core.model.instance.TreeElement;
/* loaded from: classes.dex */
public interface FormElementStateListener {
    public static final int CHANGE_DATA = 1;
    public static final int CHANGE_ENABLED = 4;
    public static final int CHANGE_INIT = 0;
    public static final int CHANGE_LOCALE = 2;
    public static final int CHANGE_OTHER = 64;
    public static final int CHANGE_RELEVANT = 8;
    public static final int CHANGE_REQUIRED = 16;

    void formElementStateChanged(IFormElement iFormElement, int i);

    void formElementStateChanged(TreeElement treeElement, int i);
}
