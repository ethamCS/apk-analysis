package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.u1;
import com.google.crypto.tink.shaded.protobuf.v.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class v<T extends b<T>> {

    /* renamed from: d */
    private static final v f8034d = new v(true);

    /* renamed from: a */
    private final k1<T, Object> f8035a;

    /* renamed from: b */
    private boolean f8036b;

    /* renamed from: c */
    private boolean f8037c;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8038a;

        /* renamed from: b */
        static final /* synthetic */ int[] f8039b;

        static {
            int[] iArr = new int[u1.b.values().length];
            f8039b = iArr;
            try {
                iArr[u1.b.f8024q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8039b[u1.b.f8025x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8039b[u1.b.f8026y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8039b[u1.b.U3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8039b[u1.b.V3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8039b[u1.b.W3.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8039b[u1.b.X3.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8039b[u1.b.Y3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8039b[u1.b.f8014a4.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8039b[u1.b.f8015b4.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8039b[u1.b.Z3.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8039b[u1.b.f8016c4.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8039b[u1.b.f8017d4.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8039b[u1.b.f8019f4.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8039b[u1.b.f8020g4.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8039b[u1.b.f8021h4.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8039b[u1.b.f8022i4.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f8039b[u1.b.f8018e4.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[u1.c.values().length];
            f8038a = iArr2;
            try {
                iArr2[u1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f8038a[u1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f8038a[u1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f8038a[u1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f8038a[u1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f8038a[u1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f8038a[u1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f8038a[u1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f8038a[u1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        int c();

        boolean e();

        u1.b f();

        u1.c i();

        boolean k();

        s0.a u(s0.a aVar, s0 s0Var);
    }

    private v() {
        this.f8035a = k1.r(16);
    }

    private v(k1<T, Object> k1Var) {
        this.f8035a = k1Var;
        s();
    }

    private v(boolean z10) {
        this(k1.r(0));
        s();
    }

    private static Object c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    static int d(u1.b bVar, int i10, Object obj) {
        int U = l.U(i10);
        if (bVar == u1.b.f8014a4) {
            U *= 2;
        }
        return U + e(bVar, obj);
    }

    static int e(u1.b bVar, Object obj) {
        switch (a.f8039b[bVar.ordinal()]) {
            case 1:
                return l.j(((Double) obj).doubleValue());
            case 2:
                return l.r(((Float) obj).floatValue());
            case 3:
                return l.y(((Long) obj).longValue());
            case 4:
                return l.Y(((Long) obj).longValue());
            case 5:
                return l.w(((Integer) obj).intValue());
            case 6:
                return l.p(((Long) obj).longValue());
            case 7:
                return l.n(((Integer) obj).intValue());
            case 8:
                return l.e(((Boolean) obj).booleanValue());
            case 9:
                return l.t((s0) obj);
            case 10:
                return obj instanceof e0 ? l.B((e0) obj) : l.G((s0) obj);
            case 11:
                return obj instanceof i ? l.h((i) obj) : l.T((String) obj);
            case 12:
                return obj instanceof i ? l.h((i) obj) : l.f((byte[]) obj);
            case 13:
                return l.W(((Integer) obj).intValue());
            case 14:
                return l.L(((Integer) obj).intValue());
            case 15:
                return l.N(((Long) obj).longValue());
            case 16:
                return l.P(((Integer) obj).intValue());
            case 17:
                return l.R(((Long) obj).longValue());
            case 18:
                return obj instanceof b0.c ? l.l(((b0.c) obj).c()) : l.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        u1.b f10 = bVar.f();
        int c10 = bVar.c();
        if (bVar.e()) {
            int i10 = 0;
            List<Object> list = (List) obj;
            if (bVar.k()) {
                for (Object obj2 : list) {
                    i10 += e(f10, obj2);
                }
                return l.U(c10) + i10 + l.J(i10);
            }
            for (Object obj3 : list) {
                i10 += d(f10, c10, obj3);
            }
            return i10;
        }
        return d(f10, c10, obj);
    }

    public static <T extends b<T>> v<T> h() {
        return f8034d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.i() != u1.c.MESSAGE || key.e() || key.k()) {
            return f(key, value);
        }
        boolean z10 = value instanceof e0;
        int c10 = entry.getKey().c();
        return z10 ? l.z(c10, (e0) value) : l.D(c10, (s0) value);
    }

    private static <T extends b<T>> boolean p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.i() == u1.c.MESSAGE) {
            boolean e10 = key.e();
            Object value = entry.getValue();
            if (e10) {
                for (s0 s0Var : (List) value) {
                    if (!s0Var.c()) {
                        return false;
                    }
                }
            } else if (!(value instanceof s0)) {
                if (!(value instanceof e0)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                return true;
            } else if (!((s0) value).c()) {
                return false;
            }
        }
        return true;
    }

    private static boolean q(u1.b bVar, Object obj) {
        b0.a(obj);
        switch (a.f8038a[bVar.b().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof i) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof b0.c);
            case 9:
                return (obj instanceof s0) || (obj instanceof e0);
            default:
                return false;
        }
    }

    private void u(Map.Entry<T, Object> entry) {
        Object obj;
        k1<T, Object> k1Var;
        Object i10;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof e0) {
            value = ((e0) value).f();
        }
        if (key.e()) {
            Object i11 = i(key);
            if (i11 == null) {
                i11 = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                ((List) i11).add(c(obj2));
            }
            this.f8035a.put(key, i11);
            return;
        }
        if (key.i() != u1.c.MESSAGE || (i10 = i(key)) == null) {
            k1Var = this.f8035a;
            obj = c(value);
        } else {
            obj = key.u(((s0) i10).g(), (s0) value).b();
            k1Var = this.f8035a;
        }
        k1Var.put(key, obj);
    }

    public static <T extends b<T>> v<T> v() {
        return new v<>();
    }

    private void x(u1.b bVar, Object obj) {
        if (q(bVar, obj)) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public void a(T t10, Object obj) {
        List list;
        if (t10.e()) {
            x(t10.f(), obj);
            Object i10 = i(t10);
            if (i10 == null) {
                list = new ArrayList();
                this.f8035a.put(t10, list);
            } else {
                list = (List) i10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public v<T> clone() {
        v<T> v10 = v();
        for (int i10 = 0; i10 < this.f8035a.l(); i10++) {
            Map.Entry<T, Object> k10 = this.f8035a.k(i10);
            v10.w(k10.getKey(), k10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f8035a.n()) {
            v10.w(entry.getKey(), entry.getValue());
        }
        v10.f8037c = this.f8037c;
        return v10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f8035a.equals(((v) obj).f8035a);
        }
        return false;
    }

    public Iterator<Map.Entry<T, Object>> g() {
        return this.f8037c ? new e0.c(this.f8035a.i().iterator()) : this.f8035a.i().iterator();
    }

    public int hashCode() {
        return this.f8035a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f8035a.get(t10);
        return obj instanceof e0 ? ((e0) obj).f() : obj;
    }

    public int j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f8035a.l(); i11++) {
            i10 += k(this.f8035a.k(i11));
        }
        for (Map.Entry<T, Object> entry : this.f8035a.n()) {
            i10 += k(entry);
        }
        return i10;
    }

    public int l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f8035a.l(); i11++) {
            Map.Entry<T, Object> k10 = this.f8035a.k(i11);
            i10 += f(k10.getKey(), k10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f8035a.n()) {
            i10 += f(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public boolean m() {
        return this.f8035a.isEmpty();
    }

    public boolean n() {
        return this.f8036b;
    }

    public boolean o() {
        for (int i10 = 0; i10 < this.f8035a.l(); i10++) {
            if (!p(this.f8035a.k(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f8035a.n()) {
            if (!p(entry)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> r() {
        return this.f8037c ? new e0.c(this.f8035a.entrySet().iterator()) : this.f8035a.entrySet().iterator();
    }

    public void s() {
        if (this.f8036b) {
            return;
        }
        this.f8035a.q();
        this.f8036b = true;
    }

    public void t(v<T> vVar) {
        for (int i10 = 0; i10 < vVar.f8035a.l(); i10++) {
            u(vVar.f8035a.k(i10));
        }
        for (Map.Entry<T, Object> entry : vVar.f8035a.n()) {
            u(entry);
        }
    }

    public void w(T t10, Object obj) {
        if (!t10.e()) {
            x(t10.f(), obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object obj2 : arrayList) {
                x(t10.f(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof e0) {
            this.f8037c = true;
        }
        this.f8035a.put(t10, obj);
    }
}
