package io.noties.markwon.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.commonmark.node.Node;
import org.commonmark.node.Visitor;
/* loaded from: classes2.dex */
public abstract class DumpNodes {

    /* loaded from: classes2.dex */
    public interface NodeProcessor {
        String process(Node node);
    }

    public static String dump(Node node) {
        return dump(node, null);
    }

    public static String dump(Node node, final NodeProcessor nodeProcessor) {
        if (nodeProcessor == null) {
            nodeProcessor = new NodeProcessorToString();
        }
        final Indent indent = new Indent();
        final StringBuilder sb = new StringBuilder();
        node.accept((Visitor) Proxy.newProxyInstance(Visitor.class.getClassLoader(), new Class[]{Visitor.class}, new InvocationHandler() { // from class: io.noties.markwon.utils.DumpNodes.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                Node node2 = (Node) objArr[0];
                indent.appendTo(sb);
                sb.append(nodeProcessor.process(node2));
                if (node2.getFirstChild() != null) {
                    sb.append(" [\n");
                    indent.increment();
                    DumpNodes.visitChildren((Visitor) obj, node2);
                    indent.decrement();
                    indent.appendTo(sb);
                    sb.append("]\n");
                    return null;
                }
                sb.append("\n");
                return null;
            }
        }));
        return sb.toString();
    }

    private DumpNodes() {
    }

    /* loaded from: classes2.dex */
    public static class Indent {
        private int count;

        private Indent() {
        }

        void increment() {
            this.count++;
        }

        void decrement() {
            this.count--;
        }

        void appendTo(StringBuilder sb) {
            for (int i = 0; i < this.count; i++) {
                sb.append(' ');
                sb.append(' ');
            }
        }
    }

    public static void visitChildren(Visitor visitor, Node node) {
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            Node next = firstChild.getNext();
            firstChild.accept(visitor);
            firstChild = next;
        }
    }

    /* loaded from: classes2.dex */
    public static class NodeProcessorToString implements NodeProcessor {
        private NodeProcessorToString() {
        }

        @Override // io.noties.markwon.utils.DumpNodes.NodeProcessor
        public String process(Node node) {
            return node.toString();
        }
    }
}
