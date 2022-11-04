package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a */
    private static final i0 f7888a = new b();

    /* renamed from: b */
    private static final i0 f7889b = new c();

    /* loaded from: classes.dex */
    private static final class b extends i0 {

        /* renamed from: c */
        private static final Class<?> f7890c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j10) {
            return (List) s1.A(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j10, int i10) {
            List<L> t10;
            g0 g0Var;
            List<L> f10 = f(obj, j10);
            if (!f10.isEmpty()) {
                if (f7890c.isAssignableFrom(f10.getClass())) {
                    ArrayList arrayList = new ArrayList(f10.size() + i10);
                    arrayList.addAll(f10);
                    g0Var = arrayList;
                } else if (f10 instanceof r1) {
                    g0 g0Var2 = new g0(f10.size() + i10);
                    g0Var2.addAll((r1) f10);
                    g0Var = g0Var2;
                } else if (!(f10 instanceof b1) || !(f10 instanceof b0.i)) {
                    return f10;
                } else {
                    b0.i iVar = (b0.i) f10;
                    if (iVar.I()) {
                        return f10;
                    }
                    t10 = iVar.t(f10.size() + i10);
                }
                s1.O(obj, j10, g0Var);
                return g0Var;
            }
            t10 = f10 instanceof h0 ? new g0(i10) : (!(f10 instanceof b1) || !(f10 instanceof b0.i)) ? new ArrayList<>(i10) : ((b0.i) f10).t(i10);
            s1.O(obj, j10, t10);
            return t10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void c(Object obj, long j10) {
            Object obj2;
            List list = (List) s1.A(obj, j10);
            if (list instanceof h0) {
                obj2 = ((h0) list).g();
            } else if (f7890c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof b1) && (list instanceof b0.i)) {
                    b0.i iVar = (b0.i) list;
                    if (!iVar.I()) {
                        return;
                    }
                    iVar.p();
                    return;
                }
                obj2 = Collections.unmodifiableList(list);
            }
            s1.O(obj, j10, obj2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public <E> void d(Object obj, Object obj2, long j10) {
            List f10 = f(obj2, j10);
            List g10 = g(obj, j10, f10.size());
            int size = g10.size();
            int size2 = f10.size();
            if (size > 0 && size2 > 0) {
                g10.addAll(f10);
            }
            if (size > 0) {
                f10 = g10;
            }
            s1.O(obj, j10, f10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    /* loaded from: classes.dex */
    private static final class c extends i0 {
        private c() {
            super();
        }

        static <E> b0.i<E> f(Object obj, long j10) {
            return (b0.i) s1.A(obj, j10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void c(Object obj, long j10) {
            f(obj, j10).p();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public <E> void d(Object obj, Object obj2, long j10) {
            b0.i<E> f10 = f(obj, j10);
            b0.i<E> f11 = f(obj2, j10);
            int size = f10.size();
            int size2 = f11.size();
            b0.i<E> iVar = f10;
            iVar = f10;
            if (size > 0 && size2 > 0) {
                boolean I = f10.I();
                b0.i<E> iVar2 = f10;
                if (!I) {
                    iVar2 = f10.t(size2 + size);
                }
                iVar2.addAll(f11);
                iVar = iVar2;
            }
            if (size > 0) {
                f11 = iVar;
            }
            s1.O(obj, j10, f11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public <L> List<L> e(Object obj, long j10) {
            b0.i f10 = f(obj, j10);
            if (!f10.I()) {
                int size = f10.size();
                b0.i t10 = f10.t(size == 0 ? 10 : size * 2);
                s1.O(obj, j10, t10);
                return t10;
            }
            return f10;
        }
    }

    private i0() {
    }

    public static i0 a() {
        return f7888a;
    }

    public static i0 b() {
        return f7889b;
    }

    public abstract void c(Object obj, long j10);

    public abstract <L> void d(Object obj, Object obj2, long j10);

    public abstract <L> List<L> e(Object obj, long j10);
}
