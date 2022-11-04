package org.conscrypt;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class NativeRef {
    final long address;

    /* loaded from: classes3.dex */
    static final class EC_GROUP extends NativeRef {
        public EC_GROUP(long j10) {
            super(j10);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j10) {
            NativeCrypto.EC_GROUP_clear_free(j10);
        }
    }

    /* loaded from: classes3.dex */
    static final class EC_POINT extends NativeRef {
        public EC_POINT(long j10) {
            super(j10);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j10) {
            NativeCrypto.EC_POINT_clear_free(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class EVP_CIPHER_CTX extends NativeRef {
        public EVP_CIPHER_CTX(long j10) {
            super(j10);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j10) {
            NativeCrypto.EVP_CIPHER_CTX_free(j10);
        }
    }

    /* loaded from: classes3.dex */
    static final class EVP_MD_CTX extends NativeRef {
        public EVP_MD_CTX(long j10) {
            super(j10);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j10) {
            NativeCrypto.EVP_MD_CTX_destroy(j10);
        }
    }

    /* loaded from: classes3.dex */
    public static final class EVP_PKEY extends NativeRef {
        public EVP_PKEY(long j10) {
            super(j10);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j10) {
            NativeCrypto.EVP_PKEY_free(j10);
        }
    }

    /* loaded from: classes3.dex */
    static final class EVP_PKEY_CTX extends NativeRef {
        public EVP_PKEY_CTX(long j10) {
            super(j10);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j10) {
            NativeCrypto.EVP_PKEY_CTX_free(j10);
        }
    }

    /* loaded from: classes3.dex */
    static final class HMAC_CTX extends NativeRef {
        public HMAC_CTX(long j10) {
            super(j10);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j10) {
            NativeCrypto.HMAC_CTX_free(j10);
        }
    }

    /* loaded from: classes3.dex */
    public static final class SSL_SESSION extends NativeRef {
        public SSL_SESSION(long j10) {
            super(j10);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j10) {
            NativeCrypto.SSL_SESSION_free(j10);
        }
    }

    NativeRef(long j10) {
        if (j10 != 0) {
            this.address = j10;
            return;
        }
        throw new NullPointerException("address == 0");
    }

    abstract void doFree(long j10);

    public boolean equals(Object obj) {
        return (obj instanceof NativeRef) && ((NativeRef) obj).address == this.address;
    }

    protected void finalize() {
        try {
            long j10 = this.address;
            if (j10 != 0) {
                doFree(j10);
            }
        } finally {
            super.finalize();
        }
    }

    public int hashCode() {
        long j10 = this.address;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
