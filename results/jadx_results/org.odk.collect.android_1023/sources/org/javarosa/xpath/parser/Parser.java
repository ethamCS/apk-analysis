package org.javarosa.xpath.parser;

import java.util.Enumeration;
import java.util.Vector;
import org.javarosa.xpath.expr.XPathExpression;
import org.javarosa.xpath.expr.XPathQName;
import org.javarosa.xpath.parser.ast.ASTNode;
import org.javarosa.xpath.parser.ast.ASTNodeAbstractExpr;
import org.javarosa.xpath.parser.ast.ASTNodeBinaryOp;
import org.javarosa.xpath.parser.ast.ASTNodeFilterExpr;
import org.javarosa.xpath.parser.ast.ASTNodeFunctionCall;
import org.javarosa.xpath.parser.ast.ASTNodeLocPath;
import org.javarosa.xpath.parser.ast.ASTNodePathStep;
import org.javarosa.xpath.parser.ast.ASTNodePredicate;
import org.javarosa.xpath.parser.ast.ASTNodeUnaryOp;
import org.opendatakit.httpclientandroidlib.cookie.ClientCookie;
/* loaded from: classes.dex */
public class Parser {
    public static XPathExpression parse(Vector vector) throws XPathSyntaxException {
        return buildParseTree(vector).build();
    }

    public static ASTNode buildParseTree(Vector vector) throws XPathSyntaxException {
        ASTNodeAbstractExpr aSTNodeAbstractExpr = new ASTNodeAbstractExpr();
        for (int i = 0; i < vector.size(); i++) {
            aSTNodeAbstractExpr.content.addElement(vector.elementAt(i));
        }
        parseFuncCalls(aSTNodeAbstractExpr);
        parseParens(aSTNodeAbstractExpr);
        parsePredicates(aSTNodeAbstractExpr);
        parseOperators(aSTNodeAbstractExpr);
        parsePathExpr(aSTNodeAbstractExpr);
        verifyBaseExpr(aSTNodeAbstractExpr);
        return aSTNodeAbstractExpr;
    }

    private static void parseOperators(ASTNode aSTNode) {
        parseBinaryOp(aSTNode, new int[]{22}, 2);
        parseBinaryOp(aSTNode, new int[]{1}, 2);
        parseBinaryOp(aSTNode, new int[]{9, 19}, 1);
        parseBinaryOp(aSTNode, new int[]{14, 15, 10, 11}, 1);
        parseBinaryOp(aSTNode, new int[]{23, 16}, 1);
        parseBinaryOp(aSTNode, new int[]{18, 7, 17}, 1);
        parseUnaryOp(aSTNode, 29);
        parseBinaryOp(aSTNode, new int[]{30}, 1);
    }

    private static void parseFuncCalls(ASTNode aSTNode) throws XPathSyntaxException {
        if (aSTNode instanceof ASTNodeAbstractExpr) {
            ASTNodeAbstractExpr aSTNodeAbstractExpr = (ASTNodeAbstractExpr) aSTNode;
            for (int i = 0; i < aSTNodeAbstractExpr.content.size() - 1; i++) {
                if (aSTNodeAbstractExpr.getTokenType(i + 1) == 13 && aSTNodeAbstractExpr.getTokenType(i) == 24) {
                    condenseFuncCall(aSTNodeAbstractExpr, i);
                }
            }
        }
        Enumeration elements = aSTNode.getChildren().elements();
        while (elements.hasMoreElements()) {
            parseFuncCalls((ASTNode) elements.nextElement());
        }
    }

    private static void condenseFuncCall(ASTNodeAbstractExpr aSTNodeAbstractExpr, int i) throws XPathSyntaxException {
        ASTNodeFunctionCall aSTNodeFunctionCall = new ASTNodeFunctionCall((XPathQName) aSTNodeAbstractExpr.getToken(i).val);
        int indexOfBalanced = aSTNodeAbstractExpr.indexOfBalanced(i + 1, 26, 13, 26);
        if (indexOfBalanced == -1) {
            throw new XPathSyntaxException();
        }
        ASTNodeAbstractExpr.Partition partitionBalanced = aSTNodeAbstractExpr.partitionBalanced(3, i + 1, 13, 26);
        if (partitionBalanced.pieces.size() != 1 || ((ASTNodeAbstractExpr) partitionBalanced.pieces.elementAt(0)).content.size() != 0) {
            aSTNodeFunctionCall.args = partitionBalanced.pieces;
        }
        aSTNodeAbstractExpr.condense(aSTNodeFunctionCall, i, indexOfBalanced + 1);
    }

