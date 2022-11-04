package lf;

import hc.k0;
import hc.t;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonPrimitive;
import mf.e0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Llf/m;", "Lkotlinx/serialization/json/JsonPrimitive;", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", "isString", "Z", "b", "()Z", "content", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "body", "<init>", "(Ljava/lang/Object;Z)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class m extends JsonPrimitive {

    /* renamed from: a */
    private final boolean f16004a;

    /* renamed from: b */
    private final String f16005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Object obj, boolean z10) {
        super(null);
        t.e(obj, "body");
        this.f16004a = z10;
        this.f16005b = obj.toString();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String a() {
        return this.f16005b;
    }

    public boolean b() {
        return this.f16004a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !t.a(k0.b(m.class), k0.b(obj.getClass()))) {
            return false;
        }
        m mVar = (m) obj;
        return b() == mVar.b() && t.a(a(), mVar.a());
    }

    public int hashCode() {
        return (Boolean.valueOf(b()).hashCode() * 31) + a().hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String toString() {
        if (b()) {
            StringBuilder sb2 = new StringBuilder();
            e0.c(sb2, a());
            String sb3 = sb2.toString();
            t.d(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
        return a();
    }
}
