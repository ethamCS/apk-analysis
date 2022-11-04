package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class m implements b.o.a.e, b.o.a.d {
    static final TreeMap<Integer, m> j = new TreeMap<>();

    /* renamed from: b */
    private volatile String f1907b;

    /* renamed from: c */
    final long[] f1908c;

    /* renamed from: d */
    final double[] f1909d;

    /* renamed from: e */
    final String[] f1910e;

    /* renamed from: f */
    final byte[][] f1911f;

    /* renamed from: g */
    private final int[] f1912g;

    /* renamed from: h */
    final int f1913h;
    int i;

    private m(int i) {
        this.f1913h = i;
        int i2 = i + 1;
        this.f1912g = new int[i2];
        this.f1908c = new long[i2];
        this.f1909d = new double[i2];
        this.f1910e = new String[i2];
        this.f1911f = new byte[i2];
    }

    private static void N() {
        TreeMap<Integer, m> treeMap = j;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i;
            }
        }
    }

    public static m k(String str, int i) {
        TreeMap<Integer, m> treeMap = j;
        synchronized (treeMap) {
            Map.Entry<Integer, m> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry == null) {
                m mVar = new m(i);
                mVar.I(str, i);
                return mVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            m value = ceilingEntry.getValue();
            value.I(str, i);
            return value;
        }
    }

    @Override // b.o.a.d
    public void H(int i, byte[] bArr) {
        this.f1912g[i] = 5;
        this.f1911f[i] = bArr;
    }

    void I(String str, int i) {
        this.f1907b = str;
        this.i = i;
    }

    @Override // b.o.a.d
    public void J(int i) {
        this.f1912g[i] = 1;
    }

    @Override // b.o.a.d
    public void L(int i, double d2) {
        this.f1912g[i] = 3;
        this.f1909d[i] = d2;
    }

    @Override // b.o.a.e
    public String a() {
        return this.f1907b;
    }

    @Override // b.o.a.e
    public void c(b.o.a.d dVar) {
        for (int i = 1; i <= this.i; i++) {
            int i2 = this.f1912g[i];
            if (i2 == 1) {
                dVar.J(i);
            } else if (i2 == 2) {
                dVar.x(i, this.f1908c[i]);
            } else if (i2 == 3) {
                dVar.L(i, this.f1909d[i]);
            } else if (i2 == 4) {
                dVar.v(i, this.f1910e[i]);
            } else if (i2 == 5) {
                dVar.H(i, this.f1911f[i]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void f0() {
        TreeMap<Integer, m> treeMap = j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f1913h), this);
            N();
        }
    }

    @Override // b.o.a.d
    public void v(int i, String str) {
        this.f1912g[i] = 4;
        this.f1910e[i] = str;
    }

    @Override // b.o.a.d
    public void x(int i, long j2) {
        this.f1912g[i] = 2;
        this.f1908c[i] = j2;
    }
}
