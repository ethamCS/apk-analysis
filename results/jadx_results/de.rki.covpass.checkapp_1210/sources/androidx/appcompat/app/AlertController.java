package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.l0;
import androidx.core.view.y;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a */
    private final Context f638a;

    /* renamed from: b */
    final f.b f639b;

    /* renamed from: c */
    private final Window f640c;

    /* renamed from: d */
    private final int f641d;

    /* renamed from: e */
    private CharSequence f642e;

    /* renamed from: f */
    private CharSequence f643f;

    /* renamed from: g */
    ListView f644g;

    /* renamed from: h */
    private View f645h;

    /* renamed from: i */
    private int f646i;

    /* renamed from: j */
    private int f647j;

    /* renamed from: k */
    private int f648k;

    /* renamed from: l */
    private int f649l;

    /* renamed from: m */
    private int f650m;

    /* renamed from: o */
    Button f652o;

    /* renamed from: p */
    private CharSequence f653p;

    /* renamed from: q */
    Message f654q;

    /* renamed from: r */
    private Drawable f655r;

    /* renamed from: s */
    Button f656s;

    /* renamed from: t */
    private CharSequence f657t;

    /* renamed from: u */
    Message f658u;

    /* renamed from: v */
    private Drawable f659v;

    /* renamed from: w */
    Button f660w;

    /* renamed from: x */
    private CharSequence f661x;

    /* renamed from: y */
    Message f662y;

    /* renamed from: z */
    private Drawable f663z;

    /* renamed from: n */
    private boolean f651n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: c */
        private final int f664c;

        /* renamed from: d */
        private final int f665d;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f9222c2);
            this.f665d = obtainStyledAttributes.getDimensionPixelOffset(e.j.f9227d2, -1);
            this.f664c = obtainStyledAttributes.getDimensionPixelOffset(e.j.f9232e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (!z11 || !z10) {
                setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f664c, getPaddingRight(), z11 ? getPaddingBottom() : this.f665d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        a() {
            AlertController.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f652o || (message2 = alertController.f654q) == null) && (view != alertController.f656s || (message2 = alertController.f658u) == null)) ? (view != alertController.f660w || (message = alertController.f662y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f639b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* renamed from: a */
        public final Context f667a;

        /* renamed from: b */
        public final LayoutInflater f668b;

        /* renamed from: d */
        public Drawable f670d;

        /* renamed from: f */
        public CharSequence f672f;

        /* renamed from: g */
        public View f673g;

        /* renamed from: h */
        public CharSequence f674h;

        /* renamed from: i */
        public CharSequence f675i;

        /* renamed from: j */
        public Drawable f676j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f677k;

        /* renamed from: l */
        public CharSequence f678l;

        /* renamed from: m */
        public Drawable f679m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f680n;

        /* renamed from: o */
        public CharSequence f681o;

        /* renamed from: p */
        public Drawable f682p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f683q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f685s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f686t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f687u;

        /* renamed from: v */
        public CharSequence[] f688v;

        /* renamed from: w */
        public ListAdapter f689w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f690x;

        /* renamed from: y */
        public int f691y;

        /* renamed from: z */
        public View f692z;

        /* renamed from: c */
        public int f669c = 0;

        /* renamed from: e */
        public int f671e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean P = true;

        /* renamed from: r */
        public boolean f684r = true;

        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: c */
            final /* synthetic */ RecycleListView f693c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                b.this = r1;
                this.f693c = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f693c.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b */
        /* loaded from: classes.dex */
        public class C0012b extends CursorAdapter {

            /* renamed from: c */
            private final int f695c;

            /* renamed from: d */
            private final int f696d;

            /* renamed from: q */
            final /* synthetic */ RecycleListView f697q;

            /* renamed from: x */
            final /* synthetic */ AlertController f698x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0012b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                b.this = r1;
                this.f697q = recycleListView;
                this.f698x = alertController;
                Cursor cursor2 = getCursor();
                this.f695c = cursor2.getColumnIndexOrThrow(r1.L);
                this.f696d = cursor2.getColumnIndexOrThrow(r1.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f695c));
                RecycleListView recycleListView = this.f697q;
                int position = cursor.getPosition();
                boolean z10 = true;
                if (cursor.getInt(this.f696d) != 1) {
                    z10 = false;
                }
                recycleListView.setItemChecked(position, z10);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f668b.inflate(this.f698x.M, viewGroup, false);
            }
        }

        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: c */
            final /* synthetic */ AlertController f700c;

            c(AlertController alertController) {
                b.this = r1;
                this.f700c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                b.this.f690x.onClick(this.f700c.f639b, i10);
                if (!b.this.H) {
                    this.f700c.f639b.dismiss();
                }
            }
        }

        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: c */
            final /* synthetic */ RecycleListView f702c;

            /* renamed from: d */
            final /* synthetic */ AlertController f703d;

            d(RecycleListView recycleListView, AlertController alertController) {
                b.this = r1;
                this.f702c = recycleListView;
                this.f703d = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f702c.isItemChecked(i10);
                }
                b.this.J.onClick(this.f703d.f639b, i10, this.f702c.isItemChecked(i10));
            }
        }

        /* loaded from: classes.dex */
        public interface e {
            void a(ListView listView);
        }

        public b(Context context) {
            this.f667a = context;
            this.f668b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f668b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$b$a r9 = new androidx.appcompat.app.AlertController$b$a
                android.content.Context r3 = r10.f667a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f688v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$b$b r9 = new androidx.appcompat.app.AlertController$b$b
                android.content.Context r3 = r10.f667a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.H
                if (r1 == 0) goto L3c
                int r1 = r11.N
                goto L3e
            L3c:
                int r1 = r11.O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f667a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f689w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$d r9 = new androidx.appcompat.app.AlertController$d
                android.content.Context r1 = r10.f667a
                java.lang.CharSequence[] r3 = r10.f688v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                androidx.appcompat.app.AlertController$b$e r1 = r10.O
                if (r1 == 0) goto L72
                r1.a(r0)
            L72:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f690x
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$b$c r1 = new androidx.appcompat.app.AlertController$b$c
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L8f
                androidx.appcompat.app.AlertController$b$d r1 = new androidx.appcompat.app.AlertController$b$d
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.G
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.f644g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.b.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f673g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f672f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f670d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f669c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f671e;
                if (i11 != 0) {
                    alertController.m(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f674h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f675i;
            if (charSequence3 != null || this.f676j != null) {
                alertController.k(-1, charSequence3, this.f677k, null, this.f676j);
            }
            CharSequence charSequence4 = this.f678l;
            if (charSequence4 != null || this.f679m != null) {
                alertController.k(-2, charSequence4, this.f680n, null, this.f679m);
            }
            CharSequence charSequence5 = this.f681o;
            if (charSequence5 != null || this.f682p != null) {
                alertController.k(-3, charSequence5, this.f683q, null, this.f682p);
            }
            if (this.f688v != null || this.K != null || this.f689w != null) {
                b(alertController);
            }
            View view2 = this.f692z;
            if (view2 != null) {
                if (this.E) {
                    alertController.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.s(view2);
                    return;
                }
            }
            int i12 = this.f691y;
            if (i12 == 0) {
                return;
            }
            alertController.r(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f705a;

        public c(DialogInterface dialogInterface) {
            this.f705a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f705a.get(), message.what);
            } else if (i10 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, f.b bVar, Window window) {
        this.f638a = context;
        this.f639b = bVar;
        this.f640c = window;
        this.R = new c(bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, e.j.F, e.a.f9181n, 0);
        this.J = obtainStyledAttributes.getResourceId(e.j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(e.j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(e.j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(e.j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(e.j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(e.j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(e.j.M, true);
        this.f641d = obtainStyledAttributes.getDimensionPixelSize(e.j.H, 0);
        obtainStyledAttributes.recycle();
        bVar.d(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.K;
        return (i10 != 0 && this.Q == 1) ? i10 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f640c.findViewById(e.f.v_res_0x7f090212);
        View findViewById2 = this.f640c.findViewById(e.f.u_res_0x7f090211);
        y.E0(view, i10, i11);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void u(ViewGroup viewGroup) {
        boolean z10;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f652o = button2;
        button2.setOnClickListener(this.S);
        boolean z11 = true;
        if (!TextUtils.isEmpty(this.f653p) || this.f655r != null) {
            this.f652o.setText(this.f653p);
            Drawable drawable = this.f655r;
            if (drawable != null) {
                int i10 = this.f641d;
                drawable.setBounds(0, 0, i10, i10);
                this.f652o.setCompoundDrawables(this.f655r, null, null, null);
            }
            this.f652o.setVisibility(0);
            z10 = true;
        } else {
            this.f652o.setVisibility(8);
            z10 = false;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f656s = button3;
        button3.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f657t) || this.f659v != null) {
            this.f656s.setText(this.f657t);
            Drawable drawable2 = this.f659v;
            if (drawable2 != null) {
                int i11 = this.f641d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f656s.setCompoundDrawables(this.f659v, null, null, null);
            }
            this.f656s.setVisibility(0);
            z10 |= true;
        } else {
            this.f656s.setVisibility(8);
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f660w = button4;
        button4.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f661x) || this.f663z != null) {
            this.f660w.setText(this.f661x);
            Drawable drawable3 = this.f663z;
            if (drawable3 != null) {
                int i12 = this.f641d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f660w.setCompoundDrawables(this.f663z, null, null, null);
            }
            this.f660w.setVisibility(0);
            z10 |= true;
        } else {
            this.f660w.setVisibility(8);
        }
        if (z(this.f638a)) {
            if (z10) {
                button = this.f652o;
            } else if (z10) {
                button = this.f656s;
            } else if (z10) {
                button = this.f660w;
            }
            b(button);
        }
        if (!z10) {
            z11 = false;
        }
        if (!z11) {
            viewGroup.setVisibility(8);
        }
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f640c.findViewById(e.f.w_res_0x7f090213);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f643f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f644g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f644g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void w(ViewGroup viewGroup) {
        View view = this.f645h;
        boolean z10 = false;
        if (view == null) {
            view = this.f646i != 0 ? LayoutInflater.from(this.f638a).inflate(this.f646i, viewGroup, false) : null;
        }
        if (view != null) {
            z10 = true;
        }
        if (!z10 || !a(view)) {
            this.f640c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f640c.findViewById(e.f.n_res_0x7f0900b5);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f651n) {
            frameLayout.setPadding(this.f647j, this.f648k, this.f649l, this.f650m);
        }
        if (this.f644g == null) {
            return;
        }
        ((LinearLayout.LayoutParams) ((l0.a) viewGroup.getLayoutParams())).weight = 0.0f;
    }

    private void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f640c.findViewById(e.f.O_res_0x7f09027f).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f640c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f642e)) || !this.P) {
            this.f640c.findViewById(e.f.O_res_0x7f09027f).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f640c.findViewById(e.f.j_res_0x7f090049);
        this.E = textView;
        textView.setText(this.f642e);
        int i10 = this.B;
        if (i10 != 0) {
            this.D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    private void y() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f640c.findViewById(e.f.t_res_0x7f0901c4);
        int i10 = e.f.P_res_0x7f090283;
        View findViewById4 = findViewById3.findViewById(i10);
        int i11 = e.f.m_res_0x7f0900ad;
        View findViewById5 = findViewById3.findViewById(i11);
        int i12 = e.f.k_res_0x7f090075;
        View findViewById6 = findViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(e.f.o_res_0x7f0900b6);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i10);
        View findViewById8 = viewGroup.findViewById(i11);
        View findViewById9 = viewGroup.findViewById(i12);
        ViewGroup i13 = i(findViewById7, findViewById4);
        ViewGroup i14 = i(findViewById8, findViewById5);
        ViewGroup i15 = i(findViewById9, findViewById6);
        v(i14);
        u(i15);
        x(i13);
        int i16 = 0;
        Object[] objArr = viewGroup.getVisibility() != 8 ? 1 : null;
        boolean z10 = (i13 == null || i13.getVisibility() == 8) ? false : true;
        boolean z11 = (i15 == null || i15.getVisibility() == 8) ? false : true;
        if (!z11 && i14 != null && (findViewById2 = i14.findViewById(e.f.K_res_0x7f09026a)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z10) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f643f != null || this.f644g != null) {
                view = i13.findViewById(e.f.N_res_0x7f09027c);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (i14 != null && (findViewById = i14.findViewById(e.f.L_res_0x7f09026b)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f644g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z10, z11);
        }
        if (objArr == null) {
            View view2 = this.f644g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                if (z11) {
                    i16 = 2;
                }
                int i17 = z10 ? 1 : 0;
                char c10 = z10 ? 1 : 0;
                p(i14, view2, i17 | i16, 3);
            }
        }
        ListView listView2 = this.f644g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i18 = this.I;
        if (i18 <= -1) {
            return;
        }
        listView2.setItemChecked(i18, true);
        listView2.setSelection(i18);
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.m_res_0x7f030028, typedValue, true);
        return typedValue.data != 0;
    }

    public Button c(int i10) {
        if (i10 != -3) {
            if (i10 == -2) {
                return this.f656s;
            }
            if (i10 == -1) {
                return this.f652o;
            }
            return null;
        }
        return this.f660w;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f638a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f644g;
    }

    public void f() {
        this.f639b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.r(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.r(keyEvent);
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f661x = charSequence;
            this.f662y = message;
            this.f663z = drawable;
        } else if (i10 == -2) {
            this.f657t = charSequence;
            this.f658u = message;
            this.f659v = drawable;
        } else if (i10 != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.f653p = charSequence;
            this.f654q = message;
            this.f655r = drawable;
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
        }
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
        }
    }

    public void o(CharSequence charSequence) {
        this.f643f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f642e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f645h = null;
        this.f646i = i10;
        this.f651n = false;
    }

    public void s(View view) {
        this.f645h = view;
        this.f646i = 0;
        this.f651n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f645h = view;
        this.f646i = 0;
        this.f651n = true;
        this.f647j = i10;
        this.f648k = i11;
        this.f649l = i12;
        this.f650m = i13;
    }
}
