package s7;

import hc.t;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Ls7/b;", "Ls7/a;", "Ljava/net/DatagramSocket;", "b", BuildConfig.FLAVOR, "buffer", "Ljava/net/DatagramPacket;", "c", "Ljava/net/InetAddress;", "address", BuildConfig.FLAVOR, "port", "a", "<init>", "()V", "kronos-java"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class b implements a {
    @Override // s7.a
    public DatagramPacket a(byte[] bArr, InetAddress inetAddress, int i10) {
        t.e(bArr, "buffer");
        t.e(inetAddress, "address");
        return new DatagramPacket(bArr, bArr.length, inetAddress, i10);
    }

    @Override // s7.a
    public DatagramSocket b() {
        return new DatagramSocket();
    }

    @Override // s7.a
    public DatagramPacket c(byte[] bArr) {
        t.e(bArr, "buffer");
        return new DatagramPacket(bArr, bArr.length);
    }
}
