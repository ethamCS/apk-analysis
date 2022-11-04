package b.c.a;

import android.net.NetworkInfo;
import b.c.a.d0;
import b.c.a.s;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class u extends ThreadPoolExecutor {

    /* loaded from: classes.dex */
    private static final class a extends FutureTask<c> implements Comparable<a> {

        /* renamed from: b */
        private final c f1334b;

        public a(c cVar) {
            super(cVar, null);
            this.f1334b = cVar;
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            s.f j = this.f1334b.j();
            s.f j2 = aVar.f1334b.j();
            return j == j2 ? this.f1334b.f1276b - aVar.f1334b.f1276b : j2.ordinal() - j.ordinal();
        }
    }

    public u() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d0.e());
    }

    private void a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(NetworkInfo networkInfo) {
        int i;
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            a(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                i = 4;
                a(i);
            }
            a(3);
            return;
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                a(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                    default:
                        a(3);
                        return;
                }
        }
        i = 2;
        a(i);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}
