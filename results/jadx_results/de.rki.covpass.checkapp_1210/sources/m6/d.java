package m6;

import android.media.MediaPlayer;
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public static final /* synthetic */ d f16345a = new d();

    private /* synthetic */ d() {
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        boolean d10;
        d10 = e.d(mediaPlayer, i10, i11);
        return d10;
    }
}
