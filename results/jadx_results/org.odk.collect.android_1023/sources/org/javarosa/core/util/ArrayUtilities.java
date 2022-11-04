package org.javarosa.core.util;
/* loaded from: classes.dex */
public class ArrayUtilities {
    public static boolean arraysEqual(Object[] objArr, Object[] objArr2) {
        if (objArr.length != objArr2.length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < objArr.length; i++) {
            if (!objArr[i].equals(objArr2[i])) {
                z = false;
            }
        }
        return z;
    }
}
