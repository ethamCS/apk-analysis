package androidx.core.net;
/* loaded from: classes.dex */
public class ParseException extends RuntimeException {
    public final String response;

    public ParseException(String str) {
        super(str);
        this.response = str;
    }
}
