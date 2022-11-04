package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;
/* loaded from: classes.dex */
public class z extends Spinner {
    private static final int[] X3 = {16843505};
    private g U3;
    int V3;
    final Rect W3;

    /* renamed from: c */
    private final androidx.appcompat.widget.e f1574c;

    /* renamed from: d */
    private final Context f1575d;

    /* renamed from: q */
    private k0 f1576q;

    /* renamed from: x */
    private SpinnerAdapter f1577x;

    /* renamed from: y */
    private final boolean f1578y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends k0 {
        final /* synthetic */ e Y3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            z.this = r1;
            this.Y3 = eVar;
        }

        @Override // androidx.appcompat.widget.k0
        public l.e b() {
            return this.Y3;
        }

        @Override // androidx.appcompat.widget.k0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (!z.this.getInternalPopup().c()) {
                z.this.b();
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
            z.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!z.this.getInternalPopup().c()) {
                z.this.b();
            }
            ViewTreeObserver viewTreeObserver = z.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements g, DialogInterface.OnClickListener {

        /* renamed from: c */
        androidx.appcompat.app.b f1580c;

        /* renamed from: d */
        private ListAdapter f1581d;

        /* renamed from: q */
        private CharSequence f1582q;

        c() {
            z.this = r1;
        }

        @Override // androidx.appcompat.widget.z.g
        public void b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.z.g
        public boolean c() {
            androidx.appcompat.app.b bVar = this.f1580c;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.z.g
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.z.g
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f1580c;
            if (bVar != null) {
                bVar.dismiss();
                this.f1580c = null;
            }
        }

        @Override // androidx.appcompat.widget.z.g
        public Drawable g() {
            return null;
        }

        @Override // androidx.appcompat.widget.z.g
        public void i(CharSequence charSequence) {
            this.f1582q = charSequence;
        }

        @Override // androidx.appcompat.widget.z.g
        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.z.g
        public void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.z.g
        public void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.z.g
        public void m(int i10, int i11) {
            if (this.f1581d == null) {
                return;
            }
            b.a aVar = new b.a(z.this.getPopupContext());
            CharSequence charSequence = this.f1582q;
            if (charSequence != null) {
                aVar.m(charSequence);
            }
            androidx.appcompat.app.b a10 = aVar.l(this.f1581d, z.this.getSelectedItemPosition(), this).a();
            this.f1580c = a10;
            ListView f10 = a10.f();
            f10.setTextDirection(i10);
            f10.setTextAlignment(i11);
            this.f1580c.show();
        }

        @Override // androidx.appcompat.widget.z.g
        public int n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.z.g
        public CharSequence o() {
            return this.f1582q;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            z.this.setSelection(i10);
            if (z.this.getOnItemClickListener() != null) {
                z.this.performItemClick(null, i10, this.f1581d.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.z.g
        public void p(ListAdapter listAdapter) {
            this.f1581d = listAdapter;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: c */
        private SpinnerAdapter f1584c;

        /* renamed from: d */
        private ListAdapter f1585d;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1584c = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1585d = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == theme) {
                        return;
                    }
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                } else if (!(spinnerAdapter instanceof w0)) {
                } else {
                    w0 w0Var = (w0) spinnerAdapter;
                    if (w0Var.getDropDownViewTheme() != null) {
                        return;
                    }
                    w0Var.setDropDownViewTheme(theme);
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1585d;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1584c;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1584c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1584c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1584c;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1584c;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1585d;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1584c;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1584c;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends m0 implements g {
        private final Rect A4 = new Rect();
        private int B4;

        /* renamed from: y4 */
        private CharSequence f1586y4;

        /* renamed from: z4 */
        ListAdapter f1587z4;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {

            /* renamed from: c */
            final /* synthetic */ z f1588c;

            a(z zVar) {
                e.this = r1;
                this.f1588c = zVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                z.this.setSelection(i10);
                if (z.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    z.this.performItemClick(view, i10, eVar.f1587z4.getItemId(i10));
                }
                e.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
                e.this = r1;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.U(z.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.S();
                e.super.a();
            }
        }

        /* loaded from: classes.dex */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: c */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1591c;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                e.this = r1;
                this.f1591c = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = z.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1591c);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            z.this = r1;
            D(r1);
            J(true);
            O(0);
            L(new a(r1));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void S() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.g()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.z r1 = androidx.appcompat.widget.z.this
                android.graphics.Rect r1 = r1.W3
                r0.getPadding(r1)
                androidx.appcompat.widget.z r0 = androidx.appcompat.widget.z.this
                boolean r0 = androidx.appcompat.widget.h1.b(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.z r0 = androidx.appcompat.widget.z.this
                android.graphics.Rect r0 = r0.W3
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.z r0 = androidx.appcompat.widget.z.this
                android.graphics.Rect r0 = r0.W3
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.z r0 = androidx.appcompat.widget.z.this
                android.graphics.Rect r0 = r0.W3
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.z r0 = androidx.appcompat.widget.z.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.z r2 = androidx.appcompat.widget.z.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.z r3 = androidx.appcompat.widget.z.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.z r4 = androidx.appcompat.widget.z.this
                int r5 = r4.V3
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.f1587z4
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.g()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.z r5 = androidx.appcompat.widget.z.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.z r6 = androidx.appcompat.widget.z.this
                android.graphics.Rect r6 = r6.W3
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.F(r4)
                goto L85
            L82:
                r8.F(r5)
            L85:
                androidx.appcompat.widget.z r4 = androidx.appcompat.widget.z.this
                boolean r4 = androidx.appcompat.widget.h1.b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r0 = r8.z()
                int r3 = r3 - r0
                int r0 = r8.T()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto La0
            L9a:
                int r2 = r8.T()
                int r0 = r0 + r2
                int r1 = r1 + r0
            La0:
                r8.l(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z.e.S():void");
        }

        public int T() {
            return this.B4;
        }

        boolean U(View view) {
            return androidx.core.view.y.R(view) && view.getGlobalVisibleRect(this.A4);
        }

        @Override // androidx.appcompat.widget.z.g
        public void i(CharSequence charSequence) {
            this.f1586y4 = charSequence;
        }

        @Override // androidx.appcompat.widget.z.g
        public void k(int i10) {
            this.B4 = i10;
        }

        @Override // androidx.appcompat.widget.z.g
        public void m(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean c10 = c();
            S();
            I(2);
            super.a();
            ListView h10 = h();
            h10.setChoiceMode(1);
            h10.setTextDirection(i10);
            h10.setTextAlignment(i11);
            P(z.this.getSelectedItemPosition());
            if (!c10 && (viewTreeObserver = z.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                K(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.z.g
        public CharSequence o() {
            return this.f1586y4;
        }

        @Override // androidx.appcompat.widget.m0, androidx.appcompat.widget.z.g
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.f1587z4 = listAdapter;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: c */
        boolean f1593c;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<f> {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            /* renamed from: b */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        f(Parcel parcel) {
            super(parcel);
            this.f1593c = parcel.readByte() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1593c ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void b(Drawable drawable);

        boolean c();

        int d();

        void dismiss();

        Drawable g();

        void i(CharSequence charSequence);

        void j(int i10);

        void k(int i10);

        void l(int i10);

        void m(int i10, int i11);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.K_res_0x7f03037b);
    }

    public z(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public z(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r11 == null) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.appcompat.widget.z, android.view.View, android.widget.Spinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.W3 = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.v0.a(r6, r0)
            int[] r0 = e.j.f9327x2
            r1 = 0
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.a1.v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1574c = r2
            if (r11 == 0) goto L29
            k.d r2 = new k.d
            r2.<init>(r7, r11)
        L26:
            r6.f1575d = r2
            goto L39
        L29:
            int r11 = e.j.C2
            int r11 = r0.n(r11, r1)
            if (r11 == 0) goto L37
            k.d r2 = new k.d
            r2.<init>(r7, r11)
            goto L26
        L37:
            r6.f1575d = r7
        L39:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L69
            int[] r11 = androidx.appcompat.widget.z.X3     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            boolean r3 = r11.hasValue(r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L61
            if (r3 == 0) goto L4d
            int r10 = r11.getInt(r1, r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L61
        L4d:
            r11.recycle()
            goto L69
        L51:
            r3 = move-exception
            goto L57
        L53:
            r7 = move-exception
            goto L63
        L55:
            r3 = move-exception
            r11 = r2
        L57:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L69
            goto L4d
        L61:
            r7 = move-exception
            r2 = r11
        L63:
            if (r2 == 0) goto L68
            r2.recycle()
        L68:
            throw r7
        L69:
            r11 = 1
            if (r10 == 0) goto La6
            if (r10 == r11) goto L6f
            goto Lb6
        L6f:
            androidx.appcompat.widget.z$e r10 = new androidx.appcompat.widget.z$e
            android.content.Context r3 = r6.f1575d
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1575d
            int[] r4 = e.j.f9327x2
            androidx.appcompat.widget.a1 r1 = androidx.appcompat.widget.a1.v(r3, r8, r4, r9, r1)
            int r3 = e.j.B2
            r4 = -2
            int r3 = r1.m(r3, r4)
            r6.V3 = r3
            int r3 = e.j.f9337z2
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r10.b(r3)
            int r3 = e.j.A2
            java.lang.String r3 = r0.o(r3)
            r10.i(r3)
            r1.w()
            r6.U3 = r10
            androidx.appcompat.widget.z$a r1 = new androidx.appcompat.widget.z$a
            r1.<init>(r6, r10)
            r6.f1576q = r1
            goto Lb6
        La6:
            androidx.appcompat.widget.z$c r10 = new androidx.appcompat.widget.z$c
            r10.<init>()
            r6.U3 = r10
            int r1 = e.j.A2
            java.lang.String r1 = r0.o(r1)
            r10.i(r1)
        Lb6:
            int r10 = e.j.f9332y2
            java.lang.CharSequence[] r10 = r0.q(r10)
            if (r10 == 0) goto Lce
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = e.g.t_res_0x7f0c0083
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        Lce:
            r0.w()
            r6.f1578y = r11
            android.widget.SpinnerAdapter r7 = r6.f1577x
            if (r7 == 0) goto Ldc
            r6.setAdapter(r7)
            r6.f1577x = r2
        Ldc:
            androidx.appcompat.widget.e r7 = r6.f1574c
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.W3);
        Rect rect = this.W3;
        return i11 + rect.left + rect.right;
    }

    void b() {
        this.U3.m(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1574c;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.U3;
        return gVar != null ? gVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.U3;
        return gVar != null ? gVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.U3 != null ? this.V3 : super.getDropDownWidth();
    }

    final g getInternalPopup() {
        return this.U3;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.U3;
        return gVar != null ? gVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1575d;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.U3;
        return gVar != null ? gVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1574c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1574c;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.U3;
        if (gVar == null || !gVar.c()) {
            return;
        }
        this.U3.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.U3 == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f1593c || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.U3;
        fVar.f1593c = gVar != null && gVar.c();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k0 k0Var = this.f1576q;
        if (k0Var == null || !k0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.U3;
        if (gVar != null) {
            if (gVar.c()) {
                return true;
            }
            b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1578y) {
            this.f1577x = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.U3 == null) {
            return;
        }
        Context context = this.f1575d;
        if (context == null) {
            context = getContext();
        }
        this.U3.p(new d(spinnerAdapter, context.getTheme()));
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1574c;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.e eVar = this.f1574c;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        g gVar = this.U3;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i10);
            return;
        }
        gVar.k(i10);
        this.U3.l(i10);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        g gVar = this.U3;
        if (gVar != null) {
            gVar.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.U3 != null) {
            this.V3 = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.U3;
        if (gVar != null) {
            gVar.b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(g.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.U3;
        if (gVar != null) {
            gVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1574c;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1574c;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
