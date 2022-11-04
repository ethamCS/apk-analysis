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
public class d extends i implements DialogInterface {
    final AlertController d = new AlertController(getContext(), this, getWindow());

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final AlertController.f f491a;

        /* renamed from: b */
        private final int f492b;

        public a(Context context) {
            this(context, d.a(context, 0));
        }

        public a(Context context, int i) {
            this.f491a = new AlertController.f(new ContextThemeWrapper(context, d.a(context, i)));
            this.f492b = i;
        }

        public a a(DialogInterface.OnKeyListener onKeyListener) {
            this.f491a.u = onKeyListener;
            return this;
        }

        public a a(Drawable drawable) {
            this.f491a.d = drawable;
            return this;
        }

        public a a(View view) {
            this.f491a.g = view;
            return this;
        }

        public a a(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f491a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f491a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a a(CharSequence charSequence) {
            this.f491a.h = charSequence;
            return this;
        }

        public a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f491a;
            fVar.i = charSequence;
            fVar.k = onClickListener;
            return this;
        }

        public a a(boolean z) {
            this.f491a.r = z;
            return this;
        }

        public d a() {
            d dVar = new d(this.f491a.f463a, this.f492b);
            this.f491a.a(dVar.d);
            dVar.setCancelable(this.f491a.r);
            if (this.f491a.r) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.f491a.s);
            dVar.setOnDismissListener(this.f491a.t);
            DialogInterface.OnKeyListener onKeyListener = this.f491a.u;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }

        public Context b() {
            return this.f491a.f463a;
        }

        public a b(View view) {
            AlertController.f fVar = this.f491a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = false;
            return this;
        }

        public a b(CharSequence charSequence) {
            this.f491a.f = charSequence;
            return this;
        }

        public d c() {
            d a2 = a();
            a2.show();
            return a2;
        }
    }

    protected d(Context context, int i) {
        super(context, a(context, i));
    }

    static int a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.a.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView b() {
        return this.d.a();
    }

    @Override // androidx.appcompat.app.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.b();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.d.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.d.b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.i, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.d.b(charSequence);
    }
}
