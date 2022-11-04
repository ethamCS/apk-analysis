package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class n {

    /* renamed from: c */
    private float f3226c;

    /* renamed from: f */
    private d.a.a.a.x.d f3229f;

    /* renamed from: a */
    private final TextPaint f3224a = new TextPaint(1);

    /* renamed from: b */
    private final d.a.a.a.x.f f3225b = new a();

    /* renamed from: d */
    private boolean f3227d = true;

    /* renamed from: e */
    private WeakReference<b> f3228e = new WeakReference<>(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends d.a.a.a.x.f {
        a() {
            n.this = r1;
        }

        @Override // d.a.a.a.x.f
        public void a(int i) {
            n.this.f3227d = true;
            b bVar = (b) n.this.f3228e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // d.a.a.a.x.f
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            n.this.f3227d = true;
            b bVar = (b) n.this.f3228e.get();
            if (bVar == null) {
                return;
            }
            bVar.a();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public n(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f3224a.measureText(charSequence, 0, charSequence.length());
    }

    public d.a.a.a.x.d d() {
        return this.f3229f;
    }

    public TextPaint e() {
        return this.f3224a;
    }

    public float f(String str) {
        if (!this.f3227d) {
            return this.f3226c;
        }
        float c2 = c(str);
        this.f3226c = c2;
        this.f3227d = false;
        return c2;
    }

    public void g(b bVar) {
        this.f3228e = new WeakReference<>(bVar);
    }

    public void h(d.a.a.a.x.d dVar, Context context) {
        if (this.f3229f != dVar) {
            this.f3229f = dVar;
            if (dVar != null) {
                dVar.j(context, this.f3224a, this.f3225b);
                b bVar = this.f3228e.get();
                if (bVar != null) {
                    this.f3224a.drawableState = bVar.getState();
                }
                dVar.i(context, this.f3224a, this.f3225b);
                this.f3227d = true;
            }
            b bVar2 = this.f3228e.get();
            if (bVar2 == null) {
                return;
            }
            bVar2.a();
            bVar2.onStateChange(bVar2.getState());
        }
    }

    public void i(boolean z) {
        this.f3227d = z;
    }

    public void j(Context context) {
        this.f3229f.i(context, this.f3224a, this.f3225b);
    }
}
