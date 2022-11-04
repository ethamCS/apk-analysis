package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.e;
import java.util.HashMap;
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: b */
    int f1829b = 0;

    /* renamed from: c */
    final HashMap<Integer, String> f1830c = new HashMap<>();

    /* renamed from: d */
    final RemoteCallbackList<d> f1831d = new a();

    /* renamed from: e */
    private final e.a f1832e = new b();

    /* loaded from: classes.dex */
    class a extends RemoteCallbackList<d> {
        a() {
            MultiInstanceInvalidationService.this = r1;
        }

        /* renamed from: a */
        public void onCallbackDied(d dVar, Object obj) {
            MultiInstanceInvalidationService.this.f1830c.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    class b extends e.a {
        b() {
            MultiInstanceInvalidationService.this = r1;
        }

        @Override // androidx.room.e
        public int f(d dVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f1831d) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f1829b + 1;
                multiInstanceInvalidationService.f1829b = i;
                if (multiInstanceInvalidationService.f1831d.register(dVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f1830c.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f1829b--;
                return 0;
            }
        }

        @Override // androidx.room.e
        public void j(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f1831d) {
                String str = MultiInstanceInvalidationService.this.f1830c.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f1831d.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.f1831d.getBroadcastCookie(i2)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.f1830c.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.f1831d.getBroadcastItem(i2).l(strArr);
                        } catch (RemoteException e2) {
                            Log.w("ROOM", "Error invoking a remote callback", e2);
                        }
                    }
                }
                MultiInstanceInvalidationService.this.f1831d.finishBroadcast();
            }
        }

        @Override // androidx.room.e
        public void o(d dVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.f1831d) {
                MultiInstanceInvalidationService.this.f1831d.unregister(dVar);
                MultiInstanceInvalidationService.this.f1830c.remove(Integer.valueOf(i));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f1832e;
    }
}
