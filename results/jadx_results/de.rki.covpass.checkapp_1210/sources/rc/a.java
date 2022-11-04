package rc;

import kotlin.Metadata;
import xc.u0;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lrc/a;", "Lad/l;", "Lrc/f;", "Ltb/e0;", "Lxc/y;", "descriptor", "data", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ltb/e0;)Lrc/f;", "Lxc/u0;", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ltb/e0;)Lrc/f;", "Lrc/j;", "container", "<init>", "(Lrc/j;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class a extends ad.l<f<?>, tb.e0> {

    /* renamed from: a */
    private final j f20585a;

    public a(j jVar) {
        hc.t.e(jVar, "container");
        this.f20585a = jVar;
    }

    /* renamed from: p */
    public f<?> g(xc.y yVar, tb.e0 e0Var) {
        hc.t.e(yVar, "descriptor");
        hc.t.e(e0Var, "data");
        return new k(this.f20585a, yVar);
    }

    /* renamed from: q */
    public f<?> j(u0 u0Var, tb.e0 e0Var) {
        hc.t.e(u0Var, "descriptor");
        hc.t.e(e0Var, "data");
        int i10 = 0;
        int i11 = u0Var.J() != null ? 1 : 0;
        if (u0Var.U() != null) {
            i10 = 1;
        }
        int i12 = i11 + i10;
        if (u0Var.Q()) {
            if (i12 == 0) {
                return new l(this.f20585a, u0Var);
            }
            if (i12 == 1) {
                return new m(this.f20585a, u0Var);
            }
            if (i12 == 2) {
                return new n(this.f20585a, u0Var);
            }
        } else if (i12 == 0) {
            return new r(this.f20585a, u0Var);
        } else {
            if (i12 == 1) {
                return new s(this.f20585a, u0Var);
            }
            if (i12 == 2) {
                return new t(this.f20585a, u0Var);
            }
        }
        throw new b0("Unsupported property: " + u0Var);
    }
}
