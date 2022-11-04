package com.androidplot.util;

import android.util.Log;
import com.androidplot.Plot;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class Redrawer implements Runnable {
    private static final int ONE_SECOND_MS = 1000;
    private static final String TAG = "com.androidplot.util.Redrawer";
    private boolean keepAlive;
    private boolean keepRunning;
    private List<WeakReference<Plot>> plots;
    private long sleepTime;
    private Thread thread;

    public Redrawer(List<Plot> list, float f, boolean z) {
        this.plots = new ArrayList(list.size());
        for (Plot plot : list) {
            this.plots.add(new WeakReference<>(plot));
        }
        setMaxRefreshRate(f);
        Thread thread = new Thread(this, "Androidplot Redrawer");
        this.thread = thread;
        thread.start();
        if (z) {
            start();
        }
    }

    public Redrawer(Plot plot, float f, boolean z) {
        this(Collections.singletonList(plot), f, z);
    }

    public synchronized void pause() {
        this.keepRunning = false;
        notify();
        Log.d(TAG, "Redrawer paused.");
    }

    public synchronized void start() {
        this.keepRunning = true;
        notify();
        Log.d(TAG, "Redrawer started.");
    }

    public synchronized void finish() {
        this.keepRunning = false;
        this.keepAlive = false;
        notify();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.keepAlive = true;
        while (this.keepAlive) {
            try {
                if (this.keepRunning) {
                    for (WeakReference<Plot> weakReference : this.plots) {
                        weakReference.get().redraw();
                    }
                    synchronized (this) {
                        wait(this.sleepTime);
                    }
                } else {
                    synchronized (this) {
                        wait();
                    }
                }
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                Log.d(TAG, "Redrawer thread exited.");
                throw th;
            }
        }
        Log.d(TAG, "Redrawer thread exited.");
    }

    public void setMaxRefreshRate(float f) {
        this.sleepTime = 1000.0f / f;
        String str = TAG;
        Log.d(str, "Set Redrawer refresh rate to " + f + "( " + this.sleepTime + " ms)");
    }
}
