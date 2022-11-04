package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import io.flutter.embedding.engine.i.n;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
class c extends SpannableStringBuilder {

    /* renamed from: a */
    private int f1147a = 0;

    /* renamed from: b */
    private int f1148b = 0;

    /* renamed from: c */
    private ArrayList<b> f1149c = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<b> f1150d = new ArrayList<>();

    /* renamed from: e */
    private String f1151e;
    private String f;
    private int g;
    private int h;
    private int i;
    private int j;
    private BaseInputConnection k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends BaseInputConnection {

        /* renamed from: a */
        final /* synthetic */ Editable f1152a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, View view, boolean z, Editable editable) {
            super(view, z);
            this.f1152a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f1152a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z, boolean z2, boolean z3);
    }

    public c(n.e eVar, View view) {
        if (eVar != null) {
            l(eVar);
        }
        this.k = new a(this, view, true, this);
    }

    private void h(b bVar, boolean z, boolean z2, boolean z3) {
        this.f1148b++;
        bVar.a(z, z2, z3);
        this.f1148b--;
    }

    private void i(boolean z, boolean z2, boolean z3) {
        if (z || z2 || z3) {
            Iterator<b> it = this.f1149c.iterator();
            while (it.hasNext()) {
                h(it.next(), z, z2, z3);
            }
        }
    }

    public void a(b bVar) {
        ArrayList<b> arrayList;
        if (this.f1148b > 0) {
            d.a.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f1147a > 0) {
            d.a.b.f("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f1150d;
        } else {
            arrayList = this.f1149c;
        }
        arrayList.add(bVar);
    }

    public void b() {
        this.f1147a++;
        if (this.f1148b > 0) {
            d.a.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f1147a != 1 || this.f1149c.isEmpty()) {
            return;
        }
        this.f = toString();
        this.g = g();
        this.h = f();
        this.i = e();
        this.j = d();
    }

    public void c() {
        int i = this.f1147a;
        if (i == 0) {
            d.a.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i == 1) {
            Iterator<b> it = this.f1150d.iterator();
            while (it.hasNext()) {
                h(it.next(), true, true, true);
            }
            if (!this.f1149c.isEmpty()) {
                d.a.b.e("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f1149c.size()) + " listener(s)");
                boolean equals = toString().equals(this.f) ^ true;
                boolean z = false;
                boolean z2 = (this.g == g() && this.h == f()) ? false : true;
                if (this.i != e() || this.j != d()) {
                    z = true;
                }
                i(equals, z2, z);
            }
        }
        this.f1149c.addAll(this.f1150d);
        this.f1150d.clear();
        this.f1147a--;
    }

    public final int d() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int e() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int f() {
        return Selection.getSelectionEnd(this);
    }

    public final int g() {
        return Selection.getSelectionStart(this);
    }

    public void j(b bVar) {
        if (this.f1148b > 0) {
            d.a.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f1149c.remove(bVar);
        if (this.f1147a > 0) {
            this.f1150d.remove(bVar);
        }
    }

    public void k(int i, int i2) {
        if (i < 0 || i >= i2) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.k.setComposingRegion(i, i2);
        }
    }

    public void l(n.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.f1102a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f1103b, eVar.f1104c);
        } else {
            Selection.removeSelection(this);
        }
        k(eVar.f1105d, eVar.f1106e);
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f1148b > 0) {
            d.a.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        int i5 = i2 - i;
        boolean z = true;
        boolean z2 = i5 != i4 - i3;
        for (int i6 = 0; i6 < i5 && !z2; i6++) {
            z2 |= charAt(i + i6) != charSequence.charAt(i3 + i6);
        }
        if (z2) {
            this.f1151e = null;
        }
        int g = g();
        int f = f();
        int e2 = e();
        int d2 = d();
        SpannableStringBuilder replace = super.replace(i, i2, charSequence, i3, i4);
        if (this.f1147a > 0) {
            return replace;
        }
        boolean z3 = (g() == g && f() == f) ? false : true;
        if (e() == e2 && d() == d2) {
            z = false;
        }
        i(z2, z3, z);
        return replace;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f1151e;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f1151e = spannableStringBuilder;
        return spannableStringBuilder;
    }
}
