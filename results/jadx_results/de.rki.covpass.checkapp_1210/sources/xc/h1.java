package xc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import se.k;
/* loaded from: classes.dex */
public abstract class h1<Type extends se.k> {
    private h1() {
    }

    public /* synthetic */ h1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract List<tb.r<wd.f, Type>> a();

    public final <Other extends se.k> h1<Other> b(gc.l<? super Type, ? extends Other> lVar) {
        int s10;
        hc.t.e(lVar, "transform");
        if (this instanceof z) {
            z zVar = (z) this;
            return new z(zVar.c(), lVar.invoke(zVar.d()));
        } else if (!(this instanceof i0)) {
            throw new tb.p();
        } else {
            List<tb.r<wd.f, Type>> a10 = a();
            s10 = ub.v.s(a10, 10);
            ArrayList arrayList = new ArrayList(s10);
            Iterator<T> it = a10.iterator();
            while (it.hasNext()) {
                tb.r rVar = (tb.r) it.next();
                arrayList.add(tb.x.a((wd.f) rVar.b(), lVar.invoke((se.k) rVar.c())));
            }
            return new i0(arrayList);
        }
    }
}
