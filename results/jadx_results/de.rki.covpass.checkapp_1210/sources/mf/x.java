package mf;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u0006\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0006\u0010\u000e\u001a\u00020\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lmf/x;", BuildConfig.FLAVOR, "Lkotlinx/serialization/json/JsonElement;", "i", "Ltb/c;", "Ltb/e0;", "h", "(Ltb/c;Lxb/d;)Ljava/lang/Object;", "f", BuildConfig.FLAVOR, "isString", "Lkotlinx/serialization/json/JsonPrimitive;", "j", "g", "e", "Llf/e;", "configuration", "Lmf/a;", "lexer", "<init>", "(Llf/e;Lmf/a;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a */
    private final mf.a f16655a;

    /* renamed from: b */
    private final boolean f16656b;

    /* renamed from: c */
    private int f16657c;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ltb/c;", "Ltb/e0;", "Lkotlinx/serialization/json/JsonElement;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {112}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends zb.k implements gc.q<tb.c<tb.e0, JsonElement>, tb.e0, xb.d<? super JsonElement>, Object> {

        /* renamed from: q */
        int f16658q;

        /* renamed from: x */
        private /* synthetic */ Object f16659x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(3, dVar);
            x.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f16658q;
            if (i10 == 0) {
                tb.t.b(obj);
                tb.c cVar = (tb.c) this.f16659x;
                byte D = x.this.f16655a.D();
                if (D == 1) {
                    return x.this.j(true);
                }
                if (D == 0) {
                    return x.this.j(false);
                }
                if (D != 6) {
                    if (D == 8) {
                        return x.this.f();
                    }
                    mf.a.x(x.this.f16655a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new tb.i();
                }
                x xVar = x.this;
                this.f16658q = 1;
                obj = xVar.h(cVar, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return (JsonElement) obj;
        }

        /* renamed from: W */
        public final Object s(tb.c<tb.e0, JsonElement> cVar, tb.e0 e0Var, xb.d<? super JsonElement> dVar) {
            a aVar = new a(dVar);
            aVar.f16659x = cVar;
            return aVar.B(tb.e0.f22152a);
        }
    }

    @zb.f(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {23}, m = "readObject")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends zb.d {
        Object U3;
        Object V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f16661x;

        /* renamed from: y */
        Object f16662y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(dVar);
            x.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return x.this.h(null, this);
        }
    }

    public x(lf.e eVar, mf.a aVar) {
        hc.t.e(eVar, "configuration");
        hc.t.e(aVar, "lexer");
        this.f16655a = aVar;
        this.f16656b = eVar.l();
    }

    public final JsonElement f() {
        int i10;
        byte l10 = this.f16655a.l();
        if (this.f16655a.D() == 4) {
            mf.a.x(this.f16655a, "Unexpected leading comma", 0, null, 6, null);
            throw new tb.i();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f16655a.f()) {
            arrayList.add(e());
            l10 = this.f16655a.l();
            if (l10 != 4) {
                mf.a aVar = this.f16655a;
                boolean z10 = l10 == 9;
                i10 = aVar.f16587a;
                if (!z10) {
                    mf.a.x(aVar, "Expected end of the array or comma", i10, null, 4, null);
                    throw new tb.i();
                }
            }
        }
        if (l10 == 8) {
            this.f16655a.m((byte) 9);
        } else if (l10 == 4) {
            mf.a.x(this.f16655a, "Unexpected trailing comma", 0, null, 6, null);
            throw new tb.i();
        }
        return new JsonArray(arrayList);
    }

    private final JsonElement g() {
        return (JsonElement) tb.b.b(new tb.a(new a(null)), tb.e0.f22152a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:27:0x00a6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(tb.c<tb.e0, kotlinx.serialization.json.JsonElement> r21, xb.d<? super kotlinx.serialization.json.JsonElement> r22) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.x.h(tb.c, xb.d):java.lang.Object");
    }

    private final JsonElement i() {
        byte m10 = this.f16655a.m((byte) 6);
        if (this.f16655a.D() == 4) {
            mf.a.x(this.f16655a, "Unexpected leading comma", 0, null, 6, null);
            throw new tb.i();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f16655a.f()) {
                break;
            }
            String r10 = this.f16656b ? this.f16655a.r() : this.f16655a.p();
            this.f16655a.m((byte) 5);
            linkedHashMap.put(r10, e());
            m10 = this.f16655a.l();
            if (m10 != 4) {
                if (m10 != 7) {
                    mf.a.x(this.f16655a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new tb.i();
                }
            }
        }
        if (m10 == 6) {
            this.f16655a.m((byte) 7);
        } else if (m10 == 4) {
            mf.a.x(this.f16655a, "Unexpected trailing comma", 0, null, 6, null);
            throw new tb.i();
        }
        return new JsonObject(linkedHashMap);
    }

    public final JsonPrimitive j(boolean z10) {
        String r10 = (this.f16656b || !z10) ? this.f16655a.r() : this.f16655a.p();
        return (z10 || !hc.t.a(r10, "null")) ? new lf.m(r10, z10) : JsonNull.f15603a;
    }

    public final JsonElement e() {
        byte D = this.f16655a.D();
        if (D == 1) {
            return j(true);
        }
        if (D == 0) {
            return j(false);
        }
        if (D == 6) {
            int i10 = this.f16657c + 1;
            this.f16657c = i10;
            this.f16657c--;
            return i10 == 200 ? g() : i();
        } else if (D == 8) {
            return f();
        } else {
            mf.a.x(this.f16655a, "Cannot begin reading element, unexpected token: " + ((int) D), 0, null, 6, null);
            throw new tb.i();
        }
    }
}
