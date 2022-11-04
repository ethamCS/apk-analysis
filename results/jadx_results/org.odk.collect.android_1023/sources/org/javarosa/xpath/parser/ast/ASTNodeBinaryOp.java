package org.javarosa.xpath.parser.ast;

import java.util.Vector;
import org.javarosa.xpath.expr.XPathArithExpr;
import org.javarosa.xpath.expr.XPathBinaryOpExpr;
import org.javarosa.xpath.expr.XPathBoolExpr;
import org.javarosa.xpath.expr.XPathCmpExpr;
import org.javarosa.xpath.expr.XPathEqExpr;
import org.javarosa.xpath.expr.XPathExpression;
import org.javarosa.xpath.expr.XPathUnionExpr;
import org.javarosa.xpath.parser.Parser;
import org.javarosa.xpath.parser.Token;
import org.javarosa.xpath.parser.XPathSyntaxException;
/* loaded from: classes.dex */
public class ASTNodeBinaryOp extends ASTNode {
    public static final int ASSOC_LEFT = 1;
    public static final int ASSOC_RIGHT = 2;
    public int associativity;
    public Vector exprs = new Vector();
    public Vector ops = new Vector();

    @Override // org.javarosa.xpath.parser.ast.ASTNode
    public Vector getChildren() {
        return this.exprs;
    }

    @Override // org.javarosa.xpath.parser.ast.ASTNode
    public XPathExpression build() throws XPathSyntaxException {
        XPathExpression xPathExpression;
        if (this.associativity == 1) {
            xPathExpression = ((ASTNode) this.exprs.elementAt(0)).build();
            for (int i = 1; i < this.exprs.size(); i++) {
                xPathExpression = getBinOpExpr(Parser.vectInt(this.ops, i - 1), xPathExpression, ((ASTNode) this.exprs.elementAt(i)).build());
            }
        } else {
            xPathExpression = ((ASTNode) this.exprs.elementAt(this.exprs.size() - 1)).build();
            for (int size = this.exprs.size() - 2; size >= 0; size--) {
                xPathExpression = getBinOpExpr(Parser.vectInt(this.ops, size), ((ASTNode) this.exprs.elementAt(size)).build(), xPathExpression);
            }
        }
        return xPathExpression;
    }

    private XPathBinaryOpExpr getBinOpExpr(int i, XPathExpression xPathExpression, XPathExpression xPathExpression2) throws XPathSyntaxException {
        switch (i) {
            case 1:
                return new XPathBoolExpr(0, xPathExpression, xPathExpression2);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 12:
            case 13:
            case 20:
            case 21:
            case 24:
            case Token.RBRACK /* 25 */:
            case Token.RPAREN /* 26 */:
            case Token.SLASH /* 27 */:
            case Token.STR /* 28 */:
            case Token.UMINUS /* 29 */:
            default:
                throw new XPathSyntaxException();
            case 7:
                return new XPathArithExpr(3, xPathExpression, xPathExpression2);
            case 9:
                return new XPathEqExpr(true, xPathExpression, xPathExpression2);
            case 10:
                return new XPathCmpExpr(1, xPathExpression, xPathExpression2);
            case 11:
                return new XPathCmpExpr(3, xPathExpression, xPathExpression2);
            case 14:
                return new XPathCmpExpr(0, xPathExpression, xPathExpression2);
            case 15:
                return new XPathCmpExpr(2, xPathExpression, xPathExpression2);
            case 16:
                return new XPathArithExpr(1, xPathExpression, xPathExpression2);
            case 17:
                return new XPathArithExpr(4, xPathExpression, xPathExpression2);
            case 18:
                return new XPathArithExpr(2, xPathExpression, xPathExpression2);
            case 19:
                return new XPathEqExpr(false, xPathExpression, xPathExpression2);
            case 22:
                return new XPathBoolExpr(1, xPathExpression, xPathExpression2);
            case 23:
                return new XPathArithExpr(0, xPathExpression, xPathExpression2);
            case Token.UNION /* 30 */:
                return new XPathUnionExpr(xPathExpression, xPathExpression2);
        }
    }
}
