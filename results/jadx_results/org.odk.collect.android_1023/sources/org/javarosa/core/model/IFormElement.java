package org.javarosa.core.model;

import java.util.Vector;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.services.locale.Localizable;
import org.javarosa.core.util.externalizable.Externalizable;
/* loaded from: classes.dex */
public interface IFormElement extends Localizable, Externalizable {
    void addChild(IFormElement iFormElement);

    String getAdditionalAttribute(String str, String str2);

    Vector<TreeElement> getAdditionalAttributes();

    String getAppearanceAttr();

    IDataReference getBind();

    IFormElement getChild(int i);

    Vector<IFormElement> getChildren();

    int getDeepChildCount();

    int getID();

    String getLabelInnerText();

    String getTextID();

    void registerStateObserver(FormElementStateListener formElementStateListener);

    void setAdditionalAttribute(String str, String str2, String str3);

    void setAppearanceAttr(String str);

    void setChildren(Vector<IFormElement> vector);

    void setID(int i);

    void setTextID(String str);

    void unregisterStateObserver(FormElementStateListener formElementStateListener);
}
