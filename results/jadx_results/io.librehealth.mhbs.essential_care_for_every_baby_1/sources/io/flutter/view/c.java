package io.flutter.view;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.i.b;
import io.flutter.view.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class c extends AccessibilityNodeProvider {
    private static int y = 267386881;

    /* renamed from: a */
    private final View f1266a;

    /* renamed from: b */
    private final io.flutter.embedding.engine.i.b f1267b;

    /* renamed from: c */
    private final AccessibilityManager f1268c;

    /* renamed from: d */
    private final AccessibilityViewEmbedder f1269d;

    /* renamed from: e */
    private final io.flutter.plugin.platform.i f1270e;
    private final ContentResolver f;
    private final Map<Integer, j> g;
    private final Map<Integer, g> h;
    private j i;
    private Integer j;
    private Integer k;
    private int l;
    private j m;
    private j n;
    private j o;
    private final List<Integer> p;
    private int q;
    private Integer r;
    private i s;
    private boolean t;
    private final b.AbstractC0052b u;
    private final AccessibilityManager.AccessibilityStateChangeListener v;
    @TargetApi(19)
    private final AccessibilityManager.TouchExplorationStateChangeListener w;
    private final ContentObserver x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b.AbstractC0052b {
        a() {
            c.this = r1;
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void a(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            c.this.O(byteBuffer, strArr);
        }

        @Override // io.flutter.embedding.engine.i.b.AbstractC0052b
        public void b(String str) {
            AccessibilityEvent A = c.this.A(0, 32);
            A.getText().add(str);
            c.this.I(A);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void c(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            c.this.P(byteBuffer, strArr);
        }

        @Override // io.flutter.embedding.engine.i.b.AbstractC0052b
        public void d(int i) {
            c.this.H(i, 2);
        }

        @Override // io.flutter.embedding.engine.i.b.AbstractC0052b
        public void e(int i) {
            c.this.H(i, 1);
        }

        @Override // io.flutter.embedding.engine.i.b.AbstractC0052b
        public void f(String str) {
            c.this.f1266a.announceForAccessibility(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements AccessibilityManager.AccessibilityStateChangeListener {
        b() {
            c.this = r1;
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            if (c.this.t) {
                return;
            }
            io.flutter.embedding.engine.i.b bVar = c.this.f1267b;
            if (z) {
                bVar.g(c.this.u);
                c.this.f1267b.e();
            } else {
                bVar.g(null);
                c.this.f1267b.d();
            }
            if (c.this.s == null) {
                return;
            }
            c.this.s.a(z, c.this.f1268c.isTouchExplorationEnabled());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.view.c$c */
    /* loaded from: classes.dex */
    public class C0060c extends ContentObserver {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0060c(Handler handler) {
            super(handler);
            c.this = r1;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            onChange(z, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            int i;
            c cVar;
            if (c.this.t) {
                return;
            }
            String string = Build.VERSION.SDK_INT < 17 ? null : Settings.Global.getString(c.this.f, "transition_animation_scale");
            if (string != null && string.equals("0")) {
                cVar = c.this;
                i = cVar.l | e.DISABLE_ANIMATIONS.f1280a;
            } else {
                cVar = c.this;
                i = cVar.l & (e.DISABLE_ANIMATIONS.f1280a ^ (-1));
            }
            cVar.l = i;
            c.this.J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ AccessibilityManager f1274a;

        d(AccessibilityManager accessibilityManager) {
            c.this = r1;
            this.f1274a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            int i;
            if (c.this.t) {
                return;
            }
            c cVar = c.this;
            if (z) {
                i = cVar.l | e.ACCESSIBLE_NAVIGATION.f1280a;
            } else {
                cVar.C();
                cVar = c.this;
                i = cVar.l & (e.ACCESSIBLE_NAVIGATION.f1280a ^ (-1));
            }
            cVar.l = i;
            c.this.J();
            if (c.this.s == null) {
                return;
            }
            c.this.s.a(this.f1274a.isEnabled(), z);
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4);
        

        /* renamed from: a */
        final int f1280a;

        e(int i) {
            this.f1280a = i;
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);
        

        /* renamed from: a */
        public final int f1285a;

        f(int i) {
            this.f1285a = i;
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a */
        private int f1286a = -1;

        /* renamed from: b */
        private int f1287b = -1;

        /* renamed from: c */
        private int f1288c = -1;

        /* renamed from: d */
        private String f1289d;

        /* renamed from: e */
        private String f1290e;

        g() {
        }
    }

    /* loaded from: classes.dex */
    public enum h {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216);
        

        /* renamed from: a */
        final int f1295a;

        h(int i) {
            this.f1295a = i;
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(boolean z, boolean z2);
    }

    /* loaded from: classes.dex */
    public static class j {
        private String A;
        private float B;
        private float C;
        private float D;
        private float E;
        private float[] F;
        private j G;
        private List<g> J;
        private g K;
        private g L;
        private float[] N;
        private float[] P;
        private Rect Q;

        /* renamed from: a */
        final c f1296a;

        /* renamed from: c */
        private int f1298c;

        /* renamed from: d */
        private int f1299d;

        /* renamed from: e */
        private int f1300e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private float l;
        private float m;
        private float n;
        private String o;
        private String p;
        private String q;
        private String r;
        private String s;
        private int u;
        private int v;
        private int w;
        private int x;
        private float y;
        private String z;

        /* renamed from: b */
        private int f1297b = -1;
        private boolean t = false;
        private List<j> H = new ArrayList();
        private List<j> I = new ArrayList();
        private boolean M = true;
        private boolean O = true;

        j(c cVar) {
            this.f1296a = cVar;
        }

        public void V(List<j> list) {
            if (g0(h.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (j jVar : this.H) {
                jVar.V(list);
            }
        }

        public boolean W() {
            String str;
            String str2 = this.o;
            if (str2 == null && this.A == null) {
                return false;
            }
            return str2 == null || (str = this.A) == null || !str2.equals(str);
        }

        public boolean X() {
            return !Float.isNaN(this.l) && !Float.isNaN(this.y) && this.y != this.l;
        }

        private void Y() {
            if (!this.M) {
                return;
            }
            this.M = false;
            if (this.N == null) {
                this.N = new float[16];
            }
            if (Matrix.invertM(this.N, 0, this.F, 0)) {
                return;
            }
            Arrays.fill(this.N, 0.0f);
        }

        private j Z(d.a.d.c<j> cVar) {
            for (j jVar = this.G; jVar != null; jVar = jVar.G) {
                if (cVar.a(jVar)) {
                    return jVar;
                }
            }
            return null;
        }

        public Rect a0() {
            return this.Q;
        }

        public String b0() {
            String str;
            if (!g0(h.NAMES_ROUTE) || (str = this.o) == null || str.isEmpty()) {
                for (j jVar : this.H) {
                    String b0 = jVar.b0();
                    if (b0 != null && !b0.isEmpty()) {
                        return b0;
                    }
                }
                return null;
            }
            return this.o;
        }

        public String c0() {
            StringBuilder sb = new StringBuilder();
            String[] strArr = {this.p, this.o, this.s};
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                if (str != null && str.length() > 0) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        }

        public boolean d0(f fVar) {
            return (fVar.f1285a & this.v) != 0;
        }

        public boolean e0(h hVar) {
            return (hVar.f1295a & this.u) != 0;
        }

        public boolean f0(f fVar) {
            return (fVar.f1285a & this.f1299d) != 0;
        }

        public boolean g0(h hVar) {
            return (hVar.f1295a & this.f1298c) != 0;
        }

        public j h0(float[] fArr) {
            float f = fArr[3];
            float f2 = fArr[0] / f;
            float f3 = fArr[1] / f;
            if (f2 < this.B || f2 >= this.D || f3 < this.C || f3 >= this.E) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (j jVar : this.I) {
                if (!jVar.g0(h.IS_HIDDEN)) {
                    jVar.Y();
                    Matrix.multiplyMV(fArr2, 0, jVar.N, 0, fArr, 0);
                    j h0 = jVar.h0(fArr2);
                    if (h0 != null) {
                        return h0;
                    }
                }
            }
            if (!i0()) {
                return null;
            }
            return this;
        }

        public boolean i0() {
            String str;
            String str2;
            String str3;
            if (g0(h.SCOPES_ROUTE)) {
                return false;
            }
            if (g0(h.IS_FOCUSABLE)) {
                return true;
            }
            return ((((((f.SCROLL_RIGHT.f1285a | f.SCROLL_LEFT.f1285a) | f.SCROLL_UP.f1285a) | f.SCROLL_DOWN.f1285a) ^ (-1)) & this.f1299d) == 0 && this.f1298c == 0 && ((str = this.o) == null || str.isEmpty()) && (((str2 = this.p) == null || str2.isEmpty()) && ((str3 = this.s) == null || str3.isEmpty()))) ? false : true;
        }

        private float j0(float f, float f2, float f3, float f4) {
            return Math.max(f, Math.max(f2, Math.max(f3, f4)));
        }

        private float k0(float f, float f2, float f3, float f4) {
            return Math.min(f, Math.min(f2, Math.min(f3, f4)));
        }

        public static boolean l0(j jVar, d.a.d.c<j> cVar) {
            return (jVar == null || jVar.Z(cVar) == null) ? false : true;
        }

        private void m0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f = fArr[3];
            fArr[0] = fArr[0] / f;
            fArr[1] = fArr[1] / f;
            fArr[2] = fArr[2] / f;
            fArr[3] = 0.0f;
        }

        public void n0(float[] fArr, Set<j> set, boolean z) {
            set.add(this);
            if (this.O) {
                z = true;
            }
            if (z) {
                if (this.P == null) {
                    this.P = new float[16];
                }
                Matrix.multiplyMM(this.P, 0, fArr, 0, this.F, 0);
                float[] fArr2 = {this.B, this.C, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                m0(fArr3, this.P, fArr2);
                fArr2[0] = this.D;
                fArr2[1] = this.C;
                m0(fArr4, this.P, fArr2);
                fArr2[0] = this.D;
                fArr2[1] = this.E;
                m0(fArr5, this.P, fArr2);
                fArr2[0] = this.B;
                fArr2[1] = this.E;
                m0(fArr6, this.P, fArr2);
                if (this.Q == null) {
                    this.Q = new Rect();
                }
                this.Q.set(Math.round(k0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(k0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(j0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(j0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.O = false;
            }
            for (j jVar : this.H) {
                jVar.n0(this.P, set, z);
            }
        }

        public void o0(ByteBuffer byteBuffer, String[] strArr) {
            this.t = true;
            this.z = this.p;
            this.A = this.o;
            this.u = this.f1298c;
            this.v = this.f1299d;
            this.w = this.g;
            this.x = this.h;
            this.y = this.l;
            this.f1298c = byteBuffer.getInt();
            this.f1299d = byteBuffer.getInt();
            this.f1300e = byteBuffer.getInt();
            this.f = byteBuffer.getInt();
            this.g = byteBuffer.getInt();
            this.h = byteBuffer.getInt();
            this.i = byteBuffer.getInt();
            this.j = byteBuffer.getInt();
            this.k = byteBuffer.getInt();
            this.l = byteBuffer.getFloat();
            this.m = byteBuffer.getFloat();
            this.n = byteBuffer.getFloat();
            int i = byteBuffer.getInt();
            this.o = i == -1 ? null : strArr[i];
            int i2 = byteBuffer.getInt();
            this.p = i2 == -1 ? null : strArr[i2];
            int i3 = byteBuffer.getInt();
            this.q = i3 == -1 ? null : strArr[i3];
            int i4 = byteBuffer.getInt();
            this.r = i4 == -1 ? null : strArr[i4];
            int i5 = byteBuffer.getInt();
            this.s = i5 == -1 ? null : strArr[i5];
            k.a(byteBuffer.getInt());
            this.B = byteBuffer.getFloat();
            this.C = byteBuffer.getFloat();
            this.D = byteBuffer.getFloat();
            this.E = byteBuffer.getFloat();
            if (this.F == null) {
                this.F = new float[16];
            }
            for (int i6 = 0; i6 < 16; i6++) {
                this.F[i6] = byteBuffer.getFloat();
            }
            this.M = true;
            this.O = true;
            int i7 = byteBuffer.getInt();
            this.H.clear();
            this.I.clear();
            for (int i8 = 0; i8 < i7; i8++) {
                j t = this.f1296a.t(byteBuffer.getInt());
                t.G = this;
                this.H.add(t);
            }
            for (int i9 = 0; i9 < i7; i9++) {
                j t2 = this.f1296a.t(byteBuffer.getInt());
                t2.G = this;
                this.I.add(t2);
            }
            int i10 = byteBuffer.getInt();
            if (i10 == 0) {
                this.J = null;
                return;
            }
            List<g> list = this.J;
            if (list == null) {
                this.J = new ArrayList(i10);
            } else {
                list.clear();
            }
            for (int i11 = 0; i11 < i10; i11++) {
                g s = this.f1296a.s(byteBuffer.getInt());
                if (s.f1288c == f.TAP.f1285a) {
                    this.K = s;
                } else if (s.f1288c == f.LONG_PRESS.f1285a) {
                    this.L = s;
                } else {
                    this.J.add(s);
                }
                this.J.add(s);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum k {
        UNKNOWN,
        LTR,
        RTL;

        public static k a(int i) {
            return i != 1 ? i != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public c(View view, io.flutter.embedding.engine.i.b bVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.i iVar) {
        this(view, bVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), iVar);
    }

    public c(View view, io.flutter.embedding.engine.i.b bVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.i iVar) {
        this.g = new HashMap();
        this.h = new HashMap();
        this.l = 0;
        this.p = new ArrayList();
        this.q = 0;
        this.r = 0;
        this.t = false;
        this.u = new a();
        b bVar2 = new b();
        this.v = bVar2;
        C0060c c0060c = new C0060c(new Handler());
        this.x = c0060c;
        this.f1266a = view;
        this.f1267b = bVar;
        this.f1268c = accessibilityManager;
        this.f = contentResolver;
        this.f1269d = accessibilityViewEmbedder;
        this.f1270e = iVar;
        bVar2.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            d dVar = new d(accessibilityManager);
            this.w = dVar;
            dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        } else {
            this.w = null;
        }
        if (i2 >= 17) {
            c0060c.onChange(false);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, c0060c);
        }
        if (iVar != null) {
            iVar.c(this);
        }
    }

    public AccessibilityEvent A(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        obtain.setPackageName(this.f1266a.getContext().getPackageName());
        obtain.setSource(this.f1266a, i2);
        return obtain;
    }

    public void C() {
        j jVar = this.o;
        if (jVar != null) {
            H(jVar.f1297b, 256);
            this.o = null;
        }
    }

    @TargetApi(18)
    private boolean D(j jVar, int i2, Bundle bundle, boolean z) {
        int i3 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        F(jVar, i3, z, z2);
        if (i3 == 1) {
            if (z) {
                f fVar = f.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (jVar.f0(fVar)) {
                    this.f1267b.c(i2, fVar, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (z) {
                return false;
            }
            f fVar2 = f.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!jVar.f0(fVar2)) {
                return false;
            }
            this.f1267b.c(i2, fVar2, Boolean.valueOf(z2));
            return true;
        } else if (i3 != 2) {
            return i3 == 4 || i3 == 8 || i3 == 16;
        } else {
            if (z) {
                f fVar3 = f.MOVE_CURSOR_FORWARD_BY_WORD;
                if (jVar.f0(fVar3)) {
                    this.f1267b.c(i2, fVar3, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (z) {
                return false;
            }
            f fVar4 = f.MOVE_CURSOR_BACKWARD_BY_WORD;
            if (!jVar.f0(fVar4)) {
                return false;
            }
            this.f1267b.c(i2, fVar4, Boolean.valueOf(z2));
            return true;
        }
    }

    @TargetApi(21)
    private boolean E(j jVar, int i2, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f1267b.c(i2, f.SET_TEXT, string);
        jVar.p = string;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
        if (r6 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
        r5 = r4.p.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        r4.h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r5.find() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        r4.h += r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (r5.find() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
        r5 = r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
        if (r5.find() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00eb, code lost:
        if (r5.find() != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void F(io.flutter.view.c.j r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            int r0 = io.flutter.view.c.j.k(r4)
            if (r0 < 0) goto L11d
            int r0 = io.flutter.view.c.j.i(r4)
            if (r0 >= 0) goto Le
            goto L11d
        Le:
            r0 = 1
            if (r5 == r0) goto Lee
            r1 = 2
            r2 = 0
            if (r5 == r1) goto L99
            r1 = 4
            if (r5 == r1) goto L36
            r0 = 8
            if (r5 == r0) goto L22
            r0 = 16
            if (r5 == r0) goto L22
            goto L114
        L22:
            if (r6 == 0) goto L31
        L24:
            java.lang.String r5 = io.flutter.view.c.j.o(r4)
            int r5 = r5.length()
        L2c:
            io.flutter.view.c.j.l(r4, r5)
            goto L114
        L31:
            io.flutter.view.c.j.l(r4, r2)
            goto L114
        L36:
            if (r6 == 0) goto L70
            int r5 = io.flutter.view.c.j.k(r4)
            java.lang.String r1 = io.flutter.view.c.j.o(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto L70
            java.lang.String r5 = "(?!^)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.j.o(r4)
            int r1 = io.flutter.view.c.j.k(r4)
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L24
        L62:
            int r6 = io.flutter.view.c.j.k(r4)
            int r5 = r5.start(r0)
            int r6 = r6 + r5
            io.flutter.view.c.j.l(r4, r6)
            goto L114
        L70:
            if (r6 != 0) goto L114
            int r5 = io.flutter.view.c.j.k(r4)
            if (r5 <= 0) goto L114
            java.lang.String r5 = "(?s:.*)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.j.o(r4)
            int r1 = io.flutter.view.c.j.k(r4)
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L31
        L94:
            int r5 = r5.start(r0)
            goto L2c
        L99:
            if (r6 == 0) goto Lc9
            int r5 = io.flutter.view.c.j.k(r4)
            java.lang.String r1 = io.flutter.view.c.j.o(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto Lc9
            java.lang.String r5 = "\\p{L}(\\b)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.j.o(r4)
            int r1 = io.flutter.view.c.j.k(r4)
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            r5.find()
            boolean r6 = r5.find()
            if (r6 == 0) goto L24
            goto L62
        Lc9:
            if (r6 != 0) goto L114
            int r5 = io.flutter.view.c.j.k(r4)
            if (r5 <= 0) goto L114
            java.lang.String r5 = "(?s:.*)(\\b)\\p{L}"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.j.o(r4)
            int r1 = io.flutter.view.c.j.k(r4)
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L114
            goto L94
        Lee:
            if (r6 == 0) goto L105
            int r5 = io.flutter.view.c.j.k(r4)
            java.lang.String r1 = io.flutter.view.c.j.o(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto L105
            int r5 = io.flutter.view.c.j.k(r4)
            int r5 = r5 + r0
            goto L2c
        L105:
            if (r6 != 0) goto L114
            int r5 = io.flutter.view.c.j.k(r4)
            if (r5 <= 0) goto L114
            int r5 = io.flutter.view.c.j.k(r4)
            int r5 = r5 - r0
            goto L2c
        L114:
            if (r7 != 0) goto L11d
            int r5 = io.flutter.view.c.j.k(r4)
            io.flutter.view.c.j.j(r4, r5)
        L11d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.F(io.flutter.view.c$j, int, boolean, boolean):void");
    }

    public void H(int i2, int i3) {
        if (!this.f1268c.isEnabled()) {
            return;
        }
        I(A(i2, i3));
    }

    public void I(AccessibilityEvent accessibilityEvent) {
        if (!this.f1268c.isEnabled()) {
            return;
        }
        this.f1266a.getParent().requestSendAccessibilityEvent(this.f1266a, accessibilityEvent);
    }

    public void J() {
        this.f1267b.f(this.l);
    }

    private void K(j jVar) {
        AccessibilityEvent A = A(jVar.f1297b, 32);
        String b0 = jVar.b0();
        if (b0 == null) {
            b0 = " ";
        }
        A.getText().add(b0);
        I(A);
    }

    private void L(int i2) {
        AccessibilityEvent A = A(i2, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            A.setContentChangeTypes(1);
        }
        I(A);
    }

    private boolean N(final j jVar) {
        return jVar.j > 0 && (j.l0(this.i, new d.a.d.c() { // from class: io.flutter.view.b
            @Override // d.a.d.c
            public final boolean a(Object obj) {
                return c.y(c.j.this, (c.j) obj);
            }
        }) || !j.l0(this.i, io.flutter.view.a.f1264a));
    }

    private void Q(j jVar) {
        Integer num;
        jVar.G = null;
        if (jVar.i != -1 && (num = this.j) != null && this.f1269d.platformViewOfNode(num.intValue()) == this.f1270e.a(Integer.valueOf(jVar.i))) {
            H(this.j.intValue(), 65536);
            this.j = null;
        }
        j jVar2 = this.i;
        if (jVar2 == jVar) {
            H(jVar2.f1297b, 65536);
            this.i = null;
        }
        if (this.m == jVar) {
            this.m = null;
        }
        if (this.o == jVar) {
            this.o = null;
        }
    }

    private AccessibilityEvent q(int i2, String str, String str2) {
        AccessibilityEvent A = A(i2, 16);
        A.setBeforeText(str);
        A.getText().add(str2);
        int i3 = 0;
        while (i3 < str.length() && i3 < str2.length() && str.charAt(i3) == str2.charAt(i3)) {
            i3++;
        }
        if (i3 < str.length() || i3 < str2.length()) {
            A.setFromIndex(i3);
            int length = str.length() - 1;
            int length2 = str2.length() - 1;
            while (length >= i3 && length2 >= i3 && str.charAt(length) == str2.charAt(length2)) {
                length--;
                length2--;
            }
            A.setRemovedCount((length - i3) + 1);
            A.setAddedCount((length2 - i3) + 1);
            return A;
        }
        return null;
    }

    public g s(int i2) {
        g gVar = this.h.get(Integer.valueOf(i2));
        if (gVar == null) {
            g gVar2 = new g();
            gVar2.f1287b = i2;
            gVar2.f1286a = y + i2;
            this.h.put(Integer.valueOf(i2), gVar2);
            return gVar2;
        }
        return gVar;
    }

    public j t(int i2) {
        j jVar = this.g.get(Integer.valueOf(i2));
        if (jVar == null) {
            j jVar2 = new j(this);
            jVar2.f1297b = i2;
            this.g.put(Integer.valueOf(i2), jVar2);
            return jVar2;
        }
        return jVar;
    }

    private j u() {
        return this.g.get(0);
    }

    private void v(float f2, float f3) {
        j h0;
        if (!this.g.isEmpty() && (h0 = u().h0(new float[]{f2, f3, 0.0f, 1.0f})) != this.o) {
            if (h0 != null) {
                H(h0.f1297b, 128);
            }
            j jVar = this.o;
            if (jVar != null) {
                H(jVar.f1297b, 256);
            }
            this.o = h0;
        }
    }

    public static /* synthetic */ boolean y(j jVar, j jVar2) {
        return jVar2 == jVar;
    }

    public boolean B(MotionEvent motionEvent) {
        if (this.f1268c.isTouchExplorationEnabled() && !this.g.isEmpty()) {
            j h0 = u().h0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f});
            if (h0 != null && h0.i != -1) {
                return this.f1269d.onAccessibilityHoverEvent(h0.f1297b, motionEvent);
            }
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                v(motionEvent.getX(), motionEvent.getY());
            } else if (motionEvent.getAction() != 10) {
                d.a.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            } else {
                C();
            }
            return true;
        }
        return false;
    }

    public void G() {
        this.t = true;
        io.flutter.plugin.platform.i iVar = this.f1270e;
        if (iVar != null) {
            iVar.d();
        }
        M(null);
        this.f1268c.removeAccessibilityStateChangeListener(this.v);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1268c.removeTouchExplorationStateChangeListener(this.w);
        }
        this.f.unregisterContentObserver(this.x);
        this.f1267b.g(null);
    }

    public void M(i iVar) {
        this.s = iVar;
    }

    void O(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            g s = s(byteBuffer.getInt());
            s.f1288c = byteBuffer.getInt();
            int i2 = byteBuffer.getInt();
            String str = null;
            s.f1289d = i2 == -1 ? null : strArr[i2];
            int i3 = byteBuffer.getInt();
            if (i3 != -1) {
                str = strArr[i3];
            }
            s.f1290e = str;
        }
    }

    void P(ByteBuffer byteBuffer, String[] strArr) {
        j jVar;
        j jVar2;
        float f2;
        float f3;
        WindowInsets rootWindowInsets;
        Integer valueOf;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            j t = t(byteBuffer.getInt());
            t.o0(byteBuffer, strArr);
            if (!t.g0(h.IS_HIDDEN)) {
                if (t.g0(h.IS_FOCUSED)) {
                    this.m = t;
                }
                if (t.t) {
                    arrayList.add(t);
                }
            }
        }
        HashSet hashSet = new HashSet();
        j u = u();
        ArrayList<j> arrayList2 = new ArrayList();
        if (u != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if (Build.VERSION.SDK_INT >= 23 && (rootWindowInsets = this.f1266a.getRootWindowInsets()) != null) {
                if (!this.r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    u.O = true;
                    u.M = true;
                }
                this.r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                Matrix.translateM(fArr, 0, valueOf.intValue(), 0.0f, 0.0f);
            }
            u.n0(fArr, hashSet, false);
            u.V(arrayList2);
        }
        j jVar3 = null;
        for (j jVar4 : arrayList2) {
            if (!this.p.contains(Integer.valueOf(jVar4.f1297b))) {
                jVar3 = jVar4;
            }
        }
        if (jVar3 == null && arrayList2.size() > 0) {
            jVar3 = (j) arrayList2.get(arrayList2.size() - 1);
        }
        if (jVar3 != null && (jVar3.f1297b != this.q || arrayList2.size() != this.p.size())) {
            this.q = jVar3.f1297b;
            K(jVar3);
        }
        this.p.clear();
        for (j jVar5 : arrayList2) {
            this.p.add(Integer.valueOf(jVar5.f1297b));
        }
        Iterator<Map.Entry<Integer, j>> it = this.g.entrySet().iterator();
        while (it.hasNext()) {
            j value = it.next().getValue();
            if (!hashSet.contains(value)) {
                Q(value);
                it.remove();
            }
        }
        L(0);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            j jVar6 = (j) it2.next();
            if (jVar6.X()) {
                AccessibilityEvent A = A(jVar6.f1297b, 4096);
                float f4 = jVar6.l;
                float f5 = jVar6.m;
                if (Float.isInfinite(jVar6.m)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(jVar6.n)) {
                    f2 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    f2 = f5 - jVar6.n;
                    f3 = f4 - jVar6.n;
                }
                if (jVar6.d0(f.SCROLL_UP) || jVar6.d0(f.SCROLL_DOWN)) {
                    A.setScrollY((int) f3);
                    A.setMaxScrollY((int) f2);
                } else if (jVar6.d0(f.SCROLL_LEFT) || jVar6.d0(f.SCROLL_RIGHT)) {
                    A.setScrollX((int) f3);
                    A.setMaxScrollX((int) f2);
                }
                if (jVar6.j > 0) {
                    A.setItemCount(jVar6.j);
                    A.setFromIndex(jVar6.k);
                    int i2 = 0;
                    for (j jVar7 : jVar6.I) {
                        if (!jVar7.g0(h.IS_HIDDEN)) {
                            i2++;
                        }
                    }
                    A.setToIndex((jVar6.k + i2) - 1);
                }
                I(A);
            }
            if (jVar6.g0(h.IS_LIVE_REGION) && jVar6.W()) {
                L(jVar6.f1297b);
            }
            j jVar8 = this.i;
            if (jVar8 != null && jVar8.f1297b == jVar6.f1297b) {
                h hVar = h.IS_SELECTED;
                if (!jVar6.e0(hVar) && jVar6.g0(hVar)) {
                    AccessibilityEvent A2 = A(jVar6.f1297b, 4);
                    A2.getText().add(jVar6.o);
                    I(A2);
                }
            }
            j jVar9 = this.m;
            if (jVar9 != null && jVar9.f1297b == jVar6.f1297b && ((jVar2 = this.n) == null || jVar2.f1297b != this.m.f1297b)) {
                this.n = this.m;
                I(A(jVar6.f1297b, 8));
            } else if (this.m == null) {
                this.n = null;
            }
            j jVar10 = this.m;
            if (jVar10 != null && jVar10.f1297b == jVar6.f1297b) {
                h hVar2 = h.IS_TEXT_FIELD;
                if (jVar6.e0(hVar2) && jVar6.g0(hVar2) && ((jVar = this.i) == null || jVar.f1297b == this.m.f1297b)) {
                    String str = "";
                    String str2 = jVar6.z != null ? jVar6.z : str;
                    if (jVar6.p != null) {
                        str = jVar6.p;
                    }
                    AccessibilityEvent q = q(jVar6.f1297b, str2, str);
                    if (q != null) {
                        I(q);
                    }
                    if (jVar6.w != jVar6.g || jVar6.x != jVar6.h) {
                        AccessibilityEvent A3 = A(jVar6.f1297b, 8192);
                        A3.getText().add(str);
                        A3.setFromIndex(jVar6.g);
                        A3.setToIndex(jVar6.h);
                        A3.setItemCount(str.length());
                        I(A3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03fc A[LOOP:0: B:222:0x03f6->B:224:0x03fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0421  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r15) {
        /*
            Method dump skipped, instructions count: 1123
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        if (r2 != null) goto L13;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
        /*
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L7
            r0 = 2
            if (r2 == r0) goto L1d
            goto L27
        L7:
            io.flutter.view.c$j r2 = r1.m
            if (r2 == 0) goto L14
        Lb:
            int r2 = io.flutter.view.c.j.a(r2)
        Lf:
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.createAccessibilityNodeInfo(r2)
            return r2
        L14:
            java.lang.Integer r2 = r1.k
            if (r2 == 0) goto L1d
        L18:
            int r2 = r2.intValue()
            goto Lf
        L1d:
            io.flutter.view.c$j r2 = r1.i
            if (r2 == 0) goto L22
            goto Lb
        L22:
            java.lang.Integer r2 = r1.j
            if (r2 == 0) goto L27
            goto L18
        L27:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.findFocus(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i2, int i3, Bundle bundle) {
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (i2 >= 65536) {
            boolean performAction = this.f1269d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.j = null;
            }
            return performAction;
        }
        j jVar = this.g.get(Integer.valueOf(i2));
        boolean z = false;
        if (jVar == null) {
            return false;
        }
        switch (i3) {
            case 16:
                this.f1267b.b(i2, f.TAP);
                return true;
            case 32:
                this.f1267b.b(i2, f.LONG_PRESS);
                return true;
            case 64:
                this.f1267b.b(i2, f.DID_GAIN_ACCESSIBILITY_FOCUS);
                H(i2, 32768);
                if (this.i == null) {
                    this.f1266a.invalidate();
                }
                this.i = jVar;
                if (jVar.f0(f.INCREASE) || jVar.f0(f.DECREASE)) {
                    H(i2, 4);
                }
                return true;
            case 128:
                this.f1267b.b(i2, f.DID_LOSE_ACCESSIBILITY_FOCUS);
                H(i2, 65536);
                this.i = null;
                this.j = null;
                return true;
            case 256:
                if (i5 >= 18) {
                    return D(jVar, i2, bundle, true);
                }
                return false;
            case 512:
                if (i5 >= 18) {
                    return D(jVar, i2, bundle, false);
                }
                return false;
            case 4096:
                f fVar = f.SCROLL_UP;
                if (!jVar.f0(fVar)) {
                    fVar = f.SCROLL_LEFT;
                    if (!jVar.f0(fVar)) {
                        fVar = f.INCREASE;
                        if (!jVar.f0(fVar)) {
                            return false;
                        }
                        jVar.p = jVar.q;
                        H(i2, 4);
                    }
                }
                this.f1267b.b(i2, fVar);
                return true;
            case 8192:
                f fVar2 = f.SCROLL_DOWN;
                if (!jVar.f0(fVar2)) {
                    fVar2 = f.SCROLL_RIGHT;
                    if (!jVar.f0(fVar2)) {
                        fVar2 = f.DECREASE;
                        if (!jVar.f0(fVar2)) {
                            return false;
                        }
                        jVar.p = jVar.r;
                        H(i2, 4);
                    }
                }
                this.f1267b.b(i2, fVar2);
                return true;
            case 16384:
                this.f1267b.b(i2, f.COPY);
                return true;
            case 32768:
                this.f1267b.b(i2, f.PASTE);
                return true;
            case 65536:
                this.f1267b.b(i2, f.CUT);
                return true;
            case 131072:
                if (i5 < 18) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z = true;
                }
                if (z) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i4 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap.put("base", Integer.valueOf(jVar.h));
                    i4 = jVar.h;
                }
                hashMap.put("extent", Integer.valueOf(i4));
                this.f1267b.c(i2, f.SET_SELECTION, hashMap);
                j jVar2 = this.g.get(Integer.valueOf(i2));
                jVar2.g = ((Integer) hashMap.get("base")).intValue();
                jVar2.h = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.f1267b.b(i2, f.DISMISS);
                return true;
            case 2097152:
                if (i5 >= 21) {
                    return E(jVar, i2, bundle);
                }
                return false;
            case 16908342:
                this.f1267b.b(i2, f.SHOW_ON_SCREEN);
                return true;
            default:
                g gVar = this.h.get(Integer.valueOf(i3 - y));
                if (gVar == null) {
                    return false;
                }
                this.f1267b.c(i2, f.CUSTOM_ACTION, Integer.valueOf(gVar.f1287b));
                return true;
        }
    }

    public boolean r(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (this.f1269d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) && (recordFlutterId = this.f1269d.getRecordFlutterId(view, accessibilityEvent)) != null) {
            int eventType = accessibilityEvent.getEventType();
            if (eventType == 8) {
                this.k = recordFlutterId;
                this.m = null;
                return true;
            } else if (eventType == 128) {
                this.o = null;
                return true;
            } else if (eventType == 32768) {
                this.j = recordFlutterId;
                this.i = null;
                return true;
            } else if (eventType != 65536) {
                return true;
            } else {
                this.k = null;
                this.j = null;
                return true;
            }
        }
        return false;
    }

    public boolean w() {
        return this.f1268c.isEnabled();
    }

    public boolean x() {
        return this.f1268c.isTouchExplorationEnabled();
    }
}
