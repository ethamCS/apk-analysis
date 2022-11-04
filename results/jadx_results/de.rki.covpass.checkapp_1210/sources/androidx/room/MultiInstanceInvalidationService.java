package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.m;
import java.util.HashMap;
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: c */
    int f4820c = 0;

    /* renamed from: d */
    final HashMap<Integer, String> f4821d = new HashMap<>();

    /* renamed from: q */
    final RemoteCallbackList<l> f4822q = new a();

    /* renamed from: x */
    private final m.a f4823x = new b();

    /* loaded from: classes.dex */
    class a extends RemoteCallbackList<l> {
        a() {
            MultiInstanceInvalidationService.this = r1;
        }

        /* renamed from: a */
        public void onCallbackDied(l lVar, Object obj) {
            MultiInstanceInvalidationService.this.f4821d.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    class b extends m.a {
        b() {
            MultiInstanceInvalidationService.this = r1;
        }

        @Override // androidx.room.m
        public int b(l lVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f4822q) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f4820c + 1;
                multiInstanceInvalidationService.f4820c = i10;
                if (multiInstanceInvalidationService.f4822q.register(lVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f4821d.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f4820c--;
                return 0;
            }
        }

        @Override // androidx.room.m
        public void c(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f4822q) {
                String str = MultiInstanceInvalidationService.this.f4821d.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f4822q.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.f4822q.getBroadcastCookie(i11)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.f4821d.get(Integer.valueOf(intValue));
                    if (i10 != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.f4822q.getBroadcastItem(i11).a(strArr);
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Error invoking a remote callback", e10);
                        }
                    }
                }
                MultiInstanceInvalidationService.this.f4822q.finishBroadcast();
            }
        }

        @Override // androidx.room.m
        public void d(l lVar, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f4822q) {
                MultiInstanceInvalidationService.this.f4822q.unregister(lVar);
                MultiInstanceInvalidationService.this.f4821d.remove(Integer.valueOf(i10));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4823x;
    }
}
