package h6;

import java.util.List;
/* loaded from: classes.dex */
public enum e {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(t.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);
    

    /* renamed from: c */
    private final Class<?> f11333c;

    e(Class cls) {
        this.f11333c = cls;
    }

    public Class<?> b() {
        return this.f11333c;
    }
}
