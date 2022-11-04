package nh;
/* loaded from: classes3.dex */
public class p extends h {

    /* renamed from: d */
    private int f17254d;

    /* renamed from: e */
    private int f17255e;

    /* renamed from: f */
    private int f17256f;

    /* renamed from: g */
    private int f17257g;

    /* renamed from: h */
    private int[] f17258h;

    /* renamed from: i */
    private int f17259i;

    public p() {
        this.f17258h = new int[16];
        reset();
    }

    public p(p pVar) {
        super(pVar);
        this.f17258h = new int[16];
        m(pVar);
    }

    private int i(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    private int j(int i10, int i11, int i12) {
        return (i10 & i12) | (i11 & (~i12));
    }

    private int k(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private int l(int i10, int i11, int i12) {
        return (i10 | (~i12)) ^ i11;
    }

    private void m(p pVar) {
        super.d(pVar);
        this.f17254d = pVar.f17254d;
        this.f17255e = pVar.f17255e;
        this.f17256f = pVar.f17256f;
        this.f17257g = pVar.f17257g;
        int[] iArr = pVar.f17258h;
        System.arraycopy(iArr, 0, this.f17258h, 0, iArr.length);
        this.f17259i = pVar.f17259i;
    }

    private int n(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    private void o(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    @Override // ak.i
    public ak.i a() {
        return new p(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        m((p) iVar);
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        e();
        o(this.f17254d, bArr, i10);
        o(this.f17255e, bArr, i10 + 4);
        o(this.f17256f, bArr, i10 + 8);
        o(this.f17257g, bArr, i10 + 12);
        reset();
        return 16;
    }

    @Override // nh.h
    protected void f() {
        int i10 = this.f17254d;
        int i11 = this.f17255e;
        int i12 = this.f17256f;
        int i13 = this.f17257g;
        int n10 = n(((i10 + i(i11, i12, i13)) + this.f17258h[0]) - 680876936, 7) + i11;
        int n11 = n(((i13 + i(n10, i11, i12)) + this.f17258h[1]) - 389564586, 12) + n10;
        int n12 = n(i12 + i(n11, n10, i11) + this.f17258h[2] + 606105819, 17) + n11;
        int n13 = n(((i11 + i(n12, n11, n10)) + this.f17258h[3]) - 1044525330, 22) + n12;
        int n14 = n(((n10 + i(n13, n12, n11)) + this.f17258h[4]) - 176418897, 7) + n13;
        int n15 = n(n11 + i(n14, n13, n12) + this.f17258h[5] + 1200080426, 12) + n14;
        int n16 = n(((n12 + i(n15, n14, n13)) + this.f17258h[6]) - 1473231341, 17) + n15;
        int n17 = n(((n13 + i(n16, n15, n14)) + this.f17258h[7]) - 45705983, 22) + n16;
        int n18 = n(n14 + i(n17, n16, n15) + this.f17258h[8] + 1770035416, 7) + n17;
        int n19 = n(((n15 + i(n18, n17, n16)) + this.f17258h[9]) - 1958414417, 12) + n18;
        int n20 = n(((n16 + i(n19, n18, n17)) + this.f17258h[10]) - 42063, 17) + n19;
        int n21 = n(((n17 + i(n20, n19, n18)) + this.f17258h[11]) - 1990404162, 22) + n20;
        int n22 = n(n18 + i(n21, n20, n19) + this.f17258h[12] + 1804603682, 7) + n21;
        int n23 = n(((n19 + i(n22, n21, n20)) + this.f17258h[13]) - 40341101, 12) + n22;
        int n24 = n(((n20 + i(n23, n22, n21)) + this.f17258h[14]) - 1502002290, 17) + n23;
        int n25 = n(n21 + i(n24, n23, n22) + this.f17258h[15] + 1236535329, 22) + n24;
        int n26 = n(((n22 + j(n25, n24, n23)) + this.f17258h[1]) - 165796510, 5) + n25;
        int n27 = n(((n23 + j(n26, n25, n24)) + this.f17258h[6]) - 1069501632, 9) + n26;
        int n28 = n(n24 + j(n27, n26, n25) + this.f17258h[11] + 643717713, 14) + n27;
        int n29 = n(((n25 + j(n28, n27, n26)) + this.f17258h[0]) - 373897302, 20) + n28;
        int n30 = n(((n26 + j(n29, n28, n27)) + this.f17258h[5]) - 701558691, 5) + n29;
        int n31 = n(n27 + j(n30, n29, n28) + this.f17258h[10] + 38016083, 9) + n30;
        int n32 = n(((n28 + j(n31, n30, n29)) + this.f17258h[15]) - 660478335, 14) + n31;
        int n33 = n(((n29 + j(n32, n31, n30)) + this.f17258h[4]) - 405537848, 20) + n32;
        int n34 = n(n30 + j(n33, n32, n31) + this.f17258h[9] + 568446438, 5) + n33;
        int n35 = n(((n31 + j(n34, n33, n32)) + this.f17258h[14]) - 1019803690, 9) + n34;
        int n36 = n(((n32 + j(n35, n34, n33)) + this.f17258h[3]) - 187363961, 14) + n35;
        int n37 = n(n33 + j(n36, n35, n34) + this.f17258h[8] + 1163531501, 20) + n36;
        int n38 = n(((n34 + j(n37, n36, n35)) + this.f17258h[13]) - 1444681467, 5) + n37;
        int n39 = n(((n35 + j(n38, n37, n36)) + this.f17258h[2]) - 51403784, 9) + n38;
        int n40 = n(n36 + j(n39, n38, n37) + this.f17258h[7] + 1735328473, 14) + n39;
        int n41 = n(((n37 + j(n40, n39, n38)) + this.f17258h[12]) - 1926607734, 20) + n40;
        int n42 = n(((n38 + k(n41, n40, n39)) + this.f17258h[5]) - 378558, 4) + n41;
        int n43 = n(((n39 + k(n42, n41, n40)) + this.f17258h[8]) - 2022574463, 11) + n42;
        int n44 = n(n40 + k(n43, n42, n41) + this.f17258h[11] + 1839030562, 16) + n43;
        int n45 = n(((n41 + k(n44, n43, n42)) + this.f17258h[14]) - 35309556, 23) + n44;
        int n46 = n(((n42 + k(n45, n44, n43)) + this.f17258h[1]) - 1530992060, 4) + n45;
        int n47 = n(n43 + k(n46, n45, n44) + this.f17258h[4] + 1272893353, 11) + n46;
        int n48 = n(((n44 + k(n47, n46, n45)) + this.f17258h[7]) - 155497632, 16) + n47;
        int n49 = n(((n45 + k(n48, n47, n46)) + this.f17258h[10]) - 1094730640, 23) + n48;
        int n50 = n(n46 + k(n49, n48, n47) + this.f17258h[13] + 681279174, 4) + n49;
        int n51 = n(((n47 + k(n50, n49, n48)) + this.f17258h[0]) - 358537222, 11) + n50;
        int n52 = n(((n48 + k(n51, n50, n49)) + this.f17258h[3]) - 722521979, 16) + n51;
        int n53 = n(n49 + k(n52, n51, n50) + this.f17258h[6] + 76029189, 23) + n52;
        int n54 = n(((n50 + k(n53, n52, n51)) + this.f17258h[9]) - 640364487, 4) + n53;
        int n55 = n(((n51 + k(n54, n53, n52)) + this.f17258h[12]) - 421815835, 11) + n54;
        int n56 = n(n52 + k(n55, n54, n53) + this.f17258h[15] + 530742520, 16) + n55;
        int n57 = n(((n53 + k(n56, n55, n54)) + this.f17258h[2]) - 995338651, 23) + n56;
        int n58 = n(((n54 + l(n57, n56, n55)) + this.f17258h[0]) - 198630844, 6) + n57;
        int n59 = n(n55 + l(n58, n57, n56) + this.f17258h[7] + 1126891415, 10) + n58;
        int n60 = n(((n56 + l(n59, n58, n57)) + this.f17258h[14]) - 1416354905, 15) + n59;
        int n61 = n(((n57 + l(n60, n59, n58)) + this.f17258h[5]) - 57434055, 21) + n60;
        int n62 = n(n58 + l(n61, n60, n59) + this.f17258h[12] + 1700485571, 6) + n61;
        int n63 = n(((n59 + l(n62, n61, n60)) + this.f17258h[3]) - 1894986606, 10) + n62;
        int n64 = n(((n60 + l(n63, n62, n61)) + this.f17258h[10]) - 1051523, 15) + n63;
        int n65 = n(((n61 + l(n64, n63, n62)) + this.f17258h[1]) - 2054922799, 21) + n64;
        int n66 = n(n62 + l(n65, n64, n63) + this.f17258h[8] + 1873313359, 6) + n65;
        int n67 = n(((n63 + l(n66, n65, n64)) + this.f17258h[15]) - 30611744, 10) + n66;
        int n68 = n(((n64 + l(n67, n66, n65)) + this.f17258h[6]) - 1560198380, 15) + n67;
        int n69 = n(n65 + l(n68, n67, n66) + this.f17258h[13] + 1309151649, 21) + n68;
        int n70 = n(((n66 + l(n69, n68, n67)) + this.f17258h[4]) - 145523070, 6) + n69;
        int n71 = n(((n67 + l(n70, n69, n68)) + this.f17258h[11]) - 1120210379, 10) + n70;
        int n72 = n(n68 + l(n71, n70, n69) + this.f17258h[2] + 718787259, 15) + n71;
        this.f17254d += n70;
        this.f17255e += n(((n69 + l(n72, n71, n70)) + this.f17258h[9]) - 343485551, 21) + n72;
        this.f17256f += n72;
        this.f17257g += n71;
        this.f17259i = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f17258h;
            if (i14 != iArr.length) {
                iArr[i14] = 0;
                i14++;
            } else {
                return;
            }
        }
    }

    @Override // nh.h
    protected void g(long j10) {
        if (this.f17259i > 14) {
            f();
        }
        int[] iArr = this.f17258h;
        iArr[14] = (int) ((-1) & j10);
        iArr[15] = (int) (j10 >>> 32);
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "MD5";
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return 16;
    }

    @Override // nh.h
    protected void h(byte[] bArr, int i10) {
        int[] iArr = this.f17258h;
        int i11 = this.f17259i;
        int i12 = i11 + 1;
        this.f17259i = i12;
        iArr[i11] = ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        if (i12 == 16) {
            f();
        }
    }

    @Override // nh.h, org.bouncycastle.crypto.r
    public void reset() {
        super.reset();
        this.f17254d = 1732584193;
        this.f17255e = -271733879;
        this.f17256f = -1732584194;
        this.f17257g = 271733878;
        this.f17259i = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f17258h;
            if (i10 != iArr.length) {
                iArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }
}
