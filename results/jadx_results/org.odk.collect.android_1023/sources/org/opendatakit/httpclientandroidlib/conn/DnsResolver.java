package org.opendatakit.httpclientandroidlib.conn;

import java.net.InetAddress;
import java.net.UnknownHostException;
/* loaded from: classes.dex */
public interface DnsResolver {
    InetAddress[] resolve(String str) throws UnknownHostException;
}