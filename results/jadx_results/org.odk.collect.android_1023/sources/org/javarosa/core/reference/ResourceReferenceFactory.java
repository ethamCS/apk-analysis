package org.javarosa.core.reference;
/* loaded from: classes.dex */
public class ResourceReferenceFactory extends PrefixedRootFactory {
    public ResourceReferenceFactory() {
        super(new String[]{"resource"});
    }

    @Override // org.javarosa.core.reference.PrefixedRootFactory
    protected Reference factory(String str, String str2) {
        return new ResourceReference(str);
    }
}
