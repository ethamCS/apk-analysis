package androidx.compose.material.ripple;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: Ripple.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidRippleIndicationInstance$onInvalidateRipple$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AndroidRippleIndicationInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRippleIndicationInstance$onInvalidateRipple$1(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        super(0);
        this.this$0 = androidRippleIndicationInstance;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final void invoke2() {
        boolean invalidateTick;
        AndroidRippleIndicationInstance androidRippleIndicationInstance = this.this$0;
        invalidateTick = androidRippleIndicationInstance.getInvalidateTick();
        androidRippleIndicationInstance.setInvalidateTick(!invalidateTick);
    }
}
