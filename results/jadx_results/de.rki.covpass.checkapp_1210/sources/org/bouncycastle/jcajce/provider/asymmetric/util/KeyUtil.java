package org.bouncycastle.jcajce.provider.asymmetric.util;

import gg.g;
import hh.b;
import hh.n0;
import zg.s;
/* loaded from: classes3.dex */
public class KeyUtil {
    public static byte[] getEncodedPrivateKeyInfo(b bVar, g gVar) {
        try {
            return getEncodedPrivateKeyInfo(new s(bVar, gVar.b()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedPrivateKeyInfo(s sVar) {
        try {
            return sVar.k("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(b bVar, g gVar) {
        try {
            return getEncodedSubjectPublicKeyInfo(new n0(bVar, gVar));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(b bVar, byte[] bArr) {
        try {
            return getEncodedSubjectPublicKeyInfo(new n0(bVar, bArr));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(n0 n0Var) {
        try {
            return n0Var.k("DER");
        } catch (Exception unused) {
            return null;
        }
    }
}
