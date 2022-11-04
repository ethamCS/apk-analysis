package com.health.openworkout.gui.workout;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.t;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
import com.health.openworkout.core.datatypes.WorkoutSession;
import com.health.openworkout.gui.utils.b;
import com.health.openworkout.gui.workout.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Iterator;
/* loaded from: classes.dex */
public class WorkoutSlideFragment extends Fragment {
    private ConstraintLayout X;
    private TextView Y;
    private CardView Z;
    private VideoView a0;
    private ImageView b0;
    private ImageView c0;
    private TextView d0;
    private TextView e0;
    private TextView f0;
    private ImageView g0;
    private ScrollView h0;
    private TableLayout i0;
    private TextView j0;
    private ProgressBar k0;
    private FloatingActionButton l0;
    private CountDownTimer m0;
    private boolean n0;
    private Calendar o0;
    private int p0;
    private int q0;
    private com.health.openworkout.gui.utils.b r0;
    private boolean s0;
    private boolean t0;
    private WorkoutSession u0;
    private long v0;
    private WorkoutItem w0;
    private j x0;
    private long y0;

    /* loaded from: classes.dex */
    class a implements MediaPlayer.OnPreparedListener {
        a(WorkoutSlideFragment workoutSlideFragment) {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.setVideoScalingMode(2);
            mediaPlayer.setLooping(true);
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
            WorkoutSlideFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TextView textView;
            int i = 8;
            if (WorkoutSlideFragment.this.d0.getVisibility() == 8) {
                textView = WorkoutSlideFragment.this.d0;
                i = 0;
            } else {
                textView = WorkoutSlideFragment.this.d0;
            }
            textView.setVisibility(i);
        }
    }

