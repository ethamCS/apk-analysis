package af;

import hc.t;
import java.util.Iterator;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aJ\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aJ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f*\f\b\u0002\u0010\u000e\"\u00020\r2\u00020\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"T", "Lkotlin/Function2;", "Laf/j;", "Lxb/d;", "Ltb/e0;", BuildConfig.FLAVOR, "block", "Laf/h;", "b", "(Lgc/p;)Laf/h;", BuildConfig.FLAVOR, "a", "(Lgc/p;)Ljava/util/Iterator;", BuildConfig.FLAVOR, "State", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes3.dex */
public class l {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, d2 = {"af/l$a", "Laf/h;", BuildConfig.FLAVOR, "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a implements h<T> {

        /* renamed from: a */
        final /* synthetic */ gc.p f500a;

        public a(gc.p pVar) {
            this.f500a = pVar;
        }

        @Override // af.h
        public Iterator<T> iterator() {
            Iterator<T> a10;
            a10 = l.a(this.f500a);
            return a10;
        }
    }

    public static <T> Iterator<T> a(gc.p<? super j<? super T>, ? super xb.d<? super e0>, ? extends Object> pVar) {
        xb.d<? super e0> a10;
        t.e(pVar, "block");
        i iVar = new i();
        a10 = yb.c.a(pVar, iVar, iVar);
        iVar.k(a10);
        return iVar;
    }

    public static <T> h<T> b(gc.p<? super j<? super T>, ? super xb.d<? super e0>, ? extends Object> pVar) {
        t.e(pVar, "block");
        return new a(pVar);
    }
}
