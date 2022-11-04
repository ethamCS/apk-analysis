package hc;

import java.io.Serializable;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lhc/v;", "R", "Lhc/o;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "arity", "I", "getArity", "()I", "<init>", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class v<R> implements o<R>, Serializable {
    private final int arity;

    public v(int i10) {
        this.arity = i10;
    }

    @Override // hc.o
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String i10 = k0.i(this);
        t.d(i10, "renderLambdaToString(this)");
        return i10;
    }
}
