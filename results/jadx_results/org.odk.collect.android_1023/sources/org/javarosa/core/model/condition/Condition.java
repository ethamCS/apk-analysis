package org.javarosa.core.model.condition;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class Condition extends Triggerable {
    public static final int ACTION_DISABLE = 4;
    public static final int ACTION_DONT_REQUIRE = 8;
    public static final int ACTION_ENABLE = 3;
    public static final int ACTION_HIDE = 2;
    public static final int ACTION_LOCK = 5;
    public static final int ACTION_NULL = 0;
    public static final int ACTION_REQUIRE = 7;
    public static final int ACTION_SHOW = 1;
    public static final int ACTION_UNLOCK = 6;
    public int falseAction;
    public int trueAction;

    public Condition() {
    }

    public Condition(IConditionExpr iConditionExpr, int i, int i2, TreeReference treeReference) {
        this(iConditionExpr, i, i2, treeReference, new Vector());
    }

    public Condition(IConditionExpr iConditionExpr, int i, int i2, TreeReference treeReference, Vector vector) {
        super(iConditionExpr, treeReference);
        this.trueAction = i;
        this.falseAction = i2;
        this.targets = vector;
    }

    @Override // org.javarosa.core.model.condition.Triggerable
    public Object eval(FormInstance formInstance, EvaluationContext evaluationContext) {
        return new Boolean(this.expr.eval(formInstance, evaluationContext));
    }

    public boolean evalBool(FormInstance formInstance, EvaluationContext evaluationContext) {
        return ((Boolean) eval(formInstance, evaluationContext)).booleanValue();
    }

    @Override // org.javarosa.core.model.condition.Triggerable
    public void apply(TreeReference treeReference, Object obj, FormInstance formInstance, FormDef formDef) {
        performAction(formInstance.resolveReference(treeReference), ((Boolean) obj).booleanValue() ? this.trueAction : this.falseAction);
    }

    @Override // org.javarosa.core.model.condition.Triggerable
    public boolean canCascade() {
        return this.trueAction == 1 || this.trueAction == 2;
    }

    private void performAction(TreeElement treeElement, int i) {
        switch (i) {
            case 0:
            case 5:
            case 6:
            default:
                return;
            case 1:
                treeElement.setRelevant(true);
                return;
            case 2:
                treeElement.setRelevant(false);
                return;
            case 3:
                treeElement.setEnabled(true);
                return;
            case 4:
                treeElement.setEnabled(false);
                return;
            case 7:
                treeElement.setRequired(true);
                return;
            case 8:
                treeElement.setRequired(false);
                return;
        }
    }

    @Override // org.javarosa.core.model.condition.Triggerable
    public boolean equals(Object obj) {
        if (obj instanceof Condition) {
            Condition condition = (Condition) obj;
            if (this == condition) {
                return true;
            }
            return this.trueAction == condition.trueAction && this.falseAction == condition.falseAction && super.equals(condition);
        }
        return false;
    }

    @Override // org.javarosa.core.model.condition.Triggerable, org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        super.readExternal(dataInputStream, prototypeFactory);
        this.trueAction = ExtUtil.readInt(dataInputStream);
        this.falseAction = ExtUtil.readInt(dataInputStream);
    }

    @Override // org.javarosa.core.model.condition.Triggerable, org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        super.writeExternal(dataOutputStream);
        ExtUtil.writeNumeric(dataOutputStream, this.trueAction);
        ExtUtil.writeNumeric(dataOutputStream, this.falseAction);
    }
}
