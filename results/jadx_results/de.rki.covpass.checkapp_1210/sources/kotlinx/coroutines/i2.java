package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.internal.o;
import org.conscrypt.BuildConfig;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006¦\u0001§\u0001¨\u0001B\u0012\u0012\u0007\u0010£\u0001\u001a\u00020\u0015¢\u0006\u0006\b¤\u0001\u0010¥\u0001J#\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u0010*\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b!\u0010\u001eJ\u0019\u0010#\u001a\u00020\"2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b#\u0010$J1\u0010*\u001a\u00020)2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&2\u0006\u0010(\u001a\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020)H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020)H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0015H\u0002¢\u0006\u0004\b5\u00106J\u0013\u00107\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b;\u0010<J\u001b\u0010=\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b=\u0010:J\u0019\u0010>\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b@\u0010AJ%\u0010B\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bB\u0010CJ#\u0010D\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\bG\u0010HJ*\u0010J\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010I\u001a\u00020F2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0082\u0010¢\u0006\u0004\bJ\u0010KJ)\u0010M\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010L\u001a\u00020F2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bM\u0010NJ\u0015\u0010P\u001a\u0004\u0018\u00010F*\u00020OH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010S\u001a\u00020R2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\bU\u00108J\u0019\u0010W\u001a\u00020\u00102\b\u0010V\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bW\u0010XJ\r\u0010Y\u001a\u00020\u0015¢\u0006\u0004\bY\u00106J\u000f\u0010Z\u001a\u00020\u0010H\u0014¢\u0006\u0004\bZ\u0010[J\u0011\u0010^\u001a\u00060\\j\u0002`]¢\u0006\u0004\b^\u0010_J#\u0010a\u001a\u00060\\j\u0002`]*\u00020\u000b2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010RH\u0004¢\u0006\u0004\ba\u0010bJ'\u0010d\u001a\u00020c2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&¢\u0006\u0004\bd\u0010eJ7\u0010g\u001a\u00020c2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010f\u001a\u00020\u00152\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&¢\u0006\u0004\bg\u0010hJ\u0013\u0010i\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\bi\u00108J\u0017\u0010j\u001a\u00020\u00102\u0006\u0010-\u001a\u00020)H\u0000¢\u0006\u0004\bj\u00104J\u001f\u0010k\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0018\u00010\\j\u0004\u0018\u0001`]H\u0016¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020RH\u0014¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bo\u0010pJ\u0015\u0010r\u001a\u00020\u00102\u0006\u0010q\u001a\u00020\u0003¢\u0006\u0004\br\u0010sJ\u0017\u0010t\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bt\u0010 J\u0017\u0010u\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bu\u0010 J\u0019\u0010v\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bv\u0010wJ\u0013\u0010x\u001a\u00060\\j\u0002`]H\u0016¢\u0006\u0004\bx\u0010_J\u0019\u0010y\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\by\u0010wJ\u001b\u0010z\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bz\u0010:J\u0015\u0010|\u001a\u00020{2\u0006\u0010I\u001a\u00020\u0002¢\u0006\u0004\b|\u0010}J\u0017\u0010\u007f\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u007f\u0010pJ\u001b\u0010\u0080\u0001\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0005\b\u0080\u0001\u0010pJ\u0019\u0010\u0081\u0001\u001a\u00020\u00152\u0006\u0010~\u001a\u00020\u000bH\u0014¢\u0006\u0005\b\u0081\u0001\u0010 J\u001c\u0010\u0082\u0001\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0084\u0001\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0006\b\u0084\u0001\u0010\u0083\u0001J\u0011\u0010\u0085\u0001\u001a\u00020RH\u0016¢\u0006\u0005\b\u0085\u0001\u0010nJ\u0011\u0010\u0086\u0001\u001a\u00020RH\u0007¢\u0006\u0005\b\u0086\u0001\u0010nJ\u0011\u0010\u0087\u0001\u001a\u00020RH\u0010¢\u0006\u0005\b\u0087\u0001\u0010nJ\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0017\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0004H\u0080@ø\u0001\u0000¢\u0006\u0005\b\u008a\u0001\u00108R\u001e\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010<R\u0019\u0010\u0090\u0001\u001a\u0007\u0012\u0002\b\u00030\u008d\u00018F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R.\u0010\u0096\u0001\u001a\u0004\u0018\u00010{2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010{8@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0089\u0001R\u0016\u0010\u0099\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u00106R\u0013\u0010\u009b\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u00106R\u0013\u0010\u009c\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u00106R\u0016\u0010\u009e\u0001\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u00106R\u0016\u0010 \u0001\u001a\u00020\u00158TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u00106R\u0016\u0010¢\u0001\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006©\u0001"}, d2 = {"Lkotlinx/coroutines/i2;", "Lkotlinx/coroutines/a2;", "Lkotlinx/coroutines/x;", "Lkotlinx/coroutines/q2;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/i2$c;", "state", "proposedUpdate", "T", "(Lkotlinx/coroutines/i2$c;Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "exceptions", "Z", "(Lkotlinx/coroutines/i2$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "Ltb/e0;", "q", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lkotlinx/coroutines/v1;", "update", BuildConfig.FLAVOR, "Z0", "(Lkotlinx/coroutines/v1;Ljava/lang/Object;)Z", "Q", "(Lkotlinx/coroutines/v1;Ljava/lang/Object;)V", "Lkotlinx/coroutines/n2;", "list", "cause", "C0", "(Lkotlinx/coroutines/n2;Ljava/lang/Throwable;)V", "L", "(Ljava/lang/Throwable;)Z", "F0", BuildConfig.FLAVOR, "T0", "(Ljava/lang/Object;)I", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "Lkotlinx/coroutines/h2;", "y0", "(Lgc/l;Z)Lkotlinx/coroutines/h2;", "expect", "node", "o", "(Ljava/lang/Object;Lkotlinx/coroutines/n2;Lkotlinx/coroutines/h2;)Z", "Lkotlinx/coroutines/j1;", "L0", "(Lkotlinx/coroutines/j1;)V", "N0", "(Lkotlinx/coroutines/h2;)V", "q0", "()Z", "r0", "(Lxb/d;)Ljava/lang/Object;", "K", "(Ljava/lang/Object;)Ljava/lang/Object;", "S", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "t0", "g0", "(Lkotlinx/coroutines/v1;)Lkotlinx/coroutines/n2;", "a1", "(Lkotlinx/coroutines/v1;Ljava/lang/Throwable;)Z", "b1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "d1", "(Lkotlinx/coroutines/v1;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/w;", "U", "(Lkotlinx/coroutines/v1;)Lkotlinx/coroutines/w;", "child", "g1", "(Lkotlinx/coroutines/i2$c;Lkotlinx/coroutines/w;Ljava/lang/Object;)Z", "lastChild", "R", "(Lkotlinx/coroutines/i2$c;Lkotlinx/coroutines/w;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/o;", "B0", "(Lkotlinx/coroutines/internal/o;)Lkotlinx/coroutines/w;", BuildConfig.FLAVOR, "U0", "(Ljava/lang/Object;)Ljava/lang/String;", "E", "parent", "n0", "(Lkotlinx/coroutines/a2;)V", "start", "J0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "w0", "()Ljava/util/concurrent/CancellationException;", "message", "W0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/h1;", "D0", "(Lgc/l;)Lkotlinx/coroutines/h1;", "invokeImmediately", "K0", "(ZZLgc/l;)Lkotlinx/coroutines/h1;", "V0", "P0", "r", "(Ljava/util/concurrent/CancellationException;)V", "O", "()Ljava/lang/String;", "J", "(Ljava/lang/Throwable;)V", "parentJob", "M0", "(Lkotlinx/coroutines/q2;)V", "P", "F", "H", "(Ljava/lang/Object;)Z", "s0", "v0", "x0", "Lkotlinx/coroutines/v;", "e1", "(Lkotlinx/coroutines/x;)Lkotlinx/coroutines/v;", "exception", "m0", "G0", "l0", "H0", "(Ljava/lang/Object;)V", "C", "toString", "Y0", "A0", "X", "()Ljava/lang/Object;", "D", "Y", "exceptionOrNull", "Lxb/g$c;", "getKey", "()Lxb/g$c;", "key", "value", "i0", "()Lkotlinx/coroutines/v;", "Q0", "(Lkotlinx/coroutines/v;)V", "parentHandle", "k0", "j", "isActive", "p", "isCompleted", "isCancelled", "d0", "onCancelComplete", "o0", "isScopedCoroutine", "a0", "handlesException", "active", "<init>", "(Z)V", "a", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class i2 implements a2, x, q2 {

    /* renamed from: c */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f15398c = AtomicReferenceFieldUpdater.newUpdater(i2.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/i2$a;", "T", "Lkotlinx/coroutines/q;", "Lkotlinx/coroutines/a2;", "parent", BuildConfig.FLAVOR, "r", BuildConfig.FLAVOR, "F", "Lkotlinx/coroutines/i2;", "X3", "Lkotlinx/coroutines/i2;", "job", "Lxb/d;", "delegate", "<init>", "(Lxb/d;Lkotlinx/coroutines/i2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a<T> extends q<T> {
        private final i2 X3;

        public a(xb.d<? super T> dVar, i2 i2Var) {
            super(dVar, 1);
            this.X3 = i2Var;
        }

        @Override // kotlinx.coroutines.q
        protected String F() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.q
        public Throwable r(a2 a2Var) {
            Throwable d10;
            Object k02 = this.X3.k0();
            return (!(k02 instanceof c) || (d10 = ((c) k02).d()) == null) ? k02 instanceof d0 ? ((d0) k02).f15325a : a2Var.w0() : d10;
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/i2$b;", "Lkotlinx/coroutines/h2;", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "G", "Lkotlinx/coroutines/i2;", "y", "Lkotlinx/coroutines/i2;", "parent", "Lkotlinx/coroutines/i2$c;", "U3", "Lkotlinx/coroutines/i2$c;", "state", "Lkotlinx/coroutines/w;", "V3", "Lkotlinx/coroutines/w;", "child", BuildConfig.FLAVOR, "W3", "Ljava/lang/Object;", "proposedUpdate", "<init>", "(Lkotlinx/coroutines/i2;Lkotlinx/coroutines/i2$c;Lkotlinx/coroutines/w;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b extends h2 {
        private final c U3;
        private final w V3;
        private final Object W3;

        /* renamed from: y */
        private final i2 f15399y;

        public b(i2 i2Var, c cVar, w wVar, Object obj) {
            this.f15399y = i2Var;
            this.U3 = cVar;
            this.V3 = wVar;
            this.W3 = obj;
        }

        @Override // kotlinx.coroutines.f0
        public void G(Throwable th2) {
            this.f15399y.R(this.U3, this.V3, this.W3);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
            G(th2);
            return tb.e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b/\u00100J\u001f\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010(\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0010R\u0011\u0010*\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0011\u0010,\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b+\u0010!R\u0014\u0010.\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010!¨\u00061"}, d2 = {"Lkotlinx/coroutines/i2$c;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/v1;", "Ljava/util/ArrayList;", BuildConfig.FLAVOR, "Lkotlin/collections/ArrayList;", "b", "()Ljava/util/ArrayList;", "proposedException", BuildConfig.FLAVOR, "h", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Ltb/e0;", "a", "(Ljava/lang/Throwable;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/n2;", "c", "Lkotlinx/coroutines/n2;", "k", "()Lkotlinx/coroutines/n2;", "list", "value", "()Ljava/lang/Object;", "l", "(Ljava/lang/Object;)V", "exceptionsHolder", BuildConfig.FLAVOR, "f", "()Z", "i", "(Z)V", "isCompleting", "d", "()Ljava/lang/Throwable;", "m", "rootCause", "g", "isSealed", "e", "isCancelling", "j", "isActive", "<init>", "(Lkotlinx/coroutines/n2;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class c implements v1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: c */
        private final n2 f15400c;

        public c(n2 n2Var, boolean z10, Throwable th2) {
            this.f15400c = n2Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th2;
        }

        private final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        private final Object c() {
            return this._exceptionsHolder;
        }

        private final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Throwable th2) {
            Throwable d10 = d();
            if (d10 == null) {
                m(th2);
            } else if (th2 == d10) {
            } else {
                Object c10 = c();
                if (c10 == null) {
                    l(th2);
                } else if (c10 instanceof Throwable) {
                    if (th2 == c10) {
                        return;
                    }
                    ArrayList<Throwable> b10 = b();
                    b10.add(c10);
                    b10.add(th2);
                    l(b10);
                } else if (c10 instanceof ArrayList) {
                    ((ArrayList) c10).add(th2);
                } else {
                    throw new IllegalStateException(("State is " + c10).toString());
                }
            }
        }

        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        public final boolean e() {
            return d() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        public final boolean f() {
            return this._isCompleting;
        }

        public final boolean g() {
            kotlinx.coroutines.internal.b0 b0Var;
            Object c10 = c();
            b0Var = j2.f15472e;
            return c10 == b0Var;
        }

        public final List<Throwable> h(Throwable th2) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.b0 b0Var;
            Object c10 = c();
            if (c10 == null) {
                arrayList = b();
            } else if (c10 instanceof Throwable) {
                ArrayList<Throwable> b10 = b();
                b10.add(c10);
                arrayList = b10;
            } else if (!(c10 instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + c10).toString());
            } else {
                arrayList = (ArrayList) c10;
            }
            Throwable d10 = d();
            if (d10 != null) {
                arrayList.add(0, d10);
            }
            if (th2 != null && !hc.t.a(th2, d10)) {
                arrayList.add(th2);
            }
            b0Var = j2.f15472e;
            l(b0Var);
            return arrayList;
        }

        public final void i(boolean z10) {
            this._isCompleting = z10 ? 1 : 0;
        }

        @Override // kotlinx.coroutines.v1
        public boolean j() {
            return d() == null;
        }

        @Override // kotlinx.coroutines.v1
        public n2 k() {
            return this.f15400c;
        }

        public final void m(Throwable th2) {
            this._rootCause = th2;
        }

        public String toString() {
            return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + k() + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/i2$d", "Lkotlinx/coroutines/internal/o$a;", "Lkotlinx/coroutines/internal/o;", "Lkotlinx/coroutines/internal/Node;", "affected", BuildConfig.FLAVOR, "i", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class d extends o.a {

        /* renamed from: d */
        final /* synthetic */ i2 f15401d;

        /* renamed from: e */
        final /* synthetic */ Object f15402e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.o oVar, i2 i2Var, Object obj) {
            super(oVar);
            this.f15401d = i2Var;
            this.f15402e = obj;
        }

        /* renamed from: i */
        public Object g(kotlinx.coroutines.internal.o oVar) {
            if (this.f15401d.k0() == this.f15402e) {
                return null;
            }
            return kotlinx.coroutines.internal.n.a();
        }
    }

    public i2(boolean z10) {
        this._state = z10 ? j2.f15474g : j2.f15473f;
        this._parentHandle = null;
    }

    private final w B0(kotlinx.coroutines.internal.o oVar) {
        while (oVar.A()) {
            oVar = oVar.x();
        }
        while (true) {
            oVar = oVar.w();
            if (!oVar.A()) {
                if (oVar instanceof w) {
                    return (w) oVar;
                }
                if (oVar instanceof n2) {
                    return null;
                }
            }
        }
    }

    private final void C0(n2 n2Var, Throwable th2) {
        G0(th2);
        g0 g0Var = null;
        for (kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) n2Var.v(); !hc.t.a(oVar, n2Var); oVar = oVar.w()) {
            if (oVar instanceof c2) {
                h2 h2Var = (h2) oVar;
                try {
                    h2Var.G(th2);
                } catch (Throwable th3) {
                    if (g0Var != null) {
                        tb.f.a(g0Var, th3);
                    } else {
                        g0Var = new g0("Exception in completion handler " + h2Var + " for " + this, th3);
                        tb.e0 e0Var = tb.e0.f22152a;
                    }
                }
            }
        }
        if (g0Var != null) {
            m0(g0Var);
        }
        L(th2);
    }

    private final Object E(xb.d<Object> dVar) {
        xb.d b10;
        Object c10;
        b10 = yb.c.b(dVar);
        a aVar = new a(b10, this);
        aVar.z();
        s.a(aVar, D0(new s2(aVar)));
        Object s10 = aVar.s();
        c10 = yb.d.c();
        if (s10 == c10) {
            zb.h.c(dVar);
        }
        return s10;
    }

    private final void F0(n2 n2Var, Throwable th2) {
        g0 g0Var = null;
        for (kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) n2Var.v(); !hc.t.a(oVar, n2Var); oVar = oVar.w()) {
            if (oVar instanceof h2) {
                h2 h2Var = (h2) oVar;
                try {
                    h2Var.G(th2);
                } catch (Throwable th3) {
                    if (g0Var != null) {
                        tb.f.a(g0Var, th3);
                    } else {
                        g0Var = new g0("Exception in completion handler " + h2Var + " for " + this, th3);
                        tb.e0 e0Var = tb.e0.f22152a;
                    }
                }
            }
        }
        if (g0Var != null) {
            m0(g0Var);
        }
    }

    private final Object K(Object obj) {
        kotlinx.coroutines.internal.b0 b0Var;
        Object b12;
        kotlinx.coroutines.internal.b0 b0Var2;
        do {
            Object k02 = k0();
            if (!(k02 instanceof v1) || ((k02 instanceof c) && ((c) k02).f())) {
                b0Var = j2.f15468a;
                return b0Var;
            }
            b12 = b1(k02, new d0(S(obj), false, 2, null));
            b0Var2 = j2.f15470c;
        } while (b12 == b0Var2);
        return b12;
    }

    private final boolean L(Throwable th2) {
        if (o0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        v i02 = i0();
        return (i02 == null || i02 == o2.f15496c) ? z10 : i02.h(th2) || z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.u1] */
    private final void L0(j1 j1Var) {
        n2 n2Var = new n2();
        if (!j1Var.j()) {
            n2Var = new u1(n2Var);
        }
        androidx.concurrent.futures.b.a(f15398c, this, j1Var, n2Var);
    }

    private final void N0(h2 h2Var) {
        h2Var.o(new n2());
        androidx.concurrent.futures.b.a(f15398c, this, h2Var, h2Var.w());
    }

    private final void Q(v1 v1Var, Object obj) {
        v i02 = i0();
        if (i02 != null) {
            i02.g();
            Q0(o2.f15496c);
        }
        Throwable th2 = null;
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var != null) {
            th2 = d0Var.f15325a;
        }
        if (!(v1Var instanceof h2)) {
            n2 k10 = v1Var.k();
            if (k10 == null) {
                return;
            }
            F0(k10, th2);
            return;
        }
        try {
            ((h2) v1Var).G(th2);
        } catch (Throwable th3) {
            m0(new g0("Exception in completion handler " + v1Var + " for " + this, th3));
        }
    }

    public final void R(c cVar, w wVar, Object obj) {
        w B0 = B0(wVar);
        if (B0 == null || !g1(cVar, B0, obj)) {
            C(T(cVar, obj));
        }
    }

    private final Throwable S(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new b2(O(), null, this) : th2;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((q2) obj).s0();
    }

    private final Object T(c cVar, Object obj) {
        boolean e10;
        Throwable Z;
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        Throwable th2 = d0Var != null ? d0Var.f15325a : null;
        synchronized (cVar) {
            e10 = cVar.e();
            List<Throwable> h10 = cVar.h(th2);
            Z = Z(cVar, h10);
            if (Z != null) {
                q(Z, h10);
            }
        }
        boolean z10 = false;
        if (Z != null && Z != th2) {
            obj = new d0(Z, false, 2, null);
        }
        if (Z != null) {
            if (L(Z) || l0(Z)) {
                z10 = true;
            }
            if (z10) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((d0) obj).b();
            }
        }
        if (!e10) {
            G0(Z);
        }
        H0(obj);
        androidx.concurrent.futures.b.a(f15398c, this, cVar, j2.g(obj));
        Q(cVar, obj);
        return obj;
    }

    private final int T0(Object obj) {
        j1 j1Var;
        if (!(obj instanceof j1)) {
            if (!(obj instanceof u1)) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f15398c, this, obj, ((u1) obj).k())) {
                return -1;
            }
            J0();
            return 1;
        } else if (((j1) obj).j()) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15398c;
            j1Var = j2.f15474g;
            if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, j1Var)) {
                return -1;
            }
            J0();
            return 1;
        }
    }

    private final w U(v1 v1Var) {
        w wVar = v1Var instanceof w ? (w) v1Var : null;
        if (wVar == null) {
            n2 k10 = v1Var.k();
            if (k10 == null) {
                return null;
            }
            return B0(k10);
        }
        return wVar;
    }

    private final String U0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof v1 ? ((v1) obj).j() ? "Active" : "New" : obj instanceof d0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.e() ? "Cancelling" : cVar.f() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException X0(i2 i2Var, Throwable th2, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return i2Var.W0(th2, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final Throwable Y(Object obj) {
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var != null) {
            return d0Var.f15325a;
        }
        return null;
    }

    private final Throwable Z(c cVar, List<? extends Throwable> list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (!cVar.e()) {
                return null;
            }
            return new b2(O(), null, this);
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        return th2 != null ? th2 : list.get(0);
    }

    private final boolean Z0(v1 v1Var, Object obj) {
        if (!androidx.concurrent.futures.b.a(f15398c, this, v1Var, j2.g(obj))) {
            return false;
        }
        G0(null);
        H0(obj);
        Q(v1Var, obj);
        return true;
    }

    private final boolean a1(v1 v1Var, Throwable th2) {
        n2 g02 = g0(v1Var);
        if (g02 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f15398c, this, v1Var, new c(g02, false, th2))) {
            return false;
        }
        C0(g02, th2);
        return true;
    }

    private final Object b1(Object obj, Object obj2) {
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        if (!(obj instanceof v1)) {
            b0Var2 = j2.f15468a;
            return b0Var2;
        } else if ((!(obj instanceof j1) && !(obj instanceof h2)) || (obj instanceof w) || (obj2 instanceof d0)) {
            return d1((v1) obj, obj2);
        } else {
            if (Z0((v1) obj, obj2)) {
                return obj2;
            }
            b0Var = j2.f15470c;
            return b0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object d1(v1 v1Var, Object obj) {
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        kotlinx.coroutines.internal.b0 b0Var3;
        n2 g02 = g0(v1Var);
        if (g02 == null) {
            b0Var3 = j2.f15470c;
            return b0Var3;
        }
        ?? r22 = 0;
        c cVar = v1Var instanceof c ? (c) v1Var : null;
        boolean z10 = false;
        if (cVar == null) {
            cVar = new c(g02, false, null);
        }
        hc.j0 j0Var = new hc.j0();
        synchronized (cVar) {
            if (cVar.f()) {
                b0Var2 = j2.f15468a;
                return b0Var2;
            }
            cVar.i(true);
            if (cVar != v1Var && !androidx.concurrent.futures.b.a(f15398c, this, v1Var, cVar)) {
                b0Var = j2.f15470c;
                return b0Var;
            }
            boolean e10 = cVar.e();
            d0 d0Var = obj instanceof d0 ? (d0) obj : null;
            if (d0Var != null) {
                cVar.a(d0Var.f15325a);
            }
            Throwable d10 = cVar.d();
            if (!e10) {
                z10 = true;
            }
            if (Boolean.valueOf(z10).booleanValue()) {
                r22 = d10;
            }
            j0Var.f11764c = r22;
            tb.e0 e0Var = tb.e0.f22152a;
            if (r22 != 0) {
                C0(g02, r22);
            }
            w U = U(v1Var);
            return (U == null || !g1(cVar, U, obj)) ? T(cVar, obj) : j2.f15469b;
        }
    }

    private final n2 g0(v1 v1Var) {
        n2 k10 = v1Var.k();
        if (k10 == null) {
            if (v1Var instanceof j1) {
                return new n2();
            }
            if (v1Var instanceof h2) {
                N0((h2) v1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + v1Var).toString());
        }
        return k10;
    }

    private final boolean g1(c cVar, w wVar, Object obj) {
        while (a2.a.d(wVar.f15577y, false, false, new b(this, cVar, wVar, obj), 1, null) == o2.f15496c) {
            wVar = B0(wVar);
            if (wVar == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean o(Object obj, n2 n2Var, h2 h2Var) {
        int F;
        d dVar = new d(h2Var, this, obj);
        do {
            F = n2Var.x().F(h2Var, n2Var, dVar);
            if (F == 1) {
                return true;
            }
        } while (F != 2);
        return false;
    }

    private final void q(Throwable th2, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th3 : list) {
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                tb.f.a(th2, th3);
            }
        }
    }

    private final boolean q0() {
        Object k02;
        do {
            k02 = k0();
            if (!(k02 instanceof v1)) {
                return false;
            }
        } while (T0(k02) < 0);
        return true;
    }

    private final Object r0(xb.d<? super tb.e0> dVar) {
        xb.d b10;
        Object c10;
        Object c11;
        b10 = yb.c.b(dVar);
        q qVar = new q(b10, 1);
        qVar.z();
        s.a(qVar, D0(new t2(qVar)));
        Object s10 = qVar.s();
        c10 = yb.d.c();
        if (s10 == c10) {
            zb.h.c(dVar);
        }
        c11 = yb.d.c();
        return s10 == c11 ? s10 : tb.e0.f22152a;
    }

    private final Object t0(Object obj) {
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        kotlinx.coroutines.internal.b0 b0Var3;
        kotlinx.coroutines.internal.b0 b0Var4;
        kotlinx.coroutines.internal.b0 b0Var5;
        kotlinx.coroutines.internal.b0 b0Var6;
        Throwable th2 = null;
        Throwable th3 = null;
        while (true) {
            Object k02 = k0();
            if (k02 instanceof c) {
                synchronized (k02) {
                    if (((c) k02).g()) {
                        b0Var2 = j2.f15471d;
                        return b0Var2;
                    }
                    boolean e10 = ((c) k02).e();
                    if (obj != null || !e10) {
                        if (th3 == null) {
                            th3 = S(obj);
                        }
                        ((c) k02).a(th3);
                    }
                    Throwable d10 = ((c) k02).d();
                    if (!e10) {
                        th2 = d10;
                    }
                    if (th2 != null) {
                        C0(((c) k02).k(), th2);
                    }
                    b0Var = j2.f15468a;
                    return b0Var;
                }
            } else if (!(k02 instanceof v1)) {
                b0Var3 = j2.f15471d;
                return b0Var3;
            } else {
                if (th3 == null) {
                    th3 = S(obj);
                }
                v1 v1Var = (v1) k02;
                if (!v1Var.j()) {
                    Object b12 = b1(k02, new d0(th3, false, 2, null));
                    b0Var5 = j2.f15468a;
                    if (b12 == b0Var5) {
                        throw new IllegalStateException(("Cannot happen in " + k02).toString());
                    }
                    b0Var6 = j2.f15470c;
                    if (b12 != b0Var6) {
                        return b12;
                    }
                } else if (a1(v1Var, th3)) {
                    b0Var4 = j2.f15468a;
                    return b0Var4;
                }
            }
        }
    }

    private final h2 y0(gc.l<? super Throwable, tb.e0> lVar, boolean z10) {
        h2 h2Var = null;
        if (z10) {
            if (lVar instanceof c2) {
                h2Var = (c2) lVar;
            }
            if (h2Var == null) {
                h2Var = new y1(lVar);
            }
        } else {
            if (lVar instanceof h2) {
                h2Var = (h2) lVar;
            }
            if (h2Var == null) {
                h2Var = new z1(lVar);
            }
        }
        h2Var.I(this);
        return h2Var;
    }

    public String A0() {
        return u0.a(this);
    }

    @Override // xb.g
    public xb.g B(xb.g gVar) {
        return a2.a.f(this, gVar);
    }

    public void C(Object obj) {
    }

    public final Object D(xb.d<Object> dVar) {
        Object k02;
        do {
            k02 = k0();
            if (!(k02 instanceof v1)) {
                if (k02 instanceof d0) {
                    throw ((d0) k02).f15325a;
                }
                return j2.h(k02);
            }
        } while (T0(k02) < 0);
        return E(dVar);
    }

    @Override // kotlinx.coroutines.a2
    public final h1 D0(gc.l<? super Throwable, tb.e0> lVar) {
        return K0(false, true, lVar);
    }

    public final boolean F(Throwable th2) {
        return H(th2);
    }

    protected void G0(Throwable th2) {
    }

    public final boolean H(Object obj) {
        Object obj2;
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        kotlinx.coroutines.internal.b0 b0Var3;
        obj2 = j2.f15468a;
        if (!d0() || (obj2 = K(obj)) != j2.f15469b) {
            b0Var = j2.f15468a;
            if (obj2 == b0Var) {
                obj2 = t0(obj);
            }
            b0Var2 = j2.f15468a;
            if (obj2 == b0Var2 || obj2 == j2.f15469b) {
                return true;
            }
            b0Var3 = j2.f15471d;
            if (obj2 == b0Var3) {
                return false;
            }
            C(obj2);
            return true;
        }
        return true;
    }

    protected void H0(Object obj) {
    }

    public void J(Throwable th2) {
        H(th2);
    }

    protected void J0() {
    }

    @Override // kotlinx.coroutines.a2
    public final h1 K0(boolean z10, boolean z11, gc.l<? super Throwable, tb.e0> lVar) {
        h2 y02 = y0(lVar, z10);
        while (true) {
            Object k02 = k0();
            if (k02 instanceof j1) {
                j1 j1Var = (j1) k02;
                if (!j1Var.j()) {
                    L0(j1Var);
                } else if (androidx.concurrent.futures.b.a(f15398c, this, k02, y02)) {
                    return y02;
                }
            } else {
                Throwable th2 = null;
                if (!(k02 instanceof v1)) {
                    if (z11) {
                        d0 d0Var = k02 instanceof d0 ? (d0) k02 : null;
                        if (d0Var != null) {
                            th2 = d0Var.f15325a;
                        }
                        lVar.invoke(th2);
                    }
                    return o2.f15496c;
                }
                n2 k10 = ((v1) k02).k();
                if (k10 == null) {
                    Objects.requireNonNull(k02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    N0((h2) k02);
                } else {
                    h1 h1Var = o2.f15496c;
                    if (z10 && (k02 instanceof c)) {
                        synchronized (k02) {
                            th2 = ((c) k02).d();
                            if (th2 == null || ((lVar instanceof w) && !((c) k02).f())) {
                                if (o(k02, k10, y02)) {
                                    if (th2 == null) {
                                        return y02;
                                    }
                                    h1Var = y02;
                                }
                            }
                            tb.e0 e0Var = tb.e0.f22152a;
                        }
                    }
                    if (th2 != null) {
                        if (z11) {
                            lVar.invoke(th2);
                        }
                        return h1Var;
                    } else if (o(k02, k10, y02)) {
                        return y02;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.x
    public final void M0(q2 q2Var) {
        H(q2Var);
    }

    public String O() {
        return "Job was cancelled";
    }

    public boolean P(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return H(th2) && a0();
    }

    public final void P0(h2 h2Var) {
        Object k02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j1 j1Var;
        do {
            k02 = k0();
            if (!(k02 instanceof h2)) {
                if (!(k02 instanceof v1) || ((v1) k02).k() == null) {
                    return;
                }
                h2Var.B();
                return;
            } else if (k02 != h2Var) {
                return;
            } else {
                atomicReferenceFieldUpdater = f15398c;
                j1Var = j2.f15474g;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, k02, j1Var));
    }

    public final void Q0(v vVar) {
        this._parentHandle = vVar;
    }

    @Override // kotlinx.coroutines.a2
    public final Object V0(xb.d<? super tb.e0> dVar) {
        Object c10;
        if (!q0()) {
            e2.h(dVar.b());
            return tb.e0.f22152a;
        }
        Object r02 = r0(dVar);
        c10 = yb.d.c();
        return r02 == c10 ? r02 : tb.e0.f22152a;
    }

    protected final CancellationException W0(Throwable th2, String str) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            if (str == null) {
                str = O();
            }
            cancellationException = new b2(str, th2, this);
        }
        return cancellationException;
    }

    public final Object X() {
        Object k02 = k0();
        if (!(k02 instanceof v1)) {
            if (k02 instanceof d0) {
                throw ((d0) k02).f15325a;
            }
            return j2.h(k02);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final String Y0() {
        return A0() + '{' + U0(k0()) + '}';
    }

    public boolean a0() {
        return true;
    }

    public boolean d0() {
        return false;
    }

    @Override // kotlinx.coroutines.a2
    public final v e1(x xVar) {
        return (v) a2.a.d(this, true, false, new w(xVar), 2, null);
    }

    @Override // xb.g.b, xb.g
    public <R> R f(R r10, gc.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) a2.a.b(this, r10, pVar);
    }

    @Override // xb.g.b
    public final g.c<?> getKey() {
        return a2.W0;
    }

    @Override // xb.g.b, xb.g
    public <E extends g.b> E i(g.c<E> cVar) {
        return (E) a2.a.c(this, cVar);
    }

    public final v i0() {
        return (v) this._parentHandle;
    }

    public final boolean isCancelled() {
        Object k02 = k0();
        return (k02 instanceof d0) || ((k02 instanceof c) && ((c) k02).e());
    }

    @Override // kotlinx.coroutines.a2
    public boolean j() {
        Object k02 = k0();
        return (k02 instanceof v1) && ((v1) k02).j();
    }

    public final Object k0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.w)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.w) obj).c(this);
        }
    }

    protected boolean l0(Throwable th2) {
        return false;
    }

    public void m0(Throwable th2) {
        throw th2;
    }

    public final void n0(a2 a2Var) {
        if (a2Var == null) {
            Q0(o2.f15496c);
            return;
        }
        a2Var.start();
        v e12 = a2Var.e1(this);
        Q0(e12);
        if (!p()) {
            return;
        }
        e12.g();
        Q0(o2.f15496c);
    }

    protected boolean o0() {
        return false;
    }

    @Override // kotlinx.coroutines.a2
    public final boolean p() {
        return !(k0() instanceof v1);
    }

    @Override // kotlinx.coroutines.a2, df.a0
    public void r(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new b2(O(), null, this);
        }
        J(cancellationException);
    }

    @Override // xb.g.b, xb.g
    public xb.g s(g.c<?> cVar) {
        return a2.a.e(this, cVar);
    }

    @Override // kotlinx.coroutines.q2
    public CancellationException s0() {
        Throwable th2;
        Object k02 = k0();
        CancellationException cancellationException = null;
        if (k02 instanceof c) {
            th2 = ((c) k02).d();
        } else if (k02 instanceof d0) {
            th2 = ((d0) k02).f15325a;
        } else if (k02 instanceof v1) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + k02).toString());
        } else {
            th2 = null;
        }
        if (th2 instanceof CancellationException) {
            cancellationException = th2;
        }
        if (cancellationException == null) {
            return new b2("Parent job is " + U0(k02), th2, this);
        }
        return cancellationException;
    }

    @Override // kotlinx.coroutines.a2
    public final boolean start() {
        int T0;
        do {
            T0 = T0(k0());
            if (T0 == 0) {
                return false;
            }
        } while (T0 != 1);
        return true;
    }

    public String toString() {
        return Y0() + '@' + u0.b(this);
    }

    public final boolean v0(Object obj) {
        Object b12;
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        do {
            b12 = b1(k0(), obj);
            b0Var = j2.f15468a;
            if (b12 == b0Var) {
                return false;
            }
            if (b12 == j2.f15469b) {
                return true;
            }
            b0Var2 = j2.f15470c;
        } while (b12 == b0Var2);
        C(b12);
        return true;
    }

    @Override // kotlinx.coroutines.a2
    public final CancellationException w0() {
        Object k02 = k0();
        if (!(k02 instanceof c)) {
            if (k02 instanceof v1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            } else if (k02 instanceof d0) {
                return X0(this, ((d0) k02).f15325a, null, 1, null);
            } else {
                return new b2(u0.a(this) + " has completed normally", null, this);
            }
        }
        Throwable d10 = ((c) k02).d();
        if (d10 != null) {
            CancellationException W0 = W0(d10, u0.a(this) + " is cancelling");
            if (W0 != null) {
                return W0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final Object x0(Object obj) {
        Object b12;
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        do {
            b12 = b1(k0(), obj);
            b0Var = j2.f15468a;
            if (b12 == b0Var) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, Y(obj));
            }
            b0Var2 = j2.f15470c;
        } while (b12 == b0Var2);
        return b12;
    }
}
