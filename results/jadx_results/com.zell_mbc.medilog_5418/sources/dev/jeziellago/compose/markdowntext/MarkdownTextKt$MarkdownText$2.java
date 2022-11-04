package dev.jeziellago.compose.markdowntext;

import android.widget.TextView;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: MarkdownText.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
final class MarkdownTextKt$MarkdownText$2 extends Lambda implements Function1<TextView, Unit> {
    final /* synthetic */ String $markdown;
    final /* synthetic */ Markwon $markdownRender;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownTextKt$MarkdownText$2(Markwon markwon, String str) {
        super(1);
        this.$markdownRender = markwon;
        this.$markdown = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextView textView) {
        invoke2(textView);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.$markdownRender.setMarkdown(textView, this.$markdown);
    }
}
