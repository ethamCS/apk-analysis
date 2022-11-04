package yd;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import yd.i;
/* loaded from: classes3.dex */
public class g {

    /* renamed from: b */
    private static final g f26121b = new g(true);

    /* renamed from: a */
    private final Map<a, i.f<?, ?>> f26122a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final Object f26123a;

        /* renamed from: b */
        private final int f26124b;

        a(Object obj, int i10) {
            this.f26123a = obj;
            this.f26124b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26123a == aVar.f26123a && this.f26124b == aVar.f26124b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f26123a) * 65535) + this.f26124b;
        }
    }

    g() {
        this.f26122a = new HashMap();
    }

    private g(boolean z10) {
        this.f26122a = Collections.emptyMap();
    }

    public static g c() {
        return f26121b;
    }

    public static g d() {
        return new g();
    }

    public final void a(i.f<?, ?> fVar) {
        this.f26122a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public <ContainingType extends q> i.f<ContainingType, ?> b(ContainingType containingtype, int i10) {
        return (i.f<ContainingType, ?>) this.f26122a.get(new a(containingtype, i10));
    }
}
