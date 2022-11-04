package df;

import df.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.coroutines.internal.l0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Ldf/v;", "E", "Ldf/a;", "element", BuildConfig.FLAVOR, "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/j;", "Ldf/d0;", "list", "Ldf/q;", "closed", "Ltb/e0;", "L", "(Ljava/lang/Object;Ldf/q;)V", BuildConfig.FLAVOR, "H", "()Z", "isBufferAlwaysEmpty", "I", "isBufferEmpty", "s", "isBufferAlwaysFull", "t", "isBufferFull", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lgc/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class v<E> extends a<E> {
    public v(gc.l<? super E, tb.e0> lVar) {
        super(lVar);
    }

    @Override // df.a
    protected final boolean H() {
        return true;
    }

    @Override // df.a
    protected final boolean I() {
        return true;
    }

    @Override // df.a
    protected void L(Object obj, q<?> qVar) {
        l0 l0Var = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                d0 d0Var = (d0) obj;
                if (d0Var instanceof c.a) {
                    gc.l<E, tb.e0> lVar = this.f8910c;
                    if (lVar != null) {
                        l0Var = kotlinx.coroutines.internal.v.c(lVar, ((c.a) d0Var).f8912x, null);
                    }
                } else {
                    d0Var.I(qVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                l0 l0Var2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    d0 d0Var2 = (d0) arrayList.get(size);
                    if (d0Var2 instanceof c.a) {
                        gc.l<E, tb.e0> lVar2 = this.f8910c;
                        l0Var2 = lVar2 != null ? kotlinx.coroutines.internal.v.c(lVar2, ((c.a) d0Var2).f8912x, l0Var2) : null;
                    } else {
                        d0Var2.I(qVar);
                    }
                }
                l0Var = l0Var2;
            }
        }
        if (l0Var == null) {
            return;
        }
        throw l0Var;
    }

    @Override // df.c
    protected final boolean s() {
        return false;
    }

    @Override // df.c
    protected final boolean t() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.c
    public Object v(E e10) {
        b0<?> y10;
        do {
            Object v10 = super.v(e10);
            kotlinx.coroutines.internal.b0 b0Var = b.f8904b;
            if (v10 == b0Var) {
                return b0Var;
            }
            if (v10 != b.f8905c) {
                if (v10 instanceof q) {
                    return v10;
                }
                throw new IllegalStateException(("Invalid offerInternal result " + v10).toString());
            }
            y10 = y(e10);
            if (y10 == null) {
                return b0Var;
            }
        } while (!(y10 instanceof q));
        return y10;
    }
}
