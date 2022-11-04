package androidx.media.m;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.d;
import androidx.core.app.e;
import androidx.media.i;
import androidx.media.j;
import androidx.media.k;
/* loaded from: classes.dex */
public class a extends e.g {

    /* renamed from: e */
    int[] f293e = null;
    MediaSessionCompat.Token f;
    boolean g;
    PendingIntent h;

    private RemoteViews o(e.a aVar) {
        boolean z = aVar.a() == null;
        RemoteViews remoteViews = new RemoteViews(this.f182a.f176a.getPackageName(), k.f289a);
        int i = i.a_res_0x7f050021;
        remoteViews.setImageViewResource(i, aVar.e());
        if (!z) {
            remoteViews.setOnClickPendingIntent(i, aVar.a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(i, aVar.j());
        }
        return remoteViews;
    }

    @Override // androidx.core.app.e.g
    public void b(d dVar) {
        if (Build.VERSION.SDK_INT < 21) {
            if (!this.g) {
                return;
            }
            dVar.a().setOngoing(true);
            return;
        }
        Notification.Builder a2 = dVar.a();
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
        l(mediaStyle);
        a2.setStyle(mediaStyle);
    }

    @Override // androidx.core.app.e.g
    public RemoteViews h(d dVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return m();
    }

    @Override // androidx.core.app.e.g
    public RemoteViews i(d dVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return n();
    }

    Notification.MediaStyle l(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.f293e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.e());
        }
        return mediaStyle;
    }

    RemoteViews m() {
        int min = Math.min(this.f182a.f177b.size(), 5);
        RemoteViews c2 = c(false, p(min), false);
        c2.removeAllViews(i.d_res_0x7f050040);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                c2.addView(i.d_res_0x7f050040, o(this.f182a.f177b.get(i)));
            }
        }
        if (this.g) {
            int i2 = i.b_res_0x7f05002b;
            c2.setViewVisibility(i2, 0);
            c2.setInt(i2, "setAlpha", this.f182a.f176a.getResources().getInteger(j.a_res_0x7f060000));
            c2.setOnClickPendingIntent(i2, this.h);
        } else {
            c2.setViewVisibility(i.b_res_0x7f05002b, 8);
        }
        return c2;
    }

    RemoteViews n() {
        RemoteViews c2 = c(false, q(), true);
        int size = this.f182a.f177b.size();
        int[] iArr = this.f293e;
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        c2.removeAllViews(i.d_res_0x7f050040);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                if (i >= size) {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i), Integer.valueOf(size - 1)));
                }
                c2.addView(i.d_res_0x7f050040, o(this.f182a.f177b.get(this.f293e[i])));
            }
        }
        if (this.g) {
            c2.setViewVisibility(i.c_res_0x7f050034, 8);
            int i2 = i.b_res_0x7f05002b;
            c2.setViewVisibility(i2, 0);
            c2.setOnClickPendingIntent(i2, this.h);
            c2.setInt(i2, "setAlpha", this.f182a.f176a.getResources().getInteger(j.a_res_0x7f060000));
        } else {
            c2.setViewVisibility(i.c_res_0x7f050034, 0);
            c2.setViewVisibility(i.b_res_0x7f05002b, 8);
        }
        return c2;
    }

    int p(int i) {
        return i <= 3 ? k.f291c : k.f290b;
    }

    int q() {
        return k.f292d;
    }

    public a r(MediaSessionCompat.Token token) {
        this.f = token;
        return this;
    }

    public a s(int... iArr) {
        this.f293e = iArr;
        return this;
    }

    public a t(boolean z) {
        if (Build.VERSION.SDK_INT < 21) {
            this.g = z;
        }
        return this;
    }
}