    private static void parseParens(ASTNode aSTNode) throws XPathSyntaxException {
        parseBalanced(aSTNode, new SubNodeFactory() { // from class: org.javarosa.xpath.parser.Parser.1
            @Override // org.javarosa.xpath.parser.Parser.SubNodeFactory
            public ASTNode newNode(ASTNodeAbstractExpr aSTNodeAbstractExpr) {
                return aSTNodeAbstractExpr;
            }
        }, 13, 26);
    }

    private static void parsePredicates(ASTNode aSTNode) throws XPathSyntaxException {
        parseBalanced(aSTNode, new SubNodeFactory() { // from class: org.javarosa.xpath.parser.Parser.2
            @Override // org.javarosa.xpath.parser.Parser.SubNodeFactory
            public ASTNode newNode(ASTNodeAbstractExpr aSTNodeAbstractExpr) {
                ASTNodePredicate aSTNodePredicate = new ASTNodePredicate();
                aSTNodePredicate.expr = aSTNodeAbstractExpr;
                return aSTNodePredicate;
            }
        }, 12, 25);
    }

    /* loaded from: classes.dex */
    public static abstract class SubNodeFactory {
        public abstract ASTNode newNode(ASTNodeAbstractExpr aSTNodeAbstractExpr);

        private SubNodeFactory() {
        }
    }

    private static void parseBalanced(ASTNode aSTNode, SubNodeFactory subNodeFactory, int i, int i2) throws XPathSyntaxException {
        if (aSTNode instanceof ASTNodeAbstractExpr) {
            ASTNodeAbstractExpr aSTNodeAbstractExpr = (ASTNodeAbstractExpr) aSTNode;
            for (int i3 = 0; i3 < aSTNodeAbstractExpr.content.size(); i3++) {
                int tokenType = aSTNodeAbstractExpr.getTokenType(i3);
                if (tokenType == i2) {
                    throw new XPathSyntaxException();
                }
                if (tokenType == i) {
                    int indexOfBalanced = aSTNodeAbstractExpr.indexOfBalanced(i3, i2, i, i2);
                    if (indexOfBalanced == -1) {
                        throw new XPathSyntaxException();
                    }
                    aSTNodeAbstractExpr.condense(subNodeFactory.newNode(aSTNodeAbstractExpr.extract(i3 + 1, indexOfBalanced)), i3, indexOfBalanced + 1);
                }
            }
        }
        Enumeration elements = aSTNode.getChildren().elements();
        while (elements.hasMoreElements()) {
            parseBalanced((ASTNode) elements.nextElement(), subNodeFactory, i, i2);
        }
    }

    private static void parseBinaryOp(ASTNode aSTNode, int[] iArr, int i) {
        if (aSTNode instanceof ASTNodeAbstractExpr) {
            ASTNodeAbstractExpr aSTNodeAbstractExpr = (ASTNodeAbstractExpr) aSTNode;
            ASTNodeAbstractExpr.Partition partition = aSTNodeAbstractExpr.partition(iArr, 0, aSTNodeAbstractExpr.content.size());
            if (partition.separators.size() != 0) {
                ASTNodeBinaryOp aSTNodeBinaryOp = new ASTNodeBinaryOp();
                aSTNodeBinaryOp.associativity = i;
                aSTNodeBinaryOp.exprs = partition.pieces;
                aSTNodeBinaryOp.ops = partition.separators;
                aSTNodeAbstractExpr.condense(aSTNodeBinaryOp, 0, aSTNodeAbstractExpr.content.size());
            }
        }
        Enumeration elements = aSTNode.getChildren().elements();
        while (elements.hasMoreElements()) {
            parseBinaryOp((ASTNode) elements.nextElement(), iArr, i);
        }
    }

    private static void parseUnaryOp(ASTNode aSTNode, int i) {
        if (aSTNode instanceof ASTNodeAbstractExpr) {
            ASTNodeAbstractExpr aSTNodeAbstractExpr = (ASTNodeAbstractExpr) aSTNode;
            if (aSTNodeAbstractExpr.content.size() > 0 && aSTNodeAbstractExpr.getTokenType(0) == i) {
                ASTNodeUnaryOp aSTNodeUnaryOp = new ASTNodeUnaryOp();
                aSTNodeUnaryOp.op = i;
                aSTNodeUnaryOp.expr = aSTNodeAbstractExpr.content.size() > 1 ? aSTNodeAbstractExpr.extract(1, aSTNodeAbstractExpr.content.size()) : new ASTNodeAbstractExpr();
                aSTNodeAbstractExpr.condense(aSTNodeUnaryOp, 0, aSTNodeAbstractExpr.content.size());
            }
        }
        Enumeration elements = aSTNode.getChildren().elements();
        while (elements.hasMoreElements()) {
            parseUnaryOp((ASTNode) elements.nextElement(), i);
        }
    }

