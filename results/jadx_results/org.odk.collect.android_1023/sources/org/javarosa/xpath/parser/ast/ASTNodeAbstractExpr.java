package org.javarosa.xpath.parser.ast;

import java.util.Vector;
import org.javarosa.xpath.expr.XPathExpression;
import org.javarosa.xpath.expr.XPathNumericLiteral;
import org.javarosa.xpath.expr.XPathQName;
import org.javarosa.xpath.expr.XPathStringLiteral;
import org.javarosa.xpath.expr.XPathVariableReference;
import org.javarosa.xpath.parser.Parser;
import org.javarosa.xpath.parser.Token;
import org.javarosa.xpath.parser.XPathSyntaxException;
/* loaded from: classes.dex */
public class ASTNodeAbstractExpr extends ASTNode {
    public static final int CHILD = 1;
    public static final int TOKEN = 2;
    public Vector content = new Vector();

    @Override // org.javarosa.xpath.parser.ast.ASTNode
    public Vector getChildren() {
        Vector vector = new Vector();
        for (int i = 0; i < this.content.size(); i++) {
            if (getType(i) == 1) {
                vector.addElement(this.content.elementAt(i));
            }
        }
        return vector;
    }

    @Override // org.javarosa.xpath.parser.ast.ASTNode
    public XPathExpression build() throws XPathSyntaxException {
        if (this.content.size() == 1) {
            if (getType(0) == 1) {
                return ((ASTNode) this.content.elementAt(0)).build();
            }
            switch (getTokenType(0)) {
                case 21:
                    return new XPathNumericLiteral((Double) getToken(0).val);
                case Token.STR /* 28 */:
                    return new XPathStringLiteral((String) getToken(0).val);
                case 31:
                    return new XPathVariableReference((XPathQName) getToken(0).val);
                default:
                    throw new XPathSyntaxException();
            }
        }
        throw new XPathSyntaxException();
    }

    public boolean isTerminal() {
        if (this.content.size() == 1) {
            int tokenType = getTokenType(0);
            return tokenType == 21 || tokenType == 28 || tokenType == 31;
        }
        return false;
    }

    public boolean isNormalized() {
        if (this.content.size() == 1 && getType(0) == 1) {
            ASTNode aSTNode = (ASTNode) this.content.elementAt(0);
            if (!(aSTNode instanceof ASTNodePathStep) && !(aSTNode instanceof ASTNodePredicate)) {
                return true;
            }
            throw new RuntimeException("shouldn't happen");
        }
        return isTerminal();
    }

    public int getType(int i) {
        Object elementAt = this.content.elementAt(i);
        if (elementAt instanceof Token) {
            return 2;
        }
        if (elementAt instanceof ASTNode) {
            return 1;
        }
        return -1;
    }

    public Token getToken(int i) {
        if (getType(i) == 2) {
            return (Token) this.content.elementAt(i);
        }
        return null;
    }

    public int getTokenType(int i) {
        Token token = getToken(i);
        if (token == null) {
            return -1;
        }
        return token.type;
    }

    public ASTNodeAbstractExpr extract(int i, int i2) {
        ASTNodeAbstractExpr aSTNodeAbstractExpr = new ASTNodeAbstractExpr();
        while (i < i2) {
            aSTNodeAbstractExpr.content.addElement(this.content.elementAt(i));
            i++;
        }
        return aSTNodeAbstractExpr;
    }

    public void condense(ASTNode aSTNode, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.content.removeElementAt(i3);
        }
        this.content.insertElementAt(aSTNode, i);
    }

    public int indexOfBalanced(int i, int i2, int i3, int i4) {
        boolean z;
        int i5 = i + 1;
        int i6 = 0;
        while (i6 >= 0 && i5 < this.content.size()) {
            int tokenType = getTokenType(i5);
            if (i6 == 0 && tokenType == i2) {
                z = true;
                break;
            }
            if (tokenType == i3) {
                i6++;
            } else if (tokenType == i4) {
                i6--;
            }
            i5++;
        }
        z = false;
        if (z) {
            return i5;
        }
        return -1;
    }

    /* loaded from: classes.dex */
    public class Partition {
        public Vector pieces = new Vector();
        public Vector separators = new Vector();

        public Partition() {
            ASTNodeAbstractExpr.this = r2;
        }
    }

    public Partition partition(int[] iArr, int i, int i2) {
        int i3 = 0;
        Partition partition = new Partition();
        Vector vector = new Vector();
        for (int i4 = i; i4 < i2; i4++) {
            int i5 = 0;
            while (true) {
                if (i5 < iArr.length) {
                    if (getTokenType(i4) != iArr[i5]) {
                        i5++;
                    } else {
                        partition.separators.addElement(new Integer(iArr[i5]));
                        vector.addElement(new Integer(i4));
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        while (i3 <= vector.size()) {
            partition.pieces.addElement(extract(i3 == 0 ? i : Parser.vectInt(vector, i3 - 1) + 1, i3 == vector.size() ? i2 : Parser.vectInt(vector, i3)));
            i3++;
        }
        return partition;
    }

    public Partition partitionBalanced(int i, int i2, int i3, int i4) {
        Partition partition = new Partition();
        Vector vector = new Vector();
        int indexOfBalanced = indexOfBalanced(i2, i4, i3, i4);
        if (indexOfBalanced == -1) {
            return null;
        }
        int i5 = i2;
        do {
            i5 = indexOfBalanced(i5, i, i3, i4);
            if (i5 != -1) {
                vector.addElement(new Integer(i5));
                partition.separators.addElement(new Integer(i));
                continue;
            }
        } while (i5 != -1);
        int i6 = 0;
        while (i6 <= vector.size()) {
            partition.pieces.addElement(extract(i6 == 0 ? i2 + 1 : Parser.vectInt(vector, i6 - 1) + 1, i6 == vector.size() ? indexOfBalanced : Parser.vectInt(vector, i6)));
            i6++;
        }
        return partition;
    }
}
