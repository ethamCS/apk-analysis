package ae;
/* loaded from: classes3.dex */
public interface e {

    /* loaded from: classes3.dex */
    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* loaded from: classes3.dex */
    public enum b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    b a(xc.a aVar, xc.a aVar2, xc.e eVar);

    a b();
}
