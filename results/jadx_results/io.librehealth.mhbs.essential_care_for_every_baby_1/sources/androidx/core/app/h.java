package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.a;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d */
    private static String f195d;
    private static d g;

    /* renamed from: a */
    private final Context f197a;

    /* renamed from: b */
    private final NotificationManager f198b;

    /* renamed from: c */
    private static final Object f194c = new Object();

    /* renamed from: e */
    private static Set<String> f196e = new HashSet();
    private static final Object f = new Object();

    /* loaded from: classes.dex */
    public static class a implements e {

        /* renamed from: a */
        final String f199a;

        /* renamed from: b */
        final int f200b;

        /* renamed from: c */
        final String f201c;

        /* renamed from: d */
        final boolean f202d;

        a(String str) {
            this.f199a = str;
            this.f200b = 0;
            this.f201c = null;
            this.f202d = true;
        }

        a(String str, int i, String str2) {
            this.f199a = str;
            this.f200b = i;
            this.f201c = str2;
            this.f202d = false;
        }

        @Override // androidx.core.app.h.e
        public void a(android.support.v4.app.a aVar) {
            if (this.f202d) {
                aVar.g(this.f199a);
            } else {
                aVar.K(this.f199a, this.f200b, this.f201c);
            }
        }

        public String toString() {
            return "CancelTask[packageName:" + this.f199a + ", id:" + this.f200b + ", tag:" + this.f201c + ", all:" + this.f202d + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements e {

        /* renamed from: a */
        final String f203a;

        /* renamed from: b */
        final int f204b;

        /* renamed from: c */
        final String f205c;

        /* renamed from: d */
        final Notification f206d;

        b(String str, int i, String str2, Notification notification) {
            this.f203a = str;
            this.f204b = i;
            this.f205c = str2;
            this.f206d = notification;
        }

        @Override // androidx.core.app.h.e
        public void a(android.support.v4.app.a aVar) {
            aVar.A(this.f203a, this.f204b, this.f205c, this.f206d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f203a + ", id:" + this.f204b + ", tag:" + this.f205c + "]";
        }
    }

    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a */
        final ComponentName f207a;

        /* renamed from: b */
        final IBinder f208b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f207a = componentName;
            this.f208b = iBinder;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Handler.Callback, ServiceConnection {

        /* renamed from: a */
        private final Context f209a;

        /* renamed from: b */
        private final HandlerThread f210b;

        /* renamed from: c */
        private final Handler f211c;

        /* renamed from: d */
        private final Map<ComponentName, a> f212d = new HashMap();

        /* renamed from: e */
        private Set<String> f213e = new HashSet();

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            final ComponentName f214a;

            /* renamed from: c */
            android.support.v4.app.a f216c;

            /* renamed from: b */
            boolean f215b = false;

            /* renamed from: d */
            ArrayDeque<e> f217d = new ArrayDeque<>();

            /* renamed from: e */
            int f218e = 0;

            a(ComponentName componentName) {
                this.f214a = componentName;
            }
        }

        d(Context context) {
            this.f209a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f210b = handlerThread;
            handlerThread.start();
            this.f211c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f215b) {
                return true;
            }
            boolean bindService = this.f209a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f214a), this, 33);
            aVar.f215b = bindService;
            if (bindService) {
                aVar.f218e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f214a);
                this.f209a.unbindService(this);
            }
            return aVar.f215b;
        }

        private void b(a aVar) {
            if (aVar.f215b) {
                this.f209a.unbindService(this);
                aVar.f215b = false;
            }
            aVar.f216c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.f212d.values()) {
                aVar.f217d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f212d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f212d.get(componentName);
            if (aVar != null) {
                aVar.f216c = a.AbstractBinderC0003a.n0(iBinder);
                aVar.f218e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f212d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f214a + ", " + aVar.f217d.size() + " queued tasks");
            }
            if (aVar.f217d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f216c == null) {
                i(aVar);
                return;
            }
            while (true) {
                e peek = aVar.f217d.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + peek);
                    }
                    peek.a(aVar.f216c);
                    aVar.f217d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f214a);
                    }
                } catch (RemoteException e2) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f214a, e2);
                }
            }
            if (aVar.f217d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f211c.hasMessages(3, aVar.f214a)) {
                return;
            }
            int i = aVar.f218e + 1;
            aVar.f218e = i;
            if (i <= 6) {
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i2 + " ms");
                }
                this.f211c.sendMessageDelayed(this.f211c.obtainMessage(3, aVar.f214a), i2);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f217d.size() + " tasks to " + aVar.f214a + " after " + aVar.f218e + " retries");
            aVar.f217d.clear();
        }

        private void j() {
            Set<String> f = h.f(this.f209a);
            if (f.equals(this.f213e)) {
                return;
            }
            this.f213e = f;
            List<ResolveInfo> queryIntentServices = this.f209a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (f.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f212d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f212d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f212d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(e eVar) {
            this.f211c.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c((e) message.obj);
                return true;
            } else if (i == 1) {
                c cVar = (c) message.obj;
                e(cVar.f207a, cVar.f208b);
                return true;
            } else if (i == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f211c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f211c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(android.support.v4.app.a aVar);
    }

    private h(Context context) {
        this.f197a = context;
        this.f198b = (NotificationManager) context.getSystemService("notification");
    }

    public static h e(Context context) {
        return new h(context);
    }

    public static Set<String> f(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f194c) {
            if (string != null) {
                if (!string.equals(f195d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f196e = hashSet;
                    f195d = string;
                }
            }
            set = f196e;
        }
        return set;
    }

    private void i(e eVar) {
        synchronized (f) {
            if (g == null) {
                g = new d(this.f197a.getApplicationContext());
            }
            g.h(eVar);
        }
    }

    private static boolean j(Notification notification) {
        Bundle a2 = androidx.core.app.e.a(notification);
        return a2 != null && a2.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.f198b.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f197a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f197a.getApplicationInfo();
        String packageName = this.f197a.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i) {
        c(null, i);
    }

    public void c(String str, int i) {
        this.f198b.cancel(str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            i(new a(this.f197a.getPackageName(), i, str));
        }
    }

    public void d() {
        this.f198b.cancelAll();
        if (Build.VERSION.SDK_INT <= 19) {
            i(new a(this.f197a.getPackageName()));
        }
    }

    public NotificationChannel g(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f198b.getNotificationChannel(str);
        }
        return null;
    }

    public void h(String str, int i, Notification notification) {
        if (!j(notification)) {
            this.f198b.notify(str, i, notification);
            return;
        }
        i(new b(this.f197a.getPackageName(), i, str, notification));
        this.f198b.cancel(str, i);
    }
}
