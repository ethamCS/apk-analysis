package kf;

import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\f\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0002\u001a$\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\"\b\b\u0000\u0010\n*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0000¨\u0006\u000e"}, d2 = {BuildConfig.FLAVOR, "serialName", "Lif/e;", "kind", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "Ltb/e0;", "d", "c", BuildConfig.FLAVOR, "T", "Loc/d;", "Lkotlinx/serialization/KSerializer;", "b", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a */
    private static final Map<oc.d<? extends Object>, KSerializer<? extends Object>> f15156a;

    static {
        Map<oc.d<? extends Object>, KSerializer<? extends Object>> k10;
        k10 = ub.q0.k(tb.x.a(hc.k0.b(String.class), BuiltinSerializersKt.serializer(hc.p0.f11777a)), tb.x.a(hc.k0.b(Character.TYPE), BuiltinSerializersKt.serializer(hc.i.f11762a)), tb.x.a(hc.k0.b(char[].class), BuiltinSerializersKt.d()), tb.x.a(hc.k0.b(Double.TYPE), BuiltinSerializersKt.serializer(hc.m.f11773a)), tb.x.a(hc.k0.b(double[].class), BuiltinSerializersKt.e()), tb.x.a(hc.k0.b(Float.TYPE), BuiltinSerializersKt.serializer(hc.n.f11774a)), tb.x.a(hc.k0.b(float[].class), BuiltinSerializersKt.f()), tb.x.a(hc.k0.b(Long.TYPE), BuiltinSerializersKt.serializer(hc.w.f11786a)), tb.x.a(hc.k0.b(long[].class), BuiltinSerializersKt.i()), tb.x.a(hc.k0.b(Integer.TYPE), BuiltinSerializersKt.serializer(hc.s.f11779a)), tb.x.a(hc.k0.b(int[].class), BuiltinSerializersKt.g()), tb.x.a(hc.k0.b(Short.TYPE), BuiltinSerializersKt.serializer(hc.n0.f11775a)), tb.x.a(hc.k0.b(short[].class), BuiltinSerializersKt.n()), tb.x.a(hc.k0.b(Byte.TYPE), BuiltinSerializersKt.serializer(hc.g.f11753a)), tb.x.a(hc.k0.b(byte[].class), BuiltinSerializersKt.c()), tb.x.a(hc.k0.b(Boolean.TYPE), BuiltinSerializersKt.serializer(hc.f.f11752a)), tb.x.a(hc.k0.b(boolean[].class), BuiltinSerializersKt.b()), tb.x.a(hc.k0.b(tb.e0.class), BuiltinSerializersKt.serializer(tb.e0.f22152a)));
        f15156a = k10;
    }

    public static final SerialDescriptor a(String str, p000if.e eVar) {
        hc.t.e(str, "serialName");
        hc.t.e(eVar, "kind");
        d(str);
        return new d1(str, eVar);
    }

    public static final <T> KSerializer<T> b(oc.d<T> dVar) {
        hc.t.e(dVar, "<this>");
        return (KSerializer<T>) f15156a.get(dVar);
    }

    private static final String c(String str) {
        if (str.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = str.charAt(0);
            sb2.append((Object) (Character.isLowerCase(charAt) ? bf.c.g(charAt) : String.valueOf(charAt)));
            String substring = str.substring(1);
            hc.t.d(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            return sb2.toString();
        }
        return str;
    }

    private static final void d(String str) {
        boolean v10;
        String f10;
        boolean v11;
        for (oc.d<? extends Object> dVar : f15156a.keySet()) {
            String G = dVar.G();
            hc.t.b(G);
            String c10 = c(G);
            v10 = bf.x.v(str, "kotlin." + c10, true);
            if (!v10) {
                v11 = bf.x.v(str, c10, true);
                if (v11) {
                }
            }
            f10 = bf.q.f("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + c(c10) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
            throw new IllegalArgumentException(f10);
        }
    }
}
