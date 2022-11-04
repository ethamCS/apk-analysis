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
import com.google.android.material.bottomnavigation.BottomNavigationView;
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
public class VideosActivity extends e implements NavigationView.c, SensorEventListener {
    private ListView u;
    private c.a.a.e.b v;
    private String w;
    private SharedPreferences x;
    private String y;
    private ArrayList<c.a.a.e.a> t = new ArrayList<>();
    private int z = 0;
    private final BottomNavigationView.d A = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements BottomNavigationView.d {

        /* renamed from: org.dynamicsoft.caloriescope.activities.VideosActivity$a$a */
        /* loaded from: classes.dex */
        class RunnableC0072a implements Runnable {
            RunnableC0072a() {
                a.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (VideosActivity.this.z == 0) {
                    return;
                }
                VideosActivity.this.z = 0;
                VideosActivity videosActivity = VideosActivity.this;
                videosActivity.y = videosActivity.x.getString("YouTubeHealthyFoodChannelIDText", c.a.a.a.f1354b);
                c cVar = new c();
                cVar.execute("https://www.googleapis.com/youtube/v3/search?key=" + VideosActivity.this.w + "&channelId=" + VideosActivity.this.y + "&part=snippet,id&order=date&maxResults=50");
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {
            b() {
                a.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (VideosActivity.this.z == 1) {
                    return;
                }
                VideosActivity.this.z = 1;
                VideosActivity videosActivity = VideosActivity.this;
                videosActivity.y = videosActivity.x.getString("YouTubeExerciseChannelIDText", c.a.a.a.f1355c);
                c cVar = new c();
                cVar.execute("https://www.googleapis.com/youtube/v3/search?key=" + VideosActivity.this.w + "&channelId=" + VideosActivity.this.y + "&part=snippet,id&order=date&maxResults=50");
            }
        }

        a() {
            VideosActivity.this = r1;
        }

        @Override // com.google.android.material.bottomnavigation.BottomNavigationView.d
        public boolean a(MenuItem menuItem) {
            VideosActivity videosActivity;
            Runnable bVar;
            switch (menuItem.getItemId()) {
                case R.id.navigation_exercise /* 2131230973 */:
                    videosActivity = VideosActivity.this;
                    bVar = new b();
                    break;
                case R.id.navigation_food /* 2131230974 */:
                    videosActivity = VideosActivity.this;
                    bVar = new RunnableC0072a();
                    break;
                default:
                    return false;
            }
            videosActivity.runOnUiThread(bVar);
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
            VideosActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideosActivity.this.y = "UCr_-k8z6_RKKxkjWkt8RFvA";
            c cVar = new c();
            cVar.execute("https://www.googleapis.com/youtube/v3/search?key=" + VideosActivity.this.w + "&channelId=" + VideosActivity.this.y + "&part=snippet,id&order=date&maxResults=50");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public class c extends AsyncTask<String, Integer, String> {

        /* renamed from: a */
        ProgressDialog f1658a;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            a() {
                c.this = r1;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                VideosActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=" + ((c.a.a.e.a) VideosActivity.this.t.get(i)).d())));
            }
        }

        c() {
            VideosActivity.this = r1;
        }

        /* renamed from: a */
        public String doInBackground(String... strArr) {
            return VideosActivity.b(strArr[0]);
        }

        /* renamed from: a */
        public void onPostExecute(String str) {
            this.f1658a.cancel();
            VideosActivity.this.t.clear();
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("items");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getJSONObject("id").getString("videoId");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("snippet");
                    VideosActivity.this.t.add(new c.a.a.e.a(string, jSONObject2.getString("title"), jSONObject2.getString("description"), jSONObject2.getJSONObject("thumbnails").getJSONObject("high").getString("url")));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            VideosActivity.this.v.notifyDataSetChanged();
            VideosActivity.this.u.setOnItemClickListener(new a());
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(VideosActivity.this);
            this.f1658a = progressDialog;
            progressDialog.setMessage("Loading, please wait…");
            this.f1658a.show();
            this.f1658a.setCancelable(false);
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
            } else if (itemId == R.id.nav_hearing_wellbeing) {
                intent = MainActivity.a0;
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
        setContentView(R.layout.activity_videos_with_drawer);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("AppData", 0);
        this.x = sharedPreferences;
        sharedPreferences.edit();
        this.w = this.x.getString("YouTubeKeyEditText", c.a.a.a.f1353a);
        this.t = new ArrayList<>();
        this.u = (ListView) findViewById(R.id.list);
        c.a.a.e.b bVar = new c.a.a.e.b(getApplicationContext(), R.layout.calorie_scope_videos_inflate, this.t);
        this.v = bVar;
        this.u.setAdapter((ListAdapter) bVar);
        runOnUiThread(new b());
        ((BottomNavigationView) findViewById(R.id.navigation)).setOnNavigationItemSelectedListener(this.A);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        a(toolbar);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        androidx.appcompat.app.b bVar2 = new androidx.appcompat.app.b(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.a(bVar2);
        bVar2.b();
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
