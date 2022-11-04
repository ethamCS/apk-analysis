package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.j0;
import androidx.core.view.y;
import androidx.fragment.app.f0;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class i<S> extends androidx.fragment.app.e {
    static final Object D5 = "CONFIRM_BUTTON_TAG";
    static final Object E5 = "CANCEL_BUTTON_TAG";
    static final Object F5 = "TOGGLE_BUTTON_TAG";
    private t5.g A5;
    private Button B5;
    private boolean C5;

    /* renamed from: h5 */
    private final LinkedHashSet<j<? super S>> f7162h5 = new LinkedHashSet<>();

    /* renamed from: i5 */
    private final LinkedHashSet<View.OnClickListener> f7163i5 = new LinkedHashSet<>();

    /* renamed from: j5 */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f7164j5 = new LinkedHashSet<>();

    /* renamed from: k5 */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f7165k5 = new LinkedHashSet<>();

    /* renamed from: l5 */
    private int f7166l5;

    /* renamed from: m5 */
    private com.google.android.material.datepicker.d<S> f7167m5;

    /* renamed from: n5 */
    private p<S> f7168n5;

    /* renamed from: o5 */
    private com.google.android.material.datepicker.a f7169o5;

    /* renamed from: p5 */
    private h<S> f7170p5;

    /* renamed from: q5 */
    private int f7171q5;

    /* renamed from: r5 */
    private CharSequence f7172r5;

    /* renamed from: s5 */
    private boolean f7173s5;

    /* renamed from: t5 */
    private int f7174t5;

    /* renamed from: u5 */
    private int f7175u5;

    /* renamed from: v5 */
    private CharSequence f7176v5;

    /* renamed from: w5 */
    private int f7177w5;

    /* renamed from: x5 */
    private CharSequence f7178x5;

    /* renamed from: y5 */
    private TextView f7179y5;

    /* renamed from: z5 */
    private CheckableImageButton f7180z5;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
            i.this = r1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.f7162h5.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(i.this.P2());
            }
            i.this.q2();
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
            i.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.f7163i5.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            i.this.q2();
        }
    }

    /* loaded from: classes.dex */
    public class c implements androidx.core.view.s {

        /* renamed from: a */
        final /* synthetic */ int f7183a;

        /* renamed from: b */
        final /* synthetic */ View f7184b;

        /* renamed from: c */
        final /* synthetic */ int f7185c;

        c(int i10, View view, int i11) {
            i.this = r1;
            this.f7183a = i10;
            this.f7184b = view;
            this.f7185c = i11;
        }

        @Override // androidx.core.view.s
        public j0 a(View view, j0 j0Var) {
            int i10 = j0Var.f(j0.m.c()).f3453b;
            if (this.f7183a >= 0) {
                this.f7184b.getLayoutParams().height = this.f7183a + i10;
                View view2 = this.f7184b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f7184b;
            view3.setPadding(view3.getPaddingLeft(), this.f7185c + i10, this.f7184b.getPaddingRight(), this.f7184b.getPaddingBottom());
            return j0Var;
        }
    }

    /* loaded from: classes.dex */
    public class d extends o<S> {
        d() {
            i.this = r1;
        }

        @Override // com.google.android.material.datepicker.o
        public void a(S s10) {
            i.this.W2();
            i.this.B5.setEnabled(i.this.M2().r());
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        e() {
            i.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.B5.setEnabled(i.this.M2().r());
            i.this.f7180z5.toggle();
            i iVar = i.this;
            iVar.X2(iVar.f7180z5);
            i.this.V2();
        }
    }

    private static Drawable K2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, g.a.b(context, b5.e.b_res_0x7f0700b1));
        stateListDrawable.addState(new int[0], g.a.b(context, b5.e.c_res_0x7f0700b3));
        return stateListDrawable;
    }

    private void L2(Window window) {
        if (this.C5) {
            return;
        }
        View findViewById = T1().findViewById(b5.f.f_res_0x7f090103);
        com.google.android.material.internal.d.a(window, true, com.google.android.material.internal.o.c(findViewById), null);
        y.A0(findViewById, new c(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.C5 = true;
    }

    public com.google.android.material.datepicker.d<S> M2() {
        if (this.f7167m5 == null) {
            this.f7167m5 = (com.google.android.material.datepicker.d) Q().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f7167m5;
    }

    private static int O2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(b5.d.L);
        int i10 = l.m().f7193x;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(b5.d.N) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(b5.d.Q));
    }

    private int Q2(Context context) {
        int i10 = this.f7166l5;
        return i10 != 0 ? i10 : M2().h(context);
    }

    private void R2(Context context) {
        this.f7180z5.setTag(F5);
        this.f7180z5.setImageDrawable(K2(context));
        this.f7180z5.setChecked(this.f7174t5 != 0);
        y.o0(this.f7180z5, null);
        X2(this.f7180z5);
        this.f7180z5.setOnClickListener(new e());
    }

    public static boolean S2(Context context) {
        return U2(context, 16843277);
    }

    public static boolean T2(Context context) {
        return U2(context, b5.b.B);
    }

    static boolean U2(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(q5.b.d(context, b5.b.f5464v, h.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    public void V2() {
        int Q2 = Q2(S1());
        this.f7170p5 = h.F2(M2(), Q2, this.f7169o5);
        this.f7168n5 = this.f7180z5.isChecked() ? k.p2(M2(), Q2, this.f7169o5) : this.f7170p5;
        W2();
        f0 p10 = S().p();
        p10.q(b5.f.x_res_0x7f090183, this.f7168n5);
        p10.j();
        this.f7168n5.n2(new d());
    }

    public void W2() {
        String N2 = N2();
        this.f7179y5.setContentDescription(String.format(u0(b5.j.m_res_0x7f10015a), N2));
        this.f7179y5.setText(N2);
    }

    public void X2(CheckableImageButton checkableImageButton) {
        this.f7180z5.setContentDescription(checkableImageButton.getContext().getString(this.f7180z5.isChecked() ? b5.j.p_res_0x7f100173 : b5.j.r_res_0x7f100175));
    }

    public String N2() {
        return M2().g(T());
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void P0(Bundle bundle) {
        super.P0(bundle);
        if (bundle == null) {
            bundle = Q();
        }
        this.f7166l5 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f7167m5 = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f7169o5 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f7171q5 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f7172r5 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f7174t5 = bundle.getInt("INPUT_MODE_KEY");
        this.f7175u5 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f7176v5 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f7177w5 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f7178x5 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    public final S P2() {
        return M2().t();
    }

    @Override // androidx.fragment.app.Fragment
    public final View T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        LinearLayout.LayoutParams layoutParams;
        View inflate = layoutInflater.inflate(this.f7173s5 ? b5.h.t_res_0x7f0c0068 : b5.h.s_res_0x7f0c0067, viewGroup);
        Context context = inflate.getContext();
        if (this.f7173s5) {
            view = inflate.findViewById(b5.f.x_res_0x7f090183);
            layoutParams = new LinearLayout.LayoutParams(O2(context), -2);
        } else {
            view = inflate.findViewById(b5.f.y_res_0x7f090184);
            layoutParams = new LinearLayout.LayoutParams(O2(context), -1);
        }
        view.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(b5.f.E_res_0x7f09018f);
        this.f7179y5 = textView;
        y.q0(textView, 1);
        this.f7180z5 = (CheckableImageButton) inflate.findViewById(b5.f.F_res_0x7f090191);
        TextView textView2 = (TextView) inflate.findViewById(b5.f.G_res_0x7f090195);
        CharSequence charSequence = this.f7172r5;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f7171q5);
        }
        R2(context);
        this.B5 = (Button) inflate.findViewById(b5.f.c_res_0x7f0900a8);
        if (M2().r()) {
            this.B5.setEnabled(true);
        } else {
            this.B5.setEnabled(false);
        }
        this.B5.setTag(D5);
        CharSequence charSequence2 = this.f7176v5;
        if (charSequence2 != null) {
            this.B5.setText(charSequence2);
        } else {
            int i10 = this.f7175u5;
            if (i10 != 0) {
                this.B5.setText(i10);
            }
        }
        this.B5.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(b5.f.f5482a);
        button.setTag(E5);
        CharSequence charSequence3 = this.f7178x5;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.f7177w5;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void l1(Bundle bundle) {
        super.l1(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f7166l5);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f7167m5);
        a.b bVar = new a.b(this.f7169o5);
        if (this.f7170p5.A2() != null) {
            bVar.b(this.f7170p5.A2().U3);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f7171q5);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f7172r5);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f7175u5);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f7176v5);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f7177w5);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f7178x5);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void m1() {
        super.m1();
        Window window = y2().getWindow();
        if (this.f7173s5) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.A5);
            L2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = o0().getDimensionPixelOffset(b5.d.P);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.A5, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new j5.a(y2(), rect));
        }
        V2();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void n1() {
        this.f7168n5.o2();
        super.n1();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f7164j5.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f7165k5.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) x0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.e
    public final Dialog u2(Bundle bundle) {
        Dialog dialog = new Dialog(S1(), Q2(S1()));
        Context context = dialog.getContext();
        this.f7173s5 = S2(context);
        int d10 = q5.b.d(context, b5.b.m_res_0x7f0300fb, i.class.getCanonicalName());
        t5.g gVar = new t5.g(context, null, b5.b.f5464v, b5.k.f5505x);
        this.A5 = gVar;
        gVar.O(context);
        this.A5.Z(ColorStateList.valueOf(d10));
        this.A5.Y(y.w(dialog.getWindow().getDecorView()));
        return dialog;
    }
}
