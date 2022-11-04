package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    private final x0.b f3891a;

    /* renamed from: b */
    private final char[] f3892b;

    /* renamed from: c */
    private final a f3893c = new a(1024);

    /* renamed from: d */
    private final Typeface f3894d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final SparseArray<a> f3895a;

        /* renamed from: b */
        private f f3896b;

        private a() {
            this(1);
        }

        a(int i10) {
            this.f3895a = new SparseArray<>(i10);
        }

        public a a(int i10) {
            SparseArray<a> sparseArray = this.f3895a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        public final f b() {
            return this.f3896b;
        }

        void c(f fVar, int i10, int i11) {
            a a10 = a(fVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f3895a.put(fVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(fVar, i10 + 1, i11);
            } else {
                a10.f3896b = fVar;
            }
        }
    }

    private l(Typeface typeface, x0.b bVar) {
        this.f3894d = typeface;
        this.f3891a = bVar;
        this.f3892b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(x0.b bVar) {
        int k10 = bVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            f fVar = new f(this, i10);
            Character.toChars(fVar.f(), this.f3892b, i10 * 2);
            h(fVar);
        }
    }

    public static l b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            androidx.core.os.i.a("EmojiCompat.MetadataRepo.create");
            return new l(typeface, k.b(byteBuffer));
        } finally {
            androidx.core.os.i.b();
        }
    }

    public char[] c() {
        return this.f3892b;
    }

    public x0.b d() {
        return this.f3891a;
    }

    public int e() {
        return this.f3891a.l();
    }

    public a f() {
        return this.f3893c;
    }

    public Typeface g() {
        return this.f3894d;
    }

    void h(f fVar) {
        androidx.core.util.h.h(fVar, "emoji metadata cannot be null");
        androidx.core.util.h.b(fVar.c() > 0, "invalid metadata codepoint length");
        this.f3893c.c(fVar, 0, fVar.c() - 1);
    }
}
