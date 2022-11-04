package m8;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import hc.t;
import hc.v;
import kotlin.Lazy;
import kotlin.Metadata;
import m7.k;
import tb.m;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lm8/i;", "Landroidx/fragment/app/e;", "Lm8/c;", "dialogModel", "Landroidx/appcompat/app/b;", "I2", "Ltb/e0;", "G2", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "u2", "Landroid/content/DialogInterface;", "dialog", "onCancel", "Lm8/j;", "args$delegate", "Lkotlin/Lazy;", "M2", "()Lm8/j;", "args", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class i extends androidx.fragment.app.e {

    /* renamed from: h5 */
    private final Lazy f16453h5;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm8/j;", "b", "()Lm8/j;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<j> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            i.this = r1;
        }

        /* renamed from: b */
        public final j invoke() {
            return (j) k.a(i.this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"m8/i$b", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/d;", "info", "Ltb/e0;", "g", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            t.e(view, "host");
            t.e(dVar, "info");
            super.g(view, dVar);
            dVar.g0(true);
        }
    }

    public i() {
        Lazy a10;
        a10 = m.a(new a());
        this.f16453h5 = a10;
    }

    private final void G2(final androidx.appcompat.app.b bVar, final c cVar) {
        bVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: m8.h
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i.H2(androidx.appcompat.app.b.this, cVar, dialogInterface);
            }
        });
    }

    public static final void H2(androidx.appcompat.app.b bVar, c cVar, DialogInterface dialogInterface) {
        t.e(bVar, "$this_applyButtonColors");
        t.e(cVar, "$dialogModel");
        bVar.e(-1).setTextColor(androidx.core.content.a.b(bVar.getContext(), cVar.i()));
        bVar.e(-2).setTextColor(androidx.core.content.a.b(bVar.getContext(), cVar.e()));
        bVar.e(-3).setTextColor(androidx.core.content.a.b(bVar.getContext(), cVar.g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.appcompat.app.b I2(final m8.c r8) {
        /*
            r7 = this;
            androidx.fragment.app.j r0 = r7.F()
            r1 = 0
            if (r0 == 0) goto Lf6
            android.view.LayoutInflater r0 = r7.d0()
            k8.i r0 = k8.i.d(r0)
            java.lang.String r2 = "inflate(layoutInflater)"
            hc.t.d(r0, r2)
            android.widget.TextView r2 = r0.f14749b
            m8.i$b r3 = new m8.i$b
            r3.<init>()
            androidx.core.view.y.o0(r2, r3)
            android.widget.TextView r2 = r0.f14749b
            java.lang.Integer r3 = r8.r()
            r4 = 0
            if (r3 == 0) goto L44
            int r3 = r3.intValue()
            java.util.List r5 = r8.p()
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Object[] r5 = r5.toArray(r6)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            hc.t.c(r5, r6)
            int r6 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            java.lang.String r3 = r7.v0(r3, r5)
            goto L45
        L44:
            r3 = r1
        L45:
            r2.setText(r3)
            j5.b r2 = new j5.b
            androidx.fragment.app.j r3 = r7.F()
            java.lang.String r5 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            hc.t.c(r3, r5)
            int r5 = r8.k()
            r2.<init>(r3, r5)
            int r3 = r8.b()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r5 = r3.intValue()
            if (r5 <= 0) goto L69
            r4 = 1
        L69:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L74
            goto L75
        L74:
            r3 = r1
        L75:
            if (r3 == 0) goto L86
            int r3 = r3.intValue()
            androidx.fragment.app.j r4 = r7.F()
            if (r4 == 0) goto L86
            android.graphics.drawable.Drawable r3 = androidx.core.content.a.d(r4, r3)
            goto L87
        L86:
            r3 = r1
        L87:
            j5.b r2 = r2.f(r3)
            android.widget.TextView r0 = r0.f14749b
            j5.b r0 = r2.e(r0)
            java.lang.String r2 = r8.c()
            j5.b r0 = r0.u(r2)
            java.lang.Integer r2 = r8.j()
            if (r2 == 0) goto La8
            int r2 = r2.intValue()
            java.lang.String r2 = r7.u0(r2)
            goto La9
        La8:
            r2 = r1
        La9:
            m8.e r3 = new m8.e
            r3.<init>()
            j5.b r0 = r0.y(r2, r3)
            java.lang.Integer r2 = r8.f()
            if (r2 == 0) goto Lc1
            int r2 = r2.intValue()
            java.lang.String r2 = r7.u0(r2)
            goto Lc2
        Lc1:
            r2 = r1
        Lc2:
            m8.g r3 = new m8.g
            r3.<init>()
            j5.b r0 = r0.v(r2, r3)
            java.lang.Integer r2 = r8.h()
            if (r2 == 0) goto Ld9
            int r1 = r2.intValue()
            java.lang.String r1 = r7.u0(r1)
        Ld9:
            m8.f r2 = new m8.f
            r2.<init>()
            j5.b r0 = r0.w(r1, r2)
            boolean r1 = r8.s()
            j5.b r0 = r0.r(r1)
            androidx.appcompat.app.b r1 = r0.a()
            java.lang.String r0 = "dialog"
            hc.t.d(r1, r0)
            r7.G2(r1, r8)
        Lf6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.i.I2(m8.c):androidx.appcompat.app.b");
    }

    public static final void J2(i iVar, c cVar, DialogInterface dialogInterface, int i10) {
        t.e(iVar, "this$0");
        t.e(cVar, "$dialogModel");
        iVar.q2();
        d.a(iVar, cVar.n(), m8.a.NEUTRAL);
    }

    public static final void K2(i iVar, c cVar, DialogInterface dialogInterface, int i10) {
        t.e(iVar, "this$0");
        t.e(cVar, "$dialogModel");
        iVar.q2();
        d.a(iVar, cVar.n(), m8.a.POSITIVE);
    }

    public static final void L2(i iVar, c cVar, DialogInterface dialogInterface, int i10) {
        t.e(iVar, "this$0");
        t.e(cVar, "$dialogModel");
        iVar.q2();
        d.a(iVar, cVar.n(), m8.a.NEGATIVE);
    }

    private final j M2() {
        return (j) this.f16453h5.getValue();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        t.e(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        d.a(this, M2().c().n(), m8.a.NEGATIVE);
    }

    @Override // androidx.fragment.app.e
    public Dialog u2(Bundle bundle) {
        androidx.appcompat.app.b I2 = I2(M2().c());
        if (I2 != null) {
            return I2;
        }
        Dialog u22 = super.u2(bundle);
        t.d(u22, "super.onCreateDialog(savedInstanceState)");
        return u22;
    }
}
