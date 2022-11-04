package hh;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.conscrypt.BuildConfig;
/* loaded from: classes3.dex */
public class i0 {

    /* renamed from: a */
    private Set f11972a = new HashSet();

    /* renamed from: b */
    private Set f11973b = new HashSet();

    /* renamed from: c */
    private Set f11974c = new HashSet();

    /* renamed from: d */
    private Set f11975d = new HashSet();

    /* renamed from: e */
    private Set f11976e = new HashSet();

    /* renamed from: f */
    private Set f11977f = new HashSet();

    /* renamed from: g */
    private Set f11978g;

    /* renamed from: h */
    private Set f11979h;

    /* renamed from: i */
    private Set f11980i;

    /* renamed from: j */
    private Set f11981j;

    /* renamed from: k */
    private Set f11982k;

    /* renamed from: l */
    private Set f11983l;

    private Set A(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            gg.d0 F = gg.d0.F(((y) it.next()).l().o().b());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    gg.d0 d0Var = (gg.d0) it2.next();
                    if (h0(F, d0Var)) {
                        hashSet.add(F);
                    } else if (h0(d0Var, F)) {
                        hashSet.add(d0Var);
                    }
                }
            } else if (F != null) {
                hashSet.add(F);
            }
        }
        return hashSet;
    }

    private Set B(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String y10 = y(((y) it.next()).l());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (i0(str, y10)) {
                        hashSet.add(str);
                    } else if (i0(y10, str)) {
                        hashSet.add(y10);
                    }
                }
            } else if (y10 != null) {
                hashSet.add(y10);
            }
        }
        return hashSet;
    }

    private Set C(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String y10 = y(((y) it.next()).l());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    D(y10, (String) it2.next(), hashSet);
                }
            } else if (y10 != null) {
                hashSet.add(y10);
            }
        }
        return hashSet;
    }

    private void D(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String substring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (!str.equalsIgnoreCase(str2)) {
                    return;
                }
            } else if (str2.startsWith(".")) {
                if (!i0(substring, str2)) {
                    return;
                }
            } else if (!substring.equalsIgnoreCase(str2)) {
                return;
            }
        } else if (str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (!i0(str2.substring(str.indexOf(64) + 1), str)) {
                    return;
                }
            } else if (str2.startsWith(".")) {
                if (!i0(str, str2) && !str.equalsIgnoreCase(str2)) {
                    if (!i0(str2, str)) {
                        return;
                    }
                }
            } else if (!i0(str2, str)) {
                return;
            }
            set.add(str2);
            return;
        } else if (str2.indexOf(64) != -1) {
            if (!str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                return;
            }
            set.add(str2);
            return;
        } else if (str2.startsWith(".")) {
            if (!i0(str, str2)) {
                return;
            }
        } else if (!str.equalsIgnoreCase(str2)) {
            return;
        }
        set.add(str);
    }

    private Set F(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            byte[] F = gg.w.E(((y) it.next()).l().o()).F();
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    hashSet.addAll(G((byte[]) it2.next(), F));
                }
            } else if (F != null) {
                hashSet.add(F);
            }
        }
        return hashSet;
    }

    private Set G(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return Collections.EMPTY_SET;
        }
        byte[][] x10 = x(bArr, bArr2);
        byte[] bArr3 = x10[0];
        byte[] bArr4 = x10[1];
        byte[] bArr5 = x10[2];
        byte[] bArr6 = x10[3];
        byte[][] S = S(bArr3, bArr4, bArr5, bArr6);
        return t(Q(S[0], S[2]), R(S[1], S[3])) == 1 ? Collections.EMPTY_SET : Collections.singleton(N(T(S[0], S[2]), T(bArr4, bArr6)));
    }

    private Set H(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            h0 l10 = h0.l(((y) it.next()).l().o());
            if (set != null) {
                for (Object obj : set) {
                    I(l10, h0.l(obj), hashSet);
                }
            } else if (l10 != null) {
                hashSet.add(l10);
            }
        }
        return hashSet;
    }

    private void I(h0 h0Var, h0 h0Var2, Set set) {
        if (h0Var.equals(h0Var2)) {
            set.add(h0Var);
        }
    }

    private Set L(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String y10 = y(((y) it.next()).l());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    M((String) it2.next(), y10, hashSet);
                }
            } else if (y10 != null) {
                hashSet.add(y10);
            }
        }
        return hashSet;
    }

    private void M(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String substring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (!str.equalsIgnoreCase(str2)) {
                    return;
                }
            } else if (str2.startsWith(".")) {
                if (!i0(substring, str2)) {
                    return;
                }
            } else if (!substring.equalsIgnoreCase(str2)) {
                return;
            }
        } else if (str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (!i0(str2.substring(str.indexOf(64) + 1), str)) {
                    return;
                }
            } else if (str2.startsWith(".")) {
                if (!i0(str, str2) && !str.equalsIgnoreCase(str2)) {
                    if (!i0(str2, str)) {
                        return;
                    }
                }
            } else if (!i0(str2, str)) {
                return;
            }
            set.add(str2);
            return;
        } else if (str2.indexOf(64) != -1) {
            if (!str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                return;
            }
            set.add(str2);
            return;
        } else if (str2.startsWith(".")) {
            if (!i0(str, str2)) {
                return;
            }
        } else if (!str.equalsIgnoreCase(str2)) {
            return;
        }
        set.add(str);
    }

    private byte[] N(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length * 2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length);
        return bArr3;
    }

    private boolean O(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr4[i10] = (byte) (bArr2[i10] & bArr3[i10]);
            bArr5[i10] = (byte) (bArr[i10] & bArr3[i10]);
        }
        return ak.a.c(bArr4, bArr5);
    }

    private boolean P(String str, String str2) {
        String w9 = w(str);
        return !str2.startsWith(".") ? w9.equalsIgnoreCase(str2) : i0(w9, str2);
    }

    private static byte[] Q(byte[] bArr, byte[] bArr2) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if ((bArr[i10] & 65535) > (65535 & bArr2[i10])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private static byte[] R(byte[] bArr, byte[] bArr2) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if ((bArr[i10] & 65535) < (65535 & bArr2[i10])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private byte[][] S(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        byte[] bArr7 = new byte[length];
        byte[] bArr8 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr5[i10] = (byte) (bArr[i10] & bArr2[i10]);
            bArr6[i10] = (byte) ((bArr[i10] & bArr2[i10]) | (~bArr2[i10]));
            bArr7[i10] = (byte) (bArr3[i10] & bArr4[i10]);
            bArr8[i10] = (byte) ((bArr3[i10] & bArr4[i10]) | (~bArr4[i10]));
        }
        return new byte[][]{bArr5, bArr6, bArr7, bArr8};
    }

    private static byte[] T(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] | bArr2[i10]);
        }
        return bArr3;
    }

    private boolean U(h0 h0Var, h0 h0Var2) {
        return h0Var2.equals(h0Var);
    }

    private String V(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(Integer.toString(bArr[i10] & 255));
        }
        sb2.append("/");
        boolean z10 = true;
        for (int length = bArr.length / 2; length < bArr.length; length++) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(".");
            }
            sb2.append(Integer.toString(bArr[length] & 255));
        }
        return sb2.toString();
    }

    private String W(Set set) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (sb2.length() > 1) {
                sb2.append(",");
            }
            sb2.append(V((byte[]) it.next()));
        }
        sb2.append("]");
        return sb2.toString();
    }

    private String X(Set set) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : set) {
            if (sb2.length() > 1) {
                sb2.append(",");
            }
            h0 l10 = h0.l(obj);
            sb2.append(l10.m().H());
            sb2.append(":");
            try {
                sb2.append(bk.f.f(l10.n().b().getEncoded()));
            } catch (IOException e10) {
                sb2.append(e10.toString());
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    private Set Y(Set set, gg.d0 d0Var) {
        if (set.isEmpty()) {
            if (d0Var == null) {
                return set;
            }
            set.add(d0Var);
            return set;
        }
        HashSet hashSet = new HashSet();
        for (Object obj : set) {
            gg.d0 F = gg.d0.F(obj);
            if (h0(d0Var, F)) {
                hashSet.add(F);
            } else {
                if (!h0(F, d0Var)) {
                    hashSet.add(F);
                }
                hashSet.add(d0Var);
            }
        }
        return hashSet;
    }

    private Set Z(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!i0(str2, str)) {
                boolean i02 = i0(str, str2);
                hashSet.add(str2);
                if (i02) {
                }
            }
            hashSet.add(str);
        }
        return hashSet;
    }

    private Set a0(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b0((String) it.next(), str, hashSet);
        }
        return hashSet;
    }

    private final void b(StringBuilder sb2, String str) {
        sb2.append(str);
        sb2.append(ak.q.d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (i0(r6.substring(r5.indexOf(64) + 1), r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (i0(r6, r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (i0(r6, r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
        if (r6.substring(r5.indexOf(64) + 1).equalsIgnoreCase(r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
        if (i0(r5, r6) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
        if (r5.equalsIgnoreCase(r6) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
        r7.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r5.equalsIgnoreCase(r6) != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b0(java.lang.String r5, java.lang.String r6, java.util.Set r7) {
        /*
            r4 = this;
            r0 = 64
            int r1 = r5.indexOf(r0)
            java.lang.String r2 = "."
            r3 = -1
            if (r1 == r3) goto L38
            int r1 = r5.indexOf(r0)
            int r1 = r1 + 1
            java.lang.String r1 = r5.substring(r1)
            int r0 = r6.indexOf(r0)
            if (r0 == r3) goto L23
            boolean r0 = r5.equalsIgnoreCase(r6)
            if (r0 == 0) goto La4
            goto La0
        L23:
            boolean r0 = r6.startsWith(r2)
            if (r0 == 0) goto L31
            boolean r0 = r4.i0(r1, r6)
            if (r0 == 0) goto La4
            goto L99
        L31:
            boolean r0 = r1.equalsIgnoreCase(r6)
            if (r0 == 0) goto La4
            goto L99
        L38:
            boolean r1 = r5.startsWith(r2)
            if (r1 == 0) goto L76
            int r1 = r6.indexOf(r0)
            if (r1 == r3) goto L55
            int r0 = r5.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r6.substring(r0)
            boolean r0 = r4.i0(r0, r5)
            if (r0 == 0) goto La4
            goto La0
        L55:
            boolean r0 = r6.startsWith(r2)
            if (r0 == 0) goto L6f
            boolean r0 = r4.i0(r5, r6)
            if (r0 != 0) goto La7
            boolean r0 = r5.equalsIgnoreCase(r6)
            if (r0 == 0) goto L68
            goto La7
        L68:
            boolean r0 = r4.i0(r6, r5)
            if (r0 == 0) goto La4
            goto La0
        L6f:
            boolean r0 = r4.i0(r6, r5)
            if (r0 == 0) goto La4
            goto La0
        L76:
            int r1 = r6.indexOf(r0)
            if (r1 == r3) goto L8d
            int r0 = r5.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r6.substring(r0)
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto La4
            goto La0
        L8d:
            boolean r0 = r6.startsWith(r2)
            if (r0 == 0) goto L9a
            boolean r0 = r4.i0(r5, r6)
            if (r0 == 0) goto La4
        L99:
            goto La7
        L9a:
            boolean r0 = r5.equalsIgnoreCase(r6)
            if (r0 == 0) goto La4
        La0:
            r7.add(r5)
            goto Laa
        La4:
            r7.add(r5)
        La7:
            r7.add(r6)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hh.i0.b0(java.lang.String, java.lang.String, java.util.Set):void");
    }

    private Set c0(Set set, byte[] bArr) {
        if (set.isEmpty()) {
            if (bArr == null) {
                return set;
            }
            set.add(bArr);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.addAll(d0((byte[]) it.next(), bArr));
        }
        return hashSet;
    }

    private Set d0(byte[] bArr, byte[] bArr2) {
        HashSet hashSet = new HashSet();
        boolean c10 = ak.a.c(bArr, bArr2);
        hashSet.add(bArr);
        if (!c10) {
            hashSet.add(bArr2);
        }
        return hashSet;
    }

    private void e(Set set, gg.d0 d0Var) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (h0(d0Var, (gg.d0) it.next())) {
                throw new e0("Subject distinguished name is from an excluded subtree");
            }
        }
    }

    private Set e0(Set set, h0 h0Var) {
        HashSet hashSet = set != null ? new HashSet(set) : new HashSet();
        hashSet.add(h0Var);
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(java.util.Set r3, java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r2.i0(r4, r0)
            if (r1 != 0) goto L24
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L24
            goto Lb
        L24:
            hh.e0 r3 = new hh.e0
            java.lang.String r4 = "DNS is from an excluded subtree."
            r3.<init>(r4)
            throw r3
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hh.i0.f(java.util.Set, java.lang.String):void");
    }

    private Set f0(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            g0((String) it.next(), str, hashSet);
        }
        return hashSet;
    }

    private void g(Set set, String str) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (u(str, (String) it.next())) {
                throw new e0("Email address is from an excluded subtree.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (i0(r6.substring(r5.indexOf(64) + 1), r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (i0(r6, r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (i0(r6, r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
        if (r6.substring(r5.indexOf(64) + 1).equalsIgnoreCase(r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
        if (i0(r5, r6) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
        if (r5.equalsIgnoreCase(r6) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
        r7.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r5.equalsIgnoreCase(r6) != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g0(java.lang.String r5, java.lang.String r6, java.util.Set r7) {
        /*
            r4 = this;
            r0 = 64
            int r1 = r5.indexOf(r0)
            java.lang.String r2 = "."
            r3 = -1
            if (r1 == r3) goto L38
            int r1 = r5.indexOf(r0)
            int r1 = r1 + 1
            java.lang.String r1 = r5.substring(r1)
            int r0 = r6.indexOf(r0)
            if (r0 == r3) goto L23
            boolean r0 = r5.equalsIgnoreCase(r6)
            if (r0 == 0) goto La4
            goto La0
        L23:
            boolean r0 = r6.startsWith(r2)
            if (r0 == 0) goto L31
            boolean r0 = r4.i0(r1, r6)
            if (r0 == 0) goto La4
            goto L99
        L31:
            boolean r0 = r1.equalsIgnoreCase(r6)
            if (r0 == 0) goto La4
            goto L99
        L38:
            boolean r1 = r5.startsWith(r2)
            if (r1 == 0) goto L76
            int r1 = r6.indexOf(r0)
            if (r1 == r3) goto L55
            int r0 = r5.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r6.substring(r0)
            boolean r0 = r4.i0(r0, r5)
            if (r0 == 0) goto La4
            goto La0
        L55:
            boolean r0 = r6.startsWith(r2)
            if (r0 == 0) goto L6f
            boolean r0 = r4.i0(r5, r6)
            if (r0 != 0) goto La7
            boolean r0 = r5.equalsIgnoreCase(r6)
            if (r0 == 0) goto L68
            goto La7
        L68:
            boolean r0 = r4.i0(r6, r5)
            if (r0 == 0) goto La4
            goto La0
        L6f:
            boolean r0 = r4.i0(r6, r5)
            if (r0 == 0) goto La4
            goto La0
        L76:
            int r1 = r6.indexOf(r0)
            if (r1 == r3) goto L8d
            int r0 = r5.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r6.substring(r0)
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto La4
            goto La0
        L8d:
            boolean r0 = r6.startsWith(r2)
            if (r0 == 0) goto L9a
            boolean r0 = r4.i0(r5, r6)
            if (r0 == 0) goto La4
        L99:
            goto La7
        L9a:
            boolean r0 = r5.equalsIgnoreCase(r6)
            if (r0 == 0) goto La4
        La0:
            r7.add(r5)
            goto Laa
        La4:
            r7.add(r5)
        La7:
            r7.add(r6)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hh.i0.g0(java.lang.String, java.lang.String, java.util.Set):void");
    }

    private void h(Set set, byte[] bArr) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (O(bArr, (byte[]) it.next())) {
                throw new e0("IP is from an excluded subtree.");
            }
        }
    }

    private static boolean h0(gg.d0 d0Var, gg.d0 d0Var2) {
        if (d0Var2.size() >= 1 && d0Var2.size() <= d0Var.size()) {
            fh.b n10 = fh.b.n(d0Var2.G(0));
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= d0Var.size()) {
                    i10 = i11;
                    break;
                } else if (gh.d.j(n10, fh.b.n(d0Var.G(i10)))) {
                    break;
                } else {
                    i11 = i10;
                    i10++;
                }
            }
            if (d0Var2.size() > d0Var.size() - i10) {
                return false;
            }
            for (int i12 = 0; i12 < d0Var2.size(); i12++) {
                fh.b n11 = fh.b.n(d0Var2.G(i12));
                fh.b n12 = fh.b.n(d0Var.G(i10 + i12));
                if (n11.size() != n12.size() || !n11.m().m().s(n12.m().m())) {
                    return false;
                }
                if (n11.size() != 1 || !n11.m().m().s(gh.e.G)) {
                    if (!gh.d.j(n11, n12)) {
                        return false;
                    }
                } else if (!n12.m().n().toString().startsWith(n11.m().n().toString())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private void i(Set set, h0 h0Var) {
        if (set.isEmpty()) {
            return;
        }
        for (Object obj : set) {
            if (U(h0Var, h0.l(obj))) {
                throw new e0("OtherName is from an excluded subtree.");
            }
        }
    }

    private boolean i0(String str, String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        String[] e10 = ak.q.e(str2, '.');
        String[] e11 = ak.q.e(str, '.');
        if (e11.length <= e10.length) {
            return false;
        }
        int length = e11.length - e10.length;
        for (int i10 = -1; i10 < e10.length; i10++) {
            if (i10 == -1) {
                if (e11[i10 + length].equals(BuildConfig.FLAVOR)) {
                    return false;
                }
            } else if (!e10[i10].equalsIgnoreCase(e11[i10 + length])) {
                return false;
            }
        }
        return true;
    }

    private void j(Set set, String str) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (P(str, (String) it.next())) {
                throw new e0("URI is from an excluded subtree.");
            }
        }
    }

    private void m(Set set, gg.d0 d0Var) {
        if (set == null) {
            return;
        }
        if (set.isEmpty() && d0Var.size() == 0) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (h0(d0Var, (gg.d0) it.next())) {
                return;
            }
        }
        throw new e0("Subject distinguished name is not from a permitted subtree");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n(java.util.Set r4, java.lang.String r5) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.util.Iterator r0 = r4.iterator()
        L7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r3.i0(r5, r1)
            if (r2 != 0) goto L1f
            boolean r1 = r5.equalsIgnoreCase(r1)
            if (r1 == 0) goto L7
        L1f:
            return
        L20:
            int r5 = r5.length()
            if (r5 != 0) goto L2d
            int r4 = r4.size()
            if (r4 != 0) goto L2d
            return
        L2d:
            hh.e0 r4 = new hh.e0
            java.lang.String r5 = "DNS is not from a permitted subtree."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hh.i0.n(java.util.Set, java.lang.String):void");
    }

    private void o(Set set, String str) {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (u(str, (String) it.next())) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new e0("Subject email address is not from a permitted subtree.");
        }
    }

    private void p(Set set, byte[] bArr) {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (O(bArr, (byte[]) it.next())) {
                return;
            }
        }
        if (bArr.length != 0 || set.size() != 0) {
            throw new e0("IP is not from a permitted subtree.");
        }
    }

    private void q(Set set, h0 h0Var) {
        if (set == null) {
            return;
        }
        for (Object obj : set) {
            if (U(h0Var, h0.l(obj))) {
                return;
            }
        }
        throw new e0("Subject OtherName is not from a permitted subtree.");
    }

    private void r(Set set, String str) {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (P(str, (String) it.next())) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new e0("URI is not from a permitted subtree.");
        }
    }

    private boolean s(Collection collection, Collection collection2) {
        boolean z10;
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        for (Object obj : collection) {
            Iterator it = collection2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (v(obj, it.next())) {
                        z10 = true;
                        continue;
                        break;
                    }
                } else {
                    z10 = false;
                    continue;
                    break;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    private static int t(byte[] bArr, byte[] bArr2) {
        if (ak.a.c(bArr, bArr2)) {
            return 0;
        }
        return ak.a.c(Q(bArr, bArr2), bArr) ? 1 : -1;
    }

    private boolean u(String str, String str2) {
        String substring = str.substring(str.indexOf(64) + 1);
        if (str2.indexOf(64) != -1) {
            if (str.equalsIgnoreCase(str2) || substring.equalsIgnoreCase(str2.substring(1))) {
                return true;
            }
        } else if (str2.charAt(0) != '.') {
            if (substring.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (i0(substring, str2)) {
            return true;
        }
        return false;
    }

    private boolean v(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? obj.equals(obj2) : ak.a.c((byte[]) obj, (byte[]) obj2);
    }

    private static String w(String str) {
        String substring = str.substring(str.indexOf(58) + 1);
        if (substring.indexOf("//") != -1) {
            substring = substring.substring(substring.indexOf("//") + 2);
        }
        if (substring.lastIndexOf(58) != -1) {
            substring = substring.substring(0, substring.lastIndexOf(58));
        }
        String substring2 = substring.substring(substring.indexOf(58) + 1);
        String substring3 = substring2.substring(substring2.indexOf(64) + 1);
        return substring3.indexOf(47) != -1 ? substring3.substring(0, substring3.indexOf(47)) : substring3;
    }

    private byte[][] x(byte[] bArr, byte[] bArr2) {
        int length = bArr.length / 2;
        byte[] bArr3 = new byte[length];
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr, length, bArr4, 0, length);
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, length);
        System.arraycopy(bArr2, length, bArr6, 0, length);
        return new byte[][]{bArr3, bArr4, bArr5, bArr6};
    }

    private String y(w wVar) {
        return gg.o.E(wVar.o()).c();
    }

    private int z(Collection collection) {
        int i10 = 0;
        if (collection == null) {
            return 0;
        }
        for (Object obj : collection) {
            i10 += obj instanceof byte[] ? ak.a.F((byte[]) obj) : obj.hashCode();
        }
        return i10;
    }

    public void E(int i10) {
        if (i10 == 0) {
            this.f11983l = new HashSet();
        } else if (i10 == 1) {
            this.f11980i = new HashSet();
        } else if (i10 == 2) {
            this.f11979h = new HashSet();
        } else if (i10 == 4) {
            this.f11978g = new HashSet();
        } else if (i10 == 6) {
            this.f11981j = new HashSet();
        } else if (i10 == 7) {
            this.f11982k = new HashSet();
        } else {
            throw new IllegalStateException("Unknown tag encountered: " + i10);
        }
    }

    public void J(y yVar) {
        K(new y[]{yVar});
    }

    public void K(y[] yVarArr) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 != yVarArr.length; i10++) {
            y yVar = yVarArr[i10];
            Integer e10 = ak.g.e(yVar.l().q());
            if (hashMap.get(e10) == null) {
                hashMap.put(e10, new HashSet());
            }
            ((Set) hashMap.get(e10)).add(yVar);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue == 0) {
                this.f11983l = H(this.f11983l, (Set) entry.getValue());
            } else if (intValue == 1) {
                this.f11980i = C(this.f11980i, (Set) entry.getValue());
            } else if (intValue == 2) {
                this.f11979h = B(this.f11979h, (Set) entry.getValue());
            } else if (intValue == 4) {
                this.f11978g = A(this.f11978g, (Set) entry.getValue());
            } else if (intValue == 6) {
                this.f11981j = L(this.f11981j, (Set) entry.getValue());
            } else if (intValue != 7) {
                throw new IllegalStateException("Unknown tag encountered: " + intValue);
            } else {
                this.f11982k = F(this.f11982k, (Set) entry.getValue());
            }
        }
    }

    public void a(y yVar) {
        w l10 = yVar.l();
        int q10 = l10.q();
        if (q10 == 0) {
            this.f11977f = e0(this.f11977f, h0.l(l10.o()));
        } else if (q10 == 1) {
            this.f11974c = a0(this.f11974c, y(l10));
        } else if (q10 == 2) {
            this.f11973b = Z(this.f11973b, y(l10));
        } else if (q10 == 4) {
            this.f11972a = Y(this.f11972a, (gg.d0) l10.o().b());
        } else if (q10 == 6) {
            this.f11975d = f0(this.f11975d, y(l10));
        } else if (q10 == 7) {
            this.f11976e = c0(this.f11976e, gg.w.E(l10.o()).F());
        } else {
            throw new IllegalStateException("Unknown tag encountered: " + l10.q());
        }
    }

    public void c(w wVar) {
        int q10 = wVar.q();
        if (q10 == 0) {
            i(this.f11977f, h0.l(wVar.o()));
        } else if (q10 == 1) {
            g(this.f11974c, y(wVar));
        } else if (q10 == 2) {
            f(this.f11973b, y(wVar));
        } else if (q10 == 4) {
            d(fh.c.n(wVar.o()));
        } else if (q10 == 6) {
            j(this.f11975d, y(wVar));
        } else if (q10 != 7) {
        } else {
            h(this.f11976e, gg.w.E(wVar.o()).F());
        }
    }

    public void d(fh.c cVar) {
        e(this.f11972a, gg.d0.F(cVar));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return s(i0Var.f11972a, this.f11972a) && s(i0Var.f11973b, this.f11973b) && s(i0Var.f11974c, this.f11974c) && s(i0Var.f11976e, this.f11976e) && s(i0Var.f11975d, this.f11975d) && s(i0Var.f11977f, this.f11977f) && s(i0Var.f11978g, this.f11978g) && s(i0Var.f11979h, this.f11979h) && s(i0Var.f11980i, this.f11980i) && s(i0Var.f11982k, this.f11982k) && s(i0Var.f11981j, this.f11981j) && s(i0Var.f11983l, this.f11983l);
    }

    public int hashCode() {
        return z(this.f11972a) + z(this.f11973b) + z(this.f11974c) + z(this.f11976e) + z(this.f11975d) + z(this.f11977f) + z(this.f11978g) + z(this.f11979h) + z(this.f11980i) + z(this.f11982k) + z(this.f11981j) + z(this.f11983l);
    }

    public void k(w wVar) {
        int q10 = wVar.q();
        if (q10 == 0) {
            q(this.f11983l, h0.l(wVar.o()));
        } else if (q10 == 1) {
            o(this.f11980i, y(wVar));
        } else if (q10 == 2) {
            n(this.f11979h, y(wVar));
        } else if (q10 == 4) {
            l(fh.c.n(wVar.o()));
        } else if (q10 == 6) {
            r(this.f11981j, y(wVar));
        } else if (q10 != 7) {
        } else {
            p(this.f11982k, gg.w.E(wVar.o()).F());
        }
    }

    public void l(fh.c cVar) {
        m(this.f11978g, gg.d0.F(cVar.b()));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        b(sb2, "permitted:");
        if (this.f11978g != null) {
            b(sb2, "DN:");
            b(sb2, this.f11978g.toString());
        }
        if (this.f11979h != null) {
            b(sb2, "DNS:");
            b(sb2, this.f11979h.toString());
        }
        if (this.f11980i != null) {
            b(sb2, "Email:");
            b(sb2, this.f11980i.toString());
        }
        if (this.f11981j != null) {
            b(sb2, "URI:");
            b(sb2, this.f11981j.toString());
        }
        if (this.f11982k != null) {
            b(sb2, "IP:");
            b(sb2, W(this.f11982k));
        }
        if (this.f11983l != null) {
            b(sb2, "OtherName:");
            b(sb2, X(this.f11983l));
        }
        b(sb2, "excluded:");
        if (!this.f11972a.isEmpty()) {
            b(sb2, "DN:");
            b(sb2, this.f11972a.toString());
        }
        if (!this.f11973b.isEmpty()) {
            b(sb2, "DNS:");
            b(sb2, this.f11973b.toString());
        }
        if (!this.f11974c.isEmpty()) {
            b(sb2, "Email:");
            b(sb2, this.f11974c.toString());
        }
        if (!this.f11975d.isEmpty()) {
            b(sb2, "URI:");
            b(sb2, this.f11975d.toString());
        }
        if (!this.f11976e.isEmpty()) {
            b(sb2, "IP:");
            b(sb2, W(this.f11976e));
        }
        if (!this.f11977f.isEmpty()) {
            b(sb2, "OtherName:");
            b(sb2, X(this.f11977f));
        }
        return sb2.toString();
    }
}
