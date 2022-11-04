package j$.util.stream;

import java.security.AccessController;
/* loaded from: classes2.dex */
abstract class P3 {

    /* renamed from: a */
    static final boolean f13527a = ((Boolean) AccessController.doPrivileged(O3.f13521a)).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
