package fb;

import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H¦\u0002J/\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lfb/b;", BuildConfig.FLAVOR, "T", "Lfb/a;", "key", "c", "(Lfb/a;)Ljava/lang/Object;", "e", BuildConfig.FLAVOR, "b", "value", "Ltb/e0;", "a", "(Lfb/a;Ljava/lang/Object;)V", "Lkotlin/Function0;", "block", "d", "(Lfb/a;Lgc/a;)Ljava/lang/Object;", BuildConfig.FLAVOR, "f", "()Ljava/util/List;", "allKeys", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface b {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public static <T> T a(b bVar, fb.a<T> aVar) {
            hc.t.e(bVar, "this");
            hc.t.e(aVar, "key");
            T t10 = (T) bVar.e(aVar);
            if (t10 != null) {
                return t10;
            }
            throw new IllegalStateException(hc.t.l("No instance for key ", aVar));
        }
    }

    <T> void a(fb.a<T> aVar, T t10);

    boolean b(fb.a<?> aVar);

    <T> T c(fb.a<T> aVar);

    <T> T d(fb.a<T> aVar, gc.a<? extends T> aVar2);

    <T> T e(fb.a<T> aVar);

    List<fb.a<?>> f();
}
