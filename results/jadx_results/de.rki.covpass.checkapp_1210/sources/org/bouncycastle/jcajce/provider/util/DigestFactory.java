package org.bouncycastle.jcajce.provider.util;

import ei.a;
import gg.v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.crypto.r;
import yg.b;
import zg.q;
/* loaded from: classes3.dex */
public class DigestFactory {
    private static Set md5 = new HashSet();
    private static Set sha1 = new HashSet();
    private static Set sha224 = new HashSet();
    private static Set sha256 = new HashSet();
    private static Set sha384 = new HashSet();
    private static Set sha512 = new HashSet();
    private static Set sha512_224 = new HashSet();
    private static Set sha512_256 = new HashSet();
    private static Set sha3_224 = new HashSet();
    private static Set sha3_256 = new HashSet();
    private static Set sha3_384 = new HashSet();
    private static Set sha3_512 = new HashSet();
    private static Set shake128 = new HashSet();
    private static Set shake256 = new HashSet();
    private static Map oids = new HashMap();

    static {
        md5.add("MD5");
        Set set = md5;
        v vVar = q.H1;
        set.add(vVar.H());
        sha1.add("SHA1");
        sha1.add("SHA-1");
        Set set2 = sha1;
        v vVar2 = b.f26294i;
        set2.add(vVar2.H());
        sha224.add("SHA224");
        sha224.add("SHA-224");
        Set set3 = sha224;
        v vVar3 = ug.b.f23641f;
        set3.add(vVar3.H());
        sha256.add("SHA256");
        sha256.add("SHA-256");
        Set set4 = sha256;
        v vVar4 = ug.b.f23635c;
        set4.add(vVar4.H());
        sha384.add("SHA384");
        sha384.add("SHA-384");
        Set set5 = sha384;
        v vVar5 = ug.b.f23637d;
        set5.add(vVar5.H());
        sha512.add("SHA512");
        sha512.add("SHA-512");
        Set set6 = sha512;
        v vVar6 = ug.b.f23639e;
        set6.add(vVar6.H());
        sha512_224.add("SHA512(224)");
        sha512_224.add("SHA-512(224)");
        Set set7 = sha512_224;
        v vVar7 = ug.b.f23643g;
        set7.add(vVar7.H());
        sha512_256.add("SHA512(256)");
        sha512_256.add("SHA-512(256)");
        Set set8 = sha512_256;
        v vVar8 = ug.b.f23645h;
        set8.add(vVar8.H());
        sha3_224.add("SHA3-224");
        Set set9 = sha3_224;
        v vVar9 = ug.b.f23647i;
        set9.add(vVar9.H());
        sha3_256.add("SHA3-256");
        Set set10 = sha3_256;
        v vVar10 = ug.b.f23649j;
        set10.add(vVar10.H());
        sha3_384.add("SHA3-384");
        Set set11 = sha3_384;
        v vVar11 = ug.b.f23651k;
        set11.add(vVar11.H());
        sha3_512.add("SHA3-512");
        Set set12 = sha3_512;
        v vVar12 = ug.b.f23653l;
        set12.add(vVar12.H());
        shake128.add("SHAKE128");
        Set set13 = shake128;
        v vVar13 = ug.b.f23655m;
        set13.add(vVar13.H());
        shake256.add("SHAKE256");
        Set set14 = shake256;
        v vVar14 = ug.b.f23657n;
        set14.add(vVar14.H());
        oids.put("MD5", vVar);
        oids.put(vVar.H(), vVar);
        oids.put("SHA1", vVar2);
        oids.put("SHA-1", vVar2);
        oids.put(vVar2.H(), vVar2);
        oids.put("SHA224", vVar3);
        oids.put("SHA-224", vVar3);
        oids.put(vVar3.H(), vVar3);
        oids.put("SHA256", vVar4);
        oids.put("SHA-256", vVar4);
        oids.put(vVar4.H(), vVar4);
        oids.put("SHA384", vVar5);
        oids.put("SHA-384", vVar5);
        oids.put(vVar5.H(), vVar5);
        oids.put("SHA512", vVar6);
        oids.put("SHA-512", vVar6);
        oids.put(vVar6.H(), vVar6);
        oids.put("SHA512(224)", vVar7);
        oids.put("SHA-512(224)", vVar7);
        oids.put(vVar7.H(), vVar7);
        oids.put("SHA512(256)", vVar8);
        oids.put("SHA-512(256)", vVar8);
        oids.put(vVar8.H(), vVar8);
        oids.put("SHA3-224", vVar9);
        oids.put(vVar9.H(), vVar9);
        oids.put("SHA3-256", vVar10);
        oids.put(vVar10.H(), vVar10);
        oids.put("SHA3-384", vVar11);
        oids.put(vVar11.H(), vVar11);
        oids.put("SHA3-512", vVar12);
        oids.put(vVar12.H(), vVar12);
        oids.put("SHAKE128", vVar13);
        oids.put(vVar13.H(), vVar13);
        oids.put("SHAKE256", vVar14);
        oids.put(vVar14.H(), vVar14);
    }

    public static r getDigest(String str) {
        String k10 = ak.q.k(str);
        if (sha1.contains(k10)) {
            return a.b();
        }
        if (md5.contains(k10)) {
            return a.a();
        }
        if (sha224.contains(k10)) {
            return a.c();
        }
        if (sha256.contains(k10)) {
            return a.d();
        }
        if (sha384.contains(k10)) {
            return a.e();
        }
        if (sha512.contains(k10)) {
            return a.j();
        }
        if (sha512_224.contains(k10)) {
            return a.k();
        }
        if (sha512_256.contains(k10)) {
            return a.l();
        }
        if (sha3_224.contains(k10)) {
            return a.f();
        }
        if (sha3_256.contains(k10)) {
            return a.g();
        }
        if (sha3_384.contains(k10)) {
            return a.h();
        }
        if (sha3_512.contains(k10)) {
            return a.i();
        }
        if (shake128.contains(k10)) {
            return a.m();
        }
        if (!shake256.contains(k10)) {
            return null;
        }
        return a.n();
    }

    public static v getOID(String str) {
        return (v) oids.get(str);
    }

    public static boolean isSameDigest(String str, String str2) {
        return (sha1.contains(str) && sha1.contains(str2)) || (sha224.contains(str) && sha224.contains(str2)) || ((sha256.contains(str) && sha256.contains(str2)) || ((sha384.contains(str) && sha384.contains(str2)) || ((sha512.contains(str) && sha512.contains(str2)) || ((sha512_224.contains(str) && sha512_224.contains(str2)) || ((sha512_256.contains(str) && sha512_256.contains(str2)) || ((sha3_224.contains(str) && sha3_224.contains(str2)) || ((sha3_256.contains(str) && sha3_256.contains(str2)) || ((sha3_384.contains(str) && sha3_384.contains(str2)) || ((sha3_512.contains(str) && sha3_512.contains(str2)) || (md5.contains(str) && md5.contains(str2)))))))))));
    }
}
