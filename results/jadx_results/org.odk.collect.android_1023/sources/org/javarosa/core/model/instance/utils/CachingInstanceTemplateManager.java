package org.javarosa.core.model.instance.utils;

import java.util.Hashtable;
import java.util.Vector;
import org.javarosa.core.model.instance.FormInstance;
/* loaded from: classes.dex */
public class CachingInstanceTemplateManager implements InstanceTemplateManager {
    private Vector<Integer> allowedFormTypes;
    private boolean restrictFormTypes;
    private Hashtable<Integer, FormInstance> templateCache;

    public CachingInstanceTemplateManager() {
        this(true);
    }

    public CachingInstanceTemplateManager(boolean z) {
        this.templateCache = new Hashtable<>();
        this.restrictFormTypes = z;
        this.allowedFormTypes = new Vector<>();
    }

    public void clearCache() {
        this.templateCache.clear();
    }

    public void addFormType(int i) {
        if (!this.allowedFormTypes.contains(new Integer(i))) {
            this.allowedFormTypes.addElement(new Integer(i));
        }
    }

    public void resetFormTypes() {
        this.allowedFormTypes.removeAllElements();
    }

    @Override // org.javarosa.core.model.instance.utils.InstanceTemplateManager
    public FormInstance getTemplateInstance(int i) {
        if (this.restrictFormTypes && !this.allowedFormTypes.contains(new Integer(i))) {
            throw new RuntimeException("form ID [" + i + "] is not an allowed form type!");
        }
        FormInstance formInstance = this.templateCache.get(new Integer(i));
        if (formInstance == null) {
            formInstance = CompactInstanceWrapper.loadTemplateInstance(i);
            if (formInstance == null) {
                throw new RuntimeException("no formdef found for form id [" + i + "]");
            }
            this.templateCache.put(new Integer(i), formInstance);
        }
        return formInstance;
    }
}
