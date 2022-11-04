package com.fasterxml.jackson.core.util;

import java.io.Serializable;
/* loaded from: classes.dex */
public class Separators implements Serializable {
    private final char arrayValueSeparator;
    private final char objectEntrySeparator;
    private final char objectFieldValueSeparator;

    public Separators() {
        this(':', ',', ',');
    }

    public Separators(char c10, char c11, char c12) {
        this.objectFieldValueSeparator = c10;
        this.objectEntrySeparator = c11;
        this.arrayValueSeparator = c12;
    }

    public static Separators createDefaultInstance() {
        return new Separators();
    }

    public char getArrayValueSeparator() {
        return this.arrayValueSeparator;
    }

    public char getObjectEntrySeparator() {
        return this.objectEntrySeparator;
    }

    public char getObjectFieldValueSeparator() {
        return this.objectFieldValueSeparator;
    }
}
