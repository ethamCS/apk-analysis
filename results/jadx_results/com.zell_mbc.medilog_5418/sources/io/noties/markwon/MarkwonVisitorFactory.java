package io.noties.markwon;

import io.noties.markwon.MarkwonVisitor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class MarkwonVisitorFactory {
    public abstract MarkwonVisitor create();

    MarkwonVisitorFactory() {
    }

    public static MarkwonVisitorFactory create(final MarkwonVisitor.Builder builder, final MarkwonConfiguration markwonConfiguration) {
        return new MarkwonVisitorFactory() { // from class: io.noties.markwon.MarkwonVisitorFactory.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // io.noties.markwon.MarkwonVisitorFactory
            public MarkwonVisitor create() {
                return builder.build(markwonConfiguration, new RenderPropsImpl());
            }
        };
    }
}
