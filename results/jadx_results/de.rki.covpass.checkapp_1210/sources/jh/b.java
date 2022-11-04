package jh;

import gg.a0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes3.dex */
class b {

    /* renamed from: a */
    private static Set f14353a = Collections.unmodifiableSet(new HashSet());

    /* renamed from: b */
    private static List f14354b = Collections.unmodifiableList(new ArrayList());

    public static a0 a(byte[] bArr) {
        a0 u10 = a0.u(bArr);
        if (u10 != null) {
            return u10;
        }
        throw new IOException("no content found");
    }
}
