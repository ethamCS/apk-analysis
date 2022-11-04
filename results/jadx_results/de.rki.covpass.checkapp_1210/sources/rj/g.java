package rj;

import gg.r1;
import org.bouncycastle.crypto.r;
/* loaded from: classes3.dex */
class g {
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

    public static r b(hh.b bVar) {
        if (bVar.l().s(yg.b.f26294i)) {
            return ei.a.b();
        }
        if (bVar.l().s(ug.b.f23641f)) {
            return ei.a.c();
        }
        if (bVar.l().s(ug.b.f23635c)) {
            return ei.a.d();
        }
        if (bVar.l().s(ug.b.f23637d)) {
            return ei.a.e();
        }
        if (bVar.l().s(ug.b.f23639e)) {
            return ei.a.j();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + bVar.l());
    }
}
