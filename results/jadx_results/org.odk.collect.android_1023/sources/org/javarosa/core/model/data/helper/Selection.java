package org.javarosa.core.model.data.helper;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.model.QuestionDef;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class Selection implements Externalizable {
    public SelectChoice choice;
    public int index;
    public String xmlValue;

    public Selection() {
        this.xmlValue = null;
        this.index = -1;
    }

    public Selection(SelectChoice selectChoice) {
        this.xmlValue = null;
        this.index = -1;
        attachChoice(selectChoice);
    }

    public Selection(String str) {
        this.xmlValue = null;
        this.index = -1;
        this.xmlValue = str;
    }

    public Selection(int i) {
        this.xmlValue = null;
        this.index = -1;
        this.index = i;
    }

    public Selection clone() {
        Selection selection = new Selection();
        selection.choice = this.choice;
        selection.xmlValue = this.xmlValue;
        selection.index = this.index;
        return selection;
    }

    public void attachChoice(SelectChoice selectChoice) {
        this.choice = selectChoice;
        this.xmlValue = selectChoice.getValue();
        this.index = selectChoice.getIndex();
    }

    public void attachChoice(QuestionDef questionDef) {
        if (questionDef.getDynamicChoices() == null) {
            SelectChoice selectChoice = null;
            if (this.index != -1 && this.index < questionDef.getNumChoices()) {
                selectChoice = questionDef.getChoice(this.index);
            } else if (this.xmlValue != null && this.xmlValue.length() > 0) {
                selectChoice = questionDef.getChoiceForValue(this.xmlValue);
            }
            if (selectChoice != null) {
                attachChoice(selectChoice);
                return;
            }
            throw new RuntimeException("insufficient data in selection to reconstruct");
        }
    }

    public String getValue() {
        if (this.xmlValue != null && this.xmlValue.length() > 0) {
            return this.xmlValue;
        }
        throw new RuntimeException("don't know xml value! perhaps selection was stored as index only and has not yet been linked up to a formdef?");
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.xmlValue = ExtUtil.readString(dataInputStream);
        this.index = ExtUtil.readInt(dataInputStream);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeString(dataOutputStream, getValue());
        ExtUtil.writeNumeric(dataOutputStream, this.index);
    }
}
