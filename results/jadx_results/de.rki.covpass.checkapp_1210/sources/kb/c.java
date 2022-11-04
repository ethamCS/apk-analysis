package kb;

import hc.t;
import java.lang.reflect.Type;
import kotlin.Metadata;
import oc.d;
import oc.n;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a&\u0010\b\u001a\u00020\u00072\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0016\u0010\f\u001a\u00020\u000b*\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0010\r\"\u00020\u00002\u00020\u0000¨\u0006\u000e"}, d2 = {"Ljava/lang/reflect/Type;", "Lio/ktor/util/reflect/Type;", "reifiedType", "Loc/d;", "kClass", "Loc/n;", "kType", "Lkb/a;", "b", BuildConfig.FLAVOR, "type", BuildConfig.FLAVOR, "a", "Type", "ktor-utils"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {
    public static final boolean a(Object obj, d<?> dVar) {
        t.e(obj, "<this>");
        t.e(dVar, "type");
        return fc.a.b(dVar).isInstance(obj);
    }

    public static final a b(Type type, d<?> dVar, n nVar) {
        t.e(type, "reifiedType");
        t.e(dVar, "kClass");
        t.e(nVar, "kType");
        return new b(dVar, type, nVar);
    }
}
