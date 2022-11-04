package yd;

import java.util.List;
/* loaded from: classes3.dex */
public class w extends RuntimeException {

    /* renamed from: c */
    private final List<String> f26199c = null;

    public w(q qVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public k b() {
        return new k(getMessage());
    }
}
