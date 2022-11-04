package ej;

import gg.a0;
import java.util.Objects;
import zg.d;
/* loaded from: classes3.dex */
public class a {

    /* renamed from: b */
    private static zg.a[] f9688b = new zg.a[0];

    /* renamed from: a */
    private d f9689a;

    public a(d dVar) {
        Objects.requireNonNull(dVar, "certificationRequest cannot be null");
        this.f9689a = dVar;
    }

    public a(byte[] bArr) {
        this(a(bArr));
    }

    private static d a(byte[] bArr) {
        try {
            d l10 = d.l(a0.u(bArr));
            if (l10 != null) {
                return l10;
            }
            throw new c("empty data passed to constructor");
        } catch (ClassCastException e10) {
            throw new c("malformed data: " + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new c("malformed data: " + e11.getMessage(), e11);
        }
    }

    public d b() {
        return this.f9689a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return b().equals(((a) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return b().hashCode();
    }
}
