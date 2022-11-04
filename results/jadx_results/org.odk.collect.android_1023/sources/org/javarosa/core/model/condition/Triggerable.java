package org.javarosa.core.model.condition;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapList;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public abstract class Triggerable implements Externalizable {
    public TreeReference contextRef;
    public IConditionExpr expr;
    public TreeReference originalContextRef;
    public Vector<TreeReference> targets;

    protected abstract void apply(TreeReference treeReference, Object obj, FormInstance formInstance, FormDef formDef);

    public abstract boolean canCascade();

    protected abstract Object eval(FormInstance formInstance, EvaluationContext evaluationContext);

    public Triggerable() {
    }

    public Triggerable(IConditionExpr iConditionExpr, TreeReference treeReference) {
        this.expr = iConditionExpr;
        this.contextRef = treeReference;
        this.originalContextRef = treeReference;
        this.targets = new Vector<>();
    }

    public final void apply(FormInstance formInstance, EvaluationContext evaluationContext, TreeReference treeReference, FormDef formDef) {
        EvaluationContext evaluationContext2 = new EvaluationContext(evaluationContext, this.originalContextRef.contextualize(treeReference));
        Object eval = eval(formInstance, evaluationContext2);
        for (int i = 0; i < this.targets.size(); i++) {
            Vector<TreeReference> expandReference = evaluationContext2.expandReference(this.targets.elementAt(i).contextualize(evaluationContext2.getContextRef()));
            for (int i2 = 0; i2 < expandReference.size(); i2++) {
                apply(expandReference.elementAt(i2), eval, formInstance, formDef);
            }
        }
    }

    public void addTarget(TreeReference treeReference) {
        if (this.targets.indexOf(treeReference) == -1) {
            this.targets.addElement(treeReference);
        }
    }

    public Vector<TreeReference> getTargets() {
        return this.targets;
    }

    public Vector<TreeReference> getTriggers() {
        Vector<TreeReference> triggers = this.expr.getTriggers();
        Vector<TreeReference> vector = new Vector<>();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < triggers.size()) {
                vector.addElement(triggers.elementAt(i2).anchor(this.originalContextRef));
                i = i2 + 1;
            } else {
                return vector;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Triggerable) {
            Triggerable triggerable = (Triggerable) obj;
            if (this == triggerable) {
                return true;
            }
            if (!this.expr.equals(triggerable.expr)) {
                return false;
            }
            Vector<TreeReference> triggers = getTriggers();
            Vector<TreeReference> triggers2 = triggerable.getTriggers();
            int i = 0;
            while (i < 2) {
                Vector<TreeReference> vector = i == 0 ? triggers : triggers2;
                Vector<TreeReference> vector2 = i == 0 ? triggers2 : triggers;
                for (int i2 = 0; i2 < vector.size(); i2++) {
                    if (vector2.indexOf(vector.elementAt(i2)) == -1) {
                        return false;
                    }
                }
                i++;
            }
            return true;
        }
        return false;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.expr = (IConditionExpr) ExtUtil.read(dataInputStream, new ExtWrapTagged(), prototypeFactory);
        this.contextRef = (TreeReference) ExtUtil.read(dataInputStream, TreeReference.class, prototypeFactory);
        this.originalContextRef = (TreeReference) ExtUtil.read(dataInputStream, TreeReference.class, prototypeFactory);
        this.targets = (Vector) ExtUtil.read(dataInputStream, new ExtWrapList(TreeReference.class), prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.expr));
        ExtUtil.write(dataOutputStream, this.contextRef);
        ExtUtil.write(dataOutputStream, this.originalContextRef);
        ExtUtil.write(dataOutputStream, new ExtWrapList(this.targets));
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.targets.size()) {
                stringBuffer.append(this.targets.elementAt(i2).toString());
                if (i2 < this.targets.size() - 1) {
                    stringBuffer.append(",");
                }
                i = i2 + 1;
            } else {
                return "trig[expr:" + this.expr.toString() + ";targets[" + stringBuffer.toString() + "]]";
            }
        }
    }
}
