package xc;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public enum e0 {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    
    public static final a Companion = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e0 a(boolean z10, boolean z11, boolean z12) {
            return z10 ? e0.SEALED : z11 ? e0.ABSTRACT : z12 ? e0.OPEN : e0.FINAL;
        }
    }
}
