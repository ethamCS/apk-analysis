package org.dynamicsoft.caloriescope.activities;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import org.dynamicsoft.caloriescope.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class NewsActivity extends e implements NavigationView.c, SensorEventListener {
    private String t;
    private ArrayList<c.a.a.d.a> u;
    private ListView v;
    private c.a.a.d.b w;
    private String x;
    private SharedPreferences y;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
            NewsActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = new b();
            bVar.execute("https://newsapi.org/v2/top-headlines?category=health&country=" + NewsActivity.this.t + "&apiKey=" + NewsActivity.this.x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public class b extends AsyncTask<String, Integer, String> {

        /* renamed from: a */
        ProgressDialog f1646a;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            a() {
                b.this = r1;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                NewsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((c.a.a.d.a) NewsActivity.this.u.get(i)).d())));
            }
        }

        b() {
            NewsActivity.this = r1;
        }

        /* renamed from: a */
        public String doInBackground(String... strArr) {
            return NewsActivity.b(strArr[0]);
        }

        /* renamed from: a */
        public void onPostExecute(String str) {
            this.f1646a.cancel();
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("articles");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    NewsActivity.this.u.add(new c.a.a.d.a(jSONObject.getString("urlToImage"), jSONObject.getString("title"), jSONObject.getString("description"), jSONObject.getString("url")));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            NewsActivity.this.w = new c.a.a.d.b(NewsActivity.this.getApplicationContext(), R.layout.calorie_scope_news_inflate, NewsActivity.this.u);
            NewsActivity.this.v.setAdapter((ListAdapter) NewsActivity.this.w);
            NewsActivity.this.v.setOnItemClickListener(new a());
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(NewsActivity.this);
            this.f1646a = progressDialog;
            progressDialog.setMessage("Loading, please wait…");
            this.f1646a.show();
            this.f1646a.setCancelable(false);
        }
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(str).openConnection().getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    @Override // com.google.android.material.navigation.NavigationView.c
    public boolean a(MenuItem menuItem) {
        Intent intent;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            ((DrawerLayout) findViewById(R.id.drawer_layout)).a(8388611);
            super.onBackPressed();
        } else if (itemId != R.id.nav_news) {
            if (itemId == R.id.nav_about) {
                intent = MainActivity.V;
            } else if (itemId == R.id.nav_settings) {
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
        setContentView(R.layout.activity_news_with_drawer);
        this.u = new ArrayList<>();
        this.v = (ListView) findViewById(R.id.list);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("AppData", 0);
        this.y = sharedPreferences;
        sharedPreferences.edit();
        this.x = this.y.getString("NewsApiOrgKeyEditText", c.a.a.a.d);
        this.t = this.y.getString("DefaultNewsCountryEditText", c.a.a.a.e);
        runOnUiThread(new a());
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
