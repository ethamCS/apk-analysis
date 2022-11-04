package df;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.p;
import kotlinx.coroutines.u0;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u000589:;<B)\u0012 \u00105\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u000103j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`4¢\u0006\u0004\b6\u00107J!\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J \u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0016\u0010\u0013\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u001a\u001a\u00020\u000f2\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018J\u0019\u0010\u0001\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u0001\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000bH\u0014J/\u0010$\u001a\u00020\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"H\u0014ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0086\u0002J\u0010\u0010)\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010(H\u0014J\b\u0010*\u001a\u00020\u000fH\u0014J\b\u0010+\u001a\u00020\u000fH\u0014R\u0014\u0010.\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0014\u00102\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010-\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"Ldf/a;", "E", "Ldf/c;", "Ldf/i;", "R", BuildConfig.FLAVOR, "receiveMode", "P", "(ILxb/d;)Ljava/lang/Object;", "Ldf/z;", "receive", BuildConfig.FLAVOR, "F", "Lkotlinx/coroutines/p;", "cont", "Ltb/e0;", "Q", BuildConfig.FLAVOR, "O", "G", "Ldf/m;", "w", "(Lxb/d;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "r", BuildConfig.FLAVOR, "(Ljava/lang/Throwable;)Z", "wasClosed", "K", "Lkotlinx/coroutines/internal/j;", "Ldf/d0;", "list", "Ldf/q;", "closed", "L", "(Ljava/lang/Object;Ldf/q;)V", "Ldf/k;", "iterator", "Ldf/b0;", "A", "N", "M", "H", "()Z", "isBufferAlwaysEmpty", "I", "isBufferEmpty", "J", "isClosedForReceive", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lgc/l;)V", "a", "b", "c", "d", "e", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class a<E> extends df.c<E> implements i<E> {

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0013\u0010\u0007\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005H\u0096Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Ldf/a$a;", "E", "Ldf/k;", BuildConfig.FLAVOR, "result", BuildConfig.FLAVOR, "b", "c", "(Lxb/d;)Ljava/lang/Object;", "a", "next", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getResult", "d", "(Ljava/lang/Object;)V", "Ldf/a;", "channel", "<init>", "(Ldf/a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: df.a$a */
    /* loaded from: classes3.dex */
    public static final class C0132a<E> implements k<E> {

        /* renamed from: a */
        public final a<E> f8892a;

        /* renamed from: b */
        private Object f8893b = df.b.f8906d;

        public C0132a(a<E> aVar) {
            this.f8892a = aVar;
        }

        private final boolean b(Object obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (qVar.f8931x != null) {
                    throw kotlinx.coroutines.internal.a0.a(qVar.O());
                }
                return false;
            }
            return true;
        }

        private final Object c(xb.d<? super Boolean> dVar) {
            xb.d b10;
            Object c10;
            Object obj;
            b10 = yb.c.b(dVar);
            kotlinx.coroutines.q b11 = kotlinx.coroutines.s.b(b10);
            d dVar2 = new d(this, b11);
            while (true) {
                if (this.f8892a.F(dVar2)) {
                    this.f8892a.Q(b11, dVar2);
                    break;
                }
                Object O = this.f8892a.O();
                d(O);
                if (O instanceof q) {
                    q qVar = (q) O;
                    if (qVar.f8931x == null) {
                        s.a aVar = tb.s.Companion;
                        obj = zb.b.a(false);
                    } else {
                        s.a aVar2 = tb.s.Companion;
                        obj = tb.t.a(qVar.O());
                    }
                    b11.y(tb.s.c(obj));
                } else if (O != df.b.f8906d) {
                    Boolean a10 = zb.b.a(true);
                    gc.l<E, tb.e0> lVar = this.f8892a.f8910c;
                    b11.I(a10, lVar != null ? kotlinx.coroutines.internal.v.a(lVar, O, b11.b()) : null);
                }
            }
            Object s10 = b11.s();
            c10 = yb.d.c();
            if (s10 == c10) {
                zb.h.c(dVar);
            }
            return s10;
        }

        @Override // df.k
        public Object a(xb.d<? super Boolean> dVar) {
            Object obj = this.f8893b;
            kotlinx.coroutines.internal.b0 b0Var = df.b.f8906d;
            if (obj == b0Var) {
                obj = this.f8892a.O();
                this.f8893b = obj;
                if (obj == b0Var) {
                    return c(dVar);
                }
            }
            return zb.b.a(b(obj));
        }

        public final void d(Object obj) {
            this.f8893b = obj;
        }

        @Override // df.k
        public E next() {
            E e10 = (E) this.f8893b;
            if (!(e10 instanceof q)) {
                kotlinx.coroutines.internal.b0 b0Var = df.b.f8906d;
                if (e10 == b0Var) {
                    throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
                }
                this.f8893b = b0Var;
                return e10;
            }
            throw kotlinx.coroutines.internal.a0.a(((q) e10).O());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016¨\u0006\u001a"}, d2 = {"Ldf/a$b;", "E", "Ldf/z;", "value", BuildConfig.FLAVOR, "J", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/o$b;", "otherOp", "Lkotlinx/coroutines/internal/b0;", "e", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/o$b;)Lkotlinx/coroutines/internal/b0;", "Ltb/e0;", "b", "(Ljava/lang/Object;)V", "Ldf/q;", "closed", "I", BuildConfig.FLAVOR, "toString", "Lkotlinx/coroutines/p;", "cont", BuildConfig.FLAVOR, "receiveMode", "<init>", "(Lkotlinx/coroutines/p;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class b<E> extends z<E> {

        /* renamed from: x */
        public final kotlinx.coroutines.p<Object> f8894x;

        /* renamed from: y */
        public final int f8895y;

        public b(kotlinx.coroutines.p<Object> pVar, int i10) {
            this.f8894x = pVar;
            this.f8895y = i10;
        }

        @Override // df.z
        public void I(q<?> qVar) {
            Object obj;
            kotlinx.coroutines.p<Object> pVar;
            if (this.f8895y == 1) {
                pVar = this.f8894x;
                obj = m.b(m.Companion.a(qVar.f8931x));
                s.a aVar = tb.s.Companion;
            } else {
                pVar = this.f8894x;
                s.a aVar2 = tb.s.Companion;
                obj = tb.t.a(qVar.O());
            }
            pVar.y(tb.s.c(obj));
        }

        public final Object J(E e10) {
            return this.f8895y == 1 ? m.b(m.Companion.c(e10)) : e10;
        }

        @Override // df.b0
        public void b(E e10) {
            this.f8894x.c0(kotlinx.coroutines.r.f15503a);
        }

        @Override // df.b0
        public kotlinx.coroutines.internal.b0 e(E e10, o.b bVar) {
            if (this.f8894x.A(J(e10), null, H(e10)) == null) {
                return null;
            }
            return kotlinx.coroutines.r.f15503a;
        }

        @Override // kotlinx.coroutines.internal.o
        public String toString() {
            return "ReceiveElement@" + u0.b(this) + "[receiveMode=" + this.f8895y + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B=\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Ldf/a$c;", "E", "Ldf/a$b;", "value", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Ltb/e0;", "H", "(Ljava/lang/Object;)Lgc/l;", "Lkotlinx/coroutines/p;", BuildConfig.FLAVOR, "cont", BuildConfig.FLAVOR, "receiveMode", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlinx/coroutines/p;ILgc/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class c<E> extends b<E> {
        public final gc.l<E, tb.e0> U3;

        /* JADX WARN: Multi-variable type inference failed */
        public c(kotlinx.coroutines.p<Object> pVar, int i10, gc.l<? super E, tb.e0> lVar) {
            super(pVar, i10);
            this.U3 = lVar;
        }

        @Override // df.z
        public gc.l<Throwable, tb.e0> H(E e10) {
            return kotlinx.coroutines.internal.v.a(this.U3, e10, this.f8894x.b());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016¨\u0006\u001c"}, d2 = {"Ldf/a$d;", "E", "Ldf/z;", "value", "Lkotlinx/coroutines/internal/o$b;", "otherOp", "Lkotlinx/coroutines/internal/b0;", "e", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/o$b;)Lkotlinx/coroutines/internal/b0;", "Ltb/e0;", "b", "(Ljava/lang/Object;)V", "Ldf/q;", "closed", "I", "Lkotlin/Function1;", BuildConfig.FLAVOR, "H", "(Ljava/lang/Object;)Lgc/l;", BuildConfig.FLAVOR, "toString", "Ldf/a$a;", "iterator", "Lkotlinx/coroutines/p;", BuildConfig.FLAVOR, "cont", "<init>", "(Ldf/a$a;Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class d<E> extends z<E> {

        /* renamed from: x */
        public final C0132a<E> f8896x;

        /* renamed from: y */
        public final kotlinx.coroutines.p<Boolean> f8897y;

        /* JADX WARN: Multi-variable type inference failed */
        public d(C0132a<E> c0132a, kotlinx.coroutines.p<? super Boolean> pVar) {
            this.f8896x = c0132a;
            this.f8897y = pVar;
        }

        @Override // df.z
        public gc.l<Throwable, tb.e0> H(E e10) {
            gc.l<E, tb.e0> lVar = this.f8896x.f8892a.f8910c;
            if (lVar != null) {
                return kotlinx.coroutines.internal.v.a(lVar, e10, this.f8897y.b());
            }
            return null;
        }

        @Override // df.z
        public void I(q<?> qVar) {
            Object a10 = qVar.f8931x == null ? p.a.a(this.f8897y, Boolean.FALSE, null, 2, null) : this.f8897y.b0(qVar.O());
            if (a10 != null) {
                this.f8896x.d(qVar);
                this.f8897y.c0(a10);
            }
        }

        @Override // df.b0
        public void b(E e10) {
            this.f8896x.d(e10);
            this.f8897y.c0(kotlinx.coroutines.r.f15503a);
        }

        @Override // df.b0
        public kotlinx.coroutines.internal.b0 e(E e10, o.b bVar) {
            if (this.f8897y.A(Boolean.TRUE, null, H(e10)) == null) {
                return null;
            }
            return kotlinx.coroutines.r.f15503a;
        }

        @Override // kotlinx.coroutines.internal.o
        public String toString() {
            return "ReceiveHasNext@" + u0.b(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Ldf/a$e;", "Lkotlinx/coroutines/g;", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", "Ldf/z;", "receive", "<init>", "(Ldf/a;Ldf/z;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class e extends kotlinx.coroutines.g {

        /* renamed from: c */
        private final z<?> f8898c;

        public e(z<?> zVar) {
            a.this = r1;
            this.f8898c = zVar;
        }

        @Override // kotlinx.coroutines.o
        public void a(Throwable th2) {
            if (this.f8898c.B()) {
                a.this.M();
            }
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
            a(th2);
            return tb.e0.f22152a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f8898c + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, d2 = {"df/a$f", "Lkotlinx/coroutines/internal/o$a;", "Lkotlinx/coroutines/internal/o;", "Lkotlinx/coroutines/internal/Node;", "affected", BuildConfig.FLAVOR, "i", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class f extends o.a {

        /* renamed from: d */
        final /* synthetic */ a f8900d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlinx.coroutines.internal.o oVar, a aVar) {
            super(oVar);
            this.f8900d = aVar;
        }

        /* renamed from: i */
        public Object g(kotlinx.coroutines.internal.o oVar) {
            if (this.f8900d.I()) {
                return null;
            }
            return kotlinx.coroutines.internal.n.a();
        }
    }

    @zb.f(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends zb.d {
        int U3;

        /* renamed from: x */
        /* synthetic */ Object f8901x;

        /* renamed from: y */
        final /* synthetic */ a<E> f8902y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(a<E> aVar, xb.d<? super g> dVar) {
            super(dVar);
            this.f8902y = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            this.f8901x = obj;
            this.U3 |= Integer.MIN_VALUE;
            Object w9 = this.f8902y.w(this);
            c10 = yb.d.c();
            return w9 == c10 ? w9 : m.b(w9);
        }
    }

    public a(gc.l<? super E, tb.e0> lVar) {
        super(lVar);
    }

    public final boolean F(z<? super E> zVar) {
        boolean G = G(zVar);
        if (G) {
            N();
        }
        return G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [df.a$b] */
    private final <R> Object P(int i10, xb.d<? super R> dVar) {
        xb.d b10;
        Object c10;
        b10 = yb.c.b(dVar);
        kotlinx.coroutines.q b11 = kotlinx.coroutines.s.b(b10);
        c bVar = this.f8910c == null ? new b(b11, i10) : new c(b11, i10, this.f8910c);
        while (true) {
            if (!F(bVar)) {
                Object O = O();
                if (!(O instanceof q)) {
                    if (O != df.b.f8906d) {
                        b11.I(bVar.J(O), bVar.H(O));
                        break;
                    }
                } else {
                    bVar.I((q) O);
                    break;
                }
            } else {
                Q(b11, bVar);
                break;
            }
        }
        Object s10 = b11.s();
        c10 = yb.d.c();
        if (s10 == c10) {
            zb.h.c(dVar);
        }
        return s10;
    }

    public final void Q(kotlinx.coroutines.p<?> pVar, z<?> zVar) {
        pVar.N(new e(zVar));
    }

    @Override // df.c
    public b0<E> A() {
        b0<E> A = super.A();
        if (A != null && !(A instanceof q)) {
            M();
        }
        return A;
    }

    public final boolean E(Throwable th2) {
        boolean a10 = a(th2);
        K(a10);
        return a10;
    }

    public boolean G(z<? super E> zVar) {
        int F;
        kotlinx.coroutines.internal.o x10;
        if (!H()) {
            kotlinx.coroutines.internal.o l10 = l();
            f fVar = new f(zVar, this);
            do {
                kotlinx.coroutines.internal.o x11 = l10.x();
                if (!(!(x11 instanceof d0))) {
                    return false;
                }
                F = x11.F(zVar, l10, fVar);
                if (F != 1) {
                }
            } while (F != 2);
            return false;
        }
        kotlinx.coroutines.internal.o l11 = l();
        do {
            x10 = l11.x();
            if (!(!(x10 instanceof d0))) {
                return false;
            }
        } while (!x10.m(zVar, l11));
        return true;
    }

    protected abstract boolean H();

    protected abstract boolean I();

    public boolean J() {
        return j() != null && I();
    }

    public void K(boolean z10) {
        q<?> k10 = k();
        if (k10 != null) {
            Object b10 = kotlinx.coroutines.internal.j.b(null, 1, null);
            while (true) {
                kotlinx.coroutines.internal.o x10 = k10.x();
                if (x10 instanceof kotlinx.coroutines.internal.m) {
                    L(b10, k10);
                    return;
                } else if (!x10.B()) {
                    x10.y();
                } else {
                    b10 = kotlinx.coroutines.internal.j.c(b10, (d0) x10);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    protected void L(Object obj, q<?> qVar) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((d0) obj).I(qVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    return;
                }
                ((d0) arrayList.get(size)).I(qVar);
            }
        }
    }

    protected void M() {
    }

    protected void N() {
    }

    protected Object O() {
        while (true) {
            d0 B = B();
            if (B == null) {
                return df.b.f8906d;
            }
            if (B.J(null) != null) {
                B.G();
                return B.H();
            }
            B.K();
        }
    }

    @Override // df.a0
    public final k<E> iterator() {
        return new C0132a(this);
    }

    @Override // df.a0
    public final void r(CancellationException cancellationException) {
        if (J()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(u0.a(this) + " was cancelled");
        }
        E(cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // df.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(xb.d<? super df.m<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof df.a.g
            if (r0 == 0) goto L13
            r0 = r5
            df.a$g r0 = (df.a.g) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            df.a$g r0 = new df.a$g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f8901x
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.U3
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tb.t.b(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            tb.t.b(r5)
            java.lang.Object r5 = r4.O()
            kotlinx.coroutines.internal.b0 r2 = df.b.f8906d
            if (r5 == r2) goto L52
            boolean r0 = r5 instanceof df.q
            if (r0 == 0) goto L4b
            df.m$b r0 = df.m.Companion
            df.q r5 = (df.q) r5
            java.lang.Throwable r5 = r5.f8931x
            java.lang.Object r5 = r0.a(r5)
            goto L51
        L4b:
            df.m$b r0 = df.m.Companion
            java.lang.Object r5 = r0.c(r5)
        L51:
            return r5
        L52:
            r0.U3 = r3
            java.lang.Object r5 = r4.P(r3, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            df.m r5 = (df.m) r5
            java.lang.Object r5 = r5.k()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: df.a.w(xb.d):java.lang.Object");
    }
}
