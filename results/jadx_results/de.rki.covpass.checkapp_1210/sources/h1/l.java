package h1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class l implements m1.j, m1.i {
    static final TreeMap<Integer, l> X3 = new TreeMap<>();
    private final int[] U3;
    final int V3;
    int W3;

    /* renamed from: c */
    private volatile String f11153c;

    /* renamed from: d */
    final long[] f11154d;

    /* renamed from: q */
    final double[] f11155q;

    /* renamed from: x */
    final String[] f11156x;

    /* renamed from: y */
    final byte[][] f11157y;

    private l(int i10) {
        this.V3 = i10;
        int i11 = i10 + 1;
        this.U3 = new int[i11];
        this.f11154d = new long[i11];
        this.f11155q = new double[i11];
        this.f11156x = new String[i11];
        this.f11157y = new byte[i11];
    }

    public static l f(String str, int i10) {
        TreeMap<Integer, l> treeMap = X3;
        synchronized (treeMap) {
            Map.Entry<Integer, l> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry == null) {
                l lVar = new l(i10);
                lVar.h(str, i10);
                return lVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            l value = ceilingEntry.getValue();
            value.h(str, i10);
            return value;
        }
    }

    private static void i() {
        TreeMap<Integer, l> treeMap = X3;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }
    }

    @Override // m1.i
    public void A0(int i10, long j10) {
        this.U3[i10] = 2;
        this.f11154d[i10] = j10;
    }

    @Override // m1.i
    public void K(int i10, String str) {
        this.U3[i10] = 4;
        this.f11156x[i10] = str;
    }

    @Override // m1.i
    public void L0(int i10, byte[] bArr) {
        this.U3[i10] = 5;
        this.f11157y[i10] = bArr;
    }

    @Override // m1.i
    public void a0(int i10) {
        this.U3[i10] = 1;
    }

    @Override // m1.j
    public void b(m1.i iVar) {
        for (int i10 = 1; i10 <= this.W3; i10++) {
            int i11 = this.U3[i10];
            if (i11 == 1) {
                iVar.a0(i10);
            } else if (i11 == 2) {
                iVar.A0(i10, this.f11154d[i10]);
            } else if (i11 == 3) {
                iVar.d0(i10, this.f11155q[i10]);
            } else if (i11 == 4) {
                iVar.K(i10, this.f11156x[i10]);
            } else if (i11 == 5) {
                iVar.L0(i10, this.f11157y[i10]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // m1.i
    public void d0(int i10, double d10) {
        this.U3[i10] = 3;
        this.f11155q[i10] = d10;
    }

    @Override // m1.j
    public String e() {
        return this.f11153c;
    }

    void h(String str, int i10) {
        this.f11153c = str;
        this.W3 = i10;
    }

    public void j() {
        TreeMap<Integer, l> treeMap = X3;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.V3), this);
            i();
        }
    }
}
