package org.commonmark.parser.block;

import org.commonmark.internal.BlockStartImpl;
/* loaded from: classes2.dex */
public abstract class BlockStart {
    public static BlockStart none() {
        return null;
    }

    public abstract BlockStart atColumn(int i);

    public abstract BlockStart atIndex(int i);

    public abstract BlockStart replaceActiveBlockParser();

    public static BlockStart of(BlockParser... blockParserArr) {
        return new BlockStartImpl(blockParserArr);
    }
}
