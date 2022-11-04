package org.javarosa.core.model.condition;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.services.Logger;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.xpath.XPathParseTool;
import org.javarosa.xpath.expr.XPathExpression;
/* loaded from: classes.dex */
public class Constraint implements Externalizable {
    public IConditionExpr constraint;
    private String constraintMsg;
    private XPathExpression xPathConstraintMsg;

    public Constraint() {
    }

    public Constraint(IConditionExpr iConditionExpr, String str) {
        this.constraint = iConditionExpr;
        this.constraintMsg = str;
        attemptConstraintCompile();
    }

    public String getConstraintMessage(EvaluationContext evaluationContext, FormInstance formInstance, String str) {
        if (this.xPathConstraintMsg == null) {
            if (str != null) {
                return null;
            }
            return this.constraintMsg;
        }
        if (str != null) {
            evaluationContext.setOutputTextForm(str);
        }
        try {
            Object eval = this.xPathConstraintMsg.eval(formInstance, evaluationContext);
            if (eval == "") {
                return null;
            }
            return (String) eval;
        } catch (Exception e) {
            Logger.exception("Error evaluating a valid-looking constraint xpath ", e);
            return this.constraintMsg;
        }
    }

    private void attemptConstraintCompile() {
        this.xPathConstraintMsg = null;
        try {
            if (this.constraintMsg != null) {
                this.xPathConstraintMsg = XPathParseTool.parseXPath("string(" + this.constraintMsg + ")");
            }
        } catch (Exception e) {
        }
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.constraint = (IConditionExpr) ExtUtil.read(dataInputStream, new ExtWrapTagged(), prototypeFactory);
        this.constraintMsg = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        attemptConstraintCompile();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.constraint));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.constraintMsg));
    }
}
