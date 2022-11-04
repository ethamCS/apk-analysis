package org.junit.runners.model;

import java.lang.reflect.Modifier;
import java.util.List;
import org.junit.runners.model.FrameworkMember;
/* loaded from: classes3.dex */
public abstract class FrameworkMember<T extends FrameworkMember<T>> implements Annotatable {
    public abstract Class<?> getDeclaringClass();

    protected abstract int getModifiers();

    public abstract String getName();

    public abstract Class<?> getType();

    abstract boolean isBridgeMethod();

    abstract boolean isShadowedBy(T t);

    public T handlePossibleBridgeMethod(List<T> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            T t = list.get(size);
            if (isShadowedBy(t)) {
                if (!t.isBridgeMethod()) {
                    return null;
                }
                list.remove(size);
                return t;
            }
        }
        return this;
    }

    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    public boolean isPublic() {
        return Modifier.isPublic(getModifiers());
    }
}
