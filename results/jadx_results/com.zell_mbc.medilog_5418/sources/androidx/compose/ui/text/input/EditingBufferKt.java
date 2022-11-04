package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M */
    public static final long m3801updateRangeAfterDeletepWDy79M(long j, long j2) {
        int i;
        int m3667getMinimpl = TextRange.m3667getMinimpl(j);
        int m3666getMaximpl = TextRange.m3666getMaximpl(j);
        if (TextRange.m3671intersects5zctL8(j2, j)) {
            if (TextRange.m3659contains5zctL8(j2, j)) {
                m3667getMinimpl = TextRange.m3667getMinimpl(j2);
                m3666getMaximpl = m3667getMinimpl;
            } else {
                if (TextRange.m3659contains5zctL8(j, j2)) {
                    i = TextRange.m3665getLengthimpl(j2);
                } else if (TextRange.m3660containsimpl(j2, m3667getMinimpl)) {
                    m3667getMinimpl = TextRange.m3667getMinimpl(j2);
                    i = TextRange.m3665getLengthimpl(j2);
                } else {
                    m3666getMaximpl = TextRange.m3667getMinimpl(j2);
                }
                m3666getMaximpl -= i;
            }
        } else if (m3666getMaximpl > TextRange.m3667getMinimpl(j2)) {
            m3667getMinimpl -= TextRange.m3665getLengthimpl(j2);
            i = TextRange.m3665getLengthimpl(j2);
            m3666getMaximpl -= i;
        }
        return TextRangeKt.TextRange(m3667getMinimpl, m3666getMaximpl);
    }
}
