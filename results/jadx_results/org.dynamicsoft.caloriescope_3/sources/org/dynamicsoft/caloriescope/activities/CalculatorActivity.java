package org.dynamicsoft.caloriescope.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import org.dynamicsoft.caloriescope.R;
/* loaded from: classes.dex */
public class CalculatorActivity extends e implements NavigationView.c, SensorEventListener {
    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private TextView E;
    private TextView F;
    private TextView G;
    private TextView H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private EditText N;
    private EditText O;
    private int P = 0;
    private final BottomNavigationView.d Q = new a();
    private SharedPreferences.Editor R;
    private TextView t;
    private TextView u;
    private TextView v;
    private TextView w;
    private TextView x;
    private TextView y;
    private TextView z;

    /* loaded from: classes.dex */
    class a implements BottomNavigationView.d {
        a() {
            CalculatorActivity.this = r1;
        }

        @Override // com.google.android.material.bottomnavigation.BottomNavigationView.d
        public boolean a(MenuItem menuItem) {
            EditText editText;
            String str;
            int itemId = menuItem.getItemId();
            if (itemId == R.id.navigation_bmi) {
                CalculatorActivity.this.P = 0;
                CalculatorActivity.this.N.setHint("Weight (kg)");
                editText = CalculatorActivity.this.O;
                str = "Height (m)";
            } else if (itemId != R.id.navigation_whr) {
                return false;
            } else {
                CalculatorActivity.this.P = 1;
                CalculatorActivity.this.N.setHint("Waist (inch)");
                editText = CalculatorActivity.this.O;
                str = "Hip (inch)";
            }
            editText.setHint(str);
            CalculatorActivity.this.N.setText((CharSequence) null);
            CalculatorActivity.this.O.setText((CharSequence) null);
            CalculatorActivity.this.t.setText((CharSequence) null);
            CalculatorActivity.this.u.setText((CharSequence) null);
            CalculatorActivity.this.v.setText((CharSequence) null);
            CalculatorActivity.this.w.setText((CharSequence) null);
            CalculatorActivity.this.x.setText((CharSequence) null);
            CalculatorActivity.this.y.setText((CharSequence) null);
            CalculatorActivity.this.B.setText((CharSequence) null);
            CalculatorActivity.this.A.setText((CharSequence) null);
            CalculatorActivity.this.C.setText((CharSequence) null);
            CalculatorActivity.this.D.setText((CharSequence) null);
            CalculatorActivity.this.z.setText((CharSequence) null);
            CalculatorActivity.this.E.setText((CharSequence) null);
            CalculatorActivity.this.F.setText((CharSequence) null);
            CalculatorActivity.this.G.setText((CharSequence) null);
            CalculatorActivity.this.H.setText((CharSequence) null);
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
            CalculatorActivity.this = r1;
        }

