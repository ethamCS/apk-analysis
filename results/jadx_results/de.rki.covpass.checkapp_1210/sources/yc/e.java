package yc;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public enum e {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    

    /* renamed from: c */
    private final String f26032c;

    e(String str) {
        this.f26032c = str == null ? we.a.f(name()) : str;
    }

    /* synthetic */ e(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }

    public final String g() {
        return this.f26032c;
    }
}
