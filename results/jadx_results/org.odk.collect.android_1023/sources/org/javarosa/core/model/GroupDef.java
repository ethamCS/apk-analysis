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
import org.javarosa.core.util.externalizable.ExtWrapListPoly;
import org.javarosa.core.util.externalizable.ExtWrapNullable;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.ExternalizableWrapper;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class GroupDef implements IFormElement, Localizable {
    public String addCaption;
    public String addEmptyCaption;
    private Vector<TreeElement> additionalAttributes;
    private String appearanceAttr;
    private IDataReference binding;
    private Vector children;
    public String chooseCaption;
    public IDataReference count;
    public String delCaption;
    public String delHeader;
    public String doneCaption;
    public String doneEmptyCaption;
    public String entryHeader;
    private int id;
    private String labelInnerText;
    public String mainHeader;
    public boolean noAddRemove;
    Vector observers;
    private boolean repeat;
    private String textID;

    public GroupDef() {
        this(-1, null, false);
    }

    public GroupDef(int i, Vector vector, boolean z) {
        this.additionalAttributes = new Vector<>();
        this.noAddRemove = false;
        this.count = null;
        setID(i);
        setChildren(vector);
        setRepeat(z);
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

    @Override // org.javarosa.core.model.IFormElement
    public Vector getChildren() {
        return this.children;
    }

    @Override // org.javarosa.core.model.IFormElement
    public void setChildren(Vector vector) {
        if (vector == null) {
            vector = new Vector();
        }
        this.children = vector;
    }

    @Override // org.javarosa.core.model.IFormElement
    public void addChild(IFormElement iFormElement) {
        this.children.addElement(iFormElement);
    }

    @Override // org.javarosa.core.model.IFormElement
    public IFormElement getChild(int i) {
        if (this.children == null || i >= this.children.size()) {
            return null;
        }
        return (IFormElement) this.children.elementAt(i);
    }

    public boolean getRepeat() {
        return this.repeat;
    }

    public void setRepeat(boolean z) {
        this.repeat = z;
    }

    @Override // org.javarosa.core.model.IFormElement
    public String getLabelInnerText() {
        return this.labelInnerText;
    }

    public void setLabelInnerText(String str) {
        this.labelInnerText = str;
    }

    @Override // org.javarosa.core.model.IFormElement
    public String getAppearanceAttr() {
        return this.appearanceAttr;
    }

    @Override // org.javarosa.core.model.IFormElement
    public void setAppearanceAttr(String str) {
        this.appearanceAttr = str;
    }

    @Override // org.javarosa.core.services.locale.Localizable
    public void localeChanged(String str, Localizer localizer) {
        Enumeration elements = this.children.elements();
        while (elements.hasMoreElements()) {
            ((IFormElement) elements.nextElement()).localeChanged(str, localizer);
        }
    }

    public IDataReference getCountReference() {
        return this.count;
    }

    public String toString() {
        return "<group>";
    }

    @Override // org.javarosa.core.model.IFormElement
    public int getDeepChildCount() {
        int i = 0;
        Enumeration elements = this.children.elements();
        while (true) {
            int i2 = i;
            if (elements.hasMoreElements()) {
                i = ((IFormElement) elements.nextElement()).getDeepChildCount() + i2;
            } else {
                return i2;
            }
        }
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        setID(ExtUtil.readInt(dataInputStream));
        setAppearanceAttr((String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory));
        setBind((IDataReference) ExtUtil.read(dataInputStream, new ExtWrapTagged(), prototypeFactory));
        setTextID((String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory));
        setLabelInnerText((String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory));
        setRepeat(ExtUtil.readBool(dataInputStream));
        setChildren((Vector) ExtUtil.read(dataInputStream, new ExtWrapListPoly(), prototypeFactory));
        this.noAddRemove = ExtUtil.readBool(dataInputStream);
        this.count = (IDataReference) ExtUtil.read(dataInputStream, new ExtWrapNullable((ExternalizableWrapper) new ExtWrapTagged()), prototypeFactory);
        this.chooseCaption = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.addCaption = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.delCaption = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.doneCaption = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.addEmptyCaption = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.doneEmptyCaption = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.entryHeader = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.delHeader = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.mainHeader = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.additionalAttributes = ExtUtil.readAttributes(dataInputStream, null);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeNumeric(dataOutputStream, getID());
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(getAppearanceAttr()));
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(getBind()));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(getTextID()));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(getLabelInnerText()));
        ExtUtil.writeBool(dataOutputStream, getRepeat());
        ExtUtil.write(dataOutputStream, new ExtWrapListPoly(getChildren()));
        ExtUtil.writeBool(dataOutputStream, this.noAddRemove);
        ExtUtil.write(dataOutputStream, new ExtWrapNullable((ExternalizableWrapper) (this.count != null ? new ExtWrapTagged(this.count) : null)));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.chooseCaption));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.addCaption));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.delCaption));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.doneCaption));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.addEmptyCaption));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.doneEmptyCaption));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.entryHeader));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.delHeader));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.mainHeader));
        ExtUtil.writeAttributes(dataOutputStream, this.additionalAttributes);
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

    @Override // org.javarosa.core.model.IFormElement
    public String getTextID() {
        return this.textID;
    }

    @Override // org.javarosa.core.model.IFormElement
    public void setTextID(String str) {
        if (str == null) {
            this.textID = null;
            return;
        }
        if (DateUtils.stringContains(str, ";")) {
            System.err.println("Warning: TextID contains ;form modifier:: \"" + str.substring(str.indexOf(";")) + "\"... will be stripped.");
            str = str.substring(0, str.indexOf(";"));
        }
        this.textID = str;
    }
}
