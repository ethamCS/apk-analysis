package y5;

import f6.c0;
import f6.i0;
import f6.z;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes.dex */
public final class p<P> {

    /* renamed from: a */
    private final ConcurrentMap<c, List<b<P>>> f25826a = new ConcurrentHashMap();

    /* renamed from: b */
    private b<P> f25827b;

    /* renamed from: c */
    private final Class<P> f25828c;

    /* loaded from: classes.dex */
    public static final class b<P> {

        /* renamed from: a */
        private final P f25829a;

        /* renamed from: b */
        private final byte[] f25830b;

        /* renamed from: c */
        private final z f25831c;

        /* renamed from: d */
        private final i0 f25832d;

        /* renamed from: e */
        private final int f25833e;

        b(P p10, byte[] bArr, z zVar, i0 i0Var, int i10) {
            this.f25829a = p10;
            this.f25830b = Arrays.copyOf(bArr, bArr.length);
            this.f25831c = zVar;
            this.f25832d = i0Var;
            this.f25833e = i10;
        }

        public final byte[] a() {
            byte[] bArr = this.f25830b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public i0 b() {
            return this.f25832d;
        }

        public P c() {
            return this.f25829a;
        }

        public z d() {
            return this.f25831c;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Comparable<c> {

        /* renamed from: c */
        private final byte[] f25834c;

        private c(byte[] bArr) {
            this.f25834c = Arrays.copyOf(bArr, bArr.length);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public int compareTo(c cVar) {
            int i10;
            int i11;
            byte[] bArr = this.f25834c;
            int length = bArr.length;
            byte[] bArr2 = cVar.f25834c;
            if (length != bArr2.length) {
                i10 = bArr.length;
                i11 = bArr2.length;
            } else {
                int i12 = 0;
                while (true) {
                    byte[] bArr3 = this.f25834c;
                    if (i12 >= bArr3.length) {
                        return 0;
                    }
                    char c10 = bArr3[i12];
                    byte[] bArr4 = cVar.f25834c;
                    if (c10 != bArr4[i12]) {
                        i10 = bArr3[i12];
                        i11 = bArr4[i12];
                        break;
                    }
                    i12++;
                }
            }
            return i10 - i11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return Arrays.equals(this.f25834c, ((c) obj).f25834c);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f25834c);
        }

        public String toString() {
            return g6.o.b(this.f25834c);
        }
    }

    private p(Class<P> cls) {
        this.f25828c = cls;
    }

    public static <P> p<P> f(Class<P> cls) {
        return new p<>(cls);
    }

    public b<P> a(P p10, c0.c cVar) {
        if (cVar.V() == z.ENABLED) {
            b<P> bVar = new b<>(p10, y5.c.a(cVar), cVar.V(), cVar.U(), cVar.T());
            ArrayList arrayList = new ArrayList();
            arrayList.add(bVar);
            c cVar2 = new c(bVar.a());
            List<b<P>> put = this.f25826a.put(cVar2, Collections.unmodifiableList(arrayList));
            if (put != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(put);
                arrayList2.add(bVar);
                this.f25826a.put(cVar2, Collections.unmodifiableList(arrayList2));
            }
            return bVar;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public b<P> b() {
        return this.f25827b;
    }

    public List<b<P>> c(byte[] bArr) {
        List<b<P>> list = this.f25826a.get(new c(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class<P> d() {
        return this.f25828c;
    }

    public List<b<P>> e() {
        return c(y5.c.f25805a);
    }

    public void g(b<P> bVar) {
        if (bVar != null) {
            if (bVar.d() != z.ENABLED) {
                throw new IllegalArgumentException("the primary entry has to be ENABLED");
            }
            if (c(bVar.a()).isEmpty()) {
                throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
            }
            this.f25827b = bVar;
            return;
        }
        throw new IllegalArgumentException("the primary entry must be non-null");
    }
}
