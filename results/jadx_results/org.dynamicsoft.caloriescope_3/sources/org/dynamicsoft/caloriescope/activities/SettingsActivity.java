package org.dynamicsoft.caloriescope.activities;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import org.dynamicsoft.caloriescope.R;
/* loaded from: classes.dex */
public class SettingsActivity extends e implements NavigationView.c, SensorEventListener {
    private EditText A;
    private EditText B;
    private EditText C;
    private TextView t;
    private int u = 0;
    private float v;
    private SharedPreferences w;
    private SharedPreferences.Editor x;
    private EditText y;
    private EditText z;

    /* loaded from: classes.dex */
    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
            SettingsActivity.this = r1;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        @SuppressLint({"SetTextI18n"})
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            SettingsActivity.this.u = i;
            TextView textView = SettingsActivity.this.t;
            textView.setText("Accelerometer sensitivity: " + SettingsActivity.this.u);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        @SuppressLint({"SetTextI18n"})
        public void onStopTrackingTouch(SeekBar seekBar) {
            TextView textView = SettingsActivity.this.t;
            textView.setText("Accelerometer sensitivity: " + SettingsActivity.this.u);
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
            SettingsActivity.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SettingsActivity settingsActivity = SettingsActivity.this;
            settingsActivity.v = settingsActivity.u;
            SettingsActivity.this.x.putFloat("CurrentSensitivityValue", SettingsActivity.this.v);
            if (!SettingsActivity.this.C.getText().toString().equals("") && !SettingsActivity.this.C.getText().toString().equals(null)) {
                SettingsActivity.this.x.putString("DefaultNewsCountryEditText", SettingsActivity.this.C.getText().toString());
            }
            if (!SettingsActivity.this.y.getText().toString().equals("") && !SettingsActivity.this.y.getText().toString().equals(null)) {
                SettingsActivity.this.x.putString("YouTubeKeyEditText", SettingsActivity.this.y.getText().toString());
            }
            if (!SettingsActivity.this.z.getText().toString().equals("") && !SettingsActivity.this.z.getText().toString().equals(null)) {
                SettingsActivity.this.x.putString("YouTubeHealthyFoodChannelIDText", SettingsActivity.this.z.getText().toString());
            }
            if (!SettingsActivity.this.A.getText().toString().equals("") && !SettingsActivity.this.A.getText().toString().equals(null)) {
                SettingsActivity.this.x.putString("YouTubeExerciseChannelIDText", SettingsActivity.this.A.getText().toString());
            }
            if (!SettingsActivity.this.B.getText().toString().equals("") && !SettingsActivity.this.B.getText().toString().equals(null)) {
                SettingsActivity.this.x.putString("NewsApiOrgKeyEditText", SettingsActivity.this.B.getText().toString());
            }
            SettingsActivity.this.x.apply();
            Toast.makeText(SettingsActivity.this.getApplicationContext(), "Saved successfully!", 1).show();
            Intent launchIntentForPackage = SettingsActivity.this.getBaseContext().getPackageManager().getLaunchIntentForPackage(SettingsActivity.this.getBaseContext().getPackageName());
            launchIntentForPackage.addFlags(67108864);
            SettingsActivity.this.startActivity(launchIntentForPackage);
        }
    }

    /* loaded from: classes.dex */
    class c implements View.OnClickListener {
        c() {
            SettingsActivity.this = r1;
        }

        @Override // android.view.View.OnClickListener
        @SuppressLint({"SetTextI18n"})
        public void onClick(View view) {
            SettingsActivity.this.t.setText("Sensitivity: 30");
            SettingsActivity.this.v = 30.0f;
            SettingsActivity.this.x.putFloat("CurrentSensitivityValue", SettingsActivity.this.v);
            SettingsActivity.this.x.putString("DefaultNewsCountryEditText", c.a.a.a.e);
            SettingsActivity.this.x.putString("YouTubeKeyEditText", c.a.a.a.f1353a);
            SettingsActivity.this.x.putString("YouTubeHealthyFoodChannelIDText", c.a.a.a.f1354b);
            SettingsActivity.this.x.putString("YouTubeExerciseChannelIDText", c.a.a.a.f1355c);
            SettingsActivity.this.x.putString("NewsApiOrgKeyEditText", c.a.a.a.d);
            SettingsActivity.this.x.apply();
            Toast.makeText(SettingsActivity.this.getApplicationContext(), "Defaults settings loaded sucessfully!", 1).show();
            Intent launchIntentForPackage = SettingsActivity.this.getBaseContext().getPackageManager().getLaunchIntentForPackage(SettingsActivity.this.getBaseContext().getPackageName());
            launchIntentForPackage.addFlags(67108864);
            SettingsActivity.this.startActivity(launchIntentForPackage);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {

        /* loaded from: classes.dex */
        class a implements DialogInterface.OnClickListener {
            a() {
                d.this = r1;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                SettingsActivity.this.x.putInt("waterGlasses", 0);
                SettingsActivity.this.x.putInt("currentWaterQuantity", 0);
                SettingsActivity.this.x.putInt("caffeineCups", 0);
                SettingsActivity.this.x.putInt("currentCaffeineQuantity", 0);
                SettingsActivity.this.x.putLong("numSteps", 0L);
                SettingsActivity.this.x.putFloat("Calories", 0.0f);
                SettingsActivity.this.x.putString("LastBPM", "");
                SettingsActivity.this.x.putString("LastBMI", "");
                SettingsActivity.this.x.putString("LastWHR", "");
                SettingsActivity.this.x.putFloat("CurrentSensitivityValue", 30.0f);
                SettingsActivity.this.x.putString("DefaultNewsCountryEditText", c.a.a.a.e);
                SettingsActivity.this.x.putString("YouTubeKeyEditText", c.a.a.a.f1353a);
                SettingsActivity.this.x.putString("YouTubeHealthyFoodChannelIDText", c.a.a.a.f1354b);
                SettingsActivity.this.x.putString("YouTubeExerciseChannelIDText", c.a.a.a.f1355c);
                SettingsActivity.this.x.putString("NewsApiOrgKeyEditText", c.a.a.a.d);
                SettingsActivity.this.x.apply();
                Toast.makeText(SettingsActivity.this.getApplicationContext(), "App data cleared sucessfully!", 1).show();
                Intent launchIntentForPackage = SettingsActivity.this.getBaseContext().getPackageManager().getLaunchIntentForPackage(SettingsActivity.this.getBaseContext().getPackageName());
                launchIntentForPackage.addFlags(67108864);
                SettingsActivity.this.startActivity(launchIntentForPackage);
            }
        }

        /* loaded from: classes.dex */
        class b implements DialogInterface.OnClickListener {
            b(d dVar) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }

        d() {
            SettingsActivity.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(SettingsActivity.this);
            builder.setTitle("WARNING!");
            builder.setCancelable(false);
            builder.setMessage("Are you sure, you want to clear app data?\nThis will not clear your name and gender.");
            builder.setPositiveButton("YES", new a());
            builder.setNegativeButton("NO", new b(this));
            builder.show();
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
            } else if (itemId != R.id.nav_settings) {
                if (itemId == R.id.nav_calculator) {
                    intent = MainActivity.X;
                } else if (itemId == R.id.nav_heart_rate || itemId == R.id.nav_heart_rate) {
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
        finish();
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
        setContentView(R.layout.activity_settings_with_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        a(toolbar);
        SeekBar seekBar = (SeekBar) findViewById(R.id.SensitivitySeekBar);
        this.t = (TextView) findViewById(R.id.SensitivityTextView);
        Button button = (Button) findViewById(R.id.SaveSettings);
        Button button2 = (Button) findViewById(R.id.LoadDefaults);
        Button button3 = (Button) findViewById(R.id.ClearAppData);
        this.y = (EditText) findViewById(R.id.YouTubeKeyEditText);
        this.z = (EditText) findViewById(R.id.YouTubeHealthyFoodChannelIDText);
        this.A = (EditText) findViewById(R.id.YouTubeExerciseChannelIDText);
        this.B = (EditText) findViewById(R.id.NewsApiOrgKeyEditText);
        this.C = (EditText) findViewById(R.id.DefaultNewsCountryEditText);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("AppData", 0);
        this.w = sharedPreferences;
        this.x = sharedPreferences.edit();
        this.v = this.w.getFloat("CurrentSensitivityValue", 30.0f);
        TextView textView = this.t;
        textView.setText("Accelerometer sensitivity: " + ((int) this.v));
        this.z.setText(this.w.getString("YouTubeHealthyFoodChannelIDText", c.a.a.a.f1354b));
        this.A.setText(this.w.getString("YouTubeExerciseChannelIDText", c.a.a.a.f1355c));
        this.C.setText(this.w.getString("DefaultNewsCountryEditText", c.a.a.a.e));
        int i = Build.VERSION.SDK_INT;
        seekBar.setMax(100);
        if (i >= 26) {
            seekBar.setMin(1);
        }
        seekBar.setProgress((int) this.v);
        seekBar.setOnSeekBarChangeListener(new a());
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        androidx.appcompat.app.b bVar = new androidx.appcompat.app.b(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.a(bVar);
        bVar.b();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        button.setOnClickListener(new b());
        button2.setOnClickListener(new c());
        button3.setOnClickListener(new d());
        ((TextView) navigationView.a(0).findViewById(R.id.NavDrawerUserString)).setText(getApplicationContext().getSharedPreferences("AppData", 0).getString("UserName", "Welcome"));
        Menu menu = navigationView.getMenu();
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        menu.findItem(sensorManager.getDefaultSensor(21) != null ? R.id.nav_heart_rate : R.id.nav_heart_rate_camera).setVisible(true);
        if (sensorManager.getDefaultSensor(19) == null) {
            seekBar.setVisibility(0);
            return;
        }
        seekBar.setVisibility(8);
        this.t.setVisibility(8);
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
}
