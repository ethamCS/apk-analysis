package org.bouncycastle.crypto;
/* loaded from: classes3.dex */
public abstract class c0 extends Enum<c0> implements g {

    /* renamed from: c */
    public static final c0 f18638c;

    /* renamed from: d */
    public static final c0 f18639d;

    /* renamed from: q */
    public static final c0 f18640q;

    /* renamed from: x */
    private static final /* synthetic */ c0[] f18641x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a extends c0 {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // org.bouncycastle.crypto.g
        public byte[] b(char[] cArr) {
            return b0.PKCS5PasswordToBytes(cArr);
        }

        @Override // org.bouncycastle.crypto.g
        public String getType() {
            return "ASCII";
        }
    }

    static {
        a aVar = new a("ASCII", 0);
        f18638c = aVar;
        c0 c0Var = new c0("UTF8", 1) { // from class: org.bouncycastle.crypto.c0.b
            @Override // org.bouncycastle.crypto.g
            public byte[] b(char[] cArr) {
                return b0.PKCS5PasswordToUTF8Bytes(cArr);
            }

            @Override // org.bouncycastle.crypto.g
            public String getType() {
                return "UTF8";
            }
        };
        f18639d = c0Var;
        c0 c0Var2 = new c0("PKCS12", 2) { // from class: org.bouncycastle.crypto.c0.c
            @Override // org.bouncycastle.crypto.g
            public byte[] b(char[] cArr) {
                return b0.PKCS12PasswordToBytes(cArr);
            }

            @Override // org.bouncycastle.crypto.g
            public String getType() {
                return "PKCS12";
            }
        };
        f18640q = c0Var2;
        f18641x = new c0[]{aVar, c0Var, c0Var2};
    }

    private c0(String str, int i10) {
        super(str, i10);
    }

    /* synthetic */ c0(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f18641x.clone();
    }
}
