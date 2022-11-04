package me.regexp;
/* loaded from: classes.dex */
public final class StringCharacterIterator implements CharacterIterator {
    private final String src;

    public StringCharacterIterator(String src) {
        this.src = src;
    }

    @Override // me.regexp.CharacterIterator
    public String substring(int beginIndex, int endIndex) {
        return this.src.substring(beginIndex, endIndex);
    }

    @Override // me.regexp.CharacterIterator
    public String substring(int beginIndex) {
        return this.src.substring(beginIndex);
    }

    @Override // me.regexp.CharacterIterator
    public char charAt(int pos) {
        return this.src.charAt(pos);
    }

    @Override // me.regexp.CharacterIterator
    public boolean isEnd(int pos) {
        return pos >= this.src.length();
    }
}
