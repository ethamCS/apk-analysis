package org.commonmark.ext.gfm.tables.internal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.commonmark.ext.gfm.tables.TableBlock;
import org.commonmark.ext.gfm.tables.TableBody;
import org.commonmark.ext.gfm.tables.TableCell;
import org.commonmark.ext.gfm.tables.TableHead;
import org.commonmark.ext.gfm.tables.TableRow;
import org.commonmark.node.Node;
import org.commonmark.renderer.NodeRenderer;
/* loaded from: classes2.dex */
abstract class TableNodeRenderer implements NodeRenderer {
    protected abstract void renderBlock(TableBlock tableBlock);

    protected abstract void renderBody(TableBody tableBody);

    protected abstract void renderCell(TableCell tableCell);

    protected abstract void renderHead(TableHead tableHead);

    protected abstract void renderRow(TableRow tableRow);

    @Override // org.commonmark.renderer.NodeRenderer
    public Set<Class<? extends Node>> getNodeTypes() {
        return new HashSet(Arrays.asList(TableBlock.class, TableHead.class, TableBody.class, TableRow.class, TableCell.class));
    }

    @Override // org.commonmark.renderer.NodeRenderer
    public void render(Node node) {
        if (node instanceof TableBlock) {
            renderBlock((TableBlock) node);
        } else if (node instanceof TableHead) {
            renderHead((TableHead) node);
        } else if (node instanceof TableBody) {
            renderBody((TableBody) node);
        } else if (node instanceof TableRow) {
            renderRow((TableRow) node);
        } else if (!(node instanceof TableCell)) {
        } else {
            renderCell((TableCell) node);
        }
    }
}
