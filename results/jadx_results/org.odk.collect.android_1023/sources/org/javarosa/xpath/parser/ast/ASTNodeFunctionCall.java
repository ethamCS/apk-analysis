package org.javarosa.xpath.parser.ast;

import java.util.Vector;
import org.javarosa.xpath.expr.XPathExpression;
import org.javarosa.xpath.expr.XPathFuncExpr;
import org.javarosa.xpath.expr.XPathQName;
import org.javarosa.xpath.parser.XPathSyntaxException;
/* loaded from: classes.dex */
public class ASTNodeFunctionCall extends ASTNode {
    public Vector args = new Vector();
    public XPathQName name;

    public ASTNodeFunctionCall(XPathQName xPathQName) {
        this.name = xPathQName;
    }

    @Override // org.javarosa.xpath.parser.ast.ASTNode
    public Vector getChildren() {
        return this.args;
    }

    @Override // org.javarosa.xpath.parser.ast.ASTNode
    public XPathExpression build() throws XPathSyntaxException {
        XPathExpression[] xPathExpressionArr = new XPathExpression[this.args.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.args.size()) {
                xPathExpressionArr[i2] = ((ASTNode) this.args.elementAt(i2)).build();
                i = i2 + 1;
            } else {
                return new XPathFuncExpr(this.name, xPathExpressionArr);
            }
        }
    }
}
