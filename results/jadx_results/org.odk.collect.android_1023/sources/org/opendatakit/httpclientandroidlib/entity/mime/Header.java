package org.opendatakit.httpclientandroidlib.entity.mime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class Header implements Iterable<MinimalField> {
    private final List<MinimalField> fields = new LinkedList();
    private final Map<String, List<MinimalField>> fieldMap = new HashMap();

    public void addField(MinimalField field) {
        if (field != null) {
            String key = field.getName().toLowerCase(Locale.US);
            List<MinimalField> values = this.fieldMap.get(key);
            if (values == null) {
                values = new LinkedList<>();
                this.fieldMap.put(key, values);
            }
            values.add(field);
            this.fields.add(field);
        }
    }

    public List<MinimalField> getFields() {
        return new ArrayList(this.fields);
    }

    public MinimalField getField(String name) {
        if (name == null) {
            return null;
        }
        String key = name.toLowerCase(Locale.US);
        List<MinimalField> list = this.fieldMap.get(key);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    public List<MinimalField> getFields(String name) {
        if (name == null) {
            return null;
        }
        String key = name.toLowerCase(Locale.US);
        List<MinimalField> list = this.fieldMap.get(key);
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        return new ArrayList(list);
    }

    public int removeFields(String name) {
        if (name == null) {
            return 0;
        }
        String key = name.toLowerCase(Locale.US);
        List<MinimalField> removed = this.fieldMap.remove(key);
        if (removed == null || removed.isEmpty()) {
            return 0;
        }
        this.fields.removeAll(removed);
        return removed.size();
    }

    public void setField(MinimalField field) {
        if (field != null) {
            String key = field.getName().toLowerCase(Locale.US);
            List<MinimalField> list = this.fieldMap.get(key);
            if (list == null || list.isEmpty()) {
                addField(field);
                return;
            }
            list.clear();
            list.add(field);
            int firstOccurrence = -1;
            int index = 0;
            Iterator<MinimalField> it = this.fields.iterator();
            while (it.hasNext()) {
                MinimalField f = it.next();
                if (f.getName().equalsIgnoreCase(field.getName())) {
                    it.remove();
                    if (firstOccurrence == -1) {
                        firstOccurrence = index;
                    }
                }
                index++;
            }
            this.fields.add(firstOccurrence, field);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<MinimalField> iterator() {
        return Collections.unmodifiableList(this.fields).iterator();
    }

    public String toString() {
        return this.fields.toString();
    }
}