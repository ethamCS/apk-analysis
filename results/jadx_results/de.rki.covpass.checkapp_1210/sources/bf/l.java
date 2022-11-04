package bf;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u001a\u001e\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\f\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002\u001a\u0014\u0010\u000f\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¨\u0006\u0010"}, d2 = {BuildConfig.FLAVOR, "Lbf/f;", BuildConfig.FLAVOR, "j", "Ljava/util/regex/Matcher;", "from", BuildConfig.FLAVOR, "input", "Lbf/i;", "f", "g", "Ljava/util/regex/MatchResult;", "Lnc/g;", "h", "groupIndex", "i", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class l {
    public static final /* synthetic */ i a(Matcher matcher, int i10, CharSequence charSequence) {
        return f(matcher, i10, charSequence);
    }

    public static final /* synthetic */ i b(Matcher matcher, CharSequence charSequence) {
        return g(matcher, charSequence);
    }

    public static final /* synthetic */ int e(Iterable iterable) {
        return j(iterable);
    }

    public static final i f(Matcher matcher, int i10, CharSequence charSequence) {
        if (!matcher.find(i10)) {
            return null;
        }
        return new j(matcher, charSequence);
    }

    public static final i g(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new j(matcher, charSequence);
    }

    public static final nc.g h(MatchResult matchResult) {
        nc.g i10;
        i10 = nc.m.i(matchResult.start(), matchResult.end());
        return i10;
    }

    public static final nc.g i(MatchResult matchResult, int i10) {
        nc.g i11;
        i11 = nc.m.i(matchResult.start(i10), matchResult.end(i10));
        return i11;
    }

    public static final int j(Iterable<? extends f> iterable) {
        int i10 = 0;
        for (f fVar : iterable) {
            i10 |= fVar.getValue();
        }
        return i10;
    }
}
