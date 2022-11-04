package org.apache.james.mime4j.message;
/* loaded from: classes.dex */
public interface Body extends Disposable {
    Entity getParent();

    void setParent(Entity entity);
}
