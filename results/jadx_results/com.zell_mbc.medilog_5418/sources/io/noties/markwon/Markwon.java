package io.noties.markwon;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import io.noties.markwon.core.CorePlugin;
import java.util.List;
import org.commonmark.node.Node;
/* loaded from: classes2.dex */
public abstract class Markwon {

    /* loaded from: classes2.dex */
    public interface Builder {
        Builder bufferType(TextView.BufferType bufferType);

        Markwon build();

        Builder fallbackToRawInputWhenEmpty(boolean z);

        Builder textSetter(TextSetter textSetter);

        Builder usePlugin(MarkwonPlugin markwonPlugin);

        Builder usePlugins(Iterable<? extends MarkwonPlugin> iterable);
    }

    /* loaded from: classes2.dex */
    public interface TextSetter {
        void setText(TextView textView, Spanned spanned, TextView.BufferType bufferType, Runnable runnable);
    }

    public abstract MarkwonConfiguration configuration();

    public abstract <P extends MarkwonPlugin> P getPlugin(Class<P> cls);

    public abstract List<? extends MarkwonPlugin> getPlugins();

    public abstract boolean hasPlugin(Class<? extends MarkwonPlugin> cls);

    public abstract Node parse(String str);

    public abstract Spanned render(Node node);

    public abstract <P extends MarkwonPlugin> P requirePlugin(Class<P> cls);

    public abstract void setMarkdown(TextView textView, String str);

    public abstract void setParsedMarkdown(TextView textView, Spanned spanned);

    public abstract Spanned toMarkdown(String str);

    public static Markwon create(Context context) {
        return builder(context).usePlugin(CorePlugin.create()).build();
    }

    public static Builder builder(Context context) {
        return new MarkwonBuilderImpl(context).usePlugin(CorePlugin.create());
    }

    public static Builder builderNoCore(Context context) {
        return new MarkwonBuilderImpl(context);
    }
}
