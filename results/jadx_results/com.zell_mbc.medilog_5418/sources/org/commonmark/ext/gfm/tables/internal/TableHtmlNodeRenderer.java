package org.commonmark.ext.gfm.tables.internal;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import net.lingala.zip4j.util.InternalZipConstants;
import org.commonmark.ext.gfm.tables.TableBlock;
import org.commonmark.ext.gfm.tables.TableBody;
import org.commonmark.ext.gfm.tables.TableCell;
import org.commonmark.ext.gfm.tables.TableHead;
import org.commonmark.ext.gfm.tables.TableRow;
import org.commonmark.node.Node;
import org.commonmark.renderer.html.HtmlNodeRendererContext;
import org.commonmark.renderer.html.HtmlWriter;
/* loaded from: classes2.dex */
public class TableHtmlNodeRenderer extends TableNodeRenderer {
    private final HtmlNodeRendererContext context;
    private final HtmlWriter htmlWriter;

    @Override // org.commonmark.ext.gfm.tables.internal.TableNodeRenderer, org.commonmark.renderer.NodeRenderer
    public /* bridge */ /* synthetic */ Set getNodeTypes() {
        return super.getNodeTypes();
    }

    @Override // org.commonmark.ext.gfm.tables.internal.TableNodeRenderer, org.commonmark.renderer.NodeRenderer
    public /* bridge */ /* synthetic */ void render(Node node) {
        super.render(node);
    }

    public TableHtmlNodeRenderer(HtmlNodeRendererContext htmlNodeRendererContext) {
        this.htmlWriter = htmlNodeRendererContext.getWriter();
        this.context = htmlNodeRendererContext;
    }

    @Override // org.commonmark.ext.gfm.tables.internal.TableNodeRenderer
    protected void renderBlock(TableBlock tableBlock) {
        this.htmlWriter.line();
        this.htmlWriter.tag("table", getAttributes(tableBlock, "table"));
        renderChildren(tableBlock);
        this.htmlWriter.tag("/table");
        this.htmlWriter.line();
    }

    @Override // org.commonmark.ext.gfm.tables.internal.TableNodeRenderer
    protected void renderHead(TableHead tableHead) {
        this.htmlWriter.line();
        this.htmlWriter.tag("thead", getAttributes(tableHead, "thead"));
        renderChildren(tableHead);
        this.htmlWriter.tag("/thead");
        this.htmlWriter.line();
    }

    @Override // org.commonmark.ext.gfm.tables.internal.TableNodeRenderer
    protected void renderBody(TableBody tableBody) {
        this.htmlWriter.line();
        this.htmlWriter.tag("tbody", getAttributes(tableBody, "tbody"));
        renderChildren(tableBody);
        this.htmlWriter.tag("/tbody");
        this.htmlWriter.line();
    }

    @Override // org.commonmark.ext.gfm.tables.internal.TableNodeRenderer
    protected void renderRow(TableRow tableRow) {
        this.htmlWriter.line();
        this.htmlWriter.tag("tr", getAttributes(tableRow, "tr"));
        renderChildren(tableRow);
        this.htmlWriter.tag("/tr");
        this.htmlWriter.line();
    }

    @Override // org.commonmark.ext.gfm.tables.internal.TableNodeRenderer
    protected void renderCell(TableCell tableCell) {
        String str = tableCell.isHeader() ? "th" : "td";
        this.htmlWriter.line();
        this.htmlWriter.tag(str, getCellAttributes(tableCell, str));
        renderChildren(tableCell);
        HtmlWriter htmlWriter = this.htmlWriter;
        htmlWriter.tag(InternalZipConstants.ZIP_FILE_SEPARATOR + str);
        this.htmlWriter.line();
    }

    private Map<String, String> getAttributes(Node node, String str) {
        return this.context.extendAttributes(node, str, Collections.emptyMap());
    }

    private Map<String, String> getCellAttributes(TableCell tableCell, String str) {
        if (tableCell.getAlignment() != null) {
            return this.context.extendAttributes(tableCell, str, Collections.singletonMap("align", getAlignValue(tableCell.getAlignment())));
        }
        return this.context.extendAttributes(tableCell, str, Collections.emptyMap());
    }

    /* renamed from: org.commonmark.ext.gfm.tables.internal.TableHtmlNodeRenderer$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$commonmark$ext$gfm$tables$TableCell$Alignment;

        static {
            int[] iArr = new int[TableCell.Alignment.values().length];
            $SwitchMap$org$commonmark$ext$gfm$tables$TableCell$Alignment = iArr;
            try {
                iArr[TableCell.Alignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$commonmark$ext$gfm$tables$TableCell$Alignment[TableCell.Alignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$commonmark$ext$gfm$tables$TableCell$Alignment[TableCell.Alignment.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static String getAlignValue(TableCell.Alignment alignment) {
        int i = AnonymousClass1.$SwitchMap$org$commonmark$ext$gfm$tables$TableCell$Alignment[alignment.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "center";
            }
            if (i == 3) {
                return "right";
            }
            throw new IllegalStateException("Unknown alignment: " + alignment);
        }
        return "left";
    }

    private void renderChildren(Node node) {
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            Node next = firstChild.getNext();
            this.context.render(firstChild);
            firstChild = next;
        }
    }
}
