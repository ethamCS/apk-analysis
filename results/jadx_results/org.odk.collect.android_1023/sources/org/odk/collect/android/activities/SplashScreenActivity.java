package org.odk.collect.android.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.kxml2.wap.Wbxml;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.preferences.PreferencesActivity;
/* loaded from: classes.dex */
public class SplashScreenActivity extends Activity {
    private static final boolean EXIT = true;
    private static final int mSplashTimeout = 2000;
    private AlertDialog mAlertDialog;
    private int mImageMaxWidth;

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Collect.createODKDirs();
            this.mImageMaxWidth = getWindowManager().getDefaultDisplay().getWidth();
            requestWindowFeature(1);
            setContentView(R.layout.splash_screen);
            SharedPreferences mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = mSharedPreferences.edit();
            PackageInfo packageInfo = null;
            try {
                packageInfo = getPackageManager().getPackageInfo(getPackageName(), Wbxml.EXT_T_0);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            boolean firstRun = mSharedPreferences.getBoolean(PreferencesActivity.KEY_FIRST_RUN, true);
            boolean showSplash = mSharedPreferences.getBoolean(PreferencesActivity.KEY_SHOW_SPLASH, false);
            String splashPath = mSharedPreferences.getString(PreferencesActivity.KEY_SPLASH_PATH, getString(R.string.default_splash_path));
            if (mSharedPreferences.getLong(PreferencesActivity.KEY_LAST_VERSION, 0L) < packageInfo.versionCode) {
                editor.putLong(PreferencesActivity.KEY_LAST_VERSION, packageInfo.versionCode);
                editor.commit();
                firstRun = true;
            }
            if (firstRun || showSplash) {
                editor.putBoolean(PreferencesActivity.KEY_FIRST_RUN, false);
                editor.commit();
                startSplashScreen(splashPath);
                return;
            }
            endSplashScreen();
        } catch (RuntimeException e2) {
            createErrorDialog(e2.getMessage(), true);
        }
    }

    public void endSplashScreen() {
        startActivity(new Intent(this, MainMenuActivity.class));
        finish();
    }

    private Bitmap decodeFile(File f) {
        Bitmap b = null;
        try {
            BitmapFactory.Options o = new BitmapFactory.Options();
            o.inJustDecodeBounds = true;
            FileInputStream fis = new FileInputStream(f);
            BitmapFactory.decodeStream(fis, null, o);
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int scale = 1;
            if (o.outHeight > this.mImageMaxWidth || o.outWidth > this.mImageMaxWidth) {
                scale = (int) Math.pow(2.0d, (int) Math.round(Math.log(this.mImageMaxWidth / Math.max(o.outHeight, o.outWidth)) / Math.log(0.5d)));
            }
            BitmapFactory.Options o2 = new BitmapFactory.Options();
            o2.inSampleSize = scale;
            FileInputStream fis2 = new FileInputStream(f);
            b = BitmapFactory.decodeStream(fis2, null, o2);
            try {
                fis2.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (FileNotFoundException e3) {
        }
        return b;
    }

    private void startSplashScreen(String path) {
        ImageView iv = (ImageView) findViewById(R.id.splash);
        LinearLayout ll = (LinearLayout) findViewById(R.id.splash_default);
        File f = new File(path);
        if (f.exists()) {
            iv.setImageBitmap(decodeFile(f));
            ll.setVisibility(8);
            iv.setVisibility(0);
        }
        Thread t = new Thread() { // from class: org.odk.collect.android.activities.SplashScreenActivity.1
            int count = 0;

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    super.run();
                    while (this.count < SplashScreenActivity.mSplashTimeout) {
                        sleep(100L);
                        this.count += 100;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    SplashScreenActivity.this.endSplashScreen();
                }
            }
        };
        t.start();
    }

    private void createErrorDialog(String errorMsg, final boolean shouldExit) {
        Collect.getInstance().getActivityLogger().logAction(this, "createErrorDialog", "show");
        this.mAlertDialog = new AlertDialog.Builder(this).create();
        this.mAlertDialog.setIcon(17301659);
        this.mAlertDialog.setMessage(errorMsg);
        DialogInterface.OnClickListener errorListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.SplashScreenActivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int i) {
                switch (i) {
                    case -1:
                        Collect.getInstance().getActivityLogger().logAction(this, "createErrorDialog", "OK");
                        if (shouldExit) {
                            SplashScreenActivity.this.finish();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        };
        this.mAlertDialog.setCancelable(false);
        this.mAlertDialog.setButton(getString(R.string.ok), errorListener);
        this.mAlertDialog.show();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Collect.getInstance().getActivityLogger().logOnStart(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        Collect.getInstance().getActivityLogger().logOnStop(this);
        super.onStop();
    }
}
