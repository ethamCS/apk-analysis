package w7;

import af.h;
import af.n;
import af.p;
import gc.l;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import tb.y;
import ub.c0;
import ub.m;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000e"}, d2 = {"Lw7/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "base", "count", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "d", "e", BuildConfig.FLAVOR, "input", "c", "<init>", "()V", "covpass-base45"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final a f24692a = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0005\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {BuildConfig.FLAVOR, "it", "b", "(B)Ljava/lang/Byte;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: w7.a$a */
    /* loaded from: classes.dex */
    public static final class C0438a extends v implements l<Byte, Byte> {

        /* renamed from: c */
        public static final C0438a f24693c = new C0438a();

        C0438a() {
            super(1);
        }

        public final Byte b(byte b10) {
            byte[] bArr;
            bArr = c.f24696b;
            Byte valueOf = Byte.valueOf(bArr[b10]);
            if (valueOf.byteValue() >= 0) {
                return valueOf;
            }
            throw new w7.b("Invalid characters in input.");
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ Byte invoke(Byte b10) {
            return b(b10.byteValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "chunk", "b", "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends v implements l<List<? extends Byte>, List<? extends Byte>> {

        /* renamed from: c */
        public static final b f24694c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final List<Byte> invoke(List<Byte> list) {
            List q02;
            List<Byte> q03;
            t.e(list, "chunk");
            if (list.size() >= 2) {
                a aVar = a.f24692a;
                q02 = c0.q0(list);
                q03 = c0.q0(aVar.d(aVar.e(q02, 45), PSKKeyManager.MAX_KEY_LENGTH_BYTES, list.size() - 1));
                return q03;
            }
            throw new w7.b("Invalid input length.");
        }
    }

    private a() {
    }

    public final List<Byte> d(int i10, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(Byte.valueOf((byte) (i10 % i11)));
            i10 /= i11;
        }
        if (i10 == 0) {
            return arrayList;
        }
        throw new w7.b("Invalid character sequence.");
    }

    public final int e(List<Byte> list, int i10) {
        int i11 = 0;
        for (Number number : list) {
            i11 = (i11 * i10) + (y.b(number.byteValue()) & 255);
        }
        return i11;
    }

    public final byte[] c(byte[] bArr) {
        h s10;
        h z10;
        h n10;
        h h10;
        List F;
        byte[] B0;
        t.e(bArr, "input");
        s10 = m.s(bArr);
        z10 = p.z(s10, C0438a.f24693c);
        n10 = p.n(z10, 3, b.f24694c);
        h10 = n.h(n10);
        F = p.F(h10);
        B0 = c0.B0(F);
        return B0;
    }
}
