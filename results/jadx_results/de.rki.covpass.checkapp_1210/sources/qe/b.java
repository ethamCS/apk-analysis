package qe;
/* loaded from: classes3.dex */
public enum b {
    ERROR_CLASS("<Error class: %s>"),
    ERROR_FUNCTION("<Error function>"),
    ERROR_SCOPE("<Error scope>"),
    ERROR_MODULE("<Error module>"),
    ERROR_PROPERTY("<Error property>"),
    ERROR_TYPE("[Error type: %s]"),
    PARENT_OF_ERROR_SCOPE("<Fake parent for error lexical scope>");
    

    /* renamed from: c */
    private final String f19816c;

    b(String str) {
        this.f19816c = str;
    }

    public final String g() {
        return this.f19816c;
    }
}
