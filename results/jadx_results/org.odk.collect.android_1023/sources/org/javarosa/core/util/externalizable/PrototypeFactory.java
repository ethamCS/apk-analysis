package org.javarosa.core.util.externalizable;

import java.util.Date;
import java.util.Vector;
import org.javarosa.core.util.MD5;
import org.javarosa.core.util.PrefixTree;
/* loaded from: classes.dex */
public class PrototypeFactory {
    public static final int CLASS_HASH_SIZE = 4;
    private PrefixTree classNames;
    private Vector classes;
    private Vector hashes;
    private boolean initialized;

    public PrototypeFactory() {
        this(null);
    }

    public PrototypeFactory(PrefixTree prefixTree) {
        this.classNames = prefixTree;
        this.initialized = false;
    }

    private void lazyInit() {
        this.initialized = true;
        this.classes = new Vector();
        this.hashes = new Vector();
        addDefaultClasses();
        if (this.classNames != null) {
            Vector strings = this.classNames.getStrings();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < strings.size()) {
                    String str = (String) strings.elementAt(i2);
                    try {
                        addClass(Class.forName(str));
                        i = i2 + 1;
                    } catch (ClassNotFoundException e) {
                        throw new CannotCreateObjectException(str + ": not found");
                    }
                } else {
                    this.classNames = null;
                    return;
                }
            }
        }
    }

    private void addDefaultClasses() {
        for (Class cls : new Class[]{Object.class, Integer.class, Long.class, Short.class, Byte.class, Character.class, Boolean.class, Float.class, Double.class, String.class, Date.class}) {
            addClass(cls);
        }
    }

    public void addClass(Class cls) {
        if (!this.initialized) {
            lazyInit();
        }
        byte[] classHash = getClassHash(cls);
        if (compareHash(classHash, ExtWrapTagged.WRAPPER_TAG)) {
            throw new Error("Hash collision! " + cls.getName() + " and reserved wrapper tag");
        }
        Class cls2 = getClass(classHash);
        if (cls2 != null && cls2 != cls) {
            throw new Error("Hash collision! " + cls.getName() + " and " + cls2.getName());
        }
        this.classes.addElement(cls);
        this.hashes.addElement(classHash);
    }

    public Class getClass(byte[] bArr) {
        if (!this.initialized) {
            lazyInit();
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.classes.size()) {
                if (!compareHash(bArr, (byte[]) this.hashes.elementAt(i2))) {
                    i = i2 + 1;
                } else {
                    return (Class) this.classes.elementAt(i2);
                }
            } else {
                return null;
            }
        }
    }

    public Object getInstance(byte[] bArr) {
        return getInstance(getClass(bArr));
    }

    public static Object getInstance(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new CannotCreateObjectException(cls.getName() + ": not accessible or no empty constructor");
        } catch (InstantiationException e2) {
            throw new CannotCreateObjectException(cls.getName() + ": not instantiable");
        }
    }

    public static byte[] getClassHash(Class cls) {
        byte[] bArr = new byte[4];
        byte[] hash = MD5.hash(cls.getName().getBytes());
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = hash[i];
        }
        return bArr;
    }

    public static boolean compareHash(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