    /* loaded from: classes.dex */
    class c implements View.OnClickListener {
        c() {
            WorkoutSlideFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WorkoutSlideFragment.this.U1();
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
            WorkoutSlideFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if ((WorkoutSlideFragment.this.w0.isTimeMode() || WorkoutSlideFragment.this.x0 != j.START) && WorkoutSlideFragment.this.m0 != null) {
                if (WorkoutSlideFragment.this.n0) {
                    WorkoutSlideFragment.this.a2();
                } else {
                    WorkoutSlideFragment.this.X1();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ i f3518b;

        e(i iVar) {
            WorkoutSlideFragment.this = r1;
            this.f3518b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            WorkoutSlideFragment.this.h0.smoothScrollTo(0, this.f3518b.getTop() - 50);
        }
    }

    /* loaded from: classes.dex */
    public class f extends CountDownTimer {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j, long j2) {
            super(j, j2);
            WorkoutSlideFragment.this = r1;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            b.c cVar;
            com.health.openworkout.gui.utils.b bVar;
            int i = h.f3522a[WorkoutSlideFragment.this.x0.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    bVar = WorkoutSlideFragment.this.r0;
                    cVar = b.c.WORKOUT_STOP;
                }
                WorkoutSlideFragment.this.U1();
            }
            bVar = WorkoutSlideFragment.this.r0;
            cVar = b.c.WORKOUT_START;
            bVar.e(cVar);
            WorkoutSlideFragment.this.U1();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            String str;
            com.health.openworkout.gui.utils.b bVar;
            WorkoutSlideFragment.this.p0 = (int) (j / 1000);
            TextView textView = WorkoutSlideFragment.this.j0;
            textView.setText(WorkoutSlideFragment.this.p0 + WorkoutSlideFragment.this.N(R.string.seconds_unit));
            WorkoutSlideFragment.this.k0.setProgress(WorkoutSlideFragment.this.p0);
            int i = h.f3522a[WorkoutSlideFragment.this.x0.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                if (WorkoutSlideFragment.this.p0 == WorkoutSlideFragment.this.q0) {
                    WorkoutSlideFragment.this.r0.f(WorkoutSlideFragment.this.t().getString(R.string.speak_halftime));
                    return;
                } else if (!WorkoutSlideFragment.this.s0) {
                    if (WorkoutSlideFragment.this.p0 != 3 && WorkoutSlideFragment.this.p0 != 2 && WorkoutSlideFragment.this.p0 != 1) {
                        return;
                    }
                    WorkoutSlideFragment.this.r0.e(b.c.WORKOUT_COUNT_BEFORE_START);
                    return;
                } else {
                    int i2 = WorkoutSlideFragment.this.p0;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        return;
                                    }
                                    bVar = WorkoutSlideFragment.this.r0;
                                    str = WorkoutSlideFragment.this.t().getString(R.string.speak_five);
                                }
                                bVar = WorkoutSlideFragment.this.r0;
                                str = WorkoutSlideFragment.this.t().getString(R.string.speak_four);
                            }
                            bVar = WorkoutSlideFragment.this.r0;
                            str = WorkoutSlideFragment.this.t().getString(R.string.speak_three);
                        }
                        bVar = WorkoutSlideFragment.this.r0;
                        str = WorkoutSlideFragment.this.t().getString(R.string.speak_two);
                    }
                    bVar = WorkoutSlideFragment.this.r0;
                    str = WorkoutSlideFragment.this.t().getString(R.string.speak_one);
                }
            } else if (!WorkoutSlideFragment.this.s0) {
                if (WorkoutSlideFragment.this.p0 != 3 && WorkoutSlideFragment.this.p0 != 2 && WorkoutSlideFragment.this.p0 != 1) {
                    return;
                }
                WorkoutSlideFragment.this.r0.e(b.c.WORKOUT_COUNT_BEFORE_START);
                return;
            } else {
                int i3 = WorkoutSlideFragment.this.p0;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 != 5) {
                                    return;
                                }
                                bVar = WorkoutSlideFragment.this.r0;
                                str = WorkoutSlideFragment.this.t().getString(R.string.speak_five);
                            }
                            bVar = WorkoutSlideFragment.this.r0;
                            str = WorkoutSlideFragment.this.t().getString(R.string.speak_four);
                        }
                        bVar = WorkoutSlideFragment.this.r0;
                        str = WorkoutSlideFragment.this.t().getString(R.string.speak_three);
                    }
                    bVar = WorkoutSlideFragment.this.r0;
                    str = WorkoutSlideFragment.this.t().getString(R.string.speak_two);
                }
                bVar = WorkoutSlideFragment.this.r0;
                str = WorkoutSlideFragment.this.t().getString(R.string.speak_one);
            }
            bVar.g(str);
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
            WorkoutSlideFragment.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            WorkoutSlideFragment.this.m0.start();
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class h {

        /* renamed from: a */
        static final /* synthetic */ int[] f3522a;

        static {
            int[] iArr = new int[j.values().length];
            f3522a = iArr;
            try {
                iArr[j.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3522a[j.PREPARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3522a[j.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3522a[j.BREAK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3522a[j.FINISH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class i extends TableRow {

        /* renamed from: b */
        private ImageView f3523b;

        /* renamed from: c */
        private TextView f3524c;

        /* renamed from: d */
        private TextView f3525d;

        public i(WorkoutSlideFragment workoutSlideFragment, Context context, WorkoutItem workoutItem) {
            super(context);
            String str;
            TextView textView;
            this.f3523b = new ImageView(context);
            this.f3524c = new TextView(context);
            TextView textView2 = new TextView(context);
            this.f3525d = textView2;
            textView2.setText(workoutItem.getName());
            if (workoutItem.isTimeMode()) {
                textView = this.f3524c;
                str = workoutItem.getWorkoutTime() + context.getString(R.string.seconds_unit);
            } else {
                textView = this.f3524c;
                str = Integer.toString(workoutItem.getRepetitionCount()) + "x";
            }
            textView.setText(str);
            this.f3523b.setPadding(0, 0, 20, 0);
            this.f3524c.setPadding(0, 0, 20, 0);
            if (workoutItem.isFinished()) {
                this.f3523b.setImageResource(R.drawable.ic_workout_done);
            }
            addView(this.f3523b);
            addView(this.f3524c);
            addView(this.f3525d);
            setPadding(10, 10, 10, 10);
        }

        public void a() {
            this.f3525d.setTypeface(null, 1);
            this.f3523b.setImageResource(R.drawable.ic_workout_select);
        }
    }

    /* loaded from: classes.dex */
    public enum j {
        INIT,
        PREPARE,
        START,
        BREAK,
        FINISH
    }

    private void P1(int i2) {
        CountDownTimer countDownTimer = this.m0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.m0 = new f(this.p0 * 1000, 1000L);
        m().runOnUiThread(new g());
    }

    private void Q1() {
        this.x0 = j.BREAK;
        this.e0.setText("");
        this.e0.setTextColor(t().getResources().getColor(R.color.colorGreen));
        this.e0.setTextColor(t().getResources().getColor(R.color.colorGreen));
        this.f0.setText(R.string.label_break);
        this.f0.setTextColor(t().getResources().getColor(R.color.colorGreen));
        this.j0.setTextColor(t().getResources().getColor(R.color.colorGreen));
        this.k0.setProgressTintList(ColorStateList.valueOf(t().getResources().getColor(R.color.colorGreen)));
        this.l0.setBackgroundTintList(ColorStateList.valueOf(t().getResources().getColor(R.color.colorGreen)));
        this.g0.setColorFilter(t().getResources().getColor(R.color.colorGreen));
        if (this.t0) {
            this.r0.f(t().getString(R.string.label_break));
        }
        Y1(this.w0.getBreakTime());
        P1(this.w0.getBreakTime());
    }

    private void R1() {
        this.d0.setVisibility(8);
        this.i0.setVisibility(8);
    }

    private void S1() {
        this.n0 = false;
        long b2 = com.health.openworkout.gui.workout.e.a(r()).b();
        this.y0 = com.health.openworkout.gui.workout.e.a(r()).d();
        this.u0 = com.health.openworkout.core.a.h().m(b2);
        this.x0 = j.INIT;
        U1();
    }

    private void T1() {
        Throwable e2;
        VideoView videoView;
        String str;
        if (this.y0 != -1) {
            Iterator<WorkoutItem> it = this.u0.getWorkoutItems().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WorkoutItem next = it.next();
                if (next.getWorkoutItemId() == this.y0) {
                    this.w0 = next;
                    this.y0 = -1L;
                    break;
                }
            }
        } else {
            WorkoutItem workoutItem = this.w0;
            this.v0 = workoutItem == null ? 0L : workoutItem.getOrderNr();
            if (this.u0.getNextWorkoutItem(this.v0) == null) {
                V1();
                return;
            }
            this.w0 = this.u0.getNextWorkoutItem(this.v0);
        }
        this.o0 = Calendar.getInstance();
        this.Y.setText(this.w0.getName() + " (" + (this.u0.getWorkoutItems().indexOf(this.w0) + 1) + "/" + this.u0.getWorkoutItems().size() + ")");
        if (this.t0 && this.x0 != j.INIT) {
            this.r0.f(t().getString(R.string.speak_next_workout) + " " + this.w0.getName());
        }
        if (this.w0.isVideoMode()) {
            this.a0.setVisibility(0);
            this.b0.setVisibility(8);
            try {
                if (this.w0.isVideoPathExternal()) {
                    this.a0.setVideoURI(Uri.parse(this.w0.getVideoPath()));
                } else {
                    if (com.health.openworkout.core.a.h().g().isMale()) {
                        videoView = this.a0;
                        str = "content://com.health.openworkout.videoprovider/video/male/" + this.w0.getVideoPath();
                    } else {
                        videoView = this.a0;
                        str = "content://com.health.openworkout.videoprovider/video/female/" + this.w0.getVideoPath();
                    }
                    videoView.setVideoPath(str);
                }
            } catch (SecurityException e3) {
                this.a0.setVideoURI(null);
                Toast.makeText(t(), t().getString(R.string.error_no_access_to_file) + " " + this.w0.getVideoPath(), 0).show();
                h.a.a.c(e3);
            }
            this.Z.animate().alpha(1.0f);
            this.a0.seekTo(100);
        } else {
            this.a0.setVisibility(8);
            this.b0.setVisibility(0);
            try {
                if (this.w0.isImagePathExternal()) {
                    this.b0.setImageURI(Uri.parse(this.w0.getImagePath()));
                } else {
                    String str2 = com.health.openworkout.core.a.h().g().isMale() ? "male" : "female";
                    InputStream open = t().getAssets().open("image/" + str2 + "/" + this.w0.getImagePath());
                    this.b0.setImageDrawable(Drawable.createFromStream(open, null));
                    open.close();
                }
            } catch (IOException e4) {
                e2 = e4;
                h.a.a.c(e2);
                this.d0.setText(this.w0.getDescription());
            } catch (SecurityException e5) {
                e2 = e5;
                this.b0.setImageResource(R.drawable.ic_no_file);
                Toast.makeText(t(), t().getString(R.string.error_no_access_to_file) + " " + this.w0.getImagePath(), 0).show();
                h.a.a.c(e2);
                this.d0.setText(this.w0.getDescription());
            }
        }
        this.d0.setText(this.w0.getDescription());
    }

    public void U1() {
        this.n0 = false;
        this.g0.setImageResource(R.drawable.ic_play);
        this.r0.c();
        int i2 = h.f3522a[this.x0.ordinal()];
        if (i2 == 1) {
            T1();
        } else if (i2 == 2) {
            c2();
            return;
        } else if (i2 == 3) {
            W1();
            Q1();
            T1();
            b2();
            return;
        } else if (i2 != 4) {
            return;
        }
        Z1();
    }

    private void V1() {
        this.u0.setFinished(true);
        com.health.openworkout.core.a.h().v(this.u0);
        f.b a2 = com.health.openworkout.gui.workout.f.a();
        a2.d(this.u0.getWorkoutSessionId());
        t.a(m(), R.id.nav_host_fragment).r(a2);
    }

    private void W1() {
        this.w0.setElapsedTime((Calendar.getInstance().getTimeInMillis() - this.o0.getTimeInMillis()) / 1000);
        this.w0.setFinished(true);
        com.health.openworkout.core.a.h().u(this.w0);
    }

    public void X1() {
        CountDownTimer countDownTimer = this.m0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.n0 = true;
        this.g0.setImageResource(R.drawable.ic_pause);
    }

    private void Y1(int i2) {
        this.p0 = i2;
        this.k0.setMax(i2);
        this.k0.setProgress(this.p0);
        this.k0.setVisibility(0);
        TextView textView = this.j0;
        textView.setText(this.p0 + N(R.string.seconds_unit));
        this.q0 = this.p0 / 2;
    }

    private void Z1() {
        StringBuilder sb;
        String str;
        TextView textView;
        this.x0 = j.PREPARE;
        R1();
        this.e0.setText(R.string.label_prepare);
        this.e0.setTextColor(t().getResources().getColor(R.color.colorRed));
        if (this.w0.isTimeMode()) {
            textView = this.f0;
            sb = new StringBuilder();
            sb.append(this.w0.getName());
            sb.append(" (");
            sb.append(this.w0.getWorkoutTime());
            sb.append(t().getString(R.string.seconds_unit));
            str = ")";
        } else {
            textView = this.f0;
            sb = new StringBuilder();
            sb.append(this.w0.getName());
            sb.append(" (");
            sb.append(Integer.toString(this.w0.getRepetitionCount()));
            str = "x)";
        }
        sb.append(str);
        textView.setText(sb.toString());
        this.f0.setTextColor(t().getResources().getColor(R.color.colorRed));
        this.j0.setTextColor(t().getResources().getColor(R.color.colorRed));
        this.k0.setProgressTintList(ColorStateList.valueOf(t().getResources().getColor(R.color.colorRed)));
        this.l0.setBackgroundTintList(ColorStateList.valueOf(t().getResources().getColor(R.color.colorRed)));
        this.g0.setColorFilter(t().getResources().getColor(R.color.colorRed));
        if (this.t0) {
            com.health.openworkout.gui.utils.b bVar = this.r0;
            bVar.f(t().getString(R.string.label_prepare) + " " + this.w0.getName());
        }
        Y1(this.w0.getPrepTime());
        P1(this.w0.getPrepTime());
    }

    public void a2() {
        this.n0 = false;
        P1(this.p0);
        this.g0.setImageResource(R.drawable.ic_play);
    }

    private void b2() {
        this.d0.setVisibility(8);
        this.i0.setVisibility(0);
        this.i0.removeAllViews();
        for (WorkoutItem workoutItem : this.u0.getWorkoutItems()) {
            i iVar = new i(this, t(), workoutItem);
            this.i0.addView(iVar);
            if (workoutItem.getWorkoutItemId() == this.w0.getWorkoutItemId()) {
                iVar.a();
                new Handler().post(new e(iVar));
            }
        }
    }

    private void c2() {
        this.x0 = j.START;
        this.e0.setText(R.string.label_workout);
        this.e0.setTextColor(t().getResources().getColor(R.color.colorLightBlue));
        this.f0.setTextColor(t().getResources().getColor(R.color.colorLightBlue));
        this.j0.setTextColor(t().getResources().getColor(R.color.colorLightBlue));
        this.k0.setProgressTintList(ColorStateList.valueOf(t().getResources().getColor(R.color.colorLightBlue)));
        this.l0.setBackgroundTintList(ColorStateList.valueOf(t().getResources().getColor(R.color.colorLightBlue)));
        this.g0.setColorFilter(t().getResources().getColor(R.color.colorLightBlue));
        this.a0.start();
        if (this.t0) {
            com.health.openworkout.gui.utils.b bVar = this.r0;
            bVar.f(t().getString(R.string.label_workout) + " " + this.w0.getName());
        }
        if (this.w0.isTimeMode()) {
            Y1(this.w0.getWorkoutTime());
            P1(this.w0.getWorkoutTime());
            return;
        }
        X1();
        this.j0.setText("");
        this.k0.setVisibility(4);
    }

    @Override // androidx.fragment.app.Fragment
    public void D0() {
        super.D0();
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        View inflate = layoutInflater.inflate(R.layout.fragment_workoutslide, viewGroup, false);
        this.X = (ConstraintLayout) inflate.findViewById(R.id.constraintLayout);
        this.Y = (TextView) inflate.findViewById(R.id.nameView);
        this.Z = (CardView) inflate.findViewById(R.id.videoCardView);
        this.a0 = (VideoView) inflate.findViewById(R.id.videoView);
        this.b0 = (ImageView) inflate.findViewById(R.id.videoImageView);
        this.c0 = (ImageView) inflate.findViewById(R.id.infoView);
        this.d0 = (TextView) inflate.findViewById(R.id.descriptionView);
        this.e0 = (TextView) inflate.findViewById(R.id.stateInfoView);
        this.f0 = (TextView) inflate.findViewById(R.id.stateInfoDetailView);
        this.g0 = (ImageView) inflate.findViewById(R.id.playPauseView);
        this.h0 = (ScrollView) inflate.findViewById(R.id.w_res_0x7f09017d);
        this.i0 = (TableLayout) inflate.findViewById(R.id.workoutOverviewView);
        this.j0 = (TextView) inflate.findViewById(R.id.countdownView);
        this.k0 = (ProgressBar) inflate.findViewById(R.id.progressView);
        this.l0 = (FloatingActionButton) inflate.findViewById(R.id.nextWorkoutStepView);
        SharedPreferences b2 = androidx.preference.j.b(t());
        this.s0 = b2.getBoolean("speechCountdown", false);
        this.t0 = b2.getBoolean("speechWorkoutState", false);
        if (!com.health.openworkout.core.d.b.c().e()) {
            h.a.a.a("Show Ad", new Object[0]);
            View b3 = com.health.openworkout.core.d.b.c().b(this.X.getContext());
            b3.setId(View.generateViewId());
            androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
            this.X.addView(b3, 0);
            eVar.f(this.X);
            eVar.h(b3.getId(), 4, this.X.getId(), 4, 10);
            eVar.h(b3.getId(), 1, this.X.getId(), 1, 0);
            eVar.h(b3.getId(), 2, this.X.getId(), 2, 0);
            eVar.h(this.k0.getId(), 4, b3.getId(), 3, 10);
            eVar.c(this.X);
        } else {
            h.a.a.a("Remove Ad", new Object[0]);
        }
        if (H().getConfiguration().orientation == 1) {
            layoutParams = this.Z.getLayoutParams();
            layoutParams.width = 0;
            layoutParams.height = -2;
        } else {
            layoutParams = this.Z.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = 0;
        }
        this.Z.setLayoutParams(layoutParams);
        this.a0.setOnPreparedListener(new a(this));
        this.c0.setOnClickListener(new b());
        this.l0.setOnClickListener(new c());
        this.g0.setOnClickListener(new d());
        this.r0 = com.health.openworkout.core.a.h().i();
        S1();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void y0() {
        super.y0();
        CountDownTimer countDownTimer = this.m0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
