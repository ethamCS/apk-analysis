package org.javarosa.core.services.locale;

import org.javarosa.core.util.OrderedHashtable;
import org.javarosa.core.util.externalizable.Externalizable;
/* loaded from: classes.dex */
public interface LocaleDataSource extends Externalizable {
    OrderedHashtable getLocalizedText();
}
