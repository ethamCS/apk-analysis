package cb;

import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import ub.m;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcb/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "opcode", "I", "g", "()I", BuildConfig.FLAVOR, "controlFrame", "<init>", "(Ljava/lang/String;IZI)V", "a", "TEXT", "BINARY", "CLOSE", "PING", "PONG", "ktor-http-cio"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public enum d {
    TEXT(false, 1),
    BINARY(false, 2),
    CLOSE(true, 8),
    PING(true, 9),
    PONG(true, 10);
    
    public static final a Companion = new a(null);

    /* renamed from: q */
    private static final int f6420q;

    /* renamed from: x */
    private static final d[] f6421x;

    /* renamed from: c */
    private final boolean f6423c;

    /* renamed from: d */
    private final int f6424d;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcb/d$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lcb/d;", "byOpcodeArray", "[Lcb/d;", BuildConfig.FLAVOR, "maxOpcode", "I", "<init>", "()V", "ktor-http-cio"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        d dVar;
        int E;
        d[] values = values();
        if (values.length == 0) {
            dVar = null;
        } else {
            dVar = values[0];
            E = m.E(values);
            if (E != 0) {
                int g10 = dVar.g();
                if (1 <= E) {
                    int i10 = 1;
                    while (true) {
                        int i11 = i10 + 1;
                        d dVar2 = values[i10];
                        int g11 = dVar2.g();
                        if (g10 < g11) {
                            dVar = dVar2;
                            g10 = g11;
                        }
                        if (i10 == E) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            }
        }
        t.b(dVar);
        int i12 = dVar.f6424d;
        f6420q = i12;
        int i13 = i12 + 1;
        d[] dVarArr = new d[i13];
        int i14 = 0;
        while (i14 < i13) {
            d[] values2 = values();
            int length = values2.length;
            d dVar3 = null;
            int i15 = 0;
            boolean z10 = false;
            while (true) {
                if (i15 < length) {
                    d dVar4 = values2[i15];
                    i15++;
                    if (dVar4.g() == i14) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        dVar3 = dVar4;
                    }
                } else if (z10) {
                }
            }
            dVar3 = null;
            dVarArr[i14] = dVar3;
            i14++;
        }
        f6421x = dVarArr;
    }

    d(boolean z10, int i10) {
        this.f6423c = z10;
        this.f6424d = i10;
    }

    public final int g() {
        return this.f6424d;
    }
}
