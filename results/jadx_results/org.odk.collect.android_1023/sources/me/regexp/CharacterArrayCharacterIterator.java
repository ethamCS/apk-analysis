package me.regexp;
/* loaded from: classes.dex */
public final class CharacterArrayCharacterIterator implements CharacterIterator {
    private final int len;
    private final int off;
    private final char[] src;

    public CharacterArrayCharacterIterator(char[] src, int off, int len) {
        this.src = src;
        this.off = off;
        this.len = len;
    }

    @Override // me.regexp.CharacterIterator
    public String substring(int beginIndex, int endIndex) {
        if (endIndex > this.len) {
            throw new IndexOutOfBoundsException(new StringBuffer().append("endIndex=").append(endIndex).append("; sequence size=").append(this.len).toString());
        }
        if (beginIndex < 0 || beginIndex > endIndex) {
            throw new IndexOutOfBoundsException(new StringBuffer().append("beginIndex=").append(beginIndex).append("; endIndex=").append(endIndex).toString());
        }
        return new String(this.src, this.off + beginIndex, endIndex - beginIndex);
    }

    @Override // me.regexp.CharacterIterator
    public String substring(int beginIndex) {
        return substring(beginIndex, this.len);
    }

    @Override // me.regexp.CharacterIterator
    public char charAt(int pos) {
        return this.src[this.off + pos];
    }

    @Override // me.regexp.CharacterIterator
    public boolean isEnd(int pos) {
        return pos >= this.len;
    }
}
