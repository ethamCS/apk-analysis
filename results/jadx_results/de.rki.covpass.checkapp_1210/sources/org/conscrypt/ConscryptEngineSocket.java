package org.conscrypt;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.SSLParametersImpl;
/* loaded from: classes3.dex */
public class ConscryptEngineSocket extends OpenSSLSocketImpl implements SSLParametersImpl.AliasChooser {
    private static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocate(0);
    private final ConscryptEngine engine;
    private SSLInputStream in;
    private SSLOutputStream out;
    private final Object stateLock = new Object();
    private final Object handshakeLock = new Object();
    private BufferAllocator bufferAllocator = ConscryptEngine.getDefaultBufferAllocator();
    private int state = 0;

    /* renamed from: org.conscrypt.ConscryptEngineSocket$3 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus;
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$Status;

        static {
            int[] iArr = new int[SSLEngineResult.Status.values().length];
            $SwitchMap$javax$net$ssl$SSLEngineResult$Status = iArr;
            try {
                iArr[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$Status[SSLEngineResult.Status.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$Status[SSLEngineResult.Status.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
            $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus = iArr2;
            try {
                iArr2[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class SSLInputStream extends InputStream {
        private final AllocatedBuffer allocatedBuffer;
        private final ByteBuffer fromEngine;
        private final ByteBuffer fromSocket;
        private final int fromSocketArrayOffset;
        private final Object readLock = new Object();
        private final byte[] singleByte = new byte[1];
        private InputStream socketInputStream;

        SSLInputStream() {
            ByteBuffer byteBuffer;
            ConscryptEngineSocket.this = r3;
            if (r3.bufferAllocator != null) {
                AllocatedBuffer allocateDirectBuffer = r3.bufferAllocator.allocateDirectBuffer(r3.engine.getSession().getApplicationBufferSize());
                this.allocatedBuffer = allocateDirectBuffer;
                byteBuffer = allocateDirectBuffer.nioBuffer();
            } else {
                this.allocatedBuffer = null;
                byteBuffer = ByteBuffer.allocateDirect(r3.engine.getSession().getApplicationBufferSize());
            }
            this.fromEngine = byteBuffer;
            this.fromEngine.flip();
            ByteBuffer allocate = ByteBuffer.allocate(r3.engine.getSession().getPacketBufferSize());
            this.fromSocket = allocate;
            this.fromSocketArrayOffset = allocate.arrayOffset();
        }

        private void init() {
            if (this.socketInputStream == null) {
                this.socketInputStream = ConscryptEngineSocket.this.getUnderlyingInputStream();
            }
        }

        private boolean isHandshakeFinished() {
            boolean z10;
            synchronized (ConscryptEngineSocket.this.stateLock) {
                z10 = ConscryptEngineSocket.this.state >= 4;
            }
            return z10;
        }

        private boolean isHandshaking(SSLEngineResult.HandshakeStatus handshakeStatus) {
            int i10 = AnonymousClass3.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[handshakeStatus.ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
            if (r1.bytesProduced() == 0) goto L26;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int processDataFromSocket(byte[] r7, int r8, int r9) {
            /*
                r6 = this;
                org.conscrypt.Platform.blockGuardOnNetwork()
                org.conscrypt.ConscryptEngineSocket r0 = org.conscrypt.ConscryptEngineSocket.this
                r0.checkOpen()
                r6.init()
            Lb:
                java.nio.ByteBuffer r0 = r6.fromEngine
                int r0 = r0.remaining()
                if (r0 <= 0) goto L23
                java.nio.ByteBuffer r0 = r6.fromEngine
                int r0 = r0.remaining()
                int r9 = java.lang.Math.min(r0, r9)
                java.nio.ByteBuffer r0 = r6.fromEngine
                r0.get(r7, r8, r9)
                return r9
            L23:
                java.nio.ByteBuffer r0 = r6.fromSocket
                r0.flip()
                java.nio.ByteBuffer r0 = r6.fromEngine
                r0.clear()
                org.conscrypt.ConscryptEngineSocket r0 = org.conscrypt.ConscryptEngineSocket.this
                org.conscrypt.ConscryptEngine r0 = org.conscrypt.ConscryptEngineSocket.access$400(r0)
                javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()
                boolean r0 = r6.isHandshaking(r0)
                org.conscrypt.ConscryptEngineSocket r1 = org.conscrypt.ConscryptEngineSocket.this
                org.conscrypt.ConscryptEngine r1 = org.conscrypt.ConscryptEngineSocket.access$400(r1)
                java.nio.ByteBuffer r2 = r6.fromSocket
                java.nio.ByteBuffer r3 = r6.fromEngine
                javax.net.ssl.SSLEngineResult r1 = r1.unwrap(r2, r3)
                java.nio.ByteBuffer r2 = r6.fromSocket
                r2.compact()
                java.nio.ByteBuffer r2 = r6.fromEngine
                r2.flip()
                int[] r2 = org.conscrypt.ConscryptEngineSocket.AnonymousClass3.$SwitchMap$javax$net$ssl$SSLEngineResult$Status
                javax.net.ssl.SSLEngineResult$Status r3 = r1.getStatus()
                int r3 = r3.ordinal()
                r2 = r2[r3]
                r3 = 1
                r4 = -1
                r5 = 0
                if (r2 == r3) goto L9c
                r3 = 2
                if (r2 == r3) goto L86
                r7 = 3
                if (r2 != r7) goto L6b
                return r4
            L6b:
                javax.net.ssl.SSLException r7 = new javax.net.ssl.SSLException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "Unexpected engine result "
                r8.append(r9)
                javax.net.ssl.SSLEngineResult$Status r9 = r1.getStatus()
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
            L86:
                if (r0 != 0) goto La3
                javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r1.getHandshakeStatus()
                boolean r0 = r6.isHandshaking(r0)
                if (r0 == 0) goto La3
                boolean r0 = r6.isHandshakeFinished()
                if (r0 == 0) goto La3
                r6.renegotiate()
                return r5
            L9c:
                int r0 = r1.bytesProduced()
                if (r0 != 0) goto La3
                goto La4
            La3:
                r3 = r5
            La4:
                if (r3 != 0) goto Lad
                int r0 = r1.bytesProduced()
                if (r0 != 0) goto Lad
                return r5
            Lad:
                if (r3 == 0) goto Lb
                int r0 = r6.readFromSocket()
                if (r0 != r4) goto Lb
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: org.conscrypt.ConscryptEngineSocket.SSLInputStream.processDataFromSocket(byte[], int, int):int");
        }

        private int readFromSocket() {
            try {
                int position = this.fromSocket.position();
                int read = this.socketInputStream.read(this.fromSocket.array(), this.fromSocketArrayOffset + position, this.fromSocket.limit() - position);
                if (read > 0) {
                    this.fromSocket.position(position + read);
                }
                return read;
            } catch (EOFException unused) {
                return -1;
            }
        }

        private int readUntilDataAvailable(byte[] bArr, int i10, int i11) {
            int processDataFromSocket;
            do {
                processDataFromSocket = processDataFromSocket(bArr, i10, i11);
            } while (processDataFromSocket == 0);
            return processDataFromSocket;
        }

        private void renegotiate() {
            synchronized (ConscryptEngineSocket.this.handshakeLock) {
                ConscryptEngineSocket.this.doHandshake();
            }
        }

        @Override // java.io.InputStream
        public int available() {
            int remaining;
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.readLock) {
                init();
                remaining = this.fromEngine.remaining();
            }
            return remaining;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ConscryptEngineSocket.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.readLock) {
                int read = read(this.singleByte, 0, 1);
                if (read == -1) {
                    return -1;
                }
                if (read == 1) {
                    return this.singleByte[0] & 255;
                }
                throw new SSLException("read incorrect number of bytes " + read);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            int read;
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.readLock) {
                read = read(bArr, 0, bArr.length);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int readUntilDataAvailable;
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.readLock) {
                readUntilDataAvailable = readUntilDataAvailable(bArr, i10, i11);
            }
            return readUntilDataAvailable;
        }

        void release() {
            synchronized (this.readLock) {
                AllocatedBuffer allocatedBuffer = this.allocatedBuffer;
                if (allocatedBuffer != null) {
                    allocatedBuffer.release();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class SSLOutputStream extends OutputStream {
        private OutputStream socketOutputStream;
        private final ByteBuffer target;
        private final int targetArrayOffset;
        private final Object writeLock = new Object();

        SSLOutputStream() {
            ConscryptEngineSocket.this = r2;
            ByteBuffer allocate = ByteBuffer.allocate(r2.engine.getSession().getPacketBufferSize());
            this.target = allocate;
            this.targetArrayOffset = allocate.arrayOffset();
        }

        public void flushInternal() {
            ConscryptEngineSocket.this.checkOpen();
            init();
            this.socketOutputStream.flush();
        }

        private void init() {
            if (this.socketOutputStream == null) {
                this.socketOutputStream = ConscryptEngineSocket.this.getUnderlyingOutputStream();
            }
        }

        public void writeInternal(ByteBuffer byteBuffer) {
            Platform.blockGuardOnNetwork();
            ConscryptEngineSocket.this.checkOpen();
            init();
            int remaining = byteBuffer.remaining();
            do {
                this.target.clear();
                SSLEngineResult wrap = ConscryptEngineSocket.this.engine.wrap(byteBuffer, this.target);
                if (wrap.getStatus() != SSLEngineResult.Status.OK && wrap.getStatus() != SSLEngineResult.Status.CLOSED) {
                    throw new SSLException("Unexpected engine result " + wrap.getStatus());
                } else if (this.target.position() != wrap.bytesProduced()) {
                    throw new SSLException("Engine bytesProduced " + wrap.bytesProduced() + " does not match bytes written " + this.target.position());
                } else {
                    remaining -= wrap.bytesConsumed();
                    if (remaining != byteBuffer.remaining()) {
                        throw new SSLException("Engine did not read the correct number of bytes");
                    }
                    if (wrap.getStatus() == SSLEngineResult.Status.CLOSED && wrap.bytesProduced() == 0) {
                        if (remaining > 0) {
                            throw new SocketException("Socket closed");
                        }
                        return;
                    }
                    this.target.flip();
                    writeToSocket();
                }
            } while (remaining > 0);
        }

        private void writeToSocket() {
            this.socketOutputStream.write(this.target.array(), this.targetArrayOffset, this.target.limit());
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ConscryptEngineSocket.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.writeLock) {
                flushInternal();
            }
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.writeLock) {
                write(new byte[]{(byte) i10});
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.writeLock) {
                writeInternal(ByteBuffer.wrap(bArr));
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.writeLock) {
                writeInternal(ByteBuffer.wrap(bArr, i10, i11));
            }
        }
    }

    public ConscryptEngineSocket(String str, int i10, InetAddress inetAddress, int i11, SSLParametersImpl sSLParametersImpl) {
        super(str, i10, inetAddress, i11);
        this.engine = newEngine(sSLParametersImpl, this);
    }

    public ConscryptEngineSocket(String str, int i10, SSLParametersImpl sSLParametersImpl) {
        super(str, i10);
        this.engine = newEngine(sSLParametersImpl, this);
    }

    public ConscryptEngineSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i10, inetAddress2, i11);
        this.engine = newEngine(sSLParametersImpl, this);
    }

    public ConscryptEngineSocket(InetAddress inetAddress, int i10, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i10);
        this.engine = newEngine(sSLParametersImpl, this);
    }

    public ConscryptEngineSocket(Socket socket, String str, int i10, boolean z10, SSLParametersImpl sSLParametersImpl) {
        super(socket, str, i10, z10);
        this.engine = newEngine(sSLParametersImpl, this);
    }

    public ConscryptEngineSocket(SSLParametersImpl sSLParametersImpl) {
        this.engine = newEngine(sSLParametersImpl, this);
    }

    public void doHandshake() {
        boolean z10 = false;
        while (!z10) {
            try {
                int i10 = AnonymousClass3.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[this.engine.getHandshakeStatus().ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        this.out.writeInternal(EMPTY_BUFFER);
                        this.out.flushInternal();
                    } else if (i10 == 3) {
                        throw new IllegalStateException("Engine tasks are unsupported");
                    } else {
                        if (i10 != 4 && i10 != 5) {
                            throw new IllegalStateException("Unknown handshake status: " + this.engine.getHandshakeStatus());
                        }
                        z10 = true;
                    }
                } else if (this.in.processDataFromSocket(EmptyArray.BYTE, 0, 0) < 0) {
                    throw SSLUtils.toSSLHandshakeException(new EOFException("connection closed"));
                }
            } catch (SSLException e10) {
                drainOutgoingQueue();
                close();
                throw e10;
            } catch (IOException e11) {
                close();
                throw e11;
            } catch (Exception e12) {
                close();
                throw SSLUtils.toSSLHandshakeException(e12);
            }
        }
    }

    private void drainOutgoingQueue() {
        while (this.engine.pendingOutboundEncryptedBytes() > 0) {
            try {
                this.out.writeInternal(EMPTY_BUFFER);
                this.out.flushInternal();
            } catch (IOException unused) {
                return;
            }
        }
    }

    private static X509TrustManager getDelegatingTrustManager(X509TrustManager x509TrustManager, final ConscryptEngineSocket conscryptEngineSocket) {
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            final X509ExtendedTrustManager x509ExtendedTrustManager = (X509ExtendedTrustManager) x509TrustManager;
            return new X509ExtendedTrustManager() { // from class: org.conscrypt.ConscryptEngineSocket.2
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                    x509ExtendedTrustManager.checkClientTrusted(x509CertificateArr, str);
                }

                @Override // javax.net.ssl.X509ExtendedTrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
                    throw new AssertionError("Should not be called");
                }

                @Override // javax.net.ssl.X509ExtendedTrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
                    x509ExtendedTrustManager.checkClientTrusted(x509CertificateArr, str, conscryptEngineSocket);
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                    x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str);
                }

                @Override // javax.net.ssl.X509ExtendedTrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
                    throw new AssertionError("Should not be called");
                }

                @Override // javax.net.ssl.X509ExtendedTrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
                    x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str, conscryptEngineSocket);
                }

                @Override // javax.net.ssl.X509TrustManager
                public X509Certificate[] getAcceptedIssuers() {
                    return x509ExtendedTrustManager.getAcceptedIssuers();
                }
            };
        }
        return x509TrustManager;
    }

    public InputStream getUnderlyingInputStream() {
        return super.getInputStream();
    }

    public OutputStream getUnderlyingOutputStream() {
        return super.getOutputStream();
    }

    private static ConscryptEngine newEngine(SSLParametersImpl sSLParametersImpl, ConscryptEngineSocket conscryptEngineSocket) {
        ConscryptEngine conscryptEngine = new ConscryptEngine(Platform.supportsX509ExtendedTrustManager() ? sSLParametersImpl.cloneWithTrustManager(getDelegatingTrustManager(sSLParametersImpl.getX509TrustManager(), conscryptEngineSocket)) : sSLParametersImpl, conscryptEngineSocket.peerInfoProvider(), conscryptEngineSocket);
        conscryptEngine.setHandshakeListener(new HandshakeListener() { // from class: org.conscrypt.ConscryptEngineSocket.1
            @Override // org.conscrypt.HandshakeListener
            public void onHandshakeFinished() {
                ConscryptEngineSocket.this.onHandshakeFinished();
            }
        });
        conscryptEngine.setUseClientMode(sSLParametersImpl.getUseClientMode());
        return conscryptEngine;
    }

    public void onHandshakeFinished() {
        boolean z10;
        synchronized (this.stateLock) {
            int i10 = this.state;
            if (i10 != 8) {
                if (i10 == 2) {
                    this.state = 4;
                } else if (i10 == 3) {
                    this.state = 5;
                }
                this.stateLock.notifyAll();
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            notifyHandshakeCompletedListeners();
        }
    }

    private void waitForHandshake() {
        startHandshake();
        synchronized (this.stateLock) {
            while (true) {
                int i10 = this.state;
                if (i10 == 5 || i10 == 4 || i10 == 8) {
                    break;
                }
                try {
                    this.stateLock.wait();
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    throw new IOException("Interrupted waiting for handshake", e10);
                }
            }
            throw new SocketException("Socket is closed");
        }
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public final String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr) {
        return x509KeyManager.chooseClientAlias(strArr, x500PrincipalArr, this);
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public final String chooseServerAlias(X509KeyManager x509KeyManager, String str) {
        return x509KeyManager.chooseServerAlias(str, null, this);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj = this.stateLock;
        if (obj == null) {
            return;
        }
        synchronized (obj) {
            int i10 = this.state;
            if (i10 == 8) {
                return;
            }
            this.state = 8;
            this.stateLock.notifyAll();
            try {
                this.engine.closeInbound();
                this.engine.closeOutbound();
                if (i10 >= 2) {
                    drainOutgoingQueue();
                    this.engine.closeOutbound();
                }
                try {
                    super.close();
                    SSLInputStream sSLInputStream = this.in;
                    if (sSLInputStream == null) {
                        return;
                    }
                    sSLInputStream.release();
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    super.close();
                    SSLInputStream sSLInputStream2 = this.in;
                    if (sSLInputStream2 != null) {
                        sSLInputStream2.release();
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public byte[] exportKeyingMaterial(String str, byte[] bArr, int i10) {
        return this.engine.exportKeyingMaterial(str, bArr, i10);
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    final SSLSession getActiveSession() {
        return this.engine.getSession();
    }

    @Override // org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final String getApplicationProtocol() {
        return this.engine.getApplicationProtocol();
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final String[] getApplicationProtocols() {
        return this.engine.getApplicationProtocols();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final byte[] getChannelId() {
        return this.engine.getChannelId();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getEnableSessionCreation() {
        return this.engine.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledCipherSuites() {
        return this.engine.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledProtocols() {
        return this.engine.getEnabledProtocols();
    }

    @Override // org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final String getHandshakeApplicationProtocol() {
        return this.engine.getHandshakeApplicationProtocol();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final SSLSession getHandshakeSession() {
        return this.engine.handshakeSession();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public final InputStream getInputStream() {
        checkOpen();
        waitForHandshake();
        return this.in;
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getNeedClientAuth() {
        return this.engine.getNeedClientAuth();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public final OutputStream getOutputStream() {
        checkOpen();
        waitForHandshake();
        return this.out;
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLParameters getSSLParameters() {
        return this.engine.getSSLParameters();
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLSession getSession() {
        if (isConnected()) {
            try {
                waitForHandshake();
            } catch (IOException unused) {
            }
        }
        return this.engine.getSession();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedCipherSuites() {
        return this.engine.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedProtocols() {
        return this.engine.getSupportedProtocols();
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public byte[] getTlsUnique() {
        return this.engine.getTlsUnique();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getUseClientMode() {
        return this.engine.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getWantClientAuth() {
        return this.engine.getWantClientAuth();
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
        setApplicationProtocolSelector(applicationProtocolSelector == null ? null : new ApplicationProtocolSelectorAdapter(this, applicationProtocolSelector));
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    final void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
        this.engine.setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final void setApplicationProtocols(String[] strArr) {
        this.engine.setApplicationProtocols(strArr);
    }

    public void setBufferAllocator(BufferAllocator bufferAllocator) {
        this.engine.setBufferAllocator(bufferAllocator);
        this.bufferAllocator = bufferAllocator;
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setChannelIdEnabled(boolean z10) {
        this.engine.setChannelIdEnabled(z10);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setChannelIdPrivateKey(PrivateKey privateKey) {
        this.engine.setChannelIdPrivateKey(privateKey);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnableSessionCreation(boolean z10) {
        this.engine.setEnableSessionCreation(z10);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledCipherSuites(String[] strArr) {
        this.engine.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledProtocols(String[] strArr) {
        this.engine.setEnabledProtocols(strArr);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public void setHandshakeTimeout(int i10) {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setHostname(String str) {
        this.engine.setHostname(str);
        super.setHostname(str);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setNeedClientAuth(boolean z10) {
        this.engine.setNeedClientAuth(z10);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setSSLParameters(SSLParameters sSLParameters) {
        this.engine.setSSLParameters(sSLParameters);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setUseClientMode(boolean z10) {
        this.engine.setUseClientMode(z10);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setUseSessionTickets(boolean z10) {
        this.engine.setUseSessionTickets(z10);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setWantClientAuth(boolean z10) {
        this.engine.setWantClientAuth(z10);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() {
        checkOpen();
        try {
            synchronized (this.handshakeLock) {
                synchronized (this.stateLock) {
                    if (this.state != 0) {
                        return;
                    }
                    this.state = 2;
                    this.engine.beginHandshake();
                    this.in = new SSLInputStream();
                    this.out = new SSLOutputStream();
                    doHandshake();
                }
            }
        } catch (SSLException e10) {
            close();
            throw e10;
        } catch (IOException e11) {
            close();
            throw e11;
        } catch (Exception e12) {
            close();
            throw SSLUtils.toSSLHandshakeException(e12);
        }
    }
}
