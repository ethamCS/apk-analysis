package org.javarosa.core.model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import org.javarosa.core.model.condition.Condition;
import org.javarosa.core.model.condition.IConditionExpr;
import org.javarosa.core.model.condition.Recalculate;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapNullable;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class DataBinding implements Externalizable {
    public Recalculate calculate;
    public IConditionExpr constraint;
    public String constraintMessage;
    private int dataType;
    private String id;
    private String preload;
    private String preloadParams;
    public Condition readonlyCondition;
    private IDataReference ref;
    public Condition relevancyCondition;
    public Condition requiredCondition;
    private Vector<TreeElement> additionalAttrs = new Vector<>();
    public boolean relevantAbsolute = true;
    public boolean requiredAbsolute = false;
    public boolean readonlyAbsolute = false;

    public IDataReference getReference() {
        return this.ref;
    }

    public void setReference(IDataReference iDataReference) {
        this.ref = iDataReference;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public int getDataType() {
        return this.dataType;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public String getPreload() {
        return this.preload;
    }

    public void setPreload(String str) {
        this.preload = str;
    }

    public String getPreloadParams() {
        return this.preloadParams;
    }

    public void setPreloadParams(String str) {
        this.preloadParams = str;
    }

    public void setAdditionalAttribute(String str, String str2, String str3) {
        TreeElement.setAttribute(null, this.additionalAttrs, str, str2, str3);
    }

    public Vector<TreeElement> getAdditionalAttributes() {
        return this.additionalAttrs;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        setId((String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory));
        setDataType(ExtUtil.readInt(dataInputStream));
        setPreload((String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory));
        setPreloadParams((String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory));
        this.ref = (IDataReference) ExtUtil.read(dataInputStream, new ExtWrapTagged());
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(getId()));
        ExtUtil.writeNumeric(dataOutputStream, getDataType());
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(getPreload()));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(getPreloadParams()));
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.ref));
    }
}
