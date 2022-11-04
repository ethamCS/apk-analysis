package ub;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002*\u00020\u0005\u001aS\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u000f\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007\u001a5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0014\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0018\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\u0017*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u001a\u0015\u0010\u001c\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0086\u0002\u001a\u0015\u0010\u001e\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001dH\u0086\u0002\u001a\u001f\u0010\u001f\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001f\u0010 \u001a;\u0010$\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010#\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000!j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\"¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"T", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "d", "([Ljava/lang/Object;)Ljava/util/List;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "c", "destination", "destinationOffset", "startIndex", "endIndex", "f", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", BuildConfig.FLAVOR, "e", "fromIndex", "toIndex", "j", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "i", "([BII)[B", "element", "Ltb/e0;", "l", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "k", "elements", "n", BuildConfig.FLAVOR, "o", "p", "([Ljava/lang/Object;)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "q", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/ArraysKt")
/* loaded from: classes.dex */
public class l extends k {

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"ub/l$a", "Lub/c;", BuildConfig.FLAVOR, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", BuildConfig.FLAVOR, "isEmpty", "element", "b", "index", "d", "(I)Ljava/lang/Integer;", "e", "f", "a", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends c<Integer> implements RandomAccess {

        /* renamed from: c */
        final /* synthetic */ int[] f23381c;

        a(int[] iArr) {
            this.f23381c = iArr;
        }

        @Override // ub.a
        public int a() {
            return this.f23381c.length;
        }

        public boolean b(int i10) {
            return m.u(this.f23381c, i10);
        }

        @Override // ub.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return b(((Number) obj).intValue());
        }

        /* renamed from: d */
        public Integer get(int i10) {
            return Integer.valueOf(this.f23381c[i10]);
        }

        public int e(int i10) {
            return m.H(this.f23381c, i10);
        }

        public int f(int i10) {
            return m.R(this.f23381c, i10);
        }

        @Override // ub.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return e(((Number) obj).intValue());
        }

        @Override // ub.a, java.util.Collection
        public boolean isEmpty() {
            return this.f23381c.length == 0;
        }

        @Override // ub.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return f(((Number) obj).intValue());
        }
    }

    public static List<Integer> c(int[] iArr) {
        hc.t.e(iArr, "<this>");
        return new a(iArr);
    }

    public static <T> List<T> d(T[] tArr) {
        hc.t.e(tArr, "<this>");
        List<T> a10 = n.a(tArr);
        hc.t.d(a10, "asList(this)");
        return a10;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        hc.t.e(bArr, "<this>");
        hc.t.e(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    public static <T> T[] f(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        hc.t.e(tArr, "<this>");
        hc.t.e(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static /* synthetic */ byte[] g(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        byte[] e10;
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        e10 = e(bArr, bArr2, i10, i11, i12);
        return e10;
    }

    public static /* synthetic */ Object[] h(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        Object[] f10;
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        f10 = f(objArr, objArr2, i10, i11, i12);
        return f10;
    }

    public static byte[] i(byte[] bArr, int i10, int i11) {
        hc.t.e(bArr, "<this>");
        j.b(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        hc.t.d(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static <T> T[] j(T[] tArr, int i10, int i11) {
        hc.t.e(tArr, "<this>");
        j.b(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        hc.t.d(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    public static void k(int[] iArr, int i10, int i11, int i12) {
        hc.t.e(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static <T> void l(T[] tArr, T t10, int i10, int i11) {
        hc.t.e(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void m(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        l(objArr, obj, i10, i11);
    }

    public static byte[] n(byte[] bArr, byte[] bArr2) {
        hc.t.e(bArr, "<this>");
        hc.t.e(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        hc.t.d(copyOf, "result");
        return copyOf;
    }

    public static char[] o(char[] cArr, char[] cArr2) {
        hc.t.e(cArr, "<this>");
        hc.t.e(cArr2, "elements");
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] copyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, copyOf, length, length2);
        hc.t.d(copyOf, "result");
        return copyOf;
    }

    public static final <T> void p(T[] tArr) {
        hc.t.e(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void q(T[] tArr, Comparator<? super T> comparator) {
        hc.t.e(tArr, "<this>");
        hc.t.e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
