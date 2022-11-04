package com.health.openworkout.gui.workout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
import com.health.openworkout.gui.datatypes.GenericSettingsFragment;
import com.health.openworkout.gui.datatypes.a;
import com.health.openworkout.gui.workout.a;
import java.util.List;
/* loaded from: classes.dex */
public class WorkoutDatabaseFragment extends Fragment {
    private RecyclerView X;
    private List<WorkoutItem> Y;
    private h Z;

    /* loaded from: classes.dex */
    public class a implements a.b {
        a() {
            WorkoutDatabaseFragment.this = r1;
        }

        @Override // com.health.openworkout.gui.datatypes.a.b
        public void a(int i, View view) {
            long b2 = b.a(WorkoutDatabaseFragment.this.r()).b();
            a.b a2 = com.health.openworkout.gui.workout.a.a();
            a2.g(GenericSettingsFragment.SETTING_MODE.ADD);
            a2.i(WorkoutDatabaseFragment.this.N(R.string.label_add));
            a2.h(b2);
            a2.j(((WorkoutItem) WorkoutDatabaseFragment.this.Y.get(i)).getWorkoutItemId());
            t.a(WorkoutDatabaseFragment.this.m(), R.id.nav_host_fragment).r(a2);
        }
    }

    protected void A1() {
        this.Y = com.health.openworkout.core.a.h().e();
        h hVar = new h(t(), this.Y);
        this.Z = hVar;
        hVar.I(new a());
        this.X.setAdapter(this.Z);
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_workoutdatabase, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.workoutsView);
        this.X = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.X.setLayoutManager(new LinearLayoutManager(t()));
        A1();
        return inflate;
    }
}
