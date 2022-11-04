package org.javarosa.xpath.parser.ast;

import java.util.Enumeration;
import java.util.Vector;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.javarosa.xpath.expr.XPathExpression;
import org.javarosa.xpath.parser.Parser;
import org.javarosa.xpath.parser.Token;
import org.javarosa.xpath.parser.XPathSyntaxException;
/* loaded from: classes.dex */
public abstract class ASTNode {
    int indent;

    public abstract XPathExpression build() throws XPathSyntaxException;

    public abstract Vector getChildren();

    private void printStr(String str) {
        for (int i = 0; i < this.indent * 2; i++) {
            System.out.print(XFormAnswerDataSerializer.DELIMITER);
        }
        System.out.println(str);
    }

    public void print() {
        this.indent = -1;
        print(this);
    }

    public void print(Object obj) {
        int i = 1;
        int i2 = 0;
        this.indent++;
        if (obj instanceof ASTNodeAbstractExpr) {
            ASTNodeAbstractExpr aSTNodeAbstractExpr = (ASTNodeAbstractExpr) obj;
            printStr("abstractexpr {");
            while (i2 < aSTNodeAbstractExpr.content.size()) {
                if (aSTNodeAbstractExpr.getType(i2) == 1) {
                    print(aSTNodeAbstractExpr.content.elementAt(i2));
                } else {
                    printStr(aSTNodeAbstractExpr.getToken(i2).toString());
                }
                i2++;
            }
            printStr("}");
        } else if (obj instanceof ASTNodePredicate) {
            printStr("predicate {");
            print(((ASTNodePredicate) obj).expr);
            printStr("}");
        } else if (obj instanceof ASTNodeFunctionCall) {
            ASTNodeFunctionCall aSTNodeFunctionCall = (ASTNodeFunctionCall) obj;
            if (aSTNodeFunctionCall.args.size() == 0) {
                printStr("func {" + aSTNodeFunctionCall.name.toString() + ", args {none}}");
            } else {
                printStr("func {" + aSTNodeFunctionCall.name.toString() + ", args {{");
                while (i2 < aSTNodeFunctionCall.args.size()) {
                    print(aSTNodeFunctionCall.args.elementAt(i2));
                    if (i2 < aSTNodeFunctionCall.args.size() - 1) {
                        printStr(" } {");
                    }
                    i2++;
                }
                printStr("}}}");
            }
        } else if (obj instanceof ASTNodeBinaryOp) {
            ASTNodeBinaryOp aSTNodeBinaryOp = (ASTNodeBinaryOp) obj;
            printStr("opexpr {");
            while (i2 < aSTNodeBinaryOp.exprs.size()) {
                print(aSTNodeBinaryOp.exprs.elementAt(i2));
                if (i2 < aSTNodeBinaryOp.exprs.size() - 1) {
                    switch (Parser.vectInt(aSTNodeBinaryOp.ops, i2)) {
                        case 1:
                            printStr("and:");
                            continue;
                        case 7:
                            printStr("div:");
                            continue;
                        case 9:
                            printStr("eq:");
                            continue;
                        case 10:
                            printStr("gt:");
                            continue;
                        case 11:
                            printStr("gte:");
                            continue;
                        case 14:
                            printStr("lt:");
                            continue;
                        case 15:
                            printStr("lte:");
                            continue;
                        case 16:
                            printStr("minus:");
                            continue;
                        case 17:
                            printStr("mod:");
                            continue;
                        case 18:
                            printStr("mult:");
                            continue;
                        case 19:
                            printStr("neq:");
                            continue;
                        case 22:
                            printStr("or:");
                            continue;
                        case 23:
                            printStr("plus:");
                            continue;
                        case Token.UNION /* 30 */:
                            printStr("union:");
                            continue;
                    }
                }
                i2++;
            }
            printStr("}");
        } else if (obj instanceof ASTNodeUnaryOp) {
            ASTNodeUnaryOp aSTNodeUnaryOp = (ASTNodeUnaryOp) obj;
            printStr("opexpr {");
            switch (aSTNodeUnaryOp.op) {
                case Token.UMINUS /* 29 */:
                    printStr("num-neg:");
                    break;
            }
            print(aSTNodeUnaryOp.expr);
            printStr("}");
        } else if (obj instanceof ASTNodeLocPath) {
            ASTNodeLocPath aSTNodeLocPath = (ASTNodeLocPath) obj;
            printStr("pathexpr {");
            if (!aSTNodeLocPath.isAbsolute()) {
                i = 0;
            }
            while (i2 < aSTNodeLocPath.clauses.size() + i) {
                if (i == 0 || i2 > 0) {
                    print(aSTNodeLocPath.clauses.elementAt(i2 - i));
                }
                if (i2 < aSTNodeLocPath.separators.size()) {
                    switch (Parser.vectInt(aSTNodeLocPath.separators, i2)) {
                        case 6:
                            printStr("dbl-slash:");
                            continue;
                        case Token.SLASH /* 27 */:
                            printStr("slash:");
                            continue;
                    }
                }
                i2++;
            }
            printStr("}");
        } else if (obj instanceof ASTNodePathStep) {
            ASTNodePathStep aSTNodePathStep = (ASTNodePathStep) obj;
            printStr("step {axis: " + aSTNodePathStep.axisType + " node test type: " + aSTNodePathStep.nodeTestType);
            if (aSTNodePathStep.axisType == 2) {
                printStr("  axis type: " + aSTNodePathStep.axisVal);
            }
            if (aSTNodePathStep.nodeTestType == 1) {
                printStr("  node test name: " + aSTNodePathStep.nodeTestQName.toString());
            }
            if (aSTNodePathStep.nodeTestType == 6) {
                print(aSTNodePathStep.nodeTestFunc);
            }
            printStr("predicates...");
            Enumeration elements = aSTNodePathStep.predicates.elements();
            while (elements.hasMoreElements()) {
                print(elements.nextElement());
            }
            printStr("}");
        } else if (obj instanceof ASTNodeFilterExpr) {
            ASTNodeFilterExpr aSTNodeFilterExpr = (ASTNodeFilterExpr) obj;
            printStr("filter expr {");
            print(aSTNodeFilterExpr.expr);
            printStr("predicates...");
            Enumeration elements2 = aSTNodeFilterExpr.predicates.elements();
            while (elements2.hasMoreElements()) {
                print(elements2.nextElement());
            }
            printStr("}");
        }
        this.indent--;
    }
}
