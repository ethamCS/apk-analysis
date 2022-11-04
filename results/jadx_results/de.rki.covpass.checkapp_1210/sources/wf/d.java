package wf;

import eg.a0;
import hc.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\u0010B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lwf/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Leg/f;", BuildConfig.FLAVOR, "d", "name", "a", BuildConfig.FLAVOR, "Lwf/c;", "STATIC_HEADER_TABLE", "[Lwf/c;", "c", "()[Lwf/c;", "NAME_TO_FIRST_INDEX", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    public static final d f24901a;

    /* renamed from: b */
    private static final c[] f24902b;

    /* renamed from: c */
    private static final Map<eg.f, Integer> f24903c;

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u0006\u0010\u001a\u001a\u00020\u0002J\u0016\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0010¨\u0006%"}, d2 = {"Lwf/d$a;", BuildConfig.FLAVOR, "Ltb/e0;", "a", "b", BuildConfig.FLAVOR, "bytesToRecover", "d", "index", "l", "c", "p", "q", "nameIndex", "n", "o", "Leg/f;", "f", BuildConfig.FLAVOR, "h", "Lwf/c;", "entry", "g", "i", BuildConfig.FLAVOR, "e", "k", "firstByte", "prefixMask", "m", "j", "Leg/a0;", "source", "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(Leg/a0;II)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final int f24904a;

        /* renamed from: b */
        private int f24905b;

        /* renamed from: c */
        private final List<c> f24906c;

        /* renamed from: d */
        private final eg.e f24907d;

        /* renamed from: e */
        public c[] f24908e;

        /* renamed from: f */
        private int f24909f;

        /* renamed from: g */
        public int f24910g;

        /* renamed from: h */
        public int f24911h;

        public a(a0 a0Var, int i10, int i11) {
            t.e(a0Var, "source");
            this.f24904a = i10;
            this.f24905b = i11;
            this.f24906c = new ArrayList();
            this.f24907d = eg.n.d(a0Var);
            c[] cVarArr = new c[8];
            this.f24908e = cVarArr;
            this.f24909f = cVarArr.length - 1;
        }

        public /* synthetic */ a(a0 a0Var, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(a0Var, i10, (i12 & 4) != 0 ? i10 : i11);
        }

        private final void a() {
            int i10 = this.f24905b;
            int i11 = this.f24911h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            ub.l.m(this.f24908e, null, 0, 0, 6, null);
            this.f24909f = this.f24908e.length - 1;
            this.f24910g = 0;
            this.f24911h = 0;
        }

        private final int c(int i10) {
            return this.f24909f + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f24908e.length;
                while (true) {
                    length--;
                    i11 = this.f24909f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f24908e[length];
                    t.b(cVar);
                    int i13 = cVar.f24900c;
                    i10 -= i13;
                    this.f24911h -= i13;
                    this.f24910g--;
                    i12++;
                }
                c[] cVarArr = this.f24908e;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f24910g);
                this.f24909f += i12;
            }
            return i12;
        }

        private final eg.f f(int i10) {
            c cVar;
            if (!h(i10)) {
                int c10 = c(i10 - d.f24901a.c().length);
                if (c10 >= 0) {
                    c[] cVarArr = this.f24908e;
                    if (c10 < cVarArr.length) {
                        cVar = cVarArr[c10];
                        t.b(cVar);
                    }
                }
                throw new IOException(t.l("Header index too large ", Integer.valueOf(i10 + 1)));
            }
            cVar = d.f24901a.c()[i10];
            return cVar.f24898a;
        }

        private final void g(int i10, c cVar) {
            this.f24906c.add(cVar);
            int i11 = cVar.f24900c;
            if (i10 != -1) {
                c cVar2 = this.f24908e[c(i10)];
                t.b(cVar2);
                i11 -= cVar2.f24900c;
            }
            int i12 = this.f24905b;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f24911h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f24910g + 1;
                c[] cVarArr = this.f24908e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f24909f = this.f24908e.length - 1;
                    this.f24908e = cVarArr2;
                }
                int i14 = this.f24909f;
                this.f24909f = i14 - 1;
                this.f24908e[i14] = cVar;
                this.f24910g++;
            } else {
                this.f24908e[i10 + c(i10) + d10] = cVar;
            }
            this.f24911h += i11;
        }

        private final boolean h(int i10) {
            return i10 >= 0 && i10 <= d.f24901a.c().length - 1;
        }

        private final int i() {
            return pf.d.d(this.f24907d.readByte(), 255);
        }

        private final void l(int i10) {
            if (h(i10)) {
                this.f24906c.add(d.f24901a.c()[i10]);
                return;
            }
            int c10 = c(i10 - d.f24901a.c().length);
            if (c10 >= 0) {
                c[] cVarArr = this.f24908e;
                if (c10 < cVarArr.length) {
                    List<c> list = this.f24906c;
                    c cVar = cVarArr[c10];
                    t.b(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException(t.l("Header index too large ", Integer.valueOf(i10 + 1)));
        }

        private final void n(int i10) {
            g(-1, new c(f(i10), j()));
        }

        private final void o() {
            g(-1, new c(d.f24901a.a(j()), j()));
        }

        private final void p(int i10) {
            this.f24906c.add(new c(f(i10), j()));
        }

        private final void q() {
            this.f24906c.add(new c(d.f24901a.a(j()), j()));
        }

        public final List<c> e() {
            List<c> F0;
            F0 = c0.F0(this.f24906c);
            this.f24906c.clear();
            return F0;
        }

        public final eg.f j() {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            long m10 = m(i10, 127);
            if (z10) {
                eg.c cVar = new eg.c();
                k.f25067a.b(this.f24907d, m10, cVar);
                return cVar.w0();
            }
            return this.f24907d.F(m10);
        }

        public final void k() {
            while (!this.f24907d.g0()) {
                int d10 = pf.d.d(this.f24907d.readByte(), 255);
                if (d10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((d10 & 128) == 128) {
                    l(m(d10, 127) - 1);
                } else if (d10 == 64) {
                    o();
                } else if ((d10 & 64) == 64) {
                    n(m(d10, 63) - 1);
                } else if ((d10 & 32) == 32) {
                    int m10 = m(d10, 31);
                    this.f24905b = m10;
                    if (m10 < 0 || m10 > this.f24904a) {
                        throw new IOException(t.l("Invalid dynamic table size update ", Integer.valueOf(this.f24905b)));
                    }
                    a();
                } else if (d10 == 16 || d10 == 0) {
                    q();
                } else {
                    p(m(d10, 15) - 1);
                }
            }
        }

        public final int m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004¨\u0006\u001d"}, d2 = {"Lwf/d$b;", BuildConfig.FLAVOR, "Ltb/e0;", "b", BuildConfig.FLAVOR, "bytesToRecover", "c", "Lwf/c;", "entry", "d", "a", BuildConfig.FLAVOR, "headerBlock", "g", "value", "prefixMask", "bits", "h", "Leg/f;", "data", "f", "headerTableSizeSetting", "e", BuildConfig.FLAVOR, "useCompression", "Leg/c;", "out", "<init>", "(IZLeg/c;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public int f24912a;

        /* renamed from: b */
        private final boolean f24913b;

        /* renamed from: c */
        private final eg.c f24914c;

        /* renamed from: d */
        private int f24915d;

        /* renamed from: e */
        private boolean f24916e;

        /* renamed from: f */
        public int f24917f;

        /* renamed from: g */
        public c[] f24918g;

        /* renamed from: h */
        private int f24919h;

        /* renamed from: i */
        public int f24920i;

        /* renamed from: j */
        public int f24921j;

        public b(int i10, boolean z10, eg.c cVar) {
            t.e(cVar, "out");
            this.f24912a = i10;
            this.f24913b = z10;
            this.f24914c = cVar;
            this.f24915d = Integer.MAX_VALUE;
            this.f24917f = i10;
            c[] cVarArr = new c[8];
            this.f24918g = cVarArr;
            this.f24919h = cVarArr.length - 1;
        }

        public /* synthetic */ b(int i10, boolean z10, eg.c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, cVar);
        }

        private final void a() {
            int i10 = this.f24917f;
            int i11 = this.f24921j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            ub.l.m(this.f24918g, null, 0, 0, 6, null);
            this.f24919h = this.f24918g.length - 1;
            this.f24920i = 0;
            this.f24921j = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f24918g.length;
                while (true) {
                    length--;
                    i11 = this.f24919h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f24918g[length];
                    t.b(cVar);
                    i10 -= cVar.f24900c;
                    int i13 = this.f24921j;
                    c cVar2 = this.f24918g[length];
                    t.b(cVar2);
                    this.f24921j = i13 - cVar2.f24900c;
                    this.f24920i--;
                    i12++;
                }
                c[] cVarArr = this.f24918g;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f24920i);
                c[] cVarArr2 = this.f24918g;
                int i14 = this.f24919h;
                Arrays.fill(cVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f24919h += i12;
            }
            return i12;
        }

        private final void d(c cVar) {
            int i10 = cVar.f24900c;
            int i11 = this.f24917f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f24921j + i10) - i11);
            int i12 = this.f24920i + 1;
            c[] cVarArr = this.f24918g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f24919h = this.f24918g.length - 1;
                this.f24918g = cVarArr2;
            }
            int i13 = this.f24919h;
            this.f24919h = i13 - 1;
            this.f24918g[i13] = cVar;
            this.f24920i++;
            this.f24921j += i10;
        }

        public final void e(int i10) {
            this.f24912a = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f24917f;
            if (i11 == min) {
                return;
            }
            if (min < i11) {
                this.f24915d = Math.min(this.f24915d, min);
            }
            this.f24916e = true;
            this.f24917f = min;
            a();
        }

        public final void f(eg.f fVar) {
            int i10;
            int i11;
            t.e(fVar, "data");
            if (this.f24913b) {
                k kVar = k.f25067a;
                if (kVar.d(fVar) < fVar.W()) {
                    eg.c cVar = new eg.c();
                    kVar.c(fVar, cVar);
                    fVar = cVar.w0();
                    i11 = fVar.W();
                    i10 = 128;
                    h(i11, 127, i10);
                    this.f24914c.k0(fVar);
                }
            }
            i11 = fVar.W();
            i10 = 0;
            h(i11, 127, i10);
            this.f24914c.k0(fVar);
        }

        public final void g(List<c> list) {
            int i10;
            int i11;
            t.e(list, "headerBlock");
            if (this.f24916e) {
                int i12 = this.f24915d;
                if (i12 < this.f24917f) {
                    h(i12, 31, 32);
                }
                this.f24916e = false;
                this.f24915d = Integer.MAX_VALUE;
                h(this.f24917f, 31, 32);
            }
            int size = list.size();
            int i13 = 0;
            while (i13 < size) {
                int i14 = i13 + 1;
                c cVar = list.get(i13);
                eg.f c02 = cVar.f24898a.c0();
                eg.f fVar = cVar.f24899b;
                d dVar = d.f24901a;
                Integer num = dVar.b().get(c02);
                if (num != null) {
                    i10 = num.intValue() + 1;
                    if (2 <= i10 && i10 < 8) {
                        if (t.a(dVar.c()[i10 - 1].f24899b, fVar)) {
                            i11 = i10;
                        } else if (t.a(dVar.c()[i10].f24899b, fVar)) {
                            i10++;
                            i11 = i10;
                        }
                    }
                    i11 = i10;
                    i10 = -1;
                } else {
                    i11 = -1;
                    i10 = -1;
                }
                if (i10 == -1) {
                    int i15 = this.f24919h + 1;
                    int length = this.f24918g.length;
                    while (true) {
                        if (i15 >= length) {
                            break;
                        }
                        int i16 = i15 + 1;
                        c cVar2 = this.f24918g[i15];
                        t.b(cVar2);
                        if (t.a(cVar2.f24898a, c02)) {
                            c cVar3 = this.f24918g[i15];
                            t.b(cVar3);
                            if (t.a(cVar3.f24899b, fVar)) {
                                i10 = d.f24901a.c().length + (i15 - this.f24919h);
                                break;
                            } else if (i11 == -1) {
                                i11 = d.f24901a.c().length + (i15 - this.f24919h);
                            }
                        }
                        i15 = i16;
                    }
                }
                if (i10 != -1) {
                    h(i10, 127, 128);
                } else {
                    if (i11 == -1) {
                        this.f24914c.i0(64);
                        f(c02);
                    } else if (!c02.b0(c.f24892d) || t.a(c.f24897i, c02)) {
                        h(i11, 63, 64);
                    } else {
                        h(i11, 15, 0);
                        f(fVar);
                    }
                    f(fVar);
                    d(cVar);
                }
                i13 = i14;
            }
        }

        public final void h(int i10, int i11, int i12) {
            int i13;
            eg.c cVar;
            if (i10 < i11) {
                cVar = this.f24914c;
                i13 = i10 | i12;
            } else {
                this.f24914c.i0(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f24914c.i0(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                cVar = this.f24914c;
            }
            cVar.i0(i13);
        }
    }

    static {
        d dVar = new d();
        f24901a = dVar;
        eg.f fVar = c.f24894f;
        eg.f fVar2 = c.f24895g;
        eg.f fVar3 = c.f24896h;
        eg.f fVar4 = c.f24893e;
        f24902b = new c[]{new c(c.f24897i, BuildConfig.FLAVOR), new c(fVar, "GET"), new c(fVar, "POST"), new c(fVar2, "/"), new c(fVar2, "/index.html"), new c(fVar3, "http"), new c(fVar3, "https"), new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", BuildConfig.FLAVOR), new c("accept-encoding", "gzip, deflate"), new c("accept-language", BuildConfig.FLAVOR), new c("accept-ranges", BuildConfig.FLAVOR), new c("accept", BuildConfig.FLAVOR), new c("access-control-allow-origin", BuildConfig.FLAVOR), new c("age", BuildConfig.FLAVOR), new c("allow", BuildConfig.FLAVOR), new c("authorization", BuildConfig.FLAVOR), new c("cache-control", BuildConfig.FLAVOR), new c("content-disposition", BuildConfig.FLAVOR), new c("content-encoding", BuildConfig.FLAVOR), new c("content-language", BuildConfig.FLAVOR), new c("content-length", BuildConfig.FLAVOR), new c("content-location", BuildConfig.FLAVOR), new c("content-range", BuildConfig.FLAVOR), new c("content-type", BuildConfig.FLAVOR), new c("cookie", BuildConfig.FLAVOR), new c("date", BuildConfig.FLAVOR), new c("etag", BuildConfig.FLAVOR), new c("expect", BuildConfig.FLAVOR), new c("expires", BuildConfig.FLAVOR), new c("from", BuildConfig.FLAVOR), new c("host", BuildConfig.FLAVOR), new c("if-match", BuildConfig.FLAVOR), new c("if-modified-since", BuildConfig.FLAVOR), new c("if-none-match", BuildConfig.FLAVOR), new c("if-range", BuildConfig.FLAVOR), new c("if-unmodified-since", BuildConfig.FLAVOR), new c("last-modified", BuildConfig.FLAVOR), new c("link", BuildConfig.FLAVOR), new c("location", BuildConfig.FLAVOR), new c("max-forwards", BuildConfig.FLAVOR), new c("proxy-authenticate", BuildConfig.FLAVOR), new c("proxy-authorization", BuildConfig.FLAVOR), new c("range", BuildConfig.FLAVOR), new c("referer", BuildConfig.FLAVOR), new c("refresh", BuildConfig.FLAVOR), new c("retry-after", BuildConfig.FLAVOR), new c("server", BuildConfig.FLAVOR), new c("set-cookie", BuildConfig.FLAVOR), new c("strict-transport-security", BuildConfig.FLAVOR), new c("transfer-encoding", BuildConfig.FLAVOR), new c("user-agent", BuildConfig.FLAVOR), new c("vary", BuildConfig.FLAVOR), new c("via", BuildConfig.FLAVOR), new c("www-authenticate", BuildConfig.FLAVOR)};
        f24903c = dVar.d();
    }

    private d() {
    }

    private final Map<eg.f, Integer> d() {
        c[] cVarArr = f24902b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            c[] cVarArr2 = f24902b;
            if (!linkedHashMap.containsKey(cVarArr2[i10].f24898a)) {
                linkedHashMap.put(cVarArr2[i10].f24898a, Integer.valueOf(i10));
            }
            i10 = i11;
        }
        Map<eg.f, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        t.d(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final eg.f a(eg.f fVar) {
        t.e(fVar, "name");
        int W = fVar.W();
        int i10 = 0;
        while (i10 < W) {
            int i11 = i10 + 1;
            byte p10 = fVar.p(i10);
            if (65 <= p10 && p10 <= 90) {
                throw new IOException(t.l("PROTOCOL_ERROR response malformed: mixed case name: ", fVar.e0()));
            }
            i10 = i11;
        }
        return fVar;
    }

    public final Map<eg.f, Integer> b() {
        return f24903c;
    }

    public final c[] c() {
        return f24902b;
    }
}
