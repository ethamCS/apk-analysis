package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* compiled from: SwipeableV2.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableV2State$unsafeOffset$2 extends Lambda implements Function0<Float> {
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$unsafeOffset$2(SwipeableV2State<T> swipeableV2State) {
        super(0);
        this.this$0 = swipeableV2State;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        MutableState mutableState;
        float minBound;
        float maxBound;
        mutableState = ((SwipeableV2State) this.this$0).dragPosition;
        float floatValue = ((Number) mutableState.getValue()).floatValue();
        minBound = this.this$0.getMinBound();
        maxBound = this.this$0.getMaxBound();
        return Float.valueOf(RangesKt.coerceIn(floatValue, minBound, maxBound));
    }
}
