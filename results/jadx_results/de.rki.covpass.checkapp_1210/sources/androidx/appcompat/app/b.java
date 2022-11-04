package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
/* loaded from: classes.dex */
public class b extends f.b {

    /* renamed from: q */
    final AlertController f707q = new AlertController(getContext(), this, getWindow());

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final AlertController.b f708a;

        /* renamed from: b */
        private final int f709b;

        public a(Context context) {
            this(context, b.g(context, 0));
        }

        public a(Context context, int i10) {
            this.f708a = new AlertController.b(new ContextThemeWrapper(context, b.g(context, i10)));
            this.f709b = i10;
        }

        public b a() {
            b bVar = new b(this.f708a.f667a, this.f709b);
            this.f708a.a(bVar.f707q);
            bVar.setCancelable(this.f708a.f684r);
            if (this.f708a.f684r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f708a.f685s);
            bVar.setOnDismissListener(this.f708a.f686t);
            DialogInterface.OnKeyListener onKeyListener = this.f708a.f687u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f708a.f667a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f708a;
            bVar.f689w = listAdapter;
            bVar.f690x = onClickListener;
            return this;
        }

        public a d(boolean z10) {
            this.f708a.f684r = z10;
            return this;
        }

        public a e(View view) {
            this.f708a.f673g = view;
            return this;
        }

        public a f(Drawable drawable) {
            this.f708a.f670d = drawable;
            return this;
        }

        public a g(CharSequence charSequence) {
            this.f708a.f674h = charSequence;
            return this;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f708a;
            bVar.f678l = charSequence;
            bVar.f680n = onClickListener;
            return this;
        }

        public a i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f708a;
            bVar.f681o = charSequence;
            bVar.f683q = onClickListener;
            return this;
        }

        public a j(DialogInterface.OnKeyListener onKeyListener) {
            this.f708a.f687u = onKeyListener;
            return this;
        }

        public a k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f708a;
            bVar.f675i = charSequence;
            bVar.f677k = onClickListener;
            return this;
        }

        public a l(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f708a;
            bVar.f689w = listAdapter;
            bVar.f690x = onClickListener;
            bVar.I = i10;
            bVar.H = true;
            return this;
        }

        public a m(CharSequence charSequence) {
            this.f708a.f672f = charSequence;
            return this;
        }
    }

    protected b(Context context, int i10) {
        super(context, g(context, i10));
    }

    static int g(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.o_res_0x7f03002a, typedValue, true);
        return typedValue.resourceId;
    }

    public Button e(int i10) {
        return this.f707q.c(i10);
    }

    public ListView f() {
        return this.f707q.e();
    }

    @Override // f.b, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f707q.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f707q.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f707q.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // f.b, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f707q.q(charSequence);
    }
}
