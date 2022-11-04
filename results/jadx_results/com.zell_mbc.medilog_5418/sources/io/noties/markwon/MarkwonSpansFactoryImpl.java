package io.noties.markwon;

import io.noties.markwon.MarkwonSpansFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.commonmark.node.Node;
/* loaded from: classes2.dex */
class MarkwonSpansFactoryImpl implements MarkwonSpansFactory {
    private final Map<Class<? extends Node>, SpanFactory> factories;

    MarkwonSpansFactoryImpl(Map<Class<? extends Node>, SpanFactory> map) {
        this.factories = map;
    }

    @Override // io.noties.markwon.MarkwonSpansFactory
    public <N extends Node> SpanFactory get(Class<N> cls) {
        return this.factories.get(cls);
    }

    @Override // io.noties.markwon.MarkwonSpansFactory
    public <N extends Node> SpanFactory require(Class<N> cls) {
        SpanFactory spanFactory = get(cls);
        if (spanFactory != null) {
            return spanFactory;
        }
        throw new NullPointerException(cls.getName());
    }

    /* loaded from: classes2.dex */
    static class BuilderImpl implements MarkwonSpansFactory.Builder {
        private final Map<Class<? extends Node>, SpanFactory> factories = new HashMap(3);

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        public <N extends Node> MarkwonSpansFactory.Builder setFactory(Class<N> cls, SpanFactory spanFactory) {
            if (spanFactory == null) {
                this.factories.remove(cls);
            } else {
                this.factories.put(cls, spanFactory);
            }
            return this;
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        @Deprecated
        public <N extends Node> MarkwonSpansFactory.Builder addFactory(Class<N> cls, SpanFactory spanFactory) {
            return prependFactory(cls, spanFactory);
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        public <N extends Node> MarkwonSpansFactory.Builder appendFactory(Class<N> cls, SpanFactory spanFactory) {
            SpanFactory spanFactory2 = this.factories.get(cls);
            if (spanFactory2 == null) {
                this.factories.put(cls, spanFactory);
            } else if (spanFactory2 instanceof CompositeSpanFactory) {
                ((CompositeSpanFactory) spanFactory2).factories.add(0, spanFactory);
            } else {
                this.factories.put(cls, new CompositeSpanFactory(spanFactory, spanFactory2));
            }
            return this;
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        public <N extends Node> MarkwonSpansFactory.Builder prependFactory(Class<N> cls, SpanFactory spanFactory) {
            SpanFactory spanFactory2 = this.factories.get(cls);
            if (spanFactory2 == null) {
                this.factories.put(cls, spanFactory);
            } else if (spanFactory2 instanceof CompositeSpanFactory) {
                ((CompositeSpanFactory) spanFactory2).factories.add(spanFactory);
            } else {
                this.factories.put(cls, new CompositeSpanFactory(spanFactory2, spanFactory));
            }
            return this;
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        public <N extends Node> SpanFactory getFactory(Class<N> cls) {
            return this.factories.get(cls);
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        public <N extends Node> SpanFactory requireFactory(Class<N> cls) {
            SpanFactory factory = getFactory(cls);
            if (factory != null) {
                return factory;
            }
            throw new NullPointerException(cls.getName());
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        public MarkwonSpansFactory build() {
            return new MarkwonSpansFactoryImpl(Collections.unmodifiableMap(this.factories));
        }
    }

    /* loaded from: classes2.dex */
    public static class CompositeSpanFactory implements SpanFactory {
        final List<SpanFactory> factories;

        CompositeSpanFactory(SpanFactory spanFactory, SpanFactory spanFactory2) {
            ArrayList arrayList = new ArrayList(3);
            this.factories = arrayList;
            arrayList.add(spanFactory);
            arrayList.add(spanFactory2);
        }

        @Override // io.noties.markwon.SpanFactory
        public Object getSpans(MarkwonConfiguration markwonConfiguration, RenderProps renderProps) {
            int size = this.factories.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = this.factories.get(i).getSpans(markwonConfiguration, renderProps);
            }
            return objArr;
        }
    }
}
