package org.javarosa.core.model.utils;

import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.instance.TreeElement;
/* loaded from: classes.dex */
public interface IPreloadHandler {
    boolean handlePostProcess(TreeElement treeElement, String str);

    IAnswerData handlePreload(String str);

    String preloadHandled();
}
