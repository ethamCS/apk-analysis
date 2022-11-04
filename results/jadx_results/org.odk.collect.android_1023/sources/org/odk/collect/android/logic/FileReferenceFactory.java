package org.odk.collect.android.logic;

import org.javarosa.core.reference.PrefixedRootFactory;
import org.javarosa.core.reference.Reference;
/* loaded from: classes.dex */
public class FileReferenceFactory extends PrefixedRootFactory {
    String localRoot;

    public FileReferenceFactory(String localRoot) {
        super(new String[]{"file"});
        this.localRoot = localRoot;
    }

    @Override // org.javarosa.core.reference.PrefixedRootFactory
    protected Reference factory(String terminal, String URI) {
        return new FileReference(this.localRoot, terminal);
    }
}
