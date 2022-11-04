package androidx.camera.camera2.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w.h2;
/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: q */
    private static final Size f1855q = new Size(640, 480);

    /* renamed from: r */
    private static final Size f1856r = new Size(0, 0);

    /* renamed from: s */
    private static final Size f1857s = new Size(1920, 1080);

    /* renamed from: t */
    private static final Size f1858t = new Size(720, 480);

    /* renamed from: u */
    private static final Rational f1859u = new Rational(4, 3);

    /* renamed from: v */
    private static final Rational f1860v = new Rational(3, 4);

    /* renamed from: w */
    private static final Rational f1861w = new Rational(16, 9);

    /* renamed from: x */
    private static final Rational f1862x = new Rational(9, 16);

    /* renamed from: c */
    private final String f1865c;

    /* renamed from: d */
    private final c f1866d;

    /* renamed from: e */
    private final r.z f1867e;

    /* renamed from: f */
    private final u.d f1868f;

    /* renamed from: h */
    private final int f1870h;

    /* renamed from: i */
    private final boolean f1871i;

    /* renamed from: m */
    private w.i2 f1875m;

    /* renamed from: o */
    private final v1 f1877o;

    /* renamed from: a */
    private final List<w.g2> f1863a = new ArrayList();

    /* renamed from: b */
    private final Map<Integer, Size> f1864b = new HashMap();

    /* renamed from: j */
    private final Map<Integer, List<Size>> f1872j = new HashMap();

    /* renamed from: k */
    private boolean f1873k = false;

    /* renamed from: l */
    private boolean f1874l = false;

    /* renamed from: n */
    private Map<Integer, Size[]> f1876n = new HashMap();

    /* renamed from: p */
    private final u.n f1878p = new u.n();

    /* renamed from: g */
    private final u.e f1869g = new u.e();

    /* loaded from: classes.dex */
    public static final class a implements Comparator<Rational> {

        /* renamed from: c */
        private Rational f1879c;

        a(Rational rational) {
            this.f1879c = rational;
        }

        /* renamed from: a */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            return (int) Math.signum(Float.valueOf(Math.abs(rational.floatValue() - this.f1879c.floatValue())).floatValue() - Float.valueOf(Math.abs(rational2.floatValue() - this.f1879c.floatValue())).floatValue());
        }
    }

    public n2(Context context, String str, r.m0 m0Var, c cVar) {
        String str2 = (String) androidx.core.util.h.g(str);
        this.f1865c = str2;
        this.f1866d = (c) androidx.core.util.h.g(cVar);
        this.f1868f = new u.d(str);
        this.f1877o = v1.b(context);
        try {
            r.z c10 = m0Var.c(str2);
            this.f1867e = c10;
            Integer num = (Integer) c10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f1870h = num != null ? num.intValue() : 2;
            this.f1871i = H();
            h();
            i();
            a();
        } catch (r.f e10) {
            throw j1.a(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r4.f1871i != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r4.f1871i != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        if (r4.f1871i != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        r5 = androidx.camera.camera2.internal.n2.f1861w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
        r5 = androidx.camera.camera2.internal.n2.f1862x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        if (r4.f1871i != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
        r5 = androidx.camera.camera2.internal.n2.f1859u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        r5 = androidx.camera.camera2.internal.n2.f1860v;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Rational A(w.f1 r5) {
        /*
            r4 = this;
            u.q r0 = new u.q
            r0.<init>()
            java.lang.String r1 = r4.f1865c
            r.z r2 = r4.f1867e
            int r0 = r0.a(r1, r2)
            r1 = 0
            if (r0 == 0) goto L7e
            r2 = 1
            if (r0 == r2) goto L74
            r3 = 2
            if (r0 == r3) goto L60
            r3 = 3
            if (r0 == r3) goto L1b
            goto L88
        L1b:
            android.util.Size r0 = r4.B(r5)
            boolean r3 = r5.m()
            if (r3 == 0) goto L50
            int r5 = r5.o()
            if (r5 == 0) goto L49
            if (r5 == r2) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Undefined target aspect ratio: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "SupportedSurfaceCombination"
            androidx.camera.core.s1.c(r0, r5)
            goto L88
        L44:
            boolean r5 = r4.f1871i
            if (r5 == 0) goto L7b
            goto L78
        L49:
            boolean r5 = r4.f1871i
            if (r5 == 0) goto L85
            goto L82
        L4e:
            r1 = r5
            goto L88
        L50:
            if (r0 == 0) goto L88
            android.util.Rational r1 = new android.util.Rational
            int r5 = r0.getWidth()
            int r0 = r0.getHeight()
            r1.<init>(r5, r0)
            goto L88
        L60:
            r5 = 256(0x100, float:3.59E-43)
            android.util.Size r5 = r4.f(r5)
            android.util.Rational r1 = new android.util.Rational
            int r0 = r5.getWidth()
            int r5 = r5.getHeight()
            r1.<init>(r0, r5)
            goto L88
        L74:
            boolean r5 = r4.f1871i
            if (r5 == 0) goto L7b
        L78:
            android.util.Rational r5 = androidx.camera.camera2.internal.n2.f1861w
            goto L4e
        L7b:
            android.util.Rational r5 = androidx.camera.camera2.internal.n2.f1862x
            goto L4e
        L7e:
            boolean r5 = r4.f1871i
            if (r5 == 0) goto L85
        L82:
            android.util.Rational r5 = androidx.camera.camera2.internal.n2.f1859u
            goto L4e
        L85:
            android.util.Rational r5 = androidx.camera.camera2.internal.n2.f1860v
            goto L4e
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.n2.A(w.f1):android.util.Rational");
    }

    private Size B(w.f1 f1Var) {
        return g(f1Var.z(null), f1Var.E(0));
    }

    private List<Integer> C(List<w.o2<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        for (w.o2<?> o2Var : list) {
            int n10 = o2Var.n(0);
            if (!arrayList2.contains(Integer.valueOf(n10))) {
                arrayList2.add(Integer.valueOf(n10));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        for (Integer num : arrayList2) {
            int intValue = num.intValue();
            for (w.o2<?> o2Var2 : list) {
                if (intValue == o2Var2.n(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(o2Var2)));
                }
            }
        }
        return arrayList;
    }

    private Map<Rational, List<Size>> D(List<Size> list) {
        HashMap hashMap = new HashMap();
        hashMap.put(f1859u, new ArrayList());
        hashMap.put(f1861w, new ArrayList());
        for (Size size : list) {
            Rational rational = null;
            for (Rational rational2 : hashMap.keySet()) {
                if (E(size, rational2)) {
                    List list2 = (List) hashMap.get(rational2);
                    if (!list2.contains(size)) {
                        list2.add(size);
                    }
                    rational = rational2;
                }
            }
            if (rational == null) {
                hashMap.put(new Rational(size.getWidth(), size.getHeight()), new ArrayList(Collections.singleton(size)));
            }
        }
        return hashMap;
    }

    static boolean E(Size size, Rational rational) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (l(size) < l(f1855q)) {
            return false;
        }
        return F(size, rational);
    }

    private static boolean F(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i10 = width % 16;
        if (i10 == 0 && height % 16 == 0) {
            return I(Math.max(0, height + (-16)), width, rational) || I(Math.max(0, width + (-16)), height, rational2);
        } else if (i10 == 0) {
            return I(height, width, rational);
        } else {
            if (height % 16 != 0) {
                return false;
            }
            return I(width, height, rational2);
        }
    }

    private boolean G(int i10) {
        Integer num = (Integer) this.f1867e.a(CameraCharacteristics.SENSOR_ORIENTATION);
        androidx.core.util.h.h(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
        int b10 = androidx.camera.core.impl.utils.b.b(i10);
        Integer num2 = (Integer) this.f1867e.a(CameraCharacteristics.LENS_FACING);
        androidx.core.util.h.h(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
        int a10 = androidx.camera.core.impl.utils.b.a(b10, num.intValue(), 1 == num2.intValue());
        return a10 == 90 || a10 == 270;
    }

    private boolean H() {
        Size size = (Size) this.f1867e.a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        return size == null || size.getWidth() >= size.getHeight();
    }

    private static boolean I(int i10, int i11, Rational rational) {
        androidx.core.util.h.a(i11 % 16 == 0);
        double numerator = (i10 * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i11 + (-16))) && numerator < ((double) (i11 + 16));
    }

    private void J() {
        this.f1877o.e();
        if (this.f1875m == null) {
            i();
            return;
        }
        this.f1875m = w.i2.a(this.f1875m.b(), this.f1877o.d(), this.f1875m.d());
    }

    private void K(List<Size> list, Size size) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i10 = -1;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            int i12 = i11;
            int i13 = i10;
            i10 = i12;
            if (i10 >= list.size()) {
                break;
            }
            Size size2 = list.get(i10);
            if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                break;
            }
            if (i13 >= 0) {
                arrayList.add(list.get(i13));
            }
            i11 = i10 + 1;
        }
        list.removeAll(arrayList);
    }

    private void a() {
    }

    private Size[] c(int i10) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f1867e.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(i10);
            if (outputSizes != null) {
                Size[] d10 = d(outputSizes, i10);
                Arrays.sort(d10, new androidx.camera.core.impl.utils.c(true));
                return d10;
            }
            throw new IllegalArgumentException("Can not get supported output size for the format: " + i10);
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    private Size[] d(Size[] sizeArr, int i10) {
        List<Size> e10 = e(i10);
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        arrayList.removeAll(e10);
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    private List<Size> e(int i10) {
        List<Size> list = this.f1872j.get(Integer.valueOf(i10));
        if (list == null) {
            List<Size> a10 = this.f1868f.a(i10);
            this.f1872j.put(Integer.valueOf(i10), a10);
            return a10;
        }
        return list;
    }

    private Size f(int i10) {
        Size size = this.f1864b.get(Integer.valueOf(i10));
        if (size != null) {
            return size;
        }
        Size t10 = t(i10);
        this.f1864b.put(Integer.valueOf(i10), t10);
        return t10;
    }

    private Size g(Size size, int i10) {
        return (size == null || !G(i10)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    private void h() {
        this.f1863a.addAll(q());
        int i10 = this.f1870h;
        if (i10 == 0 || i10 == 1 || i10 == 3) {
            this.f1863a.addAll(s());
        }
        int i11 = this.f1870h;
        if (i11 == 1 || i11 == 3) {
            this.f1863a.addAll(p());
        }
        int[] iArr = (int[]) this.f1867e.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i12 : iArr) {
                if (i12 == 3) {
                    this.f1873k = true;
                } else if (i12 == 6) {
                    this.f1874l = true;
                }
            }
        }
        if (this.f1873k) {
            this.f1863a.addAll(u());
        }
        if (this.f1874l && this.f1870h == 0) {
            this.f1863a.addAll(m());
        }
        if (this.f1870h == 3) {
            this.f1863a.addAll(r());
        }
        this.f1863a.addAll(this.f1869g.a(this.f1865c, this.f1870h));
    }

    private void i() {
        this.f1875m = w.i2.a(new Size(640, 480), this.f1877o.d(), v());
    }

    private Size[] j(int i10) {
        Size[] sizeArr = this.f1876n.get(Integer.valueOf(i10));
        if (sizeArr == null) {
            Size[] c10 = c(i10);
            this.f1876n.put(Integer.valueOf(i10), c10);
            return c10;
        }
        return sizeArr;
    }

    private List<List<Size>> k(List<List<Size>> list) {
        int i10 = 1;
        for (List<Size> list2 : list) {
            i10 *= list2.size();
        }
        if (i10 != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new ArrayList());
            }
            int size = i10 / list.get(0).size();
            int i12 = i10;
            for (int i13 = 0; i13 < list.size(); i13++) {
                List<Size> list3 = list.get(i13);
                for (int i14 = 0; i14 < i10; i14++) {
                    ((List) arrayList.get(i14)).add(list3.get((i14 % i12) / size));
                }
                if (i13 < list.size() - 1) {
                    i12 = size;
                    size /= list.get(i13 + 1).size();
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    private static int l(Size size) {
        return size.getWidth() * size.getHeight();
    }

    private h2.b n(int i10) {
        return i10 == 35 ? h2.b.YUV : i10 == 256 ? h2.b.JPEG : i10 == 32 ? h2.b.RAW : h2.b.PRIV;
    }

    private Size[] o(int i10, w.f1 f1Var) {
        Size[] sizeArr = null;
        List<Pair<Integer, Size[]>> l10 = f1Var.l(null);
        if (l10 != null) {
            Iterator<Pair<Integer, Size[]>> it = l10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair<Integer, Size[]> next = it.next();
                if (((Integer) next.first).intValue() == i10) {
                    sizeArr = (Size[]) next.second;
                    break;
                }
            }
        }
        if (sizeArr != null) {
            Size[] d10 = d(sizeArr, i10);
            Arrays.sort(d10, new androidx.camera.core.impl.utils.c(true));
            return d10;
        }
        return sizeArr;
    }

    private Size v() {
        try {
            int parseInt = Integer.parseInt(this.f1865c);
            CamcorderProfile camcorderProfile = null;
            if (this.f1866d.e(parseInt, 1)) {
                camcorderProfile = this.f1866d.d(parseInt, 1);
            }
            return camcorderProfile != null ? new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : w(parseInt);
        } catch (NumberFormatException unused) {
            return x();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Size w(int r4) {
        /*
            r3 = this;
            android.util.Size r0 = androidx.camera.camera2.internal.n2.f1858t
            androidx.camera.camera2.internal.c r1 = r3.f1866d
            r2 = 10
            boolean r1 = r1.e(r4, r2)
            if (r1 == 0) goto L13
        Lc:
            androidx.camera.camera2.internal.c r1 = r3.f1866d
            android.media.CamcorderProfile r4 = r1.d(r4, r2)
            goto L48
        L13:
            androidx.camera.camera2.internal.c r1 = r3.f1866d
            r2 = 8
            boolean r1 = r1.e(r4, r2)
            if (r1 == 0) goto L1e
            goto Lc
        L1e:
            androidx.camera.camera2.internal.c r1 = r3.f1866d
            r2 = 12
            boolean r1 = r1.e(r4, r2)
            if (r1 == 0) goto L29
            goto Lc
        L29:
            androidx.camera.camera2.internal.c r1 = r3.f1866d
            r2 = 6
            boolean r1 = r1.e(r4, r2)
            if (r1 == 0) goto L33
            goto Lc
        L33:
            androidx.camera.camera2.internal.c r1 = r3.f1866d
            r2 = 5
            boolean r1 = r1.e(r4, r2)
            if (r1 == 0) goto L3d
            goto Lc
        L3d:
            androidx.camera.camera2.internal.c r1 = r3.f1866d
            r2 = 4
            boolean r1 = r1.e(r4, r2)
            if (r1 == 0) goto L47
            goto Lc
        L47:
            r4 = 0
        L48:
            if (r4 == 0) goto L53
            android.util.Size r0 = new android.util.Size
            int r1 = r4.videoFrameWidth
            int r4 = r4.videoFrameHeight
            r0.<init>(r1, r4)
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.n2.w(int):android.util.Size");
    }

    private Size x() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f1867e.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                return f1858t;
            }
            Arrays.sort(outputSizes, new androidx.camera.core.impl.utils.c(true));
            for (Size size : outputSizes) {
                int width = size.getWidth();
                Size size2 = f1857s;
                if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                    return size;
                }
            }
            return f1858t;
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    public w.h2 L(int i10, Size size) {
        h2.b n10 = n(i10);
        h2.a aVar = h2.a.NOT_SUPPORT;
        Size f10 = f(i10);
        if (size.getWidth() * size.getHeight() <= this.f1875m.b().getWidth() * this.f1875m.b().getHeight()) {
            aVar = h2.a.ANALYSIS;
        } else if (size.getWidth() * size.getHeight() <= this.f1875m.c().getWidth() * this.f1875m.c().getHeight()) {
            aVar = h2.a.PREVIEW;
        } else if (size.getWidth() * size.getHeight() <= this.f1875m.d().getWidth() * this.f1875m.d().getHeight()) {
            aVar = h2.a.RECORD;
        } else if (size.getWidth() * size.getHeight() <= f10.getWidth() * f10.getHeight()) {
            aVar = h2.a.MAXIMUM;
        }
        return w.h2.a(n10, aVar);
    }

    boolean b(List<w.h2> list) {
        Iterator<w.g2> it = this.f1863a.iterator();
        boolean z10 = false;
        while (it.hasNext() && !(z10 = it.next().d(list))) {
        }
        return z10;
    }

    List<w.g2> m() {
        ArrayList arrayList = new ArrayList();
        w.g2 g2Var = new w.g2();
        h2.b bVar = h2.b.PRIV;
        h2.a aVar = h2.a.PREVIEW;
        g2Var.a(w.h2.a(bVar, aVar));
        h2.a aVar2 = h2.a.MAXIMUM;
        g2Var.a(w.h2.a(bVar, aVar2));
        arrayList.add(g2Var);
        w.g2 g2Var2 = new w.g2();
        g2Var2.a(w.h2.a(bVar, aVar));
        h2.b bVar2 = h2.b.YUV;
        g2Var2.a(w.h2.a(bVar2, aVar2));
        arrayList.add(g2Var2);
        w.g2 g2Var3 = new w.g2();
        g2Var3.a(w.h2.a(bVar2, aVar));
        g2Var3.a(w.h2.a(bVar2, aVar2));
        arrayList.add(g2Var3);
        return arrayList;
    }

    List<w.g2> p() {
        ArrayList arrayList = new ArrayList();
        w.g2 g2Var = new w.g2();
        h2.b bVar = h2.b.PRIV;
        h2.a aVar = h2.a.PREVIEW;
        g2Var.a(w.h2.a(bVar, aVar));
        h2.a aVar2 = h2.a.MAXIMUM;
        g2Var.a(w.h2.a(bVar, aVar2));
        arrayList.add(g2Var);
        w.g2 g2Var2 = new w.g2();
        g2Var2.a(w.h2.a(bVar, aVar));
        h2.b bVar2 = h2.b.YUV;
        g2Var2.a(w.h2.a(bVar2, aVar2));
        arrayList.add(g2Var2);
        w.g2 g2Var3 = new w.g2();
        g2Var3.a(w.h2.a(bVar2, aVar));
        g2Var3.a(w.h2.a(bVar2, aVar2));
        arrayList.add(g2Var3);
        w.g2 g2Var4 = new w.g2();
        g2Var4.a(w.h2.a(bVar, aVar));
        g2Var4.a(w.h2.a(bVar, aVar));
        g2Var4.a(w.h2.a(h2.b.JPEG, aVar2));
        arrayList.add(g2Var4);
        w.g2 g2Var5 = new w.g2();
        h2.a aVar3 = h2.a.ANALYSIS;
        g2Var5.a(w.h2.a(bVar2, aVar3));
        g2Var5.a(w.h2.a(bVar, aVar));
        g2Var5.a(w.h2.a(bVar2, aVar2));
        arrayList.add(g2Var5);
        w.g2 g2Var6 = new w.g2();
        g2Var6.a(w.h2.a(bVar2, aVar3));
        g2Var6.a(w.h2.a(bVar2, aVar));
        g2Var6.a(w.h2.a(bVar2, aVar2));
        arrayList.add(g2Var6);
        return arrayList;
    }

    List<w.g2> q() {
        ArrayList arrayList = new ArrayList();
        w.g2 g2Var = new w.g2();
        h2.b bVar = h2.b.PRIV;
        h2.a aVar = h2.a.MAXIMUM;
        g2Var.a(w.h2.a(bVar, aVar));
        arrayList.add(g2Var);
        w.g2 g2Var2 = new w.g2();
        h2.b bVar2 = h2.b.JPEG;
        g2Var2.a(w.h2.a(bVar2, aVar));
        arrayList.add(g2Var2);
        w.g2 g2Var3 = new w.g2();
        h2.b bVar3 = h2.b.YUV;
        g2Var3.a(w.h2.a(bVar3, aVar));
        arrayList.add(g2Var3);
        w.g2 g2Var4 = new w.g2();
        h2.a aVar2 = h2.a.PREVIEW;
        g2Var4.a(w.h2.a(bVar, aVar2));
        g2Var4.a(w.h2.a(bVar2, aVar));
        arrayList.add(g2Var4);
        w.g2 g2Var5 = new w.g2();
        g2Var5.a(w.h2.a(bVar3, aVar2));
        g2Var5.a(w.h2.a(bVar2, aVar));
        arrayList.add(g2Var5);
        w.g2 g2Var6 = new w.g2();
        g2Var6.a(w.h2.a(bVar, aVar2));
        g2Var6.a(w.h2.a(bVar, aVar2));
        arrayList.add(g2Var6);
        w.g2 g2Var7 = new w.g2();
        g2Var7.a(w.h2.a(bVar, aVar2));
        g2Var7.a(w.h2.a(bVar3, aVar2));
        arrayList.add(g2Var7);
        w.g2 g2Var8 = new w.g2();
        g2Var8.a(w.h2.a(bVar, aVar2));
        g2Var8.a(w.h2.a(bVar3, aVar2));
        g2Var8.a(w.h2.a(bVar2, aVar));
        arrayList.add(g2Var8);
        return arrayList;
    }

    List<w.g2> r() {
        ArrayList arrayList = new ArrayList();
        w.g2 g2Var = new w.g2();
        h2.b bVar = h2.b.PRIV;
        h2.a aVar = h2.a.PREVIEW;
        g2Var.a(w.h2.a(bVar, aVar));
        h2.a aVar2 = h2.a.ANALYSIS;
        g2Var.a(w.h2.a(bVar, aVar2));
        h2.b bVar2 = h2.b.YUV;
        h2.a aVar3 = h2.a.MAXIMUM;
        g2Var.a(w.h2.a(bVar2, aVar3));
        h2.b bVar3 = h2.b.RAW;
        g2Var.a(w.h2.a(bVar3, aVar3));
        arrayList.add(g2Var);
        w.g2 g2Var2 = new w.g2();
        g2Var2.a(w.h2.a(bVar, aVar));
        g2Var2.a(w.h2.a(bVar, aVar2));
        g2Var2.a(w.h2.a(h2.b.JPEG, aVar3));
        g2Var2.a(w.h2.a(bVar3, aVar3));
        arrayList.add(g2Var2);
        return arrayList;
    }

    List<w.g2> s() {
        ArrayList arrayList = new ArrayList();
        w.g2 g2Var = new w.g2();
        h2.b bVar = h2.b.PRIV;
        h2.a aVar = h2.a.PREVIEW;
        g2Var.a(w.h2.a(bVar, aVar));
        h2.a aVar2 = h2.a.RECORD;
        g2Var.a(w.h2.a(bVar, aVar2));
        arrayList.add(g2Var);
        w.g2 g2Var2 = new w.g2();
        g2Var2.a(w.h2.a(bVar, aVar));
        h2.b bVar2 = h2.b.YUV;
        g2Var2.a(w.h2.a(bVar2, aVar2));
        arrayList.add(g2Var2);
        w.g2 g2Var3 = new w.g2();
        g2Var3.a(w.h2.a(bVar2, aVar));
        g2Var3.a(w.h2.a(bVar2, aVar2));
        arrayList.add(g2Var3);
        w.g2 g2Var4 = new w.g2();
        g2Var4.a(w.h2.a(bVar, aVar));
        g2Var4.a(w.h2.a(bVar, aVar2));
        h2.b bVar3 = h2.b.JPEG;
        g2Var4.a(w.h2.a(bVar3, aVar2));
        arrayList.add(g2Var4);
        w.g2 g2Var5 = new w.g2();
        g2Var5.a(w.h2.a(bVar, aVar));
        g2Var5.a(w.h2.a(bVar2, aVar2));
        g2Var5.a(w.h2.a(bVar3, aVar2));
        arrayList.add(g2Var5);
        w.g2 g2Var6 = new w.g2();
        g2Var6.a(w.h2.a(bVar2, aVar));
        g2Var6.a(w.h2.a(bVar2, aVar));
        g2Var6.a(w.h2.a(bVar3, h2.a.MAXIMUM));
        arrayList.add(g2Var6);
        return arrayList;
    }

    Size t(int i10) {
        return (Size) Collections.max(Arrays.asList(j(i10)), new androidx.camera.core.impl.utils.c());
    }

    List<w.g2> u() {
        ArrayList arrayList = new ArrayList();
        w.g2 g2Var = new w.g2();
        h2.b bVar = h2.b.RAW;
        h2.a aVar = h2.a.MAXIMUM;
        g2Var.a(w.h2.a(bVar, aVar));
        arrayList.add(g2Var);
        w.g2 g2Var2 = new w.g2();
        h2.b bVar2 = h2.b.PRIV;
        h2.a aVar2 = h2.a.PREVIEW;
        g2Var2.a(w.h2.a(bVar2, aVar2));
        g2Var2.a(w.h2.a(bVar, aVar));
        arrayList.add(g2Var2);
        w.g2 g2Var3 = new w.g2();
        h2.b bVar3 = h2.b.YUV;
        g2Var3.a(w.h2.a(bVar3, aVar2));
        g2Var3.a(w.h2.a(bVar, aVar));
        arrayList.add(g2Var3);
        w.g2 g2Var4 = new w.g2();
        g2Var4.a(w.h2.a(bVar2, aVar2));
        g2Var4.a(w.h2.a(bVar2, aVar2));
        g2Var4.a(w.h2.a(bVar, aVar));
        arrayList.add(g2Var4);
        w.g2 g2Var5 = new w.g2();
        g2Var5.a(w.h2.a(bVar2, aVar2));
        g2Var5.a(w.h2.a(bVar3, aVar2));
        g2Var5.a(w.h2.a(bVar, aVar));
        arrayList.add(g2Var5);
        w.g2 g2Var6 = new w.g2();
        g2Var6.a(w.h2.a(bVar3, aVar2));
        g2Var6.a(w.h2.a(bVar3, aVar2));
        g2Var6.a(w.h2.a(bVar, aVar));
        arrayList.add(g2Var6);
        w.g2 g2Var7 = new w.g2();
        g2Var7.a(w.h2.a(bVar2, aVar2));
        h2.b bVar4 = h2.b.JPEG;
        g2Var7.a(w.h2.a(bVar4, aVar));
        g2Var7.a(w.h2.a(bVar, aVar));
        arrayList.add(g2Var7);
        w.g2 g2Var8 = new w.g2();
        g2Var8.a(w.h2.a(bVar3, aVar2));
        g2Var8.a(w.h2.a(bVar4, aVar));
        g2Var8.a(w.h2.a(bVar, aVar));
        arrayList.add(g2Var8);
        return arrayList;
    }

    public Map<w.o2<?>, Size> y(List<w.h2> list, List<w.o2<?>> list2) {
        J();
        ArrayList arrayList = new ArrayList(list);
        for (w.o2<?> o2Var : list2) {
            arrayList.add(L(o2Var.q(), new Size(640, 480)));
        }
        if (!b(arrayList)) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f1865c + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + list2);
        }
        List<Integer> C = C(list2);
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : C) {
            arrayList2.add(z(list2.get(num.intValue())));
        }
        HashMap hashMap = null;
        Iterator<List<Size>> it = k(arrayList2).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            List<Size> next = it.next();
            ArrayList arrayList3 = new ArrayList(list);
            for (int i10 = 0; i10 < next.size(); i10++) {
                arrayList3.add(L(list2.get(C.get(i10).intValue()).q(), next.get(i10)));
            }
            if (b(arrayList3)) {
                hashMap = new HashMap();
                for (w.o2<?> o2Var2 : list2) {
                    hashMap.put(o2Var2, next.get(C.indexOf(Integer.valueOf(list2.indexOf(o2Var2)))));
                }
            }
        }
        if (hashMap != null) {
            return hashMap;
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f1865c + " and Hardware level: " + this.f1870h + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
    }

    List<Size> z(w.o2<?> o2Var) {
        int q10 = o2Var.q();
        w.f1 f1Var = (w.f1) o2Var;
        Size[] o10 = o(q10, f1Var);
        if (o10 == null) {
            o10 = j(q10);
        }
        ArrayList arrayList = new ArrayList();
        Size f10 = f1Var.f(null);
        Size t10 = t(q10);
        if (f10 == null || l(t10) < l(f10)) {
            f10 = t10;
        }
        Arrays.sort(o10, new androidx.camera.core.impl.utils.c(true));
        Size B = B(f1Var);
        Size size = f1855q;
        int l10 = l(size);
        if (l(f10) < l10) {
            size = f1856r;
        } else if (B != null && l(B) < l10) {
            size = B;
        }
        for (Size size2 : o10) {
            if (l(size2) <= l(f10) && l(size2) >= l(size) && !arrayList.contains(size2)) {
                arrayList.add(size2);
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Can not get supported output size under supported maximum for the format: " + q10);
        }
        Rational A = A(f1Var);
        if (B == null) {
            B = f1Var.u(null);
        }
        List<Size> arrayList2 = new ArrayList<>();
        new HashMap();
        if (A == null) {
            arrayList2.addAll(arrayList);
            if (B != null) {
                K(arrayList2, B);
            }
        } else {
            Map<Rational, List<Size>> D = D(arrayList);
            if (B != null) {
                for (Rational rational : D.keySet()) {
                    K(D.get(rational), B);
                }
            }
            ArrayList<Rational> arrayList3 = new ArrayList(D.keySet());
            Collections.sort(arrayList3, new a(A));
            for (Rational rational2 : arrayList3) {
                for (Size size3 : D.get(rational2)) {
                    if (!arrayList2.contains(size3)) {
                        arrayList2.add(size3);
                    }
                }
            }
        }
        return this.f1878p.a(n(o2Var.q()), arrayList2);
    }
}
