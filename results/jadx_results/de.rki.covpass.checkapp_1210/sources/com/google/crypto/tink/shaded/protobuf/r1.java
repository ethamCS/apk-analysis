package com.google.crypto.tink.shaded.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public class r1 extends AbstractList<String> implements h0, RandomAccess {

    /* renamed from: c */
    private final h0 f7975c;

    /* loaded from: classes.dex */
    class a implements ListIterator<String>, Iterator {

        /* renamed from: c */
        ListIterator<String> f7976c;

        /* renamed from: d */
        final /* synthetic */ int f7977d;

        a(int i10) {
            r1.this = r1;
            this.f7977d = i10;
            this.f7976c = r1.f7975c.listIterator(i10);
        }

        /* renamed from: b */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f7976c.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f7976c.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f7976c.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f7976c.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f7976c.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f7976c.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    class b implements java.util.Iterator<String>, Iterator {

        /* renamed from: c */
        java.util.Iterator<String> f7979c;

        b() {
            r1.this = r1;
            this.f7979c = r1.f7975c.iterator();
        }

        /* renamed from: b */
        public String next() {
            return this.f7979c.next();
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f7979c.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public r1(h0 h0Var) {
        this.f7975c = h0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public Object A(int i10) {
        return this.f7975c.A(i10);
    }

    /* renamed from: b */
    public String get(int i10) {
        return (String) this.f7975c.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public h0 g() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<String> iterator() {
        return new b();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public List<?> j() {
        return this.f7975c.j();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7975c.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public void y(i iVar) {
        throw new UnsupportedOperationException();
    }
}
