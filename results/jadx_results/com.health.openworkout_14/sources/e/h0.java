package e;

import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h0 {

        /* renamed from: a */
        final /* synthetic */ b0 f3986a;

        /* renamed from: b */
        final /* synthetic */ f.f f3987b;

        a(b0 b0Var, f.f fVar) {
            this.f3986a = b0Var;
            this.f3987b = fVar;
        }

        @Override // e.h0
        public long a() {
            return this.f3987b.r();
        }

        @Override // e.h0
        @Nullable
        public b0 b() {
            return this.f3986a;
        }

        @Override // e.h0
        public void h(f.d dVar) {
            dVar.j(this.f3987b);
        }
    }

    /* loaded from: classes.dex */
    public class b extends h0 {

        /* renamed from: a */
        final /* synthetic */ b0 f3988a;

        /* renamed from: b */
        final /* synthetic */ int f3989b;

        /* renamed from: c */
        final /* synthetic */ byte[] f3990c;

        /* renamed from: d */
        final /* synthetic */ int f3991d;

        b(b0 b0Var, int i, byte[] bArr, int i2) {
            this.f3988a = b0Var;
            this.f3989b = i;
            this.f3990c = bArr;
            this.f3991d = i2;
        }

        @Override // e.h0
        public long a() {
            return this.f3989b;
        }

        @Override // e.h0
        @Nullable
        public b0 b() {
            return this.f3988a;
        }

        @Override // e.h0
        public void h(f.d dVar) {
            dVar.f(this.f3990c, this.f3991d, this.f3989b);
        }
    }

    public static h0 c(@Nullable b0 b0Var, f.f fVar) {
        return new a(b0Var, fVar);
    }

    public static h0 d(@Nullable b0 b0Var, byte[] bArr) {
        return e(b0Var, bArr, 0, bArr.length);
    }

    public static h0 e(@Nullable b0 b0Var, byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "content == null");
        e.m0.e.d(bArr.length, i, i2);
        return new b(b0Var, i2, bArr, i);
    }

    public long a() {
        return -1L;
    }

    @Nullable
    public abstract b0 b();

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public abstract void h(f.d dVar);
}
