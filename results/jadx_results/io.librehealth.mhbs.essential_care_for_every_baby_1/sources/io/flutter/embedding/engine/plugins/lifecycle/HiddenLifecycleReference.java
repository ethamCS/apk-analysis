package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.e;
@Keep
/* loaded from: classes.dex */
public class HiddenLifecycleReference {
    private final e lifecycle;

    public HiddenLifecycleReference(e eVar) {
        this.lifecycle = eVar;
    }

    public e getLifecycle() {
        return this.lifecycle;
    }
}
