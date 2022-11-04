package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.a1;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0003\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0015J\b\u0010\u000b\u001a\u00020\u0004H\u0015J\b\u0010\f\u001a\u00020\u0004H\u0015J\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\u0004H\u0017J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006%"}, d2 = {"Landroidx/activity/f;", "Landroid/app/Dialog;", "Landroidx/lifecycle/v;", "Landroidx/activity/h;", "Ltb/e0;", "d", "Landroidx/lifecycle/m;", "c", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onStop", "Landroidx/activity/OnBackPressedDispatcher;", "f", "onBackPressed", BuildConfig.FLAVOR, "layoutResID", "setContentView", "Landroid/view/View;", "view", "Landroid/view/ViewGroup$LayoutParams;", "params", "addContentView", "Landroidx/lifecycle/x;", "Landroidx/lifecycle/x;", "_lifecycleRegistry", "Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher", "b", "()Landroidx/lifecycle/x;", "lifecycleRegistry", "Landroid/content/Context;", "context", "themeResId", "<init>", "(Landroid/content/Context;I)V", "activity_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class f extends Dialog implements v, h {

    /* renamed from: c */
    private x f602c;

    /* renamed from: d */
    private final OnBackPressedDispatcher f603d = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.e
        @Override // java.lang.Runnable
        public final void run() {
            f.e(f.this);
        }
    });

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, int i10) {
        super(context, i10);
        t.e(context, "context");
    }

    private final x b() {
        x xVar = this.f602c;
        if (xVar == null) {
            x xVar2 = new x(this);
            this.f602c = xVar2;
            return xVar2;
        }
        return xVar;
    }

    private final void d() {
        Window window = getWindow();
        t.b(window);
        a1.a(window.getDecorView(), this);
        Window window2 = getWindow();
        t.b(window2);
        View decorView = window2.getDecorView();
        t.d(decorView, "window!!.decorView");
        j.a(decorView, this);
    }

    public static final void e(f fVar) {
        t.e(fVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.v
    public final m c() {
        return b();
    }

    @Override // androidx.activity.h
    public final OnBackPressedDispatcher f() {
        return this.f603d;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f603d.c();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b().h(m.b.ON_CREATE);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().h(m.b.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().h(m.b.ON_DESTROY);
        this.f602c = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        d();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        t.e(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
