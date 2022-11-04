package xc;
/* loaded from: classes.dex */
public enum f {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");
    

    /* renamed from: c */
    private final String f25540c;

    f(String str) {
        this.f25540c = str;
    }

    public final boolean g() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
