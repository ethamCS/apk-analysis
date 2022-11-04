package bb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbb/z;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", BuildConfig.FLAVOR, "headerName", BuildConfig.FLAVOR, "position", "<init>", "(Ljava/lang/String;I)V", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class z extends IllegalArgumentException {

    /* renamed from: c */
    private final String f5969c;

    /* renamed from: d */
    private final int f5970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String str, int i10) {
        super("Header name '" + str + "' contains illegal character '" + str.charAt(i10) + "' (code " + (str.charAt(i10) & 255) + ')');
        hc.t.e(str, "headerName");
        this.f5969c = str;
        this.f5970d = i10;
    }
}
