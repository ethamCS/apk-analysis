package org.javarosa.core.reference;
/* loaded from: classes.dex */
public interface ReferenceFactory {
    Reference derive(String str) throws InvalidReferenceException;

    Reference derive(String str, String str2) throws InvalidReferenceException;

    boolean derives(String str);
}
