package org.dynamicsoft.caloriescope.activities;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import java.util.Calendar;
import java.util.Date;
import org.dynamicsoft.caloriescope.R;
import org.dynamicsoft.caloriescope.services.BackgroundService;
/* loaded from: classes.dex */
public class MainActivity extends androidx.appcompat.app.e implements NavigationView.c, SensorEventListener, c.a.a.b.c {
    public static Intent U;
    public static Intent V;
    public static Intent W;
    public static Intent X;
    public static Intent Y;
    public static Intent Z;
    public static Intent a0;
    public static Intent b0;
    @SuppressLint({"StaticFieldLeak"})
    public static TextView c0;
    @SuppressLint({"StaticFieldLeak"})
    public static TextView d0;
    @SuppressLint({"StaticFieldLeak"})
    public static TextView e0;
    private ImageView A;
    private ImageView B;
    private SharedPreferences.Editor C;
    private ProgressBar D;
    private c.a.a.b.b E;
    private SensorManager F;
    private Sensor G;
    private Sensor H;
    private Button K;
    private Button L;
    private Button M;
    private TextView N;
    private TextView O;
    private TextView P;
    private TextView Q;
    private TextView R;
    private TextView S;
    private TextView T;
    private long t;
    private int w;
    private int x;
    private float y;
    private float z;
    private int u = 0;
    private int v = 0;
    private boolean I = false;
    private boolean J = false;

    /* loaded from: classes.dex */
    class a implements RadioGroup.OnCheckedChangeListener {
        a() {
            MainActivity.this = r1;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        @SuppressLint({"ResourceType"})
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
            if (radioButton == null || i <= -1) {
                return;
            }
            MainActivity.this.C.putString("Gender", radioButton.getText().toString());
        }
    }

    /* loaded from: classes.dex */
    class b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ EditText f1638b;

        /* renamed from: c */
        final /* synthetic */ TextView f1639c;
        final /* synthetic */ EditText d;

