package ub;

import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0000\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "index", "I", "(Ljava/util/List;I)I", "J", "T", "G", BuildConfig.FLAVOR, "H", "(Ljava/util/List;)Ljava/util/List;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes.dex */
public class a0 extends z {
    public static <T> List<T> G(List<? extends T> list) {
        hc.t.e(list, "<this>");
        return new u0(list);
    }

    public static <T> List<T> H(List<T> list) {
        hc.t.e(list, "<this>");
        return new t0(list);
    }

    public static final int I(List<?> list, int i10) {
        int j10;
        int j11;
        int j12;
        j10 = u.j(list);
        if (new nc.g(0, j10).i(i10)) {
            j12 = u.j(list);
            return j12 - i10;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Element index ");
        sb2.append(i10);
        sb2.append(" must be in range [");
        j11 = u.j(list);
        sb2.append(new nc.g(0, j11));
        sb2.append("].");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public static final int J(List<?> list, int i10) {
        if (new nc.g(0, list.size()).i(i10)) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new nc.g(0, list.size()) + "].");
    }
}
