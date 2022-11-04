package io.noties.markwon;

import org.commonmark.node.Node;
import org.commonmark.node.Visitor;
/* loaded from: classes2.dex */
public interface MarkwonVisitor extends Visitor {

    /* loaded from: classes2.dex */
    public interface BlockHandler {
        void blockEnd(MarkwonVisitor markwonVisitor, Node node);

        void blockStart(MarkwonVisitor markwonVisitor, Node node);
    }

    /* loaded from: classes2.dex */
    public interface Builder {
        Builder blockHandler(BlockHandler blockHandler);

        MarkwonVisitor build(MarkwonConfiguration markwonConfiguration, RenderProps renderProps);

        <N extends Node> Builder on(Class<N> cls, NodeVisitor<? super N> nodeVisitor);
    }

    /* loaded from: classes2.dex */
    public interface NodeVisitor<N extends Node> {
        void visit(MarkwonVisitor markwonVisitor, N n);
    }

    void blockEnd(Node node);

    void blockStart(Node node);

    SpannableBuilder builder();

    void clear();

    MarkwonConfiguration configuration();

    void ensureNewLine();

    void forceNewLine();

    boolean hasNext(Node node);

    int length();

    RenderProps renderProps();

    void setSpans(int i, Object obj);

    <N extends Node> void setSpansForNode(Class<N> cls, int i);

    <N extends Node> void setSpansForNode(N n, int i);

    <N extends Node> void setSpansForNodeOptional(Class<N> cls, int i);

    <N extends Node> void setSpansForNodeOptional(N n, int i);

    void visitChildren(Node node);
}
