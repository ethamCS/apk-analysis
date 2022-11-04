package kotlinx.serialization.internal;

import hc.t;
import kf.c1;
import kotlin.Metadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014J\f\u0010\b\u001a\u00020\u0005*\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014J(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0004H\u0014J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¨\u0006\u0018"}, d2 = {"Lkotlinx/serialization/internal/a;", "Lkotlinx/serialization/KSerializer;", BuildConfig.FLAVOR, "Lkf/c1;", BuildConfig.FLAVOR, "Lkf/g;", BuildConfig.FLAVOR, "v", "y", "w", "Ljf/c;", "decoder", "index", "builder", "checkIndex", "Ltb/e0;", "x", "Ljf/d;", "encoder", "content", "size", "z", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a extends c1<Boolean, boolean[], kf.g> {

    /* renamed from: c */
    public static final a f15594c = new a();

    private a() {
        super(BuiltinSerializersKt.serializer(hc.f.f11752a));
    }

    /* renamed from: v */
    public int e(boolean[] zArr) {
        t.e(zArr, "<this>");
        return zArr.length;
    }

    /* renamed from: w */
    public boolean[] r() {
        return new boolean[0];
    }

    /* renamed from: x */
    public void h(jf.c cVar, int i10, kf.g gVar, boolean z10) {
        t.e(cVar, "decoder");
        t.e(gVar, "builder");
        gVar.e(cVar.i(getDescriptor(), i10));
    }

    /* renamed from: y */
    public kf.g k(boolean[] zArr) {
        t.e(zArr, "<this>");
        return new kf.g(zArr);
    }

    /* renamed from: z */
    public void u(jf.d dVar, boolean[] zArr, int i10) {
        t.e(dVar, "encoder");
        t.e(zArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.B(getDescriptor(), i11, zArr[i11]);
        }
    }
}
