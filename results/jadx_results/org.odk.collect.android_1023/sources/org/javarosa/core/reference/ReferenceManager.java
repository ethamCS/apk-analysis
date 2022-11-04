package org.javarosa.core.reference;

import java.util.Iterator;
import java.util.Vector;
/* loaded from: classes.dex */
public class ReferenceManager {
    private static ReferenceManager instance;
    private Vector<RootTranslator> translators = new Vector<>();
    private Vector<ReferenceFactory> factories = new Vector<>();
    private Vector<RootTranslator> sessionTranslators = new Vector<>();

    private ReferenceManager() {
    }

    public static ReferenceManager _() {
        if (instance == null) {
            instance = new ReferenceManager();
        }
        return instance;
    }

    public ReferenceFactory[] getFactories() {
        ReferenceFactory[] referenceFactoryArr = new ReferenceFactory[this.translators.size()];
        this.translators.copyInto(referenceFactoryArr);
        return referenceFactoryArr;
    }

    public void addRootTranslator(RootTranslator rootTranslator) {
        if (!this.translators.contains(rootTranslator)) {
            this.translators.addElement(rootTranslator);
        }
    }

    public void addReferenceFactory(ReferenceFactory referenceFactory) {
        if (!this.factories.contains(referenceFactory)) {
            this.factories.addElement(referenceFactory);
        }
    }

    public boolean removeReferenceFactory(ReferenceFactory referenceFactory) {
        return this.factories.removeElement(referenceFactory);
    }

    public Reference DeriveReference(String str) throws InvalidReferenceException {
        return DeriveReference(str, (String) null);
    }

    public Reference DeriveReference(String str, Reference reference) throws InvalidReferenceException {
        return DeriveReference(str, reference.getURI());
    }

    public Reference DeriveReference(String str, String str2) throws InvalidReferenceException {
        if (isRelative(str)) {
            if (str.startsWith("./")) {
                str = str.substring(2);
            }
            if (str2 == null) {
                throw new RuntimeException("Attempted to retrieve local reference with no context");
            }
            return derivingRoot(str2).derive(str, str2);
        }
        return derivingRoot(str).derive(str);
    }

    public void addSessionRootTranslator(RootTranslator rootTranslator) {
        this.sessionTranslators.addElement(rootTranslator);
    }

    public void clearSession() {
        this.sessionTranslators.removeAllElements();
    }

    private ReferenceFactory derivingRoot(String str) throws InvalidReferenceException {
        ReferenceFactory next;
        Iterator<RootTranslator> it = this.sessionTranslators.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (next.derives(str)) {
                    break;
                }
            } else {
                Iterator<RootTranslator> it2 = this.translators.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.derives(str)) {
                            break;
                        }
                    } else {
                        Iterator<ReferenceFactory> it3 = this.factories.iterator();
                        while (it3.hasNext()) {
                            next = it3.next();
                            if (next.derives(str)) {
                            }
                        }
                        throw new InvalidReferenceException("No reference could be created for URI " + str, str);
                    }
                }
            }
        }
        return next;
    }

    public static boolean isRelative(String str) {
        return str.startsWith("./");
    }
}
