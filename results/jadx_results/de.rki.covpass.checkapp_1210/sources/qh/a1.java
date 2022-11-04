package qh;

import zh.q1;
/* loaded from: classes3.dex */
public class a1 implements org.bouncycastle.crypto.e {

    /* renamed from: h */
    private static int[] f19922h;

    /* renamed from: i */
    private static int[] f19923i;

    /* renamed from: j */
    private static int[] f19924j;

    /* renamed from: k */
    private static int[] f19925k;

    /* renamed from: a */
    private int f19926a;

    /* renamed from: b */
    private int f19927b;

    /* renamed from: c */
    private long[] f19928c;

    /* renamed from: d */
    private long[] f19929d;

    /* renamed from: e */
    private long[] f19930e;

    /* renamed from: f */
    private d f19931f;

    /* renamed from: g */
    private boolean f19932g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a extends d {
        public a(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // qh.a1.d
        void a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f19934b;
            long[] jArr4 = this.f19933a;
            int[] iArr = a1.f19923i;
            int[] iArr2 = a1.f19925k;
            if (jArr3.length == 33) {
                if (jArr4.length != 5) {
                    throw new IllegalArgumentException();
                }
                long j10 = jArr[0];
                int i10 = 1;
                long j11 = jArr[1];
                long j12 = jArr[2];
                long j13 = jArr[3];
                long j14 = jArr[4];
                long j15 = jArr[5];
                long j16 = jArr[6];
                long j17 = jArr[7];
                long j18 = jArr[8];
                long j19 = jArr[9];
                long j20 = jArr[10];
                long j21 = jArr[11];
                long j22 = jArr[12];
                long j23 = jArr[13];
                long j24 = jArr[14];
                long j25 = jArr[15];
                int i11 = 19;
                while (i11 >= i10) {
                    int i12 = iArr[i11];
                    int i13 = iArr2[i11];
                    int i14 = i12 + 1;
                    long j26 = j10 - jArr3[i14];
                    int i15 = i12 + 2;
                    long j27 = j11 - jArr3[i15];
                    int i16 = i12 + 3;
                    long j28 = j12 - jArr3[i16];
                    int i17 = i12 + 4;
                    long j29 = j13 - jArr3[i17];
                    int i18 = i12 + 5;
                    long j30 = j14 - jArr3[i18];
                    int i19 = i12 + 6;
                    int[] iArr3 = iArr;
                    int[] iArr4 = iArr2;
                    long j31 = j15 - jArr3[i19];
                    int i20 = i12 + 7;
                    long j32 = j16 - jArr3[i20];
                    int i21 = i12 + 8;
                    long j33 = j17 - jArr3[i21];
                    int i22 = i12 + 9;
                    long j34 = j18 - jArr3[i22];
                    int i23 = i12 + 10;
                    long j35 = j19 - jArr3[i23];
                    int i24 = i12 + 11;
                    long j36 = j20 - jArr3[i24];
                    int i25 = i12 + 12;
                    long j37 = j21 - jArr3[i25];
                    int i26 = i12 + 13;
                    long j38 = j22 - jArr3[i26];
                    int i27 = i12 + 14;
                    int i28 = i13 + 1;
                    long j39 = j23 - (jArr3[i27] + jArr4[i28]);
                    int i29 = i12 + 15;
                    long j40 = j24 - (jArr3[i29] + jArr4[i13 + 2]);
                    long[] jArr5 = jArr3;
                    long j41 = i11;
                    long n10 = a1.n(j25 - ((jArr3[i12 + 16] + j41) + 1), 9, j26);
                    long j42 = j26 - n10;
                    long n11 = a1.n(j37, 48, j28);
                    long j43 = j28 - n11;
                    long n12 = a1.n(j39, 35, j32);
                    long j44 = j32 - n12;
                    long[] jArr6 = jArr4;
                    long n13 = a1.n(j35, 52, j30);
                    long j45 = j30 - n13;
                    long n14 = a1.n(j27, 23, j40);
                    long j46 = j40 - n14;
                    long n15 = a1.n(j31, 31, j34);
                    long j47 = j34 - n15;
                    long n16 = a1.n(j29, 37, j36);
                    long j48 = j36 - n16;
                    long n17 = a1.n(j33, 20, j38);
                    long j49 = j38 - n17;
                    long n18 = a1.n(n17, 31, j42);
                    long j50 = j42 - n18;
                    long n19 = a1.n(n15, 44, j43);
                    long j51 = j43 - n19;
                    long n20 = a1.n(n16, 47, j45);
                    long j52 = j45 - n20;
                    long n21 = a1.n(n14, 46, j44);
                    long j53 = j44 - n21;
                    long n22 = a1.n(n10, 19, j49);
                    long j54 = j49 - n22;
                    long n23 = a1.n(n12, 42, j46);
                    long j55 = j46 - n23;
                    long n24 = a1.n(n11, 44, j47);
                    long j56 = j47 - n24;
                    long n25 = a1.n(n13, 25, j48);
                    long j57 = j48 - n25;
                    long n26 = a1.n(n25, 16, j50);
                    long j58 = j50 - n26;
                    long n27 = a1.n(n23, 34, j51);
                    long j59 = j51 - n27;
                    long n28 = a1.n(n24, 56, j53);
                    long j60 = j53 - n28;
                    long n29 = a1.n(n22, 51, j52);
                    long j61 = j52 - n29;
                    long n30 = a1.n(n18, 4, j57);
                    long j62 = j57 - n30;
                    long n31 = a1.n(n20, 53, j54);
                    long j63 = j54 - n31;
                    long n32 = a1.n(n19, 42, j55);
                    long j64 = j55 - n32;
                    long n33 = a1.n(n21, 41, j56);
                    long j65 = j56 - n33;
                    long n34 = a1.n(n33, 41, j58);
                    long n35 = a1.n(n31, 9, j59);
                    long n36 = a1.n(n32, 37, j61);
                    long j66 = j61 - n36;
                    long n37 = a1.n(n30, 31, j60);
                    long j67 = j60 - n37;
                    long n38 = a1.n(n26, 12, j65);
                    long j68 = j65 - n38;
                    long n39 = a1.n(n28, 47, j62);
                    long j69 = j62 - n39;
                    long n40 = a1.n(n27, 44, j63);
                    long j70 = j63 - n40;
                    long n41 = a1.n(n29, 30, j64);
                    long j71 = j64 - n41;
                    long j72 = (j58 - n34) - jArr5[i12];
                    long j73 = n34 - jArr5[i14];
                    long j74 = (j59 - n35) - jArr5[i15];
                    long j75 = n35 - jArr5[i16];
                    long j76 = j66 - jArr5[i17];
                    long j77 = n36 - jArr5[i18];
                    long j78 = j67 - jArr5[i19];
                    long j79 = n37 - jArr5[i20];
                    long j80 = j68 - jArr5[i21];
                    long j81 = n38 - jArr5[i22];
                    long j82 = j69 - jArr5[i23];
                    long j83 = n39 - jArr5[i24];
                    long j84 = j70 - jArr5[i25];
                    long j85 = n40 - (jArr5[i26] + jArr6[i13]);
                    long j86 = j71 - (jArr5[i27] + jArr6[i28]);
                    long n42 = a1.n(n41 - (jArr5[i29] + j41), 5, j72);
                    long j87 = j72 - n42;
                    long n43 = a1.n(j83, 20, j74);
                    long j88 = j74 - n43;
                    long n44 = a1.n(j85, 48, j78);
                    long j89 = j78 - n44;
                    long n45 = a1.n(j81, 41, j76);
                    long j90 = j76 - n45;
                    long n46 = a1.n(j73, 47, j86);
                    long j91 = j86 - n46;
                    long n47 = a1.n(j77, 28, j80);
                    long j92 = j80 - n47;
                    long n48 = a1.n(j75, 16, j82);
                    long j93 = j82 - n48;
                    long n49 = a1.n(j79, 25, j84);
                    long j94 = j84 - n49;
                    long n50 = a1.n(n49, 33, j87);
                    long j95 = j87 - n50;
                    long n51 = a1.n(n47, 4, j88);
                    long j96 = j88 - n51;
                    long n52 = a1.n(n48, 51, j90);
                    long j97 = j90 - n52;
                    long n53 = a1.n(n46, 13, j89);
                    long j98 = j89 - n53;
                    long n54 = a1.n(n42, 34, j94);
                    long j99 = j94 - n54;
                    long n55 = a1.n(n44, 41, j91);
                    long j100 = j91 - n55;
                    long n56 = a1.n(n43, 59, j92);
                    long j101 = j92 - n56;
                    long n57 = a1.n(n45, 17, j93);
                    long j102 = j93 - n57;
                    long n58 = a1.n(n57, 38, j95);
                    long j103 = j95 - n58;
                    long n59 = a1.n(n55, 19, j96);
                    long j104 = j96 - n59;
                    long n60 = a1.n(n56, 10, j98);
                    long j105 = j98 - n60;
                    long n61 = a1.n(n54, 55, j97);
                    long j106 = j97 - n61;
                    long n62 = a1.n(n50, 49, j102);
                    long j107 = j102 - n62;
                    long n63 = a1.n(n52, 18, j99);
                    long j108 = j99 - n63;
                    long n64 = a1.n(n51, 23, j100);
                    long j109 = j100 - n64;
                    long n65 = a1.n(n53, 52, j101);
                    long j110 = j101 - n65;
                    long n66 = a1.n(n65, 24, j103);
                    long j111 = j103 - n66;
                    long n67 = a1.n(n63, 13, j104);
                    j12 = j104 - n67;
                    long n68 = a1.n(n64, 8, j106);
                    long j112 = j106 - n68;
                    long n69 = a1.n(n62, 47, j105);
                    long j113 = j105 - n69;
                    long n70 = a1.n(n58, 8, j110);
                    long j114 = j110 - n70;
                    long n71 = a1.n(n60, 17, j107);
                    long j115 = j107 - n71;
                    j23 = a1.n(n59, 22, j108);
                    j25 = a1.n(n61, 37, j109);
                    j24 = j109 - j25;
                    j21 = n71;
                    j22 = j108 - j23;
                    iArr = iArr3;
                    jArr4 = jArr6;
                    jArr3 = jArr5;
                    j18 = j114;
                    j19 = n70;
                    i10 = 1;
                    j14 = j112;
                    j11 = n66;
                    i11 -= 2;
                    j13 = n67;
                    iArr2 = iArr4;
                    j17 = n69;
                    j20 = j115;
                    j15 = n68;
                    j16 = j113;
                    j10 = j111;
                }
                long[] jArr7 = jArr3;
                long[] jArr8 = jArr4;
                long j116 = j10 - jArr7[0];
                long j117 = j11 - jArr7[1];
                long j118 = j12 - jArr7[2];
                long j119 = j13 - jArr7[3];
                long j120 = j14 - jArr7[4];
                long j121 = j15 - jArr7[5];
                long j122 = j16 - jArr7[6];
                long j123 = j17 - jArr7[7];
                long j124 = j18 - jArr7[8];
                long j125 = j19 - jArr7[9];
                long j126 = j20 - jArr7[10];
                long j127 = j22 - jArr7[12];
                long j128 = j23 - (jArr7[13] + jArr8[0]);
                long j129 = j24 - (jArr7[14] + jArr8[1]);
                jArr2[0] = j116;
                jArr2[1] = j117;
                jArr2[2] = j118;
                jArr2[3] = j119;
                jArr2[4] = j120;
                jArr2[5] = j121;
                jArr2[6] = j122;
                jArr2[7] = j123;
                jArr2[8] = j124;
                jArr2[9] = j125;
                jArr2[10] = j126;
                jArr2[11] = j21 - jArr7[11];
                jArr2[12] = j127;
                jArr2[13] = j128;
                jArr2[14] = j129;
                jArr2[15] = j25 - jArr7[15];
                return;
            }
            throw new IllegalArgumentException();
        }

        @Override // qh.a1.d
        void b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f19934b;
            long[] jArr4 = this.f19933a;
            int[] iArr = a1.f19923i;
            int[] iArr2 = a1.f19925k;
            if (jArr3.length == 33) {
                if (jArr4.length != 5) {
                    throw new IllegalArgumentException();
                }
                long j10 = jArr[0];
                int i10 = 1;
                long j11 = jArr[1];
                long j12 = jArr[2];
                long j13 = jArr[3];
                long j14 = jArr[4];
                long j15 = jArr[5];
                long j16 = jArr[6];
                long j17 = jArr[7];
                long j18 = jArr[8];
                long j19 = jArr[9];
                long j20 = jArr[10];
                long j21 = jArr[11];
                long j22 = jArr[12];
                long j23 = jArr[13];
                long j24 = jArr[14];
                long j25 = jArr[15];
                long j26 = j10 + jArr3[0];
                long j27 = j11 + jArr3[1];
                long j28 = j12 + jArr3[2];
                long j29 = j13 + jArr3[3];
                long j30 = j14 + jArr3[4];
                long j31 = j15 + jArr3[5];
                long j32 = j16 + jArr3[6];
                long j33 = j17 + jArr3[7];
                long j34 = j18 + jArr3[8];
                long j35 = j19 + jArr3[9];
                long j36 = j20 + jArr3[10];
                long j37 = j21 + jArr3[11];
                long j38 = j22 + jArr3[12];
                long j39 = j23 + jArr3[13] + jArr4[0];
                long j40 = j24 + jArr3[14] + jArr4[1];
                long j41 = j29;
                long j42 = j31;
                long j43 = j33;
                long j44 = j35;
                long j45 = j37;
                long j46 = j39;
                long j47 = j25 + jArr3[15];
                while (i10 < 20) {
                    int i11 = iArr[i10];
                    int i12 = iArr2[i10];
                    long j48 = j26 + j27;
                    long j49 = a1.j(j27, 24, j48);
                    long j50 = j28 + j41;
                    long j51 = a1.j(j41, 13, j50);
                    long[] jArr5 = jArr3;
                    int[] iArr3 = iArr;
                    int[] iArr4 = iArr2;
                    long j52 = j42;
                    long j53 = j30 + j52;
                    long j54 = a1.j(j52, 8, j53);
                    int i13 = i10;
                    long j55 = j43;
                    long j56 = j32 + j55;
                    long j57 = a1.j(j55, 47, j56);
                    long[] jArr6 = jArr4;
                    long j58 = j44;
                    long j59 = j34 + j58;
                    long j60 = a1.j(j58, 8, j59);
                    long j61 = j45;
                    long j62 = j36 + j61;
                    long j63 = a1.j(j61, 17, j62);
                    long j64 = j46;
                    long j65 = j38 + j64;
                    long j66 = a1.j(j64, 22, j65);
                    long j67 = j47;
                    long j68 = j40 + j67;
                    long j69 = a1.j(j67, 37, j68);
                    long j70 = j48 + j60;
                    long j71 = a1.j(j60, 38, j70);
                    long j72 = j50 + j66;
                    long j73 = a1.j(j66, 19, j72);
                    long j74 = j56 + j63;
                    long j75 = a1.j(j63, 10, j74);
                    long j76 = j53 + j69;
                    long j77 = a1.j(j69, 55, j76);
                    long j78 = j62 + j57;
                    long j79 = a1.j(j57, 49, j78);
                    long j80 = j65 + j51;
                    long j81 = a1.j(j51, 18, j80);
                    long j82 = j68 + j54;
                    long j83 = a1.j(j54, 23, j82);
                    long j84 = j59 + j49;
                    long j85 = a1.j(j49, 52, j84);
                    long j86 = j70 + j79;
                    long j87 = a1.j(j79, 33, j86);
                    long j88 = j72 + j83;
                    long j89 = a1.j(j83, 4, j88);
                    long j90 = j76 + j81;
                    long j91 = a1.j(j81, 51, j90);
                    long j92 = j74 + j85;
                    long j93 = a1.j(j85, 13, j92);
                    long j94 = j80 + j77;
                    long j95 = a1.j(j77, 34, j94);
                    long j96 = j82 + j73;
                    long j97 = a1.j(j73, 41, j96);
                    long j98 = j84 + j75;
                    long j99 = a1.j(j75, 59, j98);
                    long j100 = j78 + j71;
                    long j101 = a1.j(j71, 17, j100);
                    long j102 = j86 + j95;
                    long j103 = a1.j(j95, 5, j102);
                    long j104 = j88 + j99;
                    long j105 = a1.j(j99, 20, j104);
                    long j106 = j92 + j97;
                    long j107 = a1.j(j97, 48, j106);
                    long j108 = j90 + j101;
                    long j109 = a1.j(j101, 41, j108);
                    long j110 = j96 + j93;
                    long j111 = a1.j(j93, 47, j110);
                    long j112 = j98 + j89;
                    long j113 = a1.j(j89, 28, j112);
                    long j114 = j100 + j91;
                    long j115 = a1.j(j91, 16, j114);
                    long j116 = j94 + j87;
                    long j117 = a1.j(j87, 25, j116);
                    long j118 = j102 + jArr5[i11];
                    int i14 = i11 + 1;
                    long j119 = j111 + jArr5[i14];
                    int i15 = i11 + 2;
                    long j120 = j104 + jArr5[i15];
                    int i16 = i11 + 3;
                    long j121 = j115 + jArr5[i16];
                    int i17 = i11 + 4;
                    long j122 = j108 + jArr5[i17];
                    int i18 = i11 + 5;
                    long j123 = j113 + jArr5[i18];
                    int i19 = i11 + 6;
                    long j124 = j106 + jArr5[i19];
                    int i20 = i11 + 7;
                    long j125 = j117 + jArr5[i20];
                    int i21 = i11 + 8;
                    long j126 = j112 + jArr5[i21];
                    int i22 = i11 + 9;
                    long j127 = j109 + jArr5[i22];
                    int i23 = i11 + 10;
                    long j128 = j114 + jArr5[i23];
                    int i24 = i11 + 11;
                    long j129 = j105 + jArr5[i24];
                    int i25 = i11 + 12;
                    long j130 = j116 + jArr5[i25];
                    int i26 = i11 + 13;
                    long j131 = j107 + jArr5[i26] + jArr6[i12];
                    int i27 = i11 + 14;
                    int i28 = i12 + 1;
                    long j132 = j110 + jArr5[i27] + jArr6[i28];
                    int i29 = i11 + 15;
                    long j133 = jArr5[i29];
                    long j134 = i13;
                    long j135 = j103 + j133 + j134;
                    long j136 = j118 + j119;
                    long j137 = a1.j(j119, 41, j136);
                    long j138 = j120 + j121;
                    long j139 = a1.j(j121, 9, j138);
                    long j140 = j122 + j123;
                    long j141 = a1.j(j123, 37, j140);
                    long j142 = j124 + j125;
                    long j143 = a1.j(j125, 31, j142);
                    long j144 = j126 + j127;
                    long j145 = a1.j(j127, 12, j144);
                    long j146 = j128 + j129;
                    long j147 = a1.j(j129, 47, j146);
                    long j148 = j130 + j131;
                    long j149 = a1.j(j131, 44, j148);
                    long j150 = j132 + j135;
                    long j151 = a1.j(j135, 30, j150);
                    long j152 = j136 + j145;
                    long j153 = a1.j(j145, 16, j152);
                    long j154 = j138 + j149;
                    long j155 = a1.j(j149, 34, j154);
                    long j156 = j142 + j147;
                    long j157 = a1.j(j147, 56, j156);
                    long j158 = j140 + j151;
                    long j159 = a1.j(j151, 51, j158);
                    long j160 = j146 + j143;
                    long j161 = a1.j(j143, 4, j160);
                    long j162 = j148 + j139;
                    long j163 = a1.j(j139, 53, j162);
                    long j164 = j150 + j141;
                    long j165 = a1.j(j141, 42, j164);
                    long j166 = j144 + j137;
                    long j167 = a1.j(j137, 41, j166);
                    long j168 = j152 + j161;
                    long j169 = a1.j(j161, 31, j168);
                    long j170 = j154 + j165;
                    long j171 = a1.j(j165, 44, j170);
                    long j172 = j158 + j163;
                    long j173 = a1.j(j163, 47, j172);
                    long j174 = j156 + j167;
                    long j175 = a1.j(j167, 46, j174);
                    long j176 = j162 + j159;
                    long j177 = a1.j(j159, 19, j176);
                    long j178 = j164 + j155;
                    long j179 = a1.j(j155, 42, j178);
                    long j180 = j166 + j157;
                    long j181 = a1.j(j157, 44, j180);
                    long j182 = j160 + j153;
                    long j183 = a1.j(j153, 25, j182);
                    long j184 = j168 + j177;
                    long j185 = a1.j(j177, 9, j184);
                    long j186 = j170 + j181;
                    long j187 = a1.j(j181, 48, j186);
                    long j188 = j174 + j179;
                    long j189 = a1.j(j179, 35, j188);
                    long j190 = j172 + j183;
                    long j191 = a1.j(j183, 52, j190);
                    long j192 = j178 + j175;
                    long j193 = a1.j(j175, 23, j192);
                    long j194 = j180 + j171;
                    long j195 = a1.j(j171, 31, j194);
                    long j196 = j182 + j173;
                    long j197 = a1.j(j173, 37, j196);
                    long j198 = j176 + j169;
                    long j199 = a1.j(j169, 20, j198);
                    long j200 = j184 + jArr5[i14];
                    long j201 = j193 + jArr5[i15];
                    long j202 = j186 + jArr5[i16];
                    long j203 = j197 + jArr5[i17];
                    long j204 = j190 + jArr5[i18];
                    long j205 = j195 + jArr5[i19];
                    long j206 = j188 + jArr5[i20];
                    long j207 = j199 + jArr5[i21];
                    long j208 = j194 + jArr5[i22];
                    j44 = j191 + jArr5[i23];
                    j36 = j196 + jArr5[i24];
                    j45 = j187 + jArr5[i25];
                    long j209 = j198 + jArr5[i26];
                    j46 = j189 + jArr5[i27] + jArr6[i28];
                    j47 = j185 + jArr5[i11 + 16] + j134 + 1;
                    j43 = j207;
                    j41 = j203;
                    j42 = j205;
                    j40 = j192 + jArr5[i29] + jArr6[i12 + 2];
                    iArr2 = iArr4;
                    j34 = j208;
                    j32 = j206;
                    j38 = j209;
                    j27 = j201;
                    iArr = iArr3;
                    jArr4 = jArr6;
                    jArr3 = jArr5;
                    i10 = i13 + 2;
                    j30 = j204;
                    j26 = j200;
                    j28 = j202;
                }
                jArr2[0] = j26;
                jArr2[1] = j27;
                jArr2[2] = j28;
                jArr2[3] = j41;
                jArr2[4] = j30;
                jArr2[5] = j42;
                jArr2[6] = j32;
                jArr2[7] = j43;
                jArr2[8] = j34;
                jArr2[9] = j44;
                jArr2[10] = j36;
                jArr2[11] = j45;
                jArr2[12] = j38;
                jArr2[13] = j46;
                jArr2[14] = j40;
                jArr2[15] = j47;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b extends d {
        public b(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // qh.a1.d
        void a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f19934b;
            long[] jArr4 = this.f19933a;
            int[] iArr = a1.f19924j;
            int[] iArr2 = a1.f19925k;
            if (jArr3.length == 9) {
                if (jArr4.length != 5) {
                    throw new IllegalArgumentException();
                }
                char c10 = 0;
                long j10 = jArr[0];
                long j11 = jArr[1];
                long j12 = jArr[2];
                long j13 = jArr[3];
                int i10 = 17;
                for (int i11 = 1; i10 >= i11; i11 = 1) {
                    int i12 = iArr[i10];
                    int i13 = iArr2[i10];
                    int i14 = i12 + 1;
                    long j14 = j10 - jArr3[i14];
                    int i15 = i12 + 2;
                    int i16 = i13 + 1;
                    long j15 = j11 - (jArr3[i15] + jArr4[i16]);
                    int i17 = i12 + 3;
                    long j16 = j12 - (jArr3[i17] + jArr4[i13 + 2]);
                    long j17 = i10;
                    long n10 = a1.n(j13 - ((jArr3[i12 + 4] + j17) + 1), 32, j14);
                    long j18 = j14 - n10;
                    int[] iArr3 = iArr;
                    long n11 = a1.n(j15, 32, j16);
                    long j19 = j16 - n11;
                    long n12 = a1.n(n11, 58, j18);
                    long j20 = j18 - n12;
                    long n13 = a1.n(n10, 22, j19);
                    long j21 = j19 - n13;
                    long n14 = a1.n(n13, 46, j20);
                    long j22 = j20 - n14;
                    long n15 = a1.n(n12, 12, j21);
                    long j23 = j21 - n15;
                    long n16 = a1.n(n15, 25, j22);
                    long n17 = a1.n(n14, 33, j23);
                    long j24 = (j22 - n16) - jArr3[i12];
                    long j25 = n16 - (jArr3[i14] + jArr4[i13]);
                    long j26 = (j23 - n17) - (jArr3[i15] + jArr4[i16]);
                    long n18 = a1.n(n17 - (jArr3[i17] + j17), 5, j24);
                    long j27 = j24 - n18;
                    long n19 = a1.n(j25, 37, j26);
                    long j28 = j26 - n19;
                    long n20 = a1.n(n19, 23, j27);
                    long j29 = j27 - n20;
                    long n21 = a1.n(n18, 40, j28);
                    long j30 = j28 - n21;
                    long n22 = a1.n(n21, 52, j29);
                    long j31 = j29 - n22;
                    long n23 = a1.n(n20, 57, j30);
                    long j32 = j30 - n23;
                    long n24 = a1.n(n23, 14, j31);
                    j10 = j31 - n24;
                    j13 = a1.n(n22, 16, j32);
                    j12 = j32 - j13;
                    i10 -= 2;
                    j11 = n24;
                    iArr = iArr3;
                    iArr2 = iArr2;
                    c10 = 0;
                }
                char c11 = c10;
                long j33 = j11 - (jArr3[1] + jArr4[c11]);
                long j34 = j12 - (jArr3[2] + jArr4[1]);
                jArr2[c11] = j10 - jArr3[c11];
                jArr2[1] = j33;
                jArr2[2] = j34;
                jArr2[3] = j13 - jArr3[3];
                return;
            }
            throw new IllegalArgumentException();
        }

        @Override // qh.a1.d
        void b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f19934b;
            long[] jArr4 = this.f19933a;
            int[] iArr = a1.f19924j;
            int[] iArr2 = a1.f19925k;
            if (jArr3.length == 9) {
                if (jArr4.length != 5) {
                    throw new IllegalArgumentException();
                }
                long j10 = jArr[0];
                long j11 = jArr[1];
                long j12 = jArr[2];
                long j13 = jArr[3];
                long j14 = j10 + jArr3[0];
                long j15 = j11 + jArr3[1] + jArr4[0];
                long j16 = j12 + jArr3[2] + jArr4[1];
                int i10 = 1;
                long j17 = j13 + jArr3[3];
                while (i10 < 18) {
                    int i11 = iArr[i10];
                    int i12 = iArr2[i10];
                    long j18 = j14 + j15;
                    long j19 = a1.j(j15, 14, j18);
                    long j20 = j16 + j17;
                    long j21 = a1.j(j17, 16, j20);
                    long j22 = j18 + j21;
                    long j23 = a1.j(j21, 52, j22);
                    long j24 = j20 + j19;
                    long j25 = a1.j(j19, 57, j24);
                    long j26 = j22 + j25;
                    long j27 = a1.j(j25, 23, j26);
                    long j28 = j24 + j23;
                    long j29 = a1.j(j23, 40, j28);
                    long j30 = j26 + j29;
                    long j31 = a1.j(j29, 5, j30);
                    long j32 = j28 + j27;
                    long j33 = a1.j(j27, 37, j32);
                    long j34 = j30 + jArr3[i11];
                    int i13 = i11 + 1;
                    long j35 = j33 + jArr3[i13] + jArr4[i12];
                    int i14 = i11 + 2;
                    int i15 = i12 + 1;
                    long j36 = j32 + jArr3[i14] + jArr4[i15];
                    int i16 = i11 + 3;
                    int[] iArr3 = iArr;
                    long j37 = i10;
                    long j38 = j31 + jArr3[i16] + j37;
                    long j39 = j34 + j35;
                    long j40 = a1.j(j35, 25, j39);
                    long j41 = j36 + j38;
                    long j42 = a1.j(j38, 33, j41);
                    long j43 = j39 + j42;
                    long j44 = a1.j(j42, 46, j43);
                    long j45 = j41 + j40;
                    long j46 = a1.j(j40, 12, j45);
                    long j47 = j43 + j46;
                    long j48 = a1.j(j46, 58, j47);
                    long j49 = j45 + j44;
                    long j50 = a1.j(j44, 22, j49);
                    long j51 = j47 + j50;
                    long j52 = a1.j(j50, 32, j51);
                    long j53 = j49 + j48;
                    long j54 = a1.j(j48, 32, j53);
                    j14 = j51 + jArr3[i13];
                    j15 = j54 + jArr3[i14] + jArr4[i15];
                    j16 = j53 + jArr3[i16] + jArr4[i12 + 2];
                    j17 = j52 + jArr3[i11 + 4] + j37 + 1;
                    i10 += 2;
                    iArr = iArr3;
                    iArr2 = iArr2;
                }
                jArr2[0] = j14;
                jArr2[1] = j15;
                jArr2[2] = j16;
                jArr2[3] = j17;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class c extends d {
        protected c(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // qh.a1.d
        public void a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f19934b;
            long[] jArr4 = this.f19933a;
            int[] iArr = a1.f19922h;
            int[] iArr2 = a1.f19925k;
            if (jArr3.length == 17) {
                if (jArr4.length != 5) {
                    throw new IllegalArgumentException();
                }
                char c10 = 0;
                long j10 = jArr[0];
                int i10 = 1;
                long j11 = jArr[1];
                long j12 = jArr[2];
                long j13 = jArr[3];
                long j14 = jArr[4];
                long j15 = jArr[5];
                long j16 = jArr[6];
                long j17 = jArr[7];
                int i11 = 17;
                while (i11 >= i10) {
                    int i12 = iArr[i11];
                    int i13 = iArr2[i11];
                    int i14 = i12 + 1;
                    long j18 = j10 - jArr3[i14];
                    int i15 = i12 + 2;
                    long j19 = j11 - jArr3[i15];
                    int i16 = i12 + 3;
                    long j20 = j12 - jArr3[i16];
                    int i17 = i12 + 4;
                    long j21 = j13 - jArr3[i17];
                    int i18 = i12 + 5;
                    long j22 = j14 - jArr3[i18];
                    int i19 = i12 + 6;
                    int i20 = i13 + 1;
                    long j23 = j15 - (jArr3[i19] + jArr4[i20]);
                    int i21 = i12 + 7;
                    int[] iArr3 = iArr;
                    int[] iArr4 = iArr2;
                    long j24 = j16 - (jArr3[i21] + jArr4[i13 + 2]);
                    long[] jArr5 = jArr3;
                    long j25 = i11;
                    int i22 = i11;
                    long n10 = a1.n(j19, 8, j24);
                    long j26 = j24 - n10;
                    long n11 = a1.n(j17 - ((jArr3[i12 + 8] + j25) + 1), 35, j18);
                    long j27 = j18 - n11;
                    long n12 = a1.n(j23, 56, j20);
                    long j28 = j20 - n12;
                    long n13 = a1.n(j21, 22, j22);
                    long j29 = j22 - n13;
                    long n14 = a1.n(n10, 25, j29);
                    long j30 = j29 - n14;
                    long n15 = a1.n(n13, 29, j26);
                    long j31 = j26 - n15;
                    long n16 = a1.n(n12, 39, j27);
                    long j32 = j27 - n16;
                    long n17 = a1.n(n11, 43, j28);
                    long j33 = j28 - n17;
                    long n18 = a1.n(n14, 13, j33);
                    long j34 = j33 - n18;
                    long n19 = a1.n(n17, 50, j30);
                    long j35 = j30 - n19;
                    long n20 = a1.n(n16, 10, j31);
                    long j36 = j31 - n20;
                    long n21 = a1.n(n15, 17, j32);
                    long j37 = j32 - n21;
                    long n22 = a1.n(n18, 39, j37);
                    long n23 = a1.n(n21, 30, j34);
                    long n24 = a1.n(n20, 34, j35);
                    long j38 = j35 - n24;
                    long n25 = a1.n(n19, 24, j36);
                    long j39 = (j37 - n22) - jArr5[i12];
                    long j40 = n22 - jArr5[i14];
                    long j41 = (j34 - n23) - jArr5[i15];
                    long j42 = n23 - jArr5[i16];
                    long j43 = j38 - jArr5[i17];
                    long j44 = n24 - (jArr5[i18] + jArr4[i13]);
                    long j45 = (j36 - n25) - (jArr5[i19] + jArr4[i20]);
                    long n26 = a1.n(j40, 44, j45);
                    long j46 = j45 - n26;
                    long n27 = a1.n(n25 - (jArr5[i21] + j25), 9, j39);
                    long j47 = j39 - n27;
                    long n28 = a1.n(j44, 54, j41);
                    long j48 = j41 - n28;
                    long n29 = a1.n(j42, 56, j43);
                    long j49 = j43 - n29;
                    long n30 = a1.n(n26, 17, j49);
                    long j50 = j49 - n30;
                    long n31 = a1.n(n29, 49, j46);
                    long j51 = j46 - n31;
                    long n32 = a1.n(n28, 36, j47);
                    long j52 = j47 - n32;
                    long n33 = a1.n(n27, 39, j48);
                    long j53 = j48 - n33;
                    long n34 = a1.n(n30, 33, j53);
                    long j54 = j53 - n34;
                    long n35 = a1.n(n33, 27, j50);
                    long j55 = j50 - n35;
                    long n36 = a1.n(n32, 14, j51);
                    long j56 = j51 - n36;
                    long[] jArr6 = jArr4;
                    long n37 = a1.n(n31, 42, j52);
                    long j57 = j52 - n37;
                    long n38 = a1.n(n34, 46, j57);
                    long j58 = j57 - n38;
                    j13 = a1.n(n37, 36, j54);
                    long n39 = a1.n(n36, 19, j55);
                    j14 = j55 - n39;
                    j17 = a1.n(n35, 37, j56);
                    j16 = j56 - j17;
                    j12 = j54 - j13;
                    j11 = n38;
                    j15 = n39;
                    i11 = i22 - 2;
                    iArr2 = iArr4;
                    jArr3 = jArr5;
                    c10 = 0;
                    i10 = 1;
                    j10 = j58;
                    jArr4 = jArr6;
                    iArr = iArr3;
                }
                long[] jArr7 = jArr3;
                long[] jArr8 = jArr4;
                char c11 = c10;
                long j59 = j10 - jArr7[c11];
                long j60 = j11 - jArr7[1];
                long j61 = j12 - jArr7[2];
                long j62 = j13 - jArr7[3];
                long j63 = j14 - jArr7[4];
                long j64 = j16 - (jArr7[6] + jArr8[1]);
                jArr2[c11] = j59;
                jArr2[1] = j60;
                jArr2[2] = j61;
                jArr2[3] = j62;
                jArr2[4] = j63;
                jArr2[5] = j15 - (jArr7[5] + jArr8[c11]);
                jArr2[6] = j64;
                jArr2[7] = j17 - jArr7[7];
                return;
            }
            throw new IllegalArgumentException();
        }

        @Override // qh.a1.d
        public void b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f19934b;
            long[] jArr4 = this.f19933a;
            int[] iArr = a1.f19922h;
            int[] iArr2 = a1.f19925k;
            if (jArr3.length == 17) {
                if (jArr4.length != 5) {
                    throw new IllegalArgumentException();
                }
                long j10 = jArr[0];
                long j11 = jArr[1];
                long j12 = jArr[2];
                long j13 = jArr[3];
                long j14 = jArr[4];
                long j15 = jArr[5];
                long j16 = jArr[6];
                long j17 = jArr[7];
                long j18 = j10 + jArr3[0];
                long j19 = j11 + jArr3[1];
                long j20 = j12 + jArr3[2];
                long j21 = j13 + jArr3[3];
                long j22 = j14 + jArr3[4];
                long j23 = j15 + jArr3[5] + jArr4[0];
                long j24 = j16 + jArr3[6] + jArr4[1];
                int i10 = 1;
                long j25 = j21;
                long j26 = j23;
                long j27 = j17 + jArr3[7];
                while (i10 < 18) {
                    int i11 = iArr[i10];
                    int i12 = iArr2[i10];
                    long j28 = j18 + j19;
                    long j29 = a1.j(j19, 46, j28);
                    long j30 = j20 + j25;
                    long j31 = a1.j(j25, 36, j30);
                    long[] jArr5 = jArr3;
                    int[] iArr3 = iArr;
                    long j32 = j26;
                    long j33 = j22 + j32;
                    long j34 = a1.j(j32, 19, j33);
                    int i13 = i10;
                    long j35 = j27;
                    long j36 = j24 + j35;
                    long j37 = a1.j(j35, 37, j36);
                    long j38 = j30 + j29;
                    long j39 = a1.j(j29, 33, j38);
                    long j40 = j33 + j37;
                    long j41 = a1.j(j37, 27, j40);
                    long j42 = j36 + j34;
                    long j43 = a1.j(j34, 14, j42);
                    long j44 = j28 + j31;
                    long j45 = a1.j(j31, 42, j44);
                    long j46 = j40 + j39;
                    long j47 = a1.j(j39, 17, j46);
                    long j48 = j42 + j45;
                    long j49 = a1.j(j45, 49, j48);
                    long j50 = j44 + j43;
                    long j51 = a1.j(j43, 36, j50);
                    long j52 = j38 + j41;
                    long j53 = a1.j(j41, 39, j52);
                    long j54 = j48 + j47;
                    long j55 = a1.j(j47, 44, j54);
                    long j56 = j50 + j53;
                    long j57 = a1.j(j53, 9, j56);
                    long j58 = j52 + j51;
                    long j59 = a1.j(j51, 54, j58);
                    long j60 = j46 + j49;
                    long j61 = a1.j(j49, 56, j60);
                    long j62 = j56 + jArr5[i11];
                    int i14 = i11 + 1;
                    long j63 = j55 + jArr5[i14];
                    int i15 = i11 + 2;
                    long j64 = j58 + jArr5[i15];
                    int i16 = i11 + 3;
                    long j65 = j61 + jArr5[i16];
                    int i17 = i11 + 4;
                    long j66 = j60 + jArr5[i17];
                    int i18 = i11 + 5;
                    long j67 = j59 + jArr5[i18] + jArr4[i12];
                    int i19 = i11 + 6;
                    int i20 = i12 + 1;
                    long j68 = j54 + jArr5[i19] + jArr4[i20];
                    int i21 = i11 + 7;
                    long j69 = i13;
                    long j70 = j57 + jArr5[i21] + j69;
                    long j71 = j62 + j63;
                    long j72 = a1.j(j63, 39, j71);
                    long j73 = j64 + j65;
                    long j74 = a1.j(j65, 30, j73);
                    long j75 = j66 + j67;
                    long j76 = a1.j(j67, 34, j75);
                    long j77 = j68 + j70;
                    long j78 = a1.j(j70, 24, j77);
                    long j79 = j73 + j72;
                    long j80 = a1.j(j72, 13, j79);
                    long j81 = j75 + j78;
                    long j82 = a1.j(j78, 50, j81);
                    long j83 = j77 + j76;
                    long j84 = a1.j(j76, 10, j83);
                    long j85 = j71 + j74;
                    long j86 = a1.j(j74, 17, j85);
                    long j87 = j81 + j80;
                    long j88 = a1.j(j80, 25, j87);
                    long j89 = j83 + j86;
                    long j90 = a1.j(j86, 29, j89);
                    long j91 = j85 + j84;
                    long j92 = a1.j(j84, 39, j91);
                    long j93 = j79 + j82;
                    long j94 = a1.j(j82, 43, j93);
                    long j95 = j89 + j88;
                    long j96 = a1.j(j88, 8, j95);
                    long j97 = j91 + j94;
                    long j98 = a1.j(j94, 35, j97);
                    long j99 = j93 + j92;
                    long j100 = a1.j(j92, 56, j99);
                    long j101 = j87 + j90;
                    long j102 = a1.j(j90, 22, j101);
                    long j103 = j97 + jArr5[i14];
                    j19 = j96 + jArr5[i15];
                    long j104 = j99 + jArr5[i16];
                    long j105 = j102 + jArr5[i17];
                    long j106 = j101 + jArr5[i18];
                    long j107 = j100 + jArr5[i19] + jArr4[i20];
                    j24 = j95 + jArr5[i21] + jArr4[i12 + 2];
                    j27 = j98 + jArr5[i11 + 8] + j69 + 1;
                    j22 = j106;
                    j26 = j107;
                    iArr = iArr3;
                    iArr2 = iArr2;
                    jArr3 = jArr5;
                    i10 = i13 + 2;
                    j25 = j105;
                    j20 = j104;
                    j18 = j103;
                }
                jArr2[0] = j18;
                jArr2[1] = j19;
                jArr2[2] = j20;
                jArr2[3] = j25;
                jArr2[4] = j22;
                jArr2[5] = j26;
                jArr2[6] = j24;
                jArr2[7] = j27;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class d {

        /* renamed from: a */
        protected final long[] f19933a;

        /* renamed from: b */
        protected final long[] f19934b;

        protected d(long[] jArr, long[] jArr2) {
            this.f19934b = jArr;
            this.f19933a = jArr2;
        }

        abstract void a(long[] jArr, long[] jArr2);

        abstract void b(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        f19922h = iArr;
        f19923i = new int[iArr.length];
        f19924j = new int[iArr.length];
        f19925k = new int[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = f19922h;
            if (i10 < iArr2.length) {
                f19923i[i10] = i10 % 17;
                iArr2[i10] = i10 % 9;
                f19924j[i10] = i10 % 5;
                f19925k[i10] = i10 % 3;
                i10++;
            } else {
                return;
            }
        }
    }

    public a1(int i10) {
        d dVar;
        long[] jArr = new long[5];
        this.f19929d = jArr;
        int i11 = i10 / 8;
        this.f19926a = i11;
        int i12 = i11 / 8;
        this.f19927b = i12;
        this.f19928c = new long[i12];
        long[] jArr2 = new long[(i12 * 2) + 1];
        this.f19930e = jArr2;
        if (i10 == 256) {
            dVar = new b(jArr2, jArr);
        } else if (i10 == 512) {
            dVar = new c(jArr2, jArr);
        } else if (i10 != 1024) {
            throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
        } else {
            dVar = new a(jArr2, jArr);
        }
        this.f19931f = dVar;
    }

    public static long g(byte[] bArr, int i10) {
        if (i10 + 8 <= bArr.length) {
            int i11 = i10 + 1;
            int i12 = i11 + 1;
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            int i15 = i14 + 1;
            int i16 = i15 + 1;
            return ((bArr[i16 + 1] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24) | ((bArr[i14] & 255) << 32) | ((bArr[i15] & 255) << 40) | ((bArr[i16] & 255) << 48);
        }
        throw new IllegalArgumentException();
    }

    static long j(long j10, int i10, long j11) {
        return ((j10 >>> (-i10)) | (j10 << i10)) ^ j11;
    }

    private void k(long[] jArr) {
        if (jArr.length != this.f19927b) {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.f19927b + " words)");
        }
        long j10 = 2004413935125273122L;
        int i10 = 0;
        while (true) {
            int i11 = this.f19927b;
            if (i10 >= i11) {
                long[] jArr2 = this.f19930e;
                jArr2[i11] = j10;
                System.arraycopy(jArr2, 0, jArr2, i11 + 1, i11);
                return;
            }
            long[] jArr3 = this.f19930e;
            jArr3[i10] = jArr[i10];
            j10 ^= jArr3[i10];
            i10++;
        }
    }

    private void l(long[] jArr) {
        if (jArr.length == 2) {
            long[] jArr2 = this.f19929d;
            jArr2[0] = jArr[0];
            jArr2[1] = jArr[1];
            jArr2[2] = jArr2[0] ^ jArr2[1];
            jArr2[3] = jArr2[0];
            jArr2[4] = jArr2[1];
            return;
        }
        throw new IllegalArgumentException("Tweak must be 2 words.");
    }

    public static void m(long j10, byte[] bArr, int i10) {
        if (i10 + 8 <= bArr.length) {
            int i11 = i10 + 1;
            bArr[i10] = (byte) j10;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (j10 >> 8);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (j10 >> 16);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (j10 >> 24);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (j10 >> 32);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (j10 >> 40);
            bArr[i16] = (byte) (j10 >> 48);
            bArr[i16 + 1] = (byte) (j10 >> 56);
            return;
        }
        throw new IllegalArgumentException();
    }

    static long n(long j10, int i10, long j11) {
        long j12 = j10 ^ j11;
        return (j12 << (-i10)) | (j12 >>> i10);
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = this.f19926a;
        if (i10 + i12 <= bArr.length) {
            if (i12 + i11 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("Output buffer too short");
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.f19926a; i14 += 8) {
                this.f19928c[i14 >> 3] = g(bArr, i10 + i14);
            }
            long[] jArr = this.f19928c;
            i(jArr, jArr);
            while (true) {
                int i15 = this.f19926a;
                if (i13 >= i15) {
                    return i15;
                }
                m(this.f19928c[i13 >> 3], bArr2, i11 + i13);
                i13 += 8;
            }
        } else {
            throw new org.bouncycastle.crypto.o("Input buffer too short");
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f19926a;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "Threefish-" + (this.f19926a * 8);
    }

    public void h(boolean z10, long[] jArr, long[] jArr2) {
        this.f19932g = z10;
        if (jArr != null) {
            k(jArr);
        }
        if (jArr2 != null) {
            l(jArr2);
        }
    }

    public int i(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.f19930e;
        int i10 = this.f19927b;
        if (jArr3[i10] != 0) {
            if (jArr.length != i10) {
                throw new org.bouncycastle.crypto.o("Input buffer too short");
            }
            if (jArr2.length != i10) {
                throw new org.bouncycastle.crypto.a0("Output buffer too short");
            }
            if (this.f19932g) {
                this.f19931f.b(jArr, jArr2);
            } else {
                this.f19931f.a(jArr, jArr2);
            }
            return this.f19927b;
        }
        throw new IllegalStateException("Threefish engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        byte[] bArr;
        byte[] bArr2;
        long[] jArr;
        long[] jArr2 = null;
        if (iVar instanceof q1) {
            q1 q1Var = (q1) iVar;
            bArr2 = q1Var.a().a();
            bArr = q1Var.b();
        } else if (!(iVar instanceof zh.b1)) {
            throw new IllegalArgumentException("Invalid parameter passed to Threefish init - " + iVar.getClass().getName());
        } else {
            bArr2 = ((zh.b1) iVar).a();
            bArr = null;
        }
        if (bArr2 == null) {
            jArr = null;
        } else if (bArr2.length != this.f19926a) {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.f19926a + " bytes)");
        } else {
            int i10 = this.f19927b;
            jArr = new long[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                jArr[i11] = g(bArr2, i11 * 8);
            }
        }
        if (bArr != null) {
            if (bArr.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[]{g(bArr, 0), g(bArr, 8)};
        }
        h(z10, jArr, jArr2);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}
