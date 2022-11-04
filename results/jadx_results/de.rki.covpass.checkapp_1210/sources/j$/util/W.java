package j$.util;

import java.security.PrivilegedAction;
/* loaded from: classes2.dex */
public final /* synthetic */ class W implements PrivilegedAction {

    /* renamed from: a */
    public static final /* synthetic */ W f13280a = new W();

    private /* synthetic */ W() {
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        boolean z10 = X.f13281a;
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}
