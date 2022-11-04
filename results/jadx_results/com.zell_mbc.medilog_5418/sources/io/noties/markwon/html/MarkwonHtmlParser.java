package io.noties.markwon.html;

import io.noties.markwon.html.HtmlTag;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class MarkwonHtmlParser {

    /* loaded from: classes2.dex */
    public interface FlushAction<T> {
        void apply(List<T> list);
    }

    public abstract void flushBlockTags(int i, FlushAction<HtmlTag.Block> flushAction);

    public abstract void flushInlineTags(int i, FlushAction<HtmlTag.Inline> flushAction);

    public abstract <T extends Appendable & CharSequence> void processFragment(T t, String str);

    public abstract void reset();
}
