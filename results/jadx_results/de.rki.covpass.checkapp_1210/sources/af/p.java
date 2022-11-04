package af;

import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.a1;
import ub.c0;
import ub.u;
import ub.y0;
@Metadata(bv = {}, d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001a$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u001a0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u001a0\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u001a\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\r*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u001a7\u0010\u0013\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0011*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a<\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\b\u001a6\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u001a<\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u001b*\u00020\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\b\u001a\u0016\u0010 \u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aF\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010!\u001a\u00020\u00052\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u00028\u00010\bH\u0007\u001a.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\"\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010#\u001a-\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0086\u0002\u001aZ\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010!\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\t2\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u00028\u00010\bH\u0007\u001a}\u00103\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\u001f*\u00060*j\u0002`+*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010,\u001a\u00028\u00012\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020-2\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020-2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-\u0018\u00010\b¢\u0006\u0004\b3\u00104\u001a`\u00106\u001a\u000205\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020-2\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020-2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-\u0018\u00010\b\u001a\u001c\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u00068"}, d2 = {"T", "Laf/h;", "t", "(Laf/h;)Ljava/lang/Object;", "y", BuildConfig.FLAVOR, "n", "p", "Lkotlin/Function1;", BuildConfig.FLAVOR, "predicate", "q", "r", BuildConfig.FLAVOR, "s", "D", BuildConfig.FLAVOR, "C", "destination", "E", "(Laf/h;Ljava/util/Collection;)Ljava/util/Collection;", BuildConfig.FLAVOR, "F", BuildConfig.FLAVOR, "G", BuildConfig.FLAVOR, "H", "R", "transform", "u", "z", "A", "o", "size", "element", "(Laf/h;Ljava/lang/Object;)Laf/h;", BuildConfig.FLAVOR, "elements", "B", "step", "partialWindows", "I", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", BuildConfig.FLAVOR, "separator", "prefix", "postfix", "limit", "truncated", "v", "(Laf/h;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lgc/l;)Ljava/lang/Appendable;", BuildConfig.FLAVOR, "w", "m", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes3.dex */
public class p extends o {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, d2 = {"af/p$a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a implements Iterable<T>, ic.a {

        /* renamed from: c */
        final /* synthetic */ h f507c;

        public a(h hVar) {
            this.f507c = hVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f507c.iterator();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "T", "it", BuildConfig.FLAVOR, "b", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class b extends v implements gc.l<T, Boolean> {

        /* renamed from: c */
        public static final b f508c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(T t10) {
            return Boolean.valueOf(t10 == 0);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class c extends hc.q implements gc.l<h<? extends R>, Iterator<? extends R>> {
        public static final c Y3 = new c();

        c() {
            super(1, h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: i0 */
        public final Iterator<R> invoke(h<? extends R> hVar) {
            t.e(hVar, "p0");
            return hVar.iterator();
        }
    }

    public static <T, R> h<R> A(h<? extends T> hVar, gc.l<? super T, ? extends R> lVar) {
        h<R> s10;
        t.e(hVar, "<this>");
        t.e(lVar, "transform");
        s10 = s(new r(hVar, lVar));
        return s10;
    }

    public static <T> h<T> B(h<? extends T> hVar, Iterable<? extends T> iterable) {
        h M;
        t.e(hVar, "<this>");
        t.e(iterable, "elements");
        M = c0.M(iterable);
        return n.f(n.l(hVar, M));
    }

    public static <T> h<T> C(h<? extends T> hVar, T t10) {
        t.e(hVar, "<this>");
        return n.f(n.l(hVar, n.l(t10)));
    }

    public static <T> h<T> D(h<? extends T> hVar, gc.l<? super T, Boolean> lVar) {
        t.e(hVar, "<this>");
        t.e(lVar, "predicate");
        return new q(hVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C E(h<? extends T> hVar, C c10) {
        t.e(hVar, "<this>");
        t.e(c10, "destination");
        for (T t10 : hVar) {
            c10.add(t10);
        }
        return c10;
    }

    public static <T> List<T> F(h<? extends T> hVar) {
        List G;
        List<T> o10;
        t.e(hVar, "<this>");
        G = G(hVar);
        o10 = u.o(G);
        return o10;
    }

    public static <T> List<T> G(h<? extends T> hVar) {
        t.e(hVar, "<this>");
        return (List) E(hVar, new ArrayList());
    }

    public static <T> Set<T> H(h<? extends T> hVar) {
        Set<T> d10;
        t.e(hVar, "<this>");
        d10 = y0.d((Set) E(hVar, new LinkedHashSet()));
        return d10;
    }

    public static final <T, R> h<R> I(h<? extends T> hVar, int i10, int i11, boolean z10, gc.l<? super List<? extends T>, ? extends R> lVar) {
        h<R> z11;
        t.e(hVar, "<this>");
        t.e(lVar, "transform");
        z11 = z(a1.c(hVar, i10, i11, z10, true), lVar);
        return z11;
    }

    public static <T> Iterable<T> m(h<? extends T> hVar) {
        t.e(hVar, "<this>");
        return new a(hVar);
    }

    public static <T, R> h<R> n(h<? extends T> hVar, int i10, gc.l<? super List<? extends T>, ? extends R> lVar) {
        t.e(hVar, "<this>");
        t.e(lVar, "transform");
        return I(hVar, i10, i10, true, lVar);
    }

    public static <T> int o(h<? extends T> hVar) {
        t.e(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                u.q();
            }
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> h<T> p(h<? extends T> hVar, int i10) {
        t.e(hVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? hVar : hVar instanceof af.c ? ((af.c) hVar).a(i10) : new af.b(hVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> h<T> q(h<? extends T> hVar, gc.l<? super T, Boolean> lVar) {
        t.e(hVar, "<this>");
        t.e(lVar, "predicate");
        return new e(hVar, true, lVar);
    }

    public static <T> h<T> r(h<? extends T> hVar, gc.l<? super T, Boolean> lVar) {
        t.e(hVar, "<this>");
        t.e(lVar, "predicate");
        return new e(hVar, false, lVar);
    }

    public static <T> h<T> s(h<? extends T> hVar) {
        h<T> r10;
        t.e(hVar, "<this>");
        r10 = r(hVar, b.f508c);
        t.c(r10, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return r10;
    }

    public static <T> T t(h<? extends T> hVar) {
        t.e(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static <T, R> h<R> u(h<? extends T> hVar, gc.l<? super T, ? extends h<? extends R>> lVar) {
        t.e(hVar, "<this>");
        t.e(lVar, "transform");
        return new f(hVar, lVar, c.Y3);
    }

    public static final <T, A extends Appendable> A v(h<? extends T> hVar, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, gc.l<? super T, ? extends CharSequence> lVar) {
        t.e(hVar, "<this>");
        t.e(a10, "buffer");
        t.e(charSequence, "separator");
        t.e(charSequence2, "prefix");
        t.e(charSequence3, "postfix");
        t.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : hVar) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            bf.p.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T> String w(h<? extends T> hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, gc.l<? super T, ? extends CharSequence> lVar) {
        t.e(hVar, "<this>");
        t.e(charSequence, "separator");
        t.e(charSequence2, "prefix");
        t.e(charSequence3, "postfix");
        t.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) v(hVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        t.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String x(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, gc.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        int i12 = i11 & 2;
        CharSequence charSequence5 = BuildConfig.FLAVOR;
        CharSequence charSequence6 = i12 != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i13 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return w(hVar, charSequence, charSequence6, charSequence5, i13, charSequence7, lVar);
    }

    public static <T> T y(h<? extends T> hVar) {
        T next;
        t.e(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static <T, R> h<R> z(h<? extends T> hVar, gc.l<? super T, ? extends R> lVar) {
        t.e(hVar, "<this>");
        t.e(lVar, "transform");
        return new r(hVar, lVar);
    }
}
