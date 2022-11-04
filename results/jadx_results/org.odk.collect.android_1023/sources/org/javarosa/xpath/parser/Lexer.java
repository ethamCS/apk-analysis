package org.javarosa.xpath.parser;

import java.util.Vector;
import org.javarosa.xpath.expr.XPathQName;
/* loaded from: classes.dex */
public class Lexer {
    public static final int LEX_CONTEXT_OP = 2;
    public static final int LEX_CONTEXT_VAL = 1;

    public static Vector lex(String str) throws XPathSyntaxException {
        int i;
        Vector vector = new Vector();
        int i2 = 0;
        boolean z = true;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            int i3 = getChar(str, i2 + 1);
            Token token = null;
            if (" \n\t\f\r".indexOf(charAt) >= 0) {
                i = 1;
            } else if (charAt == '=') {
                token = new Token(9);
                i = 1;
            } else if (charAt == '!' && i3 == 61) {
                token = new Token(19);
                i = 2;
            } else if (charAt == '<') {
                if (i3 == 61) {
                    token = new Token(15);
                    i = 2;
                } else {
                    token = new Token(14);
                    i = 1;
                }
            } else if (charAt == '>') {
                if (i3 == 61) {
                    token = new Token(11);
                    i = 2;
                } else {
                    token = new Token(10);
                    i = 1;
                }
            } else if (charAt == '+') {
                token = new Token(23);
                i = 1;
            } else if (charAt == '-') {
                token = new Token(z ? 29 : 16);
                i = 1;
            } else if (charAt == '*') {
                token = new Token(z ? 32 : 18);
                i = 1;
            } else if (charAt == '|') {
                token = new Token(30);
                i = 1;
            } else if (charAt == '/') {
                if (i3 == 47) {
                    token = new Token(6);
                    i = 2;
                } else {
                    token = new Token(27);
                    i = 1;
                }
            } else if (charAt == '[') {
                token = new Token(12);
                i = 1;
            } else if (charAt == ']') {
                token = new Token(25);
                i = 1;
            } else if (charAt == '(') {
                token = new Token(13);
                i = 1;
            } else if (charAt == ')') {
                token = new Token(26);
                i = 1;
            } else if (charAt == '.') {
                if (i3 == 46) {
                    token = new Token(5);
                    i = 2;
                } else if (isDigit(i3)) {
                    i = matchNumeric(str, i2);
                    token = new Token(21, Double.valueOf(str.substring(i2, i2 + i)));
                } else {
                    token = new Token(8);
                    i = 1;
                }
            } else if (charAt == '@') {
                token = new Token(2);
                i = 1;
            } else if (charAt == ',') {
                token = new Token(3);
                i = 1;
            } else if (charAt == ':' && i3 == 58) {
                token = new Token(4);
                i = 2;
            } else if (z && i2 + 3 <= str.length() && "and".equals(str.substring(i2, i2 + 3))) {
                token = new Token(1);
                i = 3;
            } else if (z && i2 + 2 <= str.length() && "or".equals(str.substring(i2, i2 + 2))) {
                token = new Token(22);
                i = 2;
            } else if (z && i2 + 3 <= str.length() && "div".equals(str.substring(i2, i2 + 3))) {
                token = new Token(7);
                i = 3;
            } else if (z && i2 + 3 <= str.length() && "mod".equals(str.substring(i2, i2 + 3))) {
                token = new Token(17);
                i = 3;
            } else if (charAt == '$') {
                int matchQName = matchQName(str, i2 + 1);
                if (matchQName == 0) {
                    throw new XPathSyntaxException();
                }
                token = new Token(31, new XPathQName(str.substring(i2 + 1, i2 + matchQName + 1)));
                i = matchQName + 1;
            } else if (charAt == '\'' || charAt == '\"') {
                int indexOf = str.indexOf(charAt, i2 + 1);
                if (indexOf == -1) {
                    throw new XPathSyntaxException();
                }
                token = new Token(28, str.substring(i2 + 1, indexOf));
                i = (indexOf - i2) + 1;
            } else if (isDigit(charAt)) {
                i = matchNumeric(str, i2);
                token = new Token(21, Double.valueOf(str.substring(i2, i2 + i)));
            } else if (z && (isAlpha(charAt) || charAt == '_')) {
                i = matchQName(str, i2);
                String substring = str.substring(i2, i2 + i);
                if (substring.indexOf(58) == -1 && getChar(str, i2 + i) == 58 && getChar(str, i2 + i + 1) == 42) {
                    token = new Token(20, substring);
                    i += 2;
                } else {
                    token = new Token(24, new XPathQName(substring));
                }
            } else {
                throw new XPathSyntaxException();
            }
            if (token != null) {
                z = (token.type == 32 || token.type == 20 || token.type == 24 || token.type == 31 || token.type == 21 || token.type == 28 || token.type == 25 || token.type == 26 || token.type == 8 || token.type == 5) ? true : true;
                vector.addElement(token);
            }
            i2 += i;
        }
        return vector;
    }

    private static int matchNumeric(String str, int i) {
        boolean z = false;
        int i2 = i;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (!isDigit(charAt) && (z || charAt != '.')) {
                break;
            }
            if (charAt == '.') {
                z = true;
            }
            i2++;
        }
        return i2 - i;
    }

    private static int matchQName(String str, int i) {
        int matchNCName;
        int matchNCName2 = matchNCName(str, i);
        if (matchNCName2 > 0 && getChar(str, i + matchNCName2) == 58 && (matchNCName = matchNCName(str, i + matchNCName2 + 1)) > 0) {
            return matchNCName2 + matchNCName + 1;
        }
        return matchNCName2;
    }

    private static int matchNCName(String str, int i) {
        int i2 = i;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (!isAlpha(charAt) && charAt != '_' && (i2 <= i || (!isDigit(charAt) && charAt != '.' && charAt != '-'))) {
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    private static int getChar(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return -1;
    }

    private static boolean isDigit(int i) {
        if (i < 0) {
            return false;
        }
        return Character.isDigit((char) i);
    }

    private static boolean isAlpha(int i) {
        if (i < 0) {
            return false;
        }
        return Character.isLowerCase((char) i) || Character.isUpperCase((char) i);
    }
}
