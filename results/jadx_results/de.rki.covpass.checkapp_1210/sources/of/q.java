package of;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lof/q;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "Ljava/net/InetAddress;", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface q {
    public static final a Companion = a.f18287a;

    /* renamed from: a */
    public static final q f18286a = new a.C0289a();

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\b"}, d2 = {"Lof/q$a;", BuildConfig.FLAVOR, "Lof/q;", "SYSTEM", "Lof/q;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f18287a = new a();

        @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lof/q$a$a;", "Lof/q;", BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "Ljava/net/InetAddress;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* renamed from: of.q$a$a */
        /* loaded from: classes3.dex */
        private static final class C0289a implements q {
            @Override // of.q
            public List<InetAddress> a(String str) {
                List<InetAddress> i02;
                hc.t.e(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    hc.t.d(allByName, "getAllByName(hostname)");
                    i02 = ub.m.i0(allByName);
                    return i02;
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException(hc.t.l("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    List<InetAddress> a(String str);
}
