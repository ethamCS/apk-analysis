package org.dynamicsoft.caloriescope.activities;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import org.dynamicsoft.caloriescope.R;
/* loaded from: classes.dex */
public class AboutActivity extends e implements NavigationView.c, SensorEventListener {
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
            } else if (itemId != R.id.nav_about) {
                if (itemId == R.id.nav_settings) {
                    intent = MainActivity.W;
                } else if (itemId == R.id.nav_calculator) {
                    intent = MainActivity.X;
                } else if (itemId == R.id.nav_heart_rate) {
                    intent = MainActivity.Y;
                } else if (itemId == R.id.nav_heart_rate_camera) {
                    intent = MainActivity.Z;
                } else if (itemId == R.id.nav_hearing_wellbeing) {
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

    public void heartRateCameraLEDURL(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/phishman3579/android-heart-rate-monitor")));
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
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_about_with_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        a(toolbar);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        b bVar = new b(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.a(bVar);
        bVar.b();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ((TextView) navigationView.a(0).findViewById(R.id.NavDrawerUserString)).setText(getApplicationContext().getSharedPreferences("AppData", 0).getString("UserName", "Welcome"));
        navigationView.getMenu().findItem(((SensorManager) getSystemService("sensor")).getDefaultSensor(21) != null ? R.id.nav_heart_rate : R.id.nav_heart_rate_camera).setVisible(true);
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

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
    }

    public void perfectTuneURL(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/karlotoy/perfectTune")));
    }

    public void picassoURL(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/square/picasso")));
    }

    public void pulseviewURL(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/Devlight/PulseView")));
    }

    public void stepCounterUsingAccelerometerURL(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.gadgetsaint.com/android/create-pedometer-step-counter-android/")));
    }

    public void volleyURL(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/google/volley")));
    }
}
