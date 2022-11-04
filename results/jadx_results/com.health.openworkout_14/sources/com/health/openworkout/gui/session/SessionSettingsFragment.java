package com.health.openworkout.gui.session;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutSession;
import com.health.openworkout.gui.datatypes.GenericSettingsFragment;
/* loaded from: classes.dex */
public class SessionSettingsFragment extends GenericSettingsFragment {
    private WorkoutSession Y;
    private ImageView Z;
    private TextView a0;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3462a;

        static {
            int[] iArr = new int[GenericSettingsFragment.SETTING_MODE.values().length];
            f3462a = iArr;
            try {
                iArr[GenericSettingsFragment.SETTING_MODE.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3462a[GenericSettingsFragment.SETTING_MODE.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // com.health.openworkout.gui.datatypes.GenericSettingsFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void A1(com.health.openworkout.gui.datatypes.GenericSettingsFragment.SETTING_MODE r3) {
        /*
            r2 = this;
            int[] r0 = com.health.openworkout.gui.session.SessionSettingsFragment.a.f3462a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L24
            r0 = 2
            if (r3 == r0) goto Lf
            goto L2b
        Lf:
            android.os.Bundle r3 = r2.r()
            com.health.openworkout.gui.session.c r3 = com.health.openworkout.gui.session.c.a(r3)
            long r0 = r3.e()
            com.health.openworkout.core.a r3 = com.health.openworkout.core.a.h()
            com.health.openworkout.core.datatypes.WorkoutSession r3 = r3.m(r0)
            goto L29
        L24:
            com.health.openworkout.core.datatypes.WorkoutSession r3 = new com.health.openworkout.core.datatypes.WorkoutSession
            r3.<init>()
        L29:
            r2.Y = r3
        L2b:
            com.health.openworkout.core.datatypes.WorkoutSession r3 = r2.Y
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto L39
            android.widget.ImageView r3 = r2.Z
            r0 = 2131230872(0x7f080098, float:1.807781E38)
            goto L3e
        L39:
            android.widget.ImageView r3 = r2.Z
            r0 = 2131230873(0x7f080099, float:1.8077811E38)
        L3e:
            r3.setImageResource(r0)
            android.widget.TextView r3 = r2.a0
            com.health.openworkout.core.datatypes.WorkoutSession r0 = r2.Y
            java.lang.String r0 = r0.getName()
            r3.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.health.openworkout.gui.session.SessionSettingsFragment.A1(com.health.openworkout.gui.datatypes.GenericSettingsFragment$SETTING_MODE):void");
    }

    @Override // com.health.openworkout.gui.datatypes.GenericSettingsFragment
    protected boolean B1(GenericSettingsFragment.SETTING_MODE setting_mode) {
        this.Y.setName(this.a0.getText().toString());
        int i = a.f3462a[setting_mode.ordinal()];
        if (i == 1) {
            this.Y.setTrainingPlanId(c.a(r()).d());
            com.health.openworkout.core.a.h().q(this.Y);
        } else if (i == 2) {
            com.health.openworkout.core.a.h().v(this.Y);
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sessionsettings, viewGroup, false);
        this.Z = (ImageView) inflate.findViewById(R.id.imgView);
        this.a0 = (TextView) inflate.findViewById(R.id.nameView);
        C1(c.a(r()).b());
        return inflate;
    }

    @Override // com.health.openworkout.gui.datatypes.GenericSettingsFragment
    protected String z1() {
        return this.Y.getName();
    }
}
