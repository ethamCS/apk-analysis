package org.apache.james.mime4j.field.address.parser;

import java.util.Stack;
/* loaded from: classes.dex */
class JJTAddressListParserState {
    private boolean node_created;
    private Stack<Node> nodes = new Stack<>();
    private Stack<Integer> marks = new Stack<>();
    private int sp = 0;
    private int mk = 0;

    boolean nodeCreated() {
        return this.node_created;
    }

    public void reset() {
        this.nodes.removeAllElements();
        this.marks.removeAllElements();
        this.sp = 0;
        this.mk = 0;
    }

    public Node rootNode() {
        return this.nodes.elementAt(0);
    }

    void pushNode(Node n) {
        this.nodes.push(n);
        this.sp++;
    }

    public Node popNode() {
        int i = this.sp - 1;
        this.sp = i;
        if (i < this.mk) {
            this.mk = this.marks.pop().intValue();
        }
        return this.nodes.pop();
    }

    Node peekNode() {
        return this.nodes.peek();
    }

    int nodeArity() {
        return this.sp - this.mk;
    }

    public void clearNodeScope(Node n) {
        while (this.sp > this.mk) {
            popNode();
        }
        this.mk = this.marks.pop().intValue();
    }

    public void openNodeScope(Node n) {
        this.marks.push(new Integer(this.mk));
        this.mk = this.sp;
        n.jjtOpen();
    }

    void closeNodeScope(Node n, int num) {
        this.mk = this.marks.pop().intValue();
        while (true) {
            int num2 = num;
            num = num2 - 1;
            if (num2 > 0) {
                Node c = popNode();
                c.jjtSetParent(n);
                n.jjtAddChild(c, num);
            } else {
                n.jjtClose();
                pushNode(n);
                this.node_created = true;
                return;
            }
        }
    }

    public void closeNodeScope(Node n, boolean condition) {
        if (condition) {
            int a = nodeArity();
            this.mk = this.marks.pop().intValue();
            while (true) {
                int a2 = a;
                a = a2 - 1;
                if (a2 > 0) {
                    Node c = popNode();
                    c.jjtSetParent(n);
                    n.jjtAddChild(c, a);
                } else {
                    n.jjtClose();
                    pushNode(n);
                    this.node_created = true;
                    return;
                }
            }
        } else {
            this.mk = this.marks.pop().intValue();
            this.node_created = false;
        }
    }
}
