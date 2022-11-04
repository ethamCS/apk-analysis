package j$.util.stream;

import java.security.PrivilegedAction;
/* loaded from: classes2.dex */
public final /* synthetic */ class O3 implements PrivilegedAction {

    /* renamed from: a */
    public static final /* synthetic */ O3 f13521a = new O3();

    private /* synthetic */ O3() {
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        boolean z10 = P3.f13527a;
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}
