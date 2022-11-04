package org.opendatakit.httpclientandroidlib.impl.conn;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.opendatakit.httpclientandroidlib.conn.DnsResolver;
/* loaded from: classes.dex */
public class SystemDefaultDnsResolver implements DnsResolver {
    @Override // org.opendatakit.httpclientandroidlib.conn.DnsResolver
    public InetAddress[] resolve(String host) throws UnknownHostException {
        return InetAddress.getAllByName(host);
    }
}
