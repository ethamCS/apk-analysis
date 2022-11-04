package nh;
/* loaded from: classes3.dex */
public class s extends h {

    /* renamed from: d */
    private int f17267d;

    /* renamed from: e */
    private int f17268e;

    /* renamed from: f */
    private int f17269f;

    /* renamed from: g */
    private int f17270g;

    /* renamed from: h */
    private int f17271h;

    /* renamed from: i */
    private int[] f17272i;

    /* renamed from: j */
    private int f17273j;

    public s() {
        this.f17272i = new int[16];
        reset();
    }

    public s(s sVar) {
        super(sVar);
        this.f17272i = new int[16];
        j(sVar);
    }

    private int i(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    private void j(s sVar) {
        super.d(sVar);
        this.f17267d = sVar.f17267d;
        this.f17268e = sVar.f17268e;
        this.f17269f = sVar.f17269f;
        this.f17270g = sVar.f17270g;
        this.f17271h = sVar.f17271h;
        int[] iArr = sVar.f17272i;
        System.arraycopy(iArr, 0, this.f17272i, 0, iArr.length);
        this.f17273j = sVar.f17273j;
    }

    private int k(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private int l(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    private int m(int i10, int i11, int i12) {
        return (i10 | (~i11)) ^ i12;
    }

    private int n(int i10, int i11, int i12) {
        return (i10 & i12) | (i11 & (~i12));
    }

    private int o(int i10, int i11, int i12) {
        return i10 ^ (i11 | (~i12));
    }

    private void p(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    @Override // ak.i
    public ak.i a() {
        return new s(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        j((s) iVar);
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        e();
        p(this.f17267d, bArr, i10);
        p(this.f17268e, bArr, i10 + 4);
        p(this.f17269f, bArr, i10 + 8);
        p(this.f17270g, bArr, i10 + 12);
        p(this.f17271h, bArr, i10 + 16);
        reset();
        return 20;
    }

    @Override // nh.h
    protected void f() {
        int i10 = this.f17267d;
        int i11 = this.f17268e;
        int i12 = this.f17269f;
        int i13 = this.f17270g;
        int i14 = this.f17271h;
        int i15 = i(k(i11, i12, i13) + i10 + this.f17272i[0], 11) + i14;
        int i16 = i(i12, 10);
        int i17 = i(k(i15, i11, i16) + i14 + this.f17272i[1], 14) + i13;
        int i18 = i(i11, 10);
        int i19 = i(k(i17, i15, i18) + i13 + this.f17272i[2], 15) + i16;
        int i20 = i(i15, 10);
        int i21 = i(i16 + k(i19, i17, i20) + this.f17272i[3], 12) + i18;
        int i22 = i(i17, 10);
        int i23 = i(i18 + k(i21, i19, i22) + this.f17272i[4], 5) + i20;
        int i24 = i(i19, 10);
        int i25 = i(i20 + k(i23, i21, i24) + this.f17272i[5], 8) + i22;
        int i26 = i(i21, 10);
        int i27 = i(i22 + k(i25, i23, i26) + this.f17272i[6], 7) + i24;
        int i28 = i(i23, 10);
        int i29 = i(i24 + k(i27, i25, i28) + this.f17272i[7], 9) + i26;
        int i30 = i(i25, 10);
        int i31 = i(i26 + k(i29, i27, i30) + this.f17272i[8], 11) + i28;
        int i32 = i(i27, 10);
        int i33 = i(i28 + k(i31, i29, i32) + this.f17272i[9], 13) + i30;
        int i34 = i(i29, 10);
        int i35 = i(i30 + k(i33, i31, i34) + this.f17272i[10], 14) + i32;
        int i36 = i(i31, 10);
        int i37 = i(i32 + k(i35, i33, i36) + this.f17272i[11], 15) + i34;
        int i38 = i(i33, 10);
        int i39 = i(i34 + k(i37, i35, i38) + this.f17272i[12], 6) + i36;
        int i40 = i(i35, 10);
        int i41 = i(i36 + k(i39, i37, i40) + this.f17272i[13], 7) + i38;
        int i42 = i(i37, 10);
        int i43 = i(i38 + k(i41, i39, i42) + this.f17272i[14], 9) + i40;
        int i44 = i(i39, 10);
        int i45 = i(i40 + k(i43, i41, i44) + this.f17272i[15], 8) + i42;
        int i46 = i(i41, 10);
        int i47 = i(i10 + o(i11, i12, i13) + this.f17272i[5] + 1352829926, 8) + i14;
        int i48 = i(i12, 10);
        int i49 = i(i14 + o(i47, i11, i48) + this.f17272i[14] + 1352829926, 9) + i13;
        int i50 = i(i11, 10);
        int i51 = i(i13 + o(i49, i47, i50) + this.f17272i[7] + 1352829926, 9) + i48;
        int i52 = i(i47, 10);
        int i53 = i(i48 + o(i51, i49, i52) + this.f17272i[0] + 1352829926, 11) + i50;
        int i54 = i(i49, 10);
        int i55 = i(i50 + o(i53, i51, i54) + this.f17272i[9] + 1352829926, 13) + i52;
        int i56 = i(i51, 10);
        int i57 = i(i52 + o(i55, i53, i56) + this.f17272i[2] + 1352829926, 15) + i54;
        int i58 = i(i53, 10);
        int i59 = i(i54 + o(i57, i55, i58) + this.f17272i[11] + 1352829926, 15) + i56;
        int i60 = i(i55, 10);
        int i61 = i(i56 + o(i59, i57, i60) + this.f17272i[4] + 1352829926, 5) + i58;
        int i62 = i(i57, 10);
        int i63 = i(i58 + o(i61, i59, i62) + this.f17272i[13] + 1352829926, 7) + i60;
        int i64 = i(i59, 10);
        int i65 = i(i60 + o(i63, i61, i64) + this.f17272i[6] + 1352829926, 7) + i62;
        int i66 = i(i61, 10);
        int i67 = i(i62 + o(i65, i63, i66) + this.f17272i[15] + 1352829926, 8) + i64;
        int i68 = i(i63, 10);
        int i69 = i(i64 + o(i67, i65, i68) + this.f17272i[8] + 1352829926, 11) + i66;
        int i70 = i(i65, 10);
        int i71 = i(i66 + o(i69, i67, i70) + this.f17272i[1] + 1352829926, 14) + i68;
        int i72 = i(i67, 10);
        int i73 = i(i68 + o(i71, i69, i72) + this.f17272i[10] + 1352829926, 14) + i70;
        int i74 = i(i69, 10);
        int i75 = i(i70 + o(i73, i71, i74) + this.f17272i[3] + 1352829926, 12) + i72;
        int i76 = i(i71, 10);
        int i77 = i(i72 + o(i75, i73, i76) + this.f17272i[12] + 1352829926, 6) + i74;
        int i78 = i(i73, 10);
        int i79 = i(i42 + l(i45, i43, i46) + this.f17272i[7] + 1518500249, 7) + i44;
        int i80 = i(i43, 10);
        int i81 = i(i44 + l(i79, i45, i80) + this.f17272i[4] + 1518500249, 6) + i46;
        int i82 = i(i45, 10);
        int i83 = i(i46 + l(i81, i79, i82) + this.f17272i[13] + 1518500249, 8) + i80;
        int i84 = i(i79, 10);
        int i85 = i(i80 + l(i83, i81, i84) + this.f17272i[1] + 1518500249, 13) + i82;
        int i86 = i(i81, 10);
        int i87 = i(i82 + l(i85, i83, i86) + this.f17272i[10] + 1518500249, 11) + i84;
        int i88 = i(i83, 10);
        int i89 = i(i84 + l(i87, i85, i88) + this.f17272i[6] + 1518500249, 9) + i86;
        int i90 = i(i85, 10);
        int i91 = i(i86 + l(i89, i87, i90) + this.f17272i[15] + 1518500249, 7) + i88;
        int i92 = i(i87, 10);
        int i93 = i(i88 + l(i91, i89, i92) + this.f17272i[3] + 1518500249, 15) + i90;
        int i94 = i(i89, 10);
        int i95 = i(i90 + l(i93, i91, i94) + this.f17272i[12] + 1518500249, 7) + i92;
        int i96 = i(i91, 10);
        int i97 = i(i92 + l(i95, i93, i96) + this.f17272i[0] + 1518500249, 12) + i94;
        int i98 = i(i93, 10);
        int i99 = i(i94 + l(i97, i95, i98) + this.f17272i[9] + 1518500249, 15) + i96;
        int i100 = i(i95, 10);
        int i101 = i(i96 + l(i99, i97, i100) + this.f17272i[5] + 1518500249, 9) + i98;
        int i102 = i(i97, 10);
        int i103 = i(i98 + l(i101, i99, i102) + this.f17272i[2] + 1518500249, 11) + i100;
        int i104 = i(i99, 10);
        int i105 = i(i100 + l(i103, i101, i104) + this.f17272i[14] + 1518500249, 7) + i102;
        int i106 = i(i101, 10);
        int i107 = i(i102 + l(i105, i103, i106) + this.f17272i[11] + 1518500249, 13) + i104;
        int i108 = i(i103, 10);
        int i109 = i(i104 + l(i107, i105, i108) + this.f17272i[8] + 1518500249, 12) + i106;
        int i110 = i(i105, 10);
        int i111 = i(i74 + n(i77, i75, i78) + this.f17272i[6] + 1548603684, 9) + i76;
        int i112 = i(i75, 10);
        int i113 = i(i76 + n(i111, i77, i112) + this.f17272i[11] + 1548603684, 13) + i78;
        int i114 = i(i77, 10);
        int i115 = i(i78 + n(i113, i111, i114) + this.f17272i[3] + 1548603684, 15) + i112;
        int i116 = i(i111, 10);
        int i117 = i(i112 + n(i115, i113, i116) + this.f17272i[7] + 1548603684, 7) + i114;
        int i118 = i(i113, 10);
        int i119 = i(i114 + n(i117, i115, i118) + this.f17272i[0] + 1548603684, 12) + i116;
        int i120 = i(i115, 10);
        int i121 = i(i116 + n(i119, i117, i120) + this.f17272i[13] + 1548603684, 8) + i118;
        int i122 = i(i117, 10);
        int i123 = i(i118 + n(i121, i119, i122) + this.f17272i[5] + 1548603684, 9) + i120;
        int i124 = i(i119, 10);
        int i125 = i(i120 + n(i123, i121, i124) + this.f17272i[10] + 1548603684, 11) + i122;
        int i126 = i(i121, 10);
        int i127 = i(i122 + n(i125, i123, i126) + this.f17272i[14] + 1548603684, 7) + i124;
        int i128 = i(i123, 10);
        int i129 = i(i124 + n(i127, i125, i128) + this.f17272i[15] + 1548603684, 7) + i126;
        int i130 = i(i125, 10);
        int i131 = i(i126 + n(i129, i127, i130) + this.f17272i[8] + 1548603684, 12) + i128;
        int i132 = i(i127, 10);
        int i133 = i(i128 + n(i131, i129, i132) + this.f17272i[12] + 1548603684, 7) + i130;
        int i134 = i(i129, 10);
        int i135 = i(i130 + n(i133, i131, i134) + this.f17272i[4] + 1548603684, 6) + i132;
        int i136 = i(i131, 10);
        int i137 = i(i132 + n(i135, i133, i136) + this.f17272i[9] + 1548603684, 15) + i134;
        int i138 = i(i133, 10);
        int i139 = i(i134 + n(i137, i135, i138) + this.f17272i[1] + 1548603684, 13) + i136;
        int i140 = i(i135, 10);
        int i141 = i(i136 + n(i139, i137, i140) + this.f17272i[2] + 1548603684, 11) + i138;
        int i142 = i(i137, 10);
        int i143 = i(i106 + m(i109, i107, i110) + this.f17272i[3] + 1859775393, 11) + i108;
        int i144 = i(i107, 10);
        int i145 = i(i108 + m(i143, i109, i144) + this.f17272i[10] + 1859775393, 13) + i110;
        int i146 = i(i109, 10);
        int i147 = i(i110 + m(i145, i143, i146) + this.f17272i[14] + 1859775393, 6) + i144;
        int i148 = i(i143, 10);
        int i149 = i(i144 + m(i147, i145, i148) + this.f17272i[4] + 1859775393, 7) + i146;
        int i150 = i(i145, 10);
        int i151 = i(i146 + m(i149, i147, i150) + this.f17272i[9] + 1859775393, 14) + i148;
        int i152 = i(i147, 10);
        int i153 = i(i148 + m(i151, i149, i152) + this.f17272i[15] + 1859775393, 9) + i150;
        int i154 = i(i149, 10);
        int i155 = i(i150 + m(i153, i151, i154) + this.f17272i[8] + 1859775393, 13) + i152;
        int i156 = i(i151, 10);
        int i157 = i(i152 + m(i155, i153, i156) + this.f17272i[1] + 1859775393, 15) + i154;
        int i158 = i(i153, 10);
        int i159 = i(i154 + m(i157, i155, i158) + this.f17272i[2] + 1859775393, 14) + i156;
        int i160 = i(i155, 10);
        int i161 = i(i156 + m(i159, i157, i160) + this.f17272i[7] + 1859775393, 8) + i158;
        int i162 = i(i157, 10);
        int i163 = i(i158 + m(i161, i159, i162) + this.f17272i[0] + 1859775393, 13) + i160;
        int i164 = i(i159, 10);
        int i165 = i(i160 + m(i163, i161, i164) + this.f17272i[6] + 1859775393, 6) + i162;
        int i166 = i(i161, 10);
        int i167 = i(i162 + m(i165, i163, i166) + this.f17272i[13] + 1859775393, 5) + i164;
        int i168 = i(i163, 10);
        int i169 = i(i164 + m(i167, i165, i168) + this.f17272i[11] + 1859775393, 12) + i166;
        int i170 = i(i165, 10);
        int i171 = i(i166 + m(i169, i167, i170) + this.f17272i[5] + 1859775393, 7) + i168;
        int i172 = i(i167, 10);
        int i173 = i(i168 + m(i171, i169, i172) + this.f17272i[12] + 1859775393, 5) + i170;
        int i174 = i(i169, 10);
        int i175 = i(i138 + m(i141, i139, i142) + this.f17272i[15] + 1836072691, 9) + i140;
        int i176 = i(i139, 10);
        int i177 = i(i140 + m(i175, i141, i176) + this.f17272i[5] + 1836072691, 7) + i142;
        int i178 = i(i141, 10);
        int i179 = i(i142 + m(i177, i175, i178) + this.f17272i[1] + 1836072691, 15) + i176;
        int i180 = i(i175, 10);
        int i181 = i(i176 + m(i179, i177, i180) + this.f17272i[3] + 1836072691, 11) + i178;
        int i182 = i(i177, 10);
        int i183 = i(i178 + m(i181, i179, i182) + this.f17272i[7] + 1836072691, 8) + i180;
        int i184 = i(i179, 10);
        int i185 = i(i180 + m(i183, i181, i184) + this.f17272i[14] + 1836072691, 6) + i182;
        int i186 = i(i181, 10);
        int i187 = i(i182 + m(i185, i183, i186) + this.f17272i[6] + 1836072691, 6) + i184;
        int i188 = i(i183, 10);
        int i189 = i(i184 + m(i187, i185, i188) + this.f17272i[9] + 1836072691, 14) + i186;
        int i190 = i(i185, 10);
        int i191 = i(i186 + m(i189, i187, i190) + this.f17272i[11] + 1836072691, 12) + i188;
        int i192 = i(i187, 10);
        int i193 = i(i188 + m(i191, i189, i192) + this.f17272i[8] + 1836072691, 13) + i190;
        int i194 = i(i189, 10);
        int i195 = i(i190 + m(i193, i191, i194) + this.f17272i[12] + 1836072691, 5) + i192;
        int i196 = i(i191, 10);
        int i197 = i(i192 + m(i195, i193, i196) + this.f17272i[2] + 1836072691, 14) + i194;
        int i198 = i(i193, 10);
        int i199 = i(i194 + m(i197, i195, i198) + this.f17272i[10] + 1836072691, 13) + i196;
        int i200 = i(i195, 10);
        int i201 = i(i196 + m(i199, i197, i200) + this.f17272i[0] + 1836072691, 13) + i198;
        int i202 = i(i197, 10);
        int i203 = i(i198 + m(i201, i199, i202) + this.f17272i[4] + 1836072691, 7) + i200;
        int i204 = i(i199, 10);
        int i205 = i(i200 + m(i203, i201, i204) + this.f17272i[13] + 1836072691, 5) + i202;
        int i206 = i(i201, 10);
        int i207 = i(((i170 + n(i173, i171, i174)) + this.f17272i[1]) - 1894007588, 11) + i172;
        int i208 = i(i171, 10);
        int i209 = i(((i172 + n(i207, i173, i208)) + this.f17272i[9]) - 1894007588, 12) + i174;
        int i210 = i(i173, 10);
        int i211 = i(((i174 + n(i209, i207, i210)) + this.f17272i[11]) - 1894007588, 14) + i208;
        int i212 = i(i207, 10);
        int i213 = i(((i208 + n(i211, i209, i212)) + this.f17272i[10]) - 1894007588, 15) + i210;
        int i214 = i(i209, 10);
        int i215 = i(((i210 + n(i213, i211, i214)) + this.f17272i[0]) - 1894007588, 14) + i212;
        int i216 = i(i211, 10);
        int i217 = i(((i212 + n(i215, i213, i216)) + this.f17272i[8]) - 1894007588, 15) + i214;
        int i218 = i(i213, 10);
        int i219 = i(((i214 + n(i217, i215, i218)) + this.f17272i[12]) - 1894007588, 9) + i216;
        int i220 = i(i215, 10);
        int i221 = i(((i216 + n(i219, i217, i220)) + this.f17272i[4]) - 1894007588, 8) + i218;
        int i222 = i(i217, 10);
        int i223 = i(((i218 + n(i221, i219, i222)) + this.f17272i[13]) - 1894007588, 9) + i220;
        int i224 = i(i219, 10);
        int i225 = i(((i220 + n(i223, i221, i224)) + this.f17272i[3]) - 1894007588, 14) + i222;
        int i226 = i(i221, 10);
        int i227 = i(((i222 + n(i225, i223, i226)) + this.f17272i[7]) - 1894007588, 5) + i224;
        int i228 = i(i223, 10);
        int i229 = i(((i224 + n(i227, i225, i228)) + this.f17272i[15]) - 1894007588, 6) + i226;
        int i230 = i(i225, 10);
        int i231 = i(((i226 + n(i229, i227, i230)) + this.f17272i[14]) - 1894007588, 8) + i228;
        int i232 = i(i227, 10);
        int i233 = i(((i228 + n(i231, i229, i232)) + this.f17272i[5]) - 1894007588, 6) + i230;
        int i234 = i(i229, 10);
        int i235 = i(((i230 + n(i233, i231, i234)) + this.f17272i[6]) - 1894007588, 5) + i232;
        int i236 = i(i231, 10);
        int i237 = i(((i232 + n(i235, i233, i236)) + this.f17272i[2]) - 1894007588, 12) + i234;
        int i238 = i(i233, 10);
        int i239 = i(i202 + l(i205, i203, i206) + this.f17272i[8] + 2053994217, 15) + i204;
        int i240 = i(i203, 10);
        int i241 = i(i204 + l(i239, i205, i240) + this.f17272i[6] + 2053994217, 5) + i206;
        int i242 = i(i205, 10);
        int i243 = i(i206 + l(i241, i239, i242) + this.f17272i[4] + 2053994217, 8) + i240;
        int i244 = i(i239, 10);
        int i245 = i(i240 + l(i243, i241, i244) + this.f17272i[1] + 2053994217, 11) + i242;
        int i246 = i(i241, 10);
        int i247 = i(i242 + l(i245, i243, i246) + this.f17272i[3] + 2053994217, 14) + i244;
        int i248 = i(i243, 10);
        int i249 = i(i244 + l(i247, i245, i248) + this.f17272i[11] + 2053994217, 14) + i246;
        int i250 = i(i245, 10);
        int i251 = i(i246 + l(i249, i247, i250) + this.f17272i[15] + 2053994217, 6) + i248;
        int i252 = i(i247, 10);
        int i253 = i(i248 + l(i251, i249, i252) + this.f17272i[0] + 2053994217, 14) + i250;
        int i254 = i(i249, 10);
        int i255 = i(i250 + l(i253, i251, i254) + this.f17272i[5] + 2053994217, 6) + i252;
        int i256 = i(i251, 10);
        int i257 = i(i252 + l(i255, i253, i256) + this.f17272i[12] + 2053994217, 9) + i254;
        int i258 = i(i253, 10);
        int i259 = i(i254 + l(i257, i255, i258) + this.f17272i[2] + 2053994217, 12) + i256;
        int i260 = i(i255, 10);
        int i261 = i(i256 + l(i259, i257, i260) + this.f17272i[13] + 2053994217, 9) + i258;
        int i262 = i(i257, 10);
        int i263 = i(i258 + l(i261, i259, i262) + this.f17272i[9] + 2053994217, 12) + i260;
        int i264 = i(i259, 10);
        int i265 = i(i260 + l(i263, i261, i264) + this.f17272i[7] + 2053994217, 5) + i262;
        int i266 = i(i261, 10);
        int i267 = i(i262 + l(i265, i263, i266) + this.f17272i[10] + 2053994217, 15) + i264;
        int i268 = i(i263, 10);
        int i269 = i(i264 + l(i267, i265, i268) + this.f17272i[14] + 2053994217, 8) + i266;
        int i270 = i(i265, 10);
        int i271 = i(((i234 + o(i237, i235, i238)) + this.f17272i[4]) - 1454113458, 9) + i236;
        int i272 = i(i235, 10);
        int i273 = i(((i236 + o(i271, i237, i272)) + this.f17272i[0]) - 1454113458, 15) + i238;
        int i274 = i(i237, 10);
        int i275 = i(((i238 + o(i273, i271, i274)) + this.f17272i[5]) - 1454113458, 5) + i272;
        int i276 = i(i271, 10);
        int i277 = i(((i272 + o(i275, i273, i276)) + this.f17272i[9]) - 1454113458, 11) + i274;
        int i278 = i(i273, 10);
        int i279 = i(((i274 + o(i277, i275, i278)) + this.f17272i[7]) - 1454113458, 6) + i276;
        int i280 = i(i275, 10);
        int i281 = i(((i276 + o(i279, i277, i280)) + this.f17272i[12]) - 1454113458, 8) + i278;
        int i282 = i(i277, 10);
        int i283 = i(((i278 + o(i281, i279, i282)) + this.f17272i[2]) - 1454113458, 13) + i280;
        int i284 = i(i279, 10);
        int i285 = i(((i280 + o(i283, i281, i284)) + this.f17272i[10]) - 1454113458, 12) + i282;
        int i286 = i(i281, 10);
        int i287 = i(((i282 + o(i285, i283, i286)) + this.f17272i[14]) - 1454113458, 5) + i284;
        int i288 = i(i283, 10);
        int i289 = i(((i284 + o(i287, i285, i288)) + this.f17272i[1]) - 1454113458, 12) + i286;
        int i290 = i(i285, 10);
        int i291 = i(((i286 + o(i289, i287, i290)) + this.f17272i[3]) - 1454113458, 13) + i288;
        int i292 = i(i287, 10);
        int i293 = i(((i288 + o(i291, i289, i292)) + this.f17272i[8]) - 1454113458, 14) + i290;
        int i294 = i(i289, 10);
        int i295 = i(((i290 + o(i293, i291, i294)) + this.f17272i[11]) - 1454113458, 11) + i292;
        int i296 = i(i291, 10);
        int i297 = i(((i292 + o(i295, i293, i296)) + this.f17272i[6]) - 1454113458, 8) + i294;
        int i298 = i(i293, 10);
        int i299 = i(((i294 + o(i297, i295, i298)) + this.f17272i[15]) - 1454113458, 5) + i296;
        int i300 = i(i295, 10);
        int i301 = i(i297, 10);
        int i302 = i(i266 + k(i269, i267, i270) + this.f17272i[12], 8) + i268;
        int i303 = i(i267, 10);
        int i304 = i(i268 + k(i302, i269, i303) + this.f17272i[15], 5) + i270;
        int i305 = i(i269, 10);
        int i306 = i(i270 + k(i304, i302, i305) + this.f17272i[10], 12) + i303;
        int i307 = i(i302, 10);
        int i308 = i(i303 + k(i306, i304, i307) + this.f17272i[4], 9) + i305;
        int i309 = i(i304, 10);
        int i310 = i(i305 + k(i308, i306, i309) + this.f17272i[1], 12) + i307;
        int i311 = i(i306, 10);
        int i312 = i(i307 + k(i310, i308, i311) + this.f17272i[5], 5) + i309;
        int i313 = i(i308, 10);
        int i314 = i(i309 + k(i312, i310, i313) + this.f17272i[8], 14) + i311;
        int i315 = i(i310, 10);
        int i316 = i(i311 + k(i314, i312, i315) + this.f17272i[7], 6) + i313;
        int i317 = i(i312, 10);
        int i318 = i(i313 + k(i316, i314, i317) + this.f17272i[6], 8) + i315;
        int i319 = i(i314, 10);
        int i320 = i(i315 + k(i318, i316, i319) + this.f17272i[2], 13) + i317;
        int i321 = i(i316, 10);
        int i322 = i(i317 + k(i320, i318, i321) + this.f17272i[13], 6) + i319;
        int i323 = i(i318, 10);
        int i324 = i(i319 + k(i322, i320, i323) + this.f17272i[14], 5) + i321;
        int i325 = i(i320, 10);
        int i326 = i(i321 + k(i324, i322, i325) + this.f17272i[0], 15) + i323;
        int i327 = i(i322, 10);
        int i328 = i(i323 + k(i326, i324, i327) + this.f17272i[3], 13) + i325;
        int i329 = i(i324, 10);
        int i330 = i(i325 + k(i328, i326, i329) + this.f17272i[9], 11) + i327;
        int i331 = i(i326, 10);
        int i332 = i(i327 + k(i330, i328, i331) + this.f17272i[11], 11) + i329;
        this.f17268e = this.f17269f + i301 + i331;
        this.f17269f = this.f17270g + i300 + i329;
        this.f17270g = this.f17271h + i298 + i332;
        this.f17271h = this.f17267d + i(((i296 + o(i299, i297, i300)) + this.f17272i[13]) - 1454113458, 6) + i298 + i330;
        this.f17267d = i(i328, 10) + i299 + this.f17268e;
        this.f17273j = 0;
        int i333 = 0;
        while (true) {
            int[] iArr = this.f17272i;
            if (i333 != iArr.length) {
                iArr[i333] = 0;
                i333++;
            } else {
                return;
            }
        }
    }

    @Override // nh.h
    protected void g(long j10) {
        if (this.f17273j > 14) {
            f();
        }
        int[] iArr = this.f17272i;
        iArr[14] = (int) ((-1) & j10);
        iArr[15] = (int) (j10 >>> 32);
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "RIPEMD160";
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return 20;
    }

    @Override // nh.h
    protected void h(byte[] bArr, int i10) {
        int[] iArr = this.f17272i;
        int i11 = this.f17273j;
        int i12 = i11 + 1;
        this.f17273j = i12;
        iArr[i11] = ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        if (i12 == 16) {
            f();
        }
    }

    @Override // nh.h, org.bouncycastle.crypto.r
    public void reset() {
        super.reset();
        this.f17267d = 1732584193;
        this.f17268e = -271733879;
        this.f17269f = -1732584194;
        this.f17270g = 271733878;
        this.f17271h = -1009589776;
        this.f17273j = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f17272i;
            if (i10 != iArr.length) {
                iArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }
}
