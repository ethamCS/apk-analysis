package gd;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public enum f0 {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    
    public static final a Companion = new a(null);

    /* renamed from: c */
    private final String f10697c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    f0(String str) {
        this.f10697c = str;
    }

    public final String g() {
        return this.f10697c;
    }

    public final boolean h() {
        return this == IGNORE;
    }

    public final boolean j() {
        return this == WARN;
    }
}
