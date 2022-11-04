package androidx.appcompat.app;

import a.a.n.b;
import a.g.l.d;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class i extends Dialog implements f {

    /* renamed from: b */
    private g f518b;

    /* renamed from: c */
    private final d.a f519c = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d.a {
        a() {
            i.this = r1;
        }

        @Override // a.g.l.d.a
        public boolean a(KeyEvent keyEvent) {
            return i.this.a(keyEvent);
        }
    }

    public i(Context context, int i) {
        super(context, a(context, i));
        g a2 = a();
        a2.d(a(context, i));
        a2.a((Bundle) null);
    }

    private static int a(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(a.a.a.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // androidx.appcompat.app.f
    public a.a.n.b a(b.a aVar) {
        return null;
    }

    public g a() {
        if (this.f518b == null) {
            this.f518b = g.a(this, this);
        }
        return this.f518b;
    }

    @Override // androidx.appcompat.app.f
    public void a(a.a.n.b bVar) {
    }

    public boolean a(int i) {
        return a().b(i);
    }

    boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    @Override // androidx.appcompat.app.f
    public void b(a.a.n.b bVar) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a.g.l.d.a(this.f519c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) a().a(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().f();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().e();
        super.onCreate(bundle);
        a().a(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().j();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().c(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }
}
