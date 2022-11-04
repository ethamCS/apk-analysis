package com.health.openworkout.gui.session;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.navigation.t;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.TrainingPlan;
import com.health.openworkout.core.datatypes.WorkoutItem;
import com.health.openworkout.core.datatypes.WorkoutSession;
import com.health.openworkout.gui.datatypes.GenericFragment;
import com.health.openworkout.gui.datatypes.GenericSettingsFragment;
import com.health.openworkout.gui.session.b;
import java.util.List;
/* loaded from: classes.dex */
public class SessionFragment extends GenericFragment {
    private RecyclerView b0;
    private TrainingPlan c0;
    private List<WorkoutSession> d0;
    private FloatingActionButton e0;
    private FloatingActionButton f0;
    private LinearLayout g0;
    private Animation h0;
    private Animation i0;
    private Animation j0;
    private Animation k0;
    private boolean l0;
    private d m0;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
            SessionFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SessionFragment sessionFragment;
            boolean z = false;
            if (SessionFragment.this.l0) {
                SessionFragment.this.g0.setVisibility(8);
                SessionFragment.this.g0.startAnimation(SessionFragment.this.i0);
                SessionFragment.this.e0.startAnimation(SessionFragment.this.k0);
                sessionFragment = SessionFragment.this;
            } else {
                SessionFragment.this.g0.setVisibility(0);
                SessionFragment.this.g0.startAnimation(SessionFragment.this.h0);
                SessionFragment.this.e0.startAnimation(SessionFragment.this.j0);
                sessionFragment = SessionFragment.this;
                z = true;
            }
            sessionFragment.l0 = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {

        /* loaded from: classes.dex */
        class a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ EditText f3460b;

            a(EditText editText) {
                b.this = r1;
                this.f3460b = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (!this.f3460b.getText().toString().isEmpty()) {
                    int size = SessionFragment.this.c0.getWorkoutSessions().size() + 1;
                    int intValue = Integer.valueOf(this.f3460b.getText().toString()).intValue();
                    for (int i2 = size; i2 < size + intValue; i2++) {
                        WorkoutSession workoutSession = new WorkoutSession();
                        workoutSession.setName(String.format(SessionFragment.this.N(R.string.day_unit), Integer.valueOf(i2)));
                        workoutSession.setTrainingPlanId(SessionFragment.this.c0.getTrainingPlanId());
                        workoutSession.setOrderNr(i2);
                        SessionFragment.this.c0.addWorkoutSession(workoutSession);
                        com.health.openworkout.core.a.h().q(workoutSession);
                        SessionFragment.this.B1().n(i2);
                        SessionFragment.this.b0.m1(size);
                    }
                    SessionFragment.this.H1();
                }
            }
        }

        /* renamed from: com.health.openworkout.gui.session.SessionFragment$b$b */
        /* loaded from: classes.dex */
        class DialogInterface$OnClickListenerC0089b implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC0089b(b bVar) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        b() {
            SessionFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(SessionFragment.this.t());
            builder.setTitle(SessionFragment.this.N(R.string.label_input_create_days));
            EditText editText = new EditText(SessionFragment.this.t());
            editText.setText("3", TextView.BufferType.EDITABLE);
            editText.setInputType(2);
            editText.setRawInputType(3);
            builder.setView(editText);
            builder.setPositiveButton(SessionFragment.this.N(R.string.label_ok), new a(editText));
            builder.setNegativeButton(SessionFragment.this.N(R.string.label_cancel), new DialogInterface$OnClickListenerC0089b(this));
            builder.show();
        }
    }

    private int b2() {
        View inflate = View.inflate(t(), R.layout.item_session, null);
        inflate.measure(0, 0);
        int measuredWidth = inflate.getMeasuredWidth();
        int paddingLeft = ((H().getDisplayMetrics().widthPixels - this.b0.getPaddingLeft()) - this.b0.getPaddingRight()) / measuredWidth;
        return ((H().getDisplayMetrics().widthPixels - this.b0.getPaddingLeft()) - this.b0.getPaddingRight()) - (measuredWidth * paddingLeft) > measuredWidth + (-15) ? paddingLeft + 1 : paddingLeft;
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected com.health.openworkout.gui.datatypes.a B1() {
        return this.m0;
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
        TrainingPlan j = com.health.openworkout.core.a.h().j(com.health.openworkout.gui.session.a.a(r()).c());
        this.c0 = j;
        this.d0 = j.getWorkoutSessions();
        d dVar = new d(t(), this.d0);
        this.m0 = dVar;
        dVar.P(D1());
        this.b0.setAdapter(this.m0);
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void I1(int i) {
        com.health.openworkout.core.a.h().d(this.d0.get(i));
        Toast.makeText(t(), String.format(N(R.string.label_delete_toast), this.d0.get(i).getName()), 0).show();
        C1().remove(i);
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void J1(int i) {
        WorkoutSession clone = this.d0.get(i).clone();
        clone.setWorkoutSessionId(0L);
        this.d0.add(i, clone);
        Q1();
        clone.setWorkoutSessionId(com.health.openworkout.core.a.h().q(clone));
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void K1(int i) {
        b.c b2 = com.health.openworkout.gui.session.b.b();
        b2.i(this.d0.get(i).getWorkoutSessionId());
        b2.g(GenericSettingsFragment.SETTING_MODE.EDIT);
        b2.h(N(R.string.label_edit));
        t.a(m(), R.id.nav_host_fragment).r(b2);
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void N1() {
        for (WorkoutSession workoutSession : this.d0) {
            workoutSession.setFinished(false);
            for (WorkoutItem workoutItem : workoutSession.getWorkoutItems()) {
                workoutItem.setFinished(false);
                com.health.openworkout.core.a.h().u(workoutItem);
            }
            com.health.openworkout.core.a.h().v(workoutSession);
        }
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void O1(int i) {
        WorkoutSession workoutSession = this.d0.get(i);
        b.C0090b a2 = com.health.openworkout.gui.session.b.a();
        a2.f(workoutSession.getName());
        a2.e(workoutSession.getWorkoutSessionId());
        t.a(m(), R.id.nav_host_fragment).r(a2);
    }

    @Override // com.health.openworkout.gui.datatypes.GenericFragment
    protected void Q1() {
        for (int i = 0; i < this.d0.size(); i++) {
            this.d0.get(i).setOrderNr(i);
            com.health.openworkout.core.a.h().v(this.d0.get(i));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_session, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.sessionsView);
        this.b0 = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.b0.setLayoutManager(new GridLayoutManager(t(), b2()));
        this.l0 = false;
        this.e0 = (FloatingActionButton) inflate.findViewById(R.id.expandableButton);
        this.f0 = (FloatingActionButton) inflate.findViewById(R.id.addButton);
        this.g0 = (LinearLayout) inflate.findViewById(R.id.addLayout);
        this.i0 = AnimationUtils.loadAnimation(t(), R.anim.fab_close);
        this.h0 = AnimationUtils.loadAnimation(t(), R.anim.fab_open);
        this.j0 = AnimationUtils.loadAnimation(t(), R.anim.fab_rotate_clock);
        this.k0 = AnimationUtils.loadAnimation(t(), R.anim.fab_rotate_anticlock);
        this.e0.setOnClickListener(new a());
        this.f0.setOnClickListener(new b());
        H1();
        return inflate;
    }
}
