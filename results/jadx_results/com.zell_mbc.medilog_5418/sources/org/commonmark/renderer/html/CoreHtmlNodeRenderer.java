package org.commonmark.renderer.html;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.Block;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.BulletList;
import org.commonmark.node.Code;
import org.commonmark.node.Document;
import org.commonmark.node.Emphasis;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Heading;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.HtmlInline;
import org.commonmark.node.Image;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.Link;
import org.commonmark.node.ListBlock;
import org.commonmark.node.ListItem;
import org.commonmark.node.Node;
import org.commonmark.node.OrderedList;
import org.commonmark.node.Paragraph;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.StrongEmphasis;
import org.commonmark.node.Text;
import org.commonmark.node.ThematicBreak;
import org.commonmark.renderer.NodeRenderer;
/* loaded from: classes2.dex */
public class CoreHtmlNodeRenderer extends AbstractVisitor implements NodeRenderer {
    protected final HtmlNodeRendererContext context;
    private final HtmlWriter html;

    public CoreHtmlNodeRenderer(HtmlNodeRendererContext htmlNodeRendererContext) {
        this.context = htmlNodeRendererContext;
        this.html = htmlNodeRendererContext.getWriter();
    }

    @Override // org.commonmark.renderer.NodeRenderer
    public Set<Class<? extends Node>> getNodeTypes() {
        return new HashSet(Arrays.asList(Document.class, Heading.class, Paragraph.class, BlockQuote.class, BulletList.class, FencedCodeBlock.class, HtmlBlock.class, ThematicBreak.class, IndentedCodeBlock.class, Link.class, ListItem.class, OrderedList.class, Image.class, Emphasis.class, StrongEmphasis.class, Text.class, Code.class, HtmlInline.class, SoftLineBreak.class, HardLineBreak.class));
    }

