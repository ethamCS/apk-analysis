package kotlin.io;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: FileReadWrite.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
final class FilesKt__FileReadWriteKt$readLines$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ ArrayList<String> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesKt__FileReadWriteKt$readLines$1(ArrayList<String> arrayList) {
        super(1);
        this.$result = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$result.add(it);
    }
}