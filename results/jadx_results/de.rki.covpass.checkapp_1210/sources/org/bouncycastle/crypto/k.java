package org.bouncycastle.crypto;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes3.dex */
public class k extends Permission {

    /* renamed from: c */
    private final Set<String> f18652c;

    public k(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.f18652c = hashSet;
        hashSet.add(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && this.f18652c.equals(((k) obj).f18652c);
    }

    @Override // java.security.Permission
    public String getActions() {
        return this.f18652c.toString();
    }

    public int hashCode() {
        return this.f18652c.hashCode();
    }

    @Override // java.security.Permission
    public boolean implies(Permission permission) {
        if (permission instanceof k) {
            k kVar = (k) permission;
            return getName().equals(kVar.getName()) || this.f18652c.containsAll(kVar.f18652c);
        }
        return false;
    }
}
