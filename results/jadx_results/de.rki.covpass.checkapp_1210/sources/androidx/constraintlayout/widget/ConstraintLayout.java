package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m0.d;
import m0.e;
import n0.b;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: m4 */
    private static j f2834m4;

    /* renamed from: c */
    SparseArray<View> f2837c = new SparseArray<>();

    /* renamed from: d */
    private ArrayList<androidx.constraintlayout.widget.b> f2839d = new ArrayList<>(4);

    /* renamed from: q */
    protected m0.f f2849q = new m0.f();

    /* renamed from: x */
    private int f2850x = 0;

    /* renamed from: y */
    private int f2851y = 0;
    private int U3 = Integer.MAX_VALUE;
    private int V3 = Integer.MAX_VALUE;
    protected boolean W3 = true;
    private int X3 = 257;
    private d Y3 = null;
    protected androidx.constraintlayout.widget.c Z3 = null;

    /* renamed from: a4 */
    private int f2835a4 = -1;

    /* renamed from: b4 */
    private HashMap<String, Integer> f2836b4 = new HashMap<>();

    /* renamed from: c4 */
    private int f2838c4 = -1;

    /* renamed from: d4 */
    private int f2840d4 = -1;

    /* renamed from: e4 */
    int f2841e4 = -1;

    /* renamed from: f4 */
    int f2842f4 = -1;

    /* renamed from: g4 */
    int f2843g4 = 0;

    /* renamed from: h4 */
    int f2844h4 = 0;

    /* renamed from: i4 */
    private SparseArray<m0.e> f2845i4 = new SparseArray<>();

    /* renamed from: j4 */
    c f2846j4 = new c(this);

    /* renamed from: k4 */
    private int f2847k4 = 0;

    /* renamed from: l4 */
    private int f2848l4 = 0;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2852a;

        static {
            int[] iArr = new int[e.b.values().length];
            f2852a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2852a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2852a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2852a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        boolean E;
        boolean F;
        public float G;
        public float H;
        public String I;
        float J;
        int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* renamed from: a */
        public int f2853a;

        /* renamed from: a0 */
        public boolean f2854a0;

        /* renamed from: b */
        public int f2855b;

        /* renamed from: b0 */
        public boolean f2856b0;

        /* renamed from: c */
        public float f2857c;

        /* renamed from: c0 */
        public String f2858c0;

        /* renamed from: d */
        public boolean f2859d;

        /* renamed from: d0 */
        public int f2860d0;

        /* renamed from: e */
        public int f2861e;

        /* renamed from: e0 */
        boolean f2862e0;

        /* renamed from: f */
        public int f2863f;

        /* renamed from: f0 */
        boolean f2864f0;

        /* renamed from: g */
        public int f2865g;

        /* renamed from: g0 */
        boolean f2866g0;

        /* renamed from: h */
        public int f2867h;

        /* renamed from: h0 */
        boolean f2868h0;

        /* renamed from: i */
        public int f2869i;

        /* renamed from: i0 */
        boolean f2870i0;

        /* renamed from: j */
        public int f2871j;

        /* renamed from: j0 */
        boolean f2872j0;

        /* renamed from: k */
        public int f2873k;

        /* renamed from: k0 */
        boolean f2874k0;

        /* renamed from: l */
        public int f2875l;

        /* renamed from: l0 */
        int f2876l0;

        /* renamed from: m */
        public int f2877m;

        /* renamed from: m0 */
        int f2878m0;

        /* renamed from: n */
        public int f2879n;

        /* renamed from: n0 */
        int f2880n0;

        /* renamed from: o */
        public int f2881o;

        /* renamed from: o0 */
        int f2882o0;

        /* renamed from: p */
        public int f2883p;

        /* renamed from: p0 */
        int f2884p0;

        /* renamed from: q */
        public int f2885q;

        /* renamed from: q0 */
        int f2886q0;

        /* renamed from: r */
        public float f2887r;

        /* renamed from: r0 */
        float f2888r0;

        /* renamed from: s */
        public int f2889s;

        /* renamed from: s0 */
        int f2890s0;

        /* renamed from: t */
        public int f2891t;

        /* renamed from: t0 */
        int f2892t0;

        /* renamed from: u */
        public int f2893u;

        /* renamed from: u0 */
        float f2894u0;

        /* renamed from: v */
        public int f2895v;

        /* renamed from: v0 */
        m0.e f2896v0;

        /* renamed from: w */
        public int f2897w;

        /* renamed from: w0 */
        public boolean f2898w0;

        /* renamed from: x */
        public int f2899x;

        /* renamed from: y */
        public int f2900y;

        /* renamed from: z */
        public int f2901z;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            public static final SparseIntArray f2902a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2902a = sparseIntArray;
                sparseIntArray.append(i.f3226s2, 64);
                sparseIntArray.append(i.V1, 65);
                sparseIntArray.append(i.f3100e2, 8);
                sparseIntArray.append(i.f3109f2, 9);
                sparseIntArray.append(i.f3127h2, 10);
                sparseIntArray.append(i.f3136i2, 11);
                sparseIntArray.append(i.f3190o2, 12);
                sparseIntArray.append(i.f3181n2, 13);
                sparseIntArray.append(i.L1, 14);
                sparseIntArray.append(i.K1, 15);
                sparseIntArray.append(i.G1, 16);
                sparseIntArray.append(i.I1, 52);
                sparseIntArray.append(i.H1, 53);
                sparseIntArray.append(i.M1, 2);
                sparseIntArray.append(i.O1, 3);
                sparseIntArray.append(i.N1, 4);
                sparseIntArray.append(i.f3271x2, 49);
                sparseIntArray.append(i.f3280y2, 50);
                sparseIntArray.append(i.S1, 5);
                sparseIntArray.append(i.T1, 6);
                sparseIntArray.append(i.U1, 7);
                sparseIntArray.append(i.B1, 67);
                sparseIntArray.append(i.f3189o1, 1);
                sparseIntArray.append(i.f3145j2, 17);
                sparseIntArray.append(i.f3154k2, 18);
                sparseIntArray.append(i.R1, 19);
                sparseIntArray.append(i.Q1, 20);
                sparseIntArray.append(i.C2, 21);
                sparseIntArray.append(i.F2, 22);
                sparseIntArray.append(i.D2, 23);
                sparseIntArray.append(i.A2, 24);
                sparseIntArray.append(i.E2, 25);
                sparseIntArray.append(i.B2, 26);
                sparseIntArray.append(i.f3289z2, 55);
                sparseIntArray.append(i.G2, 54);
                sparseIntArray.append(i.f3064a2, 29);
                sparseIntArray.append(i.f3199p2, 30);
                sparseIntArray.append(i.P1, 44);
                sparseIntArray.append(i.f3082c2, 45);
                sparseIntArray.append(i.f3217r2, 46);
                sparseIntArray.append(i.f3073b2, 47);
                sparseIntArray.append(i.f3208q2, 48);
                sparseIntArray.append(i.E1, 27);
                sparseIntArray.append(i.D1, 28);
                sparseIntArray.append(i.f3235t2, 31);
                sparseIntArray.append(i.W1, 32);
                sparseIntArray.append(i.f3253v2, 33);
                sparseIntArray.append(i.f3244u2, 34);
                sparseIntArray.append(i.f3262w2, 35);
                sparseIntArray.append(i.Y1, 36);
                sparseIntArray.append(i.X1, 37);
                sparseIntArray.append(i.Z1, 38);
                sparseIntArray.append(i.f3091d2, 39);
                sparseIntArray.append(i.f3172m2, 40);
                sparseIntArray.append(i.f3118g2, 41);
                sparseIntArray.append(i.J1, 42);
                sparseIntArray.append(i.F1, 43);
                sparseIntArray.append(i.f3163l2, 51);
                sparseIntArray.append(i.I2, 66);
            }
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f2853a = -1;
            this.f2855b = -1;
            this.f2857c = -1.0f;
            this.f2859d = true;
            this.f2861e = -1;
            this.f2863f = -1;
            this.f2865g = -1;
            this.f2867h = -1;
            this.f2869i = -1;
            this.f2871j = -1;
            this.f2873k = -1;
            this.f2875l = -1;
            this.f2877m = -1;
            this.f2879n = -1;
            this.f2881o = -1;
            this.f2883p = -1;
            this.f2885q = 0;
            this.f2887r = 0.0f;
            this.f2889s = -1;
            this.f2891t = -1;
            this.f2893u = -1;
            this.f2895v = -1;
            this.f2897w = Integer.MIN_VALUE;
            this.f2899x = Integer.MIN_VALUE;
            this.f2900y = Integer.MIN_VALUE;
            this.f2901z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f2854a0 = false;
            this.f2856b0 = false;
            this.f2858c0 = null;
            this.f2860d0 = 0;
            this.f2862e0 = true;
            this.f2864f0 = true;
            this.f2866g0 = false;
            this.f2868h0 = false;
            this.f2870i0 = false;
            this.f2872j0 = false;
            this.f2874k0 = false;
            this.f2876l0 = -1;
            this.f2878m0 = -1;
            this.f2880n0 = -1;
            this.f2882o0 = -1;
            this.f2884p0 = Integer.MIN_VALUE;
            this.f2886q0 = Integer.MIN_VALUE;
            this.f2888r0 = 0.5f;
            this.f2896v0 = new m0.e();
            this.f2898w0 = false;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            this.f2853a = -1;
            this.f2855b = -1;
            this.f2857c = -1.0f;
            this.f2859d = true;
            this.f2861e = -1;
            this.f2863f = -1;
            this.f2865g = -1;
            this.f2867h = -1;
            this.f2869i = -1;
            this.f2871j = -1;
            this.f2873k = -1;
            this.f2875l = -1;
            this.f2877m = -1;
            this.f2879n = -1;
            this.f2881o = -1;
            this.f2883p = -1;
            this.f2885q = 0;
            this.f2887r = 0.0f;
            this.f2889s = -1;
            this.f2891t = -1;
            this.f2893u = -1;
            this.f2895v = -1;
            this.f2897w = Integer.MIN_VALUE;
            this.f2899x = Integer.MIN_VALUE;
            this.f2900y = Integer.MIN_VALUE;
            this.f2901z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f2854a0 = false;
            this.f2856b0 = false;
            this.f2858c0 = null;
            this.f2860d0 = 0;
            this.f2862e0 = true;
            this.f2864f0 = true;
            this.f2866g0 = false;
            this.f2868h0 = false;
            this.f2870i0 = false;
            this.f2872j0 = false;
            this.f2874k0 = false;
            this.f2876l0 = -1;
            this.f2878m0 = -1;
            this.f2880n0 = -1;
            this.f2882o0 = -1;
            this.f2884p0 = Integer.MIN_VALUE;
            this.f2886q0 = Integer.MIN_VALUE;
            this.f2888r0 = 0.5f;
            this.f2896v0 = new m0.e();
            this.f2898w0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f3180n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f2902a.get(index);
                switch (i11) {
                    case 1:
                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2883p);
                        this.f2883p = resourceId;
                        if (resourceId == -1) {
                            this.f2883p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f2885q = obtainStyledAttributes.getDimensionPixelSize(index, this.f2885q);
                        continue;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f2887r) % 360.0f;
                        this.f2887r = f10;
                        if (f10 < 0.0f) {
                            this.f2887r = (360.0f - f10) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f2853a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2853a);
                        continue;
                    case 6:
                        this.f2855b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2855b);
                        continue;
                    case 7:
                        this.f2857c = obtainStyledAttributes.getFloat(index, this.f2857c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2861e);
                        this.f2861e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2861e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2863f);
                        this.f2863f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2863f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2865g);
                        this.f2865g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2865g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2867h);
                        this.f2867h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2867h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2869i);
                        this.f2869i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2869i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2871j);
                        this.f2871j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2871j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2873k);
                        this.f2873k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2873k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2875l);
                        this.f2875l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2875l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2877m);
                        this.f2877m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2877m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2889s);
                        this.f2889s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2889s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2891t);
                        this.f2891t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2891t = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2893u);
                        this.f2893u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2893u = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2895v);
                        this.f2895v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2895v = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f2897w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2897w);
                        continue;
                    case 22:
                        this.f2899x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2899x);
                        continue;
                    case 23:
                        this.f2900y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2900y);
                        continue;
                    case 24:
                        this.f2901z = obtainStyledAttributes.getDimensionPixelSize(index, this.f2901z);
                        continue;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        continue;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        continue;
                    case 27:
                        this.f2854a0 = obtainStyledAttributes.getBoolean(index, this.f2854a0);
                        continue;
                    case 28:
                        this.f2856b0 = obtainStyledAttributes.getBoolean(index, this.f2856b0);
                        continue;
                    case 29:
                        this.G = obtainStyledAttributes.getFloat(index, this.G);
                        continue;
                    case 30:
                        this.H = obtainStyledAttributes.getFloat(index, this.H);
                        continue;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.P = i12;
                        if (i12 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.Q = i13;
                        if (i13 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                    case 34:
                        try {
                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                    case 35:
                        this.V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        continue;
                    case 36:
                        try {
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                    case 37:
                        try {
                            this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                    case 38:
                        this.W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        continue;
                    default:
                        switch (i11) {
                            case 44:
                                d.r(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.L = obtainStyledAttributes.getFloat(index, this.L);
                                continue;
                            case 46:
                                this.M = obtainStyledAttributes.getFloat(index, this.M);
                                continue;
                            case 47:
                                this.N = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.O = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                continue;
                            case 50:
                                this.Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                continue;
                            case 51:
                                this.f2858c0 = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f2879n);
                                this.f2879n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f2879n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f2881o);
                                this.f2881o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f2881o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i11) {
                                    case 64:
                                        d.p(this, obtainStyledAttributes, index, 0);
                                        this.E = true;
                                        continue;
                                    case 65:
                                        d.p(this, obtainStyledAttributes, index, 1);
                                        this.F = true;
                                        continue;
                                    case 66:
                                        this.f2860d0 = obtainStyledAttributes.getInt(index, this.f2860d0);
                                        continue;
                                    case 67:
                                        this.f2859d = obtainStyledAttributes.getBoolean(index, this.f2859d);
                                        continue;
                                        continue;
                                        continue;
                                }
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
            this.f2853a = -1;
            this.f2855b = -1;
            this.f2857c = -1.0f;
            this.f2859d = true;
            this.f2861e = -1;
            this.f2863f = -1;
            this.f2865g = -1;
            this.f2867h = -1;
            this.f2869i = -1;
            this.f2871j = -1;
            this.f2873k = -1;
            this.f2875l = -1;
            this.f2877m = -1;
            this.f2879n = -1;
            this.f2881o = -1;
            this.f2883p = -1;
            this.f2885q = 0;
            this.f2887r = 0.0f;
            this.f2889s = -1;
            this.f2891t = -1;
            this.f2893u = -1;
            this.f2895v = -1;
            this.f2897w = Integer.MIN_VALUE;
            this.f2899x = Integer.MIN_VALUE;
            this.f2900y = Integer.MIN_VALUE;
            this.f2901z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f2854a0 = false;
            this.f2856b0 = false;
            this.f2858c0 = null;
            this.f2860d0 = 0;
            this.f2862e0 = true;
            this.f2864f0 = true;
            this.f2866g0 = false;
            this.f2868h0 = false;
            this.f2870i0 = false;
            this.f2872j0 = false;
            this.f2874k0 = false;
            this.f2876l0 = -1;
            this.f2878m0 = -1;
            this.f2880n0 = -1;
            this.f2882o0 = -1;
            this.f2884p0 = Integer.MIN_VALUE;
            this.f2886q0 = Integer.MIN_VALUE;
            this.f2888r0 = 0.5f;
            this.f2896v0 = new m0.e();
            this.f2898w0 = false;
        }

        public void a() {
            this.f2868h0 = false;
            this.f2862e0 = true;
            this.f2864f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f2854a0) {
                this.f2862e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f2856b0) {
                this.f2864f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f2862e0 = false;
                if (i10 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f2854a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f2864f0 = false;
                if (i11 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f2856b0 = true;
                }
            }
            if (this.f2857c == -1.0f && this.f2853a == -1 && this.f2855b == -1) {
                return;
            }
            this.f2868h0 = true;
            this.f2862e0 = true;
            this.f2864f0 = true;
            if (!(this.f2896v0 instanceof m0.g)) {
                this.f2896v0 = new m0.g();
            }
            ((m0.g) this.f2896v0).x1(this.Z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:74:0x00d0, code lost:
            if (r1 > 0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00d2, code lost:
            ((android.view.ViewGroup.MarginLayoutParams) r10).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x00df, code lost:
            if (r1 > 0) goto L75;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00f1  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }
    }

    /* loaded from: classes.dex */
    public class c implements b.AbstractC0254b {

        /* renamed from: a */
        ConstraintLayout f2903a;

        /* renamed from: b */
        int f2904b;

        /* renamed from: c */
        int f2905c;

        /* renamed from: d */
        int f2906d;

        /* renamed from: e */
        int f2907e;

        /* renamed from: f */
        int f2908f;

        /* renamed from: g */
        int f2909g;

        public c(ConstraintLayout constraintLayout) {
            ConstraintLayout.this = r1;
            this.f2903a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                return false;
            }
            return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
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
        @Override // n0.b.AbstractC0254b
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(m0.e r18, n0.b.a r19) {
            /*
                Method dump skipped, instructions count: 712
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.a(m0.e, n0.b$a):void");
        }

        @Override // n0.b.AbstractC0254b
        public final void b() {
            int childCount = this.f2903a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f2903a.getChildAt(i10);
                if (childAt instanceof g) {
                    ((g) childAt).a(this.f2903a);
                }
            }
            int size = this.f2903a.f2839d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f2903a.f2839d.get(i11)).p(this.f2903a);
                }
            }
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f2904b = i12;
            this.f2905c = i13;
            this.f2906d = i14;
            this.f2907e = i15;
            this.f2908f = i10;
            this.f2909g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q(attributeSet, i10, 0);
    }

    private boolean A() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            w();
        }
        return z10;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static j getSharedValues() {
        if (f2834m4 == null) {
            f2834m4 = new j();
        }
        return f2834m4;
    }

    private final m0.e k(int i10) {
        if (i10 == 0) {
            return this.f2849q;
        }
        View view = this.f2837c.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f2849q;
        }
        if (view != null) {
            return ((b) view.getLayoutParams()).f2896v0;
        }
        return null;
    }

    private void q(AttributeSet attributeSet, int i10, int i11) {
        this.f2849q.y0(this);
        this.f2849q.R1(this.f2846j4);
        this.f2837c.put(getId(), this);
        this.Y3 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f3180n1, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == i.f3225s1) {
                    this.f2850x = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2850x);
                } else if (index == i.f3234t1) {
                    this.f2851y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2851y);
                } else if (index == i.f3207q1) {
                    this.U3 = obtainStyledAttributes.getDimensionPixelOffset(index, this.U3);
                } else if (index == i.f3216r1) {
                    this.V3 = obtainStyledAttributes.getDimensionPixelOffset(index, this.V3);
                } else if (index == i.H2) {
                    this.X3 = obtainStyledAttributes.getInt(index, this.X3);
                } else if (index == i.C1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.Z3 = null;
                        }
                    }
                } else if (index == i.f3279y1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.Y3 = dVar;
                        dVar.m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.Y3 = null;
                    }
                    this.f2835a4 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2849q.S1(this.X3);
    }

    private void s() {
        this.W3 = true;
        this.f2838c4 = -1;
        this.f2840d4 = -1;
        this.f2841e4 = -1;
        this.f2842f4 = -1;
        this.f2843g4 = 0;
        this.f2844h4 = 0;
    }

    private void w() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            m0.e p10 = p(getChildAt(i10));
            if (p10 != null) {
                p10.r0();
            }
        }
        if (isInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    x(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    k(childAt.getId()).z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2835a4 != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f2835a4 && (childAt2 instanceof e)) {
                    this.Y3 = ((e) childAt2).getConstraintSet();
                }
            }
        }
        d dVar = this.Y3;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f2849q.r1();
        int size = this.f2839d.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.f2839d.get(i13).r(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof g) {
                ((g) childAt3).b(this);
            }
        }
        this.f2845i4.clear();
        this.f2845i4.put(0, this.f2849q);
        this.f2845i4.put(getId(), this.f2849q);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f2845i4.put(childAt4.getId(), p(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            m0.e p11 = p(childAt5);
            if (p11 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f2849q.a(p11);
                e(isInEditMode, childAt5, p11, bVar, this.f2845i4);
            }
        }
    }

    private void z(m0.e eVar, b bVar, SparseArray<m0.e> sparseArray, int i10, d.b bVar2) {
        View view = this.f2837c.get(i10);
        m0.e eVar2 = sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f2866g0 = true;
        d.b bVar3 = d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.f2866g0 = true;
            bVar4.f2896v0.H0(true);
        }
        eVar.m(bVar3).a(eVar2.m(bVar2), bVar.D, bVar.C, true);
        eVar.H0(true);
        eVar.m(d.b.TOP).p();
        eVar.m(d.b.BOTTOM).p();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.f2839d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f2839d.get(i10).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void e(boolean r17, android.view.View r18, m0.e r19, androidx.constraintlayout.widget.ConstraintLayout.b r20, android.util.SparseArray<m0.e> r21) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.e(boolean, android.view.View, m0.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    /* renamed from: f */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.View
    public void forceLayout() {
        s();
        super.forceLayout();
    }

    /* renamed from: g */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.V3;
    }

    public int getMaxWidth() {
        return this.U3;
    }

    public int getMinHeight() {
        return this.f2851y;
    }

    public int getMinWidth() {
        return this.f2850x;
    }

    public int getOptimizationLevel() {
        return this.f2849q.G1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f2849q.f16197o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f2849q.f16197o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f2849q.f16197o = "parent";
            }
        }
        if (this.f2849q.r() == null) {
            m0.f fVar = this.f2849q;
            fVar.z0(fVar.f16197o);
            Log.v("ConstraintLayout", " setDebugName " + this.f2849q.r());
        }
        Iterator<m0.e> it = this.f2849q.o1().iterator();
        while (it.hasNext()) {
            m0.e next = it.next();
            View view = (View) next.q();
            if (view != null) {
                if (next.f16197o == null && (id2 = view.getId()) != -1) {
                    next.f16197o = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.r() == null) {
                    next.z0(next.f16197o);
                    Log.v("ConstraintLayout", " setDebugName " + next.r());
                }
            }
        }
        this.f2849q.M(sb2);
        return sb2.toString();
    }

    public Object h(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f2836b4;
        if (hashMap != null && hashMap.containsKey(str)) {
            return this.f2836b4.get(str);
        }
        return null;
    }

    public View l(int i10) {
        return this.f2837c.get(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            m0.e eVar = bVar.f2896v0;
            if ((childAt.getVisibility() != 8 || bVar.f2868h0 || bVar.f2870i0 || bVar.f2874k0 || isInEditMode) && !bVar.f2872j0) {
                int V = eVar.V();
                int W = eVar.W();
                int U = eVar.U() + V;
                int v10 = eVar.v() + W;
                childAt.layout(V, W, U, v10);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(V, W, U, v10);
                }
            }
        }
        int size = this.f2839d.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f2839d.get(i15).o(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f2847k4 == i10) {
            int i12 = this.f2848l4;
        }
        if (!this.W3) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                } else if (getChildAt(i13).isLayoutRequested()) {
                    this.W3 = true;
                    break;
                } else {
                    i13++;
                }
            }
        }
        boolean z10 = this.W3;
        this.f2847k4 = i10;
        this.f2848l4 = i11;
        this.f2849q.U1(r());
        if (this.W3) {
            this.W3 = false;
            if (A()) {
                this.f2849q.W1();
            }
        }
        v(this.f2849q, this.X3, i10, i11);
        u(i10, i11, this.f2849q.U(), this.f2849q.v(), this.f2849q.M1(), this.f2849q.K1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        m0.e p10 = p(view);
        if ((view instanceof Guideline) && !(p10 instanceof m0.g)) {
            b bVar = (b) view.getLayoutParams();
            m0.g gVar = new m0.g();
            bVar.f2896v0 = gVar;
            bVar.f2868h0 = true;
            gVar.x1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.s();
            ((b) view.getLayoutParams()).f2870i0 = true;
            if (!this.f2839d.contains(bVar2)) {
                this.f2839d.add(bVar2);
            }
        }
        this.f2837c.put(view.getId(), view);
        this.W3 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2837c.remove(view.getId());
        this.f2849q.q1(p(view));
        this.f2839d.remove(view);
        this.W3 = true;
    }

    public final m0.e p(View view) {
        if (view == this) {
            return this.f2849q;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof b)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof b)) {
                return null;
            }
        }
        return ((b) view.getLayoutParams()).f2896v0;
    }

    public boolean r() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        s();
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.Y3 = dVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f2837c.remove(getId());
        super.setId(i10);
        this.f2837c.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.V3) {
            return;
        }
        this.V3 = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.U3) {
            return;
        }
        this.U3 = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f2851y) {
            return;
        }
        this.f2851y = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f2850x) {
            return;
        }
        this.f2850x = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        androidx.constraintlayout.widget.c cVar = this.Z3;
        if (cVar != null) {
            cVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.X3 = i10;
        this.f2849q.S1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected void t(int i10) {
        this.Z3 = new androidx.constraintlayout.widget.c(getContext(), this, i10);
    }

    protected void u(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f2846j4;
        int i14 = cVar.f2907e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i12 + cVar.f2906d, i10, 0);
        int min = Math.min(this.U3, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.V3, ViewGroup.resolveSizeAndState(i13 + i14, i11, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f2838c4 = min;
        this.f2840d4 = min2;
    }

    protected void v(m0.f fVar, int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i13 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f2846j4.c(i11, i12, max, max2, paddingWidth, i13);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? r() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        y(fVar, mode, i14, mode2, i15);
        fVar.N1(i10, mode, i14, mode2, i15, this.f2838c4, this.f2840d4, max5, max);
    }

    public void x(int i10, Object obj, Object obj2) {
        if (i10 != 0 || !(obj instanceof String) || !(obj2 instanceof Integer)) {
            return;
        }
        if (this.f2836b4 == null) {
            this.f2836b4 = new HashMap<>();
        }
        String str = (String) obj;
        int indexOf = str.indexOf("/");
        if (indexOf != -1) {
            str = str.substring(indexOf + 1);
        }
        this.f2836b4.put(str, Integer.valueOf(((Integer) obj2).intValue()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r3 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        r10 = java.lang.Math.max(0, r7.f2850x);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r3 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r3 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        r12 = java.lang.Math.max(0, r7.f2851y);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void y(m0.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f2846j4
            int r1 = r0.f2907e
            int r0 = r0.f2906d
            m0.e$b r2 = m0.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L28
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L32
        L1a:
            int r9 = r7.U3
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L32
        L23:
            m0.e$b r9 = m0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            goto L2c
        L28:
            m0.e$b r9 = m0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L32
        L2c:
            int r10 = r7.f2850x
            int r10 = java.lang.Math.max(r6, r10)
        L32:
            if (r11 == r5) goto L47
            if (r11 == 0) goto L42
            if (r11 == r4) goto L3a
        L38:
            r12 = r6
            goto L51
        L3a:
            int r11 = r7.V3
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L51
        L42:
            m0.e$b r2 = m0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            goto L4b
        L47:
            m0.e$b r2 = m0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L51
        L4b:
            int r11 = r7.f2851y
            int r12 = java.lang.Math.max(r6, r11)
        L51:
            int r11 = r8.U()
            if (r10 != r11) goto L5d
            int r11 = r8.v()
            if (r12 == r11) goto L60
        L5d:
            r8.J1()
        L60:
            r8.j1(r6)
            r8.k1(r6)
            int r11 = r7.U3
            int r11 = r11 - r0
            r8.U0(r11)
            int r11 = r7.V3
            int r11 = r11 - r1
            r8.T0(r11)
            r8.X0(r6)
            r8.W0(r6)
            r8.M0(r9)
            r8.h1(r10)
            r8.d1(r2)
            r8.I0(r12)
            int r9 = r7.f2850x
            int r9 = r9 - r0
            r8.X0(r9)
            int r9 = r7.f2851y
            int r9 = r9 - r1
            r8.W0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.y(m0.f, int, int, int, int):void");
    }
}
