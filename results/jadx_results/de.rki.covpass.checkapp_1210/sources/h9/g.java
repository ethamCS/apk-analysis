package h9;

import a.s;
import a.u;
import android.util.Base64;
import gc.l;
import gc.p;
import hc.k0;
import hc.t;
import hc.v;
import j$.time.Instant;
import java.io.File;
import java.security.PublicKey;
import kotlin.Metadata;
import kotlinx.serialization.SerializersKt;
import of.x;
import org.conscrypt.BuildConfig;
import s4.v0;
import s4.x0;
import tb.e0;
import ua.c;
import ya.i;
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001*B7\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lh9/g;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "url", "Lt7/o;", "f", "(Ljava/lang/String;Lxb/d;)Ljava/lang/Object;", "La/u;", "sign1Message", "Ltb/e0;", "g", BuildConfig.FLAVOR, "Lh9/b;", "e", "(Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "kid", BuildConfig.FLAVOR, "hashType", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/revocation/RevocationIndexEntry;", "d", "([BBLxb/d;)Ljava/lang/Object;", "byte1", "b", "([BBBLxb/d;)Ljava/lang/Object;", "byte2", "c", "([BBBBLxb/d;)Ljava/lang/Object;", "Lna/a;", "httpClient", "host", "Lv9/a;", "store", "Ljava/io/File;", "cacheDir", "Ljava/security/PublicKey;", "revocationListPublicKey", "Lh9/e;", "revocationLocalListRepository", "<init>", "(Lna/a;Ljava/lang/String;Lv9/a;Ljava/io/File;Ljava/security/PublicKey;Lh9/e;)V", "a", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private final PublicKey f11666a;

    /* renamed from: b */
    private final h9.e f11667b;

    /* renamed from: c */
    private final na.a f11668c;

    /* renamed from: d */
    private final v0<Instant> f11669d;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh9/g$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends Exception {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lna/b;", "Ltb/e0;", "b", "(Lna/b;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends v implements l<na.b<?>, e0> {

        /* renamed from: c */
        final /* synthetic */ File f11670c;

        /* renamed from: d */
        final /* synthetic */ String f11671d;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/c;", "Ltb/e0;", "b", "(Lsa/c;)V"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends v implements l<sa.c, e0> {

            /* renamed from: c */
            final /* synthetic */ File f11672c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(File file) {
                super(1);
                this.f11672c = file;
            }

            public final void b(sa.c cVar) {
                x.a D;
                x.a c10;
                t.e(cVar, "$this$engine");
                x e10 = cVar.e();
                cVar.g((e10 == null || (D = e10.D()) == null || (c10 = D.c(new of.c(new File(this.f11672c, "http_cache"), 52428800L))) == null) ? null : c10.b());
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(sa.c cVar) {
                b(cVar);
                return e0.f22152a;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lya/c;", "Ltb/e0;", "b", "(Lya/c;)V"}, k = 3, mv = {1, 7, 1})
        /* renamed from: h9.g$b$b */
        /* loaded from: classes.dex */
        public static final class C0174b extends v implements l<ya.c, e0> {

            /* renamed from: c */
            final /* synthetic */ String f11673c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0174b(String str) {
                super(1);
                this.f11673c = str;
            }

            public final void b(ya.c cVar) {
                t.e(cVar, "$this$defaultRequest");
                i.c(cVar, this.f11673c);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(ya.c cVar) {
                b(cVar);
                return e0.f22152a;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lua/c$a;", "Ltb/e0;", "b", "(Lua/c$a;)V"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class c extends v implements l<c.a, e0> {

            /* renamed from: c */
            public static final c f11674c = new c();

            c() {
                super(1);
            }

            public final void b(c.a aVar) {
                t.e(aVar, "$this$install");
                aVar.d(new va.a(f9.b.c()));
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(c.a aVar) {
                b(aVar);
                return e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, String str) {
            super(1);
            this.f11670c = file;
            this.f11671d = str;
        }

        public final void b(na.b<?> bVar) {
            t.e(bVar, "$this$config");
            if (bVar != null) {
                bVar.b(new a(this.f11670c));
            }
            ta.e.a(bVar, new C0174b(this.f11671d));
            bVar.j(ua.c.f23330d, c.f11674c);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(na.b<?> bVar) {
            b(bVar);
            return e0.f22152a;
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationRemoteListRepository", f = "RevocationRemoteListRepository.kt", l = {93, 95}, m = "getByteOneChunk")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c extends zb.d {
        int U3;

        /* renamed from: x */
        /* synthetic */ Object f11675x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xb.d<? super c> dVar) {
            super(dVar);
            g.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f11675x = obj;
            this.U3 |= Integer.MIN_VALUE;
            return g.this.b(null, (byte) 0, (byte) 0, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationRemoteListRepository", f = "RevocationRemoteListRepository.kt", l = {107, androidx.constraintlayout.widget.i.E2}, m = "getByteTwoChunk")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class d extends zb.d {
        int U3;

        /* renamed from: x */
        /* synthetic */ Object f11677x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(xb.d<? super d> dVar) {
            super(dVar);
            g.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f11677x = obj;
            this.U3 |= Integer.MIN_VALUE;
            return g.this.c(null, (byte) 0, (byte) 0, (byte) 0, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationRemoteListRepository", f = "RevocationRemoteListRepository.kt", l = {80, 82}, m = "getIndex")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class e extends zb.d {
        int U3;

        /* renamed from: x */
        /* synthetic */ Object f11679x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(xb.d<? super e> dVar) {
            super(dVar);
            g.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f11679x = obj;
            this.U3 |= Integer.MIN_VALUE;
            return g.this.d(null, (byte) 0, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationRemoteListRepository", f = "RevocationRemoteListRepository.kt", l = {71, 73}, m = "getKidList")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class f extends zb.d {
        int U3;

        /* renamed from: x */
        /* synthetic */ Object f11681x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(xb.d<? super f> dVar) {
            super(dVar);
            g.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f11681x = obj;
            this.U3 |= Integer.MIN_VALUE;
            return g.this.e(this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.RevocationRemoteListRepository", f = "RevocationRemoteListRepository.kt", l = {203, 205, 208}, m = "getSigned")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: h9.g$g */
    /* loaded from: classes.dex */
    public static final class C0175g extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f11683x;

        /* renamed from: y */
        Object f11684y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0175g(xb.d<? super C0175g> dVar) {
            super(dVar);
            g.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return g.this.f(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends zb.l implements p<Instant, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f11685y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(v0 v0Var, v9.a aVar, xb.d dVar) {
            super(2, dVar);
            this.V3 = v0Var;
            this.W3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f11685y;
            if (i10 == 0) {
                tb.t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Instant.class)), obj2), 0);
                t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f11685y = 1;
                if (v0.a.a(v0Var, encodeToString, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(Instant instant, xb.d<? super e0> dVar) {
            return ((h) j(instant, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            h hVar = new h(this.V3, this.W3, dVar);
            hVar.U3 = obj;
            return hVar;
        }
    }

    public g(na.a aVar, String str, v9.a aVar2, File file, PublicKey publicKey, h9.e eVar) {
        t.e(aVar, "httpClient");
        t.e(str, "host");
        t.e(aVar2, "store");
        t.e(file, "cacheDir");
        t.e(publicKey, "revocationListPublicKey");
        t.e(eVar, "revocationLocalListRepository");
        this.f11666a = publicKey;
        this.f11667b = eVar;
        this.f11668c = aVar.f(new b(file, str));
        Object a10 = v9.b.Companion.a();
        v0<String> a11 = aVar2.b().a("last_revocation_validation", BuildConfig.FLAVOR);
        try {
            if (!(a11.getValue().length() == 0)) {
                gf.b a12 = aVar2.a();
                byte[] decode = Base64.decode(a11.getValue(), 0);
                t.d(decode, "decode(flow.value, Base64.DEFAULT)");
                a10 = a12.e(SerializersKt.serializer(a12.a(), k0.j(Instant.class)), decode);
            }
        } catch (kotlinx.serialization.i unused) {
        }
        this.f11669d = x0.a(a10, new h(a11, aVar2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5 A[Catch: all -> 0x012d, a -> 0x0136, TryCatch #4 {a -> 0x0136, all -> 0x012d, blocks: (B:19:0x0050, B:21:0x0059, B:23:0x0060, B:25:0x00a7, B:26:0x00ab, B:28:0x00b7, B:33:0x00c5, B:34:0x00c9, B:35:0x00ce, B:36:0x00cf, B:40:0x00db, B:47:0x0106, B:48:0x010a, B:53:0x0129, B:54:0x012c), top: B:64:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9 A[Catch: all -> 0x012d, a -> 0x0136, TryCatch #4 {a -> 0x0136, all -> 0x012d, blocks: (B:19:0x0050, B:21:0x0059, B:23:0x0060, B:25:0x00a7, B:26:0x00ab, B:28:0x00b7, B:33:0x00c5, B:34:0x00c9, B:35:0x00ce, B:36:0x00cf, B:40:0x00db, B:47:0x0106, B:48:0x010a, B:53:0x0129, B:54:0x012c), top: B:64:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103 A[Catch: all -> 0x0041, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003c, B:46:0x0103, B:49:0x0121, B:50:0x0126), top: B:61:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121 A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003c, B:46:0x0103, B:49:0x0121, B:50:0x0126), top: B:61:0x003c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r20, xb.d<? super t7.o> r21) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.g.f(java.lang.String, xb.d):java.lang.Object");
    }

    private final void g(u uVar) {
        if (uVar.v(new s(this.f11666a, null))) {
            return;
        }
        throw new a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(byte[] r6, byte r7, byte r8, xb.d<? super java.util.List<byte[]>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof h9.g.c
            if (r0 == 0) goto L13
            r0 = r9
            h9.g$c r0 = (h9.g.c) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            h9.g$c r0 = new h9.g$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f11675x
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.U3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r9)
            goto L8e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            tb.t.b(r9)
            goto L5a
        L38:
            tb.t.b(r9)
            h9.e r9 = r5.f11667b
            s4.v0 r9 = r9.x()
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L5b
            h9.e r9 = r5.f11667b
            byte r7 = (byte) r7
            byte r8 = (byte) r8
            r0.U3 = r4
            java.lang.Object r9 = r9.y(r6, r7, r8, r0)
            if (r9 != r1) goto L5a
            return r1
        L5a:
            return r9
        L5b:
            java.lang.String r6 = z9.k.c(r6)
            byte r7 = (byte) r7
            java.lang.String r7 = z9.k.b(r7)
            byte r8 = (byte) r8
            java.lang.String r8 = z9.k.b(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r7)
            java.lang.String r6 = "/"
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = "/chunk.lst"
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r0.U3 = r3
            java.lang.Object r9 = r5.f(r6, r0)
            if (r9 != r1) goto L8e
            return r1
        L8e:
            t7.o r9 = (t7.o) r9
            if (r9 == 0) goto L98
            java.util.List r6 = h9.d.c(r9)
            if (r6 != 0) goto L9c
        L98:
            java.util.List r6 = ub.s.h()
        L9c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.g.b(byte[], byte, byte, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(byte[] r8, byte r9, byte r10, byte r11, xb.d<? super java.util.List<byte[]>> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof h9.g.d
            if (r0 == 0) goto L13
            r0 = r12
            h9.g$d r0 = (h9.g.d) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            h9.g$d r0 = new h9.g$d
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.f11677x
            java.lang.Object r0 = yb.b.c()
            int r1 = r6.U3
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            tb.t.b(r12)
            goto L9d
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            tb.t.b(r12)
            goto L5e
        L39:
            tb.t.b(r12)
            h9.e r12 = r7.f11667b
            s4.v0 r12 = r12.x()
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L5f
            h9.e r1 = r7.f11667b
            byte r9 = (byte) r9
            byte r4 = (byte) r10
            byte r5 = (byte) r11
            r6.U3 = r3
            r2 = r8
            r3 = r9
            java.lang.Object r12 = r1.A(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L5e
            return r0
        L5e:
            return r12
        L5f:
            java.lang.String r8 = z9.k.c(r8)
            byte r9 = (byte) r9
            java.lang.String r9 = z9.k.b(r9)
            byte r10 = (byte) r10
            java.lang.String r10 = z9.k.b(r10)
            byte r11 = (byte) r11
            java.lang.String r11 = z9.k.b(r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            r12.append(r9)
            java.lang.String r8 = "/"
            r12.append(r8)
            r12.append(r10)
            r12.append(r8)
            r12.append(r11)
            java.lang.String r8 = "/chunk.lst"
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r6.U3 = r2
            java.lang.Object r12 = r7.f(r8, r6)
            if (r12 != r0) goto L9d
            return r0
        L9d:
            t7.o r12 = (t7.o) r12
            if (r12 == 0) goto La7
            java.util.List r8 = h9.d.c(r12)
            if (r8 != 0) goto Lab
        La7:
            java.util.List r8 = ub.s.h()
        Lab:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.g.c(byte[], byte, byte, byte, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(byte[] r6, byte r7, xb.d<? super java.util.Map<java.lang.Byte, de.rki.covpass.sdk.revocation.RevocationIndexEntry>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof h9.g.e
            if (r0 == 0) goto L13
            r0 = r8
            h9.g$e r0 = (h9.g.e) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            h9.g$e r0 = new h9.g$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f11679x
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.U3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r8)
            goto L80
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            tb.t.b(r8)
            goto L59
        L38:
            tb.t.b(r8)
            h9.e r8 = r5.f11667b
            s4.v0 r8 = r8.x()
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5a
            h9.e r8 = r5.f11667b
            byte r7 = (byte) r7
            r0.U3 = r4
            java.lang.Object r8 = r8.C(r6, r7, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            return r8
        L5a:
            java.lang.String r6 = z9.k.c(r6)
            byte r7 = (byte) r7
            java.lang.String r7 = z9.k.b(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = "/index.lst"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r0.U3 = r3
            java.lang.Object r8 = r5.f(r6, r0)
            if (r8 != r1) goto L80
            return r1
        L80:
            t7.o r8 = (t7.o) r8
            if (r8 == 0) goto L8a
            java.util.Map r6 = h9.d.a(r8)
            if (r6 != 0) goto L8e
        L8a:
            java.util.Map r6 = ub.n0.h()
        L8e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.g.d(byte[], byte, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(xb.d<? super java.util.List<h9.b>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof h9.g.f
            if (r0 == 0) goto L13
            r0 = r6
            h9.g$f r0 = (h9.g.f) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            h9.g$f r0 = new h9.g$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f11681x
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.U3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r6)
            goto L6a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            tb.t.b(r6)
            goto L58
        L38:
            tb.t.b(r6)
            h9.e r6 = r5.f11667b
            s4.v0 r6 = r6.x()
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5f
            h9.e r6 = r5.f11667b
            r0.U3 = r4
            java.lang.Object r6 = r6.E(r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            java.util.List r6 = (java.util.List) r6
            java.util.List r6 = h9.d.d(r6)
            goto L78
        L5f:
            r0.U3 = r3
            java.lang.String r6 = "kid.lst"
            java.lang.Object r6 = r5.f(r6, r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            t7.o r6 = (t7.o) r6
            if (r6 == 0) goto L74
            java.util.List r6 = h9.d.b(r6)
            if (r6 != 0) goto L78
        L74:
            java.util.List r6 = ub.s.h()
        L78:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.g.e(xb.d):java.lang.Object");
    }
}
