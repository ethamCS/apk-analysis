package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class k {

    /* renamed from: c */
    private float f1540c;
    private b.a.a.a.y.d f;

    /* renamed from: a */
    private final TextPaint f1538a = new TextPaint(1);

    /* renamed from: b */
    private final b.a.a.a.y.f f1539b = new a();
    private boolean d = true;
    private WeakReference<b> e = new WeakReference<>(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends b.a.a.a.y.f {
        a() {
            k.this = r1;
        }

        @Override // b.a.a.a.y.f
        public void a(int i) {
            k.this.d = true;
            b bVar = (b) k.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // b.a.a.a.y.f
        public void a(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            k.this.d = true;
            b bVar = (b) k.this.e.get();
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
        a(bVar);
    }

    private float a(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f1538a.measureText(charSequence, 0, charSequence.length());
    }

    public float a(String str) {
        if (!this.d) {
            return this.f1540c;
        }
        float a2 = a((CharSequence) str);
        this.f1540c = a2;
        this.d = false;
        return a2;
    }

    public b.a.a.a.y.d a() {
        return this.f;
    }

    public void a(Context context) {
        this.f.b(context, this.f1538a, this.f1539b);
    }

    public void a(b.a.a.a.y.d dVar, Context context) {
        if (this.f != dVar) {
            this.f = dVar;
            if (dVar != null) {
                dVar.c(context, this.f1538a, this.f1539b);
                b bVar = this.e.get();
                if (bVar != null) {
                    this.f1538a.drawableState = bVar.getState();
                }
                dVar.b(context, this.f1538a, this.f1539b);
                this.d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 == null) {
                return;
            }
            bVar2.a();
            bVar2.onStateChange(bVar2.getState());
        }
    }

    public void a(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public void a(boolean z) {
        this.d = z;
    }

    public TextPaint b() {
        return this.f1538a;
    }
}
