package zb;

import hc.k0;
import hc.o;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lzb/k;", "Lzb/j;", "Lhc/o;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "arity", "I", "getArity", "()I", "Lxb/d;", "completion", "<init>", "(ILxb/d;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class k extends j implements o<Object> {

    /* renamed from: d */
    private final int f26600d;

    public k(int i10, xb.d<Object> dVar) {
        super(dVar);
        this.f26600d = i10;
    }

    @Override // hc.o
    public int getArity() {
        return this.f26600d;
    }

    @Override // zb.a
    public String toString() {
        if (k() == null) {
            String h10 = k0.h(this);
            t.d(h10, "renderLambdaToString(this)");
            return h10;
        }
        return super.toString();
    }
}
