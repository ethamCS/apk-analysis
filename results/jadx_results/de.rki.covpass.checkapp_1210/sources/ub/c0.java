package ub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000¸\u0001\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u001f\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\n\u001a'\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0013\u0010\u0007\u001a\u001d\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0014\u0010\n\u001a\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u001f\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0016\u0010\n\u001a\u001d\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0017\u0010\u0007\u001a\u001d\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0018\u0010\n\u001a\u001f\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0019\u0010\u0007\u001a\u001f\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u001a\u0010\n\u001a$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00020\r\u001a$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001b\u001a\u00020\r\u001a6\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u001eH\u0086\bø\u0001\u0000\u001a\"\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0000*\u00020!*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a=\u0010\u0000\u001a\u00028\u0000\"\u0010\b\u0000\u0010$*\n\u0012\u0006\b\u0000\u0012\u00028\u00010#\"\b\b\u0001\u0010\u0000*\u00020!*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010%\u001a\u00028\u0000¢\u0006\u0004\b\u0000\u0010&\u001a$\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00020\r\u001a$\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001b\u001a\u00020\r\u001a\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a&\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000**\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a8\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010.\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000,j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`-\u001a\u0010\u00102\u001a\u000201*\b\u0012\u0004\u0012\u00020\u000300\u001a\u0010\u00105\u001a\u000204*\b\u0012\u0004\u0012\u00020300\u001a\u0010\u00107\u001a\u000206*\b\u0012\u0004\u0012\u00020\r00\u001a7\u00108\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010$*\n\u0012\u0006\b\u0000\u0012\u00028\u00000#*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010%\u001a\u00028\u0001¢\u0006\u0004\b8\u0010&\u001a&\u0010;\u001a\u0012\u0012\u0004\u0012\u00028\u000009j\b\u0012\u0004\u0012\u00028\u0000`:\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000000\u001a\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a<\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010 *\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0086\bø\u0001\u0000\u001a\"\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000D0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000@\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004\u001a-\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000@\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004\u001a\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000J\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000@\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004\u001a0\u0010M\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u001eH\u0086\bø\u0001\u0000\u001a+\u0010N\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000**\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bN\u0010O\u001a.\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bP\u0010Q\u001a.\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bR\u0010Q\u001a.\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000002\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bS\u0010T\u001a-\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a-\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000002\f\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a?\u0010Y\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010X0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010 *\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0086\u0004\u001a}\u0010d\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\\*\u00060Zj\u0002`[*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010]\u001a\u00028\u00012\b\b\u0002\u0010_\u001a\u00020^2\b\b\u0002\u0010`\u001a\u00020^2\b\b\u0002\u0010a\u001a\u00020^2\b\b\u0002\u0010b\u001a\u00020\r2\b\b\u0002\u0010c\u001a\u00020^2\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020^\u0018\u00010\u001e¢\u0006\u0004\bd\u0010e\u001a`\u0010g\u001a\u00020f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010_\u001a\u00020^2\b\b\u0002\u0010`\u001a\u00020^2\b\b\u0002\u0010a\u001a\u00020^2\b\b\u0002\u0010b\u001a\u00020\r2\b\b\u0002\u0010c\u001a\u00020^2\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020^\u0018\u00010\u001e\u001a\u001c\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000h\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006j"}, d2 = {"T", BuildConfig.FLAVOR, "element", BuildConfig.FLAVOR, "N", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "U", "(Ljava/lang/Iterable;)Ljava/lang/Object;", BuildConfig.FLAVOR, "V", "(Ljava/util/List;)Ljava/lang/Object;", "W", "X", BuildConfig.FLAVOR, "index", "Y", "(Ljava/util/List;I)Ljava/lang/Object;", "Z", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "f0", "g0", "h0", "i0", "r0", "s0", "t0", "u0", "n", "P", "Q", "Lkotlin/Function1;", "predicate", "R", BuildConfig.FLAVOR, "S", BuildConfig.FLAVOR, "C", "destination", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "y0", "z0", "q0", BuildConfig.FLAVOR, "v0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "w0", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "A0", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "B0", BuildConfig.FLAVOR, "E0", "C0", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "D0", "F0", BuildConfig.FLAVOR, "G0", "H0", BuildConfig.FLAVOR, "J0", "transform", "j0", "Lub/h0;", "L0", "O", "other", "a0", "x0", BuildConfig.FLAVOR, "I0", "K0", "L", "k0", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "l0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "n0", "p0", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "elements", "m0", "o0", "Ltb/r;", "M0", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", BuildConfig.FLAVOR, "separator", "prefix", "postfix", "limit", "truncated", "b0", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lgc/l;)Ljava/lang/Appendable;", BuildConfig.FLAVOR, "d0", "Laf/h;", "M", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes.dex */
public class c0 extends b0 {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, d2 = {"ub/c0$a", "Laf/h;", BuildConfig.FLAVOR, "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a implements af.h<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f23364a;

