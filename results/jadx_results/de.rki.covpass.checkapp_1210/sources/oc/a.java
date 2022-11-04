package oc;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, d2 = {"Loc/a;", "Ljava/lang/reflect/GenericArrayType;", BuildConfig.FLAVOR, "Ljava/lang/reflect/Type;", "getGenericComponentType", BuildConfig.FLAVOR, "getTypeName", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", "toString", "elementType", "<init>", "(Ljava/lang/reflect/Type;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a implements GenericArrayType, Type {

    /* renamed from: c */
    private final Type f17796c;

    public a(Type type) {
        hc.t.e(type, "elementType");
        this.f17796c = type;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && hc.t.a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f17796c;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String h10;
        StringBuilder sb2 = new StringBuilder();
        h10 = t.h(this.f17796c);
        sb2.append(h10);
        sb2.append("[]");
        return sb2.toString();
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
