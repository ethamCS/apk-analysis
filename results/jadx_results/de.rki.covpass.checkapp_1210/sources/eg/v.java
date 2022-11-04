package eg;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u000fB1\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u000e\u0010\u0017J\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0003\u001a\u00020\u0000J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u0018"}, d2 = {"Leg/v;", BuildConfig.FLAVOR, "d", "f", "b", "segment", "c", BuildConfig.FLAVOR, "byteCount", "e", "Ltb/e0;", "a", "sink", "g", "<init>", "()V", BuildConfig.FLAVOR, "data", "pos", "limit", BuildConfig.FLAVOR, "shared", "owner", "([BIIZZ)V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class v {
    public static final a Companion = new a(null);

    /* renamed from: a */
    public final byte[] f9650a;

    /* renamed from: b */
    public int f9651b;

    /* renamed from: c */
    public int f9652c;

    /* renamed from: d */
    public boolean f9653d;

    /* renamed from: e */
    public boolean f9654e;

    /* renamed from: f */
    public v f9655f;

    /* renamed from: g */
    public v f9656g;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Leg/v$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "SHARE_MINIMUM", "I", "SIZE", "<init>", "()V", "okio"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public v() {
        this.f9650a = new byte[8192];
        this.f9654e = true;
        this.f9653d = false;
    }

    public v(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        hc.t.e(bArr, "data");
        this.f9650a = bArr;
        this.f9651b = i10;
        this.f9652c = i11;
        this.f9653d = z10;
        this.f9654e = z11;
    }

    public final void a() {
        v vVar = this.f9656g;
        int i10 = 0;
        if (vVar != this) {
            hc.t.b(vVar);
            if (!vVar.f9654e) {
                return;
            }
            int i11 = this.f9652c - this.f9651b;
            v vVar2 = this.f9656g;
            hc.t.b(vVar2);
            int i12 = 8192 - vVar2.f9652c;
            v vVar3 = this.f9656g;
            hc.t.b(vVar3);
            if (!vVar3.f9653d) {
                v vVar4 = this.f9656g;
                hc.t.b(vVar4);
                i10 = vVar4.f9651b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            v vVar5 = this.f9656g;
            hc.t.b(vVar5);
            g(vVar5, i11);
            b();
            w.b(this);
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final v b() {
        v vVar = this.f9655f;
        if (vVar == this) {
            vVar = null;
        }
        v vVar2 = this.f9656g;
        hc.t.b(vVar2);
        vVar2.f9655f = this.f9655f;
        v vVar3 = this.f9655f;
        hc.t.b(vVar3);
        vVar3.f9656g = this.f9656g;
        this.f9655f = null;
        this.f9656g = null;
        return vVar;
    }

    public final v c(v vVar) {
        hc.t.e(vVar, "segment");
        vVar.f9656g = this;
        vVar.f9655f = this.f9655f;
        v vVar2 = this.f9655f;
        hc.t.b(vVar2);
        vVar2.f9656g = vVar;
        this.f9655f = vVar;
        return vVar;
    }

    public final v d() {
        this.f9653d = true;
        return new v(this.f9650a, this.f9651b, this.f9652c, true, false);
    }

    public final v e(int i10) {
        v vVar;
        if (i10 > 0 && i10 <= this.f9652c - this.f9651b) {
            if (i10 >= 1024) {
                vVar = d();
            } else {
                vVar = w.c();
                byte[] bArr = this.f9650a;
                byte[] bArr2 = vVar.f9650a;
                int i11 = this.f9651b;
                ub.l.g(bArr, bArr2, 0, i11, i11 + i10, 2, null);
            }
            vVar.f9652c = vVar.f9651b + i10;
            this.f9651b += i10;
            v vVar2 = this.f9656g;
            hc.t.b(vVar2);
            vVar2.c(vVar);
            return vVar;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final v f() {
        byte[] bArr = this.f9650a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        hc.t.d(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new v(copyOf, this.f9651b, this.f9652c, false, true);
    }

    public final void g(v vVar, int i10) {
        hc.t.e(vVar, "sink");
        if (vVar.f9654e) {
            int i11 = vVar.f9652c;
            if (i11 + i10 > 8192) {
                if (vVar.f9653d) {
                    throw new IllegalArgumentException();
                }
                int i12 = vVar.f9651b;
                if ((i11 + i10) - i12 > 8192) {
                    throw new IllegalArgumentException();
                }
                byte[] bArr = vVar.f9650a;
                ub.l.g(bArr, bArr, 0, i12, i11, 2, null);
                vVar.f9652c -= vVar.f9651b;
                vVar.f9651b = 0;
            }
            byte[] bArr2 = this.f9650a;
            byte[] bArr3 = vVar.f9650a;
            int i13 = vVar.f9652c;
            int i14 = this.f9651b;
            ub.l.e(bArr2, bArr3, i13, i14, i14 + i10);
            vVar.f9652c += i10;
            this.f9651b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
}
