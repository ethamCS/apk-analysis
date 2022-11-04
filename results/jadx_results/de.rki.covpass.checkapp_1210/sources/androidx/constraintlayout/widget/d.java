package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.conscrypt.BuildConfig;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class d {

    /* renamed from: f */
    private static final int[] f2947f = {0, 4, 8};

    /* renamed from: g */
    private static SparseIntArray f2948g = new SparseIntArray();

    /* renamed from: h */
    private static SparseIntArray f2949h = new SparseIntArray();

    /* renamed from: a */
    public String f2950a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f2951b = 0;

    /* renamed from: c */
    private HashMap<String, androidx.constraintlayout.widget.a> f2952c = new HashMap<>();

    /* renamed from: d */
    private boolean f2953d = true;

    /* renamed from: e */
    private HashMap<Integer, a> f2954e = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        int f2955a;

        /* renamed from: b */
        String f2956b;

        /* renamed from: c */
        public final C0026d f2957c = new C0026d();

        /* renamed from: d */
        public final c f2958d = new c();

        /* renamed from: e */
        public final b f2959e = new b();

        /* renamed from: f */
        public final e f2960f = new e();

        /* renamed from: g */
        public HashMap<String, androidx.constraintlayout.widget.a> f2961g = new HashMap<>();

        /* renamed from: h */
        C0025a f2962h;

        /* renamed from: androidx.constraintlayout.widget.d$a$a */
        /* loaded from: classes.dex */
        public static class C0025a {

            /* renamed from: a */
            int[] f2963a = new int[10];

            /* renamed from: b */
            int[] f2964b = new int[10];

            /* renamed from: c */
            int f2965c = 0;

            /* renamed from: d */
            int[] f2966d = new int[10];

            /* renamed from: e */
            float[] f2967e = new float[10];

            /* renamed from: f */
            int f2968f = 0;

            /* renamed from: g */
            int[] f2969g = new int[5];

            /* renamed from: h */
            String[] f2970h = new String[5];

            /* renamed from: i */
            int f2971i = 0;

            /* renamed from: j */
            int[] f2972j = new int[4];

            /* renamed from: k */
            boolean[] f2973k = new boolean[4];

            /* renamed from: l */
            int f2974l = 0;

            C0025a() {
            }

            void a(int i10, float f10) {
                int i11 = this.f2968f;
                int[] iArr = this.f2966d;
                if (i11 >= iArr.length) {
                    this.f2966d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2967e;
                    this.f2967e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2966d;
                int i12 = this.f2968f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f2967e;
                this.f2968f = i12 + 1;
                fArr2[i12] = f10;
            }

            void b(int i10, int i11) {
                int i12 = this.f2965c;
                int[] iArr = this.f2963a;
                if (i12 >= iArr.length) {
                    this.f2963a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f2964b;
                    this.f2964b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2963a;
                int i13 = this.f2965c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f2964b;
                this.f2965c = i13 + 1;
                iArr4[i13] = i11;
            }

            void c(int i10, String str) {
                int i11 = this.f2971i;
                int[] iArr = this.f2969g;
                if (i11 >= iArr.length) {
                    this.f2969g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2970h;
                    this.f2970h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f2969g;
                int i12 = this.f2971i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f2970h;
                this.f2971i = i12 + 1;
                strArr2[i12] = str;
            }

            void d(int i10, boolean z10) {
                int i11 = this.f2974l;
                int[] iArr = this.f2972j;
                if (i11 >= iArr.length) {
                    this.f2972j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2973k;
                    this.f2973k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2972j;
                int i12 = this.f2974l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f2973k;
                this.f2974l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        public void f(int i10, ConstraintLayout.b bVar) {
            this.f2955a = i10;
            b bVar2 = this.f2959e;
            bVar2.f2994j = bVar.f2861e;
            bVar2.f2996k = bVar.f2863f;
            bVar2.f2998l = bVar.f2865g;
            bVar2.f3000m = bVar.f2867h;
            bVar2.f3002n = bVar.f2869i;
            bVar2.f3004o = bVar.f2871j;
            bVar2.f3006p = bVar.f2873k;
            bVar2.f3008q = bVar.f2875l;
            bVar2.f3010r = bVar.f2877m;
            bVar2.f3011s = bVar.f2879n;
            bVar2.f3012t = bVar.f2881o;
            bVar2.f3013u = bVar.f2889s;
            bVar2.f3014v = bVar.f2891t;
            bVar2.f3015w = bVar.f2893u;
            bVar2.f3016x = bVar.f2895v;
            bVar2.f3017y = bVar.G;
            bVar2.f3018z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f2883p;
            bVar2.C = bVar.f2885q;
            bVar2.D = bVar.f2887r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f2990h = bVar.f2857c;
            bVar2.f2986f = bVar.f2853a;
            bVar2.f2988g = bVar.f2855b;
            bVar2.f2982d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f2984e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f3003n0 = bVar.f2854a0;
            bVar2.f3005o0 = bVar.f2856b0;
            bVar2.Z = bVar.P;
            bVar2.f2977a0 = bVar.Q;
            bVar2.f2979b0 = bVar.T;
            bVar2.f2981c0 = bVar.U;
            bVar2.f2983d0 = bVar.R;
            bVar2.f2985e0 = bVar.S;
            bVar2.f2987f0 = bVar.V;
            bVar2.f2989g0 = bVar.W;
            bVar2.f3001m0 = bVar.f2858c0;
            bVar2.P = bVar.f2899x;
            bVar2.R = bVar.f2901z;
            bVar2.O = bVar.f2897w;
            bVar2.Q = bVar.f2900y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f3009q0 = bVar.f2860d0;
            bVar2.L = bVar.getMarginEnd();
            this.f2959e.M = bVar.getMarginStart();
        }

        public void g(int i10, e.a aVar) {
            f(i10, aVar);
            this.f2957c.f3037d = aVar.f3055x0;
            e eVar = this.f2960f;
            eVar.f3041b = aVar.A0;
            eVar.f3042c = aVar.B0;
            eVar.f3043d = aVar.C0;
            eVar.f3044e = aVar.D0;
            eVar.f3045f = aVar.E0;
            eVar.f3046g = aVar.F0;
            eVar.f3047h = aVar.G0;
            eVar.f3049j = aVar.H0;
            eVar.f3050k = aVar.I0;
            eVar.f3051l = aVar.J0;
            eVar.f3053n = aVar.f3057z0;
            eVar.f3052m = aVar.f3056y0;
        }

        public void h(androidx.constraintlayout.widget.b bVar, int i10, e.a aVar) {
            g(i10, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f2959e;
                bVar2.f2995j0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f2991h0 = barrier.getType();
                this.f2959e.f2997k0 = barrier.getReferencedIds();
                this.f2959e.f2993i0 = barrier.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f2959e;
            bVar.f2861e = bVar2.f2994j;
            bVar.f2863f = bVar2.f2996k;
            bVar.f2865g = bVar2.f2998l;
            bVar.f2867h = bVar2.f3000m;
            bVar.f2869i = bVar2.f3002n;
            bVar.f2871j = bVar2.f3004o;
            bVar.f2873k = bVar2.f3006p;
            bVar.f2875l = bVar2.f3008q;
            bVar.f2877m = bVar2.f3010r;
            bVar.f2879n = bVar2.f3011s;
            bVar.f2881o = bVar2.f3012t;
            bVar.f2889s = bVar2.f3013u;
            bVar.f2891t = bVar2.f3014v;
            bVar.f2893u = bVar2.f3015w;
            bVar.f2895v = bVar2.f3016x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f2899x = bVar2.P;
            bVar.f2901z = bVar2.R;
            bVar.G = bVar2.f3017y;
            bVar.H = bVar2.f3018z;
            bVar.f2883p = bVar2.B;
            bVar.f2885q = bVar2.C;
            bVar.f2887r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f2854a0 = bVar2.f3003n0;
            bVar.f2856b0 = bVar2.f3005o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f2977a0;
            bVar.T = bVar2.f2979b0;
            bVar.U = bVar2.f2981c0;
            bVar.R = bVar2.f2983d0;
            bVar.S = bVar2.f2985e0;
            bVar.V = bVar2.f2987f0;
            bVar.W = bVar2.f2989g0;
            bVar.Z = bVar2.G;
            bVar.f2857c = bVar2.f2990h;
            bVar.f2853a = bVar2.f2986f;
            bVar.f2855b = bVar2.f2988g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f2982d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f2984e;
            String str = bVar2.f3001m0;
            if (str != null) {
                bVar.f2858c0 = str;
            }
            bVar.f2860d0 = bVar2.f3009q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f2959e.L);
            bVar.a();
        }

        /* renamed from: e */
        public a clone() {
            a aVar = new a();
            aVar.f2959e.a(this.f2959e);
            aVar.f2958d.a(this.f2958d);
            aVar.f2957c.a(this.f2957c);
            aVar.f2960f.a(this.f2960f);
            aVar.f2955a = this.f2955a;
            aVar.f2962h = this.f2962h;
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: r0 */
        private static SparseIntArray f2975r0;

        /* renamed from: d */
        public int f2982d;

        /* renamed from: e */
        public int f2984e;

        /* renamed from: k0 */
        public int[] f2997k0;

        /* renamed from: l0 */
        public String f2999l0;

        /* renamed from: m0 */
        public String f3001m0;

        /* renamed from: a */
        public boolean f2976a = false;

        /* renamed from: b */
        public boolean f2978b = false;

        /* renamed from: c */
        public boolean f2980c = false;

        /* renamed from: f */
        public int f2986f = -1;

        /* renamed from: g */
        public int f2988g = -1;

        /* renamed from: h */
        public float f2990h = -1.0f;

        /* renamed from: i */
        public boolean f2992i = true;

        /* renamed from: j */
        public int f2994j = -1;

        /* renamed from: k */
        public int f2996k = -1;

        /* renamed from: l */
        public int f2998l = -1;

        /* renamed from: m */
        public int f3000m = -1;

        /* renamed from: n */
        public int f3002n = -1;

        /* renamed from: o */
        public int f3004o = -1;

        /* renamed from: p */
        public int f3006p = -1;

        /* renamed from: q */
        public int f3008q = -1;

        /* renamed from: r */
        public int f3010r = -1;

        /* renamed from: s */
        public int f3011s = -1;

        /* renamed from: t */
        public int f3012t = -1;

        /* renamed from: u */
        public int f3013u = -1;

        /* renamed from: v */
        public int f3014v = -1;

        /* renamed from: w */
        public int f3015w = -1;

        /* renamed from: x */
        public int f3016x = -1;

        /* renamed from: y */
        public float f3017y = 0.5f;

        /* renamed from: z */
        public float f3018z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0 */
        public int f2977a0 = 0;

        /* renamed from: b0 */
        public int f2979b0 = 0;

        /* renamed from: c0 */
        public int f2981c0 = 0;

        /* renamed from: d0 */
        public int f2983d0 = 0;

        /* renamed from: e0 */
        public int f2985e0 = 0;

        /* renamed from: f0 */
        public float f2987f0 = 1.0f;

        /* renamed from: g0 */
        public float f2989g0 = 1.0f;

        /* renamed from: h0 */
        public int f2991h0 = -1;

        /* renamed from: i0 */
        public int f2993i0 = 0;

        /* renamed from: j0 */
        public int f2995j0 = -1;

        /* renamed from: n0 */
        public boolean f3003n0 = false;

        /* renamed from: o0 */
        public boolean f3005o0 = false;

        /* renamed from: p0 */
        public boolean f3007p0 = true;

        /* renamed from: q0 */
        public int f3009q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2975r0 = sparseIntArray;
            sparseIntArray.append(i.K5, 24);
            f2975r0.append(i.L5, 25);
            f2975r0.append(i.N5, 28);
            f2975r0.append(i.O5, 29);
            f2975r0.append(i.T5, 35);
            f2975r0.append(i.S5, 34);
            f2975r0.append(i.f3247u5, 4);
            f2975r0.append(i.f3238t5, 3);
            f2975r0.append(i.f3220r5, 1);
            f2975r0.append(i.Z5, 6);
            f2975r0.append(i.f3068a6, 7);
            f2975r0.append(i.B5, 17);
            f2975r0.append(i.C5, 18);
            f2975r0.append(i.D5, 19);
            f2975r0.append(i.f3184n5, 90);
            f2975r0.append(i.Z4, 26);
            f2975r0.append(i.P5, 31);
            f2975r0.append(i.Q5, 32);
            f2975r0.append(i.A5, 10);
            f2975r0.append(i.f3292z5, 9);
            f2975r0.append(i.f3095d6, 13);
            f2975r0.append(i.f3122g6, 16);
            f2975r0.append(i.f3104e6, 14);
            f2975r0.append(i.f3077b6, 11);
            f2975r0.append(i.f3113f6, 15);
            f2975r0.append(i.f3086c6, 12);
            f2975r0.append(i.W5, 38);
            f2975r0.append(i.I5, 37);
            f2975r0.append(i.H5, 39);
            f2975r0.append(i.V5, 40);
            f2975r0.append(i.G5, 20);
            f2975r0.append(i.U5, 36);
            f2975r0.append(i.f3283y5, 5);
            f2975r0.append(i.J5, 91);
            f2975r0.append(i.R5, 91);
            f2975r0.append(i.M5, 91);
            f2975r0.append(i.f3229s5, 91);
            f2975r0.append(i.f3211q5, 91);
            f2975r0.append(i.f3085c5, 23);
            f2975r0.append(i.f3103e5, 27);
            f2975r0.append(i.f3121g5, 30);
            f2975r0.append(i.f3130h5, 8);
            f2975r0.append(i.f3094d5, 33);
            f2975r0.append(i.f3112f5, 2);
            f2975r0.append(i.f3067a5, 22);
            f2975r0.append(i.f3076b5, 21);
            f2975r0.append(i.X5, 41);
            f2975r0.append(i.E5, 42);
            f2975r0.append(i.f3202p5, 41);
            f2975r0.append(i.f3193o5, 42);
            f2975r0.append(i.f3131h6, 76);
            f2975r0.append(i.f3256v5, 61);
            f2975r0.append(i.f3274x5, 62);
            f2975r0.append(i.f3265w5, 63);
            f2975r0.append(i.Y5, 69);
            f2975r0.append(i.F5, 70);
            f2975r0.append(i.f3166l5, 71);
            f2975r0.append(i.f3148j5, 72);
            f2975r0.append(i.f3157k5, 73);
            f2975r0.append(i.f3175m5, 74);
            f2975r0.append(i.f3139i5, 75);
        }

        public void a(b bVar) {
            this.f2976a = bVar.f2976a;
            this.f2982d = bVar.f2982d;
            this.f2978b = bVar.f2978b;
            this.f2984e = bVar.f2984e;
            this.f2986f = bVar.f2986f;
            this.f2988g = bVar.f2988g;
            this.f2990h = bVar.f2990h;
            this.f2992i = bVar.f2992i;
            this.f2994j = bVar.f2994j;
            this.f2996k = bVar.f2996k;
            this.f2998l = bVar.f2998l;
            this.f3000m = bVar.f3000m;
            this.f3002n = bVar.f3002n;
            this.f3004o = bVar.f3004o;
            this.f3006p = bVar.f3006p;
            this.f3008q = bVar.f3008q;
            this.f3010r = bVar.f3010r;
            this.f3011s = bVar.f3011s;
            this.f3012t = bVar.f3012t;
            this.f3013u = bVar.f3013u;
            this.f3014v = bVar.f3014v;
            this.f3015w = bVar.f3015w;
            this.f3016x = bVar.f3016x;
            this.f3017y = bVar.f3017y;
            this.f3018z = bVar.f3018z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f2977a0 = bVar.f2977a0;
            this.f2979b0 = bVar.f2979b0;
            this.f2981c0 = bVar.f2981c0;
            this.f2983d0 = bVar.f2983d0;
            this.f2985e0 = bVar.f2985e0;
            this.f2987f0 = bVar.f2987f0;
            this.f2989g0 = bVar.f2989g0;
            this.f2991h0 = bVar.f2991h0;
            this.f2993i0 = bVar.f2993i0;
            this.f2995j0 = bVar.f2995j0;
            this.f3001m0 = bVar.f3001m0;
            int[] iArr = bVar.f2997k0;
            if (iArr == null || bVar.f2999l0 != null) {
                this.f2997k0 = null;
            } else {
                this.f2997k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f2999l0 = bVar.f2999l0;
            this.f3003n0 = bVar.f3003n0;
            this.f3005o0 = bVar.f3005o0;
            this.f3007p0 = bVar.f3007p0;
            this.f3009q0 = bVar.f3009q0;
        }

        void b(Context context, AttributeSet attributeSet) {
            StringBuilder sb2;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.Y4);
            this.f2978b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f2975r0.get(index);
                switch (i11) {
                    case 1:
                        this.f3010r = d.o(obtainStyledAttributes, index, this.f3010r);
                        break;
                    case 2:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f3008q = d.o(obtainStyledAttributes, index, this.f3008q);
                        break;
                    case 4:
                        this.f3006p = d.o(obtainStyledAttributes, index, this.f3006p);
                        break;
                    case 5:
                        this.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f3016x = d.o(obtainStyledAttributes, index, this.f3016x);
                        break;
                    case 10:
                        this.f3015w = d.o(obtainStyledAttributes, index, this.f3015w);
                        break;
                    case 11:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f2986f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2986f);
                        break;
                    case 18:
                        this.f2988g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2988g);
                        break;
                    case 19:
                        this.f2990h = obtainStyledAttributes.getFloat(index, this.f2990h);
                        break;
                    case 20:
                        this.f3017y = obtainStyledAttributes.getFloat(index, this.f3017y);
                        break;
                    case 21:
                        this.f2984e = obtainStyledAttributes.getLayoutDimension(index, this.f2984e);
                        break;
                    case 22:
                        this.f2982d = obtainStyledAttributes.getLayoutDimension(index, this.f2982d);
                        break;
                    case 23:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f2994j = d.o(obtainStyledAttributes, index, this.f2994j);
                        break;
                    case 25:
                        this.f2996k = d.o(obtainStyledAttributes, index, this.f2996k);
                        break;
                    case 26:
                        this.G = obtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f2998l = d.o(obtainStyledAttributes, index, this.f2998l);
                        break;
                    case 29:
                        this.f3000m = d.o(obtainStyledAttributes, index, this.f3000m);
                        break;
                    case 30:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f3013u = d.o(obtainStyledAttributes, index, this.f3013u);
                        break;
                    case 32:
                        this.f3014v = d.o(obtainStyledAttributes, index, this.f3014v);
                        break;
                    case 33:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f3004o = d.o(obtainStyledAttributes, index, this.f3004o);
                        break;
                    case 35:
                        this.f3002n = d.o(obtainStyledAttributes, index, this.f3002n);
                        break;
                    case 36:
                        this.f3018z = obtainStyledAttributes.getFloat(index, this.f3018z);
                        break;
                    case 37:
                        this.W = obtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        d.p(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.p(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.B = d.o(obtainStyledAttributes, index, this.B);
                                continue;
                            case 62:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            case 63:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                continue;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f2987f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f2989g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f2991h0 = obtainStyledAttributes.getInt(index, this.f2991h0);
                                        break;
                                    case 73:
                                        this.f2993i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2993i0);
                                        break;
                                    case 74:
                                        this.f2999l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f3007p0 = obtainStyledAttributes.getBoolean(index, this.f3007p0);
                                        break;
                                    case 76:
                                        this.f3009q0 = obtainStyledAttributes.getInt(index, this.f3009q0);
                                        break;
                                    case 77:
                                        this.f3011s = d.o(obtainStyledAttributes, index, this.f3011s);
                                        break;
                                    case 78:
                                        this.f3012t = d.o(obtainStyledAttributes, index, this.f3012t);
                                        break;
                                    case 79:
                                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.f2977a0 = obtainStyledAttributes.getInt(index, this.f2977a0);
                                        break;
                                    case 83:
                                        this.f2981c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2981c0);
                                        break;
                                    case 84:
                                        this.f2979b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2979b0);
                                        break;
                                    case 85:
                                        this.f2985e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2985e0);
                                        break;
                                    case 86:
                                        this.f2983d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2983d0);
                                        break;
                                    case 87:
                                        this.f3003n0 = obtainStyledAttributes.getBoolean(index, this.f3003n0);
                                        break;
                                    case 88:
                                        this.f3005o0 = obtainStyledAttributes.getBoolean(index, this.f3005o0);
                                        break;
                                    case 89:
                                        this.f3001m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f2992i = obtainStyledAttributes.getBoolean(index, this.f2992i);
                                        break;
                                    case 91:
                                        sb2 = new StringBuilder();
                                        str = "unused attribute 0x";
                                        sb2.append(str);
                                        sb2.append(Integer.toHexString(index));
                                        sb2.append("   ");
                                        sb2.append(f2975r0.get(index));
                                        Log.w("ConstraintSet", sb2.toString());
                                        continue;
                                    default:
                                        sb2 = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        sb2.append(str);
                                        sb2.append(Integer.toHexString(index));
                                        sb2.append("   ");
                                        sb2.append(f2975r0.get(index));
                                        Log.w("ConstraintSet", sb2.toString());
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: o */
        private static SparseIntArray f3019o;

        /* renamed from: a */
        public boolean f3020a = false;

        /* renamed from: b */
        public int f3021b = -1;

        /* renamed from: c */
        public int f3022c = 0;

        /* renamed from: d */
        public String f3023d = null;

        /* renamed from: e */
        public int f3024e = -1;

        /* renamed from: f */
        public int f3025f = 0;

        /* renamed from: g */
        public float f3026g = Float.NaN;

        /* renamed from: h */
        public int f3027h = -1;

        /* renamed from: i */
        public float f3028i = Float.NaN;

        /* renamed from: j */
        public float f3029j = Float.NaN;

        /* renamed from: k */
        public int f3030k = -1;

        /* renamed from: l */
        public String f3031l = null;

        /* renamed from: m */
        public int f3032m = -3;

        /* renamed from: n */
        public int f3033n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3019o = sparseIntArray;
            sparseIntArray.append(i.f3239t6, 1);
            f3019o.append(i.f3257v6, 2);
            f3019o.append(i.f3293z6, 3);
            f3019o.append(i.f3230s6, 4);
            f3019o.append(i.f3221r6, 5);
            f3019o.append(i.f3212q6, 6);
            f3019o.append(i.f3248u6, 7);
            f3019o.append(i.f3284y6, 8);
            f3019o.append(i.f3275x6, 9);
            f3019o.append(i.f3266w6, 10);
        }

        public void a(c cVar) {
            this.f3020a = cVar.f3020a;
            this.f3021b = cVar.f3021b;
            this.f3023d = cVar.f3023d;
            this.f3024e = cVar.f3024e;
            this.f3025f = cVar.f3025f;
            this.f3028i = cVar.f3028i;
            this.f3026g = cVar.f3026g;
            this.f3027h = cVar.f3027h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f3203p6);
            this.f3020a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f3019o.get(index)) {
                    case 1:
                        this.f3028i = obtainStyledAttributes.getFloat(index, this.f3028i);
                        break;
                    case 2:
                        this.f3024e = obtainStyledAttributes.getInt(index, this.f3024e);
                        break;
                    case 3:
                        this.f3023d = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : k0.b.f14537c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f3025f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f3021b = d.o(obtainStyledAttributes, index, this.f3021b);
                        break;
                    case 6:
                        this.f3022c = obtainStyledAttributes.getInteger(index, this.f3022c);
                        break;
                    case 7:
                        this.f3026g = obtainStyledAttributes.getFloat(index, this.f3026g);
                        break;
                    case 8:
                        this.f3030k = obtainStyledAttributes.getInteger(index, this.f3030k);
                        break;
                    case 9:
                        this.f3029j = obtainStyledAttributes.getFloat(index, this.f3029j);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f3033n = resourceId;
                            if (resourceId == -1) {
                                break;
                            }
                            this.f3032m = -2;
                            break;
                        } else if (i11 != 3) {
                            this.f3032m = obtainStyledAttributes.getInteger(index, this.f3033n);
                            break;
                        } else {
                            String string = obtainStyledAttributes.getString(index);
                            this.f3031l = string;
                            if (string.indexOf("/") <= 0) {
                                this.f3032m = -1;
                                break;
                            } else {
                                this.f3033n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f3032m = -2;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d */
    /* loaded from: classes.dex */
    public static class C0026d {

        /* renamed from: a */
        public boolean f3034a = false;

        /* renamed from: b */
        public int f3035b = 0;

        /* renamed from: c */
        public int f3036c = 0;

        /* renamed from: d */
        public float f3037d = 1.0f;

        /* renamed from: e */
        public float f3038e = Float.NaN;

        public void a(C0026d c0026d) {
            this.f3034a = c0026d.f3034a;
            this.f3035b = c0026d.f3035b;
            this.f3037d = c0026d.f3037d;
            this.f3038e = c0026d.f3038e;
            this.f3036c = c0026d.f3036c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.M6);
            this.f3034a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.O6) {
                    this.f3037d = obtainStyledAttributes.getFloat(index, this.f3037d);
                } else if (index == i.N6) {
                    this.f3035b = obtainStyledAttributes.getInt(index, this.f3035b);
                    this.f3035b = d.f2947f[this.f3035b];
                } else if (index == i.Q6) {
                    this.f3036c = obtainStyledAttributes.getInt(index, this.f3036c);
                } else if (index == i.P6) {
                    this.f3038e = obtainStyledAttributes.getFloat(index, this.f3038e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: o */
        private static SparseIntArray f3039o;

        /* renamed from: a */
        public boolean f3040a = false;

        /* renamed from: b */
        public float f3041b = 0.0f;

        /* renamed from: c */
        public float f3042c = 0.0f;

        /* renamed from: d */
        public float f3043d = 0.0f;

        /* renamed from: e */
        public float f3044e = 1.0f;

        /* renamed from: f */
        public float f3045f = 1.0f;

        /* renamed from: g */
        public float f3046g = Float.NaN;

        /* renamed from: h */
        public float f3047h = Float.NaN;

        /* renamed from: i */
        public int f3048i = -1;

        /* renamed from: j */
        public float f3049j = 0.0f;

        /* renamed from: k */
        public float f3050k = 0.0f;

        /* renamed from: l */
        public float f3051l = 0.0f;

        /* renamed from: m */
        public boolean f3052m = false;

        /* renamed from: n */
        public float f3053n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3039o = sparseIntArray;
            sparseIntArray.append(i.f3168l7, 1);
            f3039o.append(i.f3177m7, 2);
            f3039o.append(i.f3186n7, 3);
            f3039o.append(i.f3150j7, 4);
            f3039o.append(i.f3159k7, 5);
            f3039o.append(i.f3114f7, 6);
            f3039o.append(i.f3123g7, 7);
            f3039o.append(i.f3132h7, 8);
            f3039o.append(i.f3141i7, 9);
            f3039o.append(i.f3195o7, 10);
            f3039o.append(i.f3204p7, 11);
            f3039o.append(i.f3213q7, 12);
        }

        public void a(e eVar) {
            this.f3040a = eVar.f3040a;
            this.f3041b = eVar.f3041b;
            this.f3042c = eVar.f3042c;
            this.f3043d = eVar.f3043d;
            this.f3044e = eVar.f3044e;
            this.f3045f = eVar.f3045f;
            this.f3046g = eVar.f3046g;
            this.f3047h = eVar.f3047h;
            this.f3048i = eVar.f3048i;
            this.f3049j = eVar.f3049j;
            this.f3050k = eVar.f3050k;
            this.f3051l = eVar.f3051l;
            this.f3052m = eVar.f3052m;
            this.f3053n = eVar.f3053n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f3105e7);
            this.f3040a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f3039o.get(index)) {
                    case 1:
                        this.f3041b = obtainStyledAttributes.getFloat(index, this.f3041b);
                        break;
                    case 2:
                        this.f3042c = obtainStyledAttributes.getFloat(index, this.f3042c);
                        break;
                    case 3:
                        this.f3043d = obtainStyledAttributes.getFloat(index, this.f3043d);
                        break;
                    case 4:
                        this.f3044e = obtainStyledAttributes.getFloat(index, this.f3044e);
                        break;
                    case 5:
                        this.f3045f = obtainStyledAttributes.getFloat(index, this.f3045f);
                        break;
                    case 6:
                        this.f3046g = obtainStyledAttributes.getDimension(index, this.f3046g);
                        break;
                    case 7:
                        this.f3047h = obtainStyledAttributes.getDimension(index, this.f3047h);
                        break;
                    case 8:
                        this.f3049j = obtainStyledAttributes.getDimension(index, this.f3049j);
                        break;
                    case 9:
                        this.f3050k = obtainStyledAttributes.getDimension(index, this.f3050k);
                        break;
                    case 10:
                        this.f3051l = obtainStyledAttributes.getDimension(index, this.f3051l);
                        break;
                    case 11:
                        this.f3052m = true;
                        this.f3053n = obtainStyledAttributes.getDimension(index, this.f3053n);
                        break;
                    case 12:
                        this.f3048i = d.o(obtainStyledAttributes, index, this.f3048i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f2948g.append(i.A0, 25);
        f2948g.append(i.B0, 26);
        f2948g.append(i.D0, 29);
        f2948g.append(i.E0, 30);
        f2948g.append(i.K0, 36);
        f2948g.append(i.J0, 35);
        f2948g.append(i.f3125h0, 4);
        f2948g.append(i.f3116g0, 3);
        f2948g.append(i.f3080c0, 1);
        f2948g.append(i.f3098e0, 91);
        f2948g.append(i.f3089d0, 92);
        f2948g.append(i.T0, 6);
        f2948g.append(i.U0, 7);
        f2948g.append(i.f3188o0, 17);
        f2948g.append(i.f3197p0, 18);
        f2948g.append(i.f3206q0, 19);
        f2948g.append(i.Y, 99);
        f2948g.append(i.f3241u, 27);
        f2948g.append(i.F0, 32);
        f2948g.append(i.G0, 33);
        f2948g.append(i.f3179n0, 10);
        f2948g.append(i.f3170m0, 9);
        f2948g.append(i.X0, 13);
        f2948g.append(i.f3063a1, 16);
        f2948g.append(i.Y0, 14);
        f2948g.append(i.V0, 11);
        f2948g.append(i.Z0, 15);
        f2948g.append(i.W0, 12);
        f2948g.append(i.N0, 40);
        f2948g.append(i.f3278y0, 39);
        f2948g.append(i.f3269x0, 41);
        f2948g.append(i.M0, 42);
        f2948g.append(i.f3260w0, 20);
        f2948g.append(i.L0, 37);
        f2948g.append(i.f3161l0, 5);
        f2948g.append(i.f3287z0, 87);
        f2948g.append(i.I0, 87);
        f2948g.append(i.C0, 87);
        f2948g.append(i.f3107f0, 87);
        f2948g.append(i.f3071b0, 87);
        f2948g.append(i.f3286z, 24);
        f2948g.append(i.B, 28);
        f2948g.append(i.N, 31);
        f2948g.append(i.O, 8);
        f2948g.append(i.A, 34);
        f2948g.append(i.C, 2);
        f2948g.append(i.f3268x, 23);
        f2948g.append(i.f3277y, 21);
        f2948g.append(i.O0, 95);
        f2948g.append(i.f3215r0, 96);
        f2948g.append(i.f3259w, 22);
        f2948g.append(i.D, 43);
        f2948g.append(i.Q, 44);
        f2948g.append(i.L, 45);
        f2948g.append(i.M, 46);
        f2948g.append(i.K, 60);
        f2948g.append(i.I, 47);
        f2948g.append(i.J, 48);
        f2948g.append(i.E, 49);
        f2948g.append(i.F, 50);
        f2948g.append(i.G, 51);
        f2948g.append(i.H, 52);
        f2948g.append(i.P, 53);
        f2948g.append(i.P0, 54);
        f2948g.append(i.f3224s0, 55);
        f2948g.append(i.Q0, 56);
        f2948g.append(i.f3233t0, 57);
        f2948g.append(i.R0, 58);
        f2948g.append(i.f3242u0, 59);
        f2948g.append(i.f3134i0, 61);
        f2948g.append(i.f3152k0, 62);
        f2948g.append(i.f3143j0, 63);
        f2948g.append(i.R, 64);
        f2948g.append(i.f3153k1, 65);
        f2948g.append(i.X, 66);
        f2948g.append(i.f3162l1, 67);
        f2948g.append(i.f3090d1, 79);
        f2948g.append(i.f3250v, 38);
        f2948g.append(i.f3081c1, 68);
        f2948g.append(i.S0, 69);
        f2948g.append(i.f3251v0, 70);
        f2948g.append(i.f3072b1, 97);
        f2948g.append(i.V, 71);
        f2948g.append(i.T, 72);
        f2948g.append(i.U, 73);
        f2948g.append(i.W, 74);
        f2948g.append(i.S, 75);
        f2948g.append(i.f3099e1, 76);
        f2948g.append(i.H0, 77);
        f2948g.append(i.f3171m1, 78);
        f2948g.append(i.f3062a0, 80);
        f2948g.append(i.Z, 81);
        f2948g.append(i.f3108f1, 82);
        f2948g.append(i.f3144j1, 83);
        f2948g.append(i.f3135i1, 84);
        f2948g.append(i.f3126h1, 85);
        f2948g.append(i.f3117g1, 86);
        SparseIntArray sparseIntArray = f2949h;
        int i10 = i.R3;
        sparseIntArray.append(i10, 6);
        f2949h.append(i10, 7);
        f2949h.append(i.M2, 27);
        f2949h.append(i.U3, 13);
        f2949h.append(i.X3, 16);
        f2949h.append(i.V3, 14);
        f2949h.append(i.S3, 11);
        f2949h.append(i.W3, 15);
        f2949h.append(i.T3, 12);
        f2949h.append(i.L3, 40);
        f2949h.append(i.E3, 39);
        f2949h.append(i.D3, 41);
        f2949h.append(i.K3, 42);
        f2949h.append(i.C3, 20);
        f2949h.append(i.J3, 37);
        f2949h.append(i.f3263w3, 5);
        f2949h.append(i.F3, 87);
        f2949h.append(i.I3, 87);
        f2949h.append(i.G3, 87);
        f2949h.append(i.f3236t3, 87);
        f2949h.append(i.f3227s3, 87);
        f2949h.append(i.R2, 24);
        f2949h.append(i.T2, 28);
        f2949h.append(i.f3110f3, 31);
        f2949h.append(i.f3119g3, 8);
        f2949h.append(i.S2, 34);
        f2949h.append(i.U2, 2);
        f2949h.append(i.P2, 23);
        f2949h.append(i.Q2, 21);
        f2949h.append(i.M3, 95);
        f2949h.append(i.f3272x3, 96);
        f2949h.append(i.O2, 22);
        f2949h.append(i.V2, 43);
        f2949h.append(i.f3137i3, 44);
        f2949h.append(i.f3092d3, 45);
        f2949h.append(i.f3101e3, 46);
        f2949h.append(i.f3083c3, 60);
        f2949h.append(i.f3065a3, 47);
        f2949h.append(i.f3074b3, 48);
        f2949h.append(i.W2, 49);
        f2949h.append(i.X2, 50);
        f2949h.append(i.Y2, 51);
        f2949h.append(i.Z2, 52);
        f2949h.append(i.f3128h3, 53);
        f2949h.append(i.N3, 54);
        f2949h.append(i.f3281y3, 55);
        f2949h.append(i.O3, 56);
        f2949h.append(i.f3290z3, 57);
        f2949h.append(i.P3, 58);
        f2949h.append(i.A3, 59);
        f2949h.append(i.f3254v3, 62);
        f2949h.append(i.f3245u3, 63);
        f2949h.append(i.f3146j3, 64);
        f2949h.append(i.f3138i4, 65);
        f2949h.append(i.f3200p3, 66);
        f2949h.append(i.f3147j4, 67);
        f2949h.append(i.f3066a4, 79);
        f2949h.append(i.N2, 38);
        f2949h.append(i.f3075b4, 98);
        f2949h.append(i.Z3, 68);
        f2949h.append(i.Q3, 69);
        f2949h.append(i.B3, 70);
        f2949h.append(i.f3182n3, 71);
        f2949h.append(i.f3164l3, 72);
        f2949h.append(i.f3173m3, 73);
        f2949h.append(i.f3191o3, 74);
        f2949h.append(i.f3155k3, 75);
        f2949h.append(i.f3084c4, 76);
        f2949h.append(i.H3, 77);
        f2949h.append(i.f3156k4, 78);
        f2949h.append(i.f3218r3, 80);
        f2949h.append(i.f3209q3, 81);
        f2949h.append(i.f3093d4, 82);
        f2949h.append(i.f3129h4, 83);
        f2949h.append(i.f3120g4, 84);
        f2949h.append(i.f3111f4, 85);
        f2949h.append(i.f3102e4, 86);
        f2949h.append(i.Y3, 97);
    }

    private int[] j(View view, String str) {
        int i10;
        Object h10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (h10 = ((ConstraintLayout) view.getParent()).h(0, trim)) != null && (h10 instanceof Integer)) {
                i10 = ((Integer) h10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    private a k(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? i.L2 : i.f3232t);
        s(context, aVar, obtainStyledAttributes, z10);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a l(int i10) {
        if (!this.f2954e.containsKey(Integer.valueOf(i10))) {
            this.f2954e.put(Integer.valueOf(i10), new a());
        }
        return this.f2954e.get(Integer.valueOf(i10));
    }

    public static int o(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    public static void p(Object obj, TypedArray typedArray, int i10, int i11) {
        int i12;
        if (obj == null) {
            return;
        }
        int i13 = typedArray.peekValue(i10).type;
        if (i13 == 3) {
            q(obj, typedArray.getString(i10), i11);
            return;
        }
        int i14 = -2;
        boolean z10 = false;
        if (i13 != 5) {
            int i15 = typedArray.getInt(i10, 0);
            if (i15 != -4) {
                i14 = (i15 == -3 || !(i15 == -2 || i15 == -1)) ? 0 : i15;
            } else {
                z10 = true;
            }
        } else {
            i14 = typedArray.getDimensionPixelSize(i10, 0);
        }
        if (obj instanceof ConstraintLayout.b) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
            if (i11 == 0) {
                ((ViewGroup.MarginLayoutParams) bVar).width = i14;
                bVar.f2854a0 = z10;
                return;
            }
            ((ViewGroup.MarginLayoutParams) bVar).height = i14;
            bVar.f2856b0 = z10;
        } else if (obj instanceof b) {
            b bVar2 = (b) obj;
            if (i11 == 0) {
                bVar2.f2982d = i14;
                bVar2.f3003n0 = z10;
                return;
            }
            bVar2.f2984e = i14;
            bVar2.f3005o0 = z10;
        } else if (!(obj instanceof a.C0025a)) {
        } else {
            a.C0025a c0025a = (a.C0025a) obj;
            if (i11 == 0) {
                c0025a.b(23, i14);
                i12 = 80;
            } else {
                c0025a.b(21, i14);
                i12 = 81;
            }
            c0025a.d(i12, z10);
        }
    }

    static void q(Object obj, String str, int i10) {
        int i11;
        int i12;
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() <= 0) {
            return;
        }
        String trim = substring.trim();
        String trim2 = substring2.trim();
        if ("ratio".equalsIgnoreCase(trim)) {
            if (obj instanceof ConstraintLayout.b) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                if (i10 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                }
                r(bVar, trim2);
                return;
            } else if (obj instanceof b) {
                ((b) obj).A = trim2;
                return;
            } else if (!(obj instanceof a.C0025a)) {
                return;
            } else {
                ((a.C0025a) obj).c(5, trim2);
                return;
            }
        }
        try {
            if ("weight".equalsIgnoreCase(trim)) {
                float parseFloat = Float.parseFloat(trim2);
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                        bVar2.L = parseFloat;
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                    bVar2.M = parseFloat;
                } else if (obj instanceof b) {
                    b bVar3 = (b) obj;
                    if (i10 == 0) {
                        bVar3.f2982d = 0;
                        bVar3.W = parseFloat;
                        return;
                    }
                    bVar3.f2984e = 0;
                    bVar3.V = parseFloat;
                } else if (!(obj instanceof a.C0025a)) {
                } else {
                    a.C0025a c0025a = (a.C0025a) obj;
                    if (i10 == 0) {
                        c0025a.b(23, 0);
                        i12 = 39;
                    } else {
                        c0025a.b(21, 0);
                        i12 = 40;
                    }
                    c0025a.a(i12, parseFloat);
                }
            } else if (!"parent".equalsIgnoreCase(trim)) {
            } else {
                float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                        bVar4.V = max;
                        bVar4.P = 2;
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                    bVar4.W = max;
                    bVar4.Q = 2;
                } else if (obj instanceof b) {
                    b bVar5 = (b) obj;
                    if (i10 == 0) {
                        bVar5.f2982d = 0;
                        bVar5.f2987f0 = max;
                        bVar5.Z = 2;
                        return;
                    }
                    bVar5.f2984e = 0;
                    bVar5.f2989g0 = max;
                    bVar5.f2977a0 = 2;
                } else if (!(obj instanceof a.C0025a)) {
                } else {
                    a.C0025a c0025a2 = (a.C0025a) obj;
                    if (i10 == 0) {
                        c0025a2.b(23, 0);
                        i11 = 54;
                    } else {
                        c0025a2.b(21, 0);
                        i11 = 55;
                    }
                    c0025a2.b(i11, 2);
                }
            }
        } catch (NumberFormatException unused) {
        }
    }

    public static void r(ConstraintLayout.b bVar, String str) {
        float f10 = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i11);
                    if (substring2.length() > 0) {
                        f10 = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i11, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f10 = i10 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = f10;
        bVar.K = i10;
    }

    private void s(Context context, a aVar, TypedArray typedArray, boolean z10) {
        c cVar;
        String str;
        c cVar2;
        String str2;
        StringBuilder sb2;
        if (z10) {
            t(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != i.f3250v && i.N != index && i.O != index) {
                aVar.f2958d.f3020a = true;
                aVar.f2959e.f2978b = true;
                aVar.f2957c.f3034a = true;
                aVar.f2960f.f3040a = true;
            }
            switch (f2948g.get(index)) {
                case 1:
                    b bVar = aVar.f2959e;
                    bVar.f3010r = o(typedArray, index, bVar.f3010r);
                    continue;
                case 2:
                    b bVar2 = aVar.f2959e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    continue;
                case 3:
                    b bVar3 = aVar.f2959e;
                    bVar3.f3008q = o(typedArray, index, bVar3.f3008q);
                    continue;
                case 4:
                    b bVar4 = aVar.f2959e;
                    bVar4.f3006p = o(typedArray, index, bVar4.f3006p);
                    continue;
                case 5:
                    aVar.f2959e.A = typedArray.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.f2959e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    continue;
                case 7:
                    b bVar6 = aVar.f2959e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    continue;
                case 8:
                    b bVar7 = aVar.f2959e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    continue;
                case 9:
                    b bVar8 = aVar.f2959e;
                    bVar8.f3016x = o(typedArray, index, bVar8.f3016x);
                    continue;
                case 10:
                    b bVar9 = aVar.f2959e;
                    bVar9.f3015w = o(typedArray, index, bVar9.f3015w);
                    continue;
                case 11:
                    b bVar10 = aVar.f2959e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    continue;
                case 12:
                    b bVar11 = aVar.f2959e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    continue;
                case 13:
                    b bVar12 = aVar.f2959e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    continue;
                case 14:
                    b bVar13 = aVar.f2959e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    continue;
                case 15:
                    b bVar14 = aVar.f2959e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    continue;
                case 16:
                    b bVar15 = aVar.f2959e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    continue;
                case 17:
                    b bVar16 = aVar.f2959e;
                    bVar16.f2986f = typedArray.getDimensionPixelOffset(index, bVar16.f2986f);
                    continue;
                case 18:
                    b bVar17 = aVar.f2959e;
                    bVar17.f2988g = typedArray.getDimensionPixelOffset(index, bVar17.f2988g);
                    continue;
                case 19:
                    b bVar18 = aVar.f2959e;
                    bVar18.f2990h = typedArray.getFloat(index, bVar18.f2990h);
                    continue;
                case 20:
                    b bVar19 = aVar.f2959e;
                    bVar19.f3017y = typedArray.getFloat(index, bVar19.f3017y);
                    continue;
                case 21:
                    b bVar20 = aVar.f2959e;
                    bVar20.f2984e = typedArray.getLayoutDimension(index, bVar20.f2984e);
                    continue;
                case 22:
                    C0026d c0026d = aVar.f2957c;
                    c0026d.f3035b = typedArray.getInt(index, c0026d.f3035b);
                    C0026d c0026d2 = aVar.f2957c;
                    c0026d2.f3035b = f2947f[c0026d2.f3035b];
                    continue;
                case 23:
                    b bVar21 = aVar.f2959e;
                    bVar21.f2982d = typedArray.getLayoutDimension(index, bVar21.f2982d);
                    continue;
                case 24:
                    b bVar22 = aVar.f2959e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    continue;
                case 25:
                    b bVar23 = aVar.f2959e;
                    bVar23.f2994j = o(typedArray, index, bVar23.f2994j);
                    continue;
                case 26:
                    b bVar24 = aVar.f2959e;
                    bVar24.f2996k = o(typedArray, index, bVar24.f2996k);
                    continue;
                case 27:
                    b bVar25 = aVar.f2959e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    continue;
                case 28:
                    b bVar26 = aVar.f2959e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    continue;
                case 29:
                    b bVar27 = aVar.f2959e;
                    bVar27.f2998l = o(typedArray, index, bVar27.f2998l);
                    continue;
                case 30:
                    b bVar28 = aVar.f2959e;
                    bVar28.f3000m = o(typedArray, index, bVar28.f3000m);
                    continue;
                case 31:
                    b bVar29 = aVar.f2959e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    continue;
                case 32:
                    b bVar30 = aVar.f2959e;
                    bVar30.f3013u = o(typedArray, index, bVar30.f3013u);
                    continue;
                case 33:
                    b bVar31 = aVar.f2959e;
                    bVar31.f3014v = o(typedArray, index, bVar31.f3014v);
                    continue;
                case 34:
                    b bVar32 = aVar.f2959e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    continue;
                case 35:
                    b bVar33 = aVar.f2959e;
                    bVar33.f3004o = o(typedArray, index, bVar33.f3004o);
                    continue;
                case 36:
                    b bVar34 = aVar.f2959e;
                    bVar34.f3002n = o(typedArray, index, bVar34.f3002n);
                    continue;
                case 37:
                    b bVar35 = aVar.f2959e;
                    bVar35.f3018z = typedArray.getFloat(index, bVar35.f3018z);
                    continue;
                case 38:
                    aVar.f2955a = typedArray.getResourceId(index, aVar.f2955a);
                    continue;
                case 39:
                    b bVar36 = aVar.f2959e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    continue;
                case 40:
                    b bVar37 = aVar.f2959e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    continue;
                case 41:
                    b bVar38 = aVar.f2959e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    continue;
                case 42:
                    b bVar39 = aVar.f2959e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    continue;
                case 43:
                    C0026d c0026d3 = aVar.f2957c;
                    c0026d3.f3037d = typedArray.getFloat(index, c0026d3.f3037d);
                    continue;
                case 44:
                    e eVar = aVar.f2960f;
                    eVar.f3052m = true;
                    eVar.f3053n = typedArray.getDimension(index, eVar.f3053n);
                    continue;
                case 45:
                    e eVar2 = aVar.f2960f;
                    eVar2.f3042c = typedArray.getFloat(index, eVar2.f3042c);
                    continue;
                case 46:
                    e eVar3 = aVar.f2960f;
                    eVar3.f3043d = typedArray.getFloat(index, eVar3.f3043d);
                    continue;
                case 47:
                    e eVar4 = aVar.f2960f;
                    eVar4.f3044e = typedArray.getFloat(index, eVar4.f3044e);
                    continue;
                case 48:
                    e eVar5 = aVar.f2960f;
                    eVar5.f3045f = typedArray.getFloat(index, eVar5.f3045f);
                    continue;
                case 49:
                    e eVar6 = aVar.f2960f;
                    eVar6.f3046g = typedArray.getDimension(index, eVar6.f3046g);
                    continue;
                case 50:
                    e eVar7 = aVar.f2960f;
                    eVar7.f3047h = typedArray.getDimension(index, eVar7.f3047h);
                    continue;
                case 51:
                    e eVar8 = aVar.f2960f;
                    eVar8.f3049j = typedArray.getDimension(index, eVar8.f3049j);
                    continue;
                case 52:
                    e eVar9 = aVar.f2960f;
                    eVar9.f3050k = typedArray.getDimension(index, eVar9.f3050k);
                    continue;
                case 53:
                    e eVar10 = aVar.f2960f;
                    eVar10.f3051l = typedArray.getDimension(index, eVar10.f3051l);
                    continue;
                case 54:
                    b bVar40 = aVar.f2959e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    continue;
                case 55:
                    b bVar41 = aVar.f2959e;
                    bVar41.f2977a0 = typedArray.getInt(index, bVar41.f2977a0);
                    continue;
                case 56:
                    b bVar42 = aVar.f2959e;
                    bVar42.f2979b0 = typedArray.getDimensionPixelSize(index, bVar42.f2979b0);
                    continue;
                case 57:
                    b bVar43 = aVar.f2959e;
                    bVar43.f2981c0 = typedArray.getDimensionPixelSize(index, bVar43.f2981c0);
                    continue;
                case 58:
                    b bVar44 = aVar.f2959e;
                    bVar44.f2983d0 = typedArray.getDimensionPixelSize(index, bVar44.f2983d0);
                    continue;
                case 59:
                    b bVar45 = aVar.f2959e;
                    bVar45.f2985e0 = typedArray.getDimensionPixelSize(index, bVar45.f2985e0);
                    continue;
                case 60:
                    e eVar11 = aVar.f2960f;
                    eVar11.f3041b = typedArray.getFloat(index, eVar11.f3041b);
                    continue;
                case 61:
                    b bVar46 = aVar.f2959e;
                    bVar46.B = o(typedArray, index, bVar46.B);
                    continue;
                case 62:
                    b bVar47 = aVar.f2959e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    continue;
                case 63:
                    b bVar48 = aVar.f2959e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    continue;
                case 64:
                    c cVar3 = aVar.f2958d;
                    cVar3.f3021b = o(typedArray, index, cVar3.f3021b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f2958d;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f2958d;
                        str = k0.b.f14537c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f3023d = str;
                    continue;
                case 66:
                    aVar.f2958d.f3025f = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    c cVar4 = aVar.f2958d;
                    cVar4.f3028i = typedArray.getFloat(index, cVar4.f3028i);
                    continue;
                case 68:
                    C0026d c0026d4 = aVar.f2957c;
                    c0026d4.f3038e = typedArray.getFloat(index, c0026d4.f3038e);
                    continue;
                case 69:
                    aVar.f2959e.f2987f0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f2959e.f2989g0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    b bVar49 = aVar.f2959e;
                    bVar49.f2991h0 = typedArray.getInt(index, bVar49.f2991h0);
                    continue;
                case 73:
                    b bVar50 = aVar.f2959e;
                    bVar50.f2993i0 = typedArray.getDimensionPixelSize(index, bVar50.f2993i0);
                    continue;
                case 74:
                    aVar.f2959e.f2999l0 = typedArray.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.f2959e;
                    bVar51.f3007p0 = typedArray.getBoolean(index, bVar51.f3007p0);
                    continue;
                case 76:
                    c cVar5 = aVar.f2958d;
                    cVar5.f3024e = typedArray.getInt(index, cVar5.f3024e);
                    continue;
                case 77:
                    aVar.f2959e.f3001m0 = typedArray.getString(index);
                    continue;
                case 78:
                    C0026d c0026d5 = aVar.f2957c;
                    c0026d5.f3036c = typedArray.getInt(index, c0026d5.f3036c);
                    continue;
                case 79:
                    c cVar6 = aVar.f2958d;
                    cVar6.f3026g = typedArray.getFloat(index, cVar6.f3026g);
                    continue;
                case 80:
                    b bVar52 = aVar.f2959e;
                    bVar52.f3003n0 = typedArray.getBoolean(index, bVar52.f3003n0);
                    continue;
                case 81:
                    b bVar53 = aVar.f2959e;
                    bVar53.f3005o0 = typedArray.getBoolean(index, bVar53.f3005o0);
                    continue;
                case 82:
                    c cVar7 = aVar.f2958d;
                    cVar7.f3022c = typedArray.getInteger(index, cVar7.f3022c);
                    continue;
                case 83:
                    e eVar12 = aVar.f2960f;
                    eVar12.f3048i = o(typedArray, index, eVar12.f3048i);
                    continue;
                case 84:
                    c cVar8 = aVar.f2958d;
                    cVar8.f3030k = typedArray.getInteger(index, cVar8.f3030k);
                    continue;
                case 85:
                    c cVar9 = aVar.f2958d;
                    cVar9.f3029j = typedArray.getFloat(index, cVar9.f3029j);
                    continue;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f2958d.f3033n = typedArray.getResourceId(index, -1);
                        cVar2 = aVar.f2958d;
                        if (cVar2.f3033n == -1) {
                            continue;
                        }
                        cVar2.f3032m = -2;
                    } else {
                        if (i11 == 3) {
                            aVar.f2958d.f3031l = typedArray.getString(index);
                            if (aVar.f2958d.f3031l.indexOf("/") > 0) {
                                aVar.f2958d.f3033n = typedArray.getResourceId(index, -1);
                                cVar2 = aVar.f2958d;
                                cVar2.f3032m = -2;
                            } else {
                                aVar.f2958d.f3032m = -1;
                            }
                        } else {
                            c cVar10 = aVar.f2958d;
                            cVar10.f3032m = typedArray.getInteger(index, cVar10.f3033n);
                        }
                    }
                case 87:
                    sb2 = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    sb2 = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
                case 91:
                    b bVar54 = aVar.f2959e;
                    bVar54.f3011s = o(typedArray, index, bVar54.f3011s);
                    continue;
                case 92:
                    b bVar55 = aVar.f2959e;
                    bVar55.f3012t = o(typedArray, index, bVar55.f3012t);
                    continue;
                case 93:
                    b bVar56 = aVar.f2959e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    continue;
                case 94:
                    b bVar57 = aVar.f2959e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    continue;
                case 95:
                    p(aVar.f2959e, typedArray, index, 0);
                    continue;
                case 96:
                    p(aVar.f2959e, typedArray, index, 1);
                    continue;
                case 97:
                    b bVar58 = aVar.f2959e;
                    bVar58.f3009q0 = typedArray.getInt(index, bVar58.f3009q0);
                    continue;
            }
            sb2.append(str2);
            sb2.append(Integer.toHexString(index));
            sb2.append("   ");
            sb2.append(f2948g.get(index));
            Log.w("ConstraintSet", sb2.toString());
        }
        b bVar59 = aVar.f2959e;
        if (bVar59.f2999l0 == null) {
            return;
        }
        bVar59.f2997k0 = null;
    }

    private static void t(Context context, a aVar, TypedArray typedArray) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        float f11;
        int i18;
        boolean z10;
        int i19;
        int i20;
        c cVar;
        StringBuilder sb2;
        String str;
        int indexCount = typedArray.getIndexCount();
        a.C0025a c0025a = new a.C0025a();
        aVar.f2962h = c0025a;
        aVar.f2958d.f3020a = false;
        aVar.f2959e.f2978b = false;
        aVar.f2957c.f3034a = false;
        aVar.f2960f.f3040a = false;
        for (int i21 = 0; i21 < indexCount; i21++) {
            int index = typedArray.getIndex(i21);
            float f12 = 1.0f;
            switch (f2949h.get(index)) {
                case 2:
                    i10 = 2;
                    i12 = aVar.f2959e.K;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    sb2 = new StringBuilder();
                    str = "Unknown attribute 0x";
                    sb2.append(str);
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f2948g.get(index));
                    Log.w("ConstraintSet", sb2.toString());
                    break;
                case 5:
                    i13 = 5;
                    c0025a.c(i13, typedArray.getString(index));
                    break;
                case 6:
                    i10 = 6;
                    i14 = aVar.f2959e.E;
                    i11 = typedArray.getDimensionPixelOffset(index, i14);
                    c0025a.b(i10, i11);
                    break;
                case 7:
                    i10 = 7;
                    i14 = aVar.f2959e.F;
                    i11 = typedArray.getDimensionPixelOffset(index, i14);
                    c0025a.b(i10, i11);
                    break;
                case 8:
                    i10 = 8;
                    i12 = aVar.f2959e.L;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 11:
                    i10 = 11;
                    i12 = aVar.f2959e.R;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 12:
                    i10 = 12;
                    i12 = aVar.f2959e.S;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 13:
                    i10 = 13;
                    i12 = aVar.f2959e.O;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 14:
                    i10 = 14;
                    i12 = aVar.f2959e.Q;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 15:
                    i10 = 15;
                    i12 = aVar.f2959e.T;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 16:
                    i10 = 16;
                    i12 = aVar.f2959e.P;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 17:
                    i10 = 17;
                    i14 = aVar.f2959e.f2986f;
                    i11 = typedArray.getDimensionPixelOffset(index, i14);
                    c0025a.b(i10, i11);
                    break;
                case 18:
                    i10 = 18;
                    i14 = aVar.f2959e.f2988g;
                    i11 = typedArray.getDimensionPixelOffset(index, i14);
                    c0025a.b(i10, i11);
                    break;
                case 19:
                    i15 = 19;
                    f12 = aVar.f2959e.f2990h;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 20:
                    i15 = 20;
                    f12 = aVar.f2959e.f3017y;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 21:
                    i10 = 21;
                    i16 = aVar.f2959e.f2984e;
                    i11 = typedArray.getLayoutDimension(index, i16);
                    c0025a.b(i10, i11);
                    break;
                case 22:
                    i10 = 22;
                    i11 = f2947f[typedArray.getInt(index, aVar.f2957c.f3035b)];
                    c0025a.b(i10, i11);
                    break;
                case 23:
                    i10 = 23;
                    i16 = aVar.f2959e.f2982d;
                    i11 = typedArray.getLayoutDimension(index, i16);
                    c0025a.b(i10, i11);
                    break;
                case 24:
                    i10 = 24;
                    i12 = aVar.f2959e.H;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 27:
                    i10 = 27;
                    i17 = aVar.f2959e.G;
                    i11 = typedArray.getInt(index, i17);
                    c0025a.b(i10, i11);
                    break;
                case 28:
                    i10 = 28;
                    i12 = aVar.f2959e.I;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 31:
                    i10 = 31;
                    i12 = aVar.f2959e.M;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 34:
                    i10 = 34;
                    i12 = aVar.f2959e.J;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 37:
                    i15 = 37;
                    f12 = aVar.f2959e.f3018z;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 38:
                    i11 = typedArray.getResourceId(index, aVar.f2955a);
                    aVar.f2955a = i11;
                    i10 = 38;
                    c0025a.b(i10, i11);
                    break;
                case 39:
                    i15 = 39;
                    f12 = aVar.f2959e.W;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 40:
                    i15 = 40;
                    f12 = aVar.f2959e.V;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 41:
                    i10 = 41;
                    i17 = aVar.f2959e.X;
                    i11 = typedArray.getInt(index, i17);
                    c0025a.b(i10, i11);
                    break;
                case 42:
                    i10 = 42;
                    i17 = aVar.f2959e.Y;
                    i11 = typedArray.getInt(index, i17);
                    c0025a.b(i10, i11);
                    break;
                case 43:
                    i15 = 43;
                    f12 = aVar.f2957c.f3037d;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 44:
                    i15 = 44;
                    c0025a.d(44, true);
                    f11 = aVar.f2960f.f3053n;
                    f10 = typedArray.getDimension(index, f11);
                    c0025a.a(i15, f10);
                    break;
                case 45:
                    i15 = 45;
                    f12 = aVar.f2960f.f3042c;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 46:
                    i15 = 46;
                    f12 = aVar.f2960f.f3043d;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 47:
                    i15 = 47;
                    f12 = aVar.f2960f.f3044e;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 48:
                    i15 = 48;
                    f12 = aVar.f2960f.f3045f;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 49:
                    i15 = 49;
                    f11 = aVar.f2960f.f3046g;
                    f10 = typedArray.getDimension(index, f11);
                    c0025a.a(i15, f10);
                    break;
                case 50:
                    i15 = 50;
                    f11 = aVar.f2960f.f3047h;
                    f10 = typedArray.getDimension(index, f11);
                    c0025a.a(i15, f10);
                    break;
                case 51:
                    i15 = 51;
                    f11 = aVar.f2960f.f3049j;
                    f10 = typedArray.getDimension(index, f11);
                    c0025a.a(i15, f10);
                    break;
                case 52:
                    i15 = 52;
                    f11 = aVar.f2960f.f3050k;
                    f10 = typedArray.getDimension(index, f11);
                    c0025a.a(i15, f10);
                    break;
                case 53:
                    i15 = 53;
                    f11 = aVar.f2960f.f3051l;
                    f10 = typedArray.getDimension(index, f11);
                    c0025a.a(i15, f10);
                    break;
                case 54:
                    i10 = 54;
                    i17 = aVar.f2959e.Z;
                    i11 = typedArray.getInt(index, i17);
                    c0025a.b(i10, i11);
                    break;
                case 55:
                    i10 = 55;
                    i17 = aVar.f2959e.f2977a0;
                    i11 = typedArray.getInt(index, i17);
                    c0025a.b(i10, i11);
                    break;
                case 56:
                    i10 = 56;
                    i12 = aVar.f2959e.f2979b0;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 57:
                    i10 = 57;
                    i12 = aVar.f2959e.f2981c0;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 58:
                    i10 = 58;
                    i12 = aVar.f2959e.f2983d0;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 59:
                    i10 = 59;
                    i12 = aVar.f2959e.f2985e0;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 60:
                    i15 = 60;
                    f12 = aVar.f2960f.f3041b;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 62:
                    i10 = 62;
                    i12 = aVar.f2959e.C;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 63:
                    i15 = 63;
                    f12 = aVar.f2959e.D;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 64:
                    i10 = 64;
                    i18 = aVar.f2958d.f3021b;
                    i11 = o(typedArray, index, i18);
                    c0025a.b(i10, i11);
                    break;
                case 65:
                    c0025a.c(65, typedArray.peekValue(index).type == 3 ? typedArray.getString(index) : k0.b.f14537c[typedArray.getInteger(index, 0)]);
                    break;
                case 66:
                    i10 = 66;
                    i11 = typedArray.getInt(index, 0);
                    c0025a.b(i10, i11);
                    break;
                case 67:
                    i15 = 67;
                    f12 = aVar.f2958d.f3028i;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 68:
                    i15 = 68;
                    f12 = aVar.f2957c.f3038e;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 69:
                    i15 = 69;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 70:
                    i15 = 70;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    i10 = 72;
                    i17 = aVar.f2959e.f2991h0;
                    i11 = typedArray.getInt(index, i17);
                    c0025a.b(i10, i11);
                    break;
                case 73:
                    i10 = 73;
                    i12 = aVar.f2959e.f2993i0;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 74:
                    i13 = 74;
                    c0025a.c(i13, typedArray.getString(index));
                    break;
                case 75:
                    i19 = 75;
                    z10 = aVar.f2959e.f3007p0;
                    c0025a.d(i19, typedArray.getBoolean(index, z10));
                    break;
                case 76:
                    i10 = 76;
                    i17 = aVar.f2958d.f3024e;
                    i11 = typedArray.getInt(index, i17);
                    c0025a.b(i10, i11);
                    break;
                case 77:
                    i13 = 77;
                    c0025a.c(i13, typedArray.getString(index));
                    break;
                case 78:
                    i10 = 78;
                    i17 = aVar.f2957c.f3036c;
                    i11 = typedArray.getInt(index, i17);
                    c0025a.b(i10, i11);
                    break;
                case 79:
                    i15 = 79;
                    f12 = aVar.f2958d.f3026g;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 80:
                    i19 = 80;
                    z10 = aVar.f2959e.f3003n0;
                    c0025a.d(i19, typedArray.getBoolean(index, z10));
                    break;
                case 81:
                    i19 = 81;
                    z10 = aVar.f2959e.f3005o0;
                    c0025a.d(i19, typedArray.getBoolean(index, z10));
                    break;
                case 82:
                    i10 = 82;
                    i20 = aVar.f2958d.f3022c;
                    i11 = typedArray.getInteger(index, i20);
                    c0025a.b(i10, i11);
                    break;
                case 83:
                    i10 = 83;
                    i18 = aVar.f2960f.f3048i;
                    i11 = o(typedArray, index, i18);
                    c0025a.b(i10, i11);
                    break;
                case 84:
                    i10 = 84;
                    i20 = aVar.f2958d.f3030k;
                    i11 = typedArray.getInteger(index, i20);
                    c0025a.b(i10, i11);
                    break;
                case 85:
                    i15 = 85;
                    f12 = aVar.f2958d.f3029j;
                    f10 = typedArray.getFloat(index, f12);
                    c0025a.a(i15, f10);
                    break;
                case 86:
                    int i22 = typedArray.peekValue(index).type;
                    if (i22 == 1) {
                        aVar.f2958d.f3033n = typedArray.getResourceId(index, -1);
                        c0025a.b(89, aVar.f2958d.f3033n);
                        cVar = aVar.f2958d;
                        if (cVar.f3033n == -1) {
                            break;
                        }
                        cVar.f3032m = -2;
                        c0025a.b(88, -2);
                        break;
                    } else if (i22 != 3) {
                        c cVar2 = aVar.f2958d;
                        cVar2.f3032m = typedArray.getInteger(index, cVar2.f3033n);
                        c0025a.b(88, aVar.f2958d.f3032m);
                        break;
                    } else {
                        aVar.f2958d.f3031l = typedArray.getString(index);
                        c0025a.c(90, aVar.f2958d.f3031l);
                        if (aVar.f2958d.f3031l.indexOf("/") <= 0) {
                            aVar.f2958d.f3032m = -1;
                            c0025a.b(88, -1);
                            break;
                        } else {
                            aVar.f2958d.f3033n = typedArray.getResourceId(index, -1);
                            c0025a.b(89, aVar.f2958d.f3033n);
                            cVar = aVar.f2958d;
                            cVar.f3032m = -2;
                            c0025a.b(88, -2);
                        }
                    }
                case 87:
                    sb2 = new StringBuilder();
                    str = "unused attribute 0x";
                    sb2.append(str);
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f2948g.get(index));
                    Log.w("ConstraintSet", sb2.toString());
                    break;
                case 93:
                    i10 = 93;
                    i12 = aVar.f2959e.N;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 94:
                    i10 = 94;
                    i12 = aVar.f2959e.U;
                    i11 = typedArray.getDimensionPixelSize(index, i12);
                    c0025a.b(i10, i11);
                    break;
                case 95:
                    p(c0025a, typedArray, index, 0);
                    break;
                case 96:
                    p(c0025a, typedArray, index, 1);
                    break;
                case 97:
                    i10 = 97;
                    i17 = aVar.f2959e.f3009q0;
                    i11 = typedArray.getInt(index, i17);
                    c0025a.b(i10, i11);
                    break;
                case 98:
                    if (androidx.constraintlayout.motion.widget.j.f2784g5) {
                        int resourceId = typedArray.getResourceId(index, aVar.f2955a);
                        aVar.f2955a = resourceId;
                        if (resourceId != -1) {
                            break;
                        }
                        aVar.f2956b = typedArray.getString(index);
                        break;
                    } else {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.f2955a = typedArray.getResourceId(index, aVar.f2955a);
                            break;
                        }
                        aVar.f2956b = typedArray.getString(index);
                    }
                case 99:
                    i19 = 99;
                    z10 = aVar.f2959e.f2992i;
                    c0025a.d(i19, typedArray.getBoolean(index, z10));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintLayout constraintLayout, boolean z10) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2954e.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f2954e.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.b(childAt));
            } else if (this.f2953d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id2 != -1) {
                    if (this.f2954e.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f2954e.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f2959e.f2995j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f2959e.f2991h0);
                                barrier.setMargin(aVar.f2959e.f2993i0);
                                barrier.setAllowsGoneWidget(aVar.f2959e.f3007p0);
                                b bVar = aVar.f2959e;
                                int[] iArr = bVar.f2997k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f2999l0;
                                    if (str != null) {
                                        bVar.f2997k0 = j(barrier, str);
                                        barrier.setReferencedIds(aVar.f2959e.f2997k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.d(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.a.e(childAt, aVar.f2961g);
                            }
                            childAt.setLayoutParams(bVar2);
                            C0026d c0026d = aVar.f2957c;
                            if (c0026d.f3036c == 0) {
                                childAt.setVisibility(c0026d.f3035b);
                            }
                            childAt.setAlpha(aVar.f2957c.f3037d);
                            childAt.setRotation(aVar.f2960f.f3041b);
                            childAt.setRotationX(aVar.f2960f.f3042c);
                            childAt.setRotationY(aVar.f2960f.f3043d);
                            childAt.setScaleX(aVar.f2960f.f3044e);
                            childAt.setScaleY(aVar.f2960f.f3045f);
                            e eVar = aVar.f2960f;
                            if (eVar.f3048i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f2960f.f3048i) != null) {
                                    float top = (findViewById.getTop() + findViewById.getBottom()) / 2.0f;
                                    float left = (findViewById.getLeft() + findViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f3046g)) {
                                    childAt.setPivotX(aVar.f2960f.f3046g);
                                }
                                if (!Float.isNaN(aVar.f2960f.f3047h)) {
                                    childAt.setPivotY(aVar.f2960f.f3047h);
                                }
                            }
                            childAt.setTranslationX(aVar.f2960f.f3049j);
                            childAt.setTranslationY(aVar.f2960f.f3050k);
                            childAt.setTranslationZ(aVar.f2960f.f3051l);
                            e eVar2 = aVar.f2960f;
                            if (eVar2.f3052m) {
                                childAt.setElevation(eVar2.f3053n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f2954e.get(num);
            if (aVar2 != null) {
                if (aVar2.f2959e.f2995j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f2959e;
                    int[] iArr2 = bVar3.f2997k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f2999l0;
                        if (str2 != null) {
                            bVar3.f2997k0 = j(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f2959e.f2997k0);
                        }
                    }
                    barrier2.setType(aVar2.f2959e.f2991h0);
                    barrier2.setMargin(aVar2.f2959e.f2993i0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.s();
                    aVar2.d(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.f2959e.f2976a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.d(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(int i10, int i11) {
        a aVar;
        if (!this.f2954e.containsKey(Integer.valueOf(i10)) || (aVar = this.f2954e.get(Integer.valueOf(i10))) == null) {
            return;
        }
        switch (i11) {
            case 1:
                b bVar = aVar.f2959e;
                bVar.f2996k = -1;
                bVar.f2994j = -1;
                bVar.H = -1;
                bVar.O = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.f2959e;
                bVar2.f3000m = -1;
                bVar2.f2998l = -1;
                bVar2.I = -1;
                bVar2.Q = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.f2959e;
                bVar3.f3004o = -1;
                bVar3.f3002n = -1;
                bVar3.J = 0;
                bVar3.P = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.f2959e;
                bVar4.f3006p = -1;
                bVar4.f3008q = -1;
                bVar4.K = 0;
                bVar4.R = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.f2959e;
                bVar5.f3010r = -1;
                bVar5.f3011s = -1;
                bVar5.f3012t = -1;
                bVar5.N = 0;
                bVar5.U = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.f2959e;
                bVar6.f3013u = -1;
                bVar6.f3014v = -1;
                bVar6.M = 0;
                bVar6.T = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = aVar.f2959e;
                bVar7.f3015w = -1;
                bVar7.f3016x = -1;
                bVar7.L = 0;
                bVar7.S = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.f2959e;
                bVar8.D = -1.0f;
                bVar8.C = -1;
                bVar8.B = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void f(Context context, int i10) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2954e.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2953d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2954e.containsKey(Integer.valueOf(id2))) {
                this.f2954e.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f2954e.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f2961g = androidx.constraintlayout.widget.a.a(this.f2952c, childAt);
                aVar.f(id2, bVar);
                aVar.f2957c.f3035b = childAt.getVisibility();
                aVar.f2957c.f3037d = childAt.getAlpha();
                aVar.f2960f.f3041b = childAt.getRotation();
                aVar.f2960f.f3042c = childAt.getRotationX();
                aVar.f2960f.f3043d = childAt.getRotationY();
                aVar.f2960f.f3044e = childAt.getScaleX();
                aVar.f2960f.f3045f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f2960f;
                    eVar.f3046g = pivotX;
                    eVar.f3047h = pivotY;
                }
                aVar.f2960f.f3049j = childAt.getTranslationX();
                aVar.f2960f.f3050k = childAt.getTranslationY();
                aVar.f2960f.f3051l = childAt.getTranslationZ();
                e eVar2 = aVar.f2960f;
                if (eVar2.f3052m) {
                    eVar2.f3053n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f2959e.f3007p0 = barrier.getAllowsGoneWidget();
                    aVar.f2959e.f2997k0 = barrier.getReferencedIds();
                    aVar.f2959e.f2991h0 = barrier.getType();
                    aVar.f2959e.f2993i0 = barrier.getMargin();
                }
            }
        }
    }

    public void h(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        this.f2954e.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = eVar.getChildAt(i10);
            e.a aVar = (e.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2953d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2954e.containsKey(Integer.valueOf(id2))) {
                this.f2954e.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f2954e.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.h((androidx.constraintlayout.widget.b) childAt, id2, aVar);
                }
                aVar2.g(id2, aVar);
            }
        }
    }

    public void i(int i10, int i11, int i12, float f10) {
        b bVar = l(i10).f2959e;
        bVar.B = i11;
        bVar.C = i12;
        bVar.D = f10;
    }

    public void m(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a k10 = k(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        k10.f2959e.f2976a = true;
                    }
                    this.f2954e.put(Integer.valueOf(k10.f2955a), k10);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01cb, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.n(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
