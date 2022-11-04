package org.javarosa.core.model.instance.utils;

import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.model.utils.IInstanceVisitor;
/* loaded from: classes.dex */
public interface ITreeVisitor extends IInstanceVisitor {
    @Override // org.javarosa.core.model.utils.IInstanceVisitor
    void visit(FormInstance formInstance);

    void visit(TreeElement treeElement);
}
