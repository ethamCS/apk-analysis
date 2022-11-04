package org.joda.time.convert;
/* loaded from: classes.dex */
class ConverterSet {
    private final Converter[] iConverters;
    private Entry[] iSelectEntries = new Entry[16];

    public ConverterSet(Converter[] converterArr) {
        this.iConverters = converterArr;
    }

    public Converter select(Class<?> cls) throws IllegalStateException {
        Entry[] entryArr = this.iSelectEntries;
        int length = entryArr.length;
        int hashCode = cls == null ? 0 : cls.hashCode() & (length - 1);
        while (true) {
            Entry entry = entryArr[hashCode];
            if (entry != null) {
                if (entry.iType == cls) {
                    return entry.iConverter;
                }
                int i = hashCode + 1;
                hashCode = i >= length ? 0 : i;
            } else {
                Converter selectSlow = selectSlow(this, cls);
                Entry entry2 = new Entry(cls, selectSlow);
                Entry[] entryArr2 = (Entry[]) entryArr.clone();
                entryArr2[hashCode] = entry2;
                for (int i2 = 0; i2 < length; i2++) {
                    if (entryArr2[i2] == null) {
                        this.iSelectEntries = entryArr2;
                        return selectSlow;
                    }
                }
                int i3 = length << 1;
                Entry[] entryArr3 = new Entry[i3];
                for (int i4 = 0; i4 < length; i4++) {
                    Entry entry3 = entryArr2[i4];
                    Class<?> cls2 = entry3.iType;
                    int hashCode2 = cls2 == null ? 0 : cls2.hashCode() & (i3 - 1);
                    while (entryArr3[hashCode2] != null) {
                        hashCode2++;
                        if (hashCode2 >= i3) {
                            hashCode2 = 0;
                        }
                    }
                    entryArr3[hashCode2] = entry3;
                }
                this.iSelectEntries = entryArr3;
                return selectSlow;
            }
        }
    }

    public int size() {
        return this.iConverters.length;
    }

    public void copyInto(Converter[] converterArr) {
        System.arraycopy(this.iConverters, 0, converterArr, 0, this.iConverters.length);
    }

    public ConverterSet add(Converter converter, Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        for (int i = 0; i < length; i++) {
            Converter converter2 = converterArr2[i];
            if (converter.equals(converter2)) {
                if (converterArr != null) {
                    converterArr[0] = null;
                    return this;
                }
                return this;
            } else if (converter.getSupportedType() == converter2.getSupportedType()) {
                Converter[] converterArr3 = new Converter[length];
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 != i) {
                        converterArr3[i2] = converterArr2[i2];
                    } else {
                        converterArr3[i2] = converter;
                    }
                }
                if (converterArr != null) {
                    converterArr[0] = converter2;
                }
                return new ConverterSet(converterArr3);
            }
        }
        Converter[] converterArr4 = new Converter[length + 1];
        System.arraycopy(converterArr2, 0, converterArr4, 0, length);
        converterArr4[length] = converter;
        if (converterArr != null) {
            converterArr[0] = null;
        }
        return new ConverterSet(converterArr4);
    }

    public ConverterSet remove(Converter converter, Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        for (int i = 0; i < length; i++) {
            if (converter.equals(converterArr2[i])) {
                return remove(i, converterArr);
            }
        }
        if (converterArr != null) {
            converterArr[0] = null;
            return this;
        }
        return this;
    }

    ConverterSet remove(int i, Converter[] converterArr) {
        int i2;
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        if (i >= length) {
            throw new IndexOutOfBoundsException();
        }
        if (converterArr != null) {
            converterArr[0] = converterArr2[i];
        }
        Converter[] converterArr3 = new Converter[length - 1];
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            if (i3 != i) {
                i2 = i4 + 1;
                converterArr3[i4] = converterArr2[i3];
            } else {
                i2 = i4;
            }
            i3++;
            i4 = i2;
        }
        return new ConverterSet(converterArr3);
    }

    private static Converter selectSlow(ConverterSet converterSet, Class<?> cls) {
        Converter[] converterArr = converterSet.iConverters;
        int length = converterArr.length;
        int i = length;
        ConverterSet converterSet2 = converterSet;
        while (true) {
            int i2 = i - 1;
            if (i2 >= 0) {
                Converter converter = converterArr[i2];
                Class<?> supportedType = converter.getSupportedType();
                if (supportedType == cls) {
                    return converter;
                }
                if (supportedType == null || (cls != null && !supportedType.isAssignableFrom(cls))) {
                    converterSet2 = converterSet2.remove(i2, (Converter[]) null);
                    converterArr = converterSet2.iConverters;
                    length = converterArr.length;
                }
                i = i2;
            } else if (cls == null || length == 0) {
                return null;
            } else {
                if (length == 1) {
                    return converterArr[0];
                }
                Converter[] converterArr2 = converterArr;
                ConverterSet converterSet3 = converterSet2;
                int i3 = length;
                while (true) {
                    int i4 = length - 1;
                    if (i4 < 0) {
                        break;
                    }
                    Class<?> supportedType2 = converterArr2[i4].getSupportedType();
                    ConverterSet converterSet4 = converterSet3;
                    int i5 = i4;
                    int i6 = i3;
                    while (true) {
                        i6--;
                        if (i6 >= 0) {
                            if (i6 != i5 && converterArr2[i6].getSupportedType().isAssignableFrom(supportedType2)) {
                                converterSet4 = converterSet4.remove(i6, (Converter[]) null);
                                converterArr2 = converterSet4.iConverters;
                                i3 = converterArr2.length;
                                i5 = i3 - 1;
                            }
                        }
                    }
                    length = i5;
                    converterSet3 = converterSet4;
                }
                if (i3 == 1) {
                    return converterArr2[0];
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to find best converter for type \"");
                stringBuffer.append(cls.getName());
                stringBuffer.append("\" from remaining set: ");
                for (int i7 = 0; i7 < i3; i7++) {
                    Converter converter2 = converterArr2[i7];
                    Class<?> supportedType3 = converter2.getSupportedType();
                    stringBuffer.append(converter2.getClass().getName());
                    stringBuffer.append('[');
                    stringBuffer.append(supportedType3 == null ? null : supportedType3.getName());
                    stringBuffer.append("], ");
                }
                throw new IllegalStateException(stringBuffer.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Entry {
        final Converter iConverter;
        final Class<?> iType;

        Entry(Class<?> cls, Converter converter) {
            this.iType = cls;
            this.iConverter = converter;
        }
    }
}