        public a(Iterable iterable) {
            this.f23364a = iterable;
        }

        @Override // af.h
        public Iterator<T> iterator() {
            return this.f23364a.iterator();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", BuildConfig.FLAVOR, "b", "()Ljava/util/Iterator;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<Iterator<? extends T>> {

        /* renamed from: c */
        final /* synthetic */ Iterable<T> f23365c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Iterable<? extends T> iterable) {
            super(0);
            this.f23365c = iterable;
        }

        /* renamed from: b */
        public final Iterator<T> invoke() {
            return this.f23365c.iterator();
        }
    }

    public static boolean[] A0(Collection<Boolean> collection) {
        hc.t.e(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        int i10 = 0;
        for (Boolean bool : collection) {
            zArr[i10] = bool.booleanValue();
            i10++;
        }
        return zArr;
    }

    public static byte[] B0(Collection<Byte> collection) {
        hc.t.e(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        int i10 = 0;
        for (Byte b10 : collection) {
            bArr[i10] = b10.byteValue();
            i10++;
        }
        return bArr;
    }

    public static final <T, C extends Collection<? super T>> C C0(Iterable<? extends T> iterable, C c10) {
        hc.t.e(iterable, "<this>");
        hc.t.e(c10, "destination");
        for (T t10 : iterable) {
            c10.add(t10);
        }
        return c10;
    }

    public static <T> HashSet<T> D0(Iterable<? extends T> iterable) {
        int s10;
        int d10;
        hc.t.e(iterable, "<this>");
        s10 = v.s(iterable, 12);
        d10 = p0.d(s10);
        return (HashSet) C0(iterable, new HashSet(d10));
    }

    public static int[] E0(Collection<Integer> collection) {
        hc.t.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i10 = 0;
        for (Integer num : collection) {
            iArr[i10] = num.intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> List<T> F0(Iterable<? extends T> iterable) {
        List<T> o10;
        List<T> h10;
        List<T> d10;
        List<T> H0;
        hc.t.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            o10 = u.o(G0(iterable));
            return o10;
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            h10 = u.h();
            return h10;
        } else if (size != 1) {
            H0 = H0(collection);
            return H0;
        } else {
            d10 = t.d(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            return d10;
        }
    }

    public static final <T> List<T> G0(Iterable<? extends T> iterable) {
        List<T> H0;
        hc.t.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            H0 = H0((Collection) iterable);
            return H0;
        }
        return (List) C0(iterable, new ArrayList());
    }

    public static <T> List<T> H0(Collection<? extends T> collection) {
        hc.t.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> I0(Iterable<? extends T> iterable) {
        hc.t.e(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) C0(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> J0(Iterable<? extends T> iterable) {
        Set<T> d10;
        Set<T> b10;
        Set<T> a10;
        int d11;
        hc.t.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            d10 = y0.d((Set) C0(iterable, new LinkedHashSet()));
            return d10;
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            b10 = y0.b();
            return b10;
        } else if (size != 1) {
            d11 = p0.d(collection.size());
            return (Set) C0(iterable, new LinkedHashSet(d11));
        } else {
            a10 = x0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            return a10;
        }
    }

    public static <T> Set<T> K0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Set<T> I0;
        hc.t.e(iterable, "<this>");
        hc.t.e(iterable2, "other");
        I0 = I0(iterable);
        z.x(I0, iterable2);
        return I0;
    }

    public static <T> boolean L(Iterable<? extends T> iterable, gc.l<? super T, Boolean> lVar) {
        hc.t.e(iterable, "<this>");
        hc.t.e(lVar, "predicate");
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                if (!lVar.invoke((T) it.next()).booleanValue()) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static <T> Iterable<h0<T>> L0(Iterable<? extends T> iterable) {
        hc.t.e(iterable, "<this>");
        return new i0(new b(iterable));
    }

    public static <T> af.h<T> M(Iterable<? extends T> iterable) {
        hc.t.e(iterable, "<this>");
        return new a(iterable);
    }

    public static <T, R> List<tb.r<T, R>> M0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        int s10;
        int s11;
        hc.t.e(iterable, "<this>");
        hc.t.e(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        s10 = v.s(iterable, 10);
        s11 = v.s(iterable2, 10);
        ArrayList arrayList = new ArrayList(Math.min(s10, s11));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(tb.x.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> boolean N(Iterable<? extends T> iterable, T t10) {
        hc.t.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t10) : Z(iterable, t10) >= 0;
    }

    public static <T> List<T> O(Iterable<? extends T> iterable) {
        Set I0;
        List<T> F0;
        hc.t.e(iterable, "<this>");
        I0 = I0(iterable);
        F0 = F0(I0);
        return F0;
    }

    public static <T> List<T> P(Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        List<T> o10;
        Object f02;
        List<T> d10;
        List<T> h10;
        List<T> F0;
        hc.t.e(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            F0 = F0(iterable);
            return F0;
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i10;
                if (size <= 0) {
                    h10 = u.h();
                    return h10;
                } else if (size == 1) {
                    f02 = f0(iterable);
                    d10 = t.d(f02);
                    return d10;
                } else {
                    arrayList = new ArrayList(size);
                    if (iterable instanceof List) {
                        if (iterable instanceof RandomAccess) {
                            int size2 = collection.size();
                            while (i10 < size2) {
                                arrayList.add(((List) iterable).get(i10));
                                i10++;
                            }
                        } else {
                            ListIterator listIterator = ((List) iterable).listIterator(i10);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        return arrayList;
                    }
                }
            } else {
                arrayList = new ArrayList();
            }
            for (T t10 : iterable) {
                if (i11 >= i10) {
                    arrayList.add(t10);
                } else {
                    i11++;
                }
            }
            o10 = u.o(arrayList);
            return o10;
        }
    }

    public static <T> List<T> Q(List<? extends T> list, int i10) {
        int b10;
        hc.t.e(list, "<this>");
        if (i10 >= 0) {
            b10 = nc.m.b(list.size() - i10, 0);
            return y0(list, b10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> List<T> R(Iterable<? extends T> iterable, gc.l<? super T, Boolean> lVar) {
        hc.t.e(iterable, "<this>");
        hc.t.e(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (lVar.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> List<T> S(Iterable<? extends T> iterable) {
        hc.t.e(iterable, "<this>");
        return (List) T(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C T(Iterable<? extends T> iterable, C c10) {
        hc.t.e(iterable, "<this>");
        hc.t.e(c10, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static <T> T U(Iterable<? extends T> iterable) {
        Object V;
        hc.t.e(iterable, "<this>");
        if (iterable instanceof List) {
            V = V((List) iterable);
            return (T) V;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return it.next();
    }

    public static <T> T V(List<? extends T> list) {
        hc.t.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T W(Iterable<? extends T> iterable) {
        hc.t.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> T X(List<? extends T> list) {
        hc.t.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T Y(List<? extends T> list, int i10) {
        int j10;
        hc.t.e(list, "<this>");
        if (i10 >= 0) {
            j10 = u.j(list);
            if (i10 <= j10) {
                return list.get(i10);
            }
        }
        return null;
    }

    public static final <T> int Z(Iterable<? extends T> iterable, T t10) {
        hc.t.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                u.r();
            }
            if (hc.t.a(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> Set<T> a0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Set<T> I0;
        hc.t.e(iterable, "<this>");
        hc.t.e(iterable2, "other");
        I0 = I0(iterable);
        z.D(I0, iterable2);
        return I0;
    }

    public static final <T, A extends Appendable> A b0(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, gc.l<? super T, ? extends CharSequence> lVar) {
        hc.t.e(iterable, "<this>");
        hc.t.e(a10, "buffer");
        hc.t.e(charSequence, "separator");
        hc.t.e(charSequence2, "prefix");
        hc.t.e(charSequence3, "postfix");
        hc.t.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : iterable) {
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

    public static /* synthetic */ Appendable c0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, gc.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        int i12 = i11 & 4;
        CharSequence charSequence5 = BuildConfig.FLAVOR;
        CharSequence charSequence6 = i12 != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return b0(iterable, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    public static final <T> String d0(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, gc.l<? super T, ? extends CharSequence> lVar) {
        hc.t.e(iterable, "<this>");
        hc.t.e(charSequence, "separator");
        hc.t.e(charSequence2, "prefix");
        hc.t.e(charSequence3, "postfix");
        hc.t.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) b0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        hc.t.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String e0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, gc.l lVar, int i11, Object obj) {
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
        return d0(iterable, charSequence, charSequence6, charSequence5, i13, charSequence7, lVar);
    }

    public static <T> T f0(Iterable<? extends T> iterable) {
        T next;
        Object g02;
        hc.t.e(iterable, "<this>");
        if (iterable instanceof List) {
            g02 = g0((List) iterable);
            return (T) g02;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T g0(List<? extends T> list) {
        int j10;
        hc.t.e(list, "<this>");
        if (!list.isEmpty()) {
            j10 = u.j(list);
            return list.get(j10);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T h0(Iterable<? extends T> iterable) {
        T next;
        hc.t.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return (T) list.get(list.size() - 1);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T i0(List<? extends T> list) {
        hc.t.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T, R> List<R> j0(Iterable<? extends T> iterable, gc.l<? super T, ? extends R> lVar) {
        int s10;
        hc.t.e(iterable, "<this>");
        hc.t.e(lVar, "transform");
        s10 = v.s(iterable, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(lVar.invoke((T) it.next()));
        }
        return arrayList;
    }

    public static <T extends Comparable<? super T>> T k0(Iterable<? extends T> iterable) {
        hc.t.e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> List<T> l0(Iterable<? extends T> iterable, T t10) {
        int s10;
        hc.t.e(iterable, "<this>");
        s10 = v.s(iterable, 10);
        ArrayList arrayList = new ArrayList(s10);
        boolean z10 = false;
        for (T t11 : iterable) {
            boolean z11 = true;
            if (!z10 && hc.t.a(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static <T> List<T> m0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        List<T> o02;
        hc.t.e(iterable, "<this>");
        hc.t.e(iterable2, "elements");
        if (iterable instanceof Collection) {
            o02 = o0((Collection) iterable, iterable2);
            return o02;
        }
        ArrayList arrayList = new ArrayList();
        z.x(arrayList, iterable);
        z.x(arrayList, iterable2);
        return arrayList;
    }

    public static <T> List<T> n0(Iterable<? extends T> iterable, T t10) {
        List<T> p02;
        hc.t.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            p02 = p0((Collection) iterable, t10);
            return p02;
        }
        ArrayList arrayList = new ArrayList();
        z.x(arrayList, iterable);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> List<T> o0(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        hc.t.e(collection, "<this>");
        hc.t.e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            z.x(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> p0(Collection<? extends T> collection, T t10) {
        hc.t.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> List<T> q0(Iterable<? extends T> iterable) {
        List<T> F0;
        hc.t.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            F0 = F0(iterable);
            return F0;
        }
        List<T> G0 = G0(iterable);
        b0.K(G0);
        return G0;
    }

    public static <T> T r0(Iterable<? extends T> iterable) {
        Object s02;
        hc.t.e(iterable, "<this>");
        if (iterable instanceof List) {
            s02 = s0((List) iterable);
            return (T) s02;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static <T> T s0(List<? extends T> list) {
        hc.t.e(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                throw new IllegalArgumentException("List has more than one element.");
            }
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T t0(Iterable<? extends T> iterable) {
        hc.t.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() != 1) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        return null;
    }

    public static <T> T u0(List<? extends T> list) {
        hc.t.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T extends Comparable<? super T>> List<T> v0(Iterable<? extends T> iterable) {
        List<T> d10;
        List<T> F0;
        hc.t.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> G0 = G0(iterable);
            y.v(G0);
            return G0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            F0 = F0(iterable);
            return F0;
        }
        Object[] array = collection.toArray(new Comparable[0]);
        hc.t.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        hc.t.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sorted>");
        Comparable[] comparableArr = (Comparable[]) array;
        l.p(comparableArr);
        d10 = l.d(comparableArr);
        return d10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> w0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        List<T> d10;
        List<T> F0;
        hc.t.e(iterable, "<this>");
        hc.t.e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> G0 = G0(iterable);
            y.w(G0, comparator);
            return G0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            F0 = F0(iterable);
            return F0;
        }
        Object[] array = collection.toArray(new Object[0]);
        hc.t.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        hc.t.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sortedWith>");
        l.q(array, comparator);
        d10 = l.d(array);
        return d10;
    }

    public static <T> Set<T> x0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Set<T> I0;
        hc.t.e(iterable, "<this>");
        hc.t.e(iterable2, "other");
        I0 = I0(iterable);
        z.z(I0, iterable2);
        return I0;
    }

    public static final <T> List<T> y0(Iterable<? extends T> iterable, int i10) {
        List<T> o10;
        Object U;
        List<T> d10;
        List<T> F0;
        List<T> h10;
        hc.t.e(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            h10 = u.h();
            return h10;
        } else {
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    F0 = F0(iterable);
                    return F0;
                } else if (i10 == 1) {
                    U = U(iterable);
                    d10 = t.d(U);
                    return d10;
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            for (T t10 : iterable) {
                arrayList.add(t10);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            o10 = u.o(arrayList);
            return o10;
        }
    }

    public static <T> List<T> z0(List<? extends T> list, int i10) {
        Object g02;
        List<T> d10;
        List<T> F0;
        List<T> h10;
        hc.t.e(list, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            h10 = u.h();
            return h10;
        } else {
            int size = list.size();
            if (i10 >= size) {
                F0 = F0(list);
                return F0;
            } else if (i10 == 1) {
                g02 = g0(list);
                d10 = t.d(g02);
                return d10;
            } else {
                ArrayList arrayList = new ArrayList(i10);
                if (list instanceof RandomAccess) {
                    for (int i11 = size - i10; i11 < size; i11++) {
                        arrayList.add(list.get(i11));
                    }
                } else {
                    ListIterator<? extends T> listIterator = list.listIterator(size - i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        }
    }
}
