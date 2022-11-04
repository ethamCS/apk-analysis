package org.javarosa.xpath.parser.ast;

import java.util.Enumeration;
import java.util.Vector;
import org.javarosa.xpath.expr.XPathExpression;
import org.javarosa.xpath.expr.XPathFilterExpr;
import org.javarosa.xpath.parser.XPathSyntaxException;
/* loaded from: classes.dex */
public class ASTNodeFilterExpr extends ASTNode {
    public ASTNodeAbstractExpr expr;
    public Vector predicates = new Vector();

    @Override // org.javarosa.xpath.parser.ast.ASTNode
    public Vector getChildren() {
        Vector vector = new Vector();
        vector.addElement(this.expr);
        Enumeration elements = this.predicates.elements();
        while (elements.hasMoreElements()) {
            vector.addElement(elements.nextElement());
        }
        return vector;
    }

    @Override // org.javarosa.xpath.parser.ast.ASTNode
    public XPathExpression build() throws XPathSyntaxException {
        XPathExpression[] xPathExpressionArr = new XPathExpression[this.predicates.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < xPathExpressionArr.length) {
                xPathExpressionArr[i2] = ((ASTNode) this.predicates.elementAt(i2)).build();
                i = i2 + 1;
            } else {
                return new XPathFilterExpr(this.expr.build(), xPathExpressionArr);
            }
        }
    }
}
