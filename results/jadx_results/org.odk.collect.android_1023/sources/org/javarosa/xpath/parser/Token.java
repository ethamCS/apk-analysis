package org.javarosa.xpath.parser;

import org.javarosa.xpath.expr.XPathQName;
/* loaded from: classes.dex */
public class Token {
    public static final int AND = 1;
    public static final int AT = 2;
    public static final int COMMA = 3;
    public static final int DBL_COLON = 4;
    public static final int DBL_DOT = 5;
    public static final int DBL_SLASH = 6;
    public static final int DIV = 7;
    public static final int DOT = 8;
    public static final int EQ = 9;
    public static final int GT = 10;
    public static final int GTE = 11;
    public static final int LBRACK = 12;
    public static final int LPAREN = 13;
    public static final int LT = 14;
    public static final int LTE = 15;
    public static final int MINUS = 16;
    public static final int MOD = 17;
    public static final int MULT = 18;
    public static final int NEQ = 19;
    public static final int NSWILDCARD = 20;
    public static final int NUM = 21;
    public static final int OR = 22;
    public static final int PLUS = 23;
    public static final int QNAME = 24;
    public static final int RBRACK = 25;
    public static final int RPAREN = 26;
    public static final int SLASH = 27;
    public static final int STR = 28;
    public static final int UMINUS = 29;
    public static final int UNION = 30;
    public static final int VAR = 31;
    public static final int WILDCARD = 32;
    public int type;
    public Object val;

    public Token(int i) {
        this(i, null);
    }

    public Token(int i, Object obj) {
        this.type = i;
        this.val = obj;
    }

    public String toString() {
        switch (this.type) {
            case 1:
                return "AND";
            case 2:
                return "AT";
            case 3:
                return "COMMA";
            case 4:
                return "DBL_COLON";
            case 5:
                return "DBL_DOT";
            case 6:
                return "DBL_SLASH";
            case 7:
                return "DIV";
            case 8:
                return "DOT";
            case 9:
                return "EQ";
            case 10:
                return "GT";
            case 11:
                return "GTE";
            case 12:
                return "LBRACK";
            case 13:
                return "LPAREN";
            case 14:
                return "LT";
            case 15:
                return "LTE";
            case 16:
                return "MINUS";
            case 17:
                return "MOD";
            case 18:
                return "MULT";
            case 19:
                return "NEQ";
            case 20:
                return "NSWILDCARD(" + ((String) this.val) + ")";
            case 21:
                return "NUM(" + ((Double) this.val).toString() + ")";
            case 22:
                return "OR";
            case 23:
                return "PLUS";
            case 24:
                return "QNAME(" + ((XPathQName) this.val).toString() + ")";
            case RBRACK /* 25 */:
                return "RBRACK";
            case RPAREN /* 26 */:
                return "RPAREN";
            case SLASH /* 27 */:
                return "SLASH";
            case STR /* 28 */:
                return "STR(" + ((String) this.val) + ")";
            case UMINUS /* 29 */:
                return "UMINUS";
            case UNION /* 30 */:
                return "UNION";
            case 31:
                return "VAR(" + ((XPathQName) this.val).toString() + ")";
            case 32:
                return "WILDCARD";
            default:
                return null;
        }
    }
}
