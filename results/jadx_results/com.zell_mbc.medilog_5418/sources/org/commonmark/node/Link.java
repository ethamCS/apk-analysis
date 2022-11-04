package org.commonmark.node;
/* loaded from: classes2.dex */
public class Link extends Node {
    private String destination;
    private String title;

    public Link() {
    }

    public Link(String str, String str2) {
        this.destination = str;
        this.title = str2;
    }

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String str) {
        this.destination = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // org.commonmark.node.Node
    protected String toStringAttributes() {
        return "destination=" + this.destination + ", title=" + this.title;
    }
}
