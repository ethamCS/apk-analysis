package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class e {

    /* renamed from: d */
    private static final int[] f791d = {0, 4, 8};

    /* renamed from: e */
    private static SparseIntArray f792e;

    /* renamed from: a */
    private HashMap<String, androidx.constraintlayout.widget.b> f793a = new HashMap<>();

    /* renamed from: b */
    private boolean f794b = true;

    /* renamed from: c */
    private HashMap<Integer, a> f795c = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        int f796a;

        /* renamed from: b */
        public final d f797b = new d();

        /* renamed from: c */
        public final c f798c = new c();

        /* renamed from: d */
        public final b f799d = new b();

        /* renamed from: e */
        public final C0013e f800e = new C0013e();

        /* renamed from: f */
        public HashMap<String, androidx.constraintlayout.widget.b> f801f = new HashMap<>();

        public void f(int i, ConstraintLayout.b bVar) {
            this.f796a = i;
            b bVar2 = this.f799d;
            bVar2.f809h = bVar.f743d;
            bVar2.i = bVar.f744e;
            bVar2.j = bVar.f745f;
            bVar2.k = bVar.f746g;
            bVar2.l = bVar.f747h;
            bVar2.m = bVar.i;
            bVar2.n = bVar.j;
            bVar2.o = bVar.k;
            bVar2.p = bVar.l;
            bVar2.q = bVar.p;
            bVar2.r = bVar.q;
            bVar2.s = bVar.r;
            bVar2.t = bVar.s;
            bVar2.u = bVar.z;
            bVar2.v = bVar.A;
            bVar2.w = bVar.B;
            bVar2.x = bVar.m;
            bVar2.y = bVar.n;
            bVar2.z = bVar.o;
            bVar2.A = bVar.P;
            bVar2.B = bVar.Q;
            bVar2.C = bVar.R;
            bVar2.f808g = bVar.f742c;
            bVar2.f806e = bVar.f740a;
            bVar2.f807f = bVar.f741b;
            b bVar3 = this.f799d;
            bVar3.f804c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar3.f805d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar3.D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar3.E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar3.F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar3.G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar3.P = bVar.E;
            bVar3.Q = bVar.D;
            bVar3.S = bVar.G;
            bVar3.R = bVar.F;
            bVar3.h0 = bVar.S;
            bVar3.i0 = bVar.T;
            bVar3.T = bVar.H;
            bVar3.U = bVar.I;
            bVar3.V = bVar.L;
            bVar3.W = bVar.M;
            bVar3.X = bVar.J;
            bVar3.Y = bVar.K;
            bVar3.Z = bVar.N;
            bVar3.a0 = bVar.O;
            bVar3.g0 = bVar.U;
            bVar3.K = bVar.u;
            bVar3.M = bVar.w;
            bVar3.J = bVar.t;
            bVar3.L = bVar.v;
            b bVar4 = this.f799d;
            bVar4.O = bVar.x;
            bVar4.N = bVar.y;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar4.H = bVar.getMarginEnd();
                this.f799d.I = bVar.getMarginStart();
            }
        }

        public void g(int i, f.a aVar) {
            f(i, aVar);
            this.f797b.f821d = aVar.o0;
            C0013e c0013e = this.f800e;
            c0013e.f824b = aVar.r0;
            c0013e.f825c = aVar.s0;
            c0013e.f826d = aVar.t0;
            c0013e.f827e = aVar.u0;
            c0013e.f828f = aVar.v0;
            c0013e.f829g = aVar.w0;
            c0013e.f830h = aVar.x0;
            c0013e.i = aVar.y0;
            c0013e.j = aVar.z0;
            c0013e.k = aVar.A0;
            c0013e.m = aVar.q0;
            c0013e.l = aVar.p0;
        }

        public void h(androidx.constraintlayout.widget.c cVar, int i, f.a aVar) {
            g(i, aVar);
            if (cVar instanceof androidx.constraintlayout.widget.a) {
                b bVar = this.f799d;
                bVar.d0 = 1;
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) cVar;
                bVar.b0 = aVar2.getType();
                this.f799d.e0 = aVar2.getReferencedIds();
                this.f799d.c0 = aVar2.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f799d;
            bVar.f743d = bVar2.f809h;
            bVar.f744e = bVar2.i;
            bVar.f745f = bVar2.j;
            bVar.f746g = bVar2.k;
            bVar.f747h = bVar2.l;
            bVar.i = bVar2.m;
            bVar.j = bVar2.n;
            bVar.k = bVar2.o;
            bVar.l = bVar2.p;
            bVar.p = bVar2.q;
            bVar.q = bVar2.r;
            bVar.r = bVar2.s;
            bVar.s = bVar2.t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.G;
            bVar.x = bVar2.O;
            bVar.y = bVar2.N;
            bVar.u = bVar2.K;
            bVar.w = bVar2.M;
            bVar.z = bVar2.u;
            bVar.A = bVar2.v;
            bVar.m = bVar2.x;
            bVar.n = bVar2.y;
            b bVar3 = this.f799d;
            bVar.o = bVar3.z;
            bVar.B = bVar3.w;
            bVar.P = bVar3.A;
            bVar.Q = bVar3.B;
            bVar.E = bVar3.P;
            bVar.D = bVar3.Q;
            bVar.G = bVar3.S;
            bVar.F = bVar3.R;
            bVar.S = bVar3.h0;
            bVar.T = bVar3.i0;
            bVar.H = bVar3.T;
            bVar.I = bVar3.U;
            bVar.L = bVar3.V;
            bVar.M = bVar3.W;
            bVar.J = bVar3.X;
            bVar.K = bVar3.Y;
            bVar.N = bVar3.Z;
            bVar.O = bVar3.a0;
            bVar.R = bVar3.C;
            bVar.f742c = bVar3.f808g;
            bVar.f740a = bVar3.f806e;
            bVar.f741b = bVar3.f807f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar3.f804c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar3.f805d;
            String str = bVar3.g0;
            if (str != null) {
                bVar.U = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(this.f799d.I);
                bVar.setMarginEnd(this.f799d.H);
            }
            bVar.a();
        }

        /* renamed from: e */
        public a clone() {
            a aVar = new a();
            aVar.f799d.a(this.f799d);
            aVar.f798c.a(this.f798c);
            aVar.f797b.a(this.f797b);
            aVar.f800e.a(this.f800e);
            aVar.f796a = this.f796a;
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        private static SparseIntArray k0;

        /* renamed from: c */
        public int f804c;

        /* renamed from: d */
        public int f805d;
        public int[] e0;
        public String f0;
        public String g0;

        /* renamed from: a */
        public boolean f802a = false;

        /* renamed from: b */
        public boolean f803b = false;

        /* renamed from: e */
        public int f806e = -1;

        /* renamed from: f */
        public int f807f = -1;

        /* renamed from: g */
        public float f808g = -1.0f;

        /* renamed from: h */
        public int f809h = -1;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public float u = 0.5f;
        public float v = 0.5f;
        public String w = null;
        public int x = -1;
        public int y = 0;
        public float z = 0.0f;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;
        public float a0 = 1.0f;
        public int b0 = -1;
        public int c0 = 0;
        public int d0 = -1;
        public boolean h0 = false;
        public boolean i0 = false;
        public boolean j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            k0 = sparseIntArray;
            sparseIntArray.append(j.c3, 24);
            k0.append(j.d3, 25);
            k0.append(j.f3, 28);
            k0.append(j.g3, 29);
            k0.append(j.l3, 35);
            k0.append(j.k3, 34);
            k0.append(j.N2, 4);
            k0.append(j.M2, 3);
            k0.append(j.K2, 1);
            k0.append(j.q3, 6);
            k0.append(j.r3, 7);
            k0.append(j.U2, 17);
            k0.append(j.V2, 18);
            k0.append(j.W2, 19);
            k0.append(j.v2, 26);
            k0.append(j.h3, 31);
            k0.append(j.i3, 32);
            k0.append(j.T2, 10);
            k0.append(j.S2, 9);
            k0.append(j.u3, 13);
            k0.append(j.x3, 16);
            k0.append(j.v3, 14);
            k0.append(j.s3, 11);
            k0.append(j.w3, 15);
            k0.append(j.t3, 12);
            k0.append(j.o3, 38);
            k0.append(j.a3, 37);
            k0.append(j.Z2, 39);
            k0.append(j.n3, 40);
            k0.append(j.Y2, 20);
            k0.append(j.m3, 36);
            k0.append(j.R2, 5);
            k0.append(j.b3, 76);
            k0.append(j.j3, 76);
            k0.append(j.e3, 76);
            k0.append(j.L2, 76);
            k0.append(j.J2, 76);
            k0.append(j.y2, 23);
            k0.append(j.A2, 27);
            k0.append(j.C2, 30);
            k0.append(j.D2, 8);
            k0.append(j.z2, 33);
            k0.append(j.B2, 2);
            k0.append(j.w2, 22);
            k0.append(j.x2, 21);
            k0.append(j.O2, 61);
            k0.append(j.Q2, 62);
            k0.append(j.P2, 63);
            k0.append(j.p3, 69);
            k0.append(j.X2, 70);
            k0.append(j.H2, 71);
            k0.append(j.F2, 72);
            k0.append(j.G2, 73);
            k0.append(j.I2, 74);
            k0.append(j.E2, 75);
        }

        public void a(b bVar) {
            this.f802a = bVar.f802a;
            this.f804c = bVar.f804c;
            this.f803b = bVar.f803b;
            this.f805d = bVar.f805d;
            this.f806e = bVar.f806e;
            this.f807f = bVar.f807f;
            this.f808g = bVar.f808g;
            this.f809h = bVar.f809h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
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
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.g0 = bVar.g0;
            int[] iArr = bVar.e0;
            if (iArr != null) {
                this.e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.e0 = null;
            }
            this.f0 = bVar.f0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
        }

        void b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            int i = Build.VERSION.SDK_INT;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.u2);
            this.f803b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = k0.get(index);
                if (i3 == 80) {
                    this.h0 = obtainStyledAttributes.getBoolean(index, this.h0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            this.p = e.m(obtainStyledAttributes, index, this.p);
                            continue;
                        case 2:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            continue;
                        case 3:
                            this.o = e.m(obtainStyledAttributes, index, this.o);
                            continue;
                        case 4:
                            this.n = e.m(obtainStyledAttributes, index, this.n);
                            continue;
                        case 5:
                            this.w = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            continue;
                        case 7:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            continue;
                        case 8:
                            if (i >= 17) {
                                this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            this.t = e.m(obtainStyledAttributes, index, this.t);
                            continue;
                        case 10:
                            this.s = e.m(obtainStyledAttributes, index, this.s);
                            continue;
                        case 11:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        case 12:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        case 13:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        case 14:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        case 15:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            continue;
                        case 16:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        case 17:
                            this.f806e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f806e);
                            continue;
                        case 18:
                            this.f807f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f807f);
                            continue;
                        case 19:
                            this.f808g = obtainStyledAttributes.getFloat(index, this.f808g);
                            continue;
                        case 20:
                            this.u = obtainStyledAttributes.getFloat(index, this.u);
                            continue;
                        case 21:
                            this.f805d = obtainStyledAttributes.getLayoutDimension(index, this.f805d);
                            continue;
                        case 22:
                            this.f804c = obtainStyledAttributes.getLayoutDimension(index, this.f804c);
                            continue;
                        case 23:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            continue;
                        case 24:
                            this.f809h = e.m(obtainStyledAttributes, index, this.f809h);
                            continue;
                        case 25:
                            this.i = e.m(obtainStyledAttributes, index, this.i);
                            continue;
                        case 26:
                            this.C = obtainStyledAttributes.getInt(index, this.C);
                            continue;
                        case 27:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            continue;
                        case 28:
                            this.j = e.m(obtainStyledAttributes, index, this.j);
                            continue;
                        case 29:
                            this.k = e.m(obtainStyledAttributes, index, this.k);
                            continue;
                        case 30:
                            if (i >= 17) {
                                this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                                break;
                            } else {
                                continue;
                            }
                        case 31:
                            this.q = e.m(obtainStyledAttributes, index, this.q);
                            continue;
                        case 32:
                            this.r = e.m(obtainStyledAttributes, index, this.r);
                            continue;
                        case 33:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            continue;
                        case 34:
                            this.m = e.m(obtainStyledAttributes, index, this.m);
                            continue;
                        case 35:
                            this.l = e.m(obtainStyledAttributes, index, this.l);
                            continue;
                        case 36:
                            this.v = obtainStyledAttributes.getFloat(index, this.v);
                            continue;
                        case 37:
                            this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                            continue;
                        case 38:
                            this.P = obtainStyledAttributes.getFloat(index, this.P);
                            continue;
                        case 39:
                            this.R = obtainStyledAttributes.getInt(index, this.R);
                            continue;
                        case 40:
                            this.S = obtainStyledAttributes.getInt(index, this.S);
                            continue;
                        default:
                            switch (i3) {
                                case 54:
                                    this.T = obtainStyledAttributes.getInt(index, this.T);
                                    continue;
                                case 55:
                                    this.U = obtainStyledAttributes.getInt(index, this.U);
                                    continue;
                                case 56:
                                    this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    continue;
                                case 57:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    continue;
                                case 58:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    continue;
                                case 59:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    continue;
                                default:
                                    switch (i3) {
                                        case 61:
                                            this.x = e.m(obtainStyledAttributes, index, this.x);
                                            continue;
                                        case 62:
                                            this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                                            continue;
                                        case 63:
                                            this.z = obtainStyledAttributes.getFloat(index, this.z);
                                            continue;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.b0 = obtainStyledAttributes.getInt(index, this.b0);
                                                    break;
                                                case 73:
                                                    this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                                    break;
                                                case 74:
                                                    this.f0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.j0 = obtainStyledAttributes.getBoolean(index, this.j0);
                                                    break;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(k0.get(index));
                                                    Log.w("ConstraintSet", sb.toString());
                                                    continue;
                                                    continue;
                                                    continue;
                                                case 77:
                                                    this.g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(k0.get(index));
                                                    Log.w("ConstraintSet", sb.toString());
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                    }
                            }
                    }
                } else {
                    this.i0 = obtainStyledAttributes.getBoolean(index, this.i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: h */
        private static SparseIntArray f810h;

        /* renamed from: a */
        public boolean f811a = false;

        /* renamed from: b */
        public int f812b = -1;

        /* renamed from: c */
        public String f813c = null;

        /* renamed from: d */
        public int f814d = -1;

        /* renamed from: e */
        public int f815e = 0;

        /* renamed from: f */
        public float f816f = Float.NaN;

        /* renamed from: g */
        public float f817g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f810h = sparseIntArray;
            sparseIntArray.append(j.B3, 1);
            f810h.append(j.D3, 2);
            f810h.append(j.E3, 3);
            f810h.append(j.A3, 4);
            f810h.append(j.z3, 5);
            f810h.append(j.C3, 6);
        }

        public void a(c cVar) {
            this.f811a = cVar.f811a;
            this.f812b = cVar.f812b;
            this.f813c = cVar.f813c;
            this.f814d = cVar.f814d;
            this.f815e = cVar.f815e;
            this.f817g = cVar.f817g;
            this.f816f = cVar.f816f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.y3);
            this.f811a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f810h.get(index)) {
                    case 1:
                        this.f817g = obtainStyledAttributes.getFloat(index, this.f817g);
                        break;
                    case 2:
                        this.f814d = obtainStyledAttributes.getInt(index, this.f814d);
                        break;
                    case 3:
                        this.f813c = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : b.e.a.a.a.f2172a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f815e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f812b = e.m(obtainStyledAttributes, index, this.f812b);
                        break;
                    case 6:
                        this.f816f = obtainStyledAttributes.getFloat(index, this.f816f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public boolean f818a = false;

        /* renamed from: b */
        public int f819b = 0;

        /* renamed from: c */
        public int f820c = 0;

        /* renamed from: d */
        public float f821d = 1.0f;

        /* renamed from: e */
        public float f822e = Float.NaN;

        public void a(d dVar) {
            this.f818a = dVar.f818a;
            this.f819b = dVar.f819b;
            this.f821d = dVar.f821d;
            this.f822e = dVar.f822e;
            this.f820c = dVar.f820c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.F3);
            this.f818a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.H3) {
                    this.f821d = obtainStyledAttributes.getFloat(index, this.f821d);
                } else if (index == j.G3) {
                    this.f819b = obtainStyledAttributes.getInt(index, this.f819b);
                    this.f819b = e.f791d[this.f819b];
                } else if (index == j.J3) {
                    this.f820c = obtainStyledAttributes.getInt(index, this.f820c);
                } else if (index == j.I3) {
                    this.f822e = obtainStyledAttributes.getFloat(index, this.f822e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e */
    /* loaded from: classes.dex */
    public static class C0013e {
        private static SparseIntArray n;

        /* renamed from: a */
        public boolean f823a = false;

        /* renamed from: b */
        public float f824b = 0.0f;

        /* renamed from: c */
        public float f825c = 0.0f;

        /* renamed from: d */
        public float f826d = 0.0f;

        /* renamed from: e */
        public float f827e = 1.0f;

        /* renamed from: f */
        public float f828f = 1.0f;

        /* renamed from: g */
        public float f829g = Float.NaN;

        /* renamed from: h */
        public float f830h = Float.NaN;
        public float i = 0.0f;
        public float j = 0.0f;
        public float k = 0.0f;
        public boolean l = false;
        public float m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(j.U3, 1);
            n.append(j.V3, 2);
            n.append(j.W3, 3);
            n.append(j.S3, 4);
            n.append(j.T3, 5);
            n.append(j.O3, 6);
            n.append(j.P3, 7);
            n.append(j.Q3, 8);
            n.append(j.R3, 9);
            n.append(j.X3, 10);
            n.append(j.Y3, 11);
        }

        public void a(C0013e c0013e) {
            this.f823a = c0013e.f823a;
            this.f824b = c0013e.f824b;
            this.f825c = c0013e.f825c;
            this.f826d = c0013e.f826d;
            this.f827e = c0013e.f827e;
            this.f828f = c0013e.f828f;
            this.f829g = c0013e.f829g;
            this.f830h = c0013e.f830h;
            this.i = c0013e.i;
            this.j = c0013e.j;
            this.k = c0013e.k;
            this.l = c0013e.l;
            this.m = c0013e.m;
        }

        void b(Context context, AttributeSet attributeSet) {
            int i = Build.VERSION.SDK_INT;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.N3);
            this.f823a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (n.get(index)) {
                    case 1:
                        this.f824b = obtainStyledAttributes.getFloat(index, this.f824b);
                        break;
                    case 2:
                        this.f825c = obtainStyledAttributes.getFloat(index, this.f825c);
                        break;
                    case 3:
                        this.f826d = obtainStyledAttributes.getFloat(index, this.f826d);
                        break;
                    case 4:
                        this.f827e = obtainStyledAttributes.getFloat(index, this.f827e);
                        break;
                    case 5:
                        this.f828f = obtainStyledAttributes.getFloat(index, this.f828f);
                        break;
                    case 6:
                        this.f829g = obtainStyledAttributes.getDimension(index, this.f829g);
                        break;
                    case 7:
                        this.f830h = obtainStyledAttributes.getDimension(index, this.f830h);
                        break;
                    case 8:
                        this.i = obtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 9:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 10:
                        if (i >= 21) {
                            this.k = obtainStyledAttributes.getDimension(index, this.k);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (i >= 21) {
                            this.l = true;
                            this.m = obtainStyledAttributes.getDimension(index, this.m);
                            break;
                        } else {
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f792e = sparseIntArray;
        sparseIntArray.append(j.d0, 25);
        f792e.append(j.e0, 26);
        f792e.append(j.g0, 29);
        f792e.append(j.h0, 30);
        f792e.append(j.n0, 36);
        f792e.append(j.m0, 35);
        f792e.append(j.L, 4);
        f792e.append(j.K, 3);
        f792e.append(j.I, 1);
        f792e.append(j.v0, 6);
        f792e.append(j.w0, 7);
        f792e.append(j.S, 17);
        f792e.append(j.T, 18);
        f792e.append(j.U, 19);
        f792e.append(j.f836b, 27);
        f792e.append(j.i0, 32);
        f792e.append(j.j0, 33);
        f792e.append(j.R, 10);
        f792e.append(j.Q, 9);
        f792e.append(j.z0, 13);
        f792e.append(j.C0, 16);
        f792e.append(j.A0, 14);
        f792e.append(j.x0, 11);
        f792e.append(j.B0, 15);
        f792e.append(j.y0, 12);
        f792e.append(j.q0, 40);
        f792e.append(j.b0, 39);
        f792e.append(j.a0, 41);
        f792e.append(j.p0, 42);
        f792e.append(j.Z, 20);
        f792e.append(j.o0, 37);
        f792e.append(j.P, 5);
        f792e.append(j.c0, 82);
        f792e.append(j.l0, 82);
        f792e.append(j.f0, 82);
        f792e.append(j.J, 82);
        f792e.append(j.H, 82);
        f792e.append(j.f841g, 24);
        f792e.append(j.i, 28);
        f792e.append(j.u, 31);
        f792e.append(j.v, 8);
        f792e.append(j.f842h, 34);
        f792e.append(j.j, 2);
        f792e.append(j.f839e, 23);
        f792e.append(j.f840f, 21);
        f792e.append(j.f838d, 22);
        f792e.append(j.k, 43);
        f792e.append(j.x, 44);
        f792e.append(j.s, 45);
        f792e.append(j.t, 46);
        f792e.append(j.r, 60);
        f792e.append(j.p, 47);
        f792e.append(j.q, 48);
        f792e.append(j.l, 49);
        f792e.append(j.m, 50);
        f792e.append(j.n, 51);
        f792e.append(j.o, 52);
        f792e.append(j.w, 53);
        f792e.append(j.r0, 54);
        f792e.append(j.V, 55);
        f792e.append(j.s0, 56);
        f792e.append(j.W, 57);
        f792e.append(j.t0, 58);
        f792e.append(j.X, 59);
        f792e.append(j.M, 61);
        f792e.append(j.O, 62);
        f792e.append(j.N, 63);
        f792e.append(j.y, 64);
        f792e.append(j.G0, 65);
        f792e.append(j.E, 66);
        f792e.append(j.H0, 67);
        f792e.append(j.E0, 79);
        f792e.append(j.f837c, 38);
        f792e.append(j.D0, 68);
        f792e.append(j.u0, 69);
        f792e.append(j.Y, 70);
        f792e.append(j.C, 71);
        f792e.append(j.A, 72);
        f792e.append(j.B, 73);
        f792e.append(j.D, 74);
        f792e.append(j.z, 75);
        f792e.append(j.F0, 76);
        f792e.append(j.k0, 77);
        f792e.append(j.I0, 78);
        f792e.append(j.G, 80);
        f792e.append(j.F, 81);
    }

    private int[] i(View view, String str) {
        int i;
        Object f2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = i.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (f2 = ((ConstraintLayout) view.getParent()).f(0, trim)) != null && (f2 instanceof Integer)) {
                i = ((Integer) f2).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private a j(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f835a);
        n(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int m(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private void n(Context context, a aVar, TypedArray typedArray) {
        c cVar;
        String str;
        String str2;
        StringBuilder sb;
        int i = Build.VERSION.SDK_INT;
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index != j.f837c && j.u != index && j.v != index) {
                aVar.f798c.f811a = true;
                aVar.f799d.f803b = true;
                aVar.f797b.f818a = true;
                aVar.f800e.f823a = true;
            }
            switch (f792e.get(index)) {
                case 1:
                    b bVar = aVar.f799d;
                    bVar.p = m(typedArray, index, bVar.p);
                    continue;
                case 2:
                    b bVar2 = aVar.f799d;
                    bVar2.G = typedArray.getDimensionPixelSize(index, bVar2.G);
                    continue;
                case 3:
                    b bVar3 = aVar.f799d;
                    bVar3.o = m(typedArray, index, bVar3.o);
                    continue;
                case 4:
                    b bVar4 = aVar.f799d;
                    bVar4.n = m(typedArray, index, bVar4.n);
                    continue;
                case 5:
                    aVar.f799d.w = typedArray.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.f799d;
                    bVar5.A = typedArray.getDimensionPixelOffset(index, bVar5.A);
                    continue;
                case 7:
                    b bVar6 = aVar.f799d;
                    bVar6.B = typedArray.getDimensionPixelOffset(index, bVar6.B);
                    continue;
                case 8:
                    if (i >= 17) {
                        b bVar7 = aVar.f799d;
                        bVar7.H = typedArray.getDimensionPixelSize(index, bVar7.H);
                    } else {
                        continue;
                    }
                case 9:
                    b bVar8 = aVar.f799d;
                    bVar8.t = m(typedArray, index, bVar8.t);
                    continue;
                case 10:
                    b bVar9 = aVar.f799d;
                    bVar9.s = m(typedArray, index, bVar9.s);
                    continue;
                case 11:
                    b bVar10 = aVar.f799d;
                    bVar10.M = typedArray.getDimensionPixelSize(index, bVar10.M);
                    continue;
                case 12:
                    b bVar11 = aVar.f799d;
                    bVar11.N = typedArray.getDimensionPixelSize(index, bVar11.N);
                    continue;
                case 13:
                    b bVar12 = aVar.f799d;
                    bVar12.J = typedArray.getDimensionPixelSize(index, bVar12.J);
                    continue;
                case 14:
                    b bVar13 = aVar.f799d;
                    bVar13.L = typedArray.getDimensionPixelSize(index, bVar13.L);
                    continue;
                case 15:
                    b bVar14 = aVar.f799d;
                    bVar14.O = typedArray.getDimensionPixelSize(index, bVar14.O);
                    continue;
                case 16:
                    b bVar15 = aVar.f799d;
                    bVar15.K = typedArray.getDimensionPixelSize(index, bVar15.K);
                    continue;
                case 17:
                    b bVar16 = aVar.f799d;
                    bVar16.f806e = typedArray.getDimensionPixelOffset(index, bVar16.f806e);
                    continue;
                case 18:
                    b bVar17 = aVar.f799d;
                    bVar17.f807f = typedArray.getDimensionPixelOffset(index, bVar17.f807f);
                    continue;
                case 19:
                    b bVar18 = aVar.f799d;
                    bVar18.f808g = typedArray.getFloat(index, bVar18.f808g);
                    continue;
                case 20:
                    b bVar19 = aVar.f799d;
                    bVar19.u = typedArray.getFloat(index, bVar19.u);
                    continue;
                case 21:
                    b bVar20 = aVar.f799d;
                    bVar20.f805d = typedArray.getLayoutDimension(index, bVar20.f805d);
                    continue;
                case 22:
                    d dVar = aVar.f797b;
                    dVar.f819b = typedArray.getInt(index, dVar.f819b);
                    d dVar2 = aVar.f797b;
                    dVar2.f819b = f791d[dVar2.f819b];
                    continue;
                case 23:
                    b bVar21 = aVar.f799d;
                    bVar21.f804c = typedArray.getLayoutDimension(index, bVar21.f804c);
                    continue;
                case 24:
                    b bVar22 = aVar.f799d;
                    bVar22.D = typedArray.getDimensionPixelSize(index, bVar22.D);
                    continue;
                case 25:
                    b bVar23 = aVar.f799d;
                    bVar23.f809h = m(typedArray, index, bVar23.f809h);
                    continue;
                case 26:
                    b bVar24 = aVar.f799d;
                    bVar24.i = m(typedArray, index, bVar24.i);
                    continue;
                case 27:
                    b bVar25 = aVar.f799d;
                    bVar25.C = typedArray.getInt(index, bVar25.C);
                    continue;
                case 28:
                    b bVar26 = aVar.f799d;
                    bVar26.E = typedArray.getDimensionPixelSize(index, bVar26.E);
                    continue;
                case 29:
                    b bVar27 = aVar.f799d;
                    bVar27.j = m(typedArray, index, bVar27.j);
                    continue;
                case 30:
                    b bVar28 = aVar.f799d;
                    bVar28.k = m(typedArray, index, bVar28.k);
                    continue;
                case 31:
                    if (i >= 17) {
                        b bVar29 = aVar.f799d;
                        bVar29.I = typedArray.getDimensionPixelSize(index, bVar29.I);
                    } else {
                        continue;
                    }
                case 32:
                    b bVar30 = aVar.f799d;
                    bVar30.q = m(typedArray, index, bVar30.q);
                    continue;
                case 33:
                    b bVar31 = aVar.f799d;
                    bVar31.r = m(typedArray, index, bVar31.r);
                    continue;
                case 34:
                    b bVar32 = aVar.f799d;
                    bVar32.F = typedArray.getDimensionPixelSize(index, bVar32.F);
                    continue;
                case 35:
                    b bVar33 = aVar.f799d;
                    bVar33.m = m(typedArray, index, bVar33.m);
                    continue;
                case 36:
                    b bVar34 = aVar.f799d;
                    bVar34.l = m(typedArray, index, bVar34.l);
                    continue;
                case 37:
                    b bVar35 = aVar.f799d;
                    bVar35.v = typedArray.getFloat(index, bVar35.v);
                    continue;
                case 38:
                    aVar.f796a = typedArray.getResourceId(index, aVar.f796a);
                    continue;
                case 39:
                    b bVar36 = aVar.f799d;
                    bVar36.Q = typedArray.getFloat(index, bVar36.Q);
                    continue;
                case 40:
                    b bVar37 = aVar.f799d;
                    bVar37.P = typedArray.getFloat(index, bVar37.P);
                    continue;
                case 41:
                    b bVar38 = aVar.f799d;
                    bVar38.R = typedArray.getInt(index, bVar38.R);
                    continue;
                case 42:
                    b bVar39 = aVar.f799d;
                    bVar39.S = typedArray.getInt(index, bVar39.S);
                    continue;
                case 43:
                    d dVar3 = aVar.f797b;
                    dVar3.f821d = typedArray.getFloat(index, dVar3.f821d);
                    continue;
                case 44:
                    if (i >= 21) {
                        C0013e c0013e = aVar.f800e;
                        c0013e.l = true;
                        c0013e.m = typedArray.getDimension(index, c0013e.m);
                    } else {
                        continue;
                    }
                case 45:
                    C0013e c0013e2 = aVar.f800e;
                    c0013e2.f825c = typedArray.getFloat(index, c0013e2.f825c);
                    continue;
                case 46:
                    C0013e c0013e3 = aVar.f800e;
                    c0013e3.f826d = typedArray.getFloat(index, c0013e3.f826d);
                    continue;
                case 47:
                    C0013e c0013e4 = aVar.f800e;
                    c0013e4.f827e = typedArray.getFloat(index, c0013e4.f827e);
                    continue;
                case 48:
                    C0013e c0013e5 = aVar.f800e;
                    c0013e5.f828f = typedArray.getFloat(index, c0013e5.f828f);
                    continue;
                case 49:
                    C0013e c0013e6 = aVar.f800e;
                    c0013e6.f829g = typedArray.getDimension(index, c0013e6.f829g);
                    continue;
                case 50:
                    C0013e c0013e7 = aVar.f800e;
                    c0013e7.f830h = typedArray.getDimension(index, c0013e7.f830h);
                    continue;
                case 51:
                    C0013e c0013e8 = aVar.f800e;
                    c0013e8.i = typedArray.getDimension(index, c0013e8.i);
                    continue;
                case j.k1 /* 52 */:
                    C0013e c0013e9 = aVar.f800e;
                    c0013e9.j = typedArray.getDimension(index, c0013e9.j);
                    continue;
                case 53:
                    if (i >= 21) {
                        C0013e c0013e10 = aVar.f800e;
                        c0013e10.k = typedArray.getDimension(index, c0013e10.k);
                    } else {
                        continue;
                    }
                case 54:
                    b bVar40 = aVar.f799d;
                    bVar40.T = typedArray.getInt(index, bVar40.T);
                    continue;
                case 55:
                    b bVar41 = aVar.f799d;
                    bVar41.U = typedArray.getInt(index, bVar41.U);
                    continue;
                case 56:
                    b bVar42 = aVar.f799d;
                    bVar42.V = typedArray.getDimensionPixelSize(index, bVar42.V);
                    continue;
                case 57:
                    b bVar43 = aVar.f799d;
                    bVar43.W = typedArray.getDimensionPixelSize(index, bVar43.W);
                    continue;
                case 58:
                    b bVar44 = aVar.f799d;
                    bVar44.X = typedArray.getDimensionPixelSize(index, bVar44.X);
                    continue;
                case 59:
                    b bVar45 = aVar.f799d;
                    bVar45.Y = typedArray.getDimensionPixelSize(index, bVar45.Y);
                    continue;
                case 60:
                    C0013e c0013e11 = aVar.f800e;
                    c0013e11.f824b = typedArray.getFloat(index, c0013e11.f824b);
                    continue;
                case 61:
                    b bVar46 = aVar.f799d;
                    bVar46.x = m(typedArray, index, bVar46.x);
                    continue;
                case 62:
                    b bVar47 = aVar.f799d;
                    bVar47.y = typedArray.getDimensionPixelSize(index, bVar47.y);
                    continue;
                case 63:
                    b bVar48 = aVar.f799d;
                    bVar48.z = typedArray.getFloat(index, bVar48.z);
                    continue;
                case 64:
                    c cVar2 = aVar.f798c;
                    cVar2.f812b = m(typedArray, index, cVar2.f812b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f798c;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f798c;
                        str = b.e.a.a.a.f2172a[typedArray.getInteger(index, 0)];
                    }
                    cVar.f813c = str;
                    continue;
                case 66:
                    aVar.f798c.f815e = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    c cVar3 = aVar.f798c;
                    cVar3.f817g = typedArray.getFloat(index, cVar3.f817g);
                    continue;
                case 68:
                    d dVar4 = aVar.f797b;
                    dVar4.f822e = typedArray.getFloat(index, dVar4.f822e);
                    continue;
                case 69:
                    aVar.f799d.Z = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f799d.a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    b bVar49 = aVar.f799d;
                    bVar49.b0 = typedArray.getInt(index, bVar49.b0);
                    continue;
                case 73:
                    b bVar50 = aVar.f799d;
                    bVar50.c0 = typedArray.getDimensionPixelSize(index, bVar50.c0);
                    continue;
                case 74:
                    aVar.f799d.f0 = typedArray.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.f799d;
                    bVar51.j0 = typedArray.getBoolean(index, bVar51.j0);
                    continue;
                case 76:
                    c cVar4 = aVar.f798c;
                    cVar4.f814d = typedArray.getInt(index, cVar4.f814d);
                    continue;
                case 77:
                    aVar.f799d.g0 = typedArray.getString(index);
                    continue;
                case 78:
                    d dVar5 = aVar.f797b;
                    dVar5.f820c = typedArray.getInt(index, dVar5.f820c);
                    continue;
                case 79:
                    c cVar5 = aVar.f798c;
                    cVar5.f816f = typedArray.getFloat(index, cVar5.f816f);
                    continue;
                case 80:
                    b bVar52 = aVar.f799d;
                    bVar52.h0 = typedArray.getBoolean(index, bVar52.h0);
                    continue;
                case 81:
                    b bVar53 = aVar.f799d;
                    bVar53.i0 = typedArray.getBoolean(index, bVar53.i0);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f792e.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
    }

    private String o(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f795c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f795c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + b.e.a.b.a.a(childAt));
            } else if (this.f794b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (this.f795c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f795c.get(Integer.valueOf(id));
                        if (childAt instanceof androidx.constraintlayout.widget.a) {
                            aVar.f799d.d0 = 1;
                        }
                        int i2 = aVar.f799d.d0;
                        if (i2 != -1 && i2 == 1) {
                            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                            aVar2.setId(id);
                            aVar2.setType(aVar.f799d.b0);
                            aVar2.setMargin(aVar.f799d.c0);
                            aVar2.setAllowsGoneWidget(aVar.f799d.j0);
                            b bVar = aVar.f799d;
                            int[] iArr = bVar.e0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f0;
                                if (str != null) {
                                    bVar.e0 = i(aVar2, str);
                                    aVar2.setReferencedIds(aVar.f799d.e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z) {
                            androidx.constraintlayout.widget.b.c(childAt, aVar.f801f);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f797b;
                        if (dVar.f820c == 0) {
                            childAt.setVisibility(dVar.f819b);
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 17) {
                            childAt.setAlpha(aVar.f797b.f821d);
                            childAt.setRotation(aVar.f800e.f824b);
                            childAt.setRotationX(aVar.f800e.f825c);
                            childAt.setRotationY(aVar.f800e.f826d);
                            childAt.setScaleX(aVar.f800e.f827e);
                            childAt.setScaleY(aVar.f800e.f828f);
                            if (!Float.isNaN(aVar.f800e.f829g)) {
                                childAt.setPivotX(aVar.f800e.f829g);
                            }
                            if (!Float.isNaN(aVar.f800e.f830h)) {
                                childAt.setPivotY(aVar.f800e.f830h);
                            }
                            childAt.setTranslationX(aVar.f800e.i);
                            childAt.setTranslationY(aVar.f800e.j);
                            if (i3 >= 21) {
                                childAt.setTranslationZ(aVar.f800e.k);
                                C0013e c0013e = aVar.f800e;
                                if (c0013e.l) {
                                    childAt.setElevation(c0013e.m);
                                }
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f795c.get(num);
            int i4 = aVar3.f799d.d0;
            if (i4 != -1 && i4 == 1) {
                androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                aVar4.setId(num.intValue());
                b bVar3 = aVar3.f799d;
                int[] iArr2 = bVar3.e0;
                if (iArr2 != null) {
                    aVar4.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f0;
                    if (str2 != null) {
                        bVar3.e0 = i(aVar4, str2);
                        aVar4.setReferencedIds(aVar3.f799d.e0);
                    }
                }
                aVar4.setType(aVar3.f799d.b0);
                aVar4.setMargin(aVar3.f799d.c0);
                ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                aVar4.n();
                aVar3.d(generateDefaultLayoutParams);
                constraintLayout.addView(aVar4, generateDefaultLayoutParams);
            }
            if (aVar3.f799d.f802a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar3.d(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    public void e(Context context, int i) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f795c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f794b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f795c.containsKey(Integer.valueOf(id))) {
                this.f795c.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f795c.get(Integer.valueOf(id));
            aVar.f801f = androidx.constraintlayout.widget.b.a(this.f793a, childAt);
            aVar.f(id, bVar);
            aVar.f797b.f819b = childAt.getVisibility();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 17) {
                aVar.f797b.f821d = childAt.getAlpha();
                aVar.f800e.f824b = childAt.getRotation();
                aVar.f800e.f825c = childAt.getRotationX();
                aVar.f800e.f826d = childAt.getRotationY();
                aVar.f800e.f827e = childAt.getScaleX();
                aVar.f800e.f828f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C0013e c0013e = aVar.f800e;
                    c0013e.f829g = pivotX;
                    c0013e.f830h = pivotY;
                }
                aVar.f800e.i = childAt.getTranslationX();
                aVar.f800e.j = childAt.getTranslationY();
                if (i2 >= 21) {
                    aVar.f800e.k = childAt.getTranslationZ();
                    C0013e c0013e2 = aVar.f800e;
                    if (c0013e2.l) {
                        c0013e2.m = childAt.getElevation();
                    }
                }
            }
            if (childAt instanceof androidx.constraintlayout.widget.a) {
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                aVar.f799d.j0 = aVar2.o();
                aVar.f799d.e0 = aVar2.getReferencedIds();
                aVar.f799d.b0 = aVar2.getType();
                aVar.f799d.c0 = aVar2.getMargin();
            }
        }
    }

    public void g(f fVar) {
        int childCount = fVar.getChildCount();
        this.f795c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = fVar.getChildAt(i);
            f.a aVar = (f.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f794b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f795c.containsKey(Integer.valueOf(id))) {
                this.f795c.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f795c.get(Integer.valueOf(id));
            if (childAt instanceof androidx.constraintlayout.widget.c) {
                aVar2.h((androidx.constraintlayout.widget.c) childAt, id, aVar);
            }
            aVar2.g(id, aVar);
        }
    }

    public void h(int i, int i2, int i3, int i4, int i5) {
        b bVar;
        b bVar2;
        if (!this.f795c.containsKey(Integer.valueOf(i))) {
            this.f795c.put(Integer.valueOf(i), new a());
        }
        a aVar = this.f795c.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    b bVar3 = aVar.f799d;
                    bVar3.f809h = i3;
                    bVar3.i = -1;
                } else if (i4 != 2) {
                    throw new IllegalArgumentException("Left to " + o(i4) + " undefined");
                } else {
                    b bVar4 = aVar.f799d;
                    bVar4.i = i3;
                    bVar4.f809h = -1;
                }
                aVar.f799d.D = i5;
                return;
            case 2:
                if (i4 == 1) {
                    b bVar5 = aVar.f799d;
                    bVar5.j = i3;
                    bVar5.k = -1;
                } else if (i4 != 2) {
                    throw new IllegalArgumentException("right to " + o(i4) + " undefined");
                } else {
                    b bVar6 = aVar.f799d;
                    bVar6.k = i3;
                    bVar6.j = -1;
                }
                aVar.f799d.E = i5;
                return;
            case 3:
                if (i4 == 3) {
                    bVar = aVar.f799d;
                    bVar.l = i3;
                    bVar.m = -1;
                } else if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + o(i4) + " undefined");
                } else {
                    bVar = aVar.f799d;
                    bVar.m = i3;
                    bVar.l = -1;
                }
                bVar.p = -1;
                aVar.f799d.F = i5;
                return;
            case 4:
                if (i4 == 4) {
                    bVar2 = aVar.f799d;
                    bVar2.o = i3;
                    bVar2.n = -1;
                } else if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + o(i4) + " undefined");
                } else {
                    bVar2 = aVar.f799d;
                    bVar2.n = i3;
                    bVar2.o = -1;
                }
                bVar2.p = -1;
                aVar.f799d.G = i5;
                return;
            case 5:
                if (i4 != 5) {
                    throw new IllegalArgumentException("right to " + o(i4) + " undefined");
                }
                b bVar7 = aVar.f799d;
                bVar7.p = i3;
                bVar7.o = -1;
                bVar7.n = -1;
                bVar7.l = -1;
                bVar7.m = -1;
                return;
            case 6:
                if (i4 == 6) {
                    b bVar8 = aVar.f799d;
                    bVar8.r = i3;
                    bVar8.q = -1;
                } else if (i4 != 7) {
                    throw new IllegalArgumentException("right to " + o(i4) + " undefined");
                } else {
                    b bVar9 = aVar.f799d;
                    bVar9.q = i3;
                    bVar9.r = -1;
                }
                aVar.f799d.I = i5;
                return;
            case 7:
                if (i4 == 7) {
                    b bVar10 = aVar.f799d;
                    bVar10.t = i3;
                    bVar10.s = -1;
                } else if (i4 != 6) {
                    throw new IllegalArgumentException("right to " + o(i4) + " undefined");
                } else {
                    b bVar11 = aVar.f799d;
                    bVar11.s = i3;
                    bVar11.t = -1;
                }
                aVar.f799d.H = i5;
                return;
            default:
                throw new IllegalArgumentException(o(i2) + " to " + o(i4) + " unknown");
        }
    }

    public void k(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a j = j(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        j.f799d.f802a = true;
                    }
                    this.f795c.put(Integer.valueOf(j.f796a), j);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0179, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.l(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
