package b.c.a;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public interface d {

    /* loaded from: classes.dex */
    static class a implements d {
        a() {
        }

        @Override // b.c.a.d
        public int a() {
            return 0;
        }

        @Override // b.c.a.d
        public Bitmap a(String str) {
            return null;
        }

        @Override // b.c.a.d
        public void a(String str, Bitmap bitmap) {
        }

        @Override // b.c.a.d
        public int size() {
            return 0;
        }
    }

    static {
        new a();
    }

    int a();

    Bitmap a(String str);

    void a(String str, Bitmap bitmap);

    int size();
}
