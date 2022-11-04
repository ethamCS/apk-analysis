package org.javarosa.core.services;

import org.javarosa.core.util.PrefixTree;
import org.javarosa.core.util.externalizable.CannotCreateObjectException;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class PrototypeManager {
    private static PrefixTree prototypes;
    private static PrototypeFactory staticDefault;

    public static void registerPrototype(String str) {
        getPrototypes().addString(str);
        try {
            PrototypeFactory.getInstance(Class.forName(str));
            rebuild();
        } catch (ClassNotFoundException e) {
            throw new CannotCreateObjectException(str + ": not found");
        }
    }

    public static void registerPrototypes(String[] strArr) {
        for (String str : strArr) {
            registerPrototype(str);
        }
    }

    public static PrefixTree getPrototypes() {
        if (prototypes == null) {
            prototypes = new PrefixTree();
        }
        return prototypes;
    }

    public static PrototypeFactory getDefault() {
        if (staticDefault == null) {
            rebuild();
        }
        return staticDefault;
    }

    private static void rebuild() {
        if (staticDefault == null) {
            staticDefault = new PrototypeFactory(getPrototypes());
            return;
        }
        synchronized (staticDefault) {
            staticDefault = new PrototypeFactory(getPrototypes());
        }
    }
}
