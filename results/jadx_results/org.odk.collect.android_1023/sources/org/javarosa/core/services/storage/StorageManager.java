package org.javarosa.core.services.storage;

import java.util.Enumeration;
import java.util.Hashtable;
import org.javarosa.core.services.Logger;
import org.javarosa.core.services.storage.WrappingStorageUtility;
/* loaded from: classes.dex */
public class StorageManager {
    private static IStorageFactory storageFactory;
    private static Hashtable<String, IStorageUtility> storageRegistry = new Hashtable<>();

    public static void setStorageFactory(IStorageFactory iStorageFactory) {
        setStorageFactory(iStorageFactory, false);
    }

    public static void setStorageFactory(IStorageFactory iStorageFactory, boolean z) {
        if (storageFactory == null) {
            storageFactory = iStorageFactory;
        } else if (z) {
            Logger.die("A Storage Factory had already been set when storage factory " + iStorageFactory.getClass().getName() + " attempted to become the only storage factory", new RuntimeException("Duplicate Storage Factory set"));
        }
    }

    public static void registerStorage(String str, Class cls) {
        registerStorage(str, str, cls);
    }

    public static void registerStorage(String str, String str2, Class cls) {
        if (storageFactory == null) {
            throw new RuntimeException("No storage factory has been set; I don't know what kind of storage utility to create. Either set a storage factory, or register your StorageUtilitys directly.");
        }
        registerStorage(str, storageFactory.newStorage(str2, cls));
    }

    public static void registerStorage(String str, IStorageUtility iStorageUtility) {
        storageRegistry.put(str, iStorageUtility);
    }

    public static void registerWrappedStorage(String str, String str2, WrappingStorageUtility.SerializationWrapper serializationWrapper) {
        registerStorage(str, new WrappingStorageUtility(str2, serializationWrapper, storageFactory));
    }

    public static IStorageUtility getStorage(String str) {
        if (storageRegistry.containsKey(str)) {
            return storageRegistry.get(str);
        }
        throw new RuntimeException("No storage utility has been registered to handle \"" + str + "\"; you must register one first with StorageManager.registerStorage()");
    }

    public static void repairAll() {
        Enumeration<IStorageUtility> elements = storageRegistry.elements();
        while (elements.hasMoreElements()) {
            elements.nextElement().repair();
        }
    }

    public static String[] listRegisteredUtilities() {
        String[] strArr = new String[storageRegistry.size()];
        int i = 0;
        Enumeration<String> keys = storageRegistry.keys();
        while (true) {
            int i2 = i;
            if (keys.hasMoreElements()) {
                strArr[i2] = keys.nextElement();
                i = i2 + 1;
            } else {
                return strArr;
            }
        }
    }

    public static void halt() {
        Enumeration<IStorageUtility> elements = storageRegistry.elements();
        while (elements.hasMoreElements()) {
            elements.nextElement().close();
        }
    }
}
