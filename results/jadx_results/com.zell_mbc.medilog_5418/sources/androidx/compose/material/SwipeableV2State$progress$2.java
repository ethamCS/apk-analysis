package androidx.compose.material;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeableV2.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableV2State$progress$2 extends Lambda implements Function0<Float> {
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$progress$2(SwipeableV2State<T> swipeableV2State) {
        super(0);
        this.this$0 = swipeableV2State;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        Float f = (Float) this.this$0.getAnchors$material_release().get(this.this$0.getCurrentState());
        float f2 = 0.0f;
        float floatValue = f != null ? f.floatValue() : 0.0f;
        Float f3 = (Float) this.this$0.getAnchors$material_release().get(this.this$0.getTargetState());
        float floatValue2 = (f3 != null ? f3.floatValue() : 0.0f) - floatValue;
        if (Math.abs(floatValue2) > 1.0E-6f) {
            float floatValue3 = (this.this$0.getOffset().getValue().floatValue() - floatValue) / floatValue2;
            if (floatValue3 >= 1.0E-6f) {
                if (floatValue3 <= 0.999999f) {
                    f2 = floatValue3;
                }
            }
            return Float.valueOf(f2);
        }
        f2 = 1.0f;
        return Float.valueOf(f2);
    }
}
