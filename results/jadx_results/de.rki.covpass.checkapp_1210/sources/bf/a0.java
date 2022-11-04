package bf;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.a1;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u0012\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0007\u001a.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u001aH\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0011*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0012H\u0007¨\u0006\u0015"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "V0", "W0", "X0", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "n", "U0", "Y0", "size", BuildConfig.FLAVOR, "T0", "step", BuildConfig.FLAVOR, "partialWindows", "Z0", "R", "Lkotlin/Function1;", "transform", "a1", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class a0 extends z {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR, "b", "(Ljava/lang/CharSequence;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.l<CharSequence, String> {

        /* renamed from: c */
        public static final a f5984c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final String invoke(CharSequence charSequence) {
            hc.t.e(charSequence, "it");
            return charSequence.toString();
        }
    }

    public static List<String> T0(CharSequence charSequence, int i10) {
        hc.t.e(charSequence, "<this>");
        return Z0(charSequence, i10, i10, true);
    }

    public static final String U0(String str, int i10) {
        int d10;
        hc.t.e(str, "<this>");
        if (i10 >= 0) {
            d10 = nc.m.d(i10, str.length());
            String substring = str.substring(d10);
            hc.t.d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char V0(CharSequence charSequence) {
        hc.t.e(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char W0(CharSequence charSequence) {
        int U;
        hc.t.e(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            U = y.U(charSequence);
            return charSequence.charAt(U);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char X0(CharSequence charSequence) {
        hc.t.e(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                throw new IllegalArgumentException("Char sequence has more than one element.");
            }
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String Y0(String str, int i10) {
        int d10;
        hc.t.e(str, "<this>");
        if (i10 >= 0) {
            d10 = nc.m.d(i10, str.length());
            String substring = str.substring(0, d10);
            hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static final List<String> Z0(CharSequence charSequence, int i10, int i11, boolean z10) {
        hc.t.e(charSequence, "<this>");
        return a1(charSequence, i10, i11, z10, a.f5984c);
    }

    public static final <R> List<R> a1(CharSequence charSequence, int i10, int i11, boolean z10, gc.l<? super CharSequence, ? extends R> lVar) {
        hc.t.e(charSequence, "<this>");
        hc.t.e(lVar, "transform");
        a1.a(i10, i11);
        int length = charSequence.length();
        ArrayList arrayList = new ArrayList((length / i11) + (length % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < length)) {
                break;
            }
            int i13 = i12 + i10;
            if (i13 < 0 || i13 > length) {
                if (!z10) {
                    break;
                }
                i13 = length;
            }
            arrayList.add(lVar.invoke(charSequence.subSequence(i12, i13)));
            i12 += i11;
        }
        return arrayList;
    }
}
