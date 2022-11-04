package org.javarosa.core.model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import org.javarosa.core.model.condition.IConditionExpr;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.model.util.restorable.RestoreUtils;
import org.javarosa.core.services.locale.Localizable;
import org.javarosa.core.services.locale.Localizer;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapNullable;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.ExternalizableWrapper;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class ItemsetBinding implements Externalizable, Localizable {
    private Vector<SelectChoice> choices;
    public TreeReference contextRef;
    public boolean copyMode;
    public TreeReference copyRef;
    private TreeReference destRef;
    public IConditionExpr labelExpr;
    public boolean labelIsItext;
    public TreeReference labelRef;
    public IConditionExpr nodesetExpr;
    public TreeReference nodesetRef;
    public IConditionExpr valueExpr;
    public TreeReference valueRef;

    public Vector<SelectChoice> getChoices() {
        return this.choices;
    }

    public void setChoices(Vector<SelectChoice> vector, Localizer localizer) {
        String locale;
        if (this.choices != null) {
            System.out.println("warning: previous choices not cleared out");
            clearChoices();
        }
        this.choices = vector;
        if (localizer != null && (locale = localizer.getLocale()) != null) {
            localeChanged(locale, localizer);
        }
    }

    public void clearChoices() {
        this.choices = null;
    }

    @Override // org.javarosa.core.services.locale.Localizable
    public void localeChanged(String str, Localizer localizer) {
        if (this.choices != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.choices.size()) {
                    this.choices.elementAt(i2).localeChanged(str, localizer);
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public void setDestRef(QuestionDef questionDef) {
        this.destRef = FormInstance.unpackReference(questionDef.getBind()).clone();
        if (this.copyMode) {
            this.destRef.add(this.copyRef.getNameLast(), -1);
        }
    }

    public TreeReference getDestRef() {
        return this.destRef;
    }

    public IConditionExpr getRelativeValue() {
        TreeReference relativize;
        if (this.copyRef == null) {
            relativize = this.valueRef;
        } else {
            relativize = this.valueRef != null ? this.valueRef.relativize(this.copyRef) : null;
        }
        if (relativize != null) {
            return RestoreUtils.xfFact.refToPathExpr(relativize);
        }
        return null;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.nodesetRef = (TreeReference) ExtUtil.read(dataInputStream, TreeReference.class, prototypeFactory);
        this.nodesetExpr = (IConditionExpr) ExtUtil.read(dataInputStream, new ExtWrapTagged(), prototypeFactory);
        this.contextRef = (TreeReference) ExtUtil.read(dataInputStream, TreeReference.class, prototypeFactory);
        this.labelRef = (TreeReference) ExtUtil.read(dataInputStream, TreeReference.class, prototypeFactory);
        this.labelExpr = (IConditionExpr) ExtUtil.read(dataInputStream, new ExtWrapTagged(), prototypeFactory);
        this.valueRef = (TreeReference) ExtUtil.read(dataInputStream, new ExtWrapNullable(TreeReference.class), prototypeFactory);
        this.valueExpr = (IConditionExpr) ExtUtil.read(dataInputStream, new ExtWrapNullable((ExternalizableWrapper) new ExtWrapTagged()), prototypeFactory);
        this.copyRef = (TreeReference) ExtUtil.read(dataInputStream, new ExtWrapNullable(TreeReference.class), prototypeFactory);
        this.labelIsItext = ExtUtil.readBool(dataInputStream);
        this.copyMode = ExtUtil.readBool(dataInputStream);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, this.nodesetRef);
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.nodesetExpr));
        ExtUtil.write(dataOutputStream, this.contextRef);
        ExtUtil.write(dataOutputStream, this.labelRef);
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.labelExpr));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.valueRef));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable((ExternalizableWrapper) (this.valueExpr == null ? null : new ExtWrapTagged(this.valueExpr))));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.copyRef));
        ExtUtil.writeBool(dataOutputStream, this.labelIsItext);
        ExtUtil.writeBool(dataOutputStream, this.copyMode);
    }
}
