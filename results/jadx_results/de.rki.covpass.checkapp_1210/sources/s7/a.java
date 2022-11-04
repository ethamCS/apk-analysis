package s7;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J \u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\r"}, d2 = {"Ls7/a;", BuildConfig.FLAVOR, "Ljava/net/DatagramSocket;", "b", BuildConfig.FLAVOR, "buffer", "Ljava/net/DatagramPacket;", "c", "Ljava/net/InetAddress;", "address", BuildConfig.FLAVOR, "port", "a", "kronos-java"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public interface a {
    DatagramPacket a(byte[] bArr, InetAddress inetAddress, int i10);

    DatagramSocket b();

    DatagramPacket c(byte[] bArr);
}
