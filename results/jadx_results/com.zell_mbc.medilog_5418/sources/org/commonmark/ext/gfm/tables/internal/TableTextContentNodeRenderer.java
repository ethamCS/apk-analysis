package org.commonmark.ext.gfm.tables.internal;

import java.util.Set;
import org.commonmark.ext.gfm.tables.TableBlock;
import org.commonmark.ext.gfm.tables.TableBody;
import org.commonmark.ext.gfm.tables.TableCell;
import org.commonmark.ext.gfm.tables.TableHead;
import org.commonmark.ext.gfm.tables.TableRow;
import org.commonmark.node.Node;
import org.commonmark.renderer.text.TextContentNodeRendererContext;
import org.commonmark.renderer.text.TextContentWriter;
/* loaded from: classes2.dex */
public class TableTextContentNodeRenderer extends TableNodeRenderer {
    private final TextContentNodeRendererContext context;
    private final TextContentWriter textContentWriter;

    @Override // org.commonmark.ext.gfm.tables.internal.TableNodeRenderer, org.commonmark.renderer.NodeRenderer
    public /* bridge */ /* synthetic */ Set getNodeTypes() {
        return super.getNodeTypes();
    }

    @Override // org.commonmark.ext.gfm.tables.internal.TableNodeRenderer, org.commonmark.renderer.NodeRenderer
    public /* bridge */ /* synthetic */ void render(Node node) {
        super.render(node);
    }

    public TableTextContentNodeRenderer(TextContentNodeRendererContext textContentNodeRendererContext) {
        this.textContentWriter = textContentNodeRendererContext.getWriter();
        this.context = textContentNodeRendererContext;
    }

    @Override // org.commonmark.ext.gfm.tables.internal.TableNodeRenderer
    protected void renderBlock(TableBlock tableBlock) {
        renderChildren(tableBlock);
        if (tableBlock.getNext() != null) {
            this.textContentWriter.write("\n");
        }
    }

    @Override // org.commonmark.ext.gfm.tables.internal.TableNodeRenderer
    protected void renderHead(TableHead tableHead) {
        renderChildren(tableHead);
    }

    @Override // org.commonmark.ext.gfm.tables.internal.TableNodeRenderer
    protected void renderBody(TableBody tableBody) {
        renderChildren(tableBody);
    }

    @Override // org.commonmark.ext.gfm.tables.internal.TableNodeRenderer
    protected void renderRow(TableRow tableRow) {
        this.textContentWriter.line();
        renderChildren(tableRow);
        this.textContentWriter.line();
    }

    @Override // org.commonmark.ext.gfm.tables.internal.TableNodeRenderer
    protected void renderCell(TableCell tableCell) {
        renderChildren(tableCell);
        this.textContentWriter.write('|');
        this.textContentWriter.whitespace();
    }

    private void renderLastCell(TableCell tableCell) {
        renderChildren(tableCell);
    }

    private void renderChildren(Node node) {
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            Node next = firstChild.getNext();
            if ((firstChild instanceof TableCell) && next == null) {
                renderLastCell((TableCell) firstChild);
            } else {
                this.context.render(firstChild);
            }
            firstChild = next;
        }
    }
}