    private static void parsePathExpr(ASTNode aSTNode) throws XPathSyntaxException {
        if (aSTNode instanceof ASTNodeAbstractExpr) {
            ASTNodeAbstractExpr aSTNodeAbstractExpr = (ASTNodeAbstractExpr) aSTNode;
            ASTNodeAbstractExpr.Partition partition = aSTNodeAbstractExpr.partition(new int[]{27, 6}, 0, aSTNodeAbstractExpr.content.size());
            if (partition.separators.size() == 0) {
                if (isStep(aSTNodeAbstractExpr)) {
                    ASTNodePathStep parseStep = parseStep(aSTNodeAbstractExpr);
                    ASTNodeLocPath aSTNodeLocPath = new ASTNodeLocPath();
                    aSTNodeLocPath.clauses.addElement(parseStep);
                    aSTNodeAbstractExpr.condense(aSTNodeLocPath, 0, aSTNodeAbstractExpr.content.size());
                } else {
                    ASTNodeFilterExpr parseFilterExp = parseFilterExp(aSTNodeAbstractExpr);
                    if (parseFilterExp != null) {
                        aSTNodeAbstractExpr.condense(parseFilterExp, 0, aSTNodeAbstractExpr.content.size());
                    }
                }
            } else {
                ASTNodeLocPath aSTNodeLocPath2 = new ASTNodeLocPath();
                aSTNodeLocPath2.separators = partition.separators;
                if (partition.separators.size() != 1 || aSTNodeAbstractExpr.content.size() != 1 || vectInt(partition.separators, 0) != 27) {
                    for (int i = 0; i < partition.pieces.size(); i++) {
                        ASTNodeAbstractExpr aSTNodeAbstractExpr2 = (ASTNodeAbstractExpr) partition.pieces.elementAt(i);
                        if (isStep(aSTNodeAbstractExpr2)) {
                            aSTNodeLocPath2.clauses.addElement(parseStep(aSTNodeAbstractExpr2));
                        } else if (i == 0) {
                            if (aSTNodeAbstractExpr2.content.size() != 0) {
                                ASTNodeFilterExpr parseFilterExp2 = parseFilterExp(aSTNodeAbstractExpr2);
                                if (parseFilterExp2 != null) {
                                    aSTNodeLocPath2.clauses.addElement(parseFilterExp2);
                                } else {
                                    aSTNodeLocPath2.clauses.addElement(aSTNodeAbstractExpr2);
                                }
                            }
                        } else {
                            throw new XPathSyntaxException();
                        }
                    }
                }
                aSTNodeAbstractExpr.condense(aSTNodeLocPath2, 0, aSTNodeAbstractExpr.content.size());
            }
        }
        Enumeration elements = aSTNode.getChildren().elements();
        while (elements.hasMoreElements()) {
            parsePathExpr((ASTNode) elements.nextElement());
        }
    }

    private static boolean isStep(ASTNodeAbstractExpr aSTNodeAbstractExpr) {
        if (aSTNodeAbstractExpr.content.size() > 0) {
            int tokenType = aSTNodeAbstractExpr.getTokenType(0);
            if (tokenType == 24 || tokenType == 32 || tokenType == 20 || tokenType == 2 || tokenType == 8 || tokenType == 5) {
                return true;
            }
            if (!(aSTNodeAbstractExpr.content.elementAt(0) instanceof ASTNodeFunctionCall)) {
                return false;
            }
            String xPathQName = ((ASTNodeFunctionCall) aSTNodeAbstractExpr.content.elementAt(0)).name.toString();
            return xPathQName.equals("node") || xPathQName.equals("text") || xPathQName.equals(ClientCookie.COMMENT_ATTR) || xPathQName.equals("processing-instruction");
        }
        return false;
    }

