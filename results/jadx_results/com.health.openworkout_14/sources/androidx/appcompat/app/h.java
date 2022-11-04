package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import b.a.o.b;
import b.g.l.f;
/* loaded from: classes.dex */
public class h extends Dialog implements e {

    /* renamed from: b */
    private f f180b;

    /* renamed from: c */
    private final f.a f181c = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements f.a {
        a() {
            h.this = r1;
        }

        @Override // b.g.l.f.a
        public boolean e(KeyEvent keyEvent) {
            return h.this.c(keyEvent);
        }
    }

    public h(Context context, int i) {
        super(context, b(context, i));
        f a2 = a();
        a2.I(b(context, i));
        a2.t(null);
    }

    private static int b(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(b.a.a.z_res_0x7f040111, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    public f a() {
        if (this.f180b == null) {
            this.f180b = f.j(this, this);
        }
        return this.f180b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i) {
        return a().C(i);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().u();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return b.g.l.f.e(this.f181c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) a().k(i);
    }

    @Override // androidx.appcompat.app.e
    public void g(b.a.o.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void i(b.a.o.b bVar) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().r();
    }

    @Override // androidx.appcompat.app.e
    public b.a.o.b j(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().q();
        super.onCreate(bundle);
        a().t(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().z();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().D(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().E(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().F(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().J(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().J(charSequence);
    }
}
