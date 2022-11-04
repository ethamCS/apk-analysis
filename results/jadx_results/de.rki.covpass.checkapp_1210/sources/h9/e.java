package h9;

import android.util.Base64;
import de.rki.covpass.sdk.revocation.RevocationIndexByte2Entry;
import de.rki.covpass.sdk.revocation.RevocationIndexEntry;
import de.rki.covpass.sdk.revocation.database.RevocationDatabase;
import h9.g;
import hc.k0;
import j$.time.Instant;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerializersKt;
import org.conscrypt.BuildConfig;
import s4.b1;
import s4.l0;
import s4.v0;
import s4.x0;
import ua.c;
@Metadata(bv = {}, d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0005defghB/\u0012\u0006\u0010Z\u001a\u00020Y\u0012\u0006\u0010[\u001a\u00020:\u0012\u0006\u0010]\u001a\u00020\\\u0012\u0006\u0010_\u001a\u00020^\u0012\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0005J\u0013\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005J\u0013\u0010\f\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0005J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0013\u0010\u000f\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0005J\u0013\u0010\u0010\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0005J\u001b\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0005J\u0013\u0010\u0017\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0005J+\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010#\u001a\u00020\n2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J)\u0010&\u001a\u00020\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\u001a\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J)\u0010)\u001a\u00020\n2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u001a\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b)\u0010'J\u001b\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0014J+\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b1\u00102J3\u00105\u001a\u0002042\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b5\u00106J;\u00108\u001a\u0002042\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b8\u00109J%\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010;\u001a\u00020:2\u0006\u0010*\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u0010\u0010A\u001a\u00020\n2\u0006\u0010@\u001a\u00020?H\u0002J\u0019\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\bC\u0010\u0005J/\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00180D2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ1\u0010G\u001a\b\u0012\u0004\u0012\u00020-0\u00022\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ9\u0010I\u001a\b\u0012\u0004\u0012\u00020-0\u00022\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u0013\u0010K\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\bK\u0010\u0005J\u0013\u0010L\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\bL\u0010\u0005R\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020\r0M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00110M8\u0006¢\u0006\f\n\u0004\bR\u0010O\u001a\u0004\bS\u0010QR\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020\r0T8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006i"}, d2 = {"Lh9/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Li9/j;", "D", "(Lxb/d;)Ljava/lang/Object;", "Li9/c;", "z", "Li9/f;", "B", "Ltb/e0;", "H", "R", BuildConfig.FLAVOR, "G", "K", "L", "j$/time/Instant", "instant", "P", "(Lj$/time/Instant;Lxb/d;)Ljava/lang/Object;", "Q", "O", "N", "Lde/rki/covpass/sdk/revocation/RevocationIndexEntry;", "revocationIndexEntry", "revocationIndexLocal", BuildConfig.FLAVOR, "byteOne", "J", "(Lde/rki/covpass/sdk/revocation/RevocationIndexEntry;Li9/j;BLxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/revocation/RevocationIndexByte2Entry;", "byte2Entry", "indexEntry", "M", "(Ljava/util/Map$Entry;Li9/j;BLxb/d;)Ljava/lang/Object;", "filteredOldByteOneList", "p", "(Ljava/util/List;Li9/j;Lxb/d;)Ljava/lang/Object;", "filteredOldByteTwoList", "q", "lastUpdate", "Lh9/e$d;", "u", BuildConfig.FLAVOR, "kid", "hashType", "Lh9/e$c;", "t", "([BBLj$/time/Instant;Lxb/d;)Ljava/lang/Object;", "byte1", "Lh9/e$a;", "r", "([BBBLj$/time/Instant;Lxb/d;)Ljava/lang/Object;", "byte2", "s", "([BBBBLj$/time/Instant;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "url", "Lh9/e$e;", "F", "(Ljava/lang/String;Lj$/time/Instant;Lxb/d;)Ljava/lang/Object;", "La/u;", "sign1Message", "S", "Li9/o;", "E", BuildConfig.FLAVOR, "C", "([BBLxb/d;)Ljava/lang/Object;", "y", "([BBBLxb/d;)Ljava/lang/Object;", "A", "([BBBBLxb/d;)Ljava/lang/Object;", "I", "o", "Ls4/v0;", "revocationListUpdateIsOn", "Ls4/v0;", "x", "()Ls4/v0;", "lastRevocationUpdateFinish", "v", "Ls4/l0;", "revocationListUpdateCanceled", "Ls4/l0;", "w", "()Ls4/l0;", "Lna/a;", "httpClient", "host", "Lv9/a;", "store", "Lde/rki/covpass/sdk/revocation/database/RevocationDatabase;", "database", "Ljava/security/PublicKey;", "revocationListPublicKey", "<init>", "(Lna/a;Ljava/lang/String;Lv9/a;Lde/rki/covpass/sdk/revocation/database/RevocationDatabase;Ljava/security/PublicKey;)V", "a", "b", "c", "d", "e", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class e {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private final RevocationDatabase f11602a;

    /* renamed from: b */
    private final PublicKey f11603b;

    /* renamed from: c */
    private final na.a f11604c;

    /* renamed from: d */
    private final v0<Boolean> f11605d;

    /* renamed from: e */
    private final v0<Instant> f11606e;

    /* renamed from: f */
    private final v0<Instant> f11607f;

    /* renamed from: g */
    private final v0<h9.c> f11608g;

    /* renamed from: h */
    private final l0<Boolean> f11609h;

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lh9/e$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "chunkList", "Ljava/util/List;", "a", "()Ljava/util/List;", "wasModifiedSince", "<init>", "(ZLjava/util/List;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final boolean f11610a;

        /* renamed from: b */
        private final List<byte[]> f11611b;

        public a(boolean z10, List<byte[]> list) {
            hc.t.e(list, "chunkList");
            this.f11610a = z10;
            this.f11611b = list;
        }

        public final List<byte[]> a() {
            return this.f11611b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11610a == aVar.f11610a && hc.t.a(this.f11611b, aVar.f11611b);
        }

        public int hashCode() {
            boolean z10 = this.f11610a;
            if (z10) {
                z10 = true;
            }
            int i10 = z10 ? 1 : 0;
            int i11 = z10 ? 1 : 0;
            return (i10 * 31) + this.f11611b.hashCode();
        }

        public String toString() {
            boolean z10 = this.f11610a;
            List<byte[]> list = this.f11611b;
            return "ChunkListObject(wasModifiedSince=" + z10 + ", chunkList=" + list + ")";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, d2 = {"Ltb/r;", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/revocation/RevocationIndexEntry;", "<name for destructuring parameter 0>", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository$updateByteTwo$2$1", f = "RevocationLocalListRepository.kt", l = {216}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a0 extends zb.l implements gc.p<tb.r<? extends Byte, ? extends RevocationIndexEntry>, xb.d<? super tb.e0>, Object> {
        Object U3;
        byte V3;
        int W3;
        /* synthetic */ Object X3;
        final /* synthetic */ i9.j Z3;

        /* renamed from: y */
        Object f11612y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(i9.j jVar, xb.d<? super a0> dVar) {
            super(2, dVar);
            e.this = r1;
            this.Z3 = jVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            e eVar;
            i9.j jVar;
            Iterator<Map.Entry<Byte, RevocationIndexByte2Entry>> it;
            byte b10;
            c10 = yb.d.c();
            int i10 = this.W3;
            if (i10 == 0) {
                tb.t.b(obj);
                tb.r rVar = (tb.r) this.X3;
                b10 = ((Number) rVar.b()).byteValue();
                Map<Byte, RevocationIndexByte2Entry> a10 = ((RevocationIndexEntry) rVar.c()).a();
                if (a10 == null) {
                    return null;
                }
                e eVar2 = e.this;
                jVar = this.Z3;
                eVar = eVar2;
                it = a10.entrySet().iterator();
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                b10 = this.V3;
                it = (Iterator) this.U3;
                jVar = (i9.j) this.f11612y;
                eVar = (e) this.X3;
                tb.t.b(obj);
            }
            while (it.hasNext()) {
                this.X3 = eVar;
                this.f11612y = jVar;
                this.U3 = it;
                this.V3 = b10;
                this.W3 = 1;
                if (eVar.M(it.next(), jVar, b10, this) == c10) {
                    return c10;
                }
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(tb.r<Byte, RevocationIndexEntry> rVar, xb.d<? super tb.e0> dVar) {
            return ((a0) j(rVar, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            a0 a0Var = new a0(this.Z3, dVar);
            a0Var.X3 = obj;
            return a0Var;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lh9/e$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "UPDATE_INTERVAL_HOURS", "J", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {345, 353, 360}, m = "updateByteTwoLogic")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b0 extends zb.d {
        Object U3;
        byte V3;
        long W3;
        /* synthetic */ Object X3;
        int Z3;

        /* renamed from: x */
        Object f11613x;

        /* renamed from: y */
        Object f11614y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(xb.d<? super b0> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.X3 = obj;
            this.Z3 |= Integer.MIN_VALUE;
            return e.this.M(null, null, (byte) 0, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lh9/e$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "wasModifiedSince", "Z", "b", "()Z", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/revocation/RevocationIndexEntry;", "indexList", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "<init>", "(ZLjava/util/Map;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final boolean f11615a;

        /* renamed from: b */
        private final Map<Byte, RevocationIndexEntry> f11616b;

        public c(boolean z10, Map<Byte, RevocationIndexEntry> map) {
            hc.t.e(map, "indexList");
            this.f11615a = z10;
            this.f11616b = map;
        }

        public final Map<Byte, RevocationIndexEntry> a() {
            return this.f11616b;
        }

        public final boolean b() {
            return this.f11615a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f11615a == cVar.f11615a && hc.t.a(this.f11616b, cVar.f11616b);
        }

        public int hashCode() {
            boolean z10 = this.f11615a;
            if (z10) {
                z10 = true;
            }
            int i10 = z10 ? 1 : 0;
            int i11 = z10 ? 1 : 0;
            return (i10 * 31) + this.f11616b.hashCode();
        }

        public String toString() {
            boolean z10 = this.f11615a;
            Map<Byte, RevocationIndexEntry> map = this.f11616b;
            return "IndexListObject(wasModifiedSince=" + z10 + ", indexList=" + map + ")";
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {270, 271, 277, 279, 281, 286, 288}, m = "updateIndex")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c0 extends zb.d {
        Object U3;
        Object V3;
        Object W3;
        Object X3;
        byte Y3;
        /* synthetic */ Object Z3;

        /* renamed from: b4 */
        int f11618b4;

        /* renamed from: x */
        Object f11619x;

        /* renamed from: y */
        Object f11620y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(xb.d<? super c0> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.Z3 = obj;
            this.f11618b4 |= Integer.MIN_VALUE;
            return e.this.N(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lh9/e$d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "wasModifiedSince", "Z", "b", "()Z", BuildConfig.FLAVOR, "Lh9/b;", "kidList", "Ljava/util/List;", "a", "()Ljava/util/List;", "<init>", "(ZLjava/util/List;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final boolean f11621a;

        /* renamed from: b */
        private final List<h9.b> f11622b;

        public d(boolean z10, List<h9.b> list) {
            hc.t.e(list, "kidList");
            this.f11621a = z10;
            this.f11622b = list;
        }

        public final List<h9.b> a() {
            return this.f11622b;
        }

        public final boolean b() {
            return this.f11621a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f11621a == dVar.f11621a && hc.t.a(this.f11622b, dVar.f11622b);
        }

        public int hashCode() {
            boolean z10 = this.f11621a;
            if (z10) {
                z10 = true;
            }
            int i10 = z10 ? 1 : 0;
            int i11 = z10 ? 1 : 0;
            return (i10 * 31) + this.f11622b.hashCode();
        }

        public String toString() {
            boolean z10 = this.f11621a;
            List<h9.b> list = this.f11622b;
            return "KidListObject(wasModifiedSince=" + z10 + ", kidList=" + list + ")";
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {244, 248, 252, 262, 263, 264}, m = "updateKidList")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class d0 extends zb.d {
        Object U3;
        /* synthetic */ Object V3;
        int X3;

        /* renamed from: x */
        Object f11623x;

        /* renamed from: y */
        Object f11624y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(xb.d<? super d0> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.V3 = obj;
            this.X3 |= Integer.MIN_VALUE;
            return e.this.O(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lh9/e$e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "wasModifiedSince", "Z", "b", "()Z", "Lt7/o;", "cborObject", "Lt7/o;", "a", "()Lt7/o;", "<init>", "(ZLt7/o;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: h9.e$e */
    /* loaded from: classes.dex */
    public static final class C0173e {

        /* renamed from: a */
        private final boolean f11625a;

        /* renamed from: b */
        private final t7.o f11626b;

        public C0173e(boolean z10, t7.o oVar) {
            this.f11625a = z10;
            this.f11626b = oVar;
        }

        public final t7.o a() {
            return this.f11626b;
        }

        public final boolean b() {
            return this.f11625a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0173e)) {
                return false;
            }
            C0173e c0173e = (C0173e) obj;
            return this.f11625a == c0173e.f11625a && hc.t.a(this.f11626b, c0173e.f11626b);
        }

        public int hashCode() {
            boolean z10 = this.f11625a;
            if (z10) {
                z10 = true;
            }
            int i10 = z10 ? 1 : 0;
            int i11 = z10 ? 1 : 0;
            int i12 = i10 * 31;
            t7.o oVar = this.f11626b;
            return i12 + (oVar == null ? 0 : oVar.hashCode());
        }

        public String toString() {
            boolean z10 = this.f11625a;
            t7.o oVar = this.f11626b;
            return "SignedObject(wasModifiedSince=" + z10 + ", cborObject=" + oVar + ")";
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {127, 129, 138, 139, 145, 146, 152, 154, 161, 163, 169, 172}, m = "updateRevocationList")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class e0 extends zb.d {
        int V3;

        /* renamed from: x */
        Object f11627x;

        /* renamed from: y */
        /* synthetic */ Object f11628y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(xb.d<? super e0> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f11628y = obj;
            this.V3 |= Integer.MIN_VALUE;
            return e.this.R(this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11629a;

        static {
            int[] iArr = new int[h9.c.values().length];
            iArr[h9.c.COMPLETED.ordinal()] = 1;
            iArr[h9.c.KID_LIST.ordinal()] = 2;
            iArr[h9.c.INDEX.ordinal()] = 3;
            iArr[h9.c.BYTE_ONE.ordinal()] = 4;
            iArr[h9.c.BYTE_TWO.ordinal()] = 5;
            f11629a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lna/b;", "Ltb/e0;", "b", "(Lna/b;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends hc.v implements gc.l<na.b<?>, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ String f11630c;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lya/c;", "Ltb/e0;", "b", "(Lya/c;)V"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends hc.v implements gc.l<ya.c, tb.e0> {

            /* renamed from: c */
            final /* synthetic */ String f11631c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f11631c = str;
            }

            public final void b(ya.c cVar) {
                hc.t.e(cVar, "$this$defaultRequest");
                ya.i.c(cVar, this.f11631c);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ tb.e0 invoke(ya.c cVar) {
                b(cVar);
                return tb.e0.f22152a;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lua/c$a;", "Ltb/e0;", "b", "(Lua/c$a;)V"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class b extends hc.v implements gc.l<c.a, tb.e0> {

            /* renamed from: c */
            public static final b f11632c = new b();

            b() {
                super(1);
            }

            public final void b(c.a aVar) {
                hc.t.e(aVar, "$this$install");
                aVar.d(new va.a(f9.b.c()));
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ tb.e0 invoke(c.a aVar) {
                b(aVar);
                return tb.e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(1);
            this.f11630c = str;
        }

        public final void b(na.b<?> bVar) {
            hc.t.e(bVar, "$this$config");
            ta.e.a(bVar, new a(this.f11630c));
            bVar.j(ua.c.f23330d, b.f11632c);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(na.b<?> bVar) {
            b(bVar);
            return tb.e0.f22152a;
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {114, 115, 116, 117, 118}, m = "deleteAll")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class h extends zb.d {
        int V3;

        /* renamed from: x */
        Object f11633x;

        /* renamed from: y */
        /* synthetic */ Object f11634y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(xb.d<? super h> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f11634y = obj;
            this.V3 |= Integer.MIN_VALUE;
            return e.this.o(this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {379, 384}, m = "deleteOldByteOneList")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class i extends zb.d {
        Object U3;
        Object V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f11635x;

        /* renamed from: y */
        Object f11636y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(xb.d<? super i> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return e.this.p(null, null, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {399}, m = "deleteOldByteTwoList")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class j extends zb.d {
        Object U3;
        /* synthetic */ Object V3;
        int X3;

        /* renamed from: x */
        Object f11637x;

        /* renamed from: y */
        Object f11638y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(xb.d<? super j> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.V3 = obj;
            this.X3 |= Integer.MIN_VALUE;
            return e.this.q(null, null, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {436}, m = "getByteOneChunk")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class k extends zb.d {
        int U3;

        /* renamed from: x */
        /* synthetic */ Object f11639x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(xb.d<? super k> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f11639x = obj;
            this.U3 |= Integer.MIN_VALUE;
            return e.this.r(null, (byte) 0, (byte) 0, null, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {451}, m = "getByteTwoChunk")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class l extends zb.d {
        int U3;

        /* renamed from: x */
        /* synthetic */ Object f11641x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(xb.d<? super l> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f11641x = obj;
            this.U3 |= Integer.MIN_VALUE;
            return e.this.s(null, (byte) 0, (byte) 0, (byte) 0, null, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {422}, m = "getIndex")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class m extends zb.d {
        int U3;

        /* renamed from: x */
        /* synthetic */ Object f11643x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(xb.d<? super m> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f11643x = obj;
            this.U3 |= Integer.MIN_VALUE;
            return e.this.t(null, (byte) 0, null, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {410}, m = "getKidList")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class n extends zb.d {
        int U3;

        /* renamed from: x */
        /* synthetic */ Object f11645x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(xb.d<? super n> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f11645x = obj;
            this.U3 |= Integer.MIN_VALUE;
            return e.this.u(null, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {91}, m = "getSavedByteOneChunk")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class o extends zb.d {
        int U3;

        /* renamed from: x */
        /* synthetic */ Object f11647x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(xb.d<? super o> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f11647x = obj;
            this.U3 |= Integer.MIN_VALUE;
            return e.this.y(null, (byte) 0, (byte) 0, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {103}, m = "getSavedByteTwoChunk")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class p extends zb.d {
        int U3;

        /* renamed from: x */
        /* synthetic */ Object f11649x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(xb.d<? super p> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f11649x = obj;
            this.U3 |= Integer.MIN_VALUE;
            return e.this.A(null, (byte) 0, (byte) 0, (byte) 0, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {81}, m = "getSavedIndex")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class q extends zb.d {
        int U3;

        /* renamed from: x */
        /* synthetic */ Object f11651x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(xb.d<? super q> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f11651x = obj;
            this.U3 |= Integer.MIN_VALUE;
            return e.this.C(null, (byte) 0, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {550, 552, 555, 566}, m = "getSigned")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class r extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f11653x;

        /* renamed from: y */
        Object f11654y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(xb.d<? super r> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return e.this.F(null, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class s extends zb.l implements gc.p<Boolean, xb.d<? super tb.e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f11655y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(v0 v0Var, v9.a aVar, xb.d dVar) {
            super(2, dVar);
            this.V3 = v0Var;
            this.W3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f11655y;
            if (i10 == 0) {
                tb.t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Boolean.TYPE)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f11655y = 1;
                if (v0.a.a(v0Var, encodeToString, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(Boolean bool, xb.d<? super tb.e0> dVar) {
            return ((s) j(bool, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            s sVar = new s(this.V3, this.W3, dVar);
            sVar.U3 = obj;
            return sVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class t extends zb.l implements gc.p<Instant, xb.d<? super tb.e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f11656y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(v0 v0Var, v9.a aVar, xb.d dVar) {
            super(2, dVar);
            this.V3 = v0Var;
            this.W3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f11656y;
            if (i10 == 0) {
                tb.t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Instant.class)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f11656y = 1;
                if (v0.a.a(v0Var, encodeToString, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(Instant instant, xb.d<? super tb.e0> dVar) {
            return ((t) j(instant, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            t tVar = new t(this.V3, this.W3, dVar);
            tVar.U3 = obj;
            return tVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class u extends zb.l implements gc.p<Instant, xb.d<? super tb.e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f11657y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(v0 v0Var, v9.a aVar, xb.d dVar) {
            super(2, dVar);
            this.V3 = v0Var;
            this.W3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f11657y;
            if (i10 == 0) {
                tb.t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Instant.class)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f11657y = 1;
                if (v0.a.a(v0Var, encodeToString, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(Instant instant, xb.d<? super tb.e0> dVar) {
            return ((u) j(instant, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            u uVar = new u(this.V3, this.W3, dVar);
            uVar.U3 = obj;
            return uVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class v extends zb.l implements gc.p<h9.c, xb.d<? super tb.e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f11658y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(v0 v0Var, v9.a aVar, xb.d dVar) {
            super(2, dVar);
            this.V3 = v0Var;
            this.W3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f11658y;
            if (i10 == 0) {
                tb.t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(h9.c.class)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f11658y = 1;
                if (v0.a.a(v0Var, encodeToString, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(h9.c cVar, xb.d<? super tb.e0> dVar) {
            return ((v) j(cVar, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            v vVar = new v(this.V3, this.W3, dVar);
            vVar.U3 = obj;
            return vVar;
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {186, 187, 193, 195}, m = "updateByteOne")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class w extends zb.d {
        Object U3;
        Object V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f11659x;

        /* renamed from: y */
        Object f11660y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(xb.d<? super w> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return e.this.K(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, d2 = {"Ltb/r;", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/revocation/RevocationIndexEntry;", "<name for destructuring parameter 0>", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository$updateByteOne$2$1", f = "RevocationLocalListRepository.kt", l = {196}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class x extends zb.l implements gc.p<tb.r<? extends Byte, ? extends RevocationIndexEntry>, xb.d<? super tb.e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ i9.j W3;

        /* renamed from: y */
        int f11661y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(i9.j jVar, xb.d<? super x> dVar) {
            super(2, dVar);
            e.this = r1;
            this.W3 = jVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f11661y;
            if (i10 == 0) {
                tb.t.b(obj);
                tb.r rVar = (tb.r) this.U3;
                byte byteValue = ((Number) rVar.b()).byteValue();
                e eVar = e.this;
                this.f11661y = 1;
                if (eVar.J((RevocationIndexEntry) rVar.c(), this.W3, byteValue, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(tb.r<Byte, RevocationIndexEntry> rVar, xb.d<? super tb.e0> dVar) {
            return ((x) j(rVar, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            x xVar = new x(this.W3, dVar);
            xVar.U3 = obj;
            return xVar;
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {310, 317, 323}, m = "updateByteOne")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class y extends zb.d {
        byte U3;
        long V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f11662x;

        /* renamed from: y */
        Object f11663y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(xb.d<? super y> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return e.this.J(null, null, (byte) 0, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationLocalListRepository", f = "RevocationLocalListRepository.kt", l = {205, 206, 212, 214}, m = "updateByteTwo")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class z extends zb.d {
        Object U3;
        Object V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f11664x;

        /* renamed from: y */
        Object f11665y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(xb.d<? super z> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return e.this.L(this);
        }
    }

    public e(na.a aVar, String str, v9.a aVar2, RevocationDatabase revocationDatabase, PublicKey publicKey) {
        hc.t.e(aVar, "httpClient");
        hc.t.e(str, "host");
        hc.t.e(aVar2, "store");
        hc.t.e(revocationDatabase, "database");
        hc.t.e(publicKey, "revocationListPublicKey");
        this.f11602a = revocationDatabase;
        this.f11603b = publicKey;
        this.f11604c = aVar.f(new g(str));
        Object obj = Boolean.FALSE;
        v0<String> a10 = aVar2.b().a("revocation_list_update_is_on", BuildConfig.FLAVOR);
        boolean z10 = true;
        try {
            if (!(a10.getValue().length() == 0)) {
                gf.b a11 = aVar2.a();
                byte[] decode = Base64.decode(a10.getValue(), 0);
                hc.t.d(decode, "decode(flow.value, Base64.DEFAULT)");
                obj = a11.e(SerializersKt.serializer(a11.a(), k0.j(Boolean.TYPE)), decode);
            }
        } catch (kotlinx.serialization.i unused) {
        }
        this.f11605d = x0.a(obj, new s(a10, aVar2, null));
        Object a12 = v9.b.Companion.a();
        v0<String> a13 = aVar2.b().a("last_revocation_update", BuildConfig.FLAVOR);
        try {
            if (!(a13.getValue().length() == 0)) {
                gf.b a14 = aVar2.a();
                byte[] decode2 = Base64.decode(a13.getValue(), 0);
                hc.t.d(decode2, "decode(flow.value, Base64.DEFAULT)");
                a12 = a14.e(SerializersKt.serializer(a14.a(), k0.j(Instant.class)), decode2);
            }
        } catch (kotlinx.serialization.i unused2) {
        }
        this.f11606e = x0.a(a12, new t(a13, aVar2, null));
        Object a15 = v9.b.Companion.a();
        v0<String> a16 = aVar2.b().a("last_revocation_update_start", BuildConfig.FLAVOR);
        try {
            if (!(a16.getValue().length() == 0)) {
                gf.b a17 = aVar2.a();
                byte[] decode3 = Base64.decode(a16.getValue(), 0);
                hc.t.d(decode3, "decode(flow.value, Base64.DEFAULT)");
                a15 = a17.e(SerializersKt.serializer(a17.a(), k0.j(Instant.class)), decode3);
            }
        } catch (kotlinx.serialization.i unused3) {
        }
        this.f11607f = x0.a(a15, new u(a16, aVar2, null));
        Object obj2 = h9.c.COMPLETED;
        v0<String> a18 = aVar2.b().a("last_revocation_update_TABLE", BuildConfig.FLAVOR);
        try {
            if (a18.getValue().length() != 0) {
                z10 = false;
            }
            if (!z10) {
                gf.b a19 = aVar2.a();
                byte[] decode4 = Base64.decode(a18.getValue(), 0);
                hc.t.d(decode4, "decode(flow.value, Base64.DEFAULT)");
                obj2 = a19.e(SerializersKt.serializer(a19.a(), k0.j(h9.c.class)), decode4);
            }
        } catch (kotlinx.serialization.i unused4) {
        }
        this.f11608g = x0.a(obj2, new v(a18, aVar2, null));
        this.f11609h = b1.b(Boolean.FALSE, null, 2, null);
    }

    private final Object B(xb.d<? super List<i9.f>> dVar) {
        return this.f11602a.G().f(dVar);
    }

    private final Object D(xb.d<? super List<i9.j>> dVar) {
        return this.f11602a.H().d(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1 A[Catch: all -> 0x018c, a -> 0x0195, TryCatch #4 {a -> 0x0195, all -> 0x018c, blocks: (B:15:0x0041, B:22:0x0062, B:24:0x006b, B:26:0x0073, B:28:0x00c4, B:29:0x00c9, B:31:0x00d3, B:36:0x00e1, B:37:0x00e4, B:38:0x00e9, B:39:0x00ea, B:43:0x00f6, B:50:0x011f, B:51:0x0123, B:56:0x014b, B:57:0x0178, B:58:0x017f, B:63:0x0188, B:64:0x018b), top: B:74:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4 A[Catch: all -> 0x018c, a -> 0x0195, TryCatch #4 {a -> 0x0195, all -> 0x018c, blocks: (B:15:0x0041, B:22:0x0062, B:24:0x006b, B:26:0x0073, B:28:0x00c4, B:29:0x00c9, B:31:0x00d3, B:36:0x00e1, B:37:0x00e4, B:38:0x00e9, B:39:0x00ea, B:43:0x00f6, B:50:0x011f, B:51:0x0123, B:56:0x014b, B:57:0x0178, B:58:0x017f, B:63:0x0188, B:64:0x018b), top: B:74:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d A[Catch: all -> 0x005b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005b, blocks: (B:19:0x0056, B:49:0x011d, B:59:0x0180, B:60:0x0185), top: B:73:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014b A[Catch: all -> 0x018c, a -> 0x0195, TryCatch #4 {a -> 0x0195, all -> 0x018c, blocks: (B:15:0x0041, B:22:0x0062, B:24:0x006b, B:26:0x0073, B:28:0x00c4, B:29:0x00c9, B:31:0x00d3, B:36:0x00e1, B:37:0x00e4, B:38:0x00e9, B:39:0x00ea, B:43:0x00f6, B:50:0x011f, B:51:0x0123, B:56:0x014b, B:57:0x0178, B:58:0x017f, B:63:0x0188, B:64:0x018b), top: B:74:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0178 A[Catch: all -> 0x018c, a -> 0x0195, TryCatch #4 {a -> 0x0195, all -> 0x018c, blocks: (B:15:0x0041, B:22:0x0062, B:24:0x006b, B:26:0x0073, B:28:0x00c4, B:29:0x00c9, B:31:0x00d3, B:36:0x00e1, B:37:0x00e4, B:38:0x00e9, B:39:0x00ea, B:43:0x00f6, B:50:0x011f, B:51:0x0123, B:56:0x014b, B:57:0x0178, B:58:0x017f, B:63:0x0188, B:64:0x018b), top: B:74:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0180 A[Catch: all -> 0x005b, TRY_ENTER, TryCatch #2 {all -> 0x005b, blocks: (B:19:0x0056, B:49:0x011d, B:59:0x0180, B:60:0x0185), top: B:73:0x0056 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(java.lang.String r23, j$.time.Instant r24, xb.d<? super h9.e.C0173e> r25) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.F(java.lang.String, j$.time.Instant, xb.d):java.lang.Object");
    }

    private final boolean G() {
        return this.f11607f.getValue().isAfter(this.f11606e.getValue()) && h9.f.a(this.f11607f.getValue());
    }

    private final Object H(xb.d<? super tb.e0> dVar) {
        Object c10;
        Object a10 = v0.a.a(this.f11606e, v9.b.Companion.a(), false, dVar, 2, null);
        c10 = yb.d.c();
        return a10 == c10 ? a10 : tb.e0.f22152a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(de.rki.covpass.sdk.revocation.RevocationIndexEntry r20, i9.j r21, byte r22, xb.d<? super tb.e0> r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.J(de.rki.covpass.sdk.revocation.RevocationIndexEntry, i9.j, byte, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x011f -> B:15:0x0042). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(xb.d<? super tb.e0> r19) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.K(xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x011f -> B:15:0x0042). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(xb.d<? super tb.e0> r19) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.L(xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(java.util.Map.Entry<java.lang.Byte, de.rki.covpass.sdk.revocation.RevocationIndexByte2Entry> r24, i9.j r25, byte r26, xb.d<? super tb.e0> r27) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.M(java.util.Map$Entry, i9.j, byte, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0251  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01c9 -> B:36:0x0140). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x024b -> B:51:0x01da). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(xb.d<? super tb.e0> r14) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.N(xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120 A[LOOP:2: B:39:0x011a->B:41:0x0120, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a8 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01a6 -> B:47:0x014d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(xb.d<? super tb.e0> r13) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.O(xb.d):java.lang.Object");
    }

    private final Object P(Instant instant, xb.d<? super tb.e0> dVar) {
        Object c10;
        Object a10 = v0.a.a(this.f11606e, instant, false, dVar, 2, null);
        c10 = yb.d.c();
        return a10 == c10 ? a10 : tb.e0.f22152a;
    }

    private final Object Q(Instant instant, xb.d<? super tb.e0> dVar) {
        Object c10;
        Object a10 = v0.a.a(this.f11607f, instant, false, dVar, 2, null);
        c10 = yb.d.c();
        return a10 == c10 ? a10 : tb.e0.f22152a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b4, code lost:
        if (r3.f11608g.getValue() == h9.c.COMPLETED) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d3 -> B:72:0x01ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0101 -> B:72:0x01ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x011d -> B:72:0x01ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0134 -> B:72:0x01ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x014f -> B:72:0x01ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0166 -> B:72:0x01ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0188 -> B:72:0x01ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01a9 -> B:72:0x01ac). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(xb.d<? super tb.e0> r20) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.R(xb.d):java.lang.Object");
    }

    private final void S(a.u uVar) {
        if (uVar.v(new a.s(this.f11603b, null))) {
            return;
        }
        throw new g.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c9 -> B:13:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.util.List<i9.c> r11, i9.j r12, xb.d<? super tb.e0> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof h9.e.i
            if (r0 == 0) goto L13
            r0 = r13
            h9.e$i r0 = (h9.e.i) r0
            int r1 = r0.Y3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y3 = r1
            goto L18
        L13:
            h9.e$i r0 = new h9.e$i
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.W3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.Y3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r11 = r0.U3
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r0.f11636y
            i9.j r12 = (i9.j) r12
            java.lang.Object r2 = r0.f11635x
            h9.e r2 = (h9.e) r2
            tb.t.b(r13)
        L37:
            r13 = r2
            goto L5f
        L39:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L41:
            java.lang.Object r11 = r0.V3
            i9.c r11 = (i9.c) r11
            java.lang.Object r12 = r0.U3
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r2 = r0.f11636y
            i9.j r2 = (i9.j) r2
            java.lang.Object r5 = r0.f11635x
            h9.e r5 = (h9.e) r5
            tb.t.b(r13)
            r13 = r2
            r2 = r5
            goto La5
        L57:
            tb.t.b(r13)
            java.util.Iterator r11 = r11.iterator()
            r13 = r10
        L5f:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Lcd
            java.lang.Object r2 = r11.next()
            i9.c r2 = (i9.c) r2
            java.util.Map r5 = r12.b()
            byte r6 = r2.a()
            java.lang.Byte r6 = zb.b.b(r6)
            java.lang.Object r5 = r5.get(r6)
            if (r5 != 0) goto L5f
            de.rki.covpass.sdk.revocation.database.RevocationDatabase r5 = r13.f11602a
            i9.a r5 = r5.F()
            byte[] r6 = r12.c()
            byte r7 = r12.a()
            byte r8 = r2.a()
            r0.f11635x = r13
            r0.f11636y = r12
            r0.U3 = r11
            r0.V3 = r2
            r0.Y3 = r4
            java.lang.Object r5 = r5.d(r6, r7, r8, r0)
            if (r5 != r1) goto La0
            return r1
        La0:
            r9 = r12
            r12 = r11
            r11 = r2
            r2 = r13
            r13 = r9
        La5:
            de.rki.covpass.sdk.revocation.database.RevocationDatabase r5 = r2.f11602a
            i9.d r5 = r5.G()
            byte[] r6 = r13.c()
            byte r7 = r13.a()
            byte r11 = r11.a()
            r0.f11635x = r2
            r0.f11636y = r13
            r0.U3 = r12
            r8 = 0
            r0.V3 = r8
            r0.Y3 = r3
            java.lang.Object r11 = r5.d(r6, r7, r11, r0)
            if (r11 != r1) goto Lc9
            return r1
        Lc9:
            r11 = r12
            r12 = r13
            goto L37
        Lcd:
            tb.e0 r11 = tb.e0.f22152a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.p(java.util.List, i9.j, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.util.List<i9.f> r11, i9.j r12, xb.d<? super tb.e0> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof h9.e.j
            if (r0 == 0) goto L13
            r0 = r13
            h9.e$j r0 = (h9.e.j) r0
            int r1 = r0.X3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X3 = r1
            goto L18
        L13:
            h9.e$j r0 = new h9.e$j
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.V3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.X3
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r11 = r0.U3
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r0.f11638y
            i9.j r12 = (i9.j) r12
            java.lang.Object r2 = r0.f11637x
            h9.e r2 = (h9.e) r2
            tb.t.b(r13)
            goto L45
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            tb.t.b(r13)
            java.util.Iterator r11 = r11.iterator()
            r2 = r10
        L45:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto La3
            java.lang.Object r13 = r11.next()
            i9.f r13 = (i9.f) r13
            java.util.Map r4 = r12.b()
            byte r5 = r13.a()
            java.lang.Byte r5 = zb.b.b(r5)
            java.lang.Object r4 = r4.get(r5)
            de.rki.covpass.sdk.revocation.RevocationIndexEntry r4 = (de.rki.covpass.sdk.revocation.RevocationIndexEntry) r4
            if (r4 == 0) goto L7a
            java.util.Map r4 = r4.a()
            if (r4 == 0) goto L7a
            byte r5 = r13.b()
            java.lang.Byte r5 = zb.b.b(r5)
            java.lang.Object r4 = r4.get(r5)
            de.rki.covpass.sdk.revocation.RevocationIndexByte2Entry r4 = (de.rki.covpass.sdk.revocation.RevocationIndexByte2Entry) r4
            goto L7b
        L7a:
            r4 = 0
        L7b:
            if (r4 != 0) goto L45
            de.rki.covpass.sdk.revocation.database.RevocationDatabase r4 = r2.f11602a
            i9.d r4 = r4.G()
            byte[] r5 = r12.c()
            byte r6 = r12.a()
            byte r7 = r13.a()
            byte r8 = r13.b()
            r0.f11637x = r2
            r0.f11638y = r12
            r0.U3 = r11
            r0.X3 = r3
            r9 = r0
            java.lang.Object r13 = r4.e(r5, r6, r7, r8, r9)
            if (r13 != r1) goto L45
            return r1
        La3:
            tb.e0 r11 = tb.e0.f22152a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.q(java.util.List, i9.j, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(byte[] r5, byte r6, byte r7, j$.time.Instant r8, xb.d<? super h9.e.a> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof h9.e.k
            if (r0 == 0) goto L13
            r0 = r9
            h9.e$k r0 = (h9.e.k) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            h9.e$k r0 = new h9.e$k
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f11639x
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.U3
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tb.t.b(r9)
            goto L67
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tb.t.b(r9)
            java.lang.String r5 = z9.k.c(r5)
            byte r6 = (byte) r6
            java.lang.String r6 = z9.k.b(r6)
            byte r7 = (byte) r7
            java.lang.String r7 = z9.k.b(r7)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r6)
            java.lang.String r5 = "/"
            r9.append(r5)
            r9.append(r7)
            java.lang.String r5 = "/chunk.lst"
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            r0.U3 = r3
            java.lang.Object r9 = r4.F(r5, r8, r0)
            if (r9 != r1) goto L67
            return r1
        L67:
            h9.e$e r9 = (h9.e.C0173e) r9
            h9.e$a r5 = new h9.e$a
            if (r9 == 0) goto L72
            boolean r6 = r9.b()
            goto L73
        L72:
            r6 = 0
        L73:
            if (r9 == 0) goto L81
            t7.o r7 = r9.a()
            if (r7 == 0) goto L81
            java.util.List r7 = h9.d.c(r7)
            if (r7 != 0) goto L85
        L81:
            java.util.List r7 = ub.s.h()
        L85:
            r5.<init>(r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.r(byte[], byte, byte, j$.time.Instant, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(byte[] r5, byte r6, byte r7, byte r8, j$.time.Instant r9, xb.d<? super h9.e.a> r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof h9.e.l
            if (r0 == 0) goto L13
            r0 = r10
            h9.e$l r0 = (h9.e.l) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            h9.e$l r0 = new h9.e$l
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f11641x
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.U3
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tb.t.b(r10)
            goto L72
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tb.t.b(r10)
            java.lang.String r5 = z9.k.c(r5)
            byte r6 = (byte) r6
            java.lang.String r6 = z9.k.b(r6)
            byte r7 = (byte) r7
            java.lang.String r7 = z9.k.b(r7)
            byte r8 = (byte) r8
            java.lang.String r8 = z9.k.b(r8)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            r10.append(r6)
            java.lang.String r5 = "/"
            r10.append(r5)
            r10.append(r7)
            r10.append(r5)
            r10.append(r8)
            java.lang.String r5 = "/chunk.lst"
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            r0.U3 = r3
            java.lang.Object r10 = r4.F(r5, r9, r0)
            if (r10 != r1) goto L72
            return r1
        L72:
            h9.e$e r10 = (h9.e.C0173e) r10
            h9.e$a r5 = new h9.e$a
            if (r10 == 0) goto L7d
            boolean r6 = r10.b()
            goto L7e
        L7d:
            r6 = 0
        L7e:
            if (r10 == 0) goto L8c
            t7.o r7 = r10.a()
            if (r7 == 0) goto L8c
            java.util.List r7 = h9.d.c(r7)
            if (r7 != 0) goto L90
        L8c:
            java.util.List r7 = ub.s.h()
        L90:
            r5.<init>(r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.s(byte[], byte, byte, byte, j$.time.Instant, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(byte[] r5, byte r6, j$.time.Instant r7, xb.d<? super h9.e.c> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof h9.e.m
            if (r0 == 0) goto L13
            r0 = r8
            h9.e$m r0 = (h9.e.m) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            h9.e$m r0 = new h9.e$m
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f11643x
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.U3
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tb.t.b(r8)
            goto L5a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tb.t.b(r8)
            java.lang.String r5 = z9.k.c(r5)
            byte r6 = (byte) r6
            java.lang.String r6 = z9.k.b(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            java.lang.String r5 = "/index.lst"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r0.U3 = r3
            java.lang.Object r8 = r4.F(r5, r7, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            h9.e$e r8 = (h9.e.C0173e) r8
            h9.e$c r5 = new h9.e$c
            if (r8 == 0) goto L65
            boolean r6 = r8.b()
            goto L66
        L65:
            r6 = 0
        L66:
            if (r8 == 0) goto L74
            t7.o r7 = r8.a()
            if (r7 == 0) goto L74
            java.util.Map r7 = h9.d.a(r7)
            if (r7 != 0) goto L78
        L74:
            java.util.Map r7 = ub.n0.h()
        L78:
            r5.<init>(r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.t(byte[], byte, j$.time.Instant, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(j$.time.Instant r5, xb.d<? super h9.e.d> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof h9.e.n
            if (r0 == 0) goto L13
            r0 = r6
            h9.e$n r0 = (h9.e.n) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            h9.e$n r0 = new h9.e$n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f11645x
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.U3
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tb.t.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tb.t.b(r6)
            r0.U3 = r3
            java.lang.String r6 = "kid.lst"
            java.lang.Object r6 = r4.F(r6, r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            h9.e$e r6 = (h9.e.C0173e) r6
            h9.e$d r5 = new h9.e$d
            if (r6 == 0) goto L4a
            boolean r0 = r6.b()
            goto L4b
        L4a:
            r0 = 0
        L4b:
            if (r6 == 0) goto L59
            t7.o r6 = r6.a()
            if (r6 == 0) goto L59
            java.util.List r6 = h9.d.b(r6)
            if (r6 != 0) goto L5d
        L59:
            java.util.List r6 = ub.s.h()
        L5d:
            r5.<init>(r0, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.u(j$.time.Instant, xb.d):java.lang.Object");
    }

    private final Object z(xb.d<? super List<i9.c>> dVar) {
        return this.f11602a.F().e(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(byte[] r8, byte r9, byte r10, byte r11, xb.d<? super java.util.List<byte[]>> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof h9.e.p
            if (r0 == 0) goto L13
            r0 = r12
            h9.e$p r0 = (h9.e.p) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            h9.e$p r0 = new h9.e$p
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.f11649x
            java.lang.Object r0 = yb.b.c()
            int r1 = r6.U3
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            tb.t.b(r12)
            goto L48
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            tb.t.b(r12)
            de.rki.covpass.sdk.revocation.database.RevocationDatabase r12 = r7.f11602a
            i9.d r1 = r12.G()
            byte r3 = (byte) r9
            byte r4 = (byte) r10
            byte r5 = (byte) r11
            r6.U3 = r2
            r2 = r8
            java.lang.Object r12 = r1.g(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L48
            return r0
        L48:
            i9.f r12 = (i9.f) r12
            if (r12 == 0) goto L52
            java.util.List r8 = r12.c()
            if (r8 != 0) goto L56
        L52:
            java.util.List r8 = ub.s.h()
        L56:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.A(byte[], byte, byte, byte, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(byte[] r5, byte r6, xb.d<? super java.util.Map<java.lang.Byte, de.rki.covpass.sdk.revocation.RevocationIndexEntry>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof h9.e.q
            if (r0 == 0) goto L13
            r0 = r7
            h9.e$q r0 = (h9.e.q) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            h9.e$q r0 = new h9.e$q
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11651x
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.U3
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tb.t.b(r7)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tb.t.b(r7)
            de.rki.covpass.sdk.revocation.database.RevocationDatabase r7 = r4.f11602a
            i9.h r7 = r7.H()
            byte r6 = (byte) r6
            r0.U3 = r3
            java.lang.Object r7 = r7.e(r5, r6, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            i9.j r7 = (i9.j) r7
            java.util.Map r5 = r7.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.C(byte[], byte, xb.d):java.lang.Object");
    }

    public final Object E(xb.d<? super List<i9.o>> dVar) {
        return this.f11602a.I().b(dVar);
    }

    public final Object I(xb.d<? super tb.e0> dVar) {
        Object c10;
        if (this.f11605d.getValue().booleanValue() && h9.f.a(this.f11606e.getValue())) {
            Object R = R(dVar);
            c10 = yb.d.c();
            return R == c10 ? R : tb.e0.f22152a;
        }
        return tb.e0.f22152a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(xb.d<? super tb.e0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof h9.e.h
            if (r0 == 0) goto L13
            r0 = r9
            h9.e$h r0 = (h9.e.h) r0
            int r1 = r0.V3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.V3 = r1
            goto L18
        L13:
            h9.e$h r0 = new h9.e$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f11634y
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.V3
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L5e
            if (r2 == r7) goto L56
            if (r2 == r6) goto L4e
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            tb.t.b(r9)
            goto Lb2
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3e:
            java.lang.Object r2 = r0.f11633x
            h9.e r2 = (h9.e) r2
            tb.t.b(r9)
            goto La6
        L46:
            java.lang.Object r2 = r0.f11633x
            h9.e r2 = (h9.e) r2
            tb.t.b(r9)
            goto L95
        L4e:
            java.lang.Object r2 = r0.f11633x
            h9.e r2 = (h9.e) r2
            tb.t.b(r9)
            goto L84
        L56:
            java.lang.Object r2 = r0.f11633x
            h9.e r2 = (h9.e) r2
            tb.t.b(r9)
            goto L73
        L5e:
            tb.t.b(r9)
            de.rki.covpass.sdk.revocation.database.RevocationDatabase r9 = r8.f11602a
            i9.k r9 = r9.I()
            r0.f11633x = r8
            r0.V3 = r7
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L72
            return r1
        L72:
            r2 = r8
        L73:
            de.rki.covpass.sdk.revocation.database.RevocationDatabase r9 = r2.f11602a
            i9.h r9 = r9.H()
            r0.f11633x = r2
            r0.V3 = r6
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L84
            return r1
        L84:
            de.rki.covpass.sdk.revocation.database.RevocationDatabase r9 = r2.f11602a
            i9.a r9 = r9.F()
            r0.f11633x = r2
            r0.V3 = r5
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L95
            return r1
        L95:
            de.rki.covpass.sdk.revocation.database.RevocationDatabase r9 = r2.f11602a
            i9.d r9 = r9.G()
            r0.f11633x = r2
            r0.V3 = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto La6
            return r1
        La6:
            r9 = 0
            r0.f11633x = r9
            r0.V3 = r3
            java.lang.Object r9 = r2.H(r0)
            if (r9 != r1) goto Lb2
            return r1
        Lb2:
            tb.e0 r9 = tb.e0.f22152a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.o(xb.d):java.lang.Object");
    }

    public final v0<Instant> v() {
        return this.f11606e;
    }

    public final l0<Boolean> w() {
        return this.f11609h;
    }

    public final v0<Boolean> x() {
        return this.f11605d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(byte[] r5, byte r6, byte r7, xb.d<? super java.util.List<byte[]>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof h9.e.o
            if (r0 == 0) goto L13
            r0 = r8
            h9.e$o r0 = (h9.e.o) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            h9.e$o r0 = new h9.e$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f11647x
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.U3
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tb.t.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tb.t.b(r8)
            de.rki.covpass.sdk.revocation.database.RevocationDatabase r8 = r4.f11602a
            i9.a r8 = r8.F()
            byte r6 = (byte) r6
            byte r7 = (byte) r7
            r0.U3 = r3
            java.lang.Object r8 = r8.f(r5, r6, r7, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            i9.c r8 = (i9.c) r8
            if (r8 == 0) goto L4f
            java.util.List r5 = r8.b()
            if (r5 != 0) goto L53
        L4f:
            java.util.List r5 = ub.s.h()
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.e.y(byte[], byte, byte, xb.d):java.lang.Object");
    }
}
