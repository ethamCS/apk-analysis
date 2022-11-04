package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
/* loaded from: classes.dex */
public class c extends h implements DialogInterface {

    /* renamed from: d */
    final AlertController f140d = new AlertController(getContext(), this, getWindow());

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final AlertController.f f141a;

        /* renamed from: b */
        private final int f142b;

        public a(Context context) {
            this(context, c.f(context, 0));
        }

        public a(Context context, int i) {
            this.f141a = new AlertController.f(new ContextThemeWrapper(context, c.f(context, i)));
            this.f142b = i;
        }

        public c a() {
            c cVar = new c(this.f141a.f118a, this.f142b);
            this.f141a.a(cVar.f140d);
            cVar.setCancelable(this.f141a.r);
            if (this.f141a.r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f141a.s);
            cVar.setOnDismissListener(this.f141a.t);
            DialogInterface.OnKeyListener onKeyListener = this.f141a.u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context b() {
            return this.f141a.f118a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f141a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f141a.f124g = view;
            return this;
        }

        public a e(int i) {
            this.f141a.f120c = i;
            return this;
        }

        public a f(Drawable drawable) {
            this.f141a.f121d = drawable;
            return this;
        }

        public a g(CharSequence charSequence) {
            this.f141a.f125h = charSequence;
            return this;
        }

        public a h(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f141a;
            fVar.v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f141a;
            fVar.l = charSequence;
            fVar.n = onClickListener;
            return this;
        }

        public a j(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f141a;
            fVar.o = fVar.f118a.getText(i);
            this.f141a.q = onClickListener;
            return this;
        }

        public a k(DialogInterface.OnKeyListener onKeyListener) {
            this.f141a.u = onKeyListener;
            return this;
        }

        public a l(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f141a;
            fVar.i = fVar.f118a.getText(i);
            this.f141a.k = onClickListener;
            return this;
        }

        public a m(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f141a;
            fVar.i = charSequence;
            fVar.k = onClickListener;
            return this;
        }

        public a n(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f141a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public a o(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f141a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public a p(int i) {
            AlertController.f fVar = this.f141a;
            fVar.f123f = fVar.f118a.getText(i);
            return this;
        }

        public a q(CharSequence charSequence) {
            this.f141a.f123f = charSequence;
            return this;
        }

        public a r(View view) {
            AlertController.f fVar = this.f141a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = false;
            return this;
        }

        public c s() {
            c a2 = a();
            a2.show();
            return a2;
        }
    }

    protected c(Context context, int i) {
        super(context, f(context, i));
    }

    static int f(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(b.a.a.o_res_0x7f040028, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f140d.d();
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f140d.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f140d.g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f140d.h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f140d.q(charSequence);
    }
}
