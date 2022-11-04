package com.health.openworkout.gui.workout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.navigation.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
import com.health.openworkout.core.datatypes.WorkoutSession;
import com.health.openworkout.gui.datatypes.GenericFragment;
import com.health.openworkout.gui.datatypes.GenericSettingsFragment;
import com.health.openworkout.gui.workout.c;
import java.util.List;
/* loaded from: classes.dex */
public class WorkoutFragment extends GenericFragment {
    private RecyclerView b0;
    private WorkoutSession c0;
    private List<WorkoutItem> d0;
    private FloatingActionButton e0;
    private FloatingActionButton f0;
    private FloatingActionButton g0;
    private LinearLayout h0;
    private LinearLayout i0;
    private Animation j0;
    private Animation k0;
    private Animation l0;
    private Animation m0;
    private boolean n0;
    private g o0;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
            WorkoutFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WorkoutFragment workoutFragment;
            boolean z = false;
            if (WorkoutFragment.this.n0) {
                WorkoutFragment.this.h0.setVisibility(8);
                WorkoutFragment.this.h0.startAnimation(WorkoutFragment.this.k0);
                WorkoutFragment.this.i0.setVisibility(8);
                WorkoutFragment.this.i0.startAnimation(WorkoutFragment.this.k0);
                WorkoutFragment.this.e0.startAnimation(WorkoutFragment.this.m0);
                workoutFragment = WorkoutFragment.this;
            } else {
                WorkoutFragment.this.h0.setVisibility(0);
                WorkoutFragment.this.h0.startAnimation(WorkoutFragment.this.j0);
                WorkoutFragment.this.i0.setVisibility(0);
                WorkoutFragment.this.i0.startAnimation(WorkoutFragment.this.j0);
                WorkoutFragment.this.e0.startAnimation(WorkoutFragment.this.l0);
                workoutFragment = WorkoutFragment.this;
                z = true;
            }
            workoutFragment.n0 = z;
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
            WorkoutFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            long b2 = com.health.openworkout.gui.workout.b.a(WorkoutFragment.this.r()).b();
            c.d c2 = com.health.openworkout.gui.workout.c.c();
            c2.g(GenericSettingsFragment.SETTING_MODE.ADD);
            c2.i(WorkoutFragment.this.N(R.string.label_add));
            c2.h(b2);
            c2.j(-1L);
            t.a(WorkoutFragment.this.m(), R.id.nav_host_fragment).r(c2);
        }
    }

    /* loaded from: classes.dex */
    class c implements View.OnClickListener {
        c() {
            WorkoutFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.b a2 = com.health.openworkout.gui.workout.c.a();
            a2.e(WorkoutFragment.this.c0.getWorkoutSessionId());
            t.a(WorkoutFragment.this.m(), R.id.nav_host_fragment).r(a2);
        }
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected com.health.openworkout.gui.datatypes.a B1() {
        return this.o0;
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected List C1() {
        return this.d0;
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected RecyclerView F1() {
        return this.b0;
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected String G1() {
        return this.c0.getName();
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void H1() {
        WorkoutSession m = com.health.openworkout.core.a.h().m(com.health.openworkout.gui.workout.b.a(r()).b());
        this.c0 = m;
        this.d0 = m.getWorkoutItems();
        g gVar = new g(t(), this.d0);
        this.o0 = gVar;
        gVar.P(D1());
        this.b0.setAdapter(this.o0);
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void I1(int i) {
        Toast.makeText(t(), String.format(N(R.string.label_delete_toast), this.d0.get(i).getName()), 0).show();
        com.health.openworkout.core.a.h().c(this.d0.get(i));
        this.d0.remove(i);
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void J1(int i) {
        WorkoutItem clone = this.d0.get(i).clone();
        clone.setWorkoutItemId(0L);
        this.d0.add(i, clone);
        Q1();
        clone.setWorkoutItemId(com.health.openworkout.core.a.h().p(clone));
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void K1(int i) {
        c.d c2 = com.health.openworkout.gui.workout.c.c();
        c2.h(this.c0.getWorkoutSessionId());
        c2.j(this.d0.get(i).getWorkoutItemId());
        c2.g(GenericSettingsFragment.SETTING_MODE.EDIT);
        c2.i(N(R.string.label_edit));
        t.a(m(), R.id.nav_host_fragment).r(c2);
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void N1() {
        for (WorkoutItem workoutItem : this.d0) {
            workoutItem.setFinished(false);
            com.health.openworkout.core.a.h().u(workoutItem);
        }
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void O1(int i) {
        c.C0097c b2 = com.health.openworkout.gui.workout.c.b();
        b2.g(this.c0.getName());
        b2.f(this.c0.getWorkoutSessionId());
        b2.h(this.d0.get(i).getWorkoutItemId());
        t.a(m(), R.id.nav_host_fragment).r(b2);
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void Q1() {
        for (int i = 0; i < this.d0.size(); i++) {
            this.d0.get(i).setOrderNr(i);
            com.health.openworkout.core.a.h().u(this.d0.get(i));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_workout, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.workoutsView);
        this.b0 = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.b0.setLayoutManager(new LinearLayoutManager(t()));
        this.n0 = false;
        this.e0 = (FloatingActionButton) inflate.findViewById(R.id.expandableButton);
        this.f0 = (FloatingActionButton) inflate.findViewById(R.id.addButton);
        this.h0 = (LinearLayout) inflate.findViewById(R.id.addLayout);
        this.g0 = (FloatingActionButton) inflate.findViewById(R.id.addFromDatabaseButton);
        this.i0 = (LinearLayout) inflate.findViewById(R.id.addFromDatabaseLayout);
        this.k0 = AnimationUtils.loadAnimation(t(), R.anim.fab_close);
        this.j0 = AnimationUtils.loadAnimation(t(), R.anim.fab_open);
        this.l0 = AnimationUtils.loadAnimation(t(), R.anim.fab_rotate_clock);
        this.m0 = AnimationUtils.loadAnimation(t(), R.anim.fab_rotate_anticlock);
        this.e0.setOnClickListener(new a());
        this.f0.setOnClickListener(new b());
        this.g0.setOnClickListener(new c());
        H1();
        return inflate;
    }
}
