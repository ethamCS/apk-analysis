package e.a.a.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import d.a.c.a.i;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class a extends AsyncTask<Void, Void, byte[]> {

    /* renamed from: a */
    private WeakReference<Context> f734a;

    /* renamed from: b */
    private i.d f735b;

    /* renamed from: c */
    private String f736c;

    /* renamed from: d */
    private Exception f737d;

    public a(Context context, i.d dVar, String str) {
        this.f734a = new WeakReference<>(context);
        this.f735b = dVar;
        this.f736c = str;
    }

    /* renamed from: a */
    public byte[] doInBackground(Void... voidArr) {
        Context context = this.f734a.get();
        if (context != null) {
            try {
                Bitmap g = e.a.a.g.b.g(context, this.f736c);
                if (g != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    g.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    g.recycle();
                    return byteArray;
                }
                throw new e.a.a.e.f.a("File '" + this.f736c + "' not found or invalid");
            } catch (Exception e2) {
                this.f737d = e2;
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void onPostExecute(byte[] bArr) {
        Exception exc = this.f737d;
        if (exc == null) {
            this.f735b.b(bArr);
            return;
        }
        exc.printStackTrace();
        this.f735b.a("BitmapResourceDecoder", this.f737d.getMessage(), this.f737d);
    }
}
