package t7;

import java.net.URI;
import java.util.Objects;
/* loaded from: classes.dex */
public class s {
    public o a(URI uri) {
        Objects.requireNonNull(uri, "uri");
        String uri2 = uri.toString();
        boolean z10 = false;
        for (int i10 = 0; i10 < uri2.length(); i10++) {
            z10 |= uri2.charAt(i10) >= 128;
        }
        int i11 = z10 ? 266 : 32;
        if (!d0.a(uri2)) {
            i11 = 267;
        }
        return o.c0(uri2, i11);
    }
}
