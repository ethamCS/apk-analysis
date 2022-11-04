package io.ktor.utils.io.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010\u0017J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001aJ\r\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"¨\u0006%"}, d2 = {"Lio/ktor/utils/io/internal/i;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "remaining", "update", "n", BuildConfig.FLAVOR, "b", "(III)Ljava/lang/Void;", "pending", "d", "(II)Ljava/lang/Void;", "Ltb/e0;", "j", "()V", "i", BuildConfig.FLAVOR, "m", "(I)Z", "l", "(I)I", "o", "a", "(I)V", "c", "e", "()Z", "k", "f", "g", "h", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "I", "totalCapacity", "<init>", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12905b = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availableForRead$internal");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12906c = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availableForWrite$internal");

    /* renamed from: d */
    static final /* synthetic */ AtomicIntegerFieldUpdater f12907d = AtomicIntegerFieldUpdater.newUpdater(i.class, "_pendingToFlush");
    public volatile /* synthetic */ int _availableForWrite$internal;

    /* renamed from: a */
    private final int f12908a;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    volatile /* synthetic */ int _pendingToFlush = 0;

    public i(int i10) {
        this.f12908a = i10;
        this._availableForWrite$internal = i10;
    }

    private final Void b(int i10, int i11, int i12) {
        throw new IllegalArgumentException("Completed read overflow: " + i10 + " + " + i12 + " = " + i11 + " > " + this.f12908a);
    }

    private final Void d(int i10, int i11) {
        throw new IllegalArgumentException("Complete write overflow: " + i10 + " + " + i11 + " > " + this.f12908a);
    }

    public final void a(int i10) {
        int i11;
        int i12;
        do {
            i11 = this._availableForWrite$internal;
            i12 = i11 + i10;
            if (i12 > this.f12908a) {
                b(i11, i12, i10);
                throw new tb.i();
            }
        } while (!f12906c.compareAndSet(this, i11, i12));
    }

    public final void c(int i10) {
        int i11;
        int i12;
        do {
            i11 = this._pendingToFlush;
            i12 = i11 + i10;
            if (i12 > this.f12908a) {
                d(i11, i10);
                throw new tb.i();
            }
        } while (!f12907d.compareAndSet(this, i11, i12));
    }

    public final boolean e() {
        int andSet = f12907d.getAndSet(this, 0);
        return andSet == 0 ? this._availableForRead$internal > 0 : f12905b.addAndGet(this, andSet) > 0;
    }

    public final void f() {
        f12906c.getAndSet(this, 0);
    }

    public final boolean g() {
        return this._availableForWrite$internal == this.f12908a;
    }

    public final boolean h() {
        return this._availableForWrite$internal == 0;
    }

    public final void i() {
        this._availableForRead$internal = this.f12908a;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final void j() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.f12908a;
    }

    public final boolean k() {
        int i10;
        do {
            i10 = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i10 != this.f12908a) {
                return false;
            }
        } while (!f12906c.compareAndSet(this, i10, 0));
        return true;
    }

    public final int l(int i10) {
        int i11;
        int min;
        do {
            i11 = this._availableForRead$internal;
            min = Math.min(i10, i11);
            if (min == 0) {
                return 0;
            }
        } while (!f12905b.compareAndSet(this, i11, i11 - min));
        return Math.min(i10, i11);
    }

    public final boolean m(int i10) {
        int i11;
        do {
            i11 = this._availableForRead$internal;
            if (i11 < i10) {
                return false;
            }
        } while (!f12905b.compareAndSet(this, i11, i11 - i10));
        return true;
    }

    public final int n(int i10) {
        int i11;
        do {
            i11 = this._availableForWrite$internal;
            if (i11 < i10) {
                return 0;
            }
        } while (!f12906c.compareAndSet(this, i11, 0));
        return i11;
    }

    public final int o(int i10) {
        int i11;
        int min;
        do {
            i11 = this._availableForWrite$internal;
            min = Math.min(i10, i11);
            if (min == 0) {
                return 0;
            }
        } while (!f12906c.compareAndSet(this, i11, i11 - min));
        return Math.min(i10, i11);
    }

    public String toString() {
        return "RingBufferCapacity[read: " + this._availableForRead$internal + ", write: " + this._availableForWrite$internal + ", flush: " + this._pendingToFlush + ", capacity: " + this.f12908a + ']';
    }
}
