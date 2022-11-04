package b.b.a.b;

import android.media.AudioTrack;
/* loaded from: classes.dex */
public class a extends Thread {

    /* renamed from: b */
    private boolean f1265b;

    /* renamed from: c */
    private int f1266c = 44100;
    private double d = 440.0d;

    public void a() {
        this.f1265b = false;
        try {
            join();
            interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void a(double d) {
        this.d = d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        double d;
        super.run();
        this.f1265b = true;
        int minBufferSize = AudioTrack.getMinBufferSize(this.f1266c, 4, 2);
        AudioTrack audioTrack = new AudioTrack(3, this.f1266c, 4, 2, minBufferSize, 1);
        short[] sArr = new short[minBufferSize];
        double atan = Math.atan(1.0d) * 8.0d;
        audioTrack.play();
        double d2 = 0.0d;
        while (this.f1265b) {
            double d3 = this.d;
            for (int i = 0; i < minBufferSize; i++) {
                double sin = Math.sin(d2);
                Double.isNaN(10000);
                sArr[i] = (short) (d * sin);
                double d4 = this.f1266c;
                Double.isNaN(d4);
                d2 += (atan * d3) / d4;
            }
            audioTrack.write(sArr, 0, minBufferSize);
        }
        audioTrack.stop();
        audioTrack.release();
    }
}
