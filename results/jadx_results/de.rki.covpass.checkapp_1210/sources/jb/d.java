package jb;

import gc.q;
import hc.k0;
import hc.q0;
import hc.t;
import hc.y;
import java.util.Arrays;
import java.util.List;
import jb.i;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.c0;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001b\u0012\u0012\u0010N\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0M\"\u00020\u000b¢\u0006\u0004\bO\u0010PJ-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u001b\u001a6\u00122\u00120\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00170\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJF\u0010\u001d\u001a6\u00122\u00120\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00170\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJN\u0010!\u001a\u00020\u001a2:\u0010 \u001a6\u00122\u00120\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00170\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\u00020\u001a2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0002¢\u0006\u0004\b$\u0010%JP\u0010'\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b24\u0010&\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b.\u0010-JN\u0010/\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b24\u0010&\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u001aH\u0016¢\u0006\u0004\b1\u0010\u001fR+\u00109\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0093\u0001\u0010=\u001a8\u00122\u00120\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017\u0018\u00010\u00162<\u0010:\u001a8\u00122\u00120\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017\u0018\u00010\u00168B@BX\u0082\u000eø\u0001\u0000¢\u0006\f\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\"R+\u0010C\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00104\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR/\u0010I\u001a\u0004\u0018\u00010\u000b2\b\u00102\u001a\u0004\u0018\u00010\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bD\u00104\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010J\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Ljb/d;", BuildConfig.FLAVOR, "TSubject", "TContext", "context", "subject", "Lxb/g;", "coroutineContext", "Ljb/g;", "c", "(Ljava/lang/Object;Ljava/lang/Object;Lxb/g;)Ljb/g;", "Ljb/h;", "phase", "Ljb/c;", "e", "(Ljb/h;)Ljb/c;", BuildConfig.FLAVOR, "f", "(Ljb/h;)I", BuildConfig.FLAVOR, "l", "(Ljb/h;)Z", BuildConfig.FLAVOR, "Lkotlin/Function3;", "Ljb/e;", "Lxb/d;", "Ltb/e0;", "b", "()Ljava/util/List;", "w", "q", "()V", "list", "p", "(Ljava/util/List;)V", "phaseContent", "s", "(Ljb/c;)V", "block", "x", "(Ljb/h;Lgc/q;)Z", "d", "(Ljava/lang/Object;Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "reference", "m", "(Ljb/h;Ljb/h;)V", "n", "o", "(Ljb/h;Lgc/q;)V", "a", "<set-?>", "interceptorsQuantity$delegate", "Lkc/d;", "k", "()I", "v", "(I)V", "interceptorsQuantity", "value", "h", "r", "interceptors", "interceptorsListShared$delegate", "i", "()Z", "t", "(Z)V", "interceptorsListShared", "interceptorsListSharedPhase$delegate", "j", "()Ljb/h;", "u", "(Ljb/h;)V", "interceptorsListSharedPhase", "developmentMode", "Z", "g", BuildConfig.FLAVOR, "phases", "<init>", "([Ljb/h;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class d<TSubject, TContext> {

    /* renamed from: g */
    static final /* synthetic */ oc.k<Object>[] f14259g = {k0.e(new y(d.class, "interceptorsQuantity", "getInterceptorsQuantity()I", 0)), k0.e(new y(d.class, "interceptorsListShared", "getInterceptorsListShared()Z", 0)), k0.e(new y(d.class, "interceptorsListSharedPhase", "getInterceptorsListSharedPhase()Lio/ktor/util/pipeline/PipelinePhase;", 0))};

    /* renamed from: b */
    private final boolean f14261b;

    /* renamed from: c */
    private final List<Object> f14262c;

    /* renamed from: a */
    private final fb.b f14260a = fb.d.a(true);

    /* renamed from: d */
    private final kc.d f14263d = new a(0);
    private volatile /* synthetic */ Object _interceptors = null;

    /* renamed from: e */
    private final kc.d f14264e = new b(Boolean.FALSE);

    /* renamed from: f */
    private final kc.d f14265f = new c(null);

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements kc.d<Object, Integer> {

        /* renamed from: a */
        private Integer f14266a;

        /* renamed from: b */
        final /* synthetic */ Object f14267b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj) {
            this.f14267b = obj;
            this.f14266a = obj;
        }

        @Override // kc.d, kc.c
        public Integer a(Object obj, oc.k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f14266a;
        }

        @Override // kc.d
        public void b(Object obj, oc.k<?> kVar, Integer num) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f14266a = num;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b implements kc.d<Object, Boolean> {

        /* renamed from: a */
        private Boolean f14268a;

        /* renamed from: b */
        final /* synthetic */ Object f14269b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Object obj) {
            this.f14269b = obj;
            this.f14268a = obj;
        }

        @Override // kc.d, kc.c
        public Boolean a(Object obj, oc.k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f14268a;
        }

        @Override // kc.d
        public void b(Object obj, oc.k<?> kVar, Boolean bool) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f14268a = bool;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c implements kc.d<Object, h> {

        /* renamed from: a */
        private h f14270a;

        /* renamed from: b */
        final /* synthetic */ Object f14271b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Object obj) {
            this.f14271b = obj;
            this.f14270a = obj;
        }

        @Override // kc.d, kc.c
        public h a(Object obj, oc.k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f14270a;
        }

        @Override // kc.d
        public void b(Object obj, oc.k<?> kVar, h hVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f14270a = hVar;
        }
    }

    public d(h... hVarArr) {
        t.e(hVarArr, "phases");
        this.f14262c = io.ktor.util.collections.a.a(Arrays.copyOf(hVarArr, hVarArr.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0 = ub.u.j(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<gc.q<jb.e<TSubject, TContext>, TSubject, xb.d<? super tb.e0>, java.lang.Object>> b() {
        /*
            r8 = this;
            int r0 = r8.k()
            if (r0 != 0) goto L12
            java.util.List r0 = ub.s.h()
            r8.p(r0)
            java.util.List r0 = ub.s.h()
            return r0
        L12:
            java.util.List<java.lang.Object> r1 = r8.f14262c
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r4) goto L44
            int r0 = ub.s.j(r1)
            if (r0 < 0) goto L44
            r4 = r3
        L20:
            int r5 = r4 + 1
            java.lang.Object r6 = r1.get(r4)
            boolean r7 = r6 instanceof jb.c
            if (r7 == 0) goto L2d
            jb.c r6 = (jb.c) r6
            goto L2e
        L2d:
            r6 = r2
        L2e:
            if (r6 != 0) goto L31
            goto L3f
        L31:
            boolean r7 = r6.j()
            if (r7 != 0) goto L3f
            java.util.List r0 = r6.m()
            r8.s(r6)
            return r0
        L3f:
            if (r4 != r0) goto L42
            goto L44
        L42:
            r4 = r5
            goto L20
        L44:
            gc.q[] r0 = new gc.q[r3]
            java.util.List r0 = io.ktor.util.collections.a.a(r0)
            int r4 = ub.s.j(r1)
            if (r4 < 0) goto L69
        L50:
            int r5 = r3 + 1
            java.lang.Object r6 = r1.get(r3)
            boolean r7 = r6 instanceof jb.c
            if (r7 == 0) goto L5d
            jb.c r6 = (jb.c) r6
            goto L5e
        L5d:
            r6 = r2
        L5e:
            if (r6 != 0) goto L61
            goto L64
        L61:
            r6.b(r0)
        L64:
            if (r3 != r4) goto L67
            goto L69
        L67:
            r3 = r5
            goto L50
        L69:
            r8.p(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.d.b():java.util.List");
    }

    private final g<TSubject> c(TContext tcontext, TSubject tsubject, xb.g gVar) {
        return f.a(tcontext, w(), tsubject, gVar, g());
    }

    private final jb.c<TSubject, TContext> e(h hVar) {
        List<Object> list = this.f14262c;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Object obj = list.get(i10);
            if (obj == hVar) {
                jb.c<TSubject, TContext> cVar = new jb.c<>(hVar, i.c.f14275a);
                list.set(i10, cVar);
                return cVar;
            }
            if (obj instanceof jb.c) {
                jb.c<TSubject, TContext> cVar2 = (jb.c) obj;
                if (cVar2.f() == hVar) {
                    return cVar2;
                }
            }
            i10 = i11;
        }
        return null;
    }

    private final int f(h hVar) {
        List<Object> list = this.f14262c;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Object obj = list.get(i10);
            if (obj == hVar || ((obj instanceof jb.c) && ((jb.c) obj).f() == hVar)) {
                return i10;
            }
            i10 = i11;
        }
        return -1;
    }

    private final List<q<e<TSubject, TContext>, TSubject, xb.d<? super e0>, Object>> h() {
        return (List) this._interceptors;
    }

    private final boolean i() {
        return ((Boolean) this.f14264e.a(this, f14259g[1])).booleanValue();
    }

    private final h j() {
        return (h) this.f14265f.a(this, f14259g[2]);
    }

    private final int k() {
        return ((Number) this.f14263d.a(this, f14259g[0])).intValue();
    }

    private final boolean l(h hVar) {
        List<Object> list = this.f14262c;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Object obj = list.get(i10);
            if (obj == hVar) {
                return true;
            }
            if ((obj instanceof jb.c) && ((jb.c) obj).f() == hVar) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    private final void p(List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super xb.d<? super e0>, ? extends Object>> list) {
        r(list);
        t(false);
        u(null);
    }

    private final void q() {
        r(null);
        t(false);
        u(null);
    }

    private final void r(List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super xb.d<? super e0>, ? extends Object>> list) {
        this._interceptors = list;
    }

    private final void s(jb.c<TSubject, TContext> cVar) {
        r(cVar.m());
        t(false);
        u(cVar.f());
    }

    private final void t(boolean z10) {
        this.f14264e.b(this, f14259g[1], Boolean.valueOf(z10));
    }

    private final void u(h hVar) {
        this.f14265f.b(this, f14259g[2], hVar);
    }

    private final void v(int i10) {
        this.f14263d.b(this, f14259g[0], Integer.valueOf(i10));
    }

    private final List<q<e<TSubject, TContext>, TSubject, xb.d<? super e0>, Object>> w() {
        if (h() == null) {
            b();
        }
        t(true);
        List<q<e<TSubject, TContext>, TSubject, xb.d<? super e0>, Object>> h10 = h();
        t.b(h10);
        return h10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean x(h hVar, q<? super e<TSubject, TContext>, ? super TSubject, ? super xb.d<? super e0>, ? extends Object> qVar) {
        Object g02;
        int j10;
        List<q<e<TSubject, TContext>, TSubject, xb.d<? super e0>, Object>> h10 = h();
        if (this.f14262c.isEmpty() || h10 == null || i() || !q0.j(h10)) {
            return false;
        }
        if (t.a(j(), hVar)) {
            h10.add(qVar);
            return true;
        }
        g02 = c0.g0(this.f14262c);
        if (!t.a(hVar, g02)) {
            int f10 = f(hVar);
            j10 = u.j(this.f14262c);
            if (f10 != j10) {
                return false;
            }
        }
        jb.c<TSubject, TContext> e10 = e(hVar);
        t.b(e10);
        e10.a(qVar);
        h10.add(qVar);
        return true;
    }

    public void a() {
    }

    public final Object d(TContext tcontext, TSubject tsubject, xb.d<? super TSubject> dVar) {
        return c(tcontext, tsubject, dVar.b()).a(tsubject, dVar);
    }

    public boolean g() {
        return this.f14261b;
    }

    public final void m(h hVar, h hVar2) {
        int j10;
        t.e(hVar, "reference");
        t.e(hVar2, "phase");
        if (l(hVar2)) {
            return;
        }
        int f10 = f(hVar);
        if (f10 == -1) {
            throw new jb.b("Phase " + hVar + " was not registered for this pipeline");
        }
        int i10 = f10 + 1;
        j10 = u.j(this.f14262c);
        if (i10 <= j10) {
            while (true) {
                int i11 = i10 + 1;
                Object obj = this.f14262c.get(i10);
                h hVar3 = null;
                jb.c cVar = obj instanceof jb.c ? (jb.c) obj : null;
                i g10 = cVar == null ? null : cVar.g();
                if (g10 == null) {
                    break;
                }
                i.a aVar = g10 instanceof i.a ? (i.a) g10 : null;
                if (aVar != null) {
                    hVar3 = aVar.a();
                }
                if (hVar3 != null && t.a(hVar3, hVar)) {
                    f10 = i10;
                }
                if (i10 == j10) {
                    break;
                }
                i10 = i11;
            }
        }
        this.f14262c.add(f10 + 1, new jb.c(hVar2, new i.a(hVar)));
    }

    public final void n(h hVar, h hVar2) {
        t.e(hVar, "reference");
        t.e(hVar2, "phase");
        if (l(hVar2)) {
            return;
        }
        int f10 = f(hVar);
        if (f10 != -1) {
            this.f14262c.add(f10, new jb.c(hVar2, new i.b(hVar)));
            return;
        }
        throw new jb.b("Phase " + hVar + " was not registered for this pipeline");
    }

    public final void o(h hVar, q<? super e<TSubject, TContext>, ? super TSubject, ? super xb.d<? super e0>, ? extends Object> qVar) {
        t.e(hVar, "phase");
        t.e(qVar, "block");
        jb.c<TSubject, TContext> e10 = e(hVar);
        if (e10 == null) {
            throw new jb.b("Phase " + hVar + " was not registered for this pipeline");
        } else if (x(hVar, qVar)) {
            v(k() + 1);
        } else {
            e10.a(qVar);
            v(k() + 1);
            q();
            a();
        }
    }
}
