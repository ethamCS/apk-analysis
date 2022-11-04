package org.dynamicsoft.caloriescope.activities;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import org.dynamicsoft.caloriescope.R;
/* loaded from: classes.dex */
public class HearingWellbeingActivity extends androidx.appcompat.app.e implements NavigationView.c, SensorEventListener {
    private TextView A;
    private d.a D;
    private d.a E;
    private b.b.a.a.a t;
    private Button v;
    private Button w;
    private Button x;
    private TextView y;
    private TextView z;
    private Boolean u = false;
    private int B = 1;
    private int C = 2000;

    /* loaded from: classes.dex */
    class a implements DialogInterface.OnClickListener {
        a() {
            HearingWellbeingActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HearingWellbeingActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class b implements DialogInterface.OnClickListener {
        b() {
            HearingWellbeingActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HearingWellbeingActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class c implements DialogInterface.OnClickListener {
        c() {
            HearingWellbeingActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HearingWellbeingActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class d implements DialogInterface.OnClickListener {
        d() {
            HearingWellbeingActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HearingWellbeingActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class e implements DialogInterface.OnClickListener {
        e() {
            HearingWellbeingActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
            HearingWellbeingActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class f implements DialogInterface.OnClickListener {
        f() {
            HearingWellbeingActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HearingWellbeingActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class g implements DialogInterface.OnClickListener {
        g() {
            HearingWellbeingActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HearingWellbeingActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class h implements DialogInterface.OnClickListener {
        h() {
            HearingWellbeingActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HearingWellbeingActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class i implements DialogInterface.OnClickListener {
        i() {
            HearingWellbeingActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HearingWellbeingActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class j implements DialogInterface.OnClickListener {
        j() {
            HearingWellbeingActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HearingWellbeingActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class k implements DialogInterface.OnClickListener {
        k() {
            HearingWellbeingActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HearingWellbeingActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class l implements DialogInterface.OnClickListener {
        l() {
            HearingWellbeingActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HearingWellbeingActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class m implements DialogInterface.OnClickListener {
        m() {
            HearingWellbeingActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HearingWellbeingActivity.this.finish();
        }
    }

    @Override // com.google.android.material.navigation.NavigationView.c
    public boolean a(MenuItem menuItem) {
        Intent intent;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            ((DrawerLayout) findViewById(R.id.drawer_layout)).a(8388611);
            super.onBackPressed();
        } else {
            if (itemId == R.id.nav_news) {
                intent = MainActivity.U;
            } else if (itemId == R.id.nav_about) {
                intent = MainActivity.V;
            } else if (itemId == R.id.nav_settings) {
                intent = MainActivity.W;
            } else if (itemId == R.id.nav_calculator) {
                intent = MainActivity.X;
            } else if (itemId == R.id.nav_heart_rate) {
                intent = MainActivity.Y;
            } else if (itemId == R.id.nav_heart_rate_camera) {
                intent = MainActivity.Z;
            } else if (itemId != R.id.nav_hearing_wellbeing && itemId == R.id.nav_videos) {
                intent = MainActivity.b0;
            }
            startActivity(intent);
            finish();
        }
        ((DrawerLayout) findViewById(R.id.drawer_layout)).a(8388611);
        return true;
    }

    public void next(View view) {
        this.x.setVisibility(4);
        this.v.setVisibility(0);
        this.w.setVisibility(0);
        this.A.setVisibility(0);
        if (this.C == 2000) {
            this.z.setText("Step 1 of 11");
            this.A.setText("Frequency: 2000 hz");
            if (this.u.booleanValue()) {
                this.t.b();
            }
            this.u = true;
            this.t.a(2000.0d);
            this.t.a();
        }
        if (this.C == 4000) {
            if (this.u.booleanValue()) {
                this.t.b();
            }
            this.u = true;
            this.t.a(4000.0d);
            this.t.a();
        }
        if (this.C == 6000) {
            if (this.u.booleanValue()) {
                this.t.b();
            }
            this.u = true;
            this.t.a(6000.0d);
            this.t.a();
        }
        if (this.C == 8000) {
            if (this.u.booleanValue()) {
                this.t.b();
            }
            this.u = true;
            this.t.a(8000.0d);
            this.t.a();
        }
        if (this.C == 10000) {
            if (this.u.booleanValue()) {
                this.t.b();
            }
            this.u = true;
            this.t.a(10000.0d);
            this.t.a();
        }
        if (this.C == 12000) {
            if (this.u.booleanValue()) {
                this.t.b();
            }
            this.u = true;
            this.t.a(12000.0d);
            this.t.a();
        }
        if (this.C == 14000) {
            if (this.u.booleanValue()) {
                this.t.b();
            }
            this.u = true;
            this.t.a(14000.0d);
            this.t.a();
        }
        if (this.C == 16000) {
            if (this.u.booleanValue()) {
                this.t.b();
            }
            this.u = true;
            this.t.a(16000.0d);
            this.t.a();
        }
        if (this.C == 18000) {
            if (this.u.booleanValue()) {
                this.t.b();
            }
            this.u = true;
            this.t.a(18000.0d);
            this.t.a();
        }
        if (this.C == 20000) {
            if (this.u.booleanValue()) {
                this.t.b();
            }
            this.u = true;
            this.t.a(20000.0d);
            this.t.a();
        }
        if (this.C == 22000) {
            if (this.u.booleanValue()) {
                this.t.b();
            }
            this.u = true;
            this.t.a(22000.0d);
            this.t.a();
        }
        if (this.C == 24000) {
            if (this.u.booleanValue()) {
                this.t.b();
            }
            this.u = true;
            this.t.a(24000.0d);
            this.t.a();
        }
    }

    public void no(View view) {
        this.v.setVisibility(4);
        this.w.setVisibility(4);
        this.x.setVisibility(4);
        this.t.b();
        d.a aVar = new d.a(this);
        this.E = aVar;
        if (this.C == 2000) {
            aVar.a("Test indicates that you have the audition of a person having age more than 90 years");
            aVar.a(false);
            aVar.a("OK", new f());
        }
        if (this.C == 4000) {
            d.a aVar2 = this.E;
            aVar2.a("Test indicates that you have the audition of a person having age between 81 years and 90 years");
            aVar2.a(false);
            aVar2.a("OK", new g());
        }
        if (this.C == 6000) {
            d.a aVar3 = this.E;
            aVar3.a("Test indicates that you have the audition of a person having age between 76 years and 80 years");
            aVar3.a(false);
            aVar3.a("OK", new h());
        }
        if (this.C == 8000) {
            d.a aVar4 = this.E;
            aVar4.a("Test indicates that you have the audition of a person having age between 71 years and 75 years");
            aVar4.a(false);
            aVar4.a("OK", new i());
        }
        if (this.C == 10000) {
            d.a aVar5 = this.E;
            aVar5.a("Test indicates that you have the audition of a person having age between 66 years and 70 years");
            aVar5.a(false);
            aVar5.a("OK", new j());
        }
        if (this.C == 12000) {
            d.a aVar6 = this.E;
            aVar6.a("Test indicates that you have the audition of a person having age between 61 years and 65 years");
            aVar6.a(false);
            aVar6.a("OK", new k());
        }
        if (this.C == 14000) {
            d.a aVar7 = this.E;
            aVar7.a("Test indicates that you have the audition of a person having age between 56 years and 60 years");
            aVar7.a(false);
            aVar7.a("OK", new l());
        }
        if (this.C == 16000) {
            d.a aVar8 = this.E;
            aVar8.a("Test indicates that you have the audition of a person having age between 50 years and 55 years");
            aVar8.a(false);
            aVar8.a("OK", new m());
        }
        if (this.C == 18000) {
            d.a aVar9 = this.E;
            aVar9.a("Test indicates that you have the audition of a person having age between 40 years and 49 years");
            aVar9.a(false);
            aVar9.a("OK", new a());
        }
        if (this.C == 20000) {
            d.a aVar10 = this.E;
            aVar10.a("Test indicates that you have the audition of a person having age between 30 years and 39 years");
            aVar10.a(false);
            aVar10.a("OK", new b());
        }
        if (this.C == 22000) {
            d.a aVar11 = this.E;
            aVar11.a("Test indicates that you have the audition of a person having age between 20 years and 29 years");
            aVar11.a(false);
            aVar11.a("OK", new c());
        }
        if (this.C == 24000) {
            d.a aVar12 = this.E;
            aVar12.a("Test indicates that you have the audition of an infant");
            aVar12.a(false);
            aVar12.a("OK", new d());
        }
        this.E.a();
        this.E.c();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.e(8388611)) {
            drawerLayout.a(8388611);
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hearing_wellbeing_with_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        a(toolbar);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        androidx.appcompat.app.b bVar = new androidx.appcompat.app.b(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.a(bVar);
        bVar.b();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ((TextView) navigationView.a(0).findViewById(R.id.NavDrawerUserString)).setText(getApplicationContext().getSharedPreferences("AppData", 0).getString("UserName", "Welcome"));
        navigationView.getMenu().findItem(((SensorManager) getSystemService("sensor")).getDefaultSensor(21) != null ? R.id.nav_heart_rate : R.id.nav_heart_rate_camera).setVisible(true);
        this.t = new b.b.a.a.a();
        this.v = (Button) findViewById(R.id.btn_yes);
        this.w = (Button) findViewById(R.id.btn_no);
        this.x = (Button) findViewById(R.id.btn_next);
        this.y = (TextView) findViewById(R.id.tip);
        this.z = (TextView) findViewById(R.id.frequency_status_textview);
        this.A = (TextView) findViewById(R.id.steps);
        this.v.setVisibility(4);
        this.w.setVisibility(4);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_bar_menu, menu);
        return true;
    }

    @Override // androidx.appcompat.app.e, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_exit) {
            moveTaskToBack(true);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
    }

    @SuppressLint({"SetTextI18n"})
    public void yes(View view) {
        if (this.y.getVisibility() == 0) {
            this.y.setVisibility(4);
        }
        this.t.b();
        int i2 = this.B + 1;
        this.B = i2;
        this.C += 2000;
        if (i2 < 12) {
            this.z.setText("Step " + this.B + " of 11");
        }
        if (this.C < 24000) {
            this.A.setText("Frequency: " + this.C + " Hz");
        }
        this.v.setVisibility(4);
        this.w.setVisibility(4);
        this.x.setVisibility(0);
        if (this.C == 24000 && this.B == 12) {
            this.x.setVisibility(4);
            d.a aVar = new d.a(this);
            this.D = aVar;
            aVar.a("Test indicates that you have excellent hearing capability");
            aVar.a(false);
            aVar.a("OK", new e());
            this.D.a();
            this.D.c();
        }
    }
}
