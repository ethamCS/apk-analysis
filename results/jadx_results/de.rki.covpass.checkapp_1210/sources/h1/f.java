package h1;

import android.os.CancellationSignal;
import androidx.room.i0;
import gc.p;
import hc.v;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.q;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.t1;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.s;
import tb.t;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lh1/f;", BuildConfig.FLAVOR, "a", "room-ktx_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class f {
    public static final a Companion = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ?\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lh1/f$a;", BuildConfig.FLAVOR, "R", "Landroidx/room/i0;", "db", BuildConfig.FLAVOR, "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "b", "(Landroidx/room/i0;ZLjava/util/concurrent/Callable;Lxb/d;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "a", "(Landroidx/room/i0;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lxb/d;)Ljava/lang/Object;", "<init>", "()V", "room-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/q0;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @zb.f(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
        /* renamed from: h1.f$a$a */
        /* loaded from: classes.dex */
        public static final class C0165a extends zb.l implements p<q0, xb.d<? super R>, Object> {
            final /* synthetic */ Callable<R> U3;

            /* renamed from: y */
            int f11144y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0165a(Callable<R> callable, xb.d<? super C0165a> dVar) {
                super(2, dVar);
                this.U3 = callable;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                yb.d.c();
                if (this.f11144y == 0) {
                    t.b(obj);
                    return this.U3.call();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: d0 */
            public final Object u(q0 q0Var, xb.d<? super R> dVar) {
                return ((C0165a) j(q0Var, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                return new C0165a(this.U3, dVar);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class b extends v implements gc.l<Throwable, e0> {

            /* renamed from: c */
            final /* synthetic */ CancellationSignal f11145c;

            /* renamed from: d */
            final /* synthetic */ a2 f11146d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CancellationSignal cancellationSignal, a2 a2Var) {
                super(1);
                this.f11145c = cancellationSignal;
                this.f11146d = a2Var;
            }

            public final void b(Throwable th2) {
                m1.b.a(this.f11145c);
                a2.a.a(this.f11146d, null, 1, null);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
                b(th2);
                return e0.f22152a;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @zb.f(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends zb.l implements p<q0, xb.d<? super e0>, Object> {
            final /* synthetic */ Callable<R> U3;
            final /* synthetic */ kotlinx.coroutines.p<R> V3;

            /* renamed from: y */
            int f11147y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(Callable<R> callable, kotlinx.coroutines.p<? super R> pVar, xb.d<? super c> dVar) {
                super(2, dVar);
                this.U3 = callable;
                this.V3 = pVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                yb.d.c();
                if (this.f11147y == 0) {
                    t.b(obj);
                    try {
                        Object call = this.U3.call();
                        xb.d dVar = this.V3;
                        s.a aVar = s.Companion;
                        dVar.y(s.c(call));
                    } catch (Throwable th2) {
                        xb.d dVar2 = this.V3;
                        s.a aVar2 = s.Companion;
                        dVar2.y(s.c(t.a(th2)));
                    }
                    return e0.f22152a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: d0 */
            public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
                return ((c) j(q0Var, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                return new c(this.U3, this.V3, dVar);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fc.c
        public final <R> Object a(i0 i0Var, boolean z10, CancellationSignal cancellationSignal, Callable<R> callable, xb.d<? super R> dVar) {
            xb.e b10;
            xb.d b11;
            a2 d10;
            Object c10;
            if (!i0Var.y() || !i0Var.s()) {
                n nVar = (n) dVar.b().i(n.f11161x);
                if (nVar == null || (b10 = nVar.b()) == null) {
                    b10 = z10 ? androidx.room.i.b(i0Var) : androidx.room.i.a(i0Var);
                }
                xb.e eVar = b10;
                b11 = yb.c.b(dVar);
                q qVar = new q(b11, 1);
                qVar.z();
                d10 = kotlinx.coroutines.l.d(t1.f15571c, eVar, null, new c(callable, qVar, null), 2, null);
                qVar.N(new b(cancellationSignal, d10));
                Object s10 = qVar.s();
                c10 = yb.d.c();
                if (s10 == c10) {
                    zb.h.c(dVar);
                }
                return s10;
            }
            return callable.call();
        }

        @fc.c
        public final <R> Object b(i0 i0Var, boolean z10, Callable<R> callable, xb.d<? super R> dVar) {
            xb.e eVar;
            if (!i0Var.y() || !i0Var.s()) {
                n nVar = (n) dVar.b().i(n.f11161x);
                if (nVar == null || (eVar = nVar.b()) == null) {
                    eVar = z10 ? androidx.room.i.b(i0Var) : androidx.room.i.a(i0Var);
                }
                return kotlinx.coroutines.j.g(eVar, new C0165a(callable, null), dVar);
            }
            return callable.call();
        }
    }

    @fc.c
    public static final <R> Object a(i0 i0Var, boolean z10, CancellationSignal cancellationSignal, Callable<R> callable, xb.d<? super R> dVar) {
        return Companion.a(i0Var, z10, cancellationSignal, callable, dVar);
    }

    @fc.c
    public static final <R> Object b(i0 i0Var, boolean z10, Callable<R> callable, xb.d<? super R> dVar) {
        return Companion.b(i0Var, z10, callable, dVar);
    }
}