        b(EditText editText, TextView textView, EditText editText2) {
            MainActivity.this = r1;
            this.f1638b = editText;
            this.f1639c = textView;
            this.d = editText2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f1638b.getText().toString().equals("") || this.f1638b.getText().toString().equals(null)) {
                return;
            }
            MainActivity.this.C.putString("DefaultNewsCountryEditText", this.f1638b.getText().toString());
            TextView textView = this.f1639c;
            textView.setText("Welcome " + this.d.getText().toString());
            MainActivity.this.C.putString("UserName", "Welcome " + this.d.getText().toString());
            MainActivity.this.C.putString("personalInfoSet", "true");
            MainActivity.this.C.apply();
        }
    }

    /* loaded from: classes.dex */
    class c implements View.OnClickListener {
        c() {
            MainActivity.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!MainActivity.this.I) {
                SensorManager sensorManager = MainActivity.this.F;
                MainActivity mainActivity = MainActivity.this;
                sensorManager.registerListener(mainActivity, mainActivity.G, 0);
            } else {
                SensorManager sensorManager2 = MainActivity.this.F;
                MainActivity mainActivity2 = MainActivity.this;
                sensorManager2.registerListener(mainActivity2, mainActivity2.H, 3);
            }
            MainActivity.this.K.setVisibility(4);
            MainActivity.this.M.setVisibility(4);
            MainActivity.this.L.setVisibility(0);
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
            MainActivity.this = r1;
        }

        @Override // android.view.View.OnClickListener
        @SuppressLint({"SetTextI18n"})
        public void onClick(View view) {
            MainActivity.this.N.setText("Paused");
            MainActivity.this.F.unregisterListener(MainActivity.this);
            MainActivity.this.L.setVisibility(4);
            MainActivity.this.K.setVisibility(0);
            if (!MainActivity.this.I) {
                MainActivity.this.M.setVisibility(0);
            } else {
                MainActivity.this.M.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnClickListener {
        e() {
            MainActivity.this = r1;
        }

        @Override // android.view.View.OnClickListener
        @SuppressLint({"SetTextI18n"})
        public void onClick(View view) {
            MainActivity.this.N.setText("Let's Start!");
            MainActivity.this.O.setText("");
            MainActivity.this.F.unregisterListener(MainActivity.this);
            MainActivity.this.t = 0L;
            MainActivity.this.y = 0.0f;
            MainActivity.this.C.putLong("numSteps", 0L);
            MainActivity.this.C.putFloat("Calories", 0.0f);
            MainActivity.this.C.apply();
            MainActivity.this.M.setVisibility(4);
            MainActivity.this.L.setVisibility(4);
            MainActivity.this.K.setVisibility(0);
            Toast.makeText(MainActivity.this, "Records cleared", 0).show();
        }
    }

    /* loaded from: classes.dex */
    class f implements View.OnClickListener {
        f() {
            MainActivity.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity.d(MainActivity.this);
            MainActivity.this.w += 250;
            MainActivity.this.C.putInt("waterGlasses", MainActivity.this.u);
            MainActivity.this.C.putInt("currentWaterQuantity", MainActivity.this.w);
            MainActivity.this.C.apply();
            MainActivity.this.P.setText(" " + MainActivity.this.u);
            MainActivity.this.R.setText("( " + MainActivity.this.w + " ml )");
        }
    }

    /* loaded from: classes.dex */
    class g implements View.OnClickListener {
        g() {
            MainActivity.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity.i(MainActivity.this);
            MainActivity.this.x += 80;
            MainActivity.this.C.putInt("caffeineCups", MainActivity.this.v);
            MainActivity.this.C.putInt("currentCaffeineQuantity", MainActivity.this.x);
            MainActivity.this.C.apply();
            MainActivity.this.Q.setText(" " + MainActivity.this.v);
            MainActivity.this.S.setText("( " + MainActivity.this.x + " mg )");
        }
    }

    static /* synthetic */ int d(MainActivity mainActivity) {
        int i = mainActivity.u;
        mainActivity.u = i + 1;
        return i;
    }

    static /* synthetic */ int i(MainActivity mainActivity) {
        int i = mainActivity.v;
        mainActivity.v = i + 1;
        return i;
    }

    @Override // c.a.a.b.c
    @SuppressLint({"SetTextI18n"})
    public void a(long j) {
        if (!this.I) {
            long j2 = this.t + 1;
            this.t = j2;
            this.y = ((float) j2) / 20.0f;
            TextView textView = this.N;
            textView.setText("" + this.t);
            TextView textView2 = this.T;
            textView2.setText(this.t + "/10000");
            this.D.setProgress((int) this.t);
            TextView textView3 = this.O;
            textView3.setText(this.y + " cal");
            this.C.putLong("numSteps", this.t);
            this.C.putFloat("Calories", this.y);
            this.C.apply();
        }
    }

    @Override // com.google.android.material.navigation.NavigationView.c
    public boolean a(MenuItem menuItem) {
        Intent intent;
        int itemId = menuItem.getItemId();
        if (itemId != R.id.nav_home) {
            if (itemId == R.id.nav_news) {
                intent = U;
            } else if (itemId == R.id.nav_about) {
                intent = V;
            } else if (itemId == R.id.nav_settings) {
                intent = W;
            } else if (itemId == R.id.nav_calculator) {
                intent = X;
            } else if (itemId == R.id.nav_heart_rate) {
                intent = Y;
            } else if (itemId == R.id.nav_heart_rate_camera) {
                intent = Z;
            } else if (itemId == R.id.nav_hearing_wellbeing) {
                intent = a0;
            } else if (itemId == R.id.nav_videos) {
                intent = b0;
            }
            startActivity(intent);
        }
        ((DrawerLayout) findViewById(R.id.drawer_layout)).a(8388611);
        return false;
    }

    @SuppressLint({"SetTextI18n"})
    public void clear_fluids_lastbpm(View view) {
        this.u = 0;
        this.w = 0;
        this.v = 0;
        this.x = 0;
        this.C.putInt("waterGlasses", 0);
        this.C.putInt("currentWaterQuantity", this.w);
        this.C.putInt("caffeineCups", this.v);
        this.C.putInt("currentCaffeineQuantity", this.x);
        this.C.putString("LastBPM", "");
        this.C.putString("LastBMI", "");
        this.C.putString("LastWHR", "");
        this.C.apply();
        e0.setText("");
        c0.setText("");
        d0.setText("");
        e0.setVisibility(8);
        c0.setVisibility(8);
        d0.setVisibility(8);
        TextView textView = this.P;
        textView.setText(" " + this.u);
        TextView textView2 = this.R;
        textView2.setText("( " + this.w + " ml )");
        TextView textView3 = this.Q;
        textView3.setText(" " + this.v);
        TextView textView4 = this.S;
        textView4.setText("( " + this.x + " mg )");
        Toast.makeText(this, "Records cleared", 0).show();
    }

    public void launch_heart_activity_from_home(View view) {
        startActivity(this.J ? Y : Z);
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
        setContentView(R.layout.calorie_scope_root_nav_drawer);
        new Intent(this, MainActivity.class);
        U = new Intent(this, NewsActivity.class);
        V = new Intent(this, AboutActivity.class);
        W = new Intent(this, SettingsActivity.class);
        X = new Intent(this, CalculatorActivity.class);
        Y = new Intent(this, HeartRateSensorActivity.class);
        Z = new Intent(this, HeartRateCameraActivity.class);
        a0 = new Intent(this, HearingWellbeingActivity.class);
        b0 = new Intent(this, VideosActivity.class);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("AppData", 0);
        this.C = sharedPreferences.edit();
        this.z = sharedPreferences.getFloat("CurrentSensitivityValue", 30.0f);
        startService(new Intent(this, BackgroundService.class));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        a(toolbar);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        androidx.appcompat.app.b bVar = new androidx.appcompat.app.b(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.a(bVar);
        bVar.b();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        this.N = (TextView) findViewById(R.id.tv_steps);
        this.O = (TextView) findViewById(R.id.CalorieView);
        this.K = (Button) findViewById(R.id.btn_start);
        this.L = (Button) findViewById(R.id.btn_stop);
        this.M = (Button) findViewById(R.id.btn_reset);
        this.B = (ImageView) findViewById(R.id.addWater);
        this.A = (ImageView) findViewById(R.id.addCaffeine);
        this.P = (TextView) findViewById(R.id.currentWaterValue);
        this.Q = (TextView) findViewById(R.id.currentCaffeineValue);
        this.R = (TextView) findViewById(R.id.waterQuantity);
        this.S = (TextView) findViewById(R.id.caffeineQuantity);
        this.T = (TextView) findViewById(R.id.stepsInCircle);
        this.D = (ProgressBar) findViewById(R.id.circularProgressbar);
        c0 = (TextView) findViewById(R.id.LastBMI);
        d0 = (TextView) findViewById(R.id.LastWHR);
        e0 = (TextView) findViewById(R.id.LastBPM);
        Date time = Calendar.getInstance().getTime();
        ((TextView) findViewById(R.id.TodayDateAndTime)).setText(time.toString().substring(0, 10) + ", " + time.toString().substring(30, 34));
        this.u = sharedPreferences.getInt("waterGlasses", 0);
        this.w = sharedPreferences.getInt("currentWaterQuantity", 0);
        TextView textView = this.P;
        textView.setText(" " + this.u);
        TextView textView2 = this.R;
        textView2.setText("( " + this.w + " ml )");
        this.v = sharedPreferences.getInt("caffeineCups", 0);
        this.x = sharedPreferences.getInt("currentCaffeineQuantity", 0);
        TextView textView3 = this.Q;
        textView3.setText(" " + this.v);
        TextView textView4 = this.S;
        textView4.setText("( " + this.x + " mg )");
        this.t = sharedPreferences.getLong("numSteps", 0L);
        this.y = sharedPreferences.getFloat("Calories", 0.0f);
        TextView textView5 = (TextView) navigationView.a(0).findViewById(R.id.NavDrawerUserString);
        textView5.setText(sharedPreferences.getString("UserName", "Welcome"));
        if (!sharedPreferences.getString("LastBMI", "").equals("") && !sharedPreferences.getString("LastBMI", "").equals("null")) {
            TextView textView6 = c0;
            textView6.setText("Your Body Mass index is " + sharedPreferences.getString("LastBMI", "Error"));
            c0.setVisibility(0);
        }
        if (!sharedPreferences.getString("LastWHR", "").equals("") && !sharedPreferences.getString("LastWHR", "").equals("null")) {
            TextView textView7 = d0;
            textView7.setText("Your Waist Hip ratio is " + sharedPreferences.getString("LastWHR", "Error"));
            d0.setVisibility(0);
        }
        if (!sharedPreferences.getString("LastBPM", "").equals("") && !sharedPreferences.getString("LastBPM", "").equals("null")) {
            TextView textView8 = e0;
            textView8.setText("Your last heart rate check was " + sharedPreferences.getString("LastBPM", "Error") + " BPM");
            e0.setVisibility(0);
        }
        if (sharedPreferences.getString("personalInfoSet", "").equals("")) {
            View inflate = LayoutInflater.from(this).inflate(R.layout.personal_info_alert, (ViewGroup) null);
            d.a aVar = new d.a(this);
            aVar.b(inflate);
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.GenderRadioGroup);
            EditText editText = (EditText) inflate.findViewById(R.id.CountryCode);
            radioGroup.clearCheck();
            radioGroup.setOnCheckedChangeListener(new a());
            editText.setText(sharedPreferences.getString("DefaultNewsCountryEditText", c.a.a.a.e));
            aVar.a(false);
            aVar.b("Welcome");
            aVar.a("OK", new b(editText, textView5, (EditText) inflate.findViewById(R.id.PersonName)));
            aVar.a().show();
        }
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        this.F = sensorManager;
        if (sensorManager.getDefaultSensor(19) != null) {
            this.H = this.F.getDefaultSensor(19);
            this.I = true;
        } else {
            this.I = false;
            SensorManager sensorManager2 = (SensorManager) getSystemService("sensor");
            this.F = sensorManager2;
            this.G = sensorManager2.getDefaultSensor(1);
            c.a.a.b.b bVar2 = new c.a.a.b.b();
            this.E = bVar2;
            bVar2.a((c.a.a.b.c) this);
        }
        this.K.setOnClickListener(new c());
        this.L.setOnClickListener(new d());
        this.M.setOnClickListener(new e());
        this.B.setOnClickListener(new f());
        this.A.setOnClickListener(new g());
        Menu menu = navigationView.getMenu();
        if (((SensorManager) getSystemService("sensor")).getDefaultSensor(21) != null) {
            menu.findItem(R.id.nav_heart_rate).setVisible(true);
            this.J = true;
        } else {
            menu.findItem(R.id.nav_heart_rate_camera).setVisible(true);
            this.J = false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission("android.permission.CAMERA") == 0 && checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && checkSelfPermission("android.permission.BODY_SENSORS") == 0 && checkSelfPermission("android.permission.WAKE_LOCK") == 0) {
                return;
            }
            androidx.core.app.a.a(this, new String[]{"android.permission.CAMERA", "android.permission.ACCESS_NETWORK_STATE", "android.permission.BODY_SENSORS", "android.permission.WAKE_LOCK"}, 0);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_bar_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_exit) {
            moveTaskToBack(true);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("AppData", 0);
        if (!sharedPreferences.getString("LastBMI", "").equals("") && !sharedPreferences.getString("LastBMI", "").equals("null")) {
            TextView textView = c0;
            textView.setText("Your Body Mass index is " + sharedPreferences.getString("LastBMI", "Error"));
            c0.setVisibility(0);
        }
        if (!sharedPreferences.getString("LastWHR", "").equals("") && !sharedPreferences.getString("LastWHR", "").equals("null")) {
            TextView textView2 = d0;
            textView2.setText("Your Waist Hip ratio is " + sharedPreferences.getString("LastWHR", "Error"));
            d0.setVisibility(0);
        }
        if (sharedPreferences.getString("LastBPM", "").equals("") || sharedPreferences.getString("LastBPM", "").equals("null")) {
            return;
        }
        TextView textView3 = e0;
        textView3.setText("Your last heart rate check was " + sharedPreferences.getString("LastBPM", "Error") + " BPM");
        e0.setVisibility(0);
    }

    @Override // android.hardware.SensorEventListener
    @SuppressLint({"SetTextI18n"})
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!this.I) {
            if (sensorEvent.sensor.getType() != 1) {
                return;
            }
            c.a.a.b.b bVar = this.E;
            long j = sensorEvent.timestamp;
            float[] fArr = sensorEvent.values;
            bVar.a(j, fArr[0], fArr[1], fArr[2], this.z);
            return;
        }
        String valueOf = String.valueOf(sensorEvent.values[0]);
        String substring = valueOf.substring(0, valueOf.length() - 2);
        this.y = Float.parseFloat(substring) / 20.0f;
        this.t = Long.parseLong(substring);
        this.N.setText(substring);
        TextView textView = this.T;
        textView.setText(this.t + "/10000");
        this.D.setProgress((int) this.t);
        TextView textView2 = this.O;
        textView2.setText(this.y + " cal");
        this.C.putLong("numSteps", this.t);
        this.C.putFloat("Calories", this.y);
        this.C.apply();
    }
}
