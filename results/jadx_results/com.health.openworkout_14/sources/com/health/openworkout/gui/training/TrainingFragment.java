package com.health.openworkout.gui.training;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.navigation.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.TrainingPlan;
import com.health.openworkout.core.datatypes.User;
import com.health.openworkout.core.datatypes.WorkoutItem;
import com.health.openworkout.core.datatypes.WorkoutSession;
import com.health.openworkout.gui.datatypes.GenericFragment;
import com.health.openworkout.gui.datatypes.GenericSettingsFragment;
import com.health.openworkout.gui.training.b;
import java.util.List;
/* loaded from: classes.dex */
public class TrainingFragment extends GenericFragment {
    private RecyclerView b0;
    private FloatingActionButton c0;
    private FloatingActionButton d0;
    private FloatingActionButton e0;
    private FloatingActionButton f0;
    private LinearLayout g0;
    private LinearLayout h0;
    private LinearLayout i0;
    private Animation j0;
    private Animation k0;
    private Animation l0;
    private Animation m0;
    private boolean n0;
    private List<TrainingPlan> o0;
    private TrainingPlan p0;
    private com.health.openworkout.gui.training.d q0;
    private com.health.openworkout.gui.utils.a r0;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
            TrainingFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrainingFragment trainingFragment;
            boolean z = false;
            if (TrainingFragment.this.n0) {
                TrainingFragment.this.g0.setVisibility(8);
                TrainingFragment.this.i0.setVisibility(8);
                TrainingFragment.this.h0.setVisibility(8);
                TrainingFragment.this.g0.startAnimation(TrainingFragment.this.k0);
                TrainingFragment.this.i0.startAnimation(TrainingFragment.this.k0);
                TrainingFragment.this.h0.startAnimation(TrainingFragment.this.k0);
                TrainingFragment.this.c0.startAnimation(TrainingFragment.this.m0);
                trainingFragment = TrainingFragment.this;
            } else {
                TrainingFragment.this.g0.setVisibility(0);
                TrainingFragment.this.i0.setVisibility(0);
                TrainingFragment.this.h0.setVisibility(0);
                TrainingFragment.this.g0.startAnimation(TrainingFragment.this.j0);
                TrainingFragment.this.i0.startAnimation(TrainingFragment.this.j0);
                TrainingFragment.this.h0.startAnimation(TrainingFragment.this.j0);
                TrainingFragment.this.c0.startAnimation(TrainingFragment.this.l0);
                trainingFragment = TrainingFragment.this;
                z = true;
            }
            trainingFragment.n0 = z;
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
            TrainingFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.c c2 = com.health.openworkout.gui.training.b.c();
            c2.f(GenericSettingsFragment.SETTING_MODE.ADD);
            c2.g(TrainingFragment.this.N(R.string.label_add));
            t.a(TrainingFragment.this.m(), R.id.nav_host_fragment).r(c2);
        }
    }

    /* loaded from: classes.dex */
    class c implements View.OnClickListener {
        c() {
            TrainingFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.a(TrainingFragment.this.m(), R.id.nav_host_fragment).r(com.health.openworkout.gui.training.b.a());
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
            TrainingFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrainingFragment.this.r0.i();
        }
    }

    /* loaded from: classes.dex */
    class e implements DialogInterface.OnClickListener {
        e() {
            TrainingFragment.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            TrainingFragment.this.r0.g(TrainingFragment.this.p0.getName());
        }
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected com.health.openworkout.gui.datatypes.a B1() {
        return this.q0;
    }

    @Override // androidx.fragment.app.Fragment
    public void C0(int i, String[] strArr, int[] iArr) {
        this.r0.d(i, strArr, iArr);
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected List C1() {
        return this.o0;
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected RecyclerView F1() {
        return this.b0;
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected String G1() {
        return N(R.string.label_training_plans);
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void H1() {
        this.o0 = com.health.openworkout.core.a.h().k();
        com.health.openworkout.gui.training.d dVar = new com.health.openworkout.gui.training.d(t(), this.o0);
        this.q0 = dVar;
        dVar.P(D1());
        this.b0.setAdapter(this.q0);
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void I1(int i) {
        User g2 = com.health.openworkout.core.a.h().g();
        long trainingsPlanId = g2.getTrainingsPlanId();
        TrainingPlan trainingPlan = this.o0.get(i);
        if (trainingsPlanId == trainingPlan.getTrainingPlanId()) {
            g2.setTrainingsPlanId(-1L);
            com.health.openworkout.core.a.h().t(g2);
        }
        Toast.makeText(t(), String.format(N(R.string.label_delete_toast), trainingPlan.getName()), 0).show();
        com.health.openworkout.core.a.h().b(this.o0.get(i));
        this.o0.remove(i);
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void J1(int i) {
        TrainingPlan clone = this.o0.get(i).clone();
        clone.setTrainingPlanId(0L);
        this.o0.add(i, clone);
        Q1();
        clone.setTrainingPlanId(com.health.openworkout.core.a.h().o(clone));
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void K1(int i) {
        b.c c2 = com.health.openworkout.gui.training.b.c();
        c2.h(this.o0.get(i).getTrainingPlanId());
        c2.f(GenericSettingsFragment.SETTING_MODE.EDIT);
        c2.g(N(R.string.label_edit));
        t.a(m(), R.id.nav_host_fragment).r(c2);
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void L1(int i) {
        TrainingPlan trainingPlan = this.o0.get(i);
        this.p0 = trainingPlan;
        this.r0.g(trainingPlan.getName());
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void M1(int i) {
        this.p0 = this.o0.get(i);
        c.a aVar = new c.a(t());
        aVar.e(R.drawable.ic_export);
        aVar.q(N(R.string.label_publish) + " " + this.p0.getName());
        aVar.g(Html.fromHtml(N(R.string.label_publish_message)));
        aVar.l(17039370, new e());
        androidx.appcompat.app.c a2 = aVar.a();
        a2.show();
        ((TextView) a2.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void N1() {
        for (TrainingPlan trainingPlan : this.o0) {
            trainingPlan.setCountFinishedTraining(0);
            for (WorkoutSession workoutSession : trainingPlan.getWorkoutSessions()) {
                workoutSession.setFinished(false);
                for (WorkoutItem workoutItem : workoutSession.getWorkoutItems()) {
                    workoutItem.setFinished(false);
                    com.health.openworkout.core.a.h().u(workoutItem);
                }
                com.health.openworkout.core.a.h().v(workoutSession);
            }
            com.health.openworkout.core.a.h().s(trainingPlan);
        }
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void O1(int i) {
        TrainingPlan trainingPlan = this.o0.get(i);
        b.C0094b b2 = com.health.openworkout.gui.training.b.b();
        b2.e(trainingPlan.getName());
        b2.f(trainingPlan.getTrainingPlanId());
        t.a(m(), R.id.nav_host_fragment).r(b2);
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void Q1() {
        for (int i = 0; i < this.o0.size(); i++) {
            this.o0.get(i).setOrderNr(i);
            com.health.openworkout.core.a.h().s(this.o0.get(i));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void d0(int i, int i2, Intent intent) {
        super.d0(i, i2, intent);
        if (this.r0.c(i, i2, intent)) {
            Uri data = intent.getData();
            com.health.openworkout.core.d.a aVar = new com.health.openworkout.core.d.a(t());
            if (i == 30) {
                aVar.j(this.p0, data);
            } else if (i != 40) {
            } else {
                aVar.o(data);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_training, viewGroup, false);
        this.r0 = new com.health.openworkout.gui.utils.a(this);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.trainingsView);
        this.b0 = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.b0.setLayoutManager(new LinearLayoutManager(t()));
        this.n0 = false;
        this.c0 = (FloatingActionButton) inflate.findViewById(R.id.expandableButton);
        this.d0 = (FloatingActionButton) inflate.findViewById(R.id.addButton);
        this.g0 = (LinearLayout) inflate.findViewById(R.id.addLayout);
        this.e0 = (FloatingActionButton) inflate.findViewById(R.id.cloudlImportButton);
        this.i0 = (LinearLayout) inflate.findViewById(R.id.cloudImportLayout);
        this.f0 = (FloatingActionButton) inflate.findViewById(R.id.locallImportButton);
        this.h0 = (LinearLayout) inflate.findViewById(R.id.localImportLayout);
        this.k0 = AnimationUtils.loadAnimation(t(), R.anim.fab_close);
        this.j0 = AnimationUtils.loadAnimation(t(), R.anim.fab_open);
        this.l0 = AnimationUtils.loadAnimation(t(), R.anim.fab_rotate_clock);
        this.m0 = AnimationUtils.loadAnimation(t(), R.anim.fab_rotate_anticlock);
        this.c0.setOnClickListener(new a());
        this.d0.setOnClickListener(new b());
        this.e0.setOnClickListener(new c());
        this.f0.setOnClickListener(new d());
        H1();
        return inflate;
    }
}
