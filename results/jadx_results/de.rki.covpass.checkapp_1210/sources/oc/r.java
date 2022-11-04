package oc;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016¨\u0006\u0018"}, d2 = {"Loc/r;", "Ljava/lang/reflect/ParameterizedType;", BuildConfig.FLAVOR, "Ljava/lang/reflect/Type;", "getRawType", "getOwnerType", BuildConfig.FLAVOR, "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", BuildConfig.FLAVOR, "getTypeName", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", "toString", "Ljava/lang/Class;", "rawType", "ownerType", BuildConfig.FLAVOR, "typeArguments", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class r implements ParameterizedType, Type {

    /* renamed from: c */
    private final Class<?> f17809c;

    /* renamed from: d */
    private final Type f17810d;

    /* renamed from: q */
    private final Type[] f17811q;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends hc.q implements gc.l<Type, String> {
        public static final a Y3 = new a();

        a() {
            super(1, t.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        /* renamed from: i0 */
        public final String invoke(Type type) {
            String h10;
            hc.t.e(type, "p0");
            h10 = t.h(type);
            return h10;
        }
    }

    public r(Class<?> cls, Type type, List<? extends Type> list) {
        hc.t.e(cls, "rawType");
        hc.t.e(list, "typeArguments");
        this.f17809c = cls;
        this.f17810d = type;
        Object[] array = list.toArray(new Type[0]);
        hc.t.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f17811q = (Type[]) array;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (hc.t.a(this.f17809c, parameterizedType.getRawType()) && hc.t.a(this.f17810d, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f17811q;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f17810d;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f17809c;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String str;
        String h10;
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f17810d;
        if (type != null) {
            h10 = t.h(type);
            sb2.append(h10);
            sb2.append("$");
            str = this.f17809c.getSimpleName();
        } else {
            str = t.h(this.f17809c);
        }
        sb2.append(str);
        Type[] typeArr = this.f17811q;
        if (!(typeArr.length == 0)) {
            ub.m.L(typeArr, sb2, null, "<", ">", 0, null, a.Y3, 50, null);
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public int hashCode() {
        int hashCode = this.f17809c.hashCode();
        Type type = this.f17810d;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
