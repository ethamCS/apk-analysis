package org.apache.james.mime4j.descriptor;

import org.apache.james.mime4j.parser.Field;
/* loaded from: classes.dex */
public interface MutableBodyDescriptor extends BodyDescriptor {
    void addField(Field field);
}
