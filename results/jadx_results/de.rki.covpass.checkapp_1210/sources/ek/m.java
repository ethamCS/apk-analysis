package ek;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
/* loaded from: classes3.dex */
public class m implements n {

    /* renamed from: c */
    private Collection f9717c;

    public m(Collection collection) {
        Objects.requireNonNull(collection, "collection cannot be null");
        this.f9717c = collection;
    }

    public Collection a() {
        return new ArrayList(this.f9717c);
    }

    public Object clone() {
        return new m(this.f9717c);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("X509CollectionStoreParameters: [\n");
        stringBuffer.append("  collection: " + this.f9717c + "\n");
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
