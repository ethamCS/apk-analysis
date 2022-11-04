package io.noties.markwon.html;

import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public interface HtmlTag {
    public static final int NO_END = -1;

    /* loaded from: classes2.dex */
    public interface Block extends HtmlTag {
        List<Block> children();

        boolean isRoot();

        Block parent();
    }

    /* loaded from: classes2.dex */
    public interface Inline extends HtmlTag {
    }

    Map<String, String> attributes();

    int end();

    Block getAsBlock();

    Inline getAsInline();

    boolean isBlock();

    boolean isClosed();

    boolean isEmpty();

    boolean isInline();

    String name();

    int start();
}
