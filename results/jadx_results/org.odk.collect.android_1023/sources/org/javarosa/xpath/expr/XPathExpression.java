package org.javarosa.xpath.expr;

import java.util.Vector;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.condition.pivot.UnpivotableExpressionException;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.services.Logger;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
/* loaded from: classes.dex */
public abstract class XPathExpression implements Externalizable {
    int indent;

    public abstract Object eval(FormInstance formInstance, EvaluationContext evaluationContext);

    public Object eval(EvaluationContext evaluationContext) {
        return eval(evaluationContext.getMainInstance(), evaluationContext);
    }

    public final Vector<Object> pivot(FormInstance formInstance, EvaluationContext evaluationContext) throws UnpivotableExpressionException {
        try {
            Vector<Object> vector = new Vector<>();
            pivot(formInstance, evaluationContext, vector, evaluationContext.getContextRef());
            return vector;
        } catch (UnpivotableExpressionException e) {
            throw e;
        } catch (Exception e2) {
            Logger.exception(e2);
            throw new UnpivotableExpressionException(e2.getMessage());
        }
    }

    public Object pivot(FormInstance formInstance, EvaluationContext evaluationContext, Vector<Object> vector, Object obj) throws UnpivotableExpressionException {
        return eval(formInstance, evaluationContext);
    }

    private void printStr(String str) {
        for (int i = 0; i < this.indent * 2; i++) {
            System.out.print(XFormAnswerDataSerializer.DELIMITER);
        }
        System.out.println(str);
    }

    public void printParseTree() {
        this.indent = -1;
        print(this);
    }

    public void print(Object obj) {
        String str = null;
        int i = 0;
        this.indent++;
        if (obj instanceof XPathStringLiteral) {
            printStr("strlit {" + ((XPathStringLiteral) obj).s + "}");
        } else if (obj instanceof XPathNumericLiteral) {
            printStr("numlit {" + ((XPathNumericLiteral) obj).d + "}");
        } else if (obj instanceof XPathVariableReference) {
            printStr("var {" + ((XPathVariableReference) obj).id.toString() + "}");
        } else if (obj instanceof XPathArithExpr) {
            XPathArithExpr xPathArithExpr = (XPathArithExpr) obj;
            switch (xPathArithExpr.op) {
                case 0:
                    str = "add";
                    break;
                case 1:
                    str = "subtr";
                    break;
                case 2:
                    str = "mult";
                    break;
                case 3:
                    str = "div";
                    break;
                case 4:
                    str = "mod";
                    break;
            }
            printStr(str + " {{");
            print(xPathArithExpr.a);
            printStr(" } {");
            print(xPathArithExpr.b);
            printStr("}}");
        } else if (obj instanceof XPathBoolExpr) {
            XPathBoolExpr xPathBoolExpr = (XPathBoolExpr) obj;
            switch (xPathBoolExpr.op) {
                case 0:
                    str = "and";
                    break;
                case 1:
                    str = "or";
                    break;
            }
            printStr(str + " {{");
            print(xPathBoolExpr.a);
            printStr(" } {");
            print(xPathBoolExpr.b);
            printStr("}}");
        } else if (obj instanceof XPathCmpExpr) {
            XPathCmpExpr xPathCmpExpr = (XPathCmpExpr) obj;
            switch (xPathCmpExpr.op) {
                case 0:
                    str = "lt";
                    break;
                case 1:
                    str = "gt";
                    break;
                case 2:
                    str = "lte";
                    break;
                case 3:
                    str = "gte";
                    break;
            }
            printStr(str + " {{");
            print(xPathCmpExpr.a);
            printStr(" } {");
            print(xPathCmpExpr.b);
            printStr("}}");
        } else if (obj instanceof XPathEqExpr) {
            XPathEqExpr xPathEqExpr = (XPathEqExpr) obj;
            printStr((xPathEqExpr.equal ? "eq" : "neq") + " {{");
            print(xPathEqExpr.a);
            printStr(" } {");
            print(xPathEqExpr.b);
            printStr("}}");
        } else if (obj instanceof XPathUnionExpr) {
            XPathUnionExpr xPathUnionExpr = (XPathUnionExpr) obj;
            printStr("union {{");
            print(xPathUnionExpr.a);
            printStr(" } {");
            print(xPathUnionExpr.b);
            printStr("}}");
        } else if (obj instanceof XPathNumNegExpr) {
            printStr("neg {");
            print(((XPathNumNegExpr) obj).a);
            printStr("}");
        } else if (obj instanceof XPathFuncExpr) {
            XPathFuncExpr xPathFuncExpr = (XPathFuncExpr) obj;
            if (xPathFuncExpr.args.length == 0) {
                printStr("func {" + xPathFuncExpr.id.toString() + ", args {none}}");
            } else {
                printStr("func {" + xPathFuncExpr.id.toString() + ", args {{");
                for (int i2 = 0; i2 < xPathFuncExpr.args.length; i2++) {
                    print(xPathFuncExpr.args[i2]);
                    if (i2 < xPathFuncExpr.args.length - 1) {
                        printStr(" } {");
                    }
                }
                printStr("}}}");
            }
        } else if (obj instanceof XPathPathExpr) {
            XPathPathExpr xPathPathExpr = (XPathPathExpr) obj;
            switch (xPathPathExpr.init_context) {
                case 0:
                    str = "root";
                    break;
                case 1:
                    str = "relative";
                    break;
                case 2:
                    str = "expr";
                    break;
            }
            printStr("path {init-context:" + str + ",");
            if (xPathPathExpr.init_context == 2) {
                printStr(" init-expr:{");
                print(xPathPathExpr.filtExpr);
                printStr(" }");
            }
            if (xPathPathExpr.steps.length == 0) {
                printStr(" steps {none}");
                printStr("}");
            } else {
                printStr(" steps {{");
                while (i < xPathPathExpr.steps.length) {
                    print(xPathPathExpr.steps[i]);
                    if (i < xPathPathExpr.steps.length - 1) {
                        printStr(" } {");
                    }
                    i++;
                }
                printStr("}}}");
            }
        } else if (obj instanceof XPathFilterExpr) {
            XPathFilterExpr xPathFilterExpr = (XPathFilterExpr) obj;
            printStr("filter-expr:{{");
            print(xPathFilterExpr.x);
            if (xPathFilterExpr.predicates.length == 0) {
                printStr(" } predicates {none}}");
            } else {
                printStr(" } predicates {{");
                while (i < xPathFilterExpr.predicates.length) {
                    print(xPathFilterExpr.predicates[i]);
                    if (i < xPathFilterExpr.predicates.length - 1) {
                        printStr(" } {");
                    }
                    i++;
                }
                printStr(" }}}");
            }
        } else if (obj instanceof XPathStep) {
            XPathStep xPathStep = (XPathStep) obj;
            String axisStr = XPathStep.axisStr(xPathStep.axis);
            String testStr = xPathStep.testStr();
            if (xPathStep.predicates.length == 0) {
                printStr("step {axis:" + axisStr + " test:" + testStr + " predicates {none}}");
            } else {
                printStr("step {axis:" + axisStr + " test:" + testStr + " predicates {{");
                while (i < xPathStep.predicates.length) {
                    print(xPathStep.predicates[i]);
                    if (i < xPathStep.predicates.length - 1) {
                        printStr(" } {");
                    }
                    i++;
                }
                printStr("}}}");
            }
        }
        this.indent--;
    }
}
