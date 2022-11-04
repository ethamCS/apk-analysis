package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: SwipeableV2.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableV2State$draggableState$1 extends Lambda implements Function1<Float, Unit> {
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$draggableState$1(SwipeableV2State<T> swipeableV2State) {
        super(1);
        this.this$0 = swipeableV2State;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        MutableState mutableState;
        MutableState mutableState2;
        mutableState = ((SwipeableV2State) this.this$0).dragPosition;
        mutableState2 = ((SwipeableV2State) this.this$0).dragPosition;
        mutableState.setValue(Float.valueOf(((Number) mutableState2.getValue()).floatValue() + f));
    }
}
