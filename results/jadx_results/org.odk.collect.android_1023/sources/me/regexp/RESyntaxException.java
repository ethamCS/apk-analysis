package me.regexp;
/* loaded from: classes.dex */
public class RESyntaxException extends RuntimeException {
    public RESyntaxException(String s) {
        super(new StringBuffer().append("Syntax error: ").append(s).toString());
    }
}
