package org.apache.http.entity.mime.content;

import org.apache.james.mime4j.descriptor.ContentDescriptor;
import org.apache.james.mime4j.message.Body;
/* loaded from: classes.dex */
public interface ContentBody extends Body, ContentDescriptor {
    String getFilename();
}
