package org.javarosa.core.util.externalizable;

import org.javarosa.core.util.Map;
/* loaded from: classes.dex */
public class PrototypeFactoryDeprecated {
    public Map prototypes = new Map();

    public void addNewPrototype(String str, Class cls) {
        this.prototypes.put(str, cls);
    }

    public Object getNewInstance(String str) {
        if (this.prototypes.get(str) == null) {
            return null;
        }
        try {
            return ((Class) this.prototypes.get(str)).newInstance();
        } catch (IllegalAccessException e) {
            throw new CannotCreateObjectException(str);
        } catch (InstantiationException e2) {
            throw new CannotCreateObjectException(str);
        }
    }
}
