package nj;

import ak.g;
import fj.h;
import gg.r1;
import gg.v;
import java.util.HashMap;
import java.util.Map;
import nh.a0;
import nh.c0;
import nh.x;
import org.bouncycastle.crypto.r;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a */
    static final hh.b f17329a;

    /* renamed from: b */
    static final hh.b f17330b;

    /* renamed from: c */
    static final hh.b f17331c = new hh.b(ug.b.f23649j);

    /* renamed from: d */
    static final hh.b f17332d = new hh.b(ug.b.f23645h);

    /* renamed from: e */
    static final hh.b f17333e = new hh.b(ug.b.f23635c);

    /* renamed from: f */
    static final hh.b f17334f = new hh.b(ug.b.f23639e);

    /* renamed from: g */
    static final hh.b f17335g = new hh.b(ug.b.f23655m);

    /* renamed from: h */
    static final hh.b f17336h = new hh.b(ug.b.f23657n);

    /* renamed from: i */
    static final Map f17337i;

    static {
        v vVar = fj.e.X;
        f17329a = new hh.b(vVar);
        v vVar2 = fj.e.Y;
        f17330b = new hh.b(vVar2);
        HashMap hashMap = new HashMap();
        f17337i = hashMap;
        hashMap.put(vVar, g.e(5));
        hashMap.put(vVar2, g.e(6));
    }

    public static hh.b a(String str) {
        if (str.equals("SHA-1")) {
            return new hh.b(yg.b.f26294i, r1.f10880d);
        }
        if (str.equals("SHA-224")) {
            return new hh.b(ug.b.f23641f);
        }
        if (str.equals("SHA-256")) {
            return new hh.b(ug.b.f23635c);
        }
        if (str.equals("SHA-384")) {
            return new hh.b(ug.b.f23637d);
        }
        if (str.equals("SHA-512")) {
            return new hh.b(ug.b.f23639e);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    public static r b(v vVar) {
        if (vVar.s(ug.b.f23635c)) {
            return new x();
        }
        if (vVar.s(ug.b.f23639e)) {
            return new a0();
        }
        if (vVar.s(ug.b.f23655m)) {
            return new c0(128);
        }
        if (vVar.s(ug.b.f23657n)) {
            return new c0((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + vVar);
    }

    public static String c(v vVar) {
        if (vVar.s(yg.b.f26294i)) {
            return "SHA-1";
        }
        if (vVar.s(ug.b.f23641f)) {
            return "SHA-224";
        }
        if (vVar.s(ug.b.f23635c)) {
            return "SHA-256";
        }
        if (vVar.s(ug.b.f23637d)) {
            return "SHA-384";
        }
        if (vVar.s(ug.b.f23639e)) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + vVar);
    }

    public static hh.b d(int i10) {
        if (i10 != 5) {
            if (i10 == 6) {
                return f17330b;
            }
            throw new IllegalArgumentException("unknown security category: " + i10);
        }
        return f17329a;
    }

    public static int e(hh.b bVar) {
        return ((Integer) f17337i.get(bVar.l())).intValue();
    }

    public static hh.b f(String str) {
        if (str.equals("SHA3-256")) {
            return f17331c;
        }
        if (str.equals("SHA-512/256")) {
            return f17332d;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }

    public static String g(h hVar) {
        hh.b m10 = hVar.m();
        if (m10.l().s(f17331c.l())) {
            return "SHA3-256";
        }
        if (m10.l().s(f17332d.l())) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + m10.l());
    }

    public static hh.b h(String str) {
        if (str.equals("SHA-256")) {
            return f17333e;
        }
        if (str.equals("SHA-512")) {
            return f17334f;
        }
        if (str.equals("SHAKE128")) {
            return f17335g;
        }
        if (str.equals("SHAKE256")) {
            return f17336h;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }
}
