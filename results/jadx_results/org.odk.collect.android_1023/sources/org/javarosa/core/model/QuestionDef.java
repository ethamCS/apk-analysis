package org.javarosa.core.model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.model.utils.DateUtils;
import org.javarosa.core.services.locale.Localizable;
import org.javarosa.core.services.locale.Localizer;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapList;
import org.javarosa.core.util.externalizable.ExtWrapNullable;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.ExternalizableWrapper;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class QuestionDef implements IFormElement, Localizable {
    private Vector<TreeElement> additionalAttributes;
    private String appearanceAttr;
    private IDataReference binding;
    private Vector<SelectChoice> choices;
    private int controlType;
    private ItemsetBinding dynamicChoices;
    private String helpInnerText;
    private String helpText;
    private String helpTextID;
    private int id;
    private String labelInnerText;
    Vector observers;
    private String textID;

    public QuestionDef() {
        this(-1, 1);
    }

    public QuestionDef(int i, int i2) {
        this.additionalAttributes = new Vector<>();
        setID(i);
        setControlType(i2);
        this.observers = new Vector();
    }

    @Override // org.javarosa.core.model.IFormElement, org.javarosa.core.services.storage.Persistable
    public int getID() {
        return this.id;
    }

    @Override // org.javarosa.core.model.IFormElement, org.javarosa.core.services.storage.Persistable
    public void setID(int i) {
        this.id = i;
    }

    @Override // org.javarosa.core.model.IFormElement
    public IDataReference getBind() {
        return this.binding;
    }

    public void setBind(IDataReference iDataReference) {
        this.binding = iDataReference;
    }

    public int getControlType() {
        return this.controlType;
    }

    public void setControlType(int i) {
        this.controlType = i;
    }

    @Override // org.javarosa.core.model.IFormElement
    public String getAppearanceAttr() {
        return this.appearanceAttr;
    }

    @Override // org.javarosa.core.model.IFormElement
    public void setAppearanceAttr(String str) {
        this.appearanceAttr = str;
    }

    public String getHelpText() {
        return this.helpText;
    }

    public void setHelpText(String str) {
        this.helpText = str;
    }

    @Override // org.javarosa.core.model.IFormElement
    public void setAdditionalAttribute(String str, String str2, String str3) {
        TreeElement.setAttribute(null, this.additionalAttributes, str, str2, str3);
    }

    @Override // org.javarosa.core.model.IFormElement
    public String getAdditionalAttribute(String str, String str2) {
        TreeElement attribute = TreeElement.getAttribute(this.additionalAttributes, str, str2);
        if (attribute != null) {
            return attribute.getAttributeValue();
        }
        return null;
    }

    @Override // org.javarosa.core.model.IFormElement
    public Vector<TreeElement> getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    public String getHelpTextID() {
        return this.helpTextID;
    }

    public void setHelpTextID(String str) {
        this.helpTextID = str;
    }

    public void addSelectChoice(SelectChoice selectChoice) {
        if (this.choices == null) {
            this.choices = new Vector<>();
        }
        selectChoice.setIndex(this.choices.size());
        this.choices.addElement(selectChoice);
    }

    public void removeSelectChoice(SelectChoice selectChoice) {
        if (this.choices == null) {
            selectChoice.setIndex(0);
        } else if (this.choices.contains(selectChoice)) {
            this.choices.removeElement(selectChoice);
        }
    }

    public void removeAllSelectChoices() {
        if (this.choices != null) {
            this.choices.removeAllElements();
        }
    }

    public Vector<SelectChoice> getChoices() {
        return this.choices;
    }

    public SelectChoice getChoice(int i) {
        return this.choices.elementAt(i);
    }

    public int getNumChoices() {
        if (this.choices != null) {
            return this.choices.size();
        }
        return 0;
    }

    public SelectChoice getChoiceForValue(String str) {
        for (int i = 0; i < getNumChoices(); i++) {
            if (getChoice(i).getValue().equals(str)) {
                return getChoice(i);
            }
        }
        return null;
    }

    public ItemsetBinding getDynamicChoices() {
        return this.dynamicChoices;
    }

    public void setDynamicChoices(ItemsetBinding itemsetBinding) {
        if (itemsetBinding != null) {
            itemsetBinding.setDestRef(this);
        }
        this.dynamicChoices = itemsetBinding;
    }

    public boolean isComplex() {
        return this.dynamicChoices != null && this.dynamicChoices.copyMode;
    }

    @Override // org.javarosa.core.services.locale.Localizable
    public void localeChanged(String str, Localizer localizer) {
        if (this.choices != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.choices.size()) {
                    break;
                }
                this.choices.elementAt(i2).localeChanged(null, localizer);
                i = i2 + 1;
            }
        }
        if (this.dynamicChoices != null) {
            this.dynamicChoices.localeChanged(str, localizer);
        }
        alertStateObservers(2);
    }

    @Override // org.javarosa.core.model.IFormElement
    public Vector getChildren() {
        return null;
    }

    @Override // org.javarosa.core.model.IFormElement
    public void setChildren(Vector vector) {
        throw new IllegalStateException();
    }

    @Override // org.javarosa.core.model.IFormElement
    public void addChild(IFormElement iFormElement) {
        throw new IllegalStateException();
    }

    @Override // org.javarosa.core.model.IFormElement
    public IFormElement getChild(int i) {
        return null;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        setID(ExtUtil.readInt(dataInputStream));
        this.binding = (IDataReference) ExtUtil.read(dataInputStream, new ExtWrapNullable((ExternalizableWrapper) new ExtWrapTagged()), prototypeFactory);
        setAppearanceAttr((String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory));
        setTextID((String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory));
        setLabelInnerText((String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory));
        setHelpText((String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory));
        setHelpTextID((String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory));
        setHelpInnerText((String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory));
        setControlType(ExtUtil.readInt(dataInputStream));
        this.additionalAttributes = ExtUtil.readAttributes(dataInputStream, null);
        this.choices = ExtUtil.nullIfEmpty((Vector) ExtUtil.read(dataInputStream, new ExtWrapList(SelectChoice.class), prototypeFactory));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < getNumChoices()) {
                this.choices.elementAt(i2).setIndex(i2);
                i = i2 + 1;
            } else {
                setDynamicChoices((ItemsetBinding) ExtUtil.read(dataInputStream, new ExtWrapNullable(ItemsetBinding.class)));
                return;
            }
        }
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeNumeric(dataOutputStream, getID());
        ExtUtil.write(dataOutputStream, new ExtWrapNullable((ExternalizableWrapper) (this.binding == null ? null : new ExtWrapTagged(this.binding))));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(getAppearanceAttr()));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(getTextID()));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(getLabelInnerText()));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(getHelpText()));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(getHelpTextID()));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(getHelpInnerText()));
        ExtUtil.writeNumeric(dataOutputStream, getControlType());
        ExtUtil.writeAttributes(dataOutputStream, this.additionalAttributes);
        ExtUtil.write(dataOutputStream, new ExtWrapList(ExtUtil.emptyIfNull(this.choices)));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.dynamicChoices));
    }

    @Override // org.javarosa.core.model.IFormElement
    public void registerStateObserver(FormElementStateListener formElementStateListener) {
        if (!this.observers.contains(formElementStateListener)) {
            this.observers.addElement(formElementStateListener);
        }
    }

    @Override // org.javarosa.core.model.IFormElement
    public void unregisterStateObserver(FormElementStateListener formElementStateListener) {
        this.observers.removeElement(formElementStateListener);
    }

    public void unregisterAll() {
        this.observers.removeAllElements();
    }

    public void alertStateObservers(int i) {
        Enumeration elements = this.observers.elements();
        while (elements.hasMoreElements()) {
            ((FormElementStateListener) elements.nextElement()).formElementStateChanged(this, i);
        }
    }

    @Override // org.javarosa.core.model.IFormElement
    public int getDeepChildCount() {
        return 1;
    }

    public void setLabelInnerText(String str) {
        this.labelInnerText = str;
    }

    @Override // org.javarosa.core.model.IFormElement
    public String getLabelInnerText() {
        return this.labelInnerText;
    }

    public void setHelpInnerText(String str) {
        this.helpInnerText = str;
    }

    public String getHelpInnerText() {
        return this.helpInnerText;
    }

    @Override // org.javarosa.core.model.IFormElement
    public String getTextID() {
        return this.textID;
    }

    @Override // org.javarosa.core.model.IFormElement
    public void setTextID(String str) {
        if (DateUtils.stringContains(str, ";")) {
            System.err.println("Warning: TextID contains ;form modifier:: \"" + str.substring(str.indexOf(";")) + "\"... will be stripped.");
            str = str.substring(0, str.indexOf(";"));
        }
        this.textID = str;
    }
}
