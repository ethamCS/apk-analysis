package io.noties.markwon.html;

import io.noties.markwon.MarkwonVisitor;
/* loaded from: classes2.dex */
public abstract class MarkwonHtmlRenderer {
    public abstract void render(MarkwonVisitor markwonVisitor, MarkwonHtmlParser markwonHtmlParser);

    public abstract TagHandler tagHandler(String str);
}
