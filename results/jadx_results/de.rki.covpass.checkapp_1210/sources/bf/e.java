package bf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012&\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¨\u0006\u000f"}, d2 = {"Lbf/e;", "Laf/h;", "Lnc/g;", BuildConfig.FLAVOR, "iterator", BuildConfig.FLAVOR, "input", BuildConfig.FLAVOR, "startIndex", "limit", "Lkotlin/Function2;", "Ltb/r;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILgc/p;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class e implements af.h<nc.g> {

    /* renamed from: a */
    private final CharSequence f5992a;

    /* renamed from: b */
    private final int f5993b;

    /* renamed from: c */
    private final int f5994c;

    /* renamed from: d */
    private final gc.p<CharSequence, Integer, tb.r<Integer, Integer>> f5995d;

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¨\u0006\b"}, d2 = {"bf/e$a", BuildConfig.FLAVOR, "Lnc/g;", "Ltb/e0;", "b", "d", BuildConfig.FLAVOR, "hasNext", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<nc.g>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private int f5996c = -1;

        /* renamed from: d */
        private int f5997d;

        /* renamed from: q */
        private int f5998q;

        /* renamed from: x */
        private nc.g f5999x;

        /* renamed from: y */
        private int f6000y;

        a() {
            int f10;
            e.this = r3;
            f10 = nc.m.f(r3.f5993b, 0, r3.f5992a.length());
            this.f5997d = f10;
            this.f5998q = f10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < bf.e.this.f5994c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.f5998q
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f5996c = r1
                r0 = 0
                r6.f5999x = r0
                goto L99
            Lc:
                bf.e r0 = bf.e.this
                int r0 = bf.e.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f6000y
                int r0 = r0 + r3
                r6.f6000y = r0
                bf.e r4 = bf.e.this
                int r4 = bf.e.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f5998q
                bf.e r4 = bf.e.this
                java.lang.CharSequence r4 = bf.e.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                nc.g r0 = new nc.g
                int r1 = r6.f5997d
                bf.e r4 = bf.e.this
                java.lang.CharSequence r4 = bf.e.c(r4)
                int r4 = bf.o.U(r4)
                r0.<init>(r1, r4)
            L42:
                r6.f5999x = r0
            L44:
                r6.f5998q = r2
                goto L97
            L47:
                bf.e r0 = bf.e.this
                gc.p r0 = bf.e.b(r0)
                bf.e r4 = bf.e.this
                java.lang.CharSequence r4 = bf.e.c(r4)
                int r5 = r6.f5998q
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.u(r4, r5)
                tb.r r0 = (tb.r) r0
                if (r0 != 0) goto L73
                nc.g r0 = new nc.g
                int r1 = r6.f5997d
                bf.e r4 = bf.e.this
                java.lang.CharSequence r4 = bf.e.c(r4)
                int r4 = bf.o.U(r4)
                r0.<init>(r1, r4)
                goto L42
            L73:
                java.lang.Object r2 = r0.b()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.c()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f5997d
                nc.g r4 = nc.k.i(r4, r2)
                r6.f5999x = r4
                int r2 = r2 + r0
                r6.f5997d = r2
                if (r0 != 0) goto L95
                r1 = r3
            L95:
                int r2 = r2 + r1
                goto L44
            L97:
                r6.f5996c = r3
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bf.e.a.b():void");
        }

        /* renamed from: d */
        public nc.g next() {
            if (this.f5996c == -1) {
                b();
            }
            if (this.f5996c != 0) {
                nc.g gVar = this.f5999x;
                hc.t.c(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f5999x = null;
                this.f5996c = -1;
                return gVar;
            }
            throw new NoSuchElementException();
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super nc.g> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            if (this.f5996c == -1) {
                b();
            }
            return this.f5996c == 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence charSequence, int i10, int i11, gc.p<? super CharSequence, ? super Integer, tb.r<Integer, Integer>> pVar) {
        hc.t.e(charSequence, "input");
        hc.t.e(pVar, "getNextMatch");
        this.f5992a = charSequence;
        this.f5993b = i10;
        this.f5994c = i11;
        this.f5995d = pVar;
    }

    @Override // af.h
    public java.util.Iterator<nc.g> iterator() {
        return new a();
    }
}
