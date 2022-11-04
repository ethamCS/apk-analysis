package ek;

import gg.a0;
import gg.t1;
import hh.r0;
import hh.s0;
import hh.t0;
import hh.u;
import hh.w;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
/* loaded from: classes3.dex */
public class g implements ak.n {
    private Collection U3 = new HashSet();
    private Collection V3 = new HashSet();

    /* renamed from: c */
    private a f9701c;

    /* renamed from: d */
    private b f9702d;

    /* renamed from: q */
    private BigInteger f9703q;

    /* renamed from: x */
    private Date f9704x;

    /* renamed from: y */
    private h f9705y;

    public h a() {
        return this.f9705y;
    }

    public Date c() {
        if (this.f9704x != null) {
            return new Date(this.f9704x.getTime());
        }
        return null;
    }

    @Override // ak.n
    public Object clone() {
        g gVar = new g();
        gVar.f9705y = this.f9705y;
        gVar.f9704x = c();
        gVar.f9701c = this.f9701c;
        gVar.f9702d = this.f9702d;
        gVar.f9703q = this.f9703q;
        gVar.V3 = f();
        gVar.U3 = g();
        return gVar;
    }

    public a d() {
        return this.f9701c;
    }

    public BigInteger e() {
        return this.f9703q;
    }

    public Collection f() {
        return Collections.unmodifiableCollection(this.V3);
    }

    public Collection g() {
        return Collections.unmodifiableCollection(this.U3);
    }

    @Override // ak.n
    public boolean z(Object obj) {
        byte[] extensionValue;
        t0[] m10;
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        h hVar2 = this.f9705y;
        if (hVar2 != null && !hVar2.equals(hVar)) {
            return false;
        }
        if (this.f9703q != null && !hVar.getSerialNumber().equals(this.f9703q)) {
            return false;
        }
        if (this.f9701c != null && !hVar.b().equals(this.f9701c)) {
            return false;
        }
        if (this.f9702d != null && !hVar.e().equals(this.f9702d)) {
            return false;
        }
        Date date = this.f9704x;
        if (date != null) {
            try {
                hVar.checkValidity(date);
            } catch (CertificateExpiredException | CertificateNotYetValidException unused) {
                return false;
            }
        }
        if ((!this.U3.isEmpty() || !this.V3.isEmpty()) && (extensionValue = hVar.getExtensionValue(u.f12067w4.H())) != null) {
            try {
                m10 = s0.l(new gg.p(((t1) a0.u(extensionValue)).F()).s()).m();
                if (!this.U3.isEmpty()) {
                    boolean z10 = false;
                    for (t0 t0Var : m10) {
                        r0[] m11 = t0Var.m();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= m11.length) {
                                break;
                            } else if (this.U3.contains(w.n(m11[i10].n()))) {
                                z10 = true;
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!z10) {
                        return false;
                    }
                }
            } catch (IOException | IllegalArgumentException unused2) {
            }
            if (!this.V3.isEmpty()) {
                boolean z11 = false;
                for (t0 t0Var2 : m10) {
                    r0[] m12 = t0Var2.m();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= m12.length) {
                            break;
                        } else if (this.V3.contains(w.n(m12[i11].m()))) {
                            z11 = true;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (!z11) {
                    return false;
                }
            }
        }
        return true;
    }
}
