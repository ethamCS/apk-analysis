package kotlinx.serialization.internal;

import hc.m;
import hc.t;
import kf.c1;
import kf.p;
import kotlin.Metadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014J\f\u0010\b\u001a\u00020\u0005*\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014J(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¨\u0006\u0019"}, d2 = {"Lkotlinx/serialization/internal/d;", "Lkotlinx/serialization/KSerializer;", BuildConfig.FLAVOR, "Lkf/c1;", BuildConfig.FLAVOR, "Lkf/p;", BuildConfig.FLAVOR, "v", "y", "w", "Ljf/c;", "decoder", "index", "builder", BuildConfig.FLAVOR, "checkIndex", "Ltb/e0;", "x", "Ljf/d;", "encoder", "content", "size", "z", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class d extends c1<Double, double[], p> {

    /* renamed from: c */
    public static final d f15597c = new d();

    private d() {
        super(BuiltinSerializersKt.serializer(m.f11773a));
    }

    /* renamed from: v */
    public int e(double[] dArr) {
        t.e(dArr, "<this>");
        return dArr.length;
    }

    /* renamed from: w */
    public double[] r() {
        return new double[0];
    }

    /* renamed from: x */
    public void h(jf.c cVar, int i10, p pVar, boolean z10) {
        t.e(cVar, "decoder");
        t.e(pVar, "builder");
        pVar.e(cVar.u(getDescriptor(), i10));
    }

    /* renamed from: y */
    public p k(double[] dArr) {
        t.e(dArr, "<this>");
        return new p(dArr);
    }

    /* renamed from: z */
    public void u(jf.d dVar, double[] dArr, int i10) {
        t.e(dVar, "encoder");
        t.e(dArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.v(getDescriptor(), i11, dArr[i11]);
        }
    }
}