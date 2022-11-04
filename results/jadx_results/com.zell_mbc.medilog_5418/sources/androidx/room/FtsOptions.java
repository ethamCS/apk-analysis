package androidx.room;
/* loaded from: classes2.dex */
public class FtsOptions {
    public static final String TOKENIZER_ICU = "icu";
    public static final String TOKENIZER_PORTER = "porter";
    public static final String TOKENIZER_SIMPLE = "simple";
    public static final String TOKENIZER_UNICODE61 = "unicode61";

    /* loaded from: classes2.dex */
    public enum MatchInfo {
        FTS3,
        FTS4
    }

    /* loaded from: classes2.dex */
    public enum Order {
        ASC,
        DESC
    }

    private FtsOptions() {
    }
}
