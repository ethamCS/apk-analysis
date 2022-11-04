package org.dynamicsoft.caloriescope.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.a;
import androidx.drawerlayout.widget.DrawerLayout;
import com.gigamole.library.PulseView;
import com.google.android.material.navigation.NavigationView;
import org.dynamicsoft.caloriescope.R;
/* loaded from: classes.dex */
public class HeartRateSensorActivity extends e implements NavigationView.c, SensorEventListener {
    private SharedPreferences.Editor t;
    private TextView u;
    private boolean v = false;
    private SensorManager w;
    private Sensor x;
    private PulseView y;

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
            } else if (itemId != R.id.nav_heart_rate) {
                if (itemId == R.id.nav_hearing_wellbeing) {
                    intent = MainActivity.a0;
                } else if (itemId == R.id.nav_videos) {
                    intent = MainActivity.b0;
                }
            }
            startActivity(intent);
            finish();
        }
        ((DrawerLayout) findViewById(R.id.drawer_layout)).a(8388611);
        return true;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
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
    @SuppressLint({"SetTextI18n"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_heart_rate_with_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        a(toolbar);
        this.u = (TextView) findViewById(R.id.HeartRateTxt);
        PulseView pulseView = (PulseView) findViewById(R.id.pulse);
        this.y = pulseView;
        pulseView.b();
        if (Build.VERSION.SDK_INT >= 23 && checkSelfPermission("android.permission.BODY_SENSORS") != 0) {
            a.a(this, new String[]{"android.permission.BODY_SENSORS"}, 0);
        }
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        this.w = sensorManager;
        if (sensorManager.getDefaultSensor(21) != null) {
            Sensor defaultSensor = this.w.getDefaultSensor(21);
            this.x = defaultSensor;
            this.w.registerListener(this, defaultSensor, 3);
            this.v = true;
        } else {
            this.u.setText("Heart rate sensor is not present!");
            this.y.a();
        }
        this.t = getApplicationContext().getSharedPreferences("AppData", 0).edit();
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        b bVar = new b(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.a(bVar);
        bVar.b();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ((TextView) navigationView.a(0).findViewById(R.id.NavDrawerUserString)).setText(getApplicationContext().getSharedPreferences("AppData", 0).getString("UserName", "Welcome"));
        navigationView.getMenu().findItem(this.v ? R.id.nav_heart_rate : R.id.nav_heart_rate_camera).setVisible(true);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_bar_menu, menu);
        return true;
    }

    @Override // androidx.appcompat.app.e, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_exit) {
            moveTaskToBack(true);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.v) {
            this.w.unregisterListener(this);
        }
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.v) {
            this.w.registerListener(this, this.x, 3);
        }
    }

    @Override // android.hardware.SensorEventListener
    @SuppressLint({"SetTextI18n"})
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!this.v || ((int) sensorEvent.values[0]) == 0) {
            return;
        }
        this.y.a();
        if (this.u.getTextSize() != 32.0f) {
            this.u.setTextSize(32.0f);
        }
        TextView textView = this.u;
        textView.setText("Current heart rate: " + Math.round(sensorEvent.values[0]) + " BPM");
        this.t.putString("LastBPM", String.valueOf(Math.round(sensorEvent.values[0])));
        this.t.apply();
    }
}
