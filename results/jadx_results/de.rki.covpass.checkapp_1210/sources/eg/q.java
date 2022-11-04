package eg;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0012B!\b\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002R\"\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Leg/q;", "Lub/c;", "Leg/f;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", BuildConfig.FLAVOR, "index", "d", BuildConfig.FLAVOR, "byteStrings", "[Leg/f;", "e", "()[Leg/f;", BuildConfig.FLAVOR, "trie", "[I", "f", "()[I", "a", "()I", "size", "<init>", "([Leg/f;[I)V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class q extends ub.c<f> implements RandomAccess {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private final f[] f9634c;

    /* renamed from: d */
    private final int[] f9635d;

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J#\u0010\u0012\u001a\u00020\u00112\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0010\"\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u00020\u0002*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Leg/q$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "nodeOffset", "Leg/c;", "node", BuildConfig.FLAVOR, "byteStringOffset", BuildConfig.FLAVOR, "Leg/f;", "byteStrings", "fromIndex", "toIndex", "indexes", "Ltb/e0;", "a", BuildConfig.FLAVOR, "Leg/q;", "d", "([Leg/f;)Leg/q;", "c", "(Leg/c;)J", "intCount", "<init>", "()V", "okio"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j10, c cVar, int i10, List<? extends f> list, int i11, int i12, List<Integer> list2) {
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            c cVar2;
            int i18 = i10;
            if (i11 < i12) {
                if (i11 < i12) {
                    int i19 = i11;
                    while (true) {
                        int i20 = i19 + 1;
                        if (!(list.get(i19).W() >= i18)) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        if (i20 >= i12) {
                            break;
                        }
                        i19 = i20;
                    }
                }
                f fVar = list.get(i11);
                f fVar2 = list.get(i12 - 1);
                int i21 = -1;
                if (i18 == fVar.W()) {
                    int i22 = i11 + 1;
                    i13 = i22;
                    i14 = list2.get(i11).intValue();
                    fVar = list.get(i22);
                } else {
                    i13 = i11;
                    i14 = -1;
                }
                if (fVar.p(i18) == fVar2.p(i18)) {
                    int min = Math.min(fVar.W(), fVar2.W());
                    if (i18 < min) {
                        int i23 = i18;
                        i15 = 0;
                        while (true) {
                            int i24 = i23 + 1;
                            if (fVar.p(i23) != fVar2.p(i23)) {
                                break;
                            }
                            i15++;
                            if (i24 >= min) {
                                break;
                            }
                            i23 = i24;
                        }
                    } else {
                        i15 = 0;
                    }
                    long c10 = j10 + c(cVar) + 2 + i15 + 1;
                    cVar.U(-i15);
                    cVar.U(i14);
                    int i25 = i18 + i15;
                    if (i18 < i25) {
                        while (true) {
                            int i26 = i18 + 1;
                            cVar.U(fVar.p(i18) & 255);
                            if (i26 >= i25) {
                                break;
                            }
                            i18 = i26;
                        }
                    }
                    if (i13 + 1 == i12) {
                        if (!(i25 == list.get(i13).W())) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        cVar.U(list2.get(i13).intValue());
                        return;
                    }
                    c cVar3 = new c();
                    cVar.U(((int) (c(cVar3) + c10)) * (-1));
                    a(c10, cVar3, i25, list, i13, i12, list2);
                    cVar.G0(cVar3);
                    return;
                }
                int i27 = i13 + 1;
                int i28 = 1;
                if (i27 < i12) {
                    while (true) {
                        int i29 = i27 + 1;
                        if (list.get(i27 - 1).p(i18) != list.get(i27).p(i18)) {
                            i28++;
                        }
                        if (i29 >= i12) {
                            break;
                        }
                        i27 = i29;
                    }
                }
                long c11 = j10 + c(cVar) + 2 + (i28 * 2);
                cVar.U(i28);
                cVar.U(i14);
                if (i13 < i12) {
                    int i30 = i13;
                    while (true) {
                        int i31 = i30 + 1;
                        byte p10 = list.get(i30).p(i18);
                        if (i30 == i13 || p10 != list.get(i30 - 1).p(i18)) {
                            cVar.U(p10 & 255);
                        }
                        if (i31 >= i12) {
                            break;
                        }
                        i30 = i31;
                    }
                }
                c cVar4 = new c();
                while (i13 < i12) {
                    byte p11 = list.get(i13).p(i18);
                    int i32 = i13 + 1;
                    if (i32 < i12) {
                        int i33 = i32;
                        while (true) {
                            int i34 = i33 + 1;
                            if (p11 != list.get(i33).p(i18)) {
                                i16 = i33;
                                break;
                            } else if (i34 >= i12) {
                                break;
                            } else {
                                i33 = i34;
                            }
                        }
                    }
                    i16 = i12;
                    if (i32 == i16 && i18 + 1 == list.get(i13).W()) {
                        cVar.U(list2.get(i13).intValue());
                        i17 = i16;
                        cVar2 = cVar4;
                    } else {
                        cVar.U(((int) (c11 + c(cVar4))) * i21);
                        i17 = i16;
                        cVar2 = cVar4;
                        a(c11, cVar4, i18 + 1, list, i13, i16, list2);
                    }
                    cVar4 = cVar2;
                    i13 = i17;
                    i21 = -1;
                }
                cVar.G0(cVar4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        static /* synthetic */ void b(a aVar, long j10, c cVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            aVar.a((i13 & 1) != 0 ? 0L : j10, cVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(c cVar) {
            return cVar.e1() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
            continue;
         */
        @fc.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final eg.q d(eg.f... r17) {
            /*
                Method dump skipped, instructions count: 316
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: eg.q.a.d(eg.f[]):eg.q");
        }
    }

    private q(f[] fVarArr, int[] iArr) {
        this.f9634c = fVarArr;
        this.f9635d = iArr;
    }

    public /* synthetic */ q(f[] fVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVarArr, iArr);
    }

    @fc.c
    public static final q l(f... fVarArr) {
        return Companion.d(fVarArr);
    }

    @Override // ub.a
    public int a() {
        return this.f9634c.length;
    }

    public /* bridge */ boolean b(f fVar) {
        return super.contains(fVar);
    }

    @Override // ub.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return b((f) obj);
    }

    /* renamed from: d */
    public f get(int i10) {
        return this.f9634c[i10];
    }

    public final f[] e() {
        return this.f9634c;
    }

    public final int[] f() {
        return this.f9635d;
    }

    public /* bridge */ int i(f fVar) {
        return super.indexOf(fVar);
    }

    @Override // ub.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof f)) {
            return -1;
        }
        return i((f) obj);
    }

    public /* bridge */ int k(f fVar) {
        return super.lastIndexOf(fVar);
    }

    @Override // ub.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof f)) {
            return -1;
        }
        return k((f) obj);
    }
}
