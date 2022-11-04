package f;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.d;
import androidx.core.view.f;
import k.b;
/* loaded from: classes.dex */
public class b extends Dialog implements f.a {

    /* renamed from: c */
    private d f9721c;

    /* renamed from: d */
    private final f.a f9722d = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements f.a {
        a() {
            b.this = r1;
        }

        @Override // androidx.core.view.f.a
        public boolean l(KeyEvent keyEvent) {
            return b.this.c(keyEvent);
        }
    }

    public b(Context context, int i10) {
        super(context, b(context, i10));
        d a10 = a();
        a10.E(b(context, i10));
        a10.q(null);
    }

    private static int b(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(e.a.z_res_0x7f030147, typedValue, true);
            return typedValue.resourceId;
        }
        return i10;
    }

    @Override // f.a
    public void H(k.b bVar) {
    }

    public d a() {
        if (this.f9721c == null) {
            this.f9721c = d.h(this, this);
        }
        return this.f9721c;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i10) {
        return a().z(i10);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return f.e(this.f9722d, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) a().i(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().o();
    }

    @Override // f.a
    public void k(k.b bVar) {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().n();
        super.onCreate(bundle);
        a().q(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().w();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        a().A(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        a().F(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().F(charSequence);
    }

    @Override // f.a
    public k.b z(b.a aVar) {
        return null;
    }
}
