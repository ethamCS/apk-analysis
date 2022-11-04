package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.i;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class j implements h {

    /* renamed from: a */
    private final Notification.Builder f915a;

    /* renamed from: b */
    private final i.c f916b;

    /* renamed from: c */
    private RemoteViews f917c;

    /* renamed from: d */
    private RemoteViews f918d;

    /* renamed from: e */
    private final List<Bundle> f919e = new ArrayList();

    /* renamed from: f */
    private final Bundle f920f = new Bundle();

    /* renamed from: g */
    private int f921g;

    /* renamed from: h */
    private RemoteViews f922h;

    public j(i.c cVar) {
        ArrayList<String> arrayList;
        String str;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        this.f916b = cVar;
        Context context = cVar.f907a;
        this.f915a = i >= 26 ? new Notification.Builder(context, cVar.I) : new Notification.Builder(context);
        Notification notification = cVar.P;
        this.f915a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, cVar.f914h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(cVar.f910d).setContentText(cVar.f911e).setContentInfo(cVar.j).setContentIntent(cVar.f912f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(cVar.f913g, (notification.flags & 128) != 0).setLargeIcon(cVar.i).setNumber(cVar.k).setProgress(cVar.r, cVar.s, cVar.t);
        if (i < 21) {
            this.f915a.setSound(notification.sound, notification.audioStreamType);
        }
        if (i >= 16) {
            this.f915a.setSubText(cVar.p).setUsesChronometer(cVar.n).setPriority(cVar.l);
            Iterator<i.a> it = cVar.f908b.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            Bundle bundle2 = cVar.B;
            if (bundle2 != null) {
                this.f920f.putAll(bundle2);
            }
            if (i < 20) {
                if (cVar.x) {
                    this.f920f.putBoolean("android.support.localOnly", true);
                }
                String str2 = cVar.u;
                if (str2 != null) {
                    this.f920f.putString("android.support.groupKey", str2);
                    if (cVar.v) {
                        bundle = this.f920f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f920f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = cVar.w;
                if (str3 != null) {
                    this.f920f.putString("android.support.sortKey", str3);
                }
            }
            this.f917c = cVar.F;
            this.f918d = cVar.G;
        }
        if (i >= 19) {
            this.f915a.setShowWhen(cVar.m);
            if (i < 21 && (arrayList = cVar.R) != null && !arrayList.isEmpty()) {
                Bundle bundle3 = this.f920f;
                ArrayList<String> arrayList2 = cVar.R;
                bundle3.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (i >= 20) {
            this.f915a.setLocalOnly(cVar.x).setGroup(cVar.u).setGroupSummary(cVar.v).setSortKey(cVar.w);
            this.f921g = cVar.M;
        }
        if (i >= 21) {
            this.f915a.setCategory(cVar.A).setColor(cVar.C).setVisibility(cVar.D).setPublicVersion(cVar.E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = cVar.R.iterator();
            while (it2.hasNext()) {
                this.f915a.addPerson(it2.next());
            }
            this.f922h = cVar.H;
            if (cVar.f909c.size() > 0) {
                Bundle bundle4 = cVar.b().getBundle("android.car.EXTENSIONS");
                bundle4 = bundle4 == null ? new Bundle() : bundle4;
                Bundle bundle5 = new Bundle();
                for (int i2 = 0; i2 < cVar.f909c.size(); i2++) {
                    bundle5.putBundle(Integer.toString(i2), k.b(cVar.f909c.get(i2)));
                }
                bundle4.putBundle("invisible_actions", bundle5);
                cVar.b().putBundle("android.car.EXTENSIONS", bundle4);
                this.f920f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (i >= 24) {
            this.f915a.setExtras(cVar.B).setRemoteInputHistory(cVar.q);
            RemoteViews remoteViews = cVar.F;
            if (remoteViews != null) {
                this.f915a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = cVar.G;
            if (remoteViews2 != null) {
                this.f915a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = cVar.H;
            if (remoteViews3 != null) {
                this.f915a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i >= 26) {
            this.f915a.setBadgeIconType(cVar.J).setShortcutId(cVar.K).setTimeoutAfter(cVar.L).setGroupAlertBehavior(cVar.M);
            if (cVar.z) {
                this.f915a.setColorized(cVar.y);
            }
            if (!TextUtils.isEmpty(cVar.I)) {
                this.f915a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i >= 29) {
            this.f915a.setAllowSystemGeneratedContextualActions(cVar.N);
            this.f915a.setBubbleMetadata(i.b.b(cVar.O));
        }
        if (cVar.Q) {
            if (this.f916b.v) {
                this.f921g = 2;
            } else {
                this.f921g = 1;
            }
            this.f915a.setVibrate(null);
            this.f915a.setSound(null);
            int i3 = notification.defaults & (-2);
            notification.defaults = i3;
            int i4 = i3 & (-3);
            notification.defaults = i4;
            this.f915a.setDefaults(i4);
            if (i < 26) {
                return;
            }
            if (TextUtils.isEmpty(this.f916b.u)) {
                this.f915a.setGroup("silent");
            }
            this.f915a.setGroupAlertBehavior(this.f921g);
        }
    }

    private void a(i.a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i < 20) {
            if (i < 16) {
                return;
            }
            this.f919e.add(k.f(this.f915a, aVar));
            return;
        }
        IconCompat e2 = aVar.e();
        Notification.Action.Builder builder = i >= 23 ? new Notification.Action.Builder(e2 != null ? e2.l() : null, aVar.i(), aVar.a()) : new Notification.Action.Builder(e2 != null ? e2.c() : 0, aVar.i(), aVar.a());
        if (aVar.f() != null) {
            for (RemoteInput remoteInput : l.b(aVar.f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        if (i >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.g());
        if (i >= 28) {
            builder.setSemanticAction(aVar.g());
        }
        if (i >= 29) {
            builder.setContextual(aVar.j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
        builder.addExtras(bundle);
        this.f915a.addAction(builder.build());
    }

    private void d(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }

    public Notification b() {
        Bundle a2;
        RemoteViews e2;
        RemoteViews c2;
        i.d dVar = this.f916b.o;
        if (dVar != null) {
            dVar.b(this);
        }
        RemoteViews d2 = dVar != null ? dVar.d(this) : null;
        Notification c3 = c();
        if (d2 != null || (d2 = this.f916b.F) != null) {
            c3.contentView = d2;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 16 && dVar != null && (c2 = dVar.c(this)) != null) {
            c3.bigContentView = c2;
        }
        if (i >= 21 && dVar != null && (e2 = this.f916b.o.e(this)) != null) {
            c3.headsUpContentView = e2;
        }
        if (i >= 16 && dVar != null && (a2 = i.a(c3)) != null) {
            dVar.a(a2);
        }
        return c3;
    }

    protected Notification c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f915a.build();
        }
        if (i >= 24) {
            Notification build = this.f915a.build();
            if (this.f921g != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.f921g == 2) {
                    d(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f921g == 1) {
                    d(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f915a.setExtras(this.f920f);
            Notification build2 = this.f915a.build();
            RemoteViews remoteViews = this.f917c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f918d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f922h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f921g != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.f921g == 2) {
                    d(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f921g == 1) {
                    d(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f915a.setExtras(this.f920f);
            Notification build3 = this.f915a.build();
            RemoteViews remoteViews4 = this.f917c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f918d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f921g != 0) {
                if (build3.getGroup() != null && (build3.flags & 512) != 0 && this.f921g == 2) {
                    d(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f921g == 1) {
                    d(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a2 = k.a(this.f919e);
            if (a2 != null) {
                this.f920f.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            this.f915a.setExtras(this.f920f);
            Notification build4 = this.f915a.build();
            RemoteViews remoteViews6 = this.f917c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f918d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f915a.getNotification();
        } else {
            Notification build5 = this.f915a.build();
            Bundle a3 = i.a(build5);
            Bundle bundle = new Bundle(this.f920f);
            for (String str : this.f920f.keySet()) {
                if (a3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a3.putAll(bundle);
            SparseArray<Bundle> a4 = k.a(this.f919e);
            if (a4 != null) {
                i.a(build5).putSparseParcelableArray("android.support.actionExtras", a4);
            }
            RemoteViews remoteViews8 = this.f917c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f918d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
