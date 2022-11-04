package com.health.openworkout.gui.workout;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.cardview.widget.CardView;
import androidx.navigation.t;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
import com.health.openworkout.gui.datatypes.GenericSettingsFragment;
/* loaded from: classes.dex */
public class WorkoutSettingsFragment extends GenericSettingsFragment {
    private WorkoutItem Y;
    private ImageView Z;
    private TextView a0;
    private TextView b0;
    private TextView c0;
    private TextView d0;
    private TextView e0;
    private TextView f0;
    private Switch g0;
    private TableRow h0;
    private TableRow i0;
    private Switch j0;
    private TableRow k0;
    private CardView l0;
    private VideoView m0;
    private com.health.openworkout.gui.utils.a n0;
    private boolean o0;

    /* loaded from: classes.dex */
    class a implements MediaPlayer.OnPreparedListener {
        a(WorkoutSettingsFragment workoutSettingsFragment) {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.setLooping(true);
        }
    }

    /* loaded from: classes.dex */
    class b implements CompoundButton.OnCheckedChangeListener {
        b() {
            WorkoutSettingsFragment.this = r1;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            WorkoutSettingsFragment.this.Y.setTimeMode(z);
            WorkoutSettingsFragment.this.I1();
        }
    }

    /* loaded from: classes.dex */
    class c implements CompoundButton.OnCheckedChangeListener {
        c() {
            WorkoutSettingsFragment.this = r1;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            WorkoutSettingsFragment.this.Y.setVideoMode(z);
            WorkoutSettingsFragment.this.J1();
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
            WorkoutSettingsFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WorkoutSettingsFragment.this.o0 = true;
            WorkoutSettingsFragment.this.n0.h();
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnClickListener {
        e() {
            WorkoutSettingsFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WorkoutSettingsFragment.this.o0 = false;
            WorkoutSettingsFragment.this.n0.j();
        }
    }

    /* loaded from: classes.dex */
    class f implements View.OnClickListener {
        f() {
            WorkoutSettingsFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WorkoutSettingsFragment.this.o0 = false;
            WorkoutSettingsFragment.this.n0.j();
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class g {

        /* renamed from: a */
        static final /* synthetic */ int[] f3514a;

        static {
            int[] iArr = new int[GenericSettingsFragment.SETTING_MODE.values().length];
            f3514a = iArr;
            try {
                iArr[GenericSettingsFragment.SETTING_MODE.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3514a[GenericSettingsFragment.SETTING_MODE.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void I1() {
        if (this.Y.isTimeMode()) {
            this.h0.setVisibility(0);
            this.i0.setVisibility(8);
            return;
        }
        this.h0.setVisibility(8);
        this.i0.setVisibility(0);
    }

    public void J1() {
        int i;
        TableRow tableRow;
        if (this.Y.isVideoMode()) {
            tableRow = this.k0;
            i = 0;
        } else {
            tableRow = this.k0;
            i = 8;
        }
        tableRow.setVisibility(i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:2|(2:4|(2:6|7))(2:8|(1:10)(2:11|7))|12|(3:38|13|(1:15)(3:16|(1:18)(1:19)|20))|37|25|(1:27)(3:28|(1:30)(1:32)|31)|35|36|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0148, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0149, code lost:
        r7.m0.setVideoURI(null);
        android.widget.Toast.makeText(t(), t().getString(com.health.openworkout.R.string.error_no_access_to_file) + " " + r7.Y.getVideoPath(), 0).show();
        h.a.a.c(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f2 A[Catch: SecurityException -> 0x0148, TryCatch #2 {SecurityException -> 0x0148, blocks: (B:25:0x00ea, B:27:0x00f2, B:28:0x0103, B:30:0x0111, B:31:0x012a, B:32:0x012e), top: B:37:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103 A[Catch: SecurityException -> 0x0148, TryCatch #2 {SecurityException -> 0x0148, blocks: (B:25:0x00ea, B:27:0x00f2, B:28:0x0103, B:30:0x0111, B:31:0x012a, B:32:0x012e), top: B:37:0x00ea }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00e7 -> B:37:0x00ea). Please submit an issue!!! */
    @Override // com.health.openworkout.gui.datatypes.GenericSettingsFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void A1(com.health.openworkout.gui.datatypes.GenericSettingsFragment.SETTING_MODE r8) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.health.openworkout.gui.workout.WorkoutSettingsFragment.A1(com.health.openworkout.gui.datatypes.GenericSettingsFragment$SETTING_MODE):void");
    }

    @Override // com.health.openworkout.gui.datatypes.GenericSettingsFragment
    protected boolean B1(GenericSettingsFragment.SETTING_MODE setting_mode) {
        boolean z;
        this.Y.setName(this.a0.getText().toString());
        this.Y.setDescription(this.b0.getText().toString());
        boolean z2 = false;
        if (this.c0.getText().toString().isEmpty()) {
            this.c0.setError(N(R.string.error_empty_text));
            z = false;
        } else {
            this.Y.setPrepTime(Integer.valueOf(this.c0.getText().toString()).intValue());
            z = true;
        }
        if (this.d0.getText().toString().isEmpty()) {
            this.d0.setError(N(R.string.error_empty_text));
            z = false;
        } else {
            this.Y.setWorkoutTime(Integer.valueOf(this.d0.getText().toString()).intValue());
        }
        if (this.e0.getText().toString().isEmpty()) {
            this.e0.setError(N(R.string.error_empty_text));
            z = false;
        } else {
            this.Y.setBreakTime(Integer.valueOf(this.e0.getText().toString()).intValue());
        }
        if (this.f0.getText().toString().isEmpty()) {
            this.f0.setError(N(R.string.error_empty_text));
        } else {
            this.Y.setRepetitionCount(Integer.valueOf(this.f0.getText().toString()).intValue());
            z2 = z;
        }
        this.Y.setTimeMode(this.g0.isChecked());
        this.Y.setVideoMode(this.j0.isChecked());
        int i = g.f3514a[setting_mode.ordinal()];
        if (i == 1) {
            long c2 = com.health.openworkout.gui.workout.d.a(r()).c();
            this.Y.setWorkoutSessionId(c2);
            this.Y.setOrderNr(com.health.openworkout.core.a.h().m(c2).getWorkoutItems().size() + 1);
            com.health.openworkout.core.a.h().p(this.Y);
            t.a(m(), R.id.nav_host_fragment).s();
        } else if (i == 2) {
            com.health.openworkout.core.a.h().u(this.Y);
        }
        return z2;
    }

    @Override // androidx.fragment.app.Fragment
    public void C0(int i, String[] strArr, int[] iArr) {
        this.n0.d(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.Fragment
    public void d0(int i, int i2, Intent intent) {
        super.d0(i, i2, intent);
        if (this.n0.c(i, i2, intent)) {
            Uri data = intent.getData();
            if (this.o0) {
                this.Z.setImageURI(data);
                this.Y.setImagePath(data.toString());
                this.Y.setImagePathExternal(true);
                return;
            }
            this.m0.setVideoURI(data);
            this.m0.start();
            this.Y.setVideoPath(data.toString());
            this.Y.setVideoPathExternal(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_workoutsettings, viewGroup, false);
        this.n0 = new com.health.openworkout.gui.utils.a(this);
        this.Z = (ImageView) inflate.findViewById(R.id.imgView);
        this.a0 = (TextView) inflate.findViewById(R.id.nameView);
        this.b0 = (TextView) inflate.findViewById(R.id.descriptionView);
        this.c0 = (TextView) inflate.findViewById(R.id.prepTimeView);
        this.d0 = (TextView) inflate.findViewById(R.id.workoutTimeView);
        this.e0 = (TextView) inflate.findViewById(R.id.breakTimeView);
        this.f0 = (TextView) inflate.findViewById(R.id.repetitionCountView);
        this.g0 = (Switch) inflate.findViewById(R.id.timeModeView);
        this.h0 = (TableRow) inflate.findViewById(R.id.workoutTimeRow);
        this.i0 = (TableRow) inflate.findViewById(R.id.repetitionCountRow);
        this.j0 = (Switch) inflate.findViewById(R.id.videoModeView);
        this.k0 = (TableRow) inflate.findViewById(R.id.videoCardRow);
        this.l0 = (CardView) inflate.findViewById(R.id.videoCardView);
        VideoView videoView = (VideoView) inflate.findViewById(R.id.videoView);
        this.m0 = videoView;
        videoView.setOnPreparedListener(new a(this));
        this.g0.setOnCheckedChangeListener(new b());
        this.j0.setOnCheckedChangeListener(new c());
        this.Z.setOnClickListener(new d());
        this.l0.setOnClickListener(new e());
        this.m0.setOnClickListener(new f());
        C1(com.health.openworkout.gui.workout.d.a(r()).b());
        return inflate;
    }

    @Override // com.health.openworkout.gui.datatypes.GenericSettingsFragment
    protected String z1() {
        return this.Y.getName();
    }
}
