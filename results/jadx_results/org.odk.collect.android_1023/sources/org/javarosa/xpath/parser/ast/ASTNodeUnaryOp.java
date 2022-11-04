package org.javarosa.xpath.parser.ast;

import java.util.Vector;
import org.javarosa.xpath.expr.XPathExpression;
import org.javarosa.xpath.expr.XPathNumNegExpr;
import org.javarosa.xpath.parser.XPathSyntaxException;
/* loaded from: classes.dex */
public class ASTNodeUnaryOp extends ASTNode {
    public ASTNode expr;
    public int op;

    @Override // org.javarosa.xpath.parser.ast.ASTNode
    public Vector getChildren() {
        Vector vector = new Vector();
        vector.addElement(this.expr);
        return vector;
    }

    @Override // org.javarosa.xpath.parser.ast.ASTNode
    public XPathExpression build() throws XPathSyntaxException {
        if (this.op == 29) {
            return new XPathNumNegExpr(this.expr.build());
        }
        throw new XPathSyntaxException();
    }
}
