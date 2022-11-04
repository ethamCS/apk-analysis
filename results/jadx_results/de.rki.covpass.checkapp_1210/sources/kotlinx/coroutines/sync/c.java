package kotlinx.coroutines.sync;

import gc.l;
import hc.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.p;
import kotlinx.coroutines.r;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00010\u0002:\u0004\u000b\b\n\u0005B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/sync/c;", "Lkotlinx/coroutines/sync/b;", BuildConfig.FLAVOR, "owner", "Ltb/e0;", "d", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "b", "(Ljava/lang/Object;)Z", "c", "a", "(Ljava/lang/Object;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "locked", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c implements kotlinx.coroutines.sync.b {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f15556a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/sync/c$a;", "Lkotlinx/coroutines/sync/c$b;", "Lkotlinx/coroutines/sync/c;", BuildConfig.FLAVOR, "I", "Ltb/e0;", "G", BuildConfig.FLAVOR, "toString", "Lkotlinx/coroutines/p;", "V3", "Lkotlinx/coroutines/p;", "cont", BuildConfig.FLAVOR, "owner", "<init>", "(Lkotlinx/coroutines/sync/c;Ljava/lang/Object;Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class a extends b {
        private final p<e0> V3;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.sync.c$a$a */
        /* loaded from: classes3.dex */
        static final class C0233a extends v implements l<Throwable, e0> {

            /* renamed from: c */
            final /* synthetic */ c f15557c;

            /* renamed from: d */
            final /* synthetic */ a f15558d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0233a(c cVar, a aVar) {
                super(1);
                this.f15557c = cVar;
                this.f15558d = aVar;
            }

            public final void b(Throwable th2) {
                this.f15557c.a(this.f15558d.f15559x);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
                b(th2);
                return e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, p<? super e0> pVar) {
            super(obj);
            c.this = r1;
            this.V3 = pVar;
        }

        @Override // kotlinx.coroutines.sync.c.b
        public void G() {
            this.V3.c0(r.f15503a);
        }

        @Override // kotlinx.coroutines.sync.c.b
        public boolean I() {
            return H() && this.V3.A(e0.f22152a, null, new C0233a(c.this, this)) != null;
        }

        @Override // kotlinx.coroutines.internal.o
        public String toString() {
            return "LockCont[" + this.f15559x + ", " + this.V3 + "] for " + c.this;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/sync/c$b;", "Lkotlinx/coroutines/internal/o;", "Lkotlinx/coroutines/h1;", BuildConfig.FLAVOR, "H", "()Z", "Ltb/e0;", "g", "()V", "I", "G", BuildConfig.FLAVOR, "x", "Ljava/lang/Object;", "owner", "<init>", "(Lkotlinx/coroutines/sync/c;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public abstract class b extends o implements h1 {
        private static final /* synthetic */ AtomicIntegerFieldUpdater U3 = AtomicIntegerFieldUpdater.newUpdater(b.class, "isTaken");
        private volatile /* synthetic */ int isTaken = 0;

        /* renamed from: x */
        public final Object f15559x;

        public b(Object obj) {
            c.this = r1;
            this.f15559x = obj;
        }

        public abstract void G();

        public final boolean H() {
            return U3.compareAndSet(this, 0, 1);
        }

        public abstract boolean I();

        @Override // kotlinx.coroutines.h1
        public final void g() {
            B();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/sync/c$c;", "Lkotlinx/coroutines/internal/m;", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "owner", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.c$c */
    /* loaded from: classes3.dex */
    public static final class C0234c extends m {
        public volatile Object owner;

        public C0234c(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.o
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/sync/c$d;", "Lkotlinx/coroutines/internal/c;", "Lkotlinx/coroutines/sync/c;", "affected", BuildConfig.FLAVOR, "i", "failure", "Ltb/e0;", "h", "Lkotlinx/coroutines/sync/c$c;", "b", "Lkotlinx/coroutines/sync/c$c;", "queue", "<init>", "(Lkotlinx/coroutines/sync/c$c;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class d extends kotlinx.coroutines.internal.c<c> {

        /* renamed from: b */
        public final C0234c f15561b;

        public d(C0234c c0234c) {
            this.f15561b = c0234c;
        }

        /* renamed from: h */
        public void d(c cVar, Object obj) {
            androidx.concurrent.futures.b.a(c.f15556a, cVar, this, obj == null ? kotlinx.coroutines.sync.d.f15569f : this.f15561b);
        }

        /* renamed from: i */
        public Object g(c cVar) {
            b0 b0Var;
            if (this.f15561b.G()) {
                return null;
            }
            b0Var = kotlinx.coroutines.sync.d.f15565b;
            return b0Var;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class e extends v implements l<Throwable, e0> {

        /* renamed from: d */
        final /* synthetic */ Object f15563d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj) {
            super(1);
            c.this = r1;
            this.f15563d = obj;
        }

        public final void b(Throwable th2) {
            c.this.a(this.f15563d);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
            b(th2);
            return e0.f22152a;
        }
    }

    public c(boolean z10) {
        this._state = z10 ? kotlinx.coroutines.sync.d.f15568e : kotlinx.coroutines.sync.d.f15569f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
        kotlinx.coroutines.s.c(r0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r7, xb.d<? super tb.e0> r8) {
        /*
            r6 = this;
            xb.d r0 = yb.b.b(r8)
            kotlinx.coroutines.q r0 = kotlinx.coroutines.s.b(r0)
            kotlinx.coroutines.sync.c$a r1 = new kotlinx.coroutines.sync.c$a
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.a
            if (r3 == 0) goto L4a
            r3 = r2
            kotlinx.coroutines.sync.a r3 = (kotlinx.coroutines.sync.a) r3
            java.lang.Object r4 = r3.f15555a
            kotlinx.coroutines.internal.b0 r5 = kotlinx.coroutines.sync.d.f()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.c.f15556a
            kotlinx.coroutines.sync.c$c r5 = new kotlinx.coroutines.sync.c$c
            java.lang.Object r3 = r3.f15555a
            r5.<init>(r3)
            androidx.concurrent.futures.b.a(r4, r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            kotlinx.coroutines.sync.a r3 = kotlinx.coroutines.sync.d.c()
            goto L37
        L32:
            kotlinx.coroutines.sync.a r3 = new kotlinx.coroutines.sync.a
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.c.f15556a
            boolean r2 = androidx.concurrent.futures.b.a(r4, r6, r2, r3)
            if (r2 == 0) goto Ld
            tb.e0 r1 = tb.e0.f22152a
            kotlinx.coroutines.sync.c$e r2 = new kotlinx.coroutines.sync.c$e
            r2.<init>(r7)
            r0.I(r1, r2)
            goto L71
        L4a:
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.c.C0234c
            if (r3 == 0) goto La3
            r3 = r2
            kotlinx.coroutines.sync.c$c r3 = (kotlinx.coroutines.sync.c.C0234c) r3
            java.lang.Object r4 = r3.owner
            if (r4 == r7) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L88
            r3.l(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L6e
            boolean r2 = r1.H()
            if (r2 != 0) goto L68
            goto L6e
        L68:
            kotlinx.coroutines.sync.c$a r1 = new kotlinx.coroutines.sync.c$a
            r1.<init>(r7, r0)
            goto Ld
        L6e:
            kotlinx.coroutines.s.c(r0, r1)
        L71:
            java.lang.Object r7 = r0.s()
            java.lang.Object r0 = yb.b.c()
            if (r7 != r0) goto L7e
            zb.h.c(r8)
        L7e:
            java.lang.Object r8 = yb.b.c()
            if (r7 != r8) goto L85
            return r7
        L85:
            tb.e0 r7 = tb.e0.f22152a
            return r7
        L88:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Already locked by "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        La3:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.w
            if (r3 == 0) goto Lae
            kotlinx.coroutines.internal.w r2 = (kotlinx.coroutines.internal.w) r2
            r2.c(r6)
            goto Ld
        Lae:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Illegal state "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.c.d(java.lang.Object, xb.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.sync.b
    public void a(Object obj) {
        kotlinx.coroutines.sync.a aVar;
        b0 b0Var;
        C0234c c0234c;
        while (true) {
            Object obj2 = this._state;
            boolean z10 = true;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) obj2;
                if (obj == null) {
                    Object obj3 = aVar2.f15555a;
                    b0Var = kotlinx.coroutines.sync.d.f15567d;
                    if (obj3 == b0Var) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    if (aVar2.f15555a != obj) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new IllegalStateException(("Mutex is locked by " + aVar2.f15555a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15556a;
                aVar = kotlinx.coroutines.sync.d.f15569f;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj2, aVar)) {
                    return;
                }
            } else if (obj2 instanceof w) {
                ((w) obj2).c(this);
            } else if (!(obj2 instanceof C0234c)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                if (obj != null) {
                    if (((C0234c) obj2).owner != obj) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new IllegalStateException(("Mutex is locked by " + c0234c.owner + " but expected " + obj).toString());
                    }
                }
                C0234c c0234c2 = (C0234c) obj2;
                o C = c0234c2.C();
                if (C == null) {
                    d dVar = new d(c0234c2);
                    if (androidx.concurrent.futures.b.a(f15556a, this, obj2, dVar) && dVar.c(this) == null) {
                        return;
                    }
                } else {
                    b bVar = (b) C;
                    if (bVar.I()) {
                        Object obj4 = bVar.f15559x;
                        if (obj4 == null) {
                            obj4 = kotlinx.coroutines.sync.d.f15566c;
                        }
                        c0234c2.owner = obj4;
                        bVar.G();
                        return;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.sync.b
    public boolean b(Object obj) {
        b0 b0Var;
        while (true) {
            Object obj2 = this._state;
            boolean z10 = true;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                Object obj3 = ((kotlinx.coroutines.sync.a) obj2).f15555a;
                b0Var = kotlinx.coroutines.sync.d.f15567d;
                if (obj3 != b0Var) {
                    return false;
                }
                if (androidx.concurrent.futures.b.a(f15556a, this, obj2, obj == null ? kotlinx.coroutines.sync.d.f15568e : new kotlinx.coroutines.sync.a(obj))) {
                    return true;
                }
            } else if (obj2 instanceof C0234c) {
                if (((C0234c) obj2).owner == obj) {
                    z10 = false;
                }
                if (z10) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (!(obj2 instanceof w)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                ((w) obj2).c(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.b
    public Object c(Object obj, xb.d<? super e0> dVar) {
        Object c10;
        if (b(obj)) {
            return e0.f22152a;
        }
        Object d10 = d(obj, dVar);
        c10 = yb.d.c();
        return d10 == c10 ? d10 : e0.f22152a;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                sb2 = new StringBuilder();
                sb2.append("Mutex[");
                obj = ((kotlinx.coroutines.sync.a) obj2).f15555a;
                break;
            } else if (obj2 instanceof w) {
                ((w) obj2).c(this);
            } else if (!(obj2 instanceof C0234c)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                sb2 = new StringBuilder();
                sb2.append("Mutex[");
                obj = ((C0234c) obj2).owner;
            }
        }
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
