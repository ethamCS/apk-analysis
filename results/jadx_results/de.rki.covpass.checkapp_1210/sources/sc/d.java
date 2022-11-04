package sc;

import hc.t;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\u00020\u0003J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lsc/d;", "Ljava/lang/reflect/Member;", "M", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "args", "g", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ltb/e0;", "checkArguments", "([Ljava/lang/Object;)V", "getMember", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "e", "()Ljava/lang/reflect/Type;", "returnType", BuildConfig.FLAVOR, "a", "()Ljava/util/List;", "parameterTypes", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface d<M extends Member> {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public static <M extends Member> void a(d<? extends M> dVar, Object[] objArr) {
            t.e(objArr, "args");
            if (f.a(dVar) == objArr.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + f.a(dVar) + " arguments, but " + objArr.length + " were provided.");
        }
    }

    List<Type> a();

    Type e();

    Object g(Object[] objArr);

    M getMember();
}
