package g;

import e.j0;
import g.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
@IgnoreJRERequirement
/* loaded from: classes.dex */
public final class o extends h.a {

    /* renamed from: a */
    static final h.a f4547a = new o();

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    static final class a<T> implements h<j0, Optional<T>> {

        /* renamed from: a */
        final h<j0, T> f4548a;

        a(h<j0, T> hVar) {
            this.f4548a = hVar;
        }

        /* renamed from: b */
        public Optional<T> a(j0 j0Var) {
            return Optional.ofNullable(this.f4548a.a(j0Var));
        }
    }

    o() {
    }

    @Override // g.h.a
    @Nullable
    public h<j0, ?> d(Type type, Annotation[] annotationArr, u uVar) {
        if (h.a.b(type) != Optional.class) {
            return null;
        }
        return new a(uVar.h(h.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
