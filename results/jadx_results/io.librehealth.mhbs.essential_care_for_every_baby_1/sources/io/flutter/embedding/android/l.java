package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: c */
    private static l f914c;

    /* renamed from: a */
    private final LongSparseArray<MotionEvent> f915a = new LongSparseArray<>();

    /* renamed from: b */
    private final PriorityQueue<Long> f916b = new PriorityQueue<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: b */
        private static final AtomicLong f917b = new AtomicLong(0);

        /* renamed from: a */
        private final long f918a;

        private a(long j) {
            this.f918a = j;
        }

        public static a b() {
            return c(f917b.incrementAndGet());
        }

        public static a c(long j) {
            return new a(j);
        }

        public long d() {
            return this.f918a;
        }
    }

    private l() {
    }

    public static l a() {
        if (f914c == null) {
            f914c = new l();
        }
        return f914c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f916b.isEmpty() && this.f916b.peek().longValue() < aVar.f918a) {
            this.f915a.remove(this.f916b.poll().longValue());
        }
        if (!this.f916b.isEmpty() && this.f916b.peek().longValue() == aVar.f918a) {
            this.f916b.poll();
        }
        MotionEvent motionEvent = this.f915a.get(aVar.f918a);
        this.f915a.remove(aVar.f918a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a b2 = a.b();
        this.f915a.put(b2.f918a, MotionEvent.obtain(motionEvent));
        this.f916b.add(Long.valueOf(b2.f918a));
        return b2;
    }
}
