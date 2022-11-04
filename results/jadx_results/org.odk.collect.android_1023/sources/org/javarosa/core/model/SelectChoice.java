package org.javarosa.core.model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.services.locale.Localizable;
import org.javarosa.core.services.locale.Localizer;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.xform.parse.XFormParseException;
/* loaded from: classes.dex */
public class SelectChoice implements Externalizable, Localizable {
    public TreeElement copyNode;
    private int index;
    private boolean isLocalizable;
    private String labelInnerText;
    private String textID;
    private String value;

    public SelectChoice() {
        this.index = -1;
    }

    public SelectChoice(String str, String str2) {
        this(str, null, str2, true);
    }

    public SelectChoice(String str, String str2, String str3, boolean z) {
        this.index = -1;
        this.isLocalizable = z;
        this.textID = str;
        this.labelInnerText = str2;
        if (str3 != null) {
            this.value = str3;
            return;
        }
        throw new XFormParseException("SelectChoice{id,innerText}:{" + str + "," + str2 + "}, has null Value!");
    }

    public SelectChoice(String str, String str2, boolean z) {
        this(z ? str : null, z ? null : str, str2, z);
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public String getLabelInnerText() {
        return this.labelInnerText;
    }

    public String getValue() {
        return this.value;
    }

    public int getIndex() {
        if (this.index == -1) {
            throw new RuntimeException("trying to access choice index before it has been set!");
        }
        return this.index;
    }

    @Override // org.javarosa.core.services.locale.Localizable
    public void localeChanged(String str, Localizer localizer) {
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.isLocalizable = ExtUtil.readBool(dataInputStream);
        setLabelInnerText(ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream)));
        setTextID(ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream)));
        this.value = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeBool(dataOutputStream, this.isLocalizable);
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.labelInnerText));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.textID));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.value));
    }

    private void setLabelInnerText(String str) {
        this.labelInnerText = str;
    }

    public Selection selection() {
        return new Selection(this);
    }

    public boolean isLocalizable() {
        return this.isLocalizable;
    }

    public void setLocalizable(boolean z) {
        this.isLocalizable = z;
    }

    public String toString() {
        return ((this.textID == null || this.textID == "") ? "" : "{" + this.textID + "}") + (this.labelInnerText != null ? this.labelInnerText : "") + " => " + this.value;
    }

    public String getTextID() {
        return this.textID;
    }

    public void setTextID(String str) {
        this.textID = str;
    }
}
