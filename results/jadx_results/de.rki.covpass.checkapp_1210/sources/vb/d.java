package vb;

import hc.t;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nc.m;
import org.conscrypt.BuildConfig;
import ub.k0;
import ub.l;
@Metadata(bv = {}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006ijklmnBG\b\u0002\u0012\f\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u000e\u0010_\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\u0012\u0006\u0010a\u001a\u00020`\u0012\u0006\u0010b\u001a\u00020`\u0012\u0006\u0010c\u001a\u00020\u0006\u0012\u0006\u0010d\u001a\u00020\u0006¢\u0006\u0004\be\u0010fB\t\b\u0016¢\u0006\u0004\be\u00109B\u0011\b\u0016\u0012\u0006\u0010g\u001a\u00020\u0006¢\u0006\u0004\be\u0010hJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0002¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0018\u0010 \u001a\u00020\u00152\u000e\u0010\u001f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001eH\u0002J\u001c\u0010#\u001a\u00020\u00152\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0002J\"\u0010&\u001a\u00020\u00152\u0018\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!0$H\u0002J\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eJ\b\u0010(\u001a\u00020\u0015H\u0016J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010*J\u001a\u0010,\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b.\u0010/J\u001e\u00100\u001a\u00020\b2\u0014\u0010%\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0016J\u0019\u00101\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u0010-J\b\u00102\u001a\u00020\bH\u0016J\u0013\u00104\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00105\u001a\u00020\u0006H\u0016J\b\u00107\u001a\u000206H\u0016J\u000f\u00108\u001a\u00020\bH\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000H\u0000¢\u0006\u0004\b:\u0010\u0010J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000H\u0000¢\u0006\u0004\b;\u0010\u0010J#\u0010<\u001a\u00020\u00152\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0000¢\u0006\u0004\b<\u0010=J\u001b\u0010?\u001a\u00020\u00152\n\u0010>\u001a\u0006\u0012\u0002\b\u00030$H\u0000¢\u0006\u0004\b?\u0010@J#\u0010A\u001a\u00020\u00152\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0000¢\u0006\u0004\bA\u0010=J\u0017\u0010C\u001a\u00020\u00152\u0006\u0010B\u001a\u00028\u0001H\u0000¢\u0006\u0004\bC\u0010*J\u001b\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010DH\u0000¢\u0006\u0004\bE\u0010FJ\u001b\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0000¢\u0006\u0004\bH\u0010IJ\u001b\u0010K\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010JH\u0000¢\u0006\u0004\bK\u0010LR\u0014\u0010\n\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010NR$\u0010R\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bR\u0010M\u001a\u0004\bS\u0010NR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000T8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010UR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR&\u0010]\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[0T8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010U¨\u0006o"}, d2 = {"Lvb/d;", "K", "V", BuildConfig.FLAVOR, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", BuildConfig.FLAVOR, "n", "Ltb/e0;", "y", "capacity", "x", BuildConfig.FLAVOR, "()[Ljava/lang/Object;", "key", "c0", "(Ljava/lang/Object;)I", "s", "newHashSize", "h0", "i", BuildConfig.FLAVOR, "g0", "A", "value", "G", "index", "l0", "removedHash", "j0", BuildConfig.FLAVOR, "other", "v", BuildConfig.FLAVOR, "entry", "f0", BuildConfig.FLAVOR, "from", "e0", "p", "isEmpty", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "clear", BuildConfig.FLAVOR, "equals", "hashCode", BuildConfig.FLAVOR, "toString", "r", "()V", "k", "k0", "u", "(Ljava/util/Map$Entry;)Z", "m", "t", "(Ljava/util/Collection;)Z", "i0", "element", "m0", "Lvb/d$e;", "d0", "()Lvb/d$e;", "Lvb/d$f;", "n0", "()Lvb/d$f;", "Lvb/d$b;", "z", "()Lvb/d$b;", "I", "()I", "N", "hashSize", "<set-?>", "size", "W", BuildConfig.FLAVOR, "()Ljava/util/Set;", "keys", BuildConfig.FLAVOR, "b0", "()Ljava/util/Collection;", "values", BuildConfig.FLAVOR, "M", "entries", "keysArray", "valuesArray", BuildConfig.FLAVOR, "presenceArray", "hashArray", "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "initialCapacity", "(I)V", "a", "b", "c", "d", "e", "f", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d<K, V> implements Map<K, V>, Serializable, ic.a {
    private static final a Companion = new a(null);
    private int U3;
    private int V3;
    private int W3;
    private vb.f<K> X3;
    private g<V> Y3;
    private vb.e<K, V> Z3;

    /* renamed from: a4 */
    private boolean f23965a4;

    /* renamed from: c */
    private K[] f23966c;

    /* renamed from: d */
    private V[] f23967d;

    /* renamed from: q */
    private int[] f23968q;

    /* renamed from: x */
    private int[] f23969x;

    /* renamed from: y */
    private int f23970y;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lvb/d$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "capacity", "c", "hashSize", "d", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int c(int i10) {
            int b10;
            b10 = m.b(i10, 1);
            return Integer.highestOneBit(b10 * 3);
        }

        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H\u0096\u0002J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\f¨\u0006\u0014"}, d2 = {"Lvb/d$b;", "K", "V", "Lvb/d$d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lvb/d$c;", "j", BuildConfig.FLAVOR, "l", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "Ltb/e0;", "k", "Lvb/d;", "map", "<init>", "(Lvb/d;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b<K, V> extends C0426d<K, V> implements Iterator<Map.Entry<K, V>>, ic.a, j$.util.Iterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<K, V> dVar) {
            super(dVar);
            t.e(dVar, "map");
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        /* renamed from: j */
        public c<K, V> next() {
            if (b() < ((d) e()).U3) {
                int b10 = b();
                g(b10 + 1);
                i(b10);
                c<K, V> cVar = new c<>(e(), d());
                f();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void k(StringBuilder sb2) {
            t.e(sb2, "sb");
            if (b() < ((d) e()).U3) {
                int b10 = b();
                g(b10 + 1);
                i(b10);
                Object obj = ((d) e()).f23966c[d()];
                if (t.a(obj, e())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] objArr = ((d) e()).f23967d;
                t.b(objArr);
                Object obj2 = objArr[d()];
                if (t.a(obj2, e())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                f();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int l() {
            if (b() < ((d) e()).U3) {
                int b10 = b();
                g(b10 + 1);
                i(b10);
                Object obj = ((d) e()).f23966c[d()];
                int i10 = 0;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] objArr = ((d) e()).f23967d;
                t.b(objArr);
                Object obj2 = objArr[d()];
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                }
                int i11 = hashCode ^ i10;
                f();
                return i11;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0011\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0019"}, d2 = {"Lvb/d$c;", "K", "V", BuildConfig.FLAVOR, "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "Lvb/d;", "map", "index", "<init>", "(Lvb/d;I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, ic.d {

        /* renamed from: c */
        private final d<K, V> f23971c;

        /* renamed from: d */
        private final int f23972d;

        public c(d<K, V> dVar, int i10) {
            t.e(dVar, "map");
            this.f23971c = dVar;
            this.f23972d = i10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (t.a(entry.getKey(), getKey()) && t.a(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((d) this.f23971c).f23966c[this.f23972d];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((d) this.f23971c).f23967d;
            t.b(objArr);
            return (V) objArr[this.f23972d];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int i10 = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            if (value != null) {
                i10 = value.hashCode();
            }
            return hashCode ^ i10;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            this.f23971c.r();
            Object[] n10 = this.f23971c.n();
            int i10 = this.f23972d;
            V v11 = (V) n10[i10];
            n10[i10] = v10;
            return v11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0004R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u001b"}, d2 = {"Lvb/d$d;", "K", "V", BuildConfig.FLAVOR, "Ltb/e0;", "f", "()V", BuildConfig.FLAVOR, "hasNext", "remove", "Lvb/d;", "map", "Lvb/d;", "e", "()Lvb/d;", BuildConfig.FLAVOR, "index", "I", "b", "()I", "g", "(I)V", "lastIndex", "d", "i", "<init>", "(Lvb/d;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: vb.d$d */
    /* loaded from: classes.dex */
    public static class C0426d<K, V> {

        /* renamed from: c */
        private final d<K, V> f23973c;

        /* renamed from: d */
        private int f23974d;

        /* renamed from: q */
        private int f23975q = -1;

        public C0426d(d<K, V> dVar) {
            t.e(dVar, "map");
            this.f23973c = dVar;
            f();
        }

        public final int b() {
            return this.f23974d;
        }

        public final int d() {
            return this.f23975q;
        }

        public final d<K, V> e() {
            return this.f23973c;
        }

        public final void f() {
            while (this.f23974d < ((d) this.f23973c).U3) {
                int[] iArr = ((d) this.f23973c).f23968q;
                int i10 = this.f23974d;
                if (iArr[i10] >= 0) {
                    return;
                }
                this.f23974d = i10 + 1;
            }
        }

        public final void g(int i10) {
            this.f23974d = i10;
        }

        public final boolean hasNext() {
            return this.f23974d < ((d) this.f23973c).U3;
        }

        public final void i(int i10) {
            this.f23975q = i10;
        }

        public final void remove() {
            if (this.f23975q != -1) {
                this.f23973c.r();
                this.f23973c.l0(this.f23975q);
                this.f23975q = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lvb/d$e;", "K", "V", "Lvb/d$d;", BuildConfig.FLAVOR, "next", "()Ljava/lang/Object;", "Lvb/d;", "map", "<init>", "(Lvb/d;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e<K, V> extends C0426d<K, V> implements java.util.Iterator<K>, ic.a, j$.util.Iterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d<K, V> dVar) {
            super(dVar);
            t.e(dVar, "map");
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public K next() {
            if (b() < ((d) e()).U3) {
                int b10 = b();
                g(b10 + 1);
                i(b10);
                K k10 = (K) ((d) e()).f23966c[d()];
                f();
                return k10;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lvb/d$f;", "K", "V", "Lvb/d$d;", BuildConfig.FLAVOR, "next", "()Ljava/lang/Object;", "Lvb/d;", "map", "<init>", "(Lvb/d;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f<K, V> extends C0426d<K, V> implements java.util.Iterator<V>, ic.a, j$.util.Iterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d<K, V> dVar) {
            super(dVar);
            t.e(dVar, "map");
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public V next() {
            if (b() < ((d) e()).U3) {
                int b10 = b();
                g(b10 + 1);
                i(b10);
                Object[] objArr = ((d) e()).f23967d;
                t.b(objArr);
                V v10 = (V) objArr[d()];
                f();
                return v10;
            }
            throw new NoSuchElementException();
        }
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(vb.c.d(i10), null, new int[i10], new int[Companion.c(i10)], 2, 0);
    }

    private d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f23966c = kArr;
        this.f23967d = vArr;
        this.f23968q = iArr;
        this.f23969x = iArr2;
        this.f23970y = i10;
        this.U3 = i11;
        this.V3 = Companion.d(N());
    }

    private final int A(K k10) {
        int c02 = c0(k10);
        int i10 = this.f23970y;
        while (true) {
            int i11 = this.f23969x[c02];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (t.a(this.f23966c[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            c02 = c02 == 0 ? N() - 1 : c02 - 1;
        }
    }

    private final int G(V v10) {
        int i10 = this.U3;
        while (true) {
            i10--;
            if (i10 >= 0) {
                if (this.f23968q[i10] >= 0) {
                    V[] vArr = this.f23967d;
                    t.b(vArr);
                    if (t.a(vArr[i10], v10)) {
                        return i10;
                    }
                }
            } else {
                return -1;
            }
        }
    }

    private final int I() {
        return this.f23966c.length;
    }

    private final int N() {
        return this.f23969x.length;
    }

    private final int c0(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.V3;
    }

    private final boolean e0(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        y(collection.size());
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            if (f0(entry)) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean f0(Map.Entry<? extends K, ? extends V> entry) {
        int k10 = k(entry.getKey());
        V[] n10 = n();
        if (k10 >= 0) {
            n10[k10] = entry.getValue();
            return true;
        }
        int i10 = (-k10) - 1;
        if (t.a(entry.getValue(), n10[i10])) {
            return false;
        }
        n10[i10] = entry.getValue();
        return true;
    }

    private final boolean g0(int i10) {
        int c02 = c0(this.f23966c[i10]);
        int i11 = this.f23970y;
        while (true) {
            int[] iArr = this.f23969x;
            if (iArr[c02] == 0) {
                iArr[c02] = i10 + 1;
                this.f23968q[i10] = c02;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            c02 = c02 == 0 ? N() - 1 : c02 - 1;
        }
    }

    private final void h0(int i10) {
        if (this.U3 > size()) {
            s();
        }
        int i11 = 0;
        if (i10 != N()) {
            this.f23969x = new int[i10];
            this.V3 = Companion.d(i10);
        } else {
            l.k(this.f23969x, 0, 0, N());
        }
        while (i11 < this.U3) {
            int i12 = i11 + 1;
            if (!g0(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    private final void j0(int i10) {
        int d10;
        d10 = m.d(this.f23970y * 2, N() / 2);
        int i11 = d10;
        int i12 = 0;
        int i13 = i10;
        do {
            i10 = i10 == 0 ? N() - 1 : i10 - 1;
            i12++;
            if (i12 > this.f23970y) {
                this.f23969x[i13] = 0;
                return;
            }
            int[] iArr = this.f23969x;
            int i14 = iArr[i10];
            if (i14 == 0) {
                iArr[i13] = 0;
                return;
            }
            if (i14 < 0) {
                iArr[i13] = -1;
            } else {
                int i15 = i14 - 1;
                if (((c0(this.f23966c[i15]) - i10) & (N() - 1)) >= i12) {
                    this.f23969x[i13] = i14;
                    this.f23968q[i15] = i13;
                }
                i11--;
            }
            i13 = i10;
            i12 = 0;
            i11--;
        } while (i11 >= 0);
        this.f23969x[i13] = -1;
    }

    public final void l0(int i10) {
        vb.c.f(this.f23966c, i10);
        j0(this.f23968q[i10]);
        this.f23968q[i10] = -1;
        this.W3 = size() - 1;
    }

    public final V[] n() {
        V[] vArr = this.f23967d;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) vb.c.d(I());
        this.f23967d = vArr2;
        return vArr2;
    }

    private final void s() {
        int i10;
        V[] vArr = this.f23967d;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.U3;
            if (i11 >= i10) {
                break;
            }
            if (this.f23968q[i11] >= 0) {
                K[] kArr = this.f23966c;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                i12++;
            }
            i11++;
        }
        vb.c.g(this.f23966c, i12, i10);
        if (vArr != null) {
            vb.c.g(vArr, i12, this.U3);
        }
        this.U3 = i12;
    }

    private final boolean v(Map<?, ?> map) {
        return size() == map.size() && t(map.entrySet());
    }

    private final void x(int i10) {
        int i11;
        if (i10 >= 0) {
            if (i10 > I()) {
                int I = (I() * 3) / 2;
                if (i10 <= I) {
                    i10 = I;
                }
                this.f23966c = (K[]) vb.c.e(this.f23966c, i10);
                V[] vArr = this.f23967d;
                this.f23967d = vArr != null ? (V[]) vb.c.e(vArr, i10) : null;
                int[] copyOf = Arrays.copyOf(this.f23968q, i10);
                t.d(copyOf, "copyOf(this, newSize)");
                this.f23968q = copyOf;
                i11 = Companion.c(i10);
                if (i11 <= N()) {
                    return;
                }
            } else if ((this.U3 + i10) - size() <= I()) {
                return;
            } else {
                i11 = N();
            }
            h0(i11);
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void y(int i10) {
        x(this.U3 + i10);
    }

    public Set<Map.Entry<K, V>> M() {
        vb.e<K, V> eVar = this.Z3;
        if (eVar == null) {
            vb.e<K, V> eVar2 = new vb.e<>(this);
            this.Z3 = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public Set<K> V() {
        vb.f<K> fVar = this.X3;
        if (fVar == null) {
            vb.f<K> fVar2 = new vb.f<>(this);
            this.X3 = fVar2;
            return fVar2;
        }
        return fVar;
    }

    public int W() {
        return this.W3;
    }

    public Collection<V> b0() {
        g<V> gVar = this.Y3;
        if (gVar == null) {
            g<V> gVar2 = new g<>(this);
            this.Y3 = gVar2;
            return gVar2;
        }
        return gVar;
    }

    @Override // java.util.Map
    public void clear() {
        r();
        k0 it = new nc.g(0, this.U3 - 1).iterator();
        while (it.hasNext()) {
            int b10 = it.b();
            int[] iArr = this.f23968q;
            int i10 = iArr[b10];
            if (i10 >= 0) {
                this.f23969x[i10] = 0;
                iArr[b10] = -1;
            }
        }
        vb.c.g(this.f23966c, 0, this.U3);
        V[] vArr = this.f23967d;
        if (vArr != null) {
            vb.c.g(vArr, 0, this.U3);
        }
        this.W3 = 0;
        this.U3 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return A(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return G(obj) >= 0;
    }

    public final e<K, V> d0() {
        return new e<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return M();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && v((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int A = A(obj);
        if (A < 0) {
            return null;
        }
        V[] vArr = this.f23967d;
        t.b(vArr);
        return vArr[A];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> z10 = z();
        int i10 = 0;
        while (z10.hasNext()) {
            i10 += z10.l();
        }
        return i10;
    }

    public final boolean i0(Map.Entry<? extends K, ? extends V> entry) {
        t.e(entry, "entry");
        r();
        int A = A(entry.getKey());
        if (A < 0) {
            return false;
        }
        V[] vArr = this.f23967d;
        t.b(vArr);
        if (!t.a(vArr[A], entry.getValue())) {
            return false;
        }
        l0(A);
        return true;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int k(K k10) {
        int d10;
        r();
        while (true) {
            int c02 = c0(k10);
            d10 = m.d(this.f23970y * 2, N() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f23969x[c02];
                if (i11 <= 0) {
                    if (this.U3 < I()) {
                        int i12 = this.U3;
                        int i13 = i12 + 1;
                        this.U3 = i13;
                        this.f23966c[i12] = k10;
                        this.f23968q[i12] = c02;
                        this.f23969x[c02] = i13;
                        this.W3 = size() + 1;
                        if (i10 > this.f23970y) {
                            this.f23970y = i10;
                        }
                        return i12;
                    }
                    y(1);
                } else if (t.a(this.f23966c[i11 - 1], k10)) {
                    return -i11;
                } else {
                    i10++;
                    if (i10 > d10) {
                        h0(N() * 2);
                        break;
                    }
                    c02 = c02 == 0 ? N() - 1 : c02 - 1;
                }
            }
        }
    }

    public final int k0(K k10) {
        r();
        int A = A(k10);
        if (A < 0) {
            return -1;
        }
        l0(A);
        return A;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return V();
    }

    public final boolean m0(V v10) {
        r();
        int G = G(v10);
        if (G < 0) {
            return false;
        }
        l0(G);
        return true;
    }

    public final f<K, V> n0() {
        return new f<>(this);
    }

    public final Map<K, V> p() {
        r();
        this.f23965a4 = true;
        return this;
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        r();
        int k11 = k(k10);
        V[] n10 = n();
        if (k11 >= 0) {
            n10[k11] = v10;
            return null;
        }
        int i10 = (-k11) - 1;
        V v11 = n10[i10];
        n10[i10] = v10;
        return v11;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        t.e(map, "from");
        r();
        e0(map.entrySet());
    }

    public final void r() {
        if (!this.f23965a4) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int k02 = k0(obj);
        if (k02 < 0) {
            return null;
        }
        V[] vArr = this.f23967d;
        t.b(vArr);
        V v10 = vArr[k02];
        vb.c.f(vArr, k02);
        return v10;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return W();
    }

    public final boolean t(Collection<?> collection) {
        t.e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!u((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b<K, V> z10 = z();
        int i10 = 0;
        while (z10.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            z10.k(sb2);
            i10++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        t.d(sb3, "sb.toString()");
        return sb3;
    }

    public final boolean u(Map.Entry<? extends K, ? extends V> entry) {
        t.e(entry, "entry");
        int A = A(entry.getKey());
        if (A < 0) {
            return false;
        }
        V[] vArr = this.f23967d;
        t.b(vArr);
        return t.a(vArr[A], entry.getValue());
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return b0();
    }

    public final b<K, V> z() {
        return new b<>(this);
    }
}
