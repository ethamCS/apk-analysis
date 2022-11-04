package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class CompactStringObjectMap implements Serializable {
    private static final CompactStringObjectMap EMPTY = new CompactStringObjectMap(1, 0, new Object[4]);
    private final Object[] _hashArea;
    private final int _hashMask;
    private final int _spillCount;

    private CompactStringObjectMap(int i10, int i11, Object[] objArr) {
        this._hashMask = i10;
        this._spillCount = i11;
        this._hashArea = objArr;
    }

    private final Object _find2(String str, int i10, Object obj) {
        if (obj == null) {
            return null;
        }
        int i11 = this._hashMask + 1;
        int i12 = ((i10 >> 1) + i11) << 1;
        Object obj2 = this._hashArea[i12];
        if (str.equals(obj2)) {
            return this._hashArea[i12 + 1];
        }
        if (obj2 != null) {
            int i13 = (i11 + (i11 >> 1)) << 1;
            int i14 = this._spillCount + i13;
            while (i13 < i14) {
                Object obj3 = this._hashArea[i13];
                if (obj3 == str || str.equals(obj3)) {
                    return this._hashArea[i13 + 1];
                }
                i13 += 2;
            }
        }
        return null;
    }

    public static <T> CompactStringObjectMap construct(Map<String, T> map) {
        if (map.isEmpty()) {
            return EMPTY;
        }
        int findSize = findSize(map.size());
        int i10 = findSize - 1;
        int i11 = (findSize >> 1) + findSize;
        Object[] objArr = new Object[i11 * 2];
        int i12 = 0;
        for (Map.Entry<String, T> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                int hashCode = key.hashCode() & i10;
                int i13 = hashCode + hashCode;
                if (objArr[i13] != null) {
                    i13 = ((hashCode >> 1) + findSize) << 1;
                    if (objArr[i13] != null) {
                        i13 = (i11 << 1) + i12;
                        i12 += 2;
                        if (i13 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i13] = key;
                objArr[i13 + 1] = entry.getValue();
            }
        }
        return new CompactStringObjectMap(i10, i12, objArr);
    }

    private static final int findSize(int i10) {
        if (i10 <= 5) {
            return 8;
        }
        if (i10 <= 12) {
            return 16;
        }
        int i11 = 32;
        while (i11 < i10 + (i10 >> 2)) {
            i11 += i11;
        }
        return i11;
    }

    public Object find(String str) {
        int hashCode = str.hashCode() & this._hashMask;
        int i10 = hashCode << 1;
        Object obj = this._hashArea[i10];
        return (obj == str || str.equals(obj)) ? this._hashArea[i10 + 1] : _find2(str, hashCode, obj);
    }

    public Object findCaseInsensitive(String str) {
        int length = this._hashArea.length;
        for (int i10 = 0; i10 < length; i10 += 2) {
            Object obj = this._hashArea[i10];
            if (obj != null && ((String) obj).equalsIgnoreCase(str)) {
                return this._hashArea[i10 + 1];
            }
        }
        return null;
    }

    public List<String> keys() {
        int length = this._hashArea.length;
        ArrayList arrayList = new ArrayList(length >> 2);
        for (int i10 = 0; i10 < length; i10 += 2) {
            Object obj = this._hashArea[i10];
            if (obj != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }
}
