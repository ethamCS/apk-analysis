package com.health.openworkout.gui.datatypes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.navigation.t;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutSession;
import com.health.openworkout.gui.utils.b;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
/* loaded from: classes.dex */
public class TrophyFragment extends Fragment {
    private TextView X;
    private Button Y;
    private com.health.openworkout.gui.utils.b Z;
    private WorkoutSession a0;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
            TrophyFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.a(TrophyFragment.this.m(), R.id.nav_host_fragment).s();
            t.a(TrophyFragment.this.m(), R.id.nav_host_fragment).s();
            t.a(TrophyFragment.this.m(), R.id.nav_host_fragment).s();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_trophy, viewGroup, false);
        this.X = (TextView) inflate.findViewById(R.id.elapsedTimeView);
        this.Y = (Button) inflate.findViewById(R.id.okView);
        this.a0 = com.health.openworkout.core.a.h().m(b.a(r()).b());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.a0.getElapsedSessionTime() * 1000);
        DateFormat timeInstance = SimpleDateFormat.getTimeInstance();
        timeInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.X.setText(timeInstance.format(calendar.getTime()));
        com.health.openworkout.gui.utils.b i = com.health.openworkout.core.a.h().i();
        this.Z = i;
        i.e(b.c.SESSION_COMPLETED);
        this.Y.setOnClickListener(new a());
        return inflate;
    }
}
