package s7;

import hc.t;
import java.net.InetAddress;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Ls7/d;", "Ls7/c;", BuildConfig.FLAVOR, "host", "Ljava/net/InetAddress;", "a", "<init>", "()V", "kronos-java"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class d implements c {
    @Override // s7.c
    public InetAddress a(String str) {
        t.e(str, "host");
        InetAddress byName = InetAddress.getByName(str);
        t.d(byName, "InetAddress.getByName(host)");
        return byName;
    }
}
