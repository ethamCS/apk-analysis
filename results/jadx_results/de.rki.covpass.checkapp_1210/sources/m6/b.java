package m6;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
/* loaded from: classes.dex */
public final class b implements SensorEventListener {

    /* renamed from: a */
    private p7.h f16339a;

    /* renamed from: b */
    private p7.i f16340b;

    /* renamed from: c */
    private Sensor f16341c;

    /* renamed from: d */
    private Context f16342d;

    /* renamed from: e */
    private Handler f16343e = new Handler();

    public b(Context context, p7.h hVar, p7.i iVar) {
        this.f16342d = context;
        this.f16339a = hVar;
        this.f16340b = iVar;
    }

    public /* synthetic */ void b(boolean z10) {
        this.f16339a.t(z10);
    }

    private void c(final boolean z10) {
        this.f16343e.post(new Runnable() { // from class: m6.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(z10);
            }
        });
    }

    public void d() {
        if (this.f16340b.d()) {
            SensorManager sensorManager = (SensorManager) this.f16342d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f16341c = defaultSensor;
            if (defaultSensor == null) {
                return;
            }
            sensorManager.registerListener(this, defaultSensor, 3);
        }
    }

    public void e() {
        if (this.f16341c != null) {
            ((SensorManager) this.f16342d.getSystemService("sensor")).unregisterListener(this);
            this.f16341c = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (this.f16339a != null) {
            if (f10 <= 45.0f) {
                c(true);
            } else if (f10 < 450.0f) {
            } else {
                c(false);
            }
        }
    }
}
