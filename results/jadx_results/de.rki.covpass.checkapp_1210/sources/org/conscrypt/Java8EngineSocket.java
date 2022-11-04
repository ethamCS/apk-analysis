package org.conscrypt;

import j$.util.function.BiFunction;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;
/* loaded from: classes3.dex */
public final class Java8EngineSocket extends ConscryptEngineSocket {
    private BiFunction<SSLSocket, List<String>, String> selector;

    public Java8EngineSocket(String str, int i10, InetAddress inetAddress, int i11, SSLParametersImpl sSLParametersImpl) {
        super(str, i10, inetAddress, i11, sSLParametersImpl);
    }

    public Java8EngineSocket(String str, int i10, SSLParametersImpl sSLParametersImpl) {
        super(str, i10, sSLParametersImpl);
    }

    public Java8EngineSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i10, inetAddress2, i11, sSLParametersImpl);
    }

    public Java8EngineSocket(InetAddress inetAddress, int i10, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i10, sSLParametersImpl);
    }

    public Java8EngineSocket(Socket socket, String str, int i10, boolean z10, SSLParametersImpl sSLParametersImpl) {
        super(socket, str, i10, z10, sSLParametersImpl);
    }

    public Java8EngineSocket(SSLParametersImpl sSLParametersImpl) {
        super(sSLParametersImpl);
    }

    private static ApplicationProtocolSelector toApplicationProtocolSelector(final BiFunction<SSLSocket, List<String>, String> biFunction) {
        if (biFunction == null) {
            return null;
        }
        return new ApplicationProtocolSelector() { // from class: org.conscrypt.Java8EngineSocket.1
            @Override // org.conscrypt.ApplicationProtocolSelector
            public String selectApplicationProtocol(SSLEngine sSLEngine, List<String> list) {
                throw new UnsupportedOperationException();
            }

            @Override // org.conscrypt.ApplicationProtocolSelector
            public String selectApplicationProtocol(SSLSocket sSLSocket, List<String> list) {
                return (String) biFunction.apply(sSLSocket, list);
            }
        };
    }

    @Override // javax.net.ssl.SSLSocket
    public BiFunction<SSLSocket, List<String>, String> getHandshakeApplicationProtocolSelector() {
        return this.selector;
    }

    public void setHandshakeApplicationProtocolSelector(BiFunction<SSLSocket, List<String>, String> biFunction) {
        this.selector = biFunction;
        setApplicationProtocolSelector(toApplicationProtocolSelector(biFunction));
    }

    @Override // javax.net.ssl.SSLSocket
    public /* synthetic */ void setHandshakeApplicationProtocolSelector(java.util.function.BiFunction biFunction) {
        setHandshakeApplicationProtocolSelector(BiFunction.VivifiedWrapper.convert(biFunction));
    }
}
