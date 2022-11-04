package androidx.compose.ui.tooling;

import androidx.compose.ui.tooling.data.Group;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ComposeViewAdapter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, NotificationCompat.CATEGORY_CALL, "Landroidx/compose/ui/tooling/data/Group;", "invoke", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class ComposeViewAdapter$findRememberCall$rememberCalls$1$1 extends Lambda implements Function1<Group, Boolean> {
    public static final ComposeViewAdapter$findRememberCall$rememberCalls$1$1 INSTANCE = new ComposeViewAdapter$findRememberCall$rememberCalls$1$1();

    public ComposeViewAdapter$findRememberCall$rememberCalls$1$1() {
        super(1);
    }

    public final Boolean invoke(Group call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return Boolean.valueOf(Intrinsics.areEqual(call.getName(), "remember"));
    }
}
