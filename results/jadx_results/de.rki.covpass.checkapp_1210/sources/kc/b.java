package kc;

import hc.t;
import kotlin.Metadata;
import oc.k;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lkc/b;", "V", "Lkc/d;", BuildConfig.FLAVOR, "Loc/k;", "property", "oldValue", "newValue", BuildConfig.FLAVOR, "d", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)Z", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "thisRef", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "initialValue", "<init>", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class b<V> implements d<Object, V> {

    /* renamed from: a */
    private V f14871a;

    public b(V v10) {
        this.f14871a = v10;
    }

    @Override // kc.d, kc.c
    public V a(Object obj, k<?> kVar) {
        t.e(kVar, "property");
        return this.f14871a;
    }

    @Override // kc.d
    public void b(Object obj, k<?> kVar, V v10) {
        t.e(kVar, "property");
        V v11 = this.f14871a;
        if (!d(kVar, v11, v10)) {
            return;
        }
        this.f14871a = v10;
        c(kVar, v11, v10);
    }

    protected void c(k<?> kVar, V v10, V v11) {
        t.e(kVar, "property");
    }

    protected boolean d(k<?> kVar, V v10, V v11) {
        t.e(kVar, "property");
        return true;
    }
}
