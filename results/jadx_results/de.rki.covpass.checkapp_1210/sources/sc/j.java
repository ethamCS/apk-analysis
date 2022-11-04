package sc;

import hc.t;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lsc/j;", "Lsc/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "args", BuildConfig.FLAVOR, "g", "([Ljava/lang/Object;)Ljava/lang/Object;", "b", "()Ljava/lang/Void;", "member", BuildConfig.FLAVOR, "Ljava/lang/reflect/Type;", "a", "()Ljava/util/List;", "parameterTypes", "e", "()Ljava/lang/reflect/Type;", "returnType", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a */
    public static final j f21655a = new j();

    private j() {
    }

    @Override // sc.d
    public List<Type> a() {
        List<Type> h10;
        h10 = u.h();
        return h10;
    }

    public Void b() {
        return null;
    }

    @Override // sc.d
    public Type e() {
        Class cls = Void.TYPE;
        t.d(cls, "TYPE");
        return cls;
    }

    @Override // sc.d
    public Object g(Object[] objArr) {
        t.e(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // sc.d
    public /* bridge */ /* synthetic */ Member getMember() {
        return (Member) b();
    }
}
