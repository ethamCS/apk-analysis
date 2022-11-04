package kf;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001\u001a \u0010\u0007\u001a\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¨\u0006\b"}, d2 = {BuildConfig.FLAVOR, "subClassName", "Loc/d;", "baseClass", BuildConfig.FLAVOR, "a", "subClass", "b", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c {
    public static final Void a(String str, oc.d<?> dVar) {
        String str2;
        hc.t.e(dVar, "baseClass");
        String str3 = "in the scope of '" + dVar.G() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nMark the base class as 'sealed' or register the serializer explicitly.";
        }
        throw new kotlinx.serialization.i(str2);
    }

    public static final Void b(oc.d<?> dVar, oc.d<?> dVar2) {
        hc.t.e(dVar, "subClass");
        hc.t.e(dVar2, "baseClass");
        String G = dVar.G();
        if (G == null) {
            G = String.valueOf(dVar);
        }
        a(G, dVar2);
        throw new tb.i();
    }
}
