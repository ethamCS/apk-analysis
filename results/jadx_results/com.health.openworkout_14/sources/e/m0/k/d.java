package e.m0.k;

import f.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    static final c[] f4208a;

    /* renamed from: b */
    static final Map<f.f, Integer> f4209b = b();

    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a */
        private final List<c> f4210a;

        /* renamed from: b */
        private final f.e f4211b;

        /* renamed from: c */
        private final int f4212c;

        /* renamed from: d */
        private int f4213d;

        /* renamed from: e */
        c[] f4214e;

        /* renamed from: f */
        int f4215f;

        /* renamed from: g */
        int f4216g;

        /* renamed from: h */
        int f4217h;

        a(int i, int i2, t tVar) {
            this.f4210a = new ArrayList();
            c[] cVarArr = new c[8];
            this.f4214e = cVarArr;
            this.f4215f = cVarArr.length - 1;
            this.f4216g = 0;
            this.f4217h = 0;
            this.f4212c = i;
            this.f4213d = i2;
            this.f4211b = f.l.b(tVar);
        }

        public a(int i, t tVar) {
            this(i, i, tVar);
        }

        private void a() {
            int i = this.f4213d;
            int i2 = this.f4217h;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    d(i2 - i);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f4214e, (Object) null);
            this.f4215f = this.f4214e.length - 1;
            this.f4216g = 0;
            this.f4217h = 0;
        }

        private int c(int i) {
            return this.f4215f + 1 + i;
        }

        private int d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f4214e.length;
                while (true) {
                    length--;
                    i2 = this.f4215f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    c[] cVarArr = this.f4214e;
                    i -= cVarArr[length].f4207c;
                    this.f4217h -= cVarArr[length].f4207c;
                    this.f4216g--;
                    i3++;
                }
                c[] cVarArr2 = this.f4214e;
                System.arraycopy(cVarArr2, i2 + 1, cVarArr2, i2 + 1 + i3, this.f4216g);
                this.f4215f += i3;
            }
            return i3;
        }

        private f.f f(int i) {
            c cVar;
            if (!h(i)) {
                int c2 = c(i - d.f4208a.length);
                if (c2 >= 0) {
                    c[] cVarArr = this.f4214e;
                    if (c2 < cVarArr.length) {
                        cVar = cVarArr[c2];
                    }
                }
                throw new IOException("Header index too large " + (i + 1));
            }
            cVar = d.f4208a[i];
            return cVar.f4205a;
        }

        private void g(int i, c cVar) {
            this.f4210a.add(cVar);
            int i2 = cVar.f4207c;
            if (i != -1) {
                i2 -= this.f4214e[c(i)].f4207c;
            }
            int i3 = this.f4213d;
            if (i2 > i3) {
                b();
                return;
            }
            int d2 = d((this.f4217h + i2) - i3);
            if (i == -1) {
                int i4 = this.f4216g + 1;
                c[] cVarArr = this.f4214e;
                if (i4 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f4215f = this.f4214e.length - 1;
                    this.f4214e = cVarArr2;
                }
                int i5 = this.f4215f;
                this.f4215f = i5 - 1;
                this.f4214e[i5] = cVar;
                this.f4216g++;
            } else {
                this.f4214e[i + c(i) + d2] = cVar;
            }
            this.f4217h += i2;
        }

        private boolean h(int i) {
            return i >= 0 && i <= d.f4208a.length - 1;
        }

        private int i() {
            return this.f4211b.d0() & 255;
        }

        private void l(int i) {
            if (h(i)) {
                this.f4210a.add(d.f4208a[i]);
                return;
            }
            int c2 = c(i - d.f4208a.length);
            if (c2 >= 0) {
                c[] cVarArr = this.f4214e;
                if (c2 < cVarArr.length) {
                    this.f4210a.add(cVarArr[c2]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private void n(int i) {
            g(-1, new c(f(i), j()));
        }

        private void o() {
            f.f j = j();
            d.a(j);
            g(-1, new c(j, j()));
        }

        private void p(int i) {
            this.f4210a.add(new c(f(i), j()));
        }

        private void q() {
            f.f j = j();
            d.a(j);
            this.f4210a.add(new c(j, j()));
        }

        public List<c> e() {
            ArrayList arrayList = new ArrayList(this.f4210a);
            this.f4210a.clear();
            return arrayList;
        }

        f.f j() {
            int i = i();
            boolean z = (i & 128) == 128;
            int m = m(i, 127);
            return z ? f.f.m(k.f().c(this.f4211b.Y(m))) : this.f4211b.s(m);
        }

        public void k() {
            while (!this.f4211b.S()) {
                int d0 = this.f4211b.d0() & 255;
                if (d0 == 128) {
                    throw new IOException("index == 0");
                }
                if ((d0 & 128) == 128) {
                    l(m(d0, 127) - 1);
                } else if (d0 == 64) {
                    o();
                } else if ((d0 & 64) == 64) {
                    n(m(d0, 63) - 1);
                } else if ((d0 & 32) == 32) {
                    int m = m(d0, 31);
                    this.f4213d = m;
                    if (m < 0 || m > this.f4212c) {
                        throw new IOException("Invalid dynamic table size update " + this.f4213d);
                    }
                    a();
                } else if (d0 == 16 || d0 == 0) {
                    q();
                } else {
                    p(m(d0, 15) - 1);
                }
            }
        }

        int m(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* loaded from: classes.dex */
    static final class b {

        /* renamed from: a */
        private final f.c f4218a;

        /* renamed from: b */
        private final boolean f4219b;

        /* renamed from: c */
        private int f4220c;

        /* renamed from: d */
        private boolean f4221d;

        /* renamed from: e */
        int f4222e;

        /* renamed from: f */
        c[] f4223f;

        /* renamed from: g */
        int f4224g;

        /* renamed from: h */
        int f4225h;
        int i;

        b(int i, boolean z, f.c cVar) {
            this.f4220c = Integer.MAX_VALUE;
            c[] cVarArr = new c[8];
            this.f4223f = cVarArr;
            this.f4224g = cVarArr.length - 1;
            this.f4225h = 0;
            this.i = 0;
            this.f4222e = i;
            this.f4219b = z;
            this.f4218a = cVar;
        }

        public b(f.c cVar) {
            this(4096, true, cVar);
        }

        private void a() {
            int i = this.f4222e;
            int i2 = this.i;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    c(i2 - i);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f4223f, (Object) null);
            this.f4224g = this.f4223f.length - 1;
            this.f4225h = 0;
            this.i = 0;
        }

        private int c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f4223f.length;
                while (true) {
                    length--;
                    i2 = this.f4224g;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    c[] cVarArr = this.f4223f;
                    i -= cVarArr[length].f4207c;
                    this.i -= cVarArr[length].f4207c;
                    this.f4225h--;
                    i3++;
                }
                c[] cVarArr2 = this.f4223f;
                System.arraycopy(cVarArr2, i2 + 1, cVarArr2, i2 + 1 + i3, this.f4225h);
                c[] cVarArr3 = this.f4223f;
                int i4 = this.f4224g;
                Arrays.fill(cVarArr3, i4 + 1, i4 + 1 + i3, (Object) null);
                this.f4224g += i3;
            }
            return i3;
        }

        private void d(c cVar) {
            int i = cVar.f4207c;
            int i2 = this.f4222e;
            if (i > i2) {
                b();
                return;
            }
            c((this.i + i) - i2);
            int i3 = this.f4225h + 1;
            c[] cVarArr = this.f4223f;
            if (i3 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f4224g = this.f4223f.length - 1;
                this.f4223f = cVarArr2;
            }
            int i4 = this.f4224g;
            this.f4224g = i4 - 1;
            this.f4223f[i4] = cVar;
            this.f4225h++;
            this.i += i;
        }

        public void e(int i) {
            int min = Math.min(i, 16384);
            int i2 = this.f4222e;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.f4220c = Math.min(this.f4220c, min);
            }
            this.f4221d = true;
            this.f4222e = min;
            a();
        }

        void f(f.f fVar) {
            int i;
            int i2;
            if (!this.f4219b || k.f().e(fVar) >= fVar.r()) {
                i2 = fVar.r();
                i = 0;
            } else {
                f.c cVar = new f.c();
                k.f().d(fVar, cVar);
                fVar = cVar.p0();
                i2 = fVar.r();
                i = 128;
            }
            h(i2, 127, i);
            this.f4218a.z0(fVar);
        }

        public void g(List<c> list) {
            int i;
            int i2;
            if (this.f4221d) {
                int i3 = this.f4220c;
                if (i3 < this.f4222e) {
                    h(i3, 31, 32);
                }
                this.f4221d = false;
                this.f4220c = Integer.MAX_VALUE;
                h(this.f4222e, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                c cVar = list.get(i4);
                f.f u = cVar.f4205a.u();
                f.f fVar = cVar.f4206b;
                Integer num = d.f4209b.get(u);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        c[] cVarArr = d.f4208a;
                        if (Objects.equals(cVarArr[i2 - 1].f4206b, fVar)) {
                            i = i2;
                        } else if (Objects.equals(cVarArr[i2].f4206b, fVar)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f4224g + 1;
                    int length = this.f4223f.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (Objects.equals(this.f4223f[i5].f4205a, u)) {
                            if (Objects.equals(this.f4223f[i5].f4206b, fVar)) {
                                i2 = d.f4208a.length + (i5 - this.f4224g);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f4224g) + d.f4208a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    h(i2, 127, 128);
                } else {
                    if (i == -1) {
                        this.f4218a.D0(64);
                        f(u);
                    } else if (!u.s(c.f4200d) || c.i.equals(u)) {
                        h(i, 63, 64);
                    } else {
                        h(i, 15, 0);
                        f(fVar);
                    }
                    f(fVar);
                    d(cVar);
                }
            }
        }

        void h(int i, int i2, int i3) {
            int i4;
            f.c cVar;
            if (i < i2) {
                cVar = this.f4218a;
                i4 = i | i3;
            } else {
                this.f4218a.D0(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f4218a.D0(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                cVar = this.f4218a;
            }
            cVar.D0(i4);
        }
    }

    static {
        f.f fVar = c.f4202f;
        f.f fVar2 = c.f4203g;
        f.f fVar3 = c.f4204h;
        f.f fVar4 = c.f4201e;
        f4208a = new c[]{new c(c.i, ""), new c(fVar, "GET"), new c(fVar, "POST"), new c(fVar2, "/"), new c(fVar2, "/index.html"), new c(fVar3, "http"), new c(fVar3, "https"), new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
    }

    static f.f a(f.f fVar) {
        int r = fVar.r();
        for (int i = 0; i < r; i++) {
            byte k = fVar.k(i);
            if (k >= 65 && k <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.w());
            }
        }
        return fVar;
    }

    private static Map<f.f, Integer> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f4208a.length);
        int i = 0;
        while (true) {
            c[] cVarArr = f4208a;
            if (i < cVarArr.length) {
                if (!linkedHashMap.containsKey(cVarArr[i].f4205a)) {
                    linkedHashMap.put(cVarArr[i].f4205a, Integer.valueOf(i));
                }
                i++;
            } else {
                return Collections.unmodifiableMap(linkedHashMap);
            }
        }
    }
}
