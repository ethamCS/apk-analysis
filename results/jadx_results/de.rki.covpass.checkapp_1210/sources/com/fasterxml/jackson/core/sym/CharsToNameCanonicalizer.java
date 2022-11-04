package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class CharsToNameCanonicalizer {
    protected Bucket[] _buckets;
    protected boolean _canonicalize;
    protected final int _flags;
    protected boolean _hashShared;
    protected int _indexMask;
    protected int _longestCollisionList;
    protected BitSet _overflows;
    protected final CharsToNameCanonicalizer _parent;
    protected final int _seed;
    protected int _size;
    protected int _sizeThreshold;
    protected String[] _symbols;
    protected final AtomicReference<TableInfo> _tableInfo;

    /* loaded from: classes.dex */
    public static final class Bucket {
        public final int length;
        public final Bucket next;
        public final String symbol;

        public Bucket(String str, Bucket bucket) {
            this.symbol = str;
            this.next = bucket;
            this.length = bucket != null ? 1 + bucket.length : 1;
        }

        public String has(char[] cArr, int i10, int i11) {
            if (this.symbol.length() != i11) {
                return null;
            }
            int i12 = 0;
            while (this.symbol.charAt(i12) == cArr[i10 + i12]) {
                i12++;
                if (i12 >= i11) {
                    return this.symbol;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class TableInfo {
        final Bucket[] buckets;
        final int longestCollisionList;
        final int size;
        final String[] symbols;

        public TableInfo(int i10, int i11, String[] strArr, Bucket[] bucketArr) {
            this.size = i10;
            this.longestCollisionList = i11;
            this.symbols = strArr;
            this.buckets = bucketArr;
        }

        public TableInfo(CharsToNameCanonicalizer charsToNameCanonicalizer) {
            this.size = charsToNameCanonicalizer._size;
            this.longestCollisionList = charsToNameCanonicalizer._longestCollisionList;
            this.symbols = charsToNameCanonicalizer._symbols;
            this.buckets = charsToNameCanonicalizer._buckets;
        }

        public static TableInfo createInitial(int i10) {
            return new TableInfo(0, 0, new String[i10], new Bucket[i10 >> 1]);
        }
    }

    private CharsToNameCanonicalizer(int i10) {
        this._parent = null;
        this._seed = i10;
        this._canonicalize = true;
        this._flags = -1;
        this._hashShared = false;
        this._longestCollisionList = 0;
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(64));
    }

    private CharsToNameCanonicalizer(CharsToNameCanonicalizer charsToNameCanonicalizer, int i10, int i11, TableInfo tableInfo) {
        this._parent = charsToNameCanonicalizer;
        this._seed = i11;
        this._tableInfo = null;
        this._flags = i10;
        this._canonicalize = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i10);
        String[] strArr = tableInfo.symbols;
        this._symbols = strArr;
        this._buckets = tableInfo.buckets;
        this._size = tableInfo.size;
        this._longestCollisionList = tableInfo.longestCollisionList;
        int length = strArr.length;
        this._sizeThreshold = _thresholdSize(length);
        this._indexMask = length - 1;
        this._hashShared = true;
    }

    private String _addSymbol(char[] cArr, int i10, int i11, int i12, int i13) {
        if (this._hashShared) {
            copyArrays();
            this._hashShared = false;
        } else if (this._size >= this._sizeThreshold) {
            rehash();
            i13 = _hashToIndex(calcHash(cArr, i10, i11));
        }
        String str = new String(cArr, i10, i11);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this._flags)) {
            str = InternCache.instance.intern(str);
        }
        this._size++;
        String[] strArr = this._symbols;
        if (strArr[i13] == null) {
            strArr[i13] = str;
        } else {
            int i14 = i13 >> 1;
            Bucket bucket = new Bucket(str, this._buckets[i14]);
            int i15 = bucket.length;
            if (i15 > 150) {
                _handleSpillOverflow(i14, bucket, i13);
            } else {
                this._buckets[i14] = bucket;
                this._longestCollisionList = Math.max(i15, this._longestCollisionList);
            }
        }
        return str;
    }

    private String _findSymbol2(char[] cArr, int i10, int i11, Bucket bucket) {
        while (bucket != null) {
            String has = bucket.has(cArr, i10, i11);
            if (has != null) {
                return has;
            }
            bucket = bucket.next;
        }
        return null;
    }

    private void _handleSpillOverflow(int i10, Bucket bucket, int i11) {
        BitSet bitSet;
        BitSet bitSet2 = this._overflows;
        if (bitSet2 == null) {
            bitSet = new BitSet();
            this._overflows = bitSet;
        } else if (bitSet2.get(i10)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this._flags)) {
                _reportTooManyCollisions(150);
            }
            this._canonicalize = false;
            this._symbols[i11] = bucket.symbol;
            this._buckets[i10] = null;
            this._size -= bucket.length;
            this._longestCollisionList = -1;
        } else {
            bitSet = this._overflows;
        }
        bitSet.set(i10);
        this._symbols[i11] = bucket.symbol;
        this._buckets[i10] = null;
        this._size -= bucket.length;
        this._longestCollisionList = -1;
    }

    private static int _thresholdSize(int i10) {
        return i10 - (i10 >> 2);
    }

    private void copyArrays() {
        String[] strArr = this._symbols;
        this._symbols = (String[]) Arrays.copyOf(strArr, strArr.length);
        Bucket[] bucketArr = this._buckets;
        this._buckets = (Bucket[]) Arrays.copyOf(bucketArr, bucketArr.length);
    }

    public static CharsToNameCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    protected static CharsToNameCanonicalizer createRoot(int i10) {
        return new CharsToNameCanonicalizer(i10);
    }

    private void mergeChild(TableInfo tableInfo) {
        int i10 = tableInfo.size;
        TableInfo tableInfo2 = this._tableInfo.get();
        if (i10 == tableInfo2.size) {
            return;
        }
        if (i10 > 12000) {
            tableInfo = TableInfo.createInitial(64);
        }
        this._tableInfo.compareAndSet(tableInfo2, tableInfo);
    }

    private void rehash() {
        String[] strArr = this._symbols;
        int length = strArr.length;
        int i10 = length + length;
        if (i10 > 65536) {
            this._size = 0;
            this._canonicalize = false;
            this._symbols = new String[64];
            this._buckets = new Bucket[32];
            this._indexMask = 63;
            this._hashShared = false;
            return;
        }
        Bucket[] bucketArr = this._buckets;
        this._symbols = new String[i10];
        this._buckets = new Bucket[i10 >> 1];
        this._indexMask = i10 - 1;
        this._sizeThreshold = _thresholdSize(i10);
        int i11 = 0;
        int i12 = 0;
        for (String str : strArr) {
            if (str != null) {
                i11++;
                int _hashToIndex = _hashToIndex(calcHash(str));
                String[] strArr2 = this._symbols;
                if (strArr2[_hashToIndex] == null) {
                    strArr2[_hashToIndex] = str;
                } else {
                    int i13 = _hashToIndex >> 1;
                    Bucket bucket = new Bucket(str, this._buckets[i13]);
                    this._buckets[i13] = bucket;
                    i12 = Math.max(i12, bucket.length);
                }
            }
        }
        int i14 = length >> 1;
        for (int i15 = 0; i15 < i14; i15++) {
            for (Bucket bucket2 = bucketArr[i15]; bucket2 != null; bucket2 = bucket2.next) {
                i11++;
                String str2 = bucket2.symbol;
                int _hashToIndex2 = _hashToIndex(calcHash(str2));
                String[] strArr3 = this._symbols;
                if (strArr3[_hashToIndex2] == null) {
                    strArr3[_hashToIndex2] = str2;
                } else {
                    int i16 = _hashToIndex2 >> 1;
                    Bucket bucket3 = new Bucket(str2, this._buckets[i16]);
                    this._buckets[i16] = bucket3;
                    i12 = Math.max(i12, bucket3.length);
                }
            }
        }
        this._longestCollisionList = i12;
        this._overflows = null;
        if (i11 != this._size) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this._size), Integer.valueOf(i11)));
        }
    }

    public int _hashToIndex(int i10) {
        int i11 = i10 + (i10 >>> 15);
        int i12 = i11 ^ (i11 << 7);
        return (i12 + (i12 >>> 3)) & this._indexMask;
    }

    protected void _reportTooManyCollisions(int i10) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this._size + ") now exceeds maximum, " + i10 + " -- suspect a DoS attack based on hash collisions");
    }

    public int calcHash(String str) {
        int length = str.length();
        int i10 = this._seed;
        for (int i11 = 0; i11 < length; i11++) {
            i10 = (i10 * 33) + str.charAt(i11);
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public int calcHash(char[] cArr, int i10, int i11) {
        int i12 = this._seed;
        int i13 = i11 + i10;
        while (i10 < i13) {
            i12 = (i12 * 33) + cArr[i10];
            i10++;
        }
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public String findSymbol(char[] cArr, int i10, int i11, int i12) {
        if (i11 < 1) {
            return BuildConfig.FLAVOR;
        }
        if (!this._canonicalize) {
            return new String(cArr, i10, i11);
        }
        int _hashToIndex = _hashToIndex(i12);
        String str = this._symbols[_hashToIndex];
        if (str != null) {
            if (str.length() == i11) {
                int i13 = 0;
                while (str.charAt(i13) == cArr[i10 + i13]) {
                    i13++;
                    if (i13 == i11) {
                        return str;
                    }
                }
            }
            Bucket bucket = this._buckets[_hashToIndex >> 1];
            if (bucket != null) {
                String has = bucket.has(cArr, i10, i11);
                if (has != null) {
                    return has;
                }
                String _findSymbol2 = _findSymbol2(cArr, i10, i11, bucket.next);
                if (_findSymbol2 != null) {
                    return _findSymbol2;
                }
            }
        }
        return _addSymbol(cArr, i10, i11, i12, _hashToIndex);
    }

    public int hashSeed() {
        return this._seed;
    }

    public CharsToNameCanonicalizer makeChild(int i10) {
        return new CharsToNameCanonicalizer(this, i10, this._seed, this._tableInfo.get());
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public void release() {
        CharsToNameCanonicalizer charsToNameCanonicalizer;
        if (maybeDirty() && (charsToNameCanonicalizer = this._parent) != null && this._canonicalize) {
            charsToNameCanonicalizer.mergeChild(new TableInfo(this));
            this._hashShared = true;
        }
    }
}
