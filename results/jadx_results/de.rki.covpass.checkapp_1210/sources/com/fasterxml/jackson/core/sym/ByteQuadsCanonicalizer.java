package com.fasterxml.jackson.core.sym;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class ByteQuadsCanonicalizer {
    protected int[] _hashArea;
    protected int _hashSize;
    protected int _secondaryStart;
    protected final int _seed;
    protected int _spilloverEnd;
    protected final AtomicReference<TableInfo> _tableInfo;
    protected int _tertiaryStart;
    protected final ByteQuadsCanonicalizer _parent = null;
    protected int _count = 0;
    protected boolean _hashShared = true;
    protected final boolean _intern = false;
    protected final boolean _failOnDoS = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class TableInfo {
        public final int count;
        public final int longNameOffset;
        public final int[] mainHash;
        public final String[] names;
        public final int size;
        public final int spilloverEnd;
        public final int tertiaryShift;

        public TableInfo(int i10, int i11, int i12, int[] iArr, String[] strArr, int i13, int i14) {
            this.size = i10;
            this.count = i11;
            this.tertiaryShift = i12;
            this.mainHash = iArr;
            this.names = strArr;
            this.spilloverEnd = i13;
            this.longNameOffset = i14;
        }

        public static TableInfo createInitial(int i10) {
            int i11 = i10 << 3;
            return new TableInfo(i10, 0, ByteQuadsCanonicalizer._calcTertiaryShift(i10), new int[i11], new String[i10 << 1], i11 - i10, i11);
        }
    }

    private ByteQuadsCanonicalizer(int i10, int i11) {
        this._seed = i11;
        int i12 = 16;
        if (i10 >= 16) {
            if (((i10 - 1) & i10) != 0) {
                while (i12 < i10) {
                    i12 += i12;
                }
            }
            this._tableInfo = new AtomicReference<>(TableInfo.createInitial(i10));
        }
        i10 = i12;
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(i10));
    }

    static int _calcTertiaryShift(int i10) {
        int i11 = i10 >> 2;
        if (i11 < 64) {
            return 4;
        }
        if (i11 <= 256) {
            return 5;
        }
        return i11 <= 1024 ? 6 : 7;
    }

    private final int _spilloverStart() {
        int i10 = this._hashSize;
        return (i10 << 3) - i10;
    }

    public static ByteQuadsCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    protected static ByteQuadsCanonicalizer createRoot(int i10) {
        return new ByteQuadsCanonicalizer(64, i10);
    }

    public int primaryCount() {
        int i10 = this._secondaryStart;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this._hashArea[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int secondaryCount() {
        int i10 = this._tertiaryStart;
        int i11 = 0;
        for (int i12 = this._secondaryStart + 3; i12 < i10; i12 += 4) {
            if (this._hashArea[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int spilloverCount() {
        return (this._spilloverEnd - _spilloverStart()) >> 2;
    }

    public int tertiaryCount() {
        int i10 = this._tertiaryStart + 3;
        int i11 = this._hashSize + i10;
        int i12 = 0;
        while (i10 < i11) {
            if (this._hashArea[i10] != 0) {
                i12++;
            }
            i10 += 4;
        }
        return i12;
    }

    public String toString() {
        int primaryCount = primaryCount();
        int secondaryCount = secondaryCount();
        int tertiaryCount = tertiaryCount();
        int spilloverCount = spilloverCount();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", ByteQuadsCanonicalizer.class.getName(), Integer.valueOf(this._count), Integer.valueOf(this._hashSize), Integer.valueOf(primaryCount), Integer.valueOf(secondaryCount), Integer.valueOf(tertiaryCount), Integer.valueOf(spilloverCount), Integer.valueOf(primaryCount + secondaryCount + tertiaryCount + spilloverCount), Integer.valueOf(totalCount()));
    }

    public int totalCount() {
        int i10 = this._hashSize << 3;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this._hashArea[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }
}
