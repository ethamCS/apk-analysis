package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import b.a.a.a.m.h;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;
/* loaded from: classes.dex */
public interface d {
    h a();

    void a(h hVar);

    void a(ExtendedFloatingActionButton.d dVar);

    AnimatorSet b();

    boolean c();

    void d();

    void e();

    List<Animator.AnimatorListener> f();

    void g();

    void onAnimationStart(Animator animator);
}
