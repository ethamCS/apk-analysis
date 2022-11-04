package b.d.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/* loaded from: classes.dex */
public final class a {
    private static final Object f = new Object();
    private static a g;

    /* renamed from: a */
    private final Context f361a;

    /* renamed from: b */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f362b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, ArrayList<c>> f363c = new HashMap<>();

    /* renamed from: d */
    private final ArrayList<b> f364d = new ArrayList<>();

    /* renamed from: e */
    private final Handler f365e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.d.a.a$a */
    /* loaded from: classes.dex */
    public class HandlerC0020a extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        HandlerC0020a(Looper looper) {
            super(looper);
            a.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final Intent f367a;

        /* renamed from: b */
        final ArrayList<c> f368b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f367a = intent;
            this.f368b = arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        final IntentFilter f369a;

        /* renamed from: b */
        final BroadcastReceiver f370b;

        /* renamed from: c */
        boolean f371c;

        /* renamed from: d */
        boolean f372d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f369a = intentFilter;
            this.f370b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f370b);
            sb.append(" filter=");
            sb.append(this.f369a);
            if (this.f372d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private a(Context context) {
        this.f361a = context;
        this.f365e = new HandlerC0020a(context.getMainLooper());
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f) {
            if (g == null) {
                g = new a(context.getApplicationContext());
            }
            aVar = g;
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f362b) {
                size = this.f364d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f364d.toArray(bVarArr);
                this.f364d.clear();
            }
            for (int i = 0; i < size; i++) {
                b bVar = bVarArr[i];
                int size2 = bVar.f368b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    c cVar = bVar.f368b.get(i2);
                    if (!cVar.f372d) {
                        cVar.f370b.onReceive(this.f361a, bVar.f367a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f362b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f362b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f362b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<c> arrayList2 = this.f363c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f363c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public boolean d(Intent intent) {
        String str;
        ArrayList<c> arrayList;
        String str2;
        int i;
        ArrayList arrayList2;
        synchronized (this.f362b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f361a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f363c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    c cVar = arrayList3.get(i2);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f369a);
                    }
                    if (cVar.f371c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i = i2;
                        arrayList = arrayList3;
                        str2 = action;
                        str = resolveTypeIfNeeded;
                        arrayList2 = arrayList4;
                    } else {
                        i = i2;
                        str2 = action;
                        arrayList2 = arrayList4;
                        arrayList = arrayList3;
                        str = resolveTypeIfNeeded;
                        int match = cVar.f369a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList2 == null ? new ArrayList() : arrayList2;
                            arrayList4.add(cVar);
                            cVar.f371c = true;
                            i2 = i + 1;
                            action = str2;
                            arrayList3 = arrayList;
                            resolveTypeIfNeeded = str;
                        } else if (z) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList2;
                    i2 = i + 1;
                    action = str2;
                    arrayList3 = arrayList;
                    resolveTypeIfNeeded = str;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((c) arrayList5.get(i3)).f371c = false;
                    }
                    this.f364d.add(new b(intent, arrayList5));
                    if (!this.f365e.hasMessages(1)) {
                        this.f365e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