        @Override // android.view.View.OnClickListener
        @SuppressLint({"SetTextI18n"})
        public void onClick(View view) {
            if (CalculatorActivity.this.P == 0 && !CalculatorActivity.this.N.getText().toString().equals("") && CalculatorActivity.this.N.getText().toString().length() != 0 && !CalculatorActivity.this.O.getText().toString().equals("") && CalculatorActivity.this.O.getText().toString().length() != 0) {
                CalculatorActivity calculatorActivity = CalculatorActivity.this;
                double floatValue = Float.valueOf(calculatorActivity.N.getText().toString()).floatValue();
                Double.isNaN(floatValue);
                calculatorActivity.I = (float) (floatValue * 2.205d);
                CalculatorActivity calculatorActivity2 = CalculatorActivity.this;
                calculatorActivity2.J = Float.valueOf(calculatorActivity2.O.getText().toString()).floatValue() * 12.0f;
                CalculatorActivity calculatorActivity3 = CalculatorActivity.this;
                double d = calculatorActivity3.I;
                double pow = Math.pow(CalculatorActivity.this.J, 2.0d);
                Double.isNaN(d);
                calculatorActivity3.M = (float) ((d / pow) * 703.0d);
                CalculatorActivity.this.t.setText("BMI: " + CalculatorActivity.this.M);
                CalculatorActivity.this.R.putString("LastBMI", String.valueOf(CalculatorActivity.this.M));
                CalculatorActivity.this.R.apply();
                MainActivity.c0.setText("Your Body Mass index is " + CalculatorActivity.this.M);
                MainActivity.c0.setVisibility(0);
                CalculatorActivity.this.u.setText("Body Mass Index");
                CalculatorActivity.this.v.setText("BMI");
                CalculatorActivity.this.w.setText((CharSequence) null);
                CalculatorActivity.this.x.setText("Weight Status");
                CalculatorActivity.this.y.setText("Below 18.5");
                CalculatorActivity.this.B.setText("18.5-24.9");
                CalculatorActivity.this.A.setText("25.0-29.9");
                CalculatorActivity.this.C.setText((CharSequence) null);
                CalculatorActivity.this.D.setText((CharSequence) null);
                CalculatorActivity.this.z.setText((CharSequence) null);
                CalculatorActivity.this.E.setText("Underweight");
                CalculatorActivity.this.F.setText("Normal");
                CalculatorActivity.this.G.setText("Overweight");
                CalculatorActivity.this.H.setText("30.0 and above Obese");
            }
            if (CalculatorActivity.this.P != 1 || CalculatorActivity.this.N.getText().toString().equals("") || CalculatorActivity.this.N.getText().toString().length() == 0 || CalculatorActivity.this.O.getText().toString().equals("") || CalculatorActivity.this.O.getText().toString().length() == 0) {
                return;
            }
            CalculatorActivity calculatorActivity4 = CalculatorActivity.this;
            calculatorActivity4.K = Float.valueOf(calculatorActivity4.N.getText().toString()).floatValue();
            CalculatorActivity calculatorActivity5 = CalculatorActivity.this;
            calculatorActivity5.L = Float.valueOf(calculatorActivity5.O.getText().toString()).floatValue();
            CalculatorActivity calculatorActivity6 = CalculatorActivity.this;
            calculatorActivity6.M = calculatorActivity6.K / CalculatorActivity.this.L;
            CalculatorActivity.this.t.setText("WHR: " + CalculatorActivity.this.M);
            CalculatorActivity.this.R.putString("LastWHR", String.valueOf(CalculatorActivity.this.M));
            CalculatorActivity.this.R.apply();
            MainActivity.d0.setText("Your Waist Hip ratio is " + CalculatorActivity.this.M);
            MainActivity.d0.setVisibility(0);
            CalculatorActivity.this.u.setText("Waist To Hip Ratio");
            CalculatorActivity.this.v.setText("Health Risk");
            CalculatorActivity.this.w.setText("Women");
            CalculatorActivity.this.x.setText("Men");
            CalculatorActivity.this.y.setText("Low");
            CalculatorActivity.this.z.setText("0.80 or lower");
            CalculatorActivity.this.A.setText("High");
            CalculatorActivity.this.B.setText("Moderate");
            CalculatorActivity.this.C.setText("0.81-0.85");
            CalculatorActivity.this.D.setText("0.96 or 1.0");
            CalculatorActivity.this.E.setText("0.95 or lower");
            CalculatorActivity.this.F.setText("0.86 or higher");
            CalculatorActivity.this.G.setText("1.0 or higher");
            CalculatorActivity.this.H.setText((CharSequence) null);
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
            } else if (itemId != R.id.nav_calculator) {
                if (itemId == R.id.nav_heart_rate) {
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
        setContentView(R.layout.activity_calculator_with_drawer);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("AppData", 0);
        this.R = sharedPreferences.edit();
        this.t = (TextView) findViewById(R.id.result_textview);
        this.N = (EditText) findViewById(R.id.weight_waist);
        this.O = (EditText) findViewById(R.id.height_hip);
        this.u = (TextView) findViewById(R.id.calculate_title);
        this.v = (TextView) findViewById(R.id.calculate_firstheading);
        this.w = (TextView) findViewById(R.id.calculate_secondheading);
        this.x = (TextView) findViewById(R.id.calculate_thirdheading);
        this.y = (TextView) findViewById(R.id.calculate_firstheading_under1);
        this.z = (TextView) findViewById(R.id.calculate_firstheading_under2);
        this.A = (TextView) findViewById(R.id.calculate_firstheading_under3);
        this.B = (TextView) findViewById(R.id.calculate_second_heading_under_1);
        this.C = (TextView) findViewById(R.id.calculate_second_heading_under_2);
        this.D = (TextView) findViewById(R.id.calculate_secondheading_under3);
        this.E = (TextView) findViewById(R.id.calculate_thirdheading_under1);
        this.F = (TextView) findViewById(R.id.calculate_third_heading_under_2);
        this.G = (TextView) findViewById(R.id.calculate_thirdheading_under3);
        this.H = (TextView) findViewById(R.id.bmi_last);
        ((Button) findViewById(R.id.calculate)).setOnClickListener(new b());
        ((BottomNavigationView) findViewById(R.id.navigation)).setOnNavigationItemSelectedListener(this.Q);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        a(toolbar);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        androidx.appcompat.app.b bVar = new androidx.appcompat.app.b(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.a(bVar);
        bVar.b();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ((TextView) navigationView.a(0).findViewById(R.id.NavDrawerUserString)).setText(sharedPreferences.getString("UserName", "Welcome"));
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

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
    }
}
