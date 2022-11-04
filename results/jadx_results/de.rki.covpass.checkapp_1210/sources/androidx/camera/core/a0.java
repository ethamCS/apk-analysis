package androidx.camera.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import w.m0;
/* loaded from: classes.dex */
final class a0 {

    /* loaded from: classes.dex */
    public static final class a implements w.j0 {

        /* renamed from: a */
        final List<w.m0> f2087a;

        a(List<w.m0> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f2087a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // w.j0
        public List<w.m0> a() {
            return this.f2087a;
        }
    }

    public static w.j0 a(List<w.m0> list) {
        return new a(list);
    }

    static w.j0 b(w.m0... m0VarArr) {
        return new a(Arrays.asList(m0VarArr));
    }

    public static w.j0 c() {
        return b(new m0.a());
    }
}
