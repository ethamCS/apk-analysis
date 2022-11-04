package w;

import android.content.Context;
/* loaded from: classes.dex */
public interface p2 {

    /* renamed from: a */
    public static final p2 f24562a = new a();

    /* loaded from: classes.dex */
    class a implements p2 {
        a() {
        }

        @Override // w.p2
        public o0 a(b bVar, int i10) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE
    }

    /* loaded from: classes.dex */
    public interface c {
        p2 a(Context context);
    }

    o0 a(b bVar, int i10);
}
