package com.health.openworkout.gui.session;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutSession;
import com.health.openworkout.gui.datatypes.a;
import java.util.List;
/* loaded from: classes.dex */
public class d extends com.health.openworkout.gui.datatypes.a<a> {
    private List<WorkoutSession> k;

    /* loaded from: classes.dex */
    public static class a extends a.c {
        ImageView x;
        TextView y;

        public a(View view) {
            super(view);
            this.x = (ImageView) view.findViewById(R.id.imgView);
            this.y = (TextView) view.findViewById(R.id.nameView);
        }
    }

    public d(Context context, List<WorkoutSession> list) {
        super(context);
        this.k = list;
    }

    /* renamed from: Y */
    public void u(a aVar, int i) {
        super.O(aVar, i);
        WorkoutSession workoutSession = this.k.get(i);
        aVar.y.setText(workoutSession.getName());
        aVar.x.setImageResource(workoutSession.isFinished() ? R.drawable.ic_session_done : R.drawable.ic_session_undone);
    }

    /* renamed from: Z */
    public a w(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_session, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int f() {
        return this.k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long g(int i) {
        return this.k.get(i).getWorkoutSessionId();
    }
}
