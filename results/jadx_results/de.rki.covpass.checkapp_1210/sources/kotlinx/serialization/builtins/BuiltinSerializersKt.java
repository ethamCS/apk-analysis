package kotlinx.serialization.builtins;

import hc.i;
import hc.n;
import hc.p0;
import hc.s;
import hc.t;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kf.d0;
import kf.f1;
import kf.h0;
import kf.j;
import kf.j0;
import kf.j1;
import kf.k1;
import kf.m;
import kf.m0;
import kf.m1;
import kf.n0;
import kf.o1;
import kf.p1;
import kf.q;
import kf.q1;
import kf.r0;
import kf.r1;
import kf.s1;
import kf.t0;
import kf.u;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.a;
import kotlinx.serialization.internal.b;
import kotlinx.serialization.internal.c;
import kotlinx.serialization.internal.e;
import kotlinx.serialization.internal.f;
import kotlinx.serialization.internal.g;
import kotlinx.serialization.internal.h;
import oc.d;
import org.conscrypt.BuildConfig;
import tb.a0;
import tb.c0;
import tb.e0;
import tb.r;
import tb.w;
import tb.y;
import tb.z;
@Metadata(bv = {}, d1 = {"\u0000î\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u001a@\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u001aZ\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f0\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002*\u00020\u0011\u001a\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002*\u00020\u0016\u001a\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002*\u00020\u001a\u001a\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0002*\u00020\u001e\u001a\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020#0\u0002*\u00020\"\u001a\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020'0\u0002*\u00020&\u001a\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020+0\u0002*\u00020*\u001a\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0002\u001a\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020/0\u0002*\u00020.¢\u0006\u0004\b\u0013\u00100\u001a\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0002\u001a\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002030\u0002*\u000203¢\u0006\u0004\b\u0013\u00104\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002060\u0002*\u000205\u001aF\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010=0\u0002\"\b\b\u0000\u00108*\u000207\"\n\b\u0001\u00109*\u0004\u0018\u00018\u00002\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001a&\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000?0\u0002\"\u0004\b\u0000\u001082\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a&\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000A0\u0002\"\u0004\b\u0000\u001082\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a@\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C0\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020F0\u0002*\u00020EH\u0007ø\u0001\u0000\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020H0\u0002*\u00020GH\u0007ø\u0001\u0000\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020J0\u0002*\u00020IH\u0007ø\u0001\u0000\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020L0\u0002*\u00020KH\u0007ø\u0001\u0000\"3\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u00108*\u000207*\b\u0012\u0004\u0012\u00028\u00000\u00028F¢\u0006\f\u0012\u0004\bO\u0010P\u001a\u0004\bM\u0010N\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, d2 = {"K", "V", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "Ltb/r;", "l", BuildConfig.FLAVOR, "j", "A", "B", "C", "aSerializer", "bSerializer", "cSerializer", "Ltb/w;", "o", "Lkotlin/Char$Companion;", BuildConfig.FLAVOR, "serializer", BuildConfig.FLAVOR, "d", "Lkotlin/Byte$Companion;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "c", "Lkotlin/Short$Companion;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "n", "Lkotlin/Int$Companion;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "g", "Lkotlin/Long$Companion;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "i", "Lkotlin/Float$Companion;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "f", "Lkotlin/Double$Companion;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "e", "Lkotlin/Boolean$Companion;", BuildConfig.FLAVOR, "(Lhc/f;)Lkotlinx/serialization/KSerializer;", BuildConfig.FLAVOR, "b", "Ltb/e0;", "(Ltb/e0;)Lkotlinx/serialization/KSerializer;", "Lkotlin/String$Companion;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "T", "E", "Loc/d;", "kClass", "elementSerializer", BuildConfig.FLAVOR, "a", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "m", BuildConfig.FLAVOR, "k", "Ltb/z$a;", "Ltb/z;", "Ltb/a0$a;", "Ltb/a0;", "Ltb/y$a;", "Ltb/y;", "Ltb/c0$a;", "Ltb/c0;", "p", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "getNullable$annotations", "(Lkotlinx/serialization/KSerializer;)V", "nullable", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class BuiltinSerializersKt {
    public static final <T, E extends T> KSerializer<E[]> a(d<T> dVar, KSerializer<E> kSerializer) {
        t.e(dVar, "kClass");
        t.e(kSerializer, "elementSerializer");
        return new f1(dVar, kSerializer);
    }

    public static final KSerializer<boolean[]> b() {
        return a.f15594c;
    }

    public static final KSerializer<byte[]> c() {
        return b.f15595c;
    }

    public static final KSerializer<char[]> d() {
        return c.f15596c;
    }

    public static final KSerializer<double[]> e() {
        return kotlinx.serialization.internal.d.f15597c;
    }

    public static final KSerializer<float[]> f() {
        return e.f15598c;
    }

    public static final KSerializer<int[]> g() {
        return f.f15599c;
    }

    public static final <T> KSerializer<List<T>> h(KSerializer<T> kSerializer) {
        t.e(kSerializer, "elementSerializer");
        return new kf.f(kSerializer);
    }

    public static final KSerializer<long[]> i() {
        return g.f15600c;
    }

    public static final <K, V> KSerializer<Map.Entry<K, V>> j(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        t.e(kSerializer, "keySerializer");
        t.e(kSerializer2, "valueSerializer");
        return new n0(kSerializer, kSerializer2);
    }

    public static final <K, V> KSerializer<Map<K, V>> k(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        t.e(kSerializer, "keySerializer");
        t.e(kSerializer2, "valueSerializer");
        return new h0(kSerializer, kSerializer2);
    }

    public static final <K, V> KSerializer<r<K, V>> l(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        t.e(kSerializer, "keySerializer");
        t.e(kSerializer2, "valueSerializer");
        return new t0(kSerializer, kSerializer2);
    }

    public static final <T> KSerializer<Set<T>> m(KSerializer<T> kSerializer) {
        t.e(kSerializer, "elementSerializer");
        return new j0(kSerializer);
    }

    public static final KSerializer<short[]> n() {
        return h.f15601c;
    }

    public static final <A, B, C> KSerializer<w<A, B, C>> o(KSerializer<A> kSerializer, KSerializer<B> kSerializer2, KSerializer<C> kSerializer3) {
        t.e(kSerializer, "aSerializer");
        t.e(kSerializer2, "bSerializer");
        t.e(kSerializer3, "cSerializer");
        return new m1(kSerializer, kSerializer2, kSerializer3);
    }

    public static final <T> KSerializer<T> p(KSerializer<T> kSerializer) {
        t.e(kSerializer, "<this>");
        return kSerializer.getDescriptor().o() ? kSerializer : new r0(kSerializer);
    }

    public static final KSerializer<Boolean> serializer(hc.f fVar) {
        t.e(fVar, "<this>");
        return kf.h.f15167a;
    }

    public static final KSerializer<Byte> serializer(hc.g gVar) {
        t.e(gVar, "<this>");
        return j.f15174a;
    }

    public static final KSerializer<Character> serializer(i iVar) {
        t.e(iVar, "<this>");
        return m.f15195a;
    }

    public static final KSerializer<Double> serializer(hc.m mVar) {
        t.e(mVar, "<this>");
        return q.f15223a;
    }

    public static final KSerializer<Short> serializer(hc.n0 n0Var) {
        t.e(n0Var, "<this>");
        return j1.f15177a;
    }

    public static final KSerializer<Float> serializer(n nVar) {
        t.e(nVar, "<this>");
        return u.f15253a;
    }

    public static final KSerializer<String> serializer(p0 p0Var) {
        t.e(p0Var, "<this>");
        return k1.f15181a;
    }

    public static final KSerializer<Integer> serializer(s sVar) {
        t.e(sVar, "<this>");
        return d0.f15152a;
    }

    public static final KSerializer<Long> serializer(hc.w wVar) {
        t.e(wVar, "<this>");
        return m0.f15197a;
    }

    public static final KSerializer<a0> serializer(a0.a aVar) {
        t.e(aVar, "<this>");
        return q1.f15225a;
    }

    public static final KSerializer<c0> serializer(c0.a aVar) {
        t.e(aVar, "<this>");
        return r1.f15234a;
    }

    public static final KSerializer<e0> serializer(e0 e0Var) {
        t.e(e0Var, "<this>");
        return s1.f15246b;
    }

    public static final KSerializer<y> serializer(y.a aVar) {
        t.e(aVar, "<this>");
        return o1.f15215a;
    }

    public static final KSerializer<z> serializer(z.a aVar) {
        t.e(aVar, "<this>");
        return p1.f15221a;
    }
}
