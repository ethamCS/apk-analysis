package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.e;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a */
    private final Notification.Builder f186a;

    /* renamed from: b */
    private final e.C0015e f187b;

    /* renamed from: c */
    private RemoteViews f188c;

    /* renamed from: d */
    private RemoteViews f189d;

    /* renamed from: e */
    private final List<Bundle> f190e = new ArrayList();
    private final Bundle f = new Bundle();
    private int g;
    private RemoteViews h;

    public f(e.C0015e c0015e) {
        ArrayList<String> arrayList;
        String str;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        this.f187b = c0015e;
        Context context = c0015e.f176a;
        this.f186a = i >= 26 ? new Notification.Builder(context, c0015e.J) : new Notification.Builder(context);
        Notification notification = c0015e.Q;
        this.f186a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, c0015e.h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c0015e.f179d).setContentText(c0015e.f180e).setContentInfo(c0015e.j).setContentIntent(c0015e.f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c0015e.g, (notification.flags & 128) != 0).setLargeIcon(c0015e.i).setNumber(c0015e.k).setProgress(c0015e.s, c0015e.t, c0015e.u);
        if (i < 21) {
            this.f186a.setSound(notification.sound, notification.audioStreamType);
        }
        if (i >= 16) {
            this.f186a.setSubText(c0015e.q).setUsesChronometer(c0015e.n).setPriority(c0015e.l);
            Iterator<e.a> it = c0015e.f177b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle2 = c0015e.C;
            if (bundle2 != null) {
                this.f.putAll(bundle2);
            }
            if (i < 20) {
                if (c0015e.y) {
                    this.f.putBoolean("android.support.localOnly", true);
                }
                String str2 = c0015e.v;
                if (str2 != null) {
                    this.f.putString("android.support.groupKey", str2);
                    if (c0015e.w) {
                        bundle = this.f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = c0015e.x;
                if (str3 != null) {
                    this.f.putString("android.support.sortKey", str3);
                }
            }
            this.f188c = c0015e.G;
            this.f189d = c0015e.H;
        }
        if (i >= 19) {
            this.f186a.setShowWhen(c0015e.m);
            if (i < 21 && (arrayList = c0015e.S) != null && !arrayList.isEmpty()) {
                Bundle bundle3 = this.f;
                ArrayList<String> arrayList2 = c0015e.S;
                bundle3.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (i >= 20) {
            this.f186a.setLocalOnly(c0015e.y).setGroup(c0015e.v).setGroupSummary(c0015e.w).setSortKey(c0015e.x);
            this.g = c0015e.N;
        }
        if (i >= 21) {
            this.f186a.setCategory(c0015e.B).setColor(c0015e.D).setVisibility(c0015e.E).setPublicVersion(c0015e.F).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = c0015e.S.iterator();
            while (it2.hasNext()) {
                this.f186a.addPerson(it2.next());
            }
            this.h = c0015e.I;
            if (c0015e.f178c.size() > 0) {
                Bundle bundle4 = c0015e.e().getBundle("android.car.EXTENSIONS");
                bundle4 = bundle4 == null ? new Bundle() : bundle4;
                Bundle bundle5 = new Bundle();
                for (int i2 = 0; i2 < c0015e.f178c.size(); i2++) {
                    bundle5.putBundle(Integer.toString(i2), g.b(c0015e.f178c.get(i2)));
                }
                bundle4.putBundle("invisible_actions", bundle5);
                c0015e.e().putBundle("android.car.EXTENSIONS", bundle4);
                this.f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (i >= 24) {
            this.f186a.setExtras(c0015e.C).setRemoteInputHistory(c0015e.r);
            RemoteViews remoteViews = c0015e.G;
            if (remoteViews != null) {
                this.f186a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = c0015e.H;
            if (remoteViews2 != null) {
                this.f186a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = c0015e.I;
            if (remoteViews3 != null) {
                this.f186a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i >= 26) {
            this.f186a.setBadgeIconType(c0015e.K).setShortcutId(c0015e.L).setTimeoutAfter(c0015e.M).setGroupAlertBehavior(c0015e.N);
            if (c0015e.A) {
                this.f186a.setColorized(c0015e.z);
            }
            if (!TextUtils.isEmpty(c0015e.J)) {
                this.f186a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i >= 29) {
            this.f186a.setAllowSystemGeneratedContextualActions(c0015e.O);
            this.f186a.setBubbleMetadata(e.d.b(c0015e.P));
        }
        if (c0015e.R) {
            if (this.f187b.w) {
                this.g = 2;
            } else {
                this.g = 1;
            }
            this.f186a.setVibrate(null);
            this.f186a.setSound(null);
            int i3 = notification.defaults & (-2);
            notification.defaults = i3;
            int i4 = i3 & (-3);
            notification.defaults = i4;
            this.f186a.setDefaults(i4);
            if (i < 26) {
                return;
            }
            if (TextUtils.isEmpty(this.f187b.v)) {
                this.f186a.setGroup("silent");
            }
            this.f186a.setGroupAlertBehavior(this.g);
        }
    }

    private void b(e.a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i < 20) {
            if (i < 16) {
                return;
            }
            this.f190e.add(g.f(this.f186a, aVar));
            return;
        }
        IconCompat f = aVar.f();
        Notification.Action.Builder builder = i >= 23 ? new Notification.Action.Builder(f != null ? f.s() : null, aVar.j(), aVar.a()) : new Notification.Action.Builder(f != null ? f.e() : 0, aVar.j(), aVar.a());
        if (aVar.g() != null) {
            for (RemoteInput remoteInput : i.b(aVar.g())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        if (i >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.h());
        if (i >= 28) {
            builder.setSemanticAction(aVar.h());
        }
        if (i >= 29) {
            builder.setContextual(aVar.k());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.i());
        builder.addExtras(bundle);
        this.f186a.addAction(builder.build());
    }

    private void e(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }

    @Override // androidx.core.app.d
    public Notification.Builder a() {
        return this.f186a;
    }

    public Notification c() {
        Bundle a2;
        RemoteViews j;
        RemoteViews h;
        e.g gVar = this.f187b.p;
        if (gVar != null) {
            gVar.b(this);
        }
        RemoteViews i = gVar != null ? gVar.i(this) : null;
        Notification d2 = d();
        if (i != null || (i = this.f187b.G) != null) {
            d2.contentView = i;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 16 && gVar != null && (h = gVar.h(this)) != null) {
            d2.bigContentView = h;
        }
        if (i2 >= 21 && gVar != null && (j = this.f187b.p.j(this)) != null) {
            d2.headsUpContentView = j;
        }
        if (i2 >= 16 && gVar != null && (a2 = e.a(d2)) != null) {
            gVar.a(a2);
        }
        return d2;
    }

    protected Notification d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f186a.build();
        }
        if (i >= 24) {
            Notification build = this.f186a.build();
            if (this.g != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.g == 2) {
                    e(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.g == 1) {
                    e(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f186a.setExtras(this.f);
            Notification build2 = this.f186a.build();
            RemoteViews remoteViews = this.f188c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f189d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.g != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.g == 2) {
                    e(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.g == 1) {
                    e(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f186a.setExtras(this.f);
            Notification build3 = this.f186a.build();
            RemoteViews remoteViews4 = this.f188c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f189d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.g != 0) {
                if (build3.getGroup() != null && (build3.flags & 512) != 0 && this.g == 2) {
                    e(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.g == 1) {
                    e(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a2 = g.a(this.f190e);
            if (a2 != null) {
                this.f.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            this.f186a.setExtras(this.f);
            Notification build4 = this.f186a.build();
            RemoteViews remoteViews6 = this.f188c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f189d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f186a.getNotification();
        } else {
            Notification build5 = this.f186a.build();
            Bundle a3 = e.a(build5);
            Bundle bundle = new Bundle(this.f);
            for (String str : this.f.keySet()) {
                if (a3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a3.putAll(bundle);
            SparseArray<Bundle> a4 = g.a(this.f190e);
            if (a4 != null) {
                e.a(build5).putSparseParcelableArray("android.support.actionExtras", a4);
            }
            RemoteViews remoteViews8 = this.f188c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f189d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
