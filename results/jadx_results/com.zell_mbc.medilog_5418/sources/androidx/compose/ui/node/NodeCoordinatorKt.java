package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
/* compiled from: NodeCoordinator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"nextUncheckedUntil", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/DelegatableNode;", "type", "Landroidx/compose/ui/node/NodeKind;", "stopType", "nextUncheckedUntil-hw7D004", "(Landroidx/compose/ui/node/DelegatableNode;II)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NodeCoordinatorKt {
    /* renamed from: access$nextUncheckedUntil-hw7D004 */
    public static final /* synthetic */ Object m3401access$nextUncheckedUntilhw7D004(DelegatableNode delegatableNode, int i, int i2) {
        return m3402nextUncheckedUntilhw7D004(delegatableNode, i, i2);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.ui.Modifier$Node] */
    /* renamed from: nextUncheckedUntil-hw7D004 */
    public static final <T> T m3402nextUncheckedUntilhw7D004(DelegatableNode delegatableNode, int i, int i2) {
        ?? r3 = (T) delegatableNode.getNode().getChild$ui_release();
        if (r3 == 0) {
            return null;
        }
        int aggregateChildKindSet$ui_release = r3.getAggregateChildKindSet$ui_release() & i;
        if (aggregateChildKindSet$ui_release == 0) {
            return null;
        }
        for (Modifier.Node node = r3; node != null; node = (T) node.getChild$ui_release()) {
            int kindSet$ui_release = node.getKindSet$ui_release();
            if ((kindSet$ui_release & i2) != 0) {
                return null;
            }
            if ((kindSet$ui_release & i) != 0) {
                return (T) node;
            }
        }
        return null;
    }
}
