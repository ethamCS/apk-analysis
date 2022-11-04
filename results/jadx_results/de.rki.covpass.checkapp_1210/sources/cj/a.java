package cj;

import gg.d0;
import gg.j0;
import gg.m0;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a */
    private d0 f6614a;

    /* renamed from: b */
    private d0 f6615b;

    /* renamed from: c */
    private String f6616c;

    public a(byte[] bArr) {
        Enumeration H = d0.F(bArr).H();
        while (H.hasMoreElements()) {
            gg.g gVar = (gg.g) H.nextElement();
            if (gVar instanceof d0) {
                this.f6614a = d0.F(gVar);
            } else if (gVar instanceof j0) {
                this.f6615b = d0.E((j0) gVar, false);
            } else if (gVar instanceof m0) {
                this.f6616c = m0.D(gVar).c();
            }
        }
    }
}
