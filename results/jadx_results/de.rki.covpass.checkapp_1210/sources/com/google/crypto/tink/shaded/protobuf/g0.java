package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public class g0 extends c<String> implements h0, RandomAccess {

    /* renamed from: q */
    private static final g0 f7875q;

    /* renamed from: x */
    public static final h0 f7876x;

    /* renamed from: d */
    private final List<Object> f7877d;

    static {
        g0 g0Var = new g0();
        f7875q = g0Var;
        g0Var.p();
        f7876x = g0Var;
    }

    public g0() {
        this(10);
    }

    public g0(int i10) {
        this(new ArrayList(i10));
    }

    private g0(ArrayList<Object> arrayList) {
        this.f7877d = arrayList;
    }

    private static String c(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof i ? ((i) obj).f0() : b0.j((byte[]) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public Object A(int i10) {
        return this.f7877d.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, com.google.crypto.tink.shaded.protobuf.b0.i
    public /* bridge */ /* synthetic */ boolean I() {
        return super.I();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        a();
        if (collection instanceof h0) {
            collection = ((h0) collection).j();
        }
        boolean addAll = this.f7877d.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public void add(int i10, String str) {
        a();
        this.f7877d.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f7877d.clear();
        ((AbstractList) this).modCount++;
    }

    /* renamed from: d */
    public String get(int i10) {
        Object obj = this.f7877d.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String f02 = iVar.f0();
            if (iVar.u()) {
                this.f7877d.set(i10, f02);
            }
            return f02;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = b0.j(bArr);
        if (b0.g(bArr)) {
            this.f7877d.set(i10, j10);
        }
        return j10;
    }

    /* renamed from: e */
    public g0 t(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f7877d);
            return new g0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public String remove(int i10) {
        a();
        Object remove = this.f7877d.remove(i10);
        ((AbstractList) this).modCount++;
        return c(remove);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public h0 g() {
        return I() ? new r1(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public String set(int i10, String str) {
        a();
        return c(this.f7877d.set(i10, str));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public List<?> j() {
        return Collections.unmodifiableList(this.f7877d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7877d.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public void y(i iVar) {
        a();
        this.f7877d.add(iVar);
        ((AbstractList) this).modCount++;
    }
}
