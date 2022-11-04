package wc;

import hc.t;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import pd.x;
import ub.u;
import ub.z;
import ub.z0;
import uc.k;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public static final i f24780a;

    /* renamed from: b */
    private static final Set<String> f24781b;

    /* renamed from: c */
    private static final Set<String> f24782c;

    /* renamed from: d */
    private static final Set<String> f24783d;

    /* renamed from: e */
    private static final Set<String> f24784e;

    /* renamed from: f */
    private static final Set<String> f24785f;

    /* renamed from: g */
    private static final Set<String> f24786g;

    static {
        Set<String> i10;
        Set h10;
        Set h11;
        Set h12;
        Set h13;
        Set h14;
        Set<String> h15;
        Set h16;
        Set h17;
        Set h18;
        Set h19;
        Set h20;
        Set<String> h21;
        Set h22;
        Set<String> h23;
        Set h24;
        Set<String> h25;
        i iVar = new i();
        f24780a = iVar;
        x xVar = x.f19141a;
        i10 = z0.i(xVar.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f24781b = i10;
        h10 = z0.h(iVar.b(), xVar.f("List", "sort(Ljava/util/Comparator;)V"));
        h11 = z0.h(h10, xVar.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;"));
        h12 = z0.h(h11, xVar.e("Double", "isInfinite()Z", "isNaN()Z"));
        h13 = z0.h(h12, xVar.e("Float", "isInfinite()Z", "isNaN()Z"));
        h14 = z0.h(h13, xVar.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        h15 = z0.h(h14, xVar.e("CharSequence", "isEmpty()Z"));
        f24782c = h15;
        h16 = z0.h(xVar.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), xVar.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V"));
        h17 = z0.h(h16, xVar.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;"));
        h18 = z0.h(h17, xVar.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V"));
        h19 = z0.h(h18, xVar.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z"));
        h20 = z0.h(h19, xVar.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V"));
        h21 = z0.h(h20, xVar.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f24783d = h21;
        h22 = z0.h(xVar.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), xVar.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V"));
        h23 = z0.h(h22, xVar.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        f24784e = h23;
        Set<String> a10 = iVar.a();
        String[] b10 = xVar.b("D");
        h24 = z0.h(a10, xVar.e("Float", (String[]) Arrays.copyOf(b10, b10.length)));
        String[] b11 = xVar.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        h25 = z0.h(h24, xVar.e("String", (String[]) Arrays.copyOf(b11, b11.length)));
        f24785f = h25;
        String[] b12 = xVar.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f24786g = xVar.e("Throwable", (String[]) Arrays.copyOf(b12, b12.length));
    }

    private i() {
    }

    private final Set<String> a() {
        List<fe.e> k10;
        x xVar = x.f19141a;
        fe.e eVar = fe.e.BYTE;
        k10 = u.k(fe.e.BOOLEAN, eVar, fe.e.DOUBLE, fe.e.FLOAT, eVar, fe.e.INT, fe.e.LONG, fe.e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (fe.e eVar2 : k10) {
            String b10 = eVar2.s().g().b();
            t.d(b10, "it.wrapperFqName.shortName().asString()");
            String[] b11 = xVar.b("Ljava/lang/String;");
            z.x(linkedHashSet, xVar.e(b10, (String[]) Arrays.copyOf(b11, b11.length)));
        }
        return linkedHashSet;
    }

    private final Set<String> b() {
        List<fe.e> k10;
        x xVar = x.f19141a;
        k10 = u.k(fe.e.BOOLEAN, fe.e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (fe.e eVar : k10) {
            String b10 = eVar.s().g().b();
            t.d(b10, "it.wrapperFqName.shortName().asString()");
            z.x(linkedHashSet, xVar.e(b10, eVar.p() + "Value()" + eVar.j()));
        }
        return linkedHashSet;
    }

    public final Set<String> c() {
        return f24781b;
    }

    public final Set<String> d() {
        return f24785f;
    }

    public final Set<String> e() {
        return f24782c;
    }

    public final Set<String> f() {
        return f24784e;
    }

    public final Set<String> g() {
        return f24786g;
    }

    public final Set<String> h() {
        return f24783d;
    }

    public final boolean i(wd.d dVar) {
        t.e(dVar, "fqName");
        return t.a(dVar, k.a.f23481i) || k.e(dVar);
    }

    public final boolean j(wd.d dVar) {
        t.e(dVar, "fqName");
        if (i(dVar)) {
            return true;
        }
        wd.b n10 = c.f24707a.n(dVar);
        if (n10 == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(n10.b().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
