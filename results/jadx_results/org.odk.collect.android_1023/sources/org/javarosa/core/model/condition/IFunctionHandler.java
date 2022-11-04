package org.javarosa.core.model.condition;

import java.util.Vector;
/* loaded from: classes.dex */
public interface IFunctionHandler {
    Object eval(Object[] objArr, EvaluationContext evaluationContext);

    String getName();

    Vector getPrototypes();

    boolean rawArgs();

    boolean realTime();
}
