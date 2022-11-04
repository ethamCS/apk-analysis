package me.regexp;
/* loaded from: classes.dex */
public class RECharacter {
    public static final byte COMBINING_SPACING_MARK = 8;
    public static final byte DECIMAL_DIGIT_NUMBER = 9;
    public static final byte ENCLOSING_MARK = 7;
    public static final byte LETTER_NUMBER = 10;
    public static final byte LINE_SEPARATOR = 13;
    public static final byte LOWERCASE_LETTER = 2;
    public static final byte MODIFIER_LETTER = 4;
    public static final byte NON_SPACING_MARK = 6;
    public static final byte OTHER_LETTER = 5;
    public static final byte PARAGRAPH_SEPARATOR = 14;
    public static final byte PRIVATE_USE = 18;
    public static final byte TITLECASE_LETTER = 3;
    public static final byte UNASSIGNED = 0;
    public static final byte UPPERCASE_LETTER = 1;
    public static final byte CONTROL = 15;
    public static final byte SPACE_SEPARATOR = 12;
    public static final byte CONNECTOR_PUNCTUATION = 23;
    public static final byte MATH_SYMBOL = 25;
    public static final byte DASH_PUNCTUATION = 20;
    public static final byte START_PUNCTUATION = 21;
    public static final byte OTHER_PUNCTUATION = 24;
    public static final byte SURROGATE = 19;
    public static final byte CURRENCY_SYMBOL = 26;
    public static final byte END_PUNCTUATION = 22;
    public static final byte MODIFIER_SYMBOL = 27;
    public static final byte OTHER_SYMBOL = 28;
    public static final byte FORMAT = 16;
    public static final byte OTHER_NUMBER = 11;
    static final byte[] CHAR_CLASSES = {CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, SPACE_SEPARATOR, CONNECTOR_PUNCTUATION, CONNECTOR_PUNCTUATION, CONNECTOR_PUNCTUATION, MATH_SYMBOL, CONNECTOR_PUNCTUATION, CONNECTOR_PUNCTUATION, CONNECTOR_PUNCTUATION, DASH_PUNCTUATION, START_PUNCTUATION, CONNECTOR_PUNCTUATION, OTHER_PUNCTUATION, CONNECTOR_PUNCTUATION, SURROGATE, CONNECTOR_PUNCTUATION, CONNECTOR_PUNCTUATION, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, CONNECTOR_PUNCTUATION, CONNECTOR_PUNCTUATION, OTHER_PUNCTUATION, OTHER_PUNCTUATION, OTHER_PUNCTUATION, CONNECTOR_PUNCTUATION, CONNECTOR_PUNCTUATION, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, DASH_PUNCTUATION, CONNECTOR_PUNCTUATION, START_PUNCTUATION, CURRENCY_SYMBOL, END_PUNCTUATION, CURRENCY_SYMBOL, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, DASH_PUNCTUATION, OTHER_PUNCTUATION, START_PUNCTUATION, OTHER_PUNCTUATION, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, CONTROL, SPACE_SEPARATOR, CONNECTOR_PUNCTUATION, MATH_SYMBOL, MATH_SYMBOL, MATH_SYMBOL, MATH_SYMBOL, MODIFIER_SYMBOL, MODIFIER_SYMBOL, CURRENCY_SYMBOL, MODIFIER_SYMBOL, 2, OTHER_SYMBOL, OTHER_PUNCTUATION, FORMAT, MODIFIER_SYMBOL, CURRENCY_SYMBOL, MODIFIER_SYMBOL, OTHER_PUNCTUATION, OTHER_NUMBER, OTHER_NUMBER, CURRENCY_SYMBOL, 2, MODIFIER_SYMBOL, CONNECTOR_PUNCTUATION, CURRENCY_SYMBOL, OTHER_NUMBER, 2, 29, OTHER_NUMBER, OTHER_NUMBER, OTHER_NUMBER, CONNECTOR_PUNCTUATION, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, OTHER_PUNCTUATION, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, OTHER_PUNCTUATION, 2, 2, 2, 2, 2, 2, 2, 2};

    public static char toLowerCase(char c) {
        return Character.toLowerCase(c);
    }

    public static char toUpperCase(char c) {
        return Character.toUpperCase(c);
    }

    public static boolean isWhitespace(char c) {
        byte type = getType(c);
        return !((type != 12 && type != 13 && type != 14) || c == 160 || c == 8199 || c == 8239) || c == '\t' || c == '\n' || c == 11 || c == '\f' || c == '\r' || c == '\t' || c == 28 || c == 29 || c == 30 || c == 31;
    }

    public static boolean isDigit(char c) {
        byte type = getType(c);
        return type == 9;
    }

    public static boolean isLetter(char c) {
        byte type = getType(c);
        return type == 2 || type == 1 || type == 3 || type == 5;
    }

    public static boolean isLetterOrDigit(char c) {
        return isDigit(c) || isLetter(c);
    }

    public static boolean isSpaceChar(char c) {
        byte type = getType(c);
        return type == 12 || type == 13 || type == 14;
    }

    public static boolean isJavaIdentifierStart(char c) {
        byte type = getType(c);
        return isLetter(c) || type == 10 || c == '$' || c == '_';
    }

    public static boolean isJavaIdentifierPart(char c) {
        return isJavaIdentifierStart(c) || Character.isDigit(c);
    }

    public static byte getType(char c) {
        if (c < CHAR_CLASSES.length) {
            return CHAR_CLASSES[c];
        }
        return (byte) 0;
    }
}
