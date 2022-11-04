package org.javarosa.xpath.parser.ast;

import java.util.Vector;
import org.javarosa.xpath.expr.XPathExpression;
import org.javarosa.xpath.expr.XPathQName;
import org.javarosa.xpath.expr.XPathStep;
import org.javarosa.xpath.parser.XPathSyntaxException;
import org.opendatakit.httpclientandroidlib.cookie.ClientCookie;
/* loaded from: classes.dex */
public class ASTNodePathStep extends ASTNode {
    public static final int AXIS_TYPE_ABBR = 1;
    public static final int AXIS_TYPE_EXPLICIT = 2;
    public static final int AXIS_TYPE_NULL = 3;
    public static final int NODE_TEST_TYPE_ABBR_DBL_DOT = 5;
    public static final int NODE_TEST_TYPE_ABBR_DOT = 4;
    public static final int NODE_TEST_TYPE_FUNC = 6;
    public static final int NODE_TEST_TYPE_NSWILDCARD = 3;
    public static final int NODE_TEST_TYPE_QNAME = 1;
    public static final int NODE_TEST_TYPE_WILDCARD = 2;
    public int axisType;
    public int axisVal;
    public ASTNodeFunctionCall nodeTestFunc;
    public String nodeTestNamespace;
    public XPathQName nodeTestQName;
    public int nodeTestType;
    public Vector predicates = new Vector();

    @Override // org.javarosa.xpath.parser.ast.ASTNode
    public Vector getChildren() {
        return this.predicates;
    }

    @Override // org.javarosa.xpath.parser.ast.ASTNode
    public XPathExpression build() {
        return null;
    }

    public XPathStep getStep() throws XPathSyntaxException {
        XPathStep xPathStep;
        int i = 3;
        if (this.nodeTestType == 4) {
            return XPathStep.ABBR_SELF();
        }
        if (this.nodeTestType == 5) {
            return XPathStep.ABBR_PARENT();
        }
        if (this.axisType == 3) {
            this.axisVal = 0;
        } else if (this.axisType == 1) {
            this.axisVal = 8;
        }
        if (this.nodeTestType == 1) {
            xPathStep = new XPathStep(this.axisVal, this.nodeTestQName);
        } else if (this.nodeTestType == 2) {
            xPathStep = new XPathStep(this.axisVal, 1);
        } else if (this.nodeTestType == 3) {
            xPathStep = new XPathStep(this.axisVal, this.nodeTestNamespace);
        } else {
            String xPathQName = this.nodeTestFunc.name.toString();
            if (!xPathQName.equals("node")) {
                if (xPathQName.equals("text")) {
                    i = 4;
                } else if (xPathQName.equals(ClientCookie.COMMENT_ATTR)) {
                    i = 5;
                } else if (!xPathQName.equals("processing-instruction")) {
                    throw new RuntimeException();
                } else {
                    i = 6;
                }
            }
            xPathStep = new XPathStep(this.axisVal, i);
            if (this.nodeTestFunc.args.size() > 0) {
                xPathStep.literal = (String) ((ASTNodeAbstractExpr) this.nodeTestFunc.args.elementAt(0)).getToken(0).val;
            }
        }
        XPathExpression[] xPathExpressionArr = new XPathExpression[this.predicates.size()];
        for (int i2 = 0; i2 < xPathExpressionArr.length; i2++) {
            xPathExpressionArr[i2] = ((ASTNode) this.predicates.elementAt(i2)).build();
        }
        xPathStep.predicates = xPathExpressionArr;
        return xPathStep;
    }

    public static int validateAxisName(String str) {
        if (str.equals("child")) {
            return 0;
        }
        if (str.equals("descendant")) {
            return 1;
        }
        if (str.equals("parent")) {
            return 2;
        }
        if (str.equals("ancestor")) {
            return 3;
        }
        if (str.equals("following-sibling")) {
            return 4;
        }
        if (str.equals("preceding-sibling")) {
            return 5;
        }
        if (str.equals("following")) {
            return 6;
        }
        if (str.equals("preceding")) {
            return 7;
        }
        if (str.equals("attribute")) {
            return 8;
        }
        if (str.equals("namespace")) {
            return 9;
        }
        if (str.equals("self")) {
            return 10;
        }
        if (str.equals("descendant-or-self")) {
            return 11;
        }
        return str.equals("ancestor-or-self") ? 12 : -1;
    }

    public static boolean validateNodeTypeTest(ASTNodeFunctionCall aSTNodeFunctionCall) {
        String xPathQName = aSTNodeFunctionCall.name.toString();
        if (xPathQName.equals("node") || xPathQName.equals("text") || xPathQName.equals(ClientCookie.COMMENT_ATTR) || xPathQName.equals("processing-instruction")) {
            if (aSTNodeFunctionCall.args.size() == 0) {
                return true;
            }
            if (!xPathQName.equals("processing-instruction") || aSTNodeFunctionCall.args.size() != 1) {
                return false;
            }
            ASTNodeAbstractExpr aSTNodeAbstractExpr = (ASTNodeAbstractExpr) aSTNodeFunctionCall.args.elementAt(0);
            return aSTNodeAbstractExpr.content.size() == 1 && aSTNodeAbstractExpr.getTokenType(0) == 28;
        }
        return false;
    }
}
