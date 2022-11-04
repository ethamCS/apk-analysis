package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;
import net.lingala.zip4j.util.InternalZipConstants;
/* compiled from: ULong.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 |2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001|B\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001dJ\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u001fJ\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010\u000bJ\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0016\u00100\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0016\u00102\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0005J\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001dJ\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u001fJ\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b7\u0010\u000bJ\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b8\u0010\"J\u001b\u00109\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001b\u00109\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010\u0013J\u001b\u00109\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b=\u0010\u000bJ\u001b\u00109\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bA\u0010\u000bJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u001dJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bD\u0010\u001fJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bE\u0010\u000bJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010\"J\u001b\u0010G\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u001b\u0010K\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u001dJ\u001b\u0010K\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bM\u0010\u001fJ\u001b\u0010K\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u000bJ\u001b\u0010K\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bO\u0010\"J\u001e\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\rH\u0087\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010\u001fJ\u001e\u0010S\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\rH\u0087\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010\u001fJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bV\u0010\u001dJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bW\u0010\u001fJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bX\u0010\u000bJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bY\u0010\"J\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020_H\u0087\b¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\rH\u0087\b¢\u0006\u0004\bg\u0010/J\u0010\u0010h\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bi\u0010\u0005J\u0010\u0010j\u001a\u00020kH\u0087\b¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020oH\u0016¢\u0006\u0004\bp\u0010qJ\u0016\u0010r\u001a\u00020\u000eH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010]J\u0016\u0010t\u001a\u00020\u0011H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bu\u0010/J\u0016\u0010v\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bw\u0010\u0005J\u0016\u0010x\u001a\u00020\u0016H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\by\u0010mJ\u001b\u0010z\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b{\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006}"}, d2 = {"Lkotlin/ULong;", "", "data", "", "constructor-impl", "(J)J", "getData$annotations", "()V", "and", "other", "and-VKZWuLQ", "(JJ)J", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "dec", "dec-s-VKNKU", "div", "div-7apg3OU", "(JB)J", "div-WZ4Q5Ns", "(JI)J", "div-VKZWuLQ", "div-xj2QHRw", "(JS)J", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(J)I", "inc", "inc-s-VKNKU", "inv", "inv-s-VKNKU", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(JB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(JS)S", "or", "or-VKZWuLQ", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-s-VKNKU", "shr", "shr-s-VKNKU", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(J)B", "toDouble", "", "toDouble-impl", "(J)D", "toFloat", "", "toFloat-impl", "(J)F", "toInt", "toInt-impl", "toLong", "toLong-impl", "toShort", "", "toShort-impl", "(J)S", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-VKZWuLQ", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class ULong implements Comparable<ULong> {
    public static final Companion Companion = new Companion(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    /* renamed from: box-impl */
    public static final /* synthetic */ ULong m4915boximpl(long j) {
        return new ULong(j);
    }

    /* renamed from: constructor-impl */
    public static long m4921constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl */
    public static boolean m4927equalsimpl(long j, Object obj) {
        return (obj instanceof ULong) && j == ((ULong) obj).m4972unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m4928equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m4933hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: toByte-impl */
    private static final byte m4960toByteimpl(long j) {
        return (byte) j;
    }

    /* renamed from: toInt-impl */
    private static final int m4963toIntimpl(long j) {
        return (int) j;
    }

    /* renamed from: toLong-impl */
    private static final long m4964toLongimpl(long j) {
        return j;
    }

    /* renamed from: toShort-impl */
    private static final short m4965toShortimpl(long j) {
        return (short) j;
    }

    /* renamed from: toULong-s-VKNKU */
    private static final long m4969toULongsVKNKU(long j) {
        return j;
    }

    public boolean equals(Object obj) {
        return m4927equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m4933hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m4972unboximpl() {
        return this.data;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(m4972unboximpl(), uLong.m4972unboximpl());
    }

    private /* synthetic */ ULong(long j) {
        this.data = j;
    }

    /* compiled from: ULong.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/ULong$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/ULong;", "J", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: compareTo-7apg3OU */
    private static final int m4916compareTo7apg3OU(long j, byte b) {
        return UnsignedKt.ulongCompare(j, m4921constructorimpl(b & 255));
    }

    /* renamed from: compareTo-xj2QHRw */
    private static final int m4920compareToxj2QHRw(long j, short s) {
        return UnsignedKt.ulongCompare(j, m4921constructorimpl(s & 65535));
    }

    /* renamed from: compareTo-WZ4Q5Ns */
    private static final int m4919compareToWZ4Q5Ns(long j, int i) {
        return UnsignedKt.ulongCompare(j, m4921constructorimpl(i & InternalZipConstants.ZIP_64_SIZE_LIMIT));
    }

    /* renamed from: compareTo-VKZWuLQ */
    private int m4917compareToVKZWuLQ(long j) {
        return UnsignedKt.ulongCompare(m4972unboximpl(), j);
    }

    /* renamed from: compareTo-VKZWuLQ */
    private static int m4918compareToVKZWuLQ(long j, long j2) {
        return UnsignedKt.ulongCompare(j, j2);
    }

    /* renamed from: plus-7apg3OU */
    private static final long m4945plus7apg3OU(long j, byte b) {
        return m4921constructorimpl(j + m4921constructorimpl(b & 255));
    }

    /* renamed from: plus-xj2QHRw */
    private static final long m4948plusxj2QHRw(long j, short s) {
        return m4921constructorimpl(j + m4921constructorimpl(s & 65535));
    }

    /* renamed from: plus-WZ4Q5Ns */
    private static final long m4947plusWZ4Q5Ns(long j, int i) {
        return m4921constructorimpl(j + m4921constructorimpl(i & InternalZipConstants.ZIP_64_SIZE_LIMIT));
    }

    /* renamed from: plus-VKZWuLQ */
    private static final long m4946plusVKZWuLQ(long j, long j2) {
        return m4921constructorimpl(j + j2);
    }

    /* renamed from: minus-7apg3OU */
    private static final long m4936minus7apg3OU(long j, byte b) {
        return m4921constructorimpl(j - m4921constructorimpl(b & 255));
    }

    /* renamed from: minus-xj2QHRw */
    private static final long m4939minusxj2QHRw(long j, short s) {
        return m4921constructorimpl(j - m4921constructorimpl(s & 65535));
    }

    /* renamed from: minus-WZ4Q5Ns */
    private static final long m4938minusWZ4Q5Ns(long j, int i) {
        return m4921constructorimpl(j - m4921constructorimpl(i & InternalZipConstants.ZIP_64_SIZE_LIMIT));
    }

    /* renamed from: minus-VKZWuLQ */
    private static final long m4937minusVKZWuLQ(long j, long j2) {
        return m4921constructorimpl(j - j2);
    }

    /* renamed from: times-7apg3OU */
    private static final long m4956times7apg3OU(long j, byte b) {
        return m4921constructorimpl(j * m4921constructorimpl(b & 255));
    }

    /* renamed from: times-xj2QHRw */
    private static final long m4959timesxj2QHRw(long j, short s) {
        return m4921constructorimpl(j * m4921constructorimpl(s & 65535));
    }

    /* renamed from: times-WZ4Q5Ns */
    private static final long m4958timesWZ4Q5Ns(long j, int i) {
        return m4921constructorimpl(j * m4921constructorimpl(i & InternalZipConstants.ZIP_64_SIZE_LIMIT));
    }

    /* renamed from: times-VKZWuLQ */
    private static final long m4957timesVKZWuLQ(long j, long j2) {
        return m4921constructorimpl(j * j2);
    }

    /* renamed from: div-7apg3OU */
    private static final long m4923div7apg3OU(long j, byte b) {
        return UnsignedKt.m5098ulongDivideeb3DHEI(j, m4921constructorimpl(b & 255));
    }

    /* renamed from: div-xj2QHRw */
    private static final long m4926divxj2QHRw(long j, short s) {
        return UnsignedKt.m5098ulongDivideeb3DHEI(j, m4921constructorimpl(s & 65535));
    }

    /* renamed from: div-WZ4Q5Ns */
    private static final long m4925divWZ4Q5Ns(long j, int i) {
        return UnsignedKt.m5098ulongDivideeb3DHEI(j, m4921constructorimpl(i & InternalZipConstants.ZIP_64_SIZE_LIMIT));
    }

    /* renamed from: div-VKZWuLQ */
    private static final long m4924divVKZWuLQ(long j, long j2) {
        return UnsignedKt.m5098ulongDivideeb3DHEI(j, j2);
    }

    /* renamed from: rem-7apg3OU */
    private static final long m4950rem7apg3OU(long j, byte b) {
        return UnsignedKt.m5099ulongRemaindereb3DHEI(j, m4921constructorimpl(b & 255));
    }

    /* renamed from: rem-xj2QHRw */
    private static final long m4953remxj2QHRw(long j, short s) {
        return UnsignedKt.m5099ulongRemaindereb3DHEI(j, m4921constructorimpl(s & 65535));
    }

    /* renamed from: rem-WZ4Q5Ns */
    private static final long m4952remWZ4Q5Ns(long j, int i) {
        return UnsignedKt.m5099ulongRemaindereb3DHEI(j, m4921constructorimpl(i & InternalZipConstants.ZIP_64_SIZE_LIMIT));
    }

    /* renamed from: rem-VKZWuLQ */
    private static final long m4951remVKZWuLQ(long j, long j2) {
        return UnsignedKt.m5099ulongRemaindereb3DHEI(j, j2);
    }

    /* renamed from: floorDiv-7apg3OU */
    private static final long m4929floorDiv7apg3OU(long j, byte b) {
        return UnsignedKt.m5098ulongDivideeb3DHEI(j, m4921constructorimpl(b & 255));
    }

    /* renamed from: floorDiv-xj2QHRw */
    private static final long m4932floorDivxj2QHRw(long j, short s) {
        return UnsignedKt.m5098ulongDivideeb3DHEI(j, m4921constructorimpl(s & 65535));
    }

    /* renamed from: floorDiv-WZ4Q5Ns */
    private static final long m4931floorDivWZ4Q5Ns(long j, int i) {
        return UnsignedKt.m5098ulongDivideeb3DHEI(j, m4921constructorimpl(i & InternalZipConstants.ZIP_64_SIZE_LIMIT));
    }

    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m4930floorDivVKZWuLQ(long j, long j2) {
        return UnsignedKt.m5098ulongDivideeb3DHEI(j, j2);
    }

    /* renamed from: mod-7apg3OU */
    private static final byte m4940mod7apg3OU(long j, byte b) {
        return UByte.m4767constructorimpl((byte) UnsignedKt.m5099ulongRemaindereb3DHEI(j, m4921constructorimpl(b & 255)));
    }

    /* renamed from: mod-xj2QHRw */
    private static final short m4943modxj2QHRw(long j, short s) {
        return UShort.m5027constructorimpl((short) UnsignedKt.m5099ulongRemaindereb3DHEI(j, m4921constructorimpl(s & 65535)));
    }

    /* renamed from: mod-WZ4Q5Ns */
    private static final int m4942modWZ4Q5Ns(long j, int i) {
        return UInt.m4843constructorimpl((int) UnsignedKt.m5099ulongRemaindereb3DHEI(j, m4921constructorimpl(i & InternalZipConstants.ZIP_64_SIZE_LIMIT)));
    }

    /* renamed from: mod-VKZWuLQ */
    private static final long m4941modVKZWuLQ(long j, long j2) {
        return UnsignedKt.m5099ulongRemaindereb3DHEI(j, j2);
    }

    /* renamed from: inc-s-VKNKU */
    private static final long m4934incsVKNKU(long j) {
        return m4921constructorimpl(j + 1);
    }

    /* renamed from: dec-s-VKNKU */
    private static final long m4922decsVKNKU(long j) {
        return m4921constructorimpl(j - 1);
    }

    /* renamed from: rangeTo-VKZWuLQ */
    private static final ULongRange m4949rangeToVKZWuLQ(long j, long j2) {
        return new ULongRange(j, j2, null);
    }

    /* renamed from: shl-s-VKNKU */
    private static final long m4954shlsVKNKU(long j, int i) {
        return m4921constructorimpl(j << i);
    }

    /* renamed from: shr-s-VKNKU */
    private static final long m4955shrsVKNKU(long j, int i) {
        return m4921constructorimpl(j >>> i);
    }

    /* renamed from: and-VKZWuLQ */
    private static final long m4914andVKZWuLQ(long j, long j2) {
        return m4921constructorimpl(j & j2);
    }

    /* renamed from: or-VKZWuLQ */
    private static final long m4944orVKZWuLQ(long j, long j2) {
        return m4921constructorimpl(j | j2);
    }

    /* renamed from: xor-VKZWuLQ */
    private static final long m4971xorVKZWuLQ(long j, long j2) {
        return m4921constructorimpl(j ^ j2);
    }

    /* renamed from: inv-s-VKNKU */
    private static final long m4935invsVKNKU(long j) {
        return m4921constructorimpl(~j);
    }

    /* renamed from: toUByte-w2LRezQ */
    private static final byte m4967toUBytew2LRezQ(long j) {
        return UByte.m4767constructorimpl((byte) j);
    }

    /* renamed from: toUShort-Mh2AYeg */
    private static final short m4970toUShortMh2AYeg(long j) {
        return UShort.m5027constructorimpl((short) j);
    }

    /* renamed from: toUInt-pVg5ArA */
    private static final int m4968toUIntpVg5ArA(long j) {
        return UInt.m4843constructorimpl((int) j);
    }

    /* renamed from: toFloat-impl */
    private static final float m4962toFloatimpl(long j) {
        return (float) UnsignedKt.ulongToDouble(j);
    }

    /* renamed from: toDouble-impl */
    private static final double m4961toDoubleimpl(long j) {
        return UnsignedKt.ulongToDouble(j);
    }

    /* renamed from: toString-impl */
    public static String m4966toStringimpl(long j) {
        return UnsignedKt.ulongToString(j);
    }

    public String toString() {
        return m4966toStringimpl(this.data);
    }
}