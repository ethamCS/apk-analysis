package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VectorComponent$root$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ VectorComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComponent$root$1$1(VectorComponent vectorComponent) {
        super(0);
        this.this$0 = vectorComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final void invoke2() {
        this.this$0.doInvalidate();
    }
}