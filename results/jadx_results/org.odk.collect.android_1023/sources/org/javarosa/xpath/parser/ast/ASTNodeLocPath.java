package org.javarosa.xpath.parser.ast;

import java.util.Vector;
import org.javarosa.xpath.expr.XPathExpression;
import org.javarosa.xpath.expr.XPathFilterExpr;
import org.javarosa.xpath.expr.XPathPathExpr;
import org.javarosa.xpath.expr.XPathStep;
import org.javarosa.xpath.parser.Parser;
import org.javarosa.xpath.parser.XPathSyntaxException;
/* loaded from: classes.dex */
public class ASTNodeLocPath extends ASTNode {
    public Vector clauses = new Vector();
    public Vector separators = new Vector();

    @Override // org.javarosa.xpath.parser.ast.ASTNode
    public Vector getChildren() {
        return this.clauses;
    }

    public boolean isAbsolute() {
        if (this.clauses.size() != this.separators.size()) {
            return this.clauses.size() == 0 && this.separators.size() == 1;
        }
        return true;
    }

    @Override // org.javarosa.xpath.parser.ast.ASTNode
    public XPathExpression build() throws XPathSyntaxException {
        int i = 0;
        Vector vector = new Vector();
        XPathExpression xPathExpression = null;
        int i2 = isAbsolute() ? 1 : 0;
        for (int i3 = 0; i3 < this.clauses.size() + i2; i3++) {
            if (i2 == 0 || i3 > 0) {
                if (this.clauses.elementAt(i3 - i2) instanceof ASTNodePathStep) {
                    vector.addElement(((ASTNodePathStep) this.clauses.elementAt(i3 - i2)).getStep());
                } else {
                    xPathExpression = ((ASTNode) this.clauses.elementAt(i3 - i2)).build();
                }
            }
            if (i3 < this.separators.size() && Parser.vectInt(this.separators, i3) == 6) {
                vector.addElement(XPathStep.ABBR_DESCENDANTS());
            }
        }
        XPathStep[] xPathStepArr = new XPathStep[vector.size()];
        for (int i4 = 0; i4 < xPathStepArr.length; i4++) {
            xPathStepArr[i4] = (XPathStep) vector.elementAt(i4);
        }
        if (xPathExpression == null) {
            if (!isAbsolute()) {
                i = 1;
            }
            return new XPathPathExpr(i, xPathStepArr);
        } else if (xPathExpression instanceof XPathFilterExpr) {
            return new XPathPathExpr((XPathFilterExpr) xPathExpression, xPathStepArr);
        } else {
            return new XPathPathExpr(new XPathFilterExpr(xPathExpression, new XPathExpression[0]), xPathStepArr);
        }
    }
}
