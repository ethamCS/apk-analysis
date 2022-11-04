package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
/* loaded from: classes.dex */
public class n1 extends RuntimeException {

    /* renamed from: c */
    private final List<String> f7959c = null;

    public n1(s0 s0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public c0 b() {
        return new c0(getMessage());
    }
}
