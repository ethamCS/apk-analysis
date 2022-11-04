package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
/* loaded from: classes.dex */
public class c0 extends IOException {

    /* renamed from: c */
    private s0 f7828c = null;

    /* loaded from: classes.dex */
    public static class a extends c0 {
        public a(String str) {
            super(str);
        }
    }

    public c0(String str) {
        super(str);
    }

    public static c0 b() {
        return new c0("Protocol message end-group tag did not match expected tag.");
    }

    public static c0 c() {
        return new c0("Protocol message contained an invalid tag (zero).");
    }

    public static c0 e() {
        return new c0("Protocol message had invalid UTF-8.");
    }

    public static a f() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static c0 g() {
        return new c0("CodedInputStream encountered a malformed varint.");
    }

    public static c0 h() {
        return new c0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static c0 i() {
        return new c0("Failed to parse the message.");
    }

    public static c0 j() {
        return new c0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static c0 n() {
        return new c0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public c0 k(s0 s0Var) {
        this.f7828c = s0Var;
        return this;
    }
}
