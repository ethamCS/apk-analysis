package j$.util.concurrent;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, v {
    private static final long ABASE;
    private static final int ASHIFT;
    private static final long BASECOUNT;
    private static final long CELLSBUSY;
    private static final long CELLVALUE;
    private static final int DEFAULT_CAPACITY = 16;
    private static final int DEFAULT_CONCURRENCY_LEVEL = 16;
    static final int HASH_BITS = Integer.MAX_VALUE;
    private static final float LOAD_FACTOR = 0.75f;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_ARRAY_SIZE = 2147483639;
    private static final int MIN_TRANSFER_STRIDE = 16;
    static final int MIN_TREEIFY_CAPACITY = 64;
    static final int MOVED = -1;
    static final int RESERVED = -3;
    private static int RESIZE_STAMP_BITS = 16;
    private static final long SIZECTL;
    private static final long TRANSFERINDEX;
    static final int TREEBIN = -2;
    static final int TREEIFY_THRESHOLD = 8;
    private static final Unsafe U;
    static final int UNTREEIFY_THRESHOLD = 6;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    private volatile transient long baseCount;
    private volatile transient int cellsBusy;
    private volatile transient d[] counterCells;
    private transient f entrySet;
    private transient j keySet;
    private volatile transient m[] nextTable;
    private volatile transient int sizeCtl;
    volatile transient m[] table;
    private volatile transient int transferIndex;
    private transient t values;
    private static final int MAX_RESIZERS = (1 << (32 - 16)) - 1;
    private static final int RESIZE_STAMP_SHIFT = 32 - 16;
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", o[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        try {
            Unsafe c10 = w.c();
            U = c10;
            SIZECTL = c10.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("sizeCtl"));
            TRANSFERINDEX = c10.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("transferIndex"));
            BASECOUNT = c10.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("baseCount"));
            CELLSBUSY = c10.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("cellsBusy"));
            CELLVALUE = c10.objectFieldOffset(d.class.getDeclaredField("value"));
            ABASE = c10.arrayBaseOffset(m[].class);
            int arrayIndexScale = c10.arrayIndexScale(m[].class);
            if (((arrayIndexScale + MOVED) & arrayIndexScale) != 0) {
                throw new Error("data type scale not a power of two");
            }
            ASHIFT = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i10) {
        if (i10 >= 0) {
            this.sizeCtl = i10 >= 536870912 ? MAXIMUM_CAPACITY : tableSizeFor(i10 + (i10 >>> 1) + 1);
            return;
        }
        throw new IllegalArgumentException();
    }

    public ConcurrentHashMap(int i10, float f10) {
        this(i10, f10, 1);
    }

    public ConcurrentHashMap(int i10, float f10, int i11) {
        if (f10 <= 0.0f || i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        long j10 = (long) (((i10 < i11 ? i11 : i10) / f10) + 1.0d);
        this.sizeCtl = j10 >= 1073741824 ? MAXIMUM_CAPACITY : tableSizeFor((int) j10);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1.compareAndSwapLong(r11, r3, r5, r9) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addCount(long r12, int r14) {
        /*
            r11 = this;
            j$.util.concurrent.d[] r0 = r11.counterCells
            if (r0 != 0) goto L14
            sun.misc.Unsafe r1 = j$.util.concurrent.ConcurrentHashMap.U
            long r3 = j$.util.concurrent.ConcurrentHashMap.BASECOUNT
            long r5 = r11.baseCount
            long r9 = r5 + r12
            r2 = r11
            r7 = r9
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 != 0) goto L3b
        L14:
            r1 = 1
            if (r0 == 0) goto L96
            int r2 = r0.length
            int r2 = r2 - r1
            if (r2 < 0) goto L96
            int r3 = j$.util.concurrent.ThreadLocalRandom.b()
            r2 = r2 & r3
            r4 = r0[r2]
            if (r4 == 0) goto L96
            sun.misc.Unsafe r3 = j$.util.concurrent.ConcurrentHashMap.U
            long r5 = j$.util.concurrent.ConcurrentHashMap.CELLVALUE
            long r7 = r4.value
            long r9 = r7 + r12
            boolean r0 = r3.compareAndSwapLong(r4, r5, r7, r9)
            if (r0 != 0) goto L34
            r1 = r0
            goto L96
        L34:
            if (r14 > r1) goto L37
            return
        L37:
            long r9 = r11.sumCount()
        L3b:
            if (r14 < 0) goto L95
        L3d:
            int r4 = r11.sizeCtl
            long r12 = (long) r4
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L95
            j$.util.concurrent.m[] r12 = r11.table
            if (r12 == 0) goto L95
            int r13 = r12.length
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 >= r14) goto L95
            int r13 = resizeStamp(r13)
            if (r4 >= 0) goto L7c
            int r14 = j$.util.concurrent.ConcurrentHashMap.RESIZE_STAMP_SHIFT
            int r14 = r4 >>> r14
            if (r14 != r13) goto L95
            int r14 = r13 + 1
            if (r4 == r14) goto L95
            int r14 = j$.util.concurrent.ConcurrentHashMap.MAX_RESIZERS
            int r13 = r13 + r14
            if (r4 == r13) goto L95
            j$.util.concurrent.m[] r13 = r11.nextTable
            if (r13 == 0) goto L95
            int r14 = r11.transferIndex
            if (r14 > 0) goto L6b
            goto L95
        L6b:
            sun.misc.Unsafe r0 = j$.util.concurrent.ConcurrentHashMap.U
            long r2 = j$.util.concurrent.ConcurrentHashMap.SIZECTL
            int r5 = r4 + 1
            r1 = r11
            boolean r14 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r14 == 0) goto L90
            r11.transfer(r12, r13)
            goto L90
        L7c:
            sun.misc.Unsafe r0 = j$.util.concurrent.ConcurrentHashMap.U
            long r2 = j$.util.concurrent.ConcurrentHashMap.SIZECTL
            int r14 = j$.util.concurrent.ConcurrentHashMap.RESIZE_STAMP_SHIFT
            int r13 = r13 << r14
            int r5 = r13 + 2
            r1 = r11
            boolean r13 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r13 == 0) goto L90
            r13 = 0
            r11.transfer(r12, r13)
        L90:
            long r9 = r11.sumCount()
            goto L3d
        L95:
            return
        L96:
            r11.fullAddCount(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.addCount(long, int):void");
    }

    static final <K, V> boolean casTabAt(m[] mVarArr, int i10, m mVar, m mVar2) {
        return AbstractC0494a.a(U, mVarArr, (i10 << ASHIFT) + ABASE, mVar, mVar2);
    }

    public static Class<?> comparableClassFor(Object obj) {
        Type[] actualTypeArguments;
        if (obj instanceof Comparable) {
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                        return cls;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static int compareComparables(Class<?> cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
        if (r24.counterCells != r7) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009f, code lost:
        r1 = new j$.util.concurrent.d[r8 << 1];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
        if (r2 >= r8) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a6, code lost:
        r1[r2] = r7[r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
        r24.counterCells = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void fullAddCount(long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.fullAddCount(long, boolean):void");
    }

    private final m[] initTable() {
        while (true) {
            m[] mVarArr = this.table;
            if (mVarArr == null || mVarArr.length == 0) {
                int i10 = this.sizeCtl;
                if (i10 < 0) {
                    Thread.yield();
                } else if (U.compareAndSwapInt(this, SIZECTL, i10, (int) MOVED)) {
                    try {
                        m[] mVarArr2 = this.table;
                        if (mVarArr2 == null || mVarArr2.length == 0) {
                            int i11 = i10 > 0 ? i10 : 16;
                            m[] mVarArr3 = new m[i11];
                            this.table = mVarArr3;
                            i10 = i11 - (i11 >>> 2);
                            mVarArr2 = mVarArr3;
                        }
                        this.sizeCtl = i10;
                        return mVarArr2;
                    } catch (Throwable th2) {
                        this.sizeCtl = i10;
                        throw th2;
                    }
                }
            } else {
                return mVarArr;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j10;
        int i10;
        boolean z10;
        Object obj;
        this.sizeCtl = MOVED;
        objectInputStream.defaultReadObject();
        long j11 = 0;
        long j12 = 0;
        m mVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j10 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j12++;
            mVar = new m(spread(readObject.hashCode()), readObject, readObject2, mVar);
        }
        if (j12 == 0) {
            this.sizeCtl = 0;
            return;
        }
        boolean z11 = true;
        if (j12 >= 536870912) {
            i10 = MAXIMUM_CAPACITY;
        } else {
            int i11 = (int) j12;
            i10 = tableSizeFor(i11 + (i11 >>> 1) + 1);
        }
        m[] mVarArr = new m[i10];
        int i12 = i10 + MOVED;
        while (mVar != null) {
            m mVar2 = mVar.f13317d;
            int i13 = mVar.f13314a;
            int i14 = i13 & i12;
            m tabAt = tabAt(mVarArr, i14);
            if (tabAt == null) {
                z10 = z11;
            } else {
                Object obj2 = mVar.f13315b;
                if (tabAt.f13314a >= 0) {
                    int i15 = 0;
                    for (m mVar3 = tabAt; mVar3 != null; mVar3 = mVar3.f13317d) {
                        if (mVar3.f13314a == i13 && ((obj = mVar3.f13315b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z10 = false;
                            break;
                        }
                        i15++;
                    }
                    z10 = true;
                    if (z10 && i15 >= 8) {
                        j11++;
                        mVar.f13317d = tabAt;
                        m mVar4 = mVar;
                        s sVar = null;
                        s sVar2 = null;
                        while (mVar4 != null) {
                            long j13 = j11;
                            s sVar3 = new s(mVar4.f13314a, mVar4.f13315b, mVar4.f13316c, null, null);
                            sVar3.f13338h = sVar2;
                            if (sVar2 == null) {
                                sVar = sVar3;
                            } else {
                                sVar2.f13317d = sVar3;
                            }
                            mVar4 = mVar4.f13317d;
                            sVar2 = sVar3;
                            j11 = j13;
                        }
                        setTabAt(mVarArr, i14, new r(sVar));
                    }
                } else if (((r) tabAt).f(i13, obj2, mVar.f13316c) == null) {
                    j11 += j10;
                }
                z10 = false;
            }
            if (z10) {
                j11++;
                mVar.f13317d = tabAt;
                setTabAt(mVarArr, i14, mVar);
            }
            j10 = 1;
            mVar = mVar2;
            z11 = true;
        }
        this.table = mVarArr;
        this.sizeCtl = i10 - (i10 >>> 2);
        this.baseCount = j11;
    }

    static final int resizeStamp(int i10) {
        return Integer.numberOfLeadingZeros(i10) | (1 << (RESIZE_STAMP_BITS - 1));
    }

    static final <K, V> void setTabAt(m[] mVarArr, int i10, m mVar) {
        U.putObjectVolatile(mVarArr, (i10 << ASHIFT) + ABASE, mVar);
    }

    static final int spread(int i10) {
        return (i10 ^ (i10 >>> 16)) & HASH_BITS;
    }

    public static final <K, V> m tabAt(m[] mVarArr, int i10) {
        return (m) U.getObjectVolatile(mVarArr, (i10 << ASHIFT) + ABASE);
    }

    private static final int tableSizeFor(int i10) {
        int i11 = i10 - 1;
        int i12 = i11 | (i11 >>> 1);
        int i13 = i12 | (i12 >>> 2);
        int i14 = i13 | (i13 >>> 4);
        int i15 = i14 | (i14 >>> 8);
        int i16 = i15 | (i15 >>> 16);
        if (i16 < 0) {
            return 1;
        }
        return i16 >= MAXIMUM_CAPACITY ? MAXIMUM_CAPACITY : 1 + i16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r12v12, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r5v17, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r5v22, types: [j$.util.concurrent.m] */
    private final void transfer(m[] mVarArr, m[] mVarArr2) {
        m[] mVarArr3;
        int i10;
        int i11;
        boolean z10;
        ConcurrentHashMap<K, V> concurrentHashMap;
        h hVar;
        int i12;
        s sVar;
        int i13;
        ConcurrentHashMap<K, V> concurrentHashMap2 = this;
        m[] mVarArr4 = mVarArr;
        int length = mVarArr4.length;
        int i14 = NCPU;
        boolean z11 = true;
        int i15 = i14 > 1 ? (length >>> 3) / i14 : length;
        int i16 = i15 < 16 ? 16 : i15;
        if (mVarArr2 == null) {
            try {
                m[] mVarArr5 = new m[length << 1];
                concurrentHashMap2.nextTable = mVarArr5;
                concurrentHashMap2.transferIndex = length;
                mVarArr3 = mVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap2.sizeCtl = HASH_BITS;
                return;
            }
        } else {
            mVarArr3 = mVarArr2;
        }
        int length2 = mVarArr3.length;
        h hVar2 = new h(mVarArr3);
        boolean z12 = true;
        int i17 = 0;
        int i18 = 0;
        boolean z13 = false;
        while (true) {
            if (z12) {
                int i19 = i18 + MOVED;
                if (i19 >= i17 || z13) {
                    i17 = i17;
                    i18 = i19;
                } else {
                    int i20 = concurrentHashMap2.transferIndex;
                    if (i20 <= 0) {
                        i18 = MOVED;
                    } else {
                        Unsafe unsafe = U;
                        long j10 = TRANSFERINDEX;
                        int i21 = i20 > i16 ? i20 - i16 : 0;
                        int i22 = i17;
                        if (unsafe.compareAndSwapInt(this, j10, i20, i21)) {
                            i18 = i20 + MOVED;
                            i17 = i21;
                        } else {
                            i17 = i22;
                            i18 = i19;
                        }
                    }
                }
                z12 = false;
            } else {
                int i23 = i17;
                s sVar2 = null;
                if (i18 < 0 || i18 >= length || (i12 = i18 + length) >= length2) {
                    i11 = i16;
                    i10 = length2;
                    hVar = hVar2;
                    concurrentHashMap = this;
                    if (z13) {
                        concurrentHashMap.nextTable = null;
                        concurrentHashMap.table = mVarArr3;
                        concurrentHashMap.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    z10 = true;
                    Unsafe unsafe2 = U;
                    long j11 = SIZECTL;
                    int i24 = concurrentHashMap.sizeCtl;
                    int i25 = i18;
                    if (!unsafe2.compareAndSwapInt(this, j11, i24, i24 + MOVED)) {
                        i18 = i25;
                    } else if (i24 + TREEBIN != (resizeStamp(length) << RESIZE_STAMP_SHIFT)) {
                        return;
                    } else {
                        i18 = length;
                        z12 = true;
                        z13 = true;
                    }
                } else {
                    m tabAt = tabAt(mVarArr4, i18);
                    if (tabAt == null) {
                        z12 = casTabAt(mVarArr4, i18, null, hVar2);
                        i11 = i16;
                        i10 = length2;
                        z10 = z11;
                        concurrentHashMap = concurrentHashMap2;
                    } else {
                        int i26 = tabAt.f13314a;
                        if (i26 == MOVED) {
                            z12 = z11;
                            i11 = i16;
                            i10 = length2;
                            concurrentHashMap = concurrentHashMap2;
                            z10 = z12;
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(mVarArr4, i18) == tabAt) {
                                    if (i26 >= 0) {
                                        int i27 = i26 & length;
                                        s sVar3 = tabAt;
                                        for (s sVar4 = tabAt.f13317d; sVar4 != null; sVar4 = sVar4.f13317d) {
                                            int i28 = sVar4.f13314a & length;
                                            if (i28 != i27) {
                                                sVar3 = sVar4;
                                                i27 = i28;
                                            }
                                        }
                                        if (i27 == 0) {
                                            sVar = null;
                                            sVar2 = sVar3;
                                        } else {
                                            sVar = sVar3;
                                        }
                                        m mVar = tabAt;
                                        while (mVar != sVar3) {
                                            int i29 = mVar.f13314a;
                                            Object obj = mVar.f13315b;
                                            int i30 = i16;
                                            Object obj2 = mVar.f13316c;
                                            if ((i29 & length) == 0) {
                                                i13 = length2;
                                                sVar2 = new m(i29, obj, obj2, sVar2);
                                            } else {
                                                i13 = length2;
                                                sVar = new m(i29, obj, obj2, sVar);
                                            }
                                            mVar = mVar.f13317d;
                                            i16 = i30;
                                            length2 = i13;
                                        }
                                        i11 = i16;
                                        i10 = length2;
                                        setTabAt(mVarArr3, i18, sVar2);
                                        setTabAt(mVarArr3, i12, sVar);
                                        setTabAt(mVarArr4, i18, hVar2);
                                        hVar = hVar2;
                                    } else {
                                        i11 = i16;
                                        i10 = length2;
                                        if (tabAt instanceof r) {
                                            r rVar = (r) tabAt;
                                            s sVar5 = null;
                                            s sVar6 = null;
                                            m mVar2 = rVar.f13333f;
                                            int i31 = 0;
                                            int i32 = 0;
                                            s sVar7 = null;
                                            while (mVar2 != null) {
                                                r rVar2 = rVar;
                                                int i33 = mVar2.f13314a;
                                                h hVar3 = hVar2;
                                                s sVar8 = new s(i33, mVar2.f13315b, mVar2.f13316c, null, null);
                                                if ((i33 & length) == 0) {
                                                    sVar8.f13338h = sVar6;
                                                    if (sVar6 == null) {
                                                        sVar2 = sVar8;
                                                    } else {
                                                        sVar6.f13317d = sVar8;
                                                    }
                                                    i31++;
                                                    sVar6 = sVar8;
                                                } else {
                                                    sVar8.f13338h = sVar5;
                                                    if (sVar5 == null) {
                                                        sVar7 = sVar8;
                                                    } else {
                                                        sVar5.f13317d = sVar8;
                                                    }
                                                    i32++;
                                                    sVar5 = sVar8;
                                                }
                                                mVar2 = mVar2.f13317d;
                                                rVar = rVar2;
                                                hVar2 = hVar3;
                                            }
                                            r rVar3 = rVar;
                                            h hVar4 = hVar2;
                                            m untreeify = i31 <= 6 ? untreeify(sVar2) : i32 != 0 ? new r(sVar2) : rVar3;
                                            m untreeify2 = i32 <= 6 ? untreeify(sVar7) : i31 != 0 ? new r(sVar7) : rVar3;
                                            setTabAt(mVarArr3, i18, untreeify);
                                            setTabAt(mVarArr3, i12, untreeify2);
                                            mVarArr4 = mVarArr;
                                            hVar = hVar4;
                                            setTabAt(mVarArr4, i18, hVar);
                                        }
                                    }
                                    z12 = true;
                                } else {
                                    i11 = i16;
                                    i10 = length2;
                                }
                                hVar = hVar2;
                            }
                            concurrentHashMap = this;
                            z10 = true;
                        }
                    }
                    hVar = hVar2;
                }
                hVar2 = hVar;
                concurrentHashMap2 = concurrentHashMap;
                z11 = z10;
                i17 = i23;
                i16 = i11;
                length2 = i10;
            }
        }
    }

    private final void treeifyBin(m[] mVarArr, int i10) {
        if (mVarArr != null) {
            int length = mVarArr.length;
            if (length < 64) {
                tryPresize(length << 1);
                return;
            }
            m tabAt = tabAt(mVarArr, i10);
            if (tabAt == null || tabAt.f13314a < 0) {
                return;
            }
            synchronized (tabAt) {
                if (tabAt(mVarArr, i10) == tabAt) {
                    s sVar = null;
                    m mVar = tabAt;
                    s sVar2 = null;
                    while (mVar != null) {
                        s sVar3 = new s(mVar.f13314a, mVar.f13315b, mVar.f13316c, null, null);
                        sVar3.f13338h = sVar2;
                        if (sVar2 == null) {
                            sVar = sVar3;
                        } else {
                            sVar2.f13317d = sVar3;
                        }
                        mVar = mVar.f13317d;
                        sVar2 = sVar3;
                    }
                    setTabAt(mVarArr, i10, new r(sVar));
                }
            }
        }
    }

    private final void tryPresize(int i10) {
        int length;
        m[] mVarArr;
        int tableSizeFor = i10 >= 536870912 ? MAXIMUM_CAPACITY : tableSizeFor(i10 + (i10 >>> 1) + 1);
        while (true) {
            int i11 = this.sizeCtl;
            if (i11 >= 0) {
                m[] mVarArr2 = this.table;
                if (mVarArr2 == null || (length = mVarArr2.length) == 0) {
                    int i12 = i11 > tableSizeFor ? i11 : tableSizeFor;
                    if (U.compareAndSwapInt(this, SIZECTL, i11, (int) MOVED)) {
                        try {
                            if (this.table == mVarArr2) {
                                this.table = new m[i12];
                                i11 = i12 - (i12 >>> 2);
                            }
                        } finally {
                            this.sizeCtl = i11;
                        }
                    } else {
                        continue;
                    }
                } else if (tableSizeFor <= i11 || length >= MAXIMUM_CAPACITY) {
                    return;
                } else {
                    if (mVarArr2 == this.table) {
                        int resizeStamp = resizeStamp(length);
                        if (i11 < 0) {
                            if ((i11 >>> RESIZE_STAMP_SHIFT) != resizeStamp || i11 == resizeStamp + 1 || i11 == resizeStamp + MAX_RESIZERS || (mVarArr = this.nextTable) == null || this.transferIndex <= 0) {
                                return;
                            }
                            if (U.compareAndSwapInt(this, SIZECTL, i11, i11 + 1)) {
                                transfer(mVarArr2, mVarArr);
                            }
                        } else if (U.compareAndSwapInt(this, SIZECTL, i11, (resizeStamp << RESIZE_STAMP_SHIFT) + 2)) {
                            transfer(mVarArr2, null);
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                return;
            }
        }
    }

    static <K, V> m untreeify(m mVar) {
        m mVar2 = null;
        m mVar3 = null;
        while (mVar != null) {
            m mVar4 = new m(mVar.f13314a, mVar.f13315b, mVar.f13316c, null);
            if (mVar3 == null) {
                mVar2 = mVar4;
            } else {
                mVar3.f13317d = mVar4;
            }
            mVar = mVar.f13317d;
            mVar3 = mVar4;
        }
        return mVar2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i10 = 1;
        int i11 = 0;
        while (i10 < 16) {
            i11++;
            i10 <<= 1;
        }
        int i12 = 32 - i11;
        int i13 = i10 - 1;
        o[] oVarArr = new o[16];
        for (int i14 = 0; i14 < 16; i14++) {
            oVarArr[i14] = new o();
        }
        objectOutputStream.putFields().put("segments", oVarArr);
        objectOutputStream.putFields().put("segmentShift", i12);
        objectOutputStream.putFields().put("segmentMask", i13);
        objectOutputStream.writeFields();
        m[] mVarArr = this.table;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m a10 = qVar.a();
                if (a10 == null) {
                    break;
                }
                objectOutputStream.writeObject(a10.f13315b);
                objectOutputStream.writeObject(a10.f13316c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public void clear() {
        m[] mVarArr = this.table;
        int i10 = 0;
        long j10 = 0;
        while (mVarArr != null && i10 < mVarArr.length) {
            m tabAt = tabAt(mVarArr, i10);
            if (tabAt == null) {
                i10++;
            } else {
                int i11 = tabAt.f13314a;
                if (i11 == MOVED) {
                    mVarArr = helpTransfer(mVarArr, tabAt);
                    i10 = 0;
                } else {
                    synchronized (tabAt) {
                        if (tabAt(mVarArr, i10) == tabAt) {
                            for (m mVar = i11 >= 0 ? tabAt : tabAt instanceof r ? ((r) tabAt).f13333f : null; mVar != null; mVar = mVar.f13317d) {
                                j10--;
                            }
                            setTabAt(mVarArr, i10, null);
                            i10++;
                        }
                    }
                }
            }
        }
        if (j10 != 0) {
            addCount(j10, MOVED);
        }
    }

    @Override // j$.util.Map
    public V compute(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        int i10;
        m mVar;
        V v10;
        Object obj;
        if (k10 == null || biFunction == null) {
            throw null;
        }
        int spread = spread(k10.hashCode());
        m[] mVarArr = this.table;
        int i11 = 0;
        V v11 = null;
        int i12 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i13 = (length + MOVED) & spread;
                    m tabAt = tabAt(mVarArr, i13);
                    if (tabAt == null) {
                        n nVar = new n();
                        synchronized (nVar) {
                            if (casTabAt(mVarArr, i13, null, nVar)) {
                                V apply = biFunction.apply(k10, null);
                                if (apply != null) {
                                    mVar = new m(spread, k10, apply, null);
                                    i10 = 1;
                                } else {
                                    i10 = i12;
                                    mVar = null;
                                }
                                setTabAt(mVarArr, i13, mVar);
                                i12 = i10;
                                v11 = apply;
                                i11 = 1;
                            }
                        }
                        if (i11 != 0) {
                            break;
                        }
                    } else {
                        int i14 = tabAt.f13314a;
                        if (i14 == MOVED) {
                            mVarArr = helpTransfer(mVarArr, tabAt);
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(mVarArr, i13) == tabAt) {
                                    if (i14 >= 0) {
                                        m mVar2 = null;
                                        m mVar3 = tabAt;
                                        i11 = 1;
                                        while (true) {
                                            if (mVar3.f13314a != spread || ((obj = mVar3.f13315b) != k10 && (obj == null || !k10.equals(obj)))) {
                                                m mVar4 = mVar3.f13317d;
                                                if (mVar4 == null) {
                                                    V apply2 = biFunction.apply(k10, null);
                                                    if (apply2 != null) {
                                                        mVar3.f13317d = new m(spread, k10, apply2, null);
                                                        i12 = 1;
                                                    }
                                                    v10 = apply2;
                                                } else {
                                                    i11++;
                                                    mVar2 = mVar3;
                                                    mVar3 = mVar4;
                                                }
                                            }
                                        }
                                        v10 = biFunction.apply(k10, (Object) mVar3.f13316c);
                                        if (v10 != null) {
                                            mVar3.f13316c = v10;
                                        } else {
                                            m mVar5 = mVar3.f13317d;
                                            if (mVar2 != null) {
                                                mVar2.f13317d = mVar5;
                                            } else {
                                                setTabAt(mVarArr, i13, mVar5);
                                            }
                                            i12 = MOVED;
                                        }
                                        v11 = v10;
                                    } else if (tabAt instanceof r) {
                                        r rVar = (r) tabAt;
                                        s sVar = rVar.f13332e;
                                        s b10 = sVar != null ? sVar.b(spread, k10, null) : null;
                                        V apply3 = biFunction.apply(k10, b10 == null ? (Object) null : (Object) b10.f13316c);
                                        if (apply3 != null) {
                                            if (b10 != null) {
                                                b10.f13316c = apply3;
                                            } else {
                                                rVar.f(spread, k10, apply3);
                                                i11 = 1;
                                                i12 = 1;
                                                v11 = apply3;
                                            }
                                        } else if (b10 != null) {
                                            if (rVar.g(b10)) {
                                                setTabAt(mVarArr, i13, untreeify(rVar.f13333f));
                                            }
                                            i11 = 1;
                                            v11 = apply3;
                                            i12 = MOVED;
                                        }
                                        i11 = 1;
                                        v11 = apply3;
                                    }
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    treeifyBin(mVarArr, i13);
                                }
                            }
                        }
                    }
                }
            }
            mVarArr = initTable();
        }
        if (i12 != 0) {
            addCount(i12, i11);
        }
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute((ConcurrentHashMap<K, V>) obj, (BiFunction<? super ConcurrentHashMap<K, V>, ? super V, ? extends V>) BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public V computeIfAbsent(K k10, Function<? super K, ? extends V> function) {
        s b10;
        Object obj;
        Object obj2;
        if (k10 == null || function == null) {
            throw null;
        }
        int spread = spread(k10.hashCode());
        m[] mVarArr = this.table;
        V v10 = null;
        int i10 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i11 = (length + MOVED) & spread;
                    m tabAt = tabAt(mVarArr, i11);
                    boolean z10 = true;
                    if (tabAt == null) {
                        n nVar = new n();
                        synchronized (nVar) {
                            if (casTabAt(mVarArr, i11, null, nVar)) {
                                V apply = function.apply(k10);
                                setTabAt(mVarArr, i11, apply != null ? new m(spread, k10, apply, null) : null);
                                v10 = apply;
                                i10 = 1;
                            }
                        }
                        if (i10 != 0) {
                            break;
                        }
                    } else {
                        int i12 = tabAt.f13314a;
                        if (i12 == MOVED) {
                            mVarArr = helpTransfer(mVarArr, tabAt);
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(mVarArr, i11) == tabAt) {
                                    if (i12 >= 0) {
                                        m mVar = tabAt;
                                        int i13 = 1;
                                        while (true) {
                                            if (mVar.f13314a != spread || ((obj2 = mVar.f13315b) != k10 && (obj2 == null || !k10.equals(obj2)))) {
                                                m mVar2 = mVar.f13317d;
                                                if (mVar2 == null) {
                                                    Object apply2 = function.apply(k10);
                                                    if (apply2 != null) {
                                                        mVar.f13317d = new m(spread, k10, apply2, null);
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    obj = apply2;
                                                } else {
                                                    i13++;
                                                    mVar = mVar2;
                                                }
                                            }
                                        }
                                        z10 = false;
                                        obj = mVar.f13316c;
                                        int i14 = i13;
                                        v10 = (V) obj;
                                        i10 = i14;
                                    } else if (tabAt instanceof r) {
                                        i10 = 2;
                                        r rVar = (r) tabAt;
                                        s sVar = rVar.f13332e;
                                        if (sVar == null || (b10 = sVar.b(spread, k10, null)) == null) {
                                            V apply3 = function.apply(k10);
                                            if (apply3 != null) {
                                                rVar.f(spread, k10, apply3);
                                            } else {
                                                z10 = false;
                                            }
                                            v10 = apply3;
                                        } else {
                                            v10 = (V) b10.f13316c;
                                        }
                                    }
                                }
                                z10 = false;
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    treeifyBin(mVarArr, i11);
                                }
                                if (!z10) {
                                    return v10;
                                }
                            }
                        }
                    }
                }
            }
            mVarArr = initTable();
        }
        if (v10 != null) {
            addCount(1L, i10);
        }
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent((ConcurrentHashMap<K, V>) obj, (Function<? super ConcurrentHashMap<K, V>, ? extends V>) Function.VivifiedWrapper.convert(function));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
        r5 = r15.apply(r14, (java.lang.Object) r8.f13316c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        r8.f13316c = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        r3 = r8.f13317d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r10 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
        r10.f13317d = r3;
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V computeIfPresent(K r14, j$.util.function.BiFunction<? super K, ? super V, ? extends V> r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto La7
            if (r15 == 0) goto La7
            int r1 = r14.hashCode()
            int r1 = spread(r1)
            j$.util.concurrent.m[] r2 = r13.table
            r3 = 0
            r5 = r0
            r4 = r3
        L12:
            if (r2 == 0) goto La1
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto La1
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.m r7 = tabAt(r2, r6)
            if (r7 != 0) goto L24
            goto L97
        L24:
            int r8 = r7.f13314a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.m[] r2 = r13.helpTransfer(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.m r10 = tabAt(r2, r6)     // Catch: java.lang.Throwable -> L9e
            if (r10 != r7) goto L94
            if (r8 < 0) goto L67
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.f13314a     // Catch: java.lang.Throwable -> L9e
            if (r11 != r1) goto L5c
            java.lang.Object r11 = r8.f13315b     // Catch: java.lang.Throwable -> L9e
            if (r11 == r14) goto L4a
            if (r11 == 0) goto L5c
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L9e
            if (r11 == 0) goto L5c
        L4a:
            java.lang.Object r5 = r8.f13316c     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto L55
            r8.f13316c = r5     // Catch: java.lang.Throwable -> L9e
            goto L94
        L55:
            j$.util.concurrent.m r3 = r8.f13317d     // Catch: java.lang.Throwable -> L9e
            if (r10 == 0) goto L90
            r10.f13317d = r3     // Catch: java.lang.Throwable -> L9e
            goto L93
        L5c:
            j$.util.concurrent.m r10 = r8.f13317d     // Catch: java.lang.Throwable -> L9e
            if (r10 != 0) goto L61
            goto L94
        L61:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L67:
            boolean r8 = r7 instanceof j$.util.concurrent.r     // Catch: java.lang.Throwable -> L9e
            if (r8 == 0) goto L94
            r4 = 2
            r8 = r7
            j$.util.concurrent.r r8 = (j$.util.concurrent.r) r8     // Catch: java.lang.Throwable -> L9e
            j$.util.concurrent.s r10 = r8.f13332e     // Catch: java.lang.Throwable -> L9e
            if (r10 == 0) goto L94
            j$.util.concurrent.s r10 = r10.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L9e
            if (r10 == 0) goto L94
            java.lang.Object r5 = r10.f13316c     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto L84
            r10.f13316c = r5     // Catch: java.lang.Throwable -> L9e
            goto L94
        L84:
            boolean r3 = r8.g(r10)     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto L93
            j$.util.concurrent.s r3 = r8.f13333f     // Catch: java.lang.Throwable -> L9e
            j$.util.concurrent.m r3 = untreeify(r3)     // Catch: java.lang.Throwable -> L9e
        L90:
            setTabAt(r2, r6, r3)     // Catch: java.lang.Throwable -> L9e
        L93:
            r3 = r9
        L94:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9e
            if (r4 == 0) goto L12
        L97:
            if (r3 == 0) goto L9d
            long r14 = (long) r3
            r13.addCount(r14, r4)
        L9d:
            return r5
        L9e:
            r14 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9e
            throw r14
        La1:
            j$.util.concurrent.m[] r2 = r13.initTable()
            goto L12
        La7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent((ConcurrentHashMap<K, V>) obj, (BiFunction<? super ConcurrentHashMap<K, V>, ? super V, ? extends V>) BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsValue(Object obj) {
        Objects.requireNonNull(obj);
        m[] mVarArr = this.table;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m a10 = qVar.a();
                if (a10 == null) {
                    break;
                }
                Object obj2 = a10.f13316c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Enumeration<V> elements() {
        m[] mVarArr = this.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new i(mVarArr, length, length, this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        f fVar = this.entrySet;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        this.entrySet = fVar2;
        return fVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean equals(Object obj) {
        V value;
        V v10;
        if (obj != this) {
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            m[] mVarArr = this.table;
            int length = mVarArr == null ? 0 : mVarArr.length;
            q qVar = new q(mVarArr, length, 0, length);
            while (true) {
                m a10 = qVar.a();
                if (a10 == null) {
                    for (Map.Entry<K, V> entry : map.entrySet()) {
                        K key = entry.getKey();
                        if (key == null || (value = entry.getValue()) == null || (v10 = get(key)) == null || (value != v10 && !value.equals(v10))) {
                            return false;
                        }
                    }
                    return true;
                }
                Object obj2 = a10.f13316c;
                Object obj3 = map.get(a10.f13315b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    @Override // j$.util.concurrent.v, j$.util.Map
    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        Objects.requireNonNull(biConsumer);
        m[] mVarArr = this.table;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m a10 = qVar.a();
                if (a10 == null) {
                    return;
                }
                biConsumer.w(a10.f13315b, a10.f13316c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        return (V) r1.f13316c;
     */
    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = spread(r0)
            j$.util.concurrent.m[] r1 = r4.table
            r2 = 0
            if (r1 == 0) goto L4e
            int r3 = r1.length
            if (r3 <= 0) goto L4e
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.m r1 = tabAt(r1, r3)
            if (r1 == 0) goto L4e
            int r3 = r1.f13314a
            if (r3 != r0) goto L2c
            java.lang.Object r3 = r1.f13315b
            if (r3 == r5) goto L29
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L29:
            java.lang.Object r5 = r1.f13316c
            return r5
        L2c:
            if (r3 >= 0) goto L37
            j$.util.concurrent.m r5 = r1.a(r0, r5)
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.f13316c
        L36:
            return r2
        L37:
            j$.util.concurrent.m r1 = r1.f13317d
            if (r1 == 0) goto L4e
            int r3 = r1.f13314a
            if (r3 != r0) goto L37
            java.lang.Object r3 = r1.f13315b
            if (r3 == r5) goto L4b
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L4b:
            java.lang.Object r5 = r1.f13316c
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 == null ? v10 : v11;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int hashCode() {
        m[] mVarArr = this.table;
        int i10 = 0;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m a10 = qVar.a();
                if (a10 == null) {
                    break;
                }
                i10 += a10.f13316c.hashCode() ^ a10.f13315b.hashCode();
            }
        }
        return i10;
    }

    final m[] helpTransfer(m[] mVarArr, m mVar) {
        m[] mVarArr2;
        int i10;
        if (mVarArr == null || !(mVar instanceof h) || (mVarArr2 = ((h) mVar).f13307e) == null) {
            return this.table;
        }
        int resizeStamp = resizeStamp(mVarArr.length);
        while (true) {
            if (mVarArr2 != this.nextTable || this.table != mVarArr || (i10 = this.sizeCtl) >= 0 || (i10 >>> RESIZE_STAMP_SHIFT) != resizeStamp || i10 == resizeStamp + 1 || i10 == MAX_RESIZERS + resizeStamp || this.transferIndex <= 0) {
                break;
            } else if (U.compareAndSwapInt(this, SIZECTL, i10, i10 + 1)) {
                transfer(mVarArr, mVarArr2);
                break;
            }
        }
        return mVarArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean isEmpty() {
        return sumCount() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set<K> keySet() {
        j jVar = this.keySet;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.keySet = jVar2;
        return jVar2;
    }

    public Enumeration<K> keys() {
        m[] mVarArr = this.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new i(mVarArr, length, length, this, 0);
    }

    public long mappingCount() {
        long sumCount = sumCount();
        if (sumCount < 0) {
            return 0L;
        }
        return sumCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    @Override // j$.util.Map
    public V merge(K k10, V v10, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        int i10;
        V v11;
        Object obj;
        V v12 = v10;
        if (k10 == null || v12 == null || biFunction == null) {
            throw null;
        }
        int spread = spread(k10.hashCode());
        m[] mVarArr = this.table;
        int i11 = 0;
        V v13 = null;
        int i12 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i13 = (length + MOVED) & spread;
                    m tabAt = tabAt(mVarArr, i13);
                    i10 = 1;
                    if (tabAt != null) {
                        int i14 = tabAt.f13314a;
                        if (i14 == MOVED) {
                            mVarArr = helpTransfer(mVarArr, tabAt);
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(mVarArr, i13) == tabAt) {
                                    if (i14 >= 0) {
                                        m mVar = null;
                                        m mVar2 = tabAt;
                                        int i15 = 1;
                                        while (true) {
                                            if (mVar2.f13314a != spread || ((obj = mVar2.f13315b) != k10 && (obj == null || !k10.equals(obj)))) {
                                                m mVar3 = mVar2.f13317d;
                                                if (mVar3 == null) {
                                                    mVar2.f13317d = new m(spread, k10, v12, null);
                                                    i12 = 1;
                                                    v11 = v12;
                                                    break;
                                                }
                                                i15++;
                                                mVar = mVar2;
                                                mVar2 = mVar3;
                                            }
                                        }
                                        v11 = biFunction.apply((Object) mVar2.f13316c, v12);
                                        if (v11 != null) {
                                            mVar2.f13316c = v11;
                                        } else {
                                            m mVar4 = mVar2.f13317d;
                                            if (mVar != null) {
                                                mVar.f13317d = mVar4;
                                            } else {
                                                setTabAt(mVarArr, i13, mVar4);
                                            }
                                            i12 = MOVED;
                                        }
                                        i11 = i15;
                                        v13 = v11;
                                    } else if (tabAt instanceof r) {
                                        i11 = 2;
                                        r rVar = (r) tabAt;
                                        s sVar = rVar.f13332e;
                                        s b10 = sVar == null ? null : sVar.b(spread, k10, null);
                                        V apply = b10 == null ? v12 : biFunction.apply((Object) b10.f13316c, v12);
                                        if (apply != null) {
                                            if (b10 != null) {
                                                b10.f13316c = apply;
                                            } else {
                                                rVar.f(spread, k10, apply);
                                                i12 = 1;
                                            }
                                        } else if (b10 != null) {
                                            if (rVar.g(b10)) {
                                                setTabAt(mVarArr, i13, untreeify(rVar.f13333f));
                                            }
                                            i12 = MOVED;
                                        }
                                        v13 = apply;
                                    }
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    treeifyBin(mVarArr, i13);
                                }
                                i10 = i12;
                                v12 = v13;
                            }
                        }
                    } else if (casTabAt(mVarArr, i13, null, new m(spread, k10, v12, null))) {
                        break;
                    }
                }
            }
            mVarArr = initTable();
        }
        if (i10 != 0) {
            addCount(i10, i11);
        }
        return v12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge((ConcurrentHashMap<K, V>) obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V put(K k10, V v10) {
        return putVal(k10, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        tryPresize(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            putVal(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k10, V v10) {
        return putVal(k10, v10, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r11 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V putVal(K r9, V r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L98
            if (r10 == 0) goto L98
            int r1 = r9.hashCode()
            int r1 = spread(r1)
            r2 = 0
            j$.util.concurrent.m[] r3 = r8.table
        L10:
            if (r3 == 0) goto L92
            int r4 = r3.length
            if (r4 != 0) goto L17
            goto L92
        L17:
            int r4 = r4 + (-1)
            r4 = r4 & r1
            j$.util.concurrent.m r5 = tabAt(r3, r4)
            if (r5 != 0) goto L2c
            j$.util.concurrent.m r5 = new j$.util.concurrent.m
            r5.<init>(r1, r9, r10, r0)
            boolean r4 = casTabAt(r3, r4, r0, r5)
            if (r4 == 0) goto L10
            goto L89
        L2c:
            int r6 = r5.f13314a
            r7 = -1
            if (r6 != r7) goto L36
            j$.util.concurrent.m[] r3 = r8.helpTransfer(r3, r5)
            goto L10
        L36:
            monitor-enter(r5)
            j$.util.concurrent.m r7 = tabAt(r3, r4)     // Catch: java.lang.Throwable -> L8f
            if (r7 != r5) goto L7b
            if (r6 < 0) goto L68
            r2 = 1
            r6 = r5
        L41:
            int r7 = r6.f13314a     // Catch: java.lang.Throwable -> L8f
            if (r7 != r1) goto L58
            java.lang.Object r7 = r6.f13315b     // Catch: java.lang.Throwable -> L8f
            if (r7 == r9) goto L51
            if (r7 == 0) goto L58
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L8f
            if (r7 == 0) goto L58
        L51:
            java.lang.Object r7 = r6.f13316c     // Catch: java.lang.Throwable -> L8f
            if (r11 != 0) goto L7c
        L55:
            r6.f13316c = r10     // Catch: java.lang.Throwable -> L8f
            goto L7c
        L58:
            j$.util.concurrent.m r7 = r6.f13317d     // Catch: java.lang.Throwable -> L8f
            if (r7 != 0) goto L64
            j$.util.concurrent.m r7 = new j$.util.concurrent.m     // Catch: java.lang.Throwable -> L8f
            r7.<init>(r1, r9, r10, r0)     // Catch: java.lang.Throwable -> L8f
            r6.f13317d = r7     // Catch: java.lang.Throwable -> L8f
            goto L7b
        L64:
            int r2 = r2 + 1
            r6 = r7
            goto L41
        L68:
            boolean r6 = r5 instanceof j$.util.concurrent.r     // Catch: java.lang.Throwable -> L8f
            if (r6 == 0) goto L7b
            r2 = 2
            r6 = r5
            j$.util.concurrent.r r6 = (j$.util.concurrent.r) r6     // Catch: java.lang.Throwable -> L8f
            j$.util.concurrent.s r6 = r6.f(r1, r9, r10)     // Catch: java.lang.Throwable -> L8f
            if (r6 == 0) goto L7b
            java.lang.Object r7 = r6.f13316c     // Catch: java.lang.Throwable -> L8f
            if (r11 != 0) goto L7c
            goto L55
        L7b:
            r7 = r0
        L7c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L10
            r9 = 8
            if (r2 < r9) goto L86
            r8.treeifyBin(r3, r4)
        L86:
            if (r7 == 0) goto L89
            return r7
        L89:
            r9 = 1
            r8.addCount(r9, r2)
            return r0
        L8f:
            r9 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8f
            throw r9
        L92:
            j$.util.concurrent.m[] r3 = r8.initTable()
            goto L10
        L98:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.putVal(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V remove(Object obj) {
        return replaceNode(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        Objects.requireNonNull(obj);
        return (obj2 == null || replaceNode(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V replace(K k10, V v10) {
        if (k10 == null || v10 == null) {
            throw null;
        }
        return replaceNode(k10, v10, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean replace(K k10, V v10, V v11) {
        if (k10 == null || v10 == null || v11 == null) {
            throw null;
        }
        return replaceNode(k10, v11, v10) != null;
    }

    @Override // j$.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        Objects.requireNonNull(biFunction);
        m[] mVarArr = this.table;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m a10 = qVar.a();
                if (a10 == null) {
                    return;
                }
                V v10 = (Object) a10.f13316c;
                Object obj = (Object) a10.f13315b;
                do {
                    V apply = biFunction.apply(obj, v10);
                    Objects.requireNonNull(apply);
                    if (replaceNode(obj, apply, v10) == null) {
                        v10 = get(obj);
                    }
                } while (v10 != null);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final V replaceNode(Object obj, V v10, Object obj2) {
        int length;
        int i10;
        m tabAt;
        V v11;
        s b10;
        m untreeify;
        Object obj3;
        int spread = spread(obj.hashCode());
        m[] mVarArr = this.table;
        while (true) {
            if (mVarArr == null || (length = mVarArr.length) == 0 || (tabAt = tabAt(mVarArr, (i10 = (length + MOVED) & spread))) == null) {
                break;
            }
            int i11 = tabAt.f13314a;
            if (i11 == MOVED) {
                mVarArr = helpTransfer(mVarArr, tabAt);
            } else {
                boolean z10 = false;
                synchronized (tabAt) {
                    if (tabAt(mVarArr, i10) == tabAt) {
                        if (i11 >= 0) {
                            m mVar = null;
                            m mVar2 = tabAt;
                            while (true) {
                                if (mVar2.f13314a != spread || ((obj3 = mVar2.f13315b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                    m mVar3 = mVar2.f13317d;
                                    if (mVar3 == null) {
                                        break;
                                    }
                                    mVar = mVar2;
                                    mVar2 = mVar3;
                                }
                            }
                            v11 = (V) mVar2.f13316c;
                            if (obj2 == null || obj2 == v11 || (v11 != null && obj2.equals(v11))) {
                                if (v10 != null) {
                                    mVar2.f13316c = v10;
                                } else if (mVar != null) {
                                    mVar.f13317d = mVar2.f13317d;
                                } else {
                                    untreeify = mVar2.f13317d;
                                    setTabAt(mVarArr, i10, untreeify);
                                }
                                z10 = true;
                            }
                            v11 = null;
                            z10 = true;
                        } else if (tabAt instanceof r) {
                            r rVar = (r) tabAt;
                            s sVar = rVar.f13332e;
                            if (sVar != null && (b10 = sVar.b(spread, obj, null)) != null) {
                                v11 = (V) b10.f13316c;
                                if (obj2 == null || obj2 == v11 || (v11 != null && obj2.equals(v11))) {
                                    if (v10 != null) {
                                        b10.f13316c = v10;
                                    } else if (rVar.g(b10)) {
                                        untreeify = untreeify(rVar.f13333f);
                                        setTabAt(mVarArr, i10, untreeify);
                                    }
                                    z10 = true;
                                }
                            }
                            v11 = null;
                            z10 = true;
                        }
                    }
                    v11 = null;
                }
                if (z10) {
                    if (v11 != null) {
                        if (v10 == null) {
                            addCount(-1L, MOVED);
                        }
                        return v11;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int size() {
        long sumCount = sumCount();
        if (sumCount < 0) {
            return 0;
        }
        return sumCount > 2147483647L ? HASH_BITS : (int) sumCount;
    }

    public final long sumCount() {
        d[] dVarArr = this.counterCells;
        long j10 = this.baseCount;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    j10 += dVar.value;
                }
            }
        }
        return j10;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        m[] mVarArr = this.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        q qVar = new q(mVarArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        m a10 = qVar.a();
        if (a10 != null) {
            while (true) {
                Object obj = a10.f13315b;
                Object obj2 = a10.f13316c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                a10 = qVar.a();
                if (a10 == null) {
                    break;
                }
                sb2.append(',');
                sb2.append(' ');
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Collection<V> values() {
        t tVar = this.values;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this);
        this.values = tVar2;
        return tVar2;
    }
}
