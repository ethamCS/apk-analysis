package com.health.openworkout.gui.training;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.TrainingPlan;
import com.health.openworkout.gui.datatypes.GenericSettingsFragment;
/* loaded from: classes.dex */
public class TrainingSettingsFragment extends GenericSettingsFragment {
    private TrainingPlan Y;
    private ImageView Z;
    private TextView a0;
    private com.health.openworkout.gui.utils.a b0;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
            TrainingSettingsFragment.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrainingSettingsFragment.this.b0.h();
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f3473a;

        static {
            int[] iArr = new int[GenericSettingsFragment.SETTING_MODE.values().length];
            f3473a = iArr;
            try {
                iArr[GenericSettingsFragment.SETTING_MODE.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3473a[GenericSettingsFragment.SETTING_MODE.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:2|(7:4|(1:6)|19|9|(1:11)(1:12)|17|18)(1:7)|8|19|9|(0)(0)|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
        r5 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
        r4.Z.setImageResource(com.health.openworkout.R.drawable.ic_no_file);
        r0 = t();
        android.widget.Toast.makeText(r0, t().getString(com.health.openworkout.R.string.error_no_access_to_file) + " " + r4.Y.getImagePath(), 0).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00af, code lost:
        r5 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b0, code lost:
        h.a.a.c(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[Catch: SecurityException -> 0x0074, IOException -> 0x00af, TryCatch #2 {IOException -> 0x00af, SecurityException -> 0x0074, blocks: (B:9:0x002b, B:11:0x0033, B:12:0x0043), top: B:19:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: SecurityException -> 0x0074, IOException -> 0x00af, TRY_LEAVE, TryCatch #2 {IOException -> 0x00af, SecurityException -> 0x0074, blocks: (B:9:0x002b, B:11:0x0033, B:12:0x0043), top: B:19:0x002b }] */
    @Override // com.health.openworkout.gui.datatypes.GenericSettingsFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void A1(com.health.openworkout.gui.datatypes.GenericSettingsFragment.SETTING_MODE r5) {
        /*
            r4 = this;
            int[] r0 = com.health.openworkout.gui.training.TrainingSettingsFragment.b.f3473a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 1
            if (r5 == r0) goto L24
            r0 = 2
            if (r5 == r0) goto Lf
            goto L2b
        Lf:
            android.os.Bundle r5 = r4.r()
            com.health.openworkout.gui.training.c r5 = com.health.openworkout.gui.training.c.a(r5)
            long r0 = r5.d()
            com.health.openworkout.core.a r5 = com.health.openworkout.core.a.h()
            com.health.openworkout.core.datatypes.TrainingPlan r5 = r5.j(r0)
            goto L29
        L24:
            com.health.openworkout.core.datatypes.TrainingPlan r5 = new com.health.openworkout.core.datatypes.TrainingPlan
            r5.<init>()
        L29:
            r4.Y = r5
        L2b:
            com.health.openworkout.core.datatypes.TrainingPlan r5 = r4.Y     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            boolean r5 = r5.isImagePathExternal()     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            if (r5 == 0) goto L43
            com.health.openworkout.core.datatypes.TrainingPlan r5 = r4.Y     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            java.lang.String r5 = r5.getImagePath()     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            android.widget.ImageView r0 = r4.Z     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            r0.setImageURI(r5)     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            goto Lb3
        L43:
            android.content.Context r5 = r4.t()     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            r0.<init>()     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            java.lang.String r1 = "image/"
            r0.append(r1)     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            com.health.openworkout.core.datatypes.TrainingPlan r1 = r4.Y     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            java.lang.String r1 = r1.getImagePath()     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            r0.append(r1)     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            java.lang.String r0 = r0.toString()     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            java.io.InputStream r5 = r5.open(r0)     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            android.widget.ImageView r0 = r4.Z     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            r1 = 0
            android.graphics.drawable.Drawable r1 = android.graphics.drawable.Drawable.createFromStream(r5, r1)     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            r0.setImageDrawable(r1)     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            r5.close()     // Catch: java.lang.SecurityException -> L74 java.io.IOException -> Laf
            goto Lb3
        L74:
            r5 = move-exception
            android.widget.ImageView r0 = r4.Z
            r1 = 2131230861(0x7f08008d, float:1.8077787E38)
            r0.setImageResource(r1)
            android.content.Context r0 = r4.t()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = r4.t()
            r3 = 2131755064(0x7f100038, float:1.9140997E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            com.health.openworkout.core.datatypes.TrainingPlan r2 = r4.Y
            java.lang.String r2 = r2.getImagePath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto Lb0
        Laf:
            r5 = move-exception
        Lb0:
            h.a.a.c(r5)
        Lb3:
            android.widget.TextView r5 = r4.a0
            com.health.openworkout.core.datatypes.TrainingPlan r0 = r4.Y
            java.lang.String r0 = r0.getName()
            r5.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.health.openworkout.gui.training.TrainingSettingsFragment.A1(com.health.openworkout.gui.datatypes.GenericSettingsFragment$SETTING_MODE):void");
    }

    @Override // com.health.openworkout.gui.datatypes.GenericSettingsFragment
    protected boolean B1(GenericSettingsFragment.SETTING_MODE setting_mode) {
        this.Y.setName(this.a0.getText().toString());
        int i = b.f3473a[setting_mode.ordinal()];
        if (i == 1) {
            com.health.openworkout.core.a.h().o(this.Y);
        } else if (i == 2) {
            com.health.openworkout.core.a.h().s(this.Y);
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void C0(int i, String[] strArr, int[] iArr) {
        this.b0.d(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.Fragment
    public void d0(int i, int i2, Intent intent) {
        super.d0(i, i2, intent);
        if (this.b0.c(i, i2, intent)) {
            Uri data = intent.getData();
            String uri = data.toString();
            this.Z.setImageURI(data);
            this.Y.setImagePath(uri);
            this.Y.setImagePathExternal(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_trainingsettings, viewGroup, false);
        this.Z = (ImageView) inflate.findViewById(R.id.imgView);
        this.a0 = (TextView) inflate.findViewById(R.id.nameView);
        this.b0 = new com.health.openworkout.gui.utils.a(this);
        this.Z.setOnClickListener(new a());
        C1(c.a(r()).b());
        return inflate;
    }

    @Override // com.health.openworkout.gui.datatypes.GenericSettingsFragment
    protected String z1() {
        return this.Y.getName();
    }
}
