package kotlinx.serialization.internal;

import hc.s;
import hc.t;
import kf.c0;
import kf.c1;
import kotlin.Metadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0002H\u0014J\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0002H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014J(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0014J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004H\u0014¨\u0006\u0018"}, d2 = {"Lkotlinx/serialization/internal/f;", "Lkotlinx/serialization/KSerializer;", BuildConfig.FLAVOR, "Lkf/c1;", BuildConfig.FLAVOR, "Lkf/c0;", "v", "y", "w", "Ljf/c;", "decoder", "index", "builder", BuildConfig.FLAVOR, "checkIndex", "Ltb/e0;", "x", "Ljf/d;", "encoder", "content", "size", "z", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class f extends c1<Integer, int[], c0> {

    /* renamed from: c */
    public static final f f15599c = new f();

    private f() {
        super(BuiltinSerializersKt.serializer(s.f11779a));
    }

    /* renamed from: v */
    public int e(int[] iArr) {
        t.e(iArr, "<this>");
        return iArr.length;
    }

    /* renamed from: w */
    public int[] r() {
        return new int[0];
    }

    /* renamed from: x */
    public void h(jf.c cVar, int i10, c0 c0Var, boolean z10) {
        t.e(cVar, "decoder");
        t.e(c0Var, "builder");
        c0Var.e(cVar.x(getDescriptor(), i10));
    }

    /* renamed from: y */
    public c0 k(int[] iArr) {
        t.e(iArr, "<this>");
        return new c0(iArr);
    }

    /* renamed from: z */
    public void u(jf.d dVar, int[] iArr, int i10) {
        t.e(dVar, "encoder");
        t.e(iArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.z(getDescriptor(), i11, iArr[i11]);
        }
    }
}
