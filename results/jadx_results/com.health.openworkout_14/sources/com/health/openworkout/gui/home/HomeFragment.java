package com.health.openworkout.gui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.navigation.t;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.TrainingPlan;
import com.health.openworkout.core.datatypes.User;
import com.health.openworkout.core.datatypes.WorkoutSession;
import com.health.openworkout.gui.home.a;
/* loaded from: classes.dex */
public class HomeFragment extends Fragment {
    private ImageView X;
    private ImageView Y;
    private Spinner Z;
    private ProgressBar a0;
    private TextView b0;
    private RadioGroup c0;
    private com.health.openworkout.core.a d0;
    private User e0;
    private TrainingPlan f0;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
            HomeFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toast toast;
            HomeFragment homeFragment = HomeFragment.this;
            homeFragment.f0 = homeFragment.d0.j(HomeFragment.this.e0.getTrainingsPlanId());
            if (HomeFragment.this.f0 != null) {
                WorkoutSession nextWorkoutSession = HomeFragment.this.f0.getNextWorkoutSession();
                if (nextWorkoutSession == null) {
                    toast = Toast.makeText(HomeFragment.this.t(), String.format(HomeFragment.this.N(R.string.error_no_sessions), HomeFragment.this.f0.getName()), 0);
                } else if (!nextWorkoutSession.getWorkoutItems().isEmpty()) {
                    a.b b2 = com.health.openworkout.gui.home.a.b();
                    b2.g(nextWorkoutSession.getName());
                    b2.f(nextWorkoutSession.getWorkoutSessionId());
                    t.a(HomeFragment.this.m(), R.id.nav_host_fragment).r(b2);
                    return;
                } else {
                    toast = Toast.makeText(HomeFragment.this.t(), String.format(HomeFragment.this.N(R.string.error_no_workout_items), nextWorkoutSession.getName()), 0);
                }
            } else {
                toast = Toast.makeText(HomeFragment.this.t(), (int) R.string.error_no_trainings, 0);
            }
            toast.show();
        }
    }

    /* loaded from: classes.dex */
    class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ ArrayAdapter f3444b;

        b(ArrayAdapter arrayAdapter) {
            HomeFragment.this = r1;
            this.f3444b = arrayAdapter;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            HomeFragment.this.e0.setTrainingsPlanId(((TrainingPlan) this.f3444b.getItem(i)).getTrainingPlanId());
            HomeFragment.this.d0.t(HomeFragment.this.e0);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
            HomeFragment.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeFragment.this.a0.setProgress(HomeFragment.this.f0.finishedSessionSize());
        }
    }

    /* loaded from: classes.dex */
    class d implements RadioGroup.OnCheckedChangeListener {
        d() {
            HomeFragment.this = r1;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            boolean z;
            User user;
            switch (radioGroup.getCheckedRadioButtonId()) {
                case R.id.radioFemale /* 2131296610 */:
                    user = HomeFragment.this.e0;
                    z = false;
                    break;
                case R.id.radioMale /* 2131296611 */:
                    user = HomeFragment.this.e0;
                    z = true;
                    break;
                default:
                    HomeFragment.this.d0.t(HomeFragment.this.e0);
            }
            user.setMale(z);
            HomeFragment.this.d0.t(HomeFragment.this.e0);
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnClickListener {
        e() {
            HomeFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.a(HomeFragment.this.m(), R.id.nav_host_fragment).r(com.health.openworkout.gui.home.a.a());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        RadioGroup radioGroup;
        View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        this.d0 = com.health.openworkout.core.a.h();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.startView);
        this.X = imageView;
        imageView.setOnClickListener(new a());
        this.Y = (ImageView) inflate.findViewById(R.id.detailTrainingView);
        this.a0 = (ProgressBar) inflate.findViewById(R.id.sessionProgressBar);
        this.b0 = (TextView) inflate.findViewById(R.id.sessionView);
        this.Z = (Spinner) inflate.findViewById(R.id.trainingNameView);
        User g2 = this.d0.g();
        this.e0 = g2;
        TrainingPlan j = this.d0.j(g2.getTrainingsPlanId());
        this.f0 = j;
        if (j == null) {
            if (this.d0.k().isEmpty()) {
                return inflate;
            }
            TrainingPlan trainingPlan = this.d0.k().get(0);
            this.f0 = trainingPlan;
            this.e0.setTrainingsPlanId(trainingPlan.getTrainingPlanId());
            this.d0.t(this.e0);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(m(), (int) R.layout.t, this.d0.k());
        arrayAdapter.setDropDownViewResource(R.layout.t);
        this.Z.setAdapter((SpinnerAdapter) arrayAdapter);
        this.Z.setSelection(0, false);
        this.Z.setOnItemSelectedListener(new b(arrayAdapter));
        for (int i2 = 0; i2 < arrayAdapter.getCount(); i2++) {
            if (this.f0.getTrainingPlanId() == ((TrainingPlan) arrayAdapter.getItem(i2)).getTrainingPlanId()) {
                this.Z.setSelection(i2);
            }
        }
        TextView textView = this.b0;
        textView.setText("(" + Integer.toString(this.f0.finishedSessionSize()) + "/" + this.f0.getWorkoutSessionSize() + ")");
        this.a0.setMax(this.f0.getWorkoutSessionSize());
        this.a0.post(new c());
        this.c0 = (RadioGroup) inflate.findViewById(R.id.avatarGroup);
        if (this.e0.isMale()) {
            radioGroup = this.c0;
            i = R.id.radioMale;
        } else {
            radioGroup = this.c0;
            i = R.id.radioFemale;
        }
        radioGroup.check(i);
        this.c0.setOnCheckedChangeListener(new d());
        this.Y.setOnClickListener(new e());
        return inflate;
    }
}
