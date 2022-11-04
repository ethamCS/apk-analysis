package m8;

import androidx.fragment.app.w;
import gc.l;
import hc.t;
import hc.v;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001a\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¨\u0006\r"}, d2 = {"Lm8/c;", "dialogModel", "Landroidx/fragment/app/w;", "fragmentManager", "Ltb/e0;", "b", "Landroidx/fragment/app/e;", BuildConfig.FLAVOR, "tag", "Lm8/a;", "action", BuildConfig.FLAVOR, "a", "common-app_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends v implements l<Object, b> {

        /* renamed from: c */
        public static final a f16444c = new a();

        public a() {
            super(1);
        }

        @Override // gc.l
        public final b invoke(Object obj) {
            t.e(obj, "it");
            if (!(obj instanceof b)) {
                obj = null;
            }
            return (b) obj;
        }
    }

    public static final boolean a(androidx.fragment.app.e eVar, String str, m8.a aVar) {
        t.e(eVar, "<this>");
        t.e(str, "tag");
        t.e(aVar, "action");
        b bVar = (b) m7.f.b(eVar, 0, a.f16444c);
        if (bVar != null) {
            bVar.h(str, aVar);
        } else {
            bVar = null;
        }
        return bVar != null;
    }

    public static final void b(c cVar, w wVar) {
        t.e(cVar, "dialogModel");
        t.e(wVar, "fragmentManager");
        if (wVar.K0() || wVar.R0()) {
            return;
        }
        new j(cVar).b().B2(wVar, cVar.n());
    }
}
