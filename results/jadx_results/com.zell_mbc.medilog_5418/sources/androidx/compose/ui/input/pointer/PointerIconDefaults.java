package androidx.compose.ui.input.pointer;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
/* compiled from: PointerIcon.kt */
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerIconDefaults;", "", "()V", "Crosshair", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getCrosshair", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "Default", "getDefault", "Hand", "getHand", "Text", "getText", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PointerIconDefaults {
    public static final int $stable = 0;
    public static final PointerIconDefaults INSTANCE = new PointerIconDefaults();
    private static final PointerIcon Default = PointerIcon_androidKt.getPointerIconDefault();
    private static final PointerIcon Crosshair = PointerIcon_androidKt.getPointerIconCrosshair();
    private static final PointerIcon Text = PointerIcon_androidKt.getPointerIconText();
    private static final PointerIcon Hand = PointerIcon_androidKt.getPointerIconHand();

    private PointerIconDefaults() {
    }

    public final PointerIcon getDefault() {
        return Default;
    }

    public final PointerIcon getCrosshair() {
        return Crosshair;
    }

    public final PointerIcon getText() {
        return Text;
    }

    public final PointerIcon getHand() {
        return Hand;
    }
}
