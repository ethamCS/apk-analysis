package m6;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d */
    private static final String f16346d = "e";

    /* renamed from: a */
    private final Context f16347a;

    /* renamed from: b */
    private boolean f16348b = true;

    /* renamed from: c */
    private boolean f16349c = false;

    public e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f16347a = activity.getApplicationContext();
    }

    public static /* synthetic */ void c(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    public static /* synthetic */ boolean d(MediaPlayer mediaPlayer, int i10, int i11) {
        String str = f16346d;
        Log.w(str, "Failed to beep " + i10 + ", " + i11);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }

    public MediaPlayer e() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(c.f16344a);
        mediaPlayer.setOnErrorListener(d.f16345a);
        try {
            AssetFileDescriptor openRawResourceFd = this.f16347a.getResources().openRawResourceFd(m.a_res_0x7f0f0004);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (IOException e10) {
            Log.w(f16346d, e10);
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public synchronized void f() {
        Vibrator vibrator;
        if (this.f16348b) {
            e();
        }
        if (this.f16349c && (vibrator = (Vibrator) this.f16347a.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200L);
        }
    }

    public void g(boolean z10) {
        this.f16348b = z10;
    }
}
