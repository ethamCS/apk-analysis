package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class k {

    /* renamed from: c */
    private float f7418c;

    /* renamed from: f */
    private q5.d f7421f;

    /* renamed from: a */
    private final TextPaint f7416a = new TextPaint(1);

    /* renamed from: b */
    private final q5.f f7417b = new a();

    /* renamed from: d */
    private boolean f7419d = true;

    /* renamed from: e */
    private WeakReference<b> f7420e = new WeakReference<>(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends q5.f {
        a() {
            k.this = r1;
        }

        @Override // q5.f
        public void a(int i10) {
            k.this.f7419d = true;
            b bVar = (b) k.this.f7420e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // q5.f
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            k.this.f7419d = true;
            b bVar = (b) k.this.f7420e.get();
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

    public k(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f7416a.measureText(charSequence, 0, charSequence.length());
    }

    public q5.d d() {
        return this.f7421f;
    }

    public TextPaint e() {
        return this.f7416a;
    }

    public float f(String str) {
        if (!this.f7419d) {
            return this.f7418c;
        }
        float c10 = c(str);
        this.f7418c = c10;
        this.f7419d = false;
        return c10;
    }

    public void g(b bVar) {
        this.f7420e = new WeakReference<>(bVar);
    }

    public void h(q5.d dVar, Context context) {
        if (this.f7421f != dVar) {
            this.f7421f = dVar;
            if (dVar != null) {
                dVar.o(context, this.f7416a, this.f7417b);
                b bVar = this.f7420e.get();
                if (bVar != null) {
                    this.f7416a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f7416a, this.f7417b);
                this.f7419d = true;
            }
            b bVar2 = this.f7420e.get();
            if (bVar2 == null) {
                return;
            }
            bVar2.a();
            bVar2.onStateChange(bVar2.getState());
        }
    }

    public void i(boolean z10) {
        this.f7419d = z10;
    }

    public void j(Context context) {
        this.f7421f.n(context, this.f7416a, this.f7417b);
    }
}
