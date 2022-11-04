package me.regexp;
/* loaded from: classes.dex */
public class REUtil {
    private static final String complexPrefix = "complex:";

    public static RE createRE(String expression, int matchFlags) throws RESyntaxException {
        return expression.startsWith(complexPrefix) ? new RE(expression.substring(complexPrefix.length()), matchFlags) : new RE(RE.simplePatternToFullRegularExpression(expression), matchFlags);
    }

    public static RE createRE(String expression) throws RESyntaxException {
        return createRE(expression, 0);
    }
}
