package com.google.android.material.internal;

import a.m.s;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
/* loaded from: classes.dex */
public class l extends a.m.m {

    /* loaded from: classes.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TextView f1542a;

        a(l lVar, TextView textView) {
            this.f1542a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f1542a.setScaleX(floatValue);
            this.f1542a.setScaleY(floatValue);
        }
    }

    private void d(s sVar) {
        View view = sVar.f391b;
        if (view instanceof TextView) {
            sVar.f390a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // a.m.m
    public Animator a(ViewGroup viewGroup, s sVar, s sVar2) {
        if (sVar == null || sVar2 == null || !(sVar.f391b instanceof TextView)) {
            return null;
        }
        View view = sVar2.f391b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = sVar.f390a;
        Map<String, Object> map2 = sVar2.f390a;
        float f = 1.0f;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        if (map2.get("android:textscale:scale") != null) {
            f = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, f);
        ofFloat.addUpdateListener(new a(this, textView));
        return ofFloat;
    }

    @Override // a.m.m
    public void a(s sVar) {
        d(sVar);
    }

    @Override // a.m.m
    public void c(s sVar) {
        d(sVar);
    }
}