    private static ASTNodePathStep parseStep(ASTNodeAbstractExpr aSTNodeAbstractExpr) throws XPathSyntaxException {
        int i;
        ASTNodePathStep aSTNodePathStep = new ASTNodePathStep();
        if (aSTNodeAbstractExpr.content.size() == 1 && aSTNodeAbstractExpr.getTokenType(0) == 8) {
            aSTNodePathStep.axisType = 3;
            aSTNodePathStep.nodeTestType = 4;
        } else if (aSTNodeAbstractExpr.content.size() == 1 && aSTNodeAbstractExpr.getTokenType(0) == 5) {
            aSTNodePathStep.axisType = 3;
            aSTNodePathStep.nodeTestType = 5;
        } else {
            if (aSTNodeAbstractExpr.content.size() > 0 && aSTNodeAbstractExpr.getTokenType(0) == 2) {
                aSTNodePathStep.axisType = 1;
                i = 1;
            } else if (aSTNodeAbstractExpr.content.size() > 1 && aSTNodeAbstractExpr.getTokenType(0) == 24 && aSTNodeAbstractExpr.getTokenType(1) == 4) {
                int validateAxisName = ASTNodePathStep.validateAxisName(((XPathQName) aSTNodeAbstractExpr.getToken(0).val).toString());
                if (validateAxisName == -1) {
                    throw new XPathSyntaxException();
                }
                aSTNodePathStep.axisType = 2;
                aSTNodePathStep.axisVal = validateAxisName;
                i = 2;
            } else {
                aSTNodePathStep.axisType = 3;
                i = 0;
            }
            if (aSTNodeAbstractExpr.content.size() > i && aSTNodeAbstractExpr.getTokenType(i) == 32) {
                aSTNodePathStep.nodeTestType = 2;
            } else if (aSTNodeAbstractExpr.content.size() > i && aSTNodeAbstractExpr.getTokenType(i) == 20) {
                aSTNodePathStep.nodeTestType = 3;
                aSTNodePathStep.nodeTestNamespace = (String) aSTNodeAbstractExpr.getToken(i).val;
            } else if (aSTNodeAbstractExpr.content.size() > i && aSTNodeAbstractExpr.getTokenType(i) == 24) {
                aSTNodePathStep.nodeTestType = 1;
                aSTNodePathStep.nodeTestQName = (XPathQName) aSTNodeAbstractExpr.getToken(i).val;
            } else if (aSTNodeAbstractExpr.content.size() > i && (aSTNodeAbstractExpr.content.elementAt(i) instanceof ASTNodeFunctionCall)) {
                if (!ASTNodePathStep.validateNodeTypeTest((ASTNodeFunctionCall) aSTNodeAbstractExpr.content.elementAt(i))) {
                    throw new XPathSyntaxException();
                }
                aSTNodePathStep.nodeTestType = 6;
                aSTNodePathStep.nodeTestFunc = (ASTNodeFunctionCall) aSTNodeAbstractExpr.content.elementAt(i);
            } else {
                throw new XPathSyntaxException();
            }
            for (int i2 = i + 1; i2 < aSTNodeAbstractExpr.content.size(); i2++) {
                if (aSTNodeAbstractExpr.content.elementAt(i2) instanceof ASTNodePredicate) {
                    aSTNodePathStep.predicates.addElement(aSTNodeAbstractExpr.content.elementAt(i2));
                } else {
                    throw new XPathSyntaxException();
                }
            }
        }
        return aSTNodePathStep;
    }

    private static ASTNodeFilterExpr parseFilterExp(ASTNodeAbstractExpr aSTNodeAbstractExpr) throws XPathSyntaxException {
        ASTNodeFilterExpr aSTNodeFilterExpr = new ASTNodeFilterExpr();
        int size = aSTNodeAbstractExpr.content.size() - 1;
        while (size >= 0 && (aSTNodeAbstractExpr.content.elementAt(size) instanceof ASTNodePredicate)) {
            aSTNodeFilterExpr.predicates.insertElementAt(aSTNodeAbstractExpr.content.elementAt(size), 0);
            size--;
        }
        if (aSTNodeFilterExpr.predicates.size() == 0) {
            return null;
        }
        aSTNodeFilterExpr.expr = aSTNodeAbstractExpr.extract(0, size + 1);
        return aSTNodeFilterExpr;
    }

    public static void verifyBaseExpr(ASTNode aSTNode) throws XPathSyntaxException {
        if ((aSTNode instanceof ASTNodeAbstractExpr) && !((ASTNodeAbstractExpr) aSTNode).isNormalized()) {
            throw new XPathSyntaxException();
        }
        Enumeration elements = aSTNode.getChildren().elements();
        while (elements.hasMoreElements()) {
            verifyBaseExpr((ASTNode) elements.nextElement());
        }
    }

    public static int vectInt(Vector vector, int i) {
        return ((Integer) vector.elementAt(i)).intValue();
    }
}