    @Override // org.commonmark.renderer.NodeRenderer
    public void render(Node node) {
        node.accept(this);
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(Document document) {
        visitChildren(document);
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(Heading heading) {
        String str = "h" + heading.getLevel();
        this.html.line();
        this.html.tag(str, getAttrs(heading, str));
        visitChildren(heading);
        this.html.tag('/' + str);
        this.html.line();
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(Paragraph paragraph) {
        boolean isInTightList = isInTightList(paragraph);
        if (!isInTightList) {
            this.html.line();
            this.html.tag("p", getAttrs(paragraph, "p"));
        }
        visitChildren(paragraph);
        if (!isInTightList) {
            this.html.tag("/p");
            this.html.line();
        }
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(BlockQuote blockQuote) {
        this.html.line();
        this.html.tag("blockquote", getAttrs(blockQuote, "blockquote"));
        this.html.line();
        visitChildren(blockQuote);
        this.html.line();
        this.html.tag("/blockquote");
        this.html.line();
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(BulletList bulletList) {
        renderListBlock(bulletList, "ul", getAttrs(bulletList, "ul"));
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(FencedCodeBlock fencedCodeBlock) {
        String literal = fencedCodeBlock.getLiteral();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String info = fencedCodeBlock.getInfo();
        if (info != null && !info.isEmpty()) {
            int indexOf = info.indexOf(" ");
            if (indexOf != -1) {
                info = info.substring(0, indexOf);
            }
            linkedHashMap.put("class", "language-" + info);
        }
        renderCodeBlock(literal, fencedCodeBlock, linkedHashMap);
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(HtmlBlock htmlBlock) {
        this.html.line();
        if (this.context.shouldEscapeHtml()) {
            this.html.tag("p", getAttrs(htmlBlock, "p"));
            this.html.text(htmlBlock.getLiteral());
            this.html.tag("/p");
        } else {
            this.html.raw(htmlBlock.getLiteral());
        }
        this.html.line();
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(ThematicBreak thematicBreak) {
        this.html.line();
        this.html.tag("hr", getAttrs(thematicBreak, "hr"), true);
        this.html.line();
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(IndentedCodeBlock indentedCodeBlock) {
        renderCodeBlock(indentedCodeBlock.getLiteral(), indentedCodeBlock, Collections.emptyMap());
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(Link link) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("href", this.context.encodeUrl(link.getDestination()));
        if (link.getTitle() != null) {
            linkedHashMap.put("title", link.getTitle());
        }
        this.html.tag("a", getAttrs(link, "a", linkedHashMap));
        visitChildren(link);
        this.html.tag("/a");
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(ListItem listItem) {
        this.html.tag("li", getAttrs(listItem, "li"));
        visitChildren(listItem);
        this.html.tag("/li");
        this.html.line();
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(OrderedList orderedList) {
        int startNumber = orderedList.getStartNumber();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (startNumber != 1) {
            linkedHashMap.put("start", String.valueOf(startNumber));
        }
        renderListBlock(orderedList, "ol", getAttrs(orderedList, "ol", linkedHashMap));
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(Image image) {
        String encodeUrl = this.context.encodeUrl(image.getDestination());
        AltTextVisitor altTextVisitor = new AltTextVisitor();
        image.accept(altTextVisitor);
        String altText = altTextVisitor.getAltText();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("src", encodeUrl);
        linkedHashMap.put("alt", altText);
        if (image.getTitle() != null) {
            linkedHashMap.put("title", image.getTitle());
        }
        this.html.tag("img", getAttrs(image, "img", linkedHashMap), true);
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(Emphasis emphasis) {
        this.html.tag("em", getAttrs(emphasis, "em"));
        visitChildren(emphasis);
        this.html.tag("/em");
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(StrongEmphasis strongEmphasis) {
        this.html.tag("strong", getAttrs(strongEmphasis, "strong"));
        visitChildren(strongEmphasis);
        this.html.tag("/strong");
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(Text text) {
        this.html.text(text.getLiteral());
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(Code code) {
        this.html.tag("code", getAttrs(code, "code"));
        this.html.text(code.getLiteral());
        this.html.tag("/code");
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(HtmlInline htmlInline) {
        if (this.context.shouldEscapeHtml()) {
            this.html.text(htmlInline.getLiteral());
        } else {
            this.html.raw(htmlInline.getLiteral());
        }
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(SoftLineBreak softLineBreak) {
        this.html.raw(this.context.getSoftbreak());
    }

    @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
    public void visit(HardLineBreak hardLineBreak) {
        this.html.tag("br", getAttrs(hardLineBreak, "br"), true);
        this.html.line();
    }

    @Override // org.commonmark.node.AbstractVisitor
    public void visitChildren(Node node) {
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            Node next = firstChild.getNext();
            this.context.render(firstChild);
            firstChild = next;
        }
    }

    private void renderCodeBlock(String str, Node node, Map<String, String> map) {
        this.html.line();
        this.html.tag("pre", getAttrs(node, "pre"));
        this.html.tag("code", getAttrs(node, "code", map));
        this.html.text(str);
        this.html.tag("/code");
        this.html.tag("/pre");
        this.html.line();
    }

    private void renderListBlock(ListBlock listBlock, String str, Map<String, String> map) {
        this.html.line();
        this.html.tag(str, map);
        this.html.line();
        visitChildren(listBlock);
        this.html.line();
        HtmlWriter htmlWriter = this.html;
        htmlWriter.tag('/' + str);
        this.html.line();
    }

    private boolean isInTightList(Paragraph paragraph) {
        Node parent;
        Block parent2 = paragraph.getParent();
        if (parent2 == null || (parent = parent2.getParent()) == null || !(parent instanceof ListBlock)) {
            return false;
        }
        return ((ListBlock) parent).isTight();
    }

    private Map<String, String> getAttrs(Node node, String str) {
        return getAttrs(node, str, Collections.emptyMap());
    }

    private Map<String, String> getAttrs(Node node, String str, Map<String, String> map) {
        return this.context.extendAttributes(node, str, map);
    }

    /* loaded from: classes2.dex */
    private static class AltTextVisitor extends AbstractVisitor {
        private final StringBuilder sb;

        private AltTextVisitor() {
            this.sb = new StringBuilder();
        }

        String getAltText() {
            return this.sb.toString();
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(Text text) {
            this.sb.append(text.getLiteral());
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(SoftLineBreak softLineBreak) {
            this.sb.append('\n');
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(HardLineBreak hardLineBreak) {
            this.sb.append('\n');
        }
    }
}
