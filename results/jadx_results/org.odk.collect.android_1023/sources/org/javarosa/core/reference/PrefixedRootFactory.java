package org.javarosa.core.reference;
/* loaded from: classes.dex */
public abstract class PrefixedRootFactory implements ReferenceFactory {
    String[] roots;

    protected abstract Reference factory(String str, String str2);

    public PrefixedRootFactory(String[] strArr) {
        this.roots = new String[strArr.length];
        for (int i = 0; i < this.roots.length; i++) {
            if (strArr[i].indexOf("://") != -1) {
                this.roots[i] = strArr[i];
            } else {
                this.roots[i] = "jr://" + strArr[i];
            }
        }
    }

    @Override // org.javarosa.core.reference.ReferenceFactory
    public Reference derive(String str) throws InvalidReferenceException {
        String[] strArr;
        for (String str2 : this.roots) {
            if (str.indexOf(str2) != -1) {
                return factory(str.substring(str2.length()), str);
            }
        }
        throw new InvalidReferenceException("Invalid attempt to derive a reference from a prefixed root. Valid prefixes for this factory are " + this.roots, str);
    }

    @Override // org.javarosa.core.reference.ReferenceFactory
    public Reference derive(String str, String str2) throws InvalidReferenceException {
        return ReferenceManager._().DeriveReference(str2.substring(0, str2.lastIndexOf(47) + 1) + str);
    }

    @Override // org.javarosa.core.reference.ReferenceFactory
    public boolean derives(String str) {
        for (String str2 : this.roots) {
            if (str.indexOf(str2) != -1) {
                return true;
            }
        }
        return false;
    }
}
