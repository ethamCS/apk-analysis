package org.dynamicsoft.caloriescope.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.gigamole.library.PulseView;
import com.google.android.material.navigation.NavigationView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.dynamicsoft.caloriescope.R;
/* loaded from: classes.dex */
public class HeartRateCameraActivity extends e implements NavigationView.c, SensorEventListener {
    private static String A;
    private static TextView I;
    private static PulseView K;
    private SharedPreferences.Editor t;
    private static final AtomicBoolean u = new AtomicBoolean(false);
    private static final int[] v = new int[4];
    private static final int[] w = new int[3];
    private static final SurfaceHolder.Callback x = new a();
    private static SurfaceHolder y = null;
    private static Camera z = null;
    @SuppressLint({"StaticFieldLeak"})
    private static PowerManager.WakeLock B = null;
    private static int C = 0;
    private static c D = c.GREEN;
    private static int E = 0;
    private static double F = 0.0d;
    private static long G = 0;
    @SuppressLint({"StaticFieldLeak"})
    private static TextView H = null;
    private static final Camera.PreviewCallback J = new b();

    /* loaded from: classes.dex */
    static class a implements SurfaceHolder.Callback {
        a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            Camera.Parameters parameters = HeartRateCameraActivity.z.getParameters();
            parameters.setFlashMode("torch");
            Camera.Size b2 = HeartRateCameraActivity.b(i2, i3, parameters);
            if (b2 != null) {
                parameters.setPreviewSize(b2.width, b2.height);
                Log.d("HeartRateMonitor", "Using width=" + b2.width + " height=" + b2.height);
            }
            HeartRateCameraActivity.z.setParameters(parameters);
            HeartRateCameraActivity.z.startPreview();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                HeartRateCameraActivity.z.setPreviewDisplay(HeartRateCameraActivity.y);
                HeartRateCameraActivity.z.setPreviewCallback(HeartRateCameraActivity.J);
            } catch (Throwable th) {
                Log.e("Preview-surfaceCallback", "Exception in setPreviewDisplay()", th);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    /* loaded from: classes.dex */
    static class b implements Camera.PreviewCallback {
        b() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            int[] iArr;
            int[] iArr2;
            if (bArr != null) {
                Camera.Size previewSize = camera.getParameters().getPreviewSize();
                if (previewSize == null) {
                    throw null;
                }
                if (!HeartRateCameraActivity.u.compareAndSet(false, true)) {
                    return;
                }
                int a2 = c.a.a.c.a.a((byte[]) bArr.clone(), previewSize.height, previewSize.width);
                if (a2 != 0 && a2 != 255) {
                    int i = 0;
                    int i2 = 0;
                    for (int i3 : HeartRateCameraActivity.v) {
                        if (i3 > 0) {
                            i2 += i3;
                            i++;
                        }
                    }
                    int i4 = i > 0 ? i2 / i : 0;
                    c cVar = HeartRateCameraActivity.D;
                    if (a2 < i4) {
                        cVar = c.RED;
                        if (cVar != HeartRateCameraActivity.D) {
                            HeartRateCameraActivity.B();
                        }
                    } else if (a2 > i4) {
                        cVar = c.GREEN;
                    }
                    if (HeartRateCameraActivity.C == 4) {
                        int unused = HeartRateCameraActivity.C = 0;
                    }
                    HeartRateCameraActivity.v[HeartRateCameraActivity.C] = a2;
                    HeartRateCameraActivity.D();
                    if (cVar != HeartRateCameraActivity.D) {
                        c unused2 = HeartRateCameraActivity.D = cVar;
                    }
                    double currentTimeMillis = System.currentTimeMillis() - HeartRateCameraActivity.G;
                    Double.isNaN(currentTimeMillis);
                    double d = currentTimeMillis / 1000.0d;
                    if (d >= 10.0d) {
                        int i5 = (int) ((HeartRateCameraActivity.F / d) * 60.0d);
                        if (i5 >= 30 && i5 <= 180) {
                            if (HeartRateCameraActivity.E == 3) {
                                int unused3 = HeartRateCameraActivity.E = 0;
                            }
                            HeartRateCameraActivity.w[HeartRateCameraActivity.E] = i5;
                            HeartRateCameraActivity.r();
                            int i6 = 0;
                            int i7 = 0;
                            for (int i8 : HeartRateCameraActivity.w) {
                                if (i8 > 0) {
                                    i6 += i8;
                                    i7++;
                                }
                            }
                            int i9 = i6 / i7;
                            HeartRateCameraActivity.H.setText(String.valueOf(i9));
                            HeartRateCameraActivity.H.setTextSize(32.0f);
                            HeartRateCameraActivity.I.setVisibility(0);
                            HeartRateCameraActivity.K.a();
                            String unused4 = HeartRateCameraActivity.A = String.valueOf(i9);
                        }
                        long unused5 = HeartRateCameraActivity.G = System.currentTimeMillis();
                        double unused6 = HeartRateCameraActivity.F = 0.0d;
                    }
                }
                HeartRateCameraActivity.u.set(false);
                return;
            }
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        GREEN,
        RED
    }

    static /* synthetic */ double B() {
        double d = F;
        F = 1.0d + d;
        return d;
    }

    static /* synthetic */ int D() {
        int i = C;
        C = i + 1;
        return i;
    }

    public static Camera.Size b(int i, int i2, Camera.Parameters parameters) {
        int i3;
        Camera.Size size = null;
        for (Camera.Size size2 : parameters.getSupportedPreviewSizes()) {
            int i4 = size2.width;
            if (i4 <= i && (i3 = size2.height) <= i2 && (size == null || i4 * i3 < size.width * size.height)) {
                size = size2;
            }
        }
        return size;
    }

    static /* synthetic */ int r() {
        int i = E;
        E = i + 1;
        return i;
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
            } else if (itemId != R.id.nav_heart_rate && itemId != R.id.nav_heart_rate_camera) {
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
            return;
        }
        this.t.putString("LastBPM", String.valueOf(A));
        this.t.apply();
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    @SuppressLint({"InvalidWakeLockTag", "CommitPrefEdits"})
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 23 && checkSelfPermission("android.permission.CAMERA") != 0) {
            androidx.core.app.a.a(this, new String[]{"android.permission.CAMERA"}, 0);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_heart_rate_camera_with_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        a(toolbar);
        PulseView pulseView = (PulseView) findViewById(R.id.pulse);
        K = pulseView;
        pulseView.b();
        SurfaceHolder holder = ((SurfaceView) findViewById(R.id.preview)).getHolder();
        y = holder;
        holder.addCallback(x);
        y.setType(3);
        H = (TextView) findViewById(R.id.BPMCamTextViewVal);
        I = (TextView) findViewById(R.id.BPMCamTextView);
        B = ((PowerManager) getSystemService("power")).newWakeLock(1, "DoNotDimScreen");
        this.t = getApplicationContext().getSharedPreferences("AppData", 0).edit();
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

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onPause() {
        super.onPause();
        this.t.putString("LastBPM", String.valueOf(A));
        this.t.apply();
        B.release();
        z.setPreviewCallback(null);
        z.stopPreview();
        z.release();
        z = null;
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        B.acquire(600000L);
        z = Camera.open();
        G = System.currentTimeMillis();
        this.t.putString("LastBPM", String.valueOf(A));
        this.t.apply();
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
    }
}
