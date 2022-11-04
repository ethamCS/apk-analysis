package j$.util.concurrent;

import sun.misc.Unsafe;
/* renamed from: j$.util.concurrent.a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0494a {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
