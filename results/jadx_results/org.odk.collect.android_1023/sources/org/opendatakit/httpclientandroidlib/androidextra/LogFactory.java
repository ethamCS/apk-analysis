package org.opendatakit.httpclientandroidlib.androidextra;

import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class LogFactory {
    private static LogFactory factory = new LogFactory();
    private ConcurrentHashMap<String, Log> instances = new ConcurrentHashMap<>();

    public static LogFactory getFactory() {
        return factory;
    }

    public static Log getLog(Class clazz) {
        return getFactory().getInstance(clazz);
    }

    public static Log getLog(String name) {
        return getFactory().getInstance(name);
    }

    protected LogFactory() {
    }

    public Log getInstance(Class clazz) {
        return getInstance(clazz.getName());
    }

    public synchronized Log getInstance(String name) {
        Log instance;
        instance = this.instances.get(name);
        if (instance == null) {
            String immediateParent = "";
            for (String key : this.instances.keySet()) {
                if (name.startsWith(key) && immediateParent.length() < key.length()) {
                    immediateParent = key;
                }
            }
            Log parent = this.instances.get(immediateParent);
            instance = new Log(name, parent);
            this.instances.put(name, instance);
        }
        return instance;
    }
}
