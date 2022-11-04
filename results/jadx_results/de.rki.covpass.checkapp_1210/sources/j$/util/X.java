package j$.util;

import java.security.AccessController;
/* loaded from: classes2.dex */
abstract class X {

    /* renamed from: a */
    static final boolean f13281a = ((Boolean) AccessController.doPrivileged(W.f13280a)).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
