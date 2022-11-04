package ub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000Þ\u0001\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\r\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a*\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\u0002\u001a\u001f\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\t\u0010\n\u001a\n\u0010\r\u001a\u00020\f*\u00020\u000b\u001a!\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\n\u001a)\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u0007*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0012\u0010\u0016\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u001f\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0017\u0010\n\u001a\u0012\u0010\u0018\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u001f\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0019\u0010\n\u001a\n\u0010\u0000\u001a\u00020\u001b*\u00020\u001a\u001a!\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001c\u0010\n\u001a\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001e*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0007\u001a+\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\b\b\u0000\u0010\u0000*\u00020 *\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b!\u0010\"\u001a?\u0010&\u001a\u00028\u0000\"\u0010\b\u0000\u0010$*\n\u0012\u0006\b\u0000\u0012\u00028\u00010#\"\b\b\u0001\u0010\u0000*\u00020 *\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010%\u001a\u00028\u0000¢\u0006\u0004\b&\u0010'\u001a\u0012\u0010*\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010)\u001a\u00020(\u001a\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\u001e*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0007\u001a\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u001e*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0007\u001aC\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010/\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000-j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`.¢\u0006\u0004\b0\u00101\u001aA\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010/\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000-j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`.¢\u0006\u0004\b2\u00103\u001a9\u00104\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010$*\n\u0012\u0006\b\u0000\u0012\u00028\u00000#*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010%\u001a\u00028\u0001¢\u0006\u0004\b4\u0010'\u001a%\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b5\u0010\"\u001a\u0010\u00106\u001a\b\u0012\u0004\u0012\u00020\f0\u001e*\u00020\u000b\u001a\u0010\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001e*\u000207\u001a\u0010\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e*\u00020\u0006\u001a\u0010\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u001e*\u00020;\u001a\u0010\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u001e*\u00020>\u001a\u0010\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u001e*\u00020A\u001a\u0010\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e*\u00020D\u001a\u0010\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e*\u00020\u001a\u001a%\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bH\u0010\"\u001a\u0010\u0010I\u001a\b\u0012\u0004\u0012\u00020\f0G*\u00020\u000b\u001a\u0010\u0010J\u001a\b\u0012\u0004\u0012\u0002080G*\u000207\u001a\u0010\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070G*\u00020\u0006\u001a\u0010\u0010L\u001a\b\u0012\u0004\u0012\u00020<0G*\u00020;\u001a\u0010\u0010M\u001a\b\u0012\u0004\u0012\u00020?0G*\u00020>\u001a\u0010\u0010N\u001a\b\u0012\u0004\u0012\u00020B0G*\u00020A\u001a\u0010\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030G*\u00020D\u001a\u0010\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001b0G*\u00020\u001a\u001a%\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000Q\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bR\u0010S\u001aE\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0018*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010TH\u0086\bø\u0001\u0000¢\u0006\u0004\bV\u0010W\u001a+\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Y0X\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bZ\u0010[\u001aJ\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010]0\u001e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0018*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u000e\u0010\\\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0001H\u0086\u0004¢\u0006\u0004\b^\u0010_\u001a\u007f\u0010i\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\t*\u00060`j\u0002`a*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010b\u001a\u00028\u00012\b\b\u0002\u0010d\u001a\u00020c2\b\b\u0002\u0010e\u001a\u00020c2\b\b\u0002\u0010f\u001a\u00020c2\b\b\u0002\u0010g\u001a\u00020\u00072\b\b\u0002\u0010h\u001a\u00020c2\u0016\b\u0002\u0010U\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020c\u0018\u00010T¢\u0006\u0004\bi\u0010j\u001aq\u0010k\u001a\u00028\u0000\"\f\b\u0000\u0010\t*\u00060`j\u0002`a*\u00020\u000b2\u0006\u0010b\u001a\u00028\u00002\b\b\u0002\u0010d\u001a\u00020c2\b\b\u0002\u0010e\u001a\u00020c2\b\b\u0002\u0010f\u001a\u00020c2\b\b\u0002\u0010g\u001a\u00020\u00072\b\b\u0002\u0010h\u001a\u00020c2\u0016\b\u0002\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020c\u0018\u00010T¢\u0006\u0004\bk\u0010l\u001ai\u0010n\u001a\u00020m\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\b\b\u0002\u0010d\u001a\u00020c2\b\b\u0002\u0010e\u001a\u00020c2\b\b\u0002\u0010f\u001a\u00020c2\b\b\u0002\u0010g\u001a\u00020\u00072\b\b\u0002\u0010h\u001a\u00020c2\u0016\b\u0002\u0010U\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020c\u0018\u00010T¢\u0006\u0004\bn\u0010o\u001aT\u0010p\u001a\u00020m*\u00020\u000b2\b\b\u0002\u0010d\u001a\u00020c2\b\b\u0002\u0010e\u001a\u00020c2\b\b\u0002\u0010f\u001a\u00020c2\b\b\u0002\u0010g\u001a\u00020\u00072\b\b\u0002\u0010h\u001a\u00020c2\u0016\b\u0002\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020c\u0018\u00010T\u001a%\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000X\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bq\u0010[\u001a%\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000r\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bs\u0010t\u001a\u0010\u0010u\u001a\b\u0012\u0004\u0012\u00020\f0r*\u00020\u000b\"#\u0010x\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\bv\u0010w\"\u0015\u0010x\u001a\u00020\u0007*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b$\u0010y\"\u0015\u0010x\u001a\u00020\u0007*\u00020;8F¢\u0006\u0006\u001a\u0004\bz\u0010{\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006|"}, d2 = {"T", BuildConfig.FLAVOR, "element", BuildConfig.FLAVOR, "v", "([Ljava/lang/Object;Ljava/lang/Object;)Z", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "u", "A", "([Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "z", "B", "index", "G", "([Ljava/lang/Object;I)Ljava/lang/Object;", "F", "([II)Ljava/lang/Integer;", "I", "([Ljava/lang/Object;Ljava/lang/Object;)I", "H", "Q", "R", "U", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "V", "n", BuildConfig.FLAVOR, "w", BuildConfig.FLAVOR, "x", "([Ljava/lang/Object;)Ljava/util/List;", BuildConfig.FLAVOR, "C", "destination", "y", "([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;", "Lnc/g;", "indices", "W", "Z", "a0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "X", "([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;", "Y", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "b0", "i0", "c0", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "j0", "g0", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "h0", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "f0", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "e0", BuildConfig.FLAVOR, "k0", "d0", BuildConfig.FLAVOR, "r0", "l0", "s0", "p0", "q0", "o0", "n0", "t0", "m0", BuildConfig.FLAVOR, "u0", "([Ljava/lang/Object;)Ljava/util/Set;", "Lkotlin/Function1;", "transform", "S", "([Ljava/lang/Object;Lgc/l;)Ljava/util/List;", BuildConfig.FLAVOR, "Lub/h0;", "v0", "([Ljava/lang/Object;)Ljava/lang/Iterable;", "other", "Ltb/r;", "w0", "([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", BuildConfig.FLAVOR, "separator", "prefix", "postfix", "limit", "truncated", "K", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lgc/l;)Ljava/lang/Appendable;", "J", "([BLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lgc/l;)Ljava/lang/Appendable;", BuildConfig.FLAVOR, "N", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lgc/l;)Ljava/lang/String;", "M", "r", "Laf/h;", "t", "([Ljava/lang/Object;)Laf/h;", "s", "E", "([Ljava/lang/Object;)I", "lastIndex", "([I)I", "D", "([J)I", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/ArraysKt")
/* loaded from: classes.dex */
public class m extends l {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, d2 = {"ub/m$a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a implements Iterable<T>, ic.a {

        /* renamed from: c */
        final /* synthetic */ Object[] f23382c;

        public a(Object[] objArr) {
            this.f23382c = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return hc.d.a(this.f23382c);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, d2 = {"ub/m$b", "Laf/h;", BuildConfig.FLAVOR, "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b implements af.h<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f23383a;

        public b(Object[] objArr) {
            this.f23383a = objArr;
        }

        @Override // af.h
        public Iterator<T> iterator() {
            return hc.d.a(this.f23383a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, d2 = {"ub/m$c", "Laf/h;", BuildConfig.FLAVOR, "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c implements af.h<Byte> {

        /* renamed from: a */
        final /* synthetic */ byte[] f23384a;

        public c(byte[] bArr) {
            this.f23384a = bArr;
        }

        @Override // af.h
        public Iterator<Byte> iterator() {
            return hc.e.a(this.f23384a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", BuildConfig.FLAVOR, "b", "()Ljava/util/Iterator;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends hc.v implements gc.a<Iterator<? extends T>> {

        /* renamed from: c */
        final /* synthetic */ T[] f23385c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(T[] tArr) {
            super(0);
            this.f23385c = tArr;
        }

        /* renamed from: b */
        public final Iterator<T> invoke() {
            return hc.d.a(this.f23385c);
        }
    }

    public static <T> T A(T[] tArr) {
        hc.t.e(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T B(T[] tArr) {
        hc.t.e(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final int C(int[] iArr) {
        hc.t.e(iArr, "<this>");
        return iArr.length - 1;
    }

    public static int D(long[] jArr) {
        hc.t.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static <T> int E(T[] tArr) {
        hc.t.e(tArr, "<this>");
        return tArr.length - 1;
    }

    public static Integer F(int[] iArr, int i10) {
        hc.t.e(iArr, "<this>");
        if (i10 < 0 || i10 > C(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static <T> T G(T[] tArr, int i10) {
        int E;
        hc.t.e(tArr, "<this>");
        if (i10 >= 0) {
            E = E(tArr);
            if (i10 <= E) {
                return tArr[i10];
            }
        }
        return null;
    }

    public static final int H(int[] iArr, int i10) {
        hc.t.e(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static <T> int I(T[] tArr, T t10) {
        hc.t.e(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (hc.t.a(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <A extends Appendable> A J(byte[] bArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, gc.l<? super Byte, ? extends CharSequence> lVar) {
        hc.t.e(bArr, "<this>");
        hc.t.e(a10, "buffer");
        hc.t.e(charSequence, "separator");
        hc.t.e(charSequence2, "prefix");
        hc.t.e(charSequence3, "postfix");
        hc.t.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(lVar != null ? lVar.invoke(Byte.valueOf(b10)) : String.valueOf((int) b10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T, A extends Appendable> A K(T[] tArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, gc.l<? super T, ? extends CharSequence> lVar) {
        hc.t.e(tArr, "<this>");
        hc.t.e(a10, "buffer");
        hc.t.e(charSequence, "separator");
        hc.t.e(charSequence2, "prefix");
        hc.t.e(charSequence3, "postfix");
        hc.t.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : tArr) {
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

    public static /* synthetic */ Appendable L(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, gc.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        int i12 = i11 & 4;
        CharSequence charSequence5 = BuildConfig.FLAVOR;
        CharSequence charSequence6 = i12 != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return K(objArr, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    public static final String M(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, gc.l<? super Byte, ? extends CharSequence> lVar) {
        hc.t.e(bArr, "<this>");
        hc.t.e(charSequence, "separator");
        hc.t.e(charSequence2, "prefix");
        hc.t.e(charSequence3, "postfix");
        hc.t.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) J(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        hc.t.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final <T> String N(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, gc.l<? super T, ? extends CharSequence> lVar) {
        hc.t.e(tArr, "<this>");
        hc.t.e(charSequence, "separator");
        hc.t.e(charSequence2, "prefix");
        hc.t.e(charSequence3, "postfix");
        hc.t.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) K(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        hc.t.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String O(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, gc.l lVar, int i11, Object obj) {
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
        return M(bArr, charSequence, charSequence6, charSequence5, i13, charSequence7, lVar);
    }

    public static /* synthetic */ String P(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, gc.l lVar, int i11, Object obj) {
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
        return N(objArr, charSequence, charSequence6, charSequence5, i13, charSequence7, lVar);
    }

    public static <T> T Q(T[] tArr) {
        int E;
        hc.t.e(tArr, "<this>");
        if (!(tArr.length == 0)) {
            E = E(tArr);
            return tArr[E];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int R(int[] iArr, int i10) {
        hc.t.e(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    public static <T, R> List<R> S(T[] tArr, gc.l<? super T, ? extends R> lVar) {
        hc.t.e(tArr, "<this>");
        hc.t.e(lVar, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t10 : tArr) {
            arrayList.add(lVar.invoke(t10));
        }
        return arrayList;
    }

    public static char T(char[] cArr) {
        hc.t.e(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return cArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T U(T[] tArr) {
        hc.t.e(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T V(T[] tArr) {
        hc.t.e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static byte[] W(byte[] bArr, nc.g gVar) {
        byte[] i10;
        hc.t.e(bArr, "<this>");
        hc.t.e(gVar, "indices");
        if (gVar.isEmpty()) {
            return new byte[0];
        }
        i10 = l.i(bArr, gVar.l().intValue(), gVar.k().intValue() + 1);
        return i10;
    }

    public static final <T> T[] X(T[] tArr, Comparator<? super T> comparator) {
        hc.t.e(tArr, "<this>");
        hc.t.e(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        hc.t.d(tArr2, "copyOf(this, size)");
        l.q(tArr2, comparator);
        return tArr2;
    }

    public static <T> List<T> Y(T[] tArr, Comparator<? super T> comparator) {
        List<T> d10;
        hc.t.e(tArr, "<this>");
        hc.t.e(comparator, "comparator");
        d10 = l.d(X(tArr, comparator));
        return d10;
    }

    public static List<Byte> Z(byte[] bArr, int i10) {
        List<Byte> d10;
        List<Byte> c02;
        List<Byte> h10;
        hc.t.e(bArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            h10 = u.h();
            return h10;
        } else if (i10 >= bArr.length) {
            c02 = c0(bArr);
            return c02;
        } else if (i10 == 1) {
            d10 = t.d(Byte.valueOf(bArr[0]));
            return d10;
        } else {
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (byte b10 : bArr) {
                arrayList.add(Byte.valueOf(b10));
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return arrayList;
        }
    }

    public static List<Byte> a0(byte[] bArr, int i10) {
        List<Byte> d10;
        List<Byte> c02;
        List<Byte> h10;
        hc.t.e(bArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            h10 = u.h();
            return h10;
        } else {
            int length = bArr.length;
            if (i10 >= length) {
                c02 = c0(bArr);
                return c02;
            } else if (i10 == 1) {
                d10 = t.d(Byte.valueOf(bArr[length - 1]));
                return d10;
            } else {
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = length - i10; i11 < length; i11++) {
                    arrayList.add(Byte.valueOf(bArr[i11]));
                }
                return arrayList;
            }
        }
    }

    public static final <T, C extends Collection<? super T>> C b0(T[] tArr, C c10) {
        hc.t.e(tArr, "<this>");
        hc.t.e(c10, "destination");
        for (T t10 : tArr) {
            c10.add(t10);
        }
        return c10;
    }

    public static List<Byte> c0(byte[] bArr) {
        List<Byte> h10;
        List<Byte> d10;
        hc.t.e(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            h10 = u.h();
            return h10;
        } else if (length != 1) {
            return l0(bArr);
        } else {
            d10 = t.d(Byte.valueOf(bArr[0]));
            return d10;
        }
    }

    public static List<Character> d0(char[] cArr) {
        List<Character> h10;
        List<Character> d10;
        hc.t.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            h10 = u.h();
            return h10;
        } else if (length != 1) {
            return m0(cArr);
        } else {
            d10 = t.d(Character.valueOf(cArr[0]));
            return d10;
        }
    }

    public static List<Double> e0(double[] dArr) {
        List<Double> h10;
        List<Double> d10;
        hc.t.e(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            h10 = u.h();
            return h10;
        } else if (length != 1) {
            return n0(dArr);
        } else {
            d10 = t.d(Double.valueOf(dArr[0]));
            return d10;
        }
    }

    public static List<Float> f0(float[] fArr) {
        List<Float> h10;
        List<Float> d10;
        hc.t.e(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            h10 = u.h();
            return h10;
        } else if (length != 1) {
            return o0(fArr);
        } else {
            d10 = t.d(Float.valueOf(fArr[0]));
            return d10;
        }
    }

    public static List<Integer> g0(int[] iArr) {
        List<Integer> h10;
        List<Integer> d10;
        hc.t.e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            h10 = u.h();
            return h10;
        } else if (length != 1) {
            return p0(iArr);
        } else {
            d10 = t.d(Integer.valueOf(iArr[0]));
            return d10;
        }
    }

    public static List<Long> h0(long[] jArr) {
        List<Long> h10;
        List<Long> d10;
        hc.t.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            h10 = u.h();
            return h10;
        } else if (length != 1) {
            return q0(jArr);
        } else {
            d10 = t.d(Long.valueOf(jArr[0]));
            return d10;
        }
    }

    public static <T> List<T> i0(T[] tArr) {
        List<T> h10;
        List<T> d10;
        List<T> r02;
        hc.t.e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            h10 = u.h();
            return h10;
        } else if (length != 1) {
            r02 = r0(tArr);
            return r02;
        } else {
            d10 = t.d(tArr[0]);
            return d10;
        }
    }

    public static List<Short> j0(short[] sArr) {
        List<Short> h10;
        List<Short> d10;
        hc.t.e(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            h10 = u.h();
            return h10;
        } else if (length != 1) {
            return s0(sArr);
        } else {
            d10 = t.d(Short.valueOf(sArr[0]));
            return d10;
        }
    }

    public static List<Boolean> k0(boolean[] zArr) {
        List<Boolean> h10;
        List<Boolean> d10;
        hc.t.e(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            h10 = u.h();
            return h10;
        } else if (length != 1) {
            return t0(zArr);
        } else {
            d10 = t.d(Boolean.valueOf(zArr[0]));
            return d10;
        }
    }

    public static final List<Byte> l0(byte[] bArr) {
        hc.t.e(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static final List<Character> m0(char[] cArr) {
        hc.t.e(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    public static final List<Double> n0(double[] dArr) {
        hc.t.e(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static final List<Float> o0(float[] fArr) {
        hc.t.e(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static final List<Integer> p0(int[] iArr) {
        hc.t.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static final List<Long> q0(long[] jArr) {
        hc.t.e(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static <T> Iterable<T> r(T[] tArr) {
        List h10;
        hc.t.e(tArr, "<this>");
        if (tArr.length == 0) {
            h10 = u.h();
            return h10;
        }
        return new a(tArr);
    }

    public static <T> List<T> r0(T[] tArr) {
        hc.t.e(tArr, "<this>");
        return new ArrayList(u.e(tArr));
    }

    public static af.h<Byte> s(byte[] bArr) {
        af.h<Byte> e10;
        hc.t.e(bArr, "<this>");
        if (bArr.length == 0) {
            e10 = af.n.e();
            return e10;
        }
        return new c(bArr);
    }

    public static final List<Short> s0(short[] sArr) {
        hc.t.e(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static <T> af.h<T> t(T[] tArr) {
        af.h<T> e10;
        hc.t.e(tArr, "<this>");
        if (tArr.length == 0) {
            e10 = af.n.e();
            return e10;
        }
        return new b(tArr);
    }

    public static final List<Boolean> t0(boolean[] zArr) {
        hc.t.e(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static final boolean u(int[] iArr, int i10) {
        hc.t.e(iArr, "<this>");
        return H(iArr, i10) >= 0;
    }

    public static <T> Set<T> u0(T[] tArr) {
        Set<T> b10;
        Set<T> a10;
        int d10;
        hc.t.e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            b10 = y0.b();
            return b10;
        } else if (length != 1) {
            d10 = p0.d(tArr.length);
            return (Set) b0(tArr, new LinkedHashSet(d10));
        } else {
            a10 = x0.a(tArr[0]);
            return a10;
        }
    }

    public static <T> boolean v(T[] tArr, T t10) {
        int I;
        hc.t.e(tArr, "<this>");
        I = I(tArr, t10);
        return I >= 0;
    }

    public static <T> Iterable<h0<T>> v0(T[] tArr) {
        hc.t.e(tArr, "<this>");
        return new i0(new d(tArr));
    }

    public static List<Byte> w(byte[] bArr, int i10) {
        int b10;
        List<Byte> a02;
        hc.t.e(bArr, "<this>");
        if (i10 >= 0) {
            b10 = nc.m.b(bArr.length - i10, 0);
            a02 = a0(bArr, b10);
            return a02;
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T, R> List<tb.r<T, R>> w0(T[] tArr, R[] rArr) {
        hc.t.e(tArr, "<this>");
        hc.t.e(rArr, "other");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(tb.x.a(tArr[i10], rArr[i10]));
        }
        return arrayList;
    }

    public static <T> List<T> x(T[] tArr) {
        hc.t.e(tArr, "<this>");
        return (List) y(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C y(T[] tArr, C c10) {
        hc.t.e(tArr, "<this>");
        hc.t.e(c10, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static byte z(byte[] bArr) {
        hc.t.e(bArr, "<this>");
        if (!(bArr.length == 0)) {
            return bArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }
}
