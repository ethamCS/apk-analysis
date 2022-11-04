package ob;

import java.io.EOFException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lob/l;", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class l extends pb.f {

    /* renamed from: a */
    final /* synthetic */ String f17775a;

    /* renamed from: b */
    final /* synthetic */ int f17776b;

    public l(String str, int i10) {
        this.f17775a = str;
        this.f17776b = i10;
    }

    public Void a() {
        throw new EOFException("Not enough bytes to read a " + this.f17775a + " of size " + this.f17776b + '.');
    }
}
