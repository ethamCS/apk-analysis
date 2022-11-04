package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import b.e.b.k.e;
import b.e.b.k.m.b;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: b */
    SparseArray<View> f732b = new SparseArray<>();

    /* renamed from: c */
    private ArrayList<androidx.constraintlayout.widget.c> f733c = new ArrayList<>(4);

    /* renamed from: d */
    protected b.e.b.k.f f734d = new b.e.b.k.f();

    /* renamed from: e */
    private int f735e = 0;

    /* renamed from: f */
    private int f736f = 0;

    /* renamed from: g */
    private int f737g = Integer.MAX_VALUE;

    /* renamed from: h */
    private int f738h = Integer.MAX_VALUE;
    protected boolean i = true;
    private int j = 257;
    private e k = null;
    protected d l = null;
    private int m = -1;
    private HashMap<String, Integer> n = new HashMap<>();
    private int o = -1;
    private int p = -1;
    private SparseArray<b.e.b.k.e> q = new SparseArray<>();
    c r = new c(this);
    private int s = 0;
    private int t = 0;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f739a;

        static {
            int[] iArr = new int[e.b.values().length];
            f739a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f739a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f739a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f739a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        int C;
        public float D;
        public float E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public float N;
        public float O;
        public int P;
        public int Q;
        public int R;
        public boolean S;
        public boolean T;
        public String U;
        boolean V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;

        /* renamed from: a */
        public int f740a;
        boolean a0;

        /* renamed from: b */
        public int f741b;
        boolean b0;

        /* renamed from: c */
        public float f742c;
        int c0;

        /* renamed from: d */
        public int f743d;
        int d0;

        /* renamed from: e */
        public int f744e;
        int e0;

        /* renamed from: f */
        public int f745f;
        int f0;

        /* renamed from: g */
        public int f746g;
        int g0;

        /* renamed from: h */
        public int f747h;
        int h0;
        public int i;
        float i0;
        public int j;
        int j0;
        public int k;
        int k0;
        public int l;
        float l0;
        public int m;
        b.e.b.k.e m0;
        public int n;
        public boolean n0;
        public float o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            public static final SparseIntArray f748a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f748a = sparseIntArray;
                sparseIntArray.append(j.w1, 8);
                sparseIntArray.append(j.x1, 9);
                sparseIntArray.append(j.z1, 10);
                sparseIntArray.append(j.A1, 11);
                sparseIntArray.append(j.G1, 12);
                sparseIntArray.append(j.F1, 13);
                sparseIntArray.append(j.e1, 14);
                sparseIntArray.append(j.d1, 15);
                sparseIntArray.append(j.b1, 16);
                sparseIntArray.append(j.f1, 2);
                sparseIntArray.append(j.h1, 3);
                sparseIntArray.append(j.g1, 4);
                sparseIntArray.append(j.O1, 49);
                sparseIntArray.append(j.P1, 50);
                sparseIntArray.append(j.l1, 5);
                sparseIntArray.append(j.m1, 6);
                sparseIntArray.append(j.n1, 7);
                sparseIntArray.append(j.K0, 1);
                sparseIntArray.append(j.B1, 17);
                sparseIntArray.append(j.C1, 18);
                sparseIntArray.append(j.k1, 19);
                sparseIntArray.append(j.j1, 20);
                sparseIntArray.append(j.S1, 21);
                sparseIntArray.append(j.V1, 22);
                sparseIntArray.append(j.T1, 23);
                sparseIntArray.append(j.Q1, 24);
                sparseIntArray.append(j.U1, 25);
                sparseIntArray.append(j.R1, 26);
                sparseIntArray.append(j.s1, 29);
                sparseIntArray.append(j.H1, 30);
                sparseIntArray.append(j.i1, 44);
                sparseIntArray.append(j.u1, 45);
                sparseIntArray.append(j.J1, 46);
                sparseIntArray.append(j.t1, 47);
                sparseIntArray.append(j.I1, 48);
                sparseIntArray.append(j.Z0, 27);
                sparseIntArray.append(j.Y0, 28);
                sparseIntArray.append(j.K1, 31);
                sparseIntArray.append(j.o1, 32);
                sparseIntArray.append(j.M1, 33);
                sparseIntArray.append(j.L1, 34);
                sparseIntArray.append(j.N1, 35);
                sparseIntArray.append(j.q1, 36);
                sparseIntArray.append(j.p1, 37);
                sparseIntArray.append(j.r1, 38);
                sparseIntArray.append(j.v1, 39);
                sparseIntArray.append(j.E1, 40);
                sparseIntArray.append(j.y1, 41);
                sparseIntArray.append(j.c1, 42);
                sparseIntArray.append(j.a1, 43);
                f748a.append(j.D1, 51);
            }
        }

        public b(int i, int i2) {
            super(i, i2);
            this.f740a = -1;
            this.f741b = -1;
            this.f742c = -1.0f;
            this.f743d = -1;
            this.f744e = -1;
            this.f745f = -1;
            this.f746g = -1;
            this.f747h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = 0.5f;
            this.m0 = new b.e.b.k.e();
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i;
            this.f740a = -1;
            this.f741b = -1;
            this.f742c = -1.0f;
            this.f743d = -1;
            this.f744e = -1;
            this.f745f = -1;
            this.f746g = -1;
            this.f747h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = 0.5f;
            this.m0 = new b.e.b.k.e();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.J0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = a.f748a.get(index);
                switch (i3) {
                    case 1:
                        this.R = obtainStyledAttributes.getInt(index, this.R);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId;
                        if (resourceId == -1) {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        continue;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f2;
                        if (f2 < 0.0f) {
                            this.o = (360.0f - f2) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f740a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f740a);
                        continue;
                    case 6:
                        this.f741b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f741b);
                        continue;
                    case 7:
                        this.f742c = obtainStyledAttributes.getFloat(index, this.f742c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f743d);
                        this.f743d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f743d = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f744e);
                        this.f744e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f744e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f745f);
                        this.f745f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f745f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f746g);
                        this.f746g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f746g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f747h);
                        this.f747h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f747h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId7;
                        if (resourceId7 == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        continue;
                    case 22:
                        this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        continue;
                    case 23:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        continue;
                    case 24:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        continue;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        continue;
                    case 26:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        continue;
                    case 27:
                        this.S = obtainStyledAttributes.getBoolean(index, this.S);
                        continue;
                    case 28:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                    case 29:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        continue;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        continue;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.H = i4;
                        if (i4 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.I = i5;
                        if (i5 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.J) == -2) {
                                this.J = -2;
                            }
                        }
                    case 34:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                    case 35:
                        this.N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.N));
                        this.H = 2;
                        continue;
                    case 36:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                    case 37:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                    case 38:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        continue;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.C = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                        String substring2 = this.B.substring(i);
                                        if (substring2.length() > 0) {
                                            Float.parseFloat(substring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String substring3 = this.B.substring(i, indexOf2);
                                        String substring4 = this.B.substring(indexOf2 + 1);
                                        if (substring3.length() > 0 && substring4.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring3);
                                                float parseFloat2 = Float.parseFloat(substring4);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.C == 1) {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                continue;
                            case 46:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                continue;
                            case 47:
                                this.F = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.P = obtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                                continue;
                            case 50:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                continue;
                            case 51:
                                this.U = obtainStyledAttributes.getString(index);
                                continue;
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f740a = -1;
            this.f741b = -1;
            this.f742c = -1.0f;
            this.f743d = -1;
            this.f744e = -1;
            this.f745f = -1;
            this.f746g = -1;
            this.f747h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = 0.5f;
            this.m0 = new b.e.b.k.e();
        }

        public void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.S) {
                this.V = false;
                if (this.H == 0) {
                    this.H = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.V = false;
                if (i == 0 && this.H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.S = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.W = false;
                if (i2 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.T = true;
                }
            }
            if (this.f742c == -1.0f && this.f740a == -1 && this.f741b == -1) {
                return;
            }
            this.Y = true;
            this.V = true;
            this.W = true;
            if (!(this.m0 instanceof b.e.b.k.g)) {
                this.m0 = new b.e.b.k.g();
            }
            ((b.e.b.k.g) this.m0).j1(this.R);
        }

        /* JADX WARN: Code restructure failed: missing block: B:74:0x00d4, code lost:
            if (r1 > 0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00d6, code lost:
            ((android.view.ViewGroup.MarginLayoutParams) r9).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x00e3, code lost:
            if (r1 > 0) goto L75;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }
    }

    /* loaded from: classes.dex */
    public class c implements b.AbstractC0041b {

        /* renamed from: a */
        ConstraintLayout f749a;

        /* renamed from: b */
        int f750b;

        /* renamed from: c */
        int f751c;

        /* renamed from: d */
        int f752d;

        /* renamed from: e */
        int f753e;

        /* renamed from: f */
        int f754f;

        /* renamed from: g */
        int f755g;

        public c(ConstraintLayout constraintLayout) {
            ConstraintLayout.this = r1;
            this.f749a = constraintLayout;
        }

        private boolean d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                return false;
            }
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }

        /* JADX WARN: Removed duplicated region for block: B:109:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x01da A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0125  */
        @Override // b.e.b.k.m.b.AbstractC0041b
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(b.e.b.k.e r18, b.e.b.k.m.b.a r19) {
            /*
                Method dump skipped, instructions count: 713
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.a(b.e.b.k.e, b.e.b.k.m.b$a):void");
        }

        @Override // b.e.b.k.m.b.AbstractC0041b
        public final void b() {
            int childCount = this.f749a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f749a.getChildAt(i);
                if (childAt instanceof h) {
                    ((h) childAt).a(this.f749a);
                }
            }
            int size = this.f749a.f733c.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.c) this.f749a.f733c.get(i2)).k(this.f749a);
                }
            }
        }

        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f750b = i3;
            this.f751c = i4;
            this.f752d = i5;
            this.f753e = i6;
            this.f754f = i;
            this.f755g = i2;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j(attributeSet, 0, 0);
    }

    private final b.e.b.k.e g(int i) {
        if (i == 0) {
            return this.f734d;
        }
        View view = this.f732b.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f734d;
        }
        if (view != null) {
            return ((b) view.getLayoutParams()).m0;
        }
        return null;
    }

    private int getPaddingWidth() {
        int i = 0;
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        if (Build.VERSION.SDK_INT >= 17) {
            i = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        }
        return i > 0 ? i : max;
    }

    private void j(AttributeSet attributeSet, int i, int i2) {
        this.f734d.l0(this);
        this.f734d.D1(this.r);
        this.f732b.put(getId(), this);
        this.k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.J0, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == j.O0) {
                    this.f735e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f735e);
                } else if (index == j.P0) {
                    this.f736f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f736f);
                } else if (index == j.M0) {
                    this.f737g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f737g);
                } else if (index == j.N0) {
                    this.f738h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f738h);
                } else if (index == j.W1) {
                    this.j = obtainStyledAttributes.getInt(index, this.j);
                } else if (index == j.X0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.l = null;
                        }
                    }
                } else if (index == j.U0) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.k = eVar;
                        eVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.k = null;
                    }
                    this.m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f734d.E1(this.j);
    }

    private void l() {
        this.i = true;
        this.o = -1;
        this.p = -1;
    }

    private void p() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            b.e.b.k.e i2 = i(getChildAt(i));
            if (i2 != null) {
                i2.h0();
            }
        }
        if (isInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    g(childAt.getId()).m0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.m != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2.getId() == this.m && (childAt2 instanceof f)) {
                    this.k = ((f) childAt2).getConstraintSet();
                }
            }
        }
        e eVar = this.k;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.f734d.d1();
        int size = this.f733c.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.f733c.get(i5).m(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt3 = getChildAt(i6);
            if (childAt3 instanceof h) {
                ((h) childAt3).b(this);
            }
        }
        this.q.clear();
        this.q.put(0, this.f734d);
        this.q.put(getId(), this.f734d);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            this.q.put(childAt4.getId(), i(childAt4));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt5 = getChildAt(i8);
            b.e.b.k.e i9 = i(childAt5);
            if (i9 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f734d.a(i9);
                c(isInEditMode, childAt5, i9, bVar, this.q);
            }
        }
    }

    private boolean s() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            p();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void c(boolean r20, android.view.View r21, b.e.b.k.e r22, androidx.constraintlayout.widget.ConstraintLayout.b r23, android.util.SparseArray<b.e.b.k.e> r24) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c(boolean, android.view.View, b.e.b.k.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* renamed from: d */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.c> arrayList = this.f733c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f733c.get(i).l(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i3;
                        float f3 = i4;
                        float f4 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.n;
        if (hashMap != null && hashMap.containsKey(str)) {
            return this.n.get(str);
        }
        return null;
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f738h;
    }

    public int getMaxWidth() {
        return this.f737g;
    }

    public int getMinHeight() {
        return this.f736f;
    }

    public int getMinWidth() {
        return this.f735e;
    }

    public int getOptimizationLevel() {
        return this.f734d.s1();
    }

    public View h(int i) {
        return this.f732b.get(i);
    }

    public final b.e.b.k.e i(View view) {
        if (view == this) {
            return this.f734d;
        }
        if (view != null) {
            return ((b) view.getLayoutParams()).m0;
        }
        return null;
    }

    protected boolean k() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    protected void m(int i) {
        this.l = new d(getContext(), this, i);
    }

    protected void n(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.r;
        int i5 = cVar.f753e;
        int i6 = i3 + cVar.f752d;
        int i7 = i4 + i5;
        if (Build.VERSION.SDK_INT < 11) {
            setMeasuredDimension(i6, i7);
            this.o = i6;
            this.p = i7;
            return;
        }
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i6, i, 0);
        int min = Math.min(this.f737g, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f738h, ViewGroup.resolveSizeAndState(i7, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.o = min;
        this.p = min2;
    }

    protected void o(b.e.b.k.f fVar, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.r.c(i2, i3, max, max2, paddingWidth, i5);
        if (Build.VERSION.SDK_INT >= 17) {
            int max3 = Math.max(0, getPaddingStart());
            int max4 = Math.max(0, getPaddingEnd());
            if (max3 <= 0 && max4 <= 0) {
                max3 = Math.max(0, getPaddingLeft());
            } else if (k()) {
                max3 = max4;
            }
            i4 = max3;
        } else {
            i4 = Math.max(0, getPaddingLeft());
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        r(fVar, mode, i6, mode2, i7);
        fVar.z1(i, mode, i6, mode2, i7, this.o, this.p, i4, max);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            b.e.b.k.e eVar = bVar.m0;
            if ((childAt.getVisibility() != 8 || bVar.Y || bVar.Z || bVar.b0 || isInEditMode) && !bVar.a0) {
                int S = eVar.S();
                int T = eVar.T();
                int R = eVar.R() + S;
                int v = eVar.v() + T;
                childAt.layout(S, T, R, v);
                if ((childAt instanceof h) && (content = ((h) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(S, T, R, v);
                }
            }
        }
        int size = this.f733c.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f733c.get(i6).j(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (!this.i) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                } else if (getChildAt(i3).isLayoutRequested()) {
                    this.i = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!this.i) {
            int i4 = this.s;
            if (i4 != i || this.t != i2) {
                if (i4 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.t) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.f734d.v()) {
                    this.s = i;
                    this.t = i2;
                }
            }
            n(i, i2, this.f734d.R(), this.f734d.v(), this.f734d.y1(), this.f734d.w1());
        }
        this.s = i;
        this.t = i2;
        this.f734d.F1(k());
        if (this.i) {
            this.i = false;
            if (s()) {
                this.f734d.H1();
            }
        }
        o(this.f734d, this.j, i, i2);
        n(i, i2, this.f734d.R(), this.f734d.v(), this.f734d.y1(), this.f734d.w1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        b.e.b.k.e i = i(view);
        if ((view instanceof Guideline) && !(i instanceof b.e.b.k.g)) {
            b bVar = (b) view.getLayoutParams();
            b.e.b.k.g gVar = new b.e.b.k.g();
            bVar.m0 = gVar;
            bVar.Y = true;
            gVar.j1(bVar.R);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.n();
            ((b) view.getLayoutParams()).Z = true;
            if (!this.f733c.contains(cVar)) {
                this.f733c.add(cVar);
            }
        }
        this.f732b.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f732b.remove(view.getId());
        this.f734d.c1(i(view));
        this.f733c.remove(view);
        this.i = true;
    }

    public void q(int i, Object obj, Object obj2) {
        if (i != 0 || !(obj instanceof String) || !(obj2 instanceof Integer)) {
            return;
        }
        if (this.n == null) {
            this.n = new HashMap<>();
        }
        String str = (String) obj;
        int indexOf = str.indexOf("/");
        if (indexOf != -1) {
            str = str.substring(indexOf + 1);
        }
        this.n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r3 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        r10 = java.lang.Math.max(0, r7.f735e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r3 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r3 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        r12 = java.lang.Math.max(0, r7.f736f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void r(b.e.b.k.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.r
            int r1 = r0.f753e
            int r0 = r0.f752d
            b.e.b.k.e$b r2 = b.e.b.k.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L28
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = 0
            goto L32
        L1a:
            int r9 = r7.f737g
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L32
        L23:
            b.e.b.k.e$b r9 = b.e.b.k.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            goto L2c
        L28:
            b.e.b.k.e$b r9 = b.e.b.k.e.b.WRAP_CONTENT
            if (r3 != 0) goto L32
        L2c:
            int r10 = r7.f735e
            int r10 = java.lang.Math.max(r6, r10)
        L32:
            if (r11 == r5) goto L47
            if (r11 == 0) goto L42
            if (r11 == r4) goto L3a
        L38:
            r12 = 0
            goto L51
        L3a:
            int r11 = r7.f738h
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L51
        L42:
            b.e.b.k.e$b r2 = b.e.b.k.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            goto L4b
        L47:
            b.e.b.k.e$b r2 = b.e.b.k.e.b.WRAP_CONTENT
            if (r3 != 0) goto L51
        L4b:
            int r11 = r7.f736f
            int r12 = java.lang.Math.max(r6, r11)
        L51:
            int r11 = r8.R()
            if (r10 != r11) goto L5d
            int r11 = r8.v()
            if (r12 == r11) goto L60
        L5d:
            r8.v1()
        L60:
            r8.V0(r6)
            r8.W0(r6)
            int r11 = r7.f737g
            int r11 = r11 - r0
            r8.H0(r11)
            int r11 = r7.f738h
            int r11 = r11 - r1
            r8.G0(r11)
            r8.K0(r6)
            r8.J0(r6)
            r8.z0(r9)
            r8.U0(r10)
            r8.Q0(r2)
            r8.v0(r12)
            int r9 = r7.f735e
            int r9 = r9 - r0
            r8.K0(r9)
            int r9 = r7.f736f
            int r9 = r9 - r1
            r8.J0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.r(b.e.b.k.f, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.k = eVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f732b.remove(getId());
        super.setId(i);
        this.f732b.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f738h) {
            return;
        }
        this.f738h = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f737g) {
            return;
        }
        this.f737g = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f736f) {
            return;
        }
        this.f736f = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f735e) {
            return;
        }
        this.f735e = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(g gVar) {
        d dVar = this.l;
        if (dVar != null) {
            dVar.c(gVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.j = i;
        this.f734d.E1(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
