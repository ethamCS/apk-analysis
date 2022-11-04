package yd;

import java.io.IOException;
/* loaded from: classes3.dex */
public class k extends IOException {

    /* renamed from: c */
    private q f26153c = null;

    public k(String str) {
        super(str);
    }

    public static k c() {
        return new k("Protocol message end-group tag did not match expected tag.");
    }

    public static k e() {
        return new k("Protocol message contained an invalid tag (zero).");
    }

    public static k f() {
        return new k("Protocol message had invalid UTF-8.");
    }

    public static k g() {
        return new k("Protocol message tag had invalid wire type.");
    }

    public static k h() {
        return new k("CodedInputStream encountered a malformed varint.");
    }

    public static k i() {
        return new k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static k j() {
        return new k("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static k n() {
        return new k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static k p() {
        return new k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public q b() {
        return this.f26153c;
    }

    public k k(q qVar) {
        this.f26153c = qVar;
        return this;
    }
}
