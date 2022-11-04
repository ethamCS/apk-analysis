package oa;

import hc.t;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¨\u0006\b"}, d2 = {"Lna/a;", "client", "Lya/d;", "requestData", "Lya/g;", "responseData", "Loa/b;", "a", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {
    public static final b a(na.a aVar, ya.d dVar, ya.g gVar) {
        t.e(aVar, "client");
        t.e(dVar, "requestData");
        t.e(gVar, "responseData");
        b bVar = new b(aVar);
        bVar.m(new ya.a(bVar, dVar));
        bVar.n(new za.a(bVar, gVar));
        if (!(gVar.a() instanceof io.ktor.utils.io.h)) {
            bVar.c1().a(b.Companion.a(), gVar.a());
        }
        return bVar;
    }
}
