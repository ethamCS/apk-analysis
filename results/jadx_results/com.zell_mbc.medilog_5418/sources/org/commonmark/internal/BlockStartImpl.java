package org.commonmark.internal;

import org.commonmark.parser.block.BlockParser;
import org.commonmark.parser.block.BlockStart;
/* loaded from: classes2.dex */
public class BlockStartImpl extends BlockStart {
    private final BlockParser[] blockParsers;
    private int newIndex = -1;
    private int newColumn = -1;
    private boolean replaceActiveBlockParser = false;

    public BlockStartImpl(BlockParser... blockParserArr) {
        this.blockParsers = blockParserArr;
    }

    public BlockParser[] getBlockParsers() {
        return this.blockParsers;
    }

    public int getNewIndex() {
        return this.newIndex;
    }

    public int getNewColumn() {
        return this.newColumn;
    }

    public boolean isReplaceActiveBlockParser() {
        return this.replaceActiveBlockParser;
    }

    @Override // org.commonmark.parser.block.BlockStart
    public BlockStart atIndex(int i) {
        this.newIndex = i;
        return this;
    }

    @Override // org.commonmark.parser.block.BlockStart
    public BlockStart atColumn(int i) {
        this.newColumn = i;
        return this;
    }

    @Override // org.commonmark.parser.block.BlockStart
    public BlockStart replaceActiveBlockParser() {
        this.replaceActiveBlockParser = true;
        return this;
    }
}
