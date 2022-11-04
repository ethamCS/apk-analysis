package ua;

import hc.t;
import kotlin.Metadata;
import oa.i;
import ob.z;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0017J\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"Lua/d;", BuildConfig.FLAVOR, "data", "Lbb/c;", "contentType", "Ldb/a;", "c", "Loa/i;", "type", "Lob/z;", "body", "a", "Lkb/a;", "b", "ktor-client-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface d {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public static Object a(d dVar, i iVar, z zVar) {
            t.e(dVar, "this");
            t.e(iVar, "type");
            t.e(zVar, "body");
            return dVar.b(iVar, zVar);
        }
    }

    Object a(i iVar, z zVar);

    Object b(kb.a aVar, z zVar);

    db.a c(Object obj, bb.c cVar);
}
