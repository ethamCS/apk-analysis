package org.javarosa.core.util;

import org.javarosa.core.api.IModule;
import org.javarosa.core.reference.ReferenceManager;
import org.javarosa.core.reference.ResourceReferenceFactory;
import org.javarosa.core.services.PrototypeManager;
/* loaded from: classes.dex */
public class JavaRosaCoreModule implements IModule {
    @Override // org.javarosa.core.api.IModule
    public void registerModule() {
        PrototypeManager.registerPrototypes(new String[]{"org.javarosa.core.services.locale.ResourceFileDataSource", "org.javarosa.core.services.locale.TableLocaleSource"});
        ReferenceManager._().addReferenceFactory(new ResourceReferenceFactory());
    }
}
