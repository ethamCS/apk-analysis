package v9;

import android.content.SharedPreferences;
import gc.p;
import hc.t;
import hc.v;
import kotlin.Metadata;
import kotlinx.coroutines.j;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.v0;
import s4.x0;
import tb.e0;
import zb.l;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:82)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:60)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:54)
    */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lv9/f;", BuildConfig.FLAVOR, "T", "default", "Lkotlin/Function2;", "Landroid/content/SharedPreferences$Editor;", "Ltb/e0;", "setter", "Ls4/v0;", "b", "(Ljava/lang/Object;Lgc/p;)Ls4/v0;", BuildConfig.FLAVOR, "key", "a", "Landroid/content/SharedPreferences;", "prefs", "Landroid/content/SharedPreferences;", "c", "()Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private final SharedPreferences f23948a;

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/content/SharedPreferences$Editor;", BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends v implements p<SharedPreferences.Editor, String, e0> {

        /* renamed from: c */
        final /* synthetic */ String f23949c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(2);
            this.f23949c = str;
        }

        public final void b(SharedPreferences.Editor editor, String str) {
            t.e(editor, "$this$getFlow");
            t.e(str, "it");
            editor.putString(this.f23949c, str);
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ e0 u(SharedPreferences.Editor editor, String str) {
            b(editor, str);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.storage.SharedPrefsStore$getFlow$1", f = "SharedPrefsStore.kt", l = {77}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<T, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ f V3;
        final /* synthetic */ p<SharedPreferences.Editor, T, e0> W3;

        /* renamed from: y */
        int f23950y;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @zb.f(c = "de.rki.covpass.sdk.storage.SharedPrefsStore$getFlow$1$1", f = "SharedPrefsStore.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends l implements p<q0, xb.d<? super e0>, Object> {
            final /* synthetic */ f U3;
            final /* synthetic */ p<SharedPreferences.Editor, T, e0> V3;
            final /* synthetic */ T W3;

            /* renamed from: y */
            int f23951y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(f fVar, p<? super SharedPreferences.Editor, ? super T, e0> pVar, T t10, xb.d<? super a> dVar) {
                super(2, dVar);
                this.U3 = fVar;
                this.V3 = pVar;
                this.W3 = t10;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                yb.d.c();
                if (this.f23951y == 0) {
                    tb.t.b(obj);
                    SharedPreferences c10 = this.U3.c();
                    p<SharedPreferences.Editor, T, e0> pVar = this.V3;
                    T t10 = this.W3;
                    SharedPreferences.Editor edit = c10.edit();
                    t.d(edit, "editor");
                    pVar.u(edit, t10);
                    edit.apply();
                    return e0.f22152a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object d0(q0 q0Var, xb.d<? super e0> dVar) {
                return ((a) j(q0Var, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                return new a(this.U3, this.V3, this.W3, dVar);
            }

            @Override // gc.p
            public /* bridge */ /* synthetic */ Object u(q0 q0Var, xb.d<? super e0> dVar) {
                return d0(q0Var, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(f fVar, p<? super SharedPreferences.Editor, ? super T, e0> pVar, xb.d<? super b> dVar) {
            super(2, dVar);
            this.V3 = fVar;
            this.W3 = pVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f23950y;
            if (i10 == 0) {
                tb.t.b(obj);
                Object obj2 = this.U3;
                l0 a10 = s4.l.a().a();
                a aVar = new a(this.V3, this.W3, obj2, null);
                this.f23950y = 1;
                if (j.g(a10, aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return e0.f22152a;
        }

        public final Object d0(T t10, xb.d<? super e0> dVar) {
            return ((b) j(t10, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            b bVar = new b(this.V3, this.W3, dVar);
            bVar.U3 = obj;
            return bVar;
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ Object u(Object obj, xb.d<? super e0> dVar) {
            return d0(obj, dVar);
        }
    }

    public f(SharedPreferences sharedPreferences) {
        t.e(sharedPreferences, "prefs");
        this.f23948a = sharedPreferences;
    }

    private final <T> v0<T> b(T t10, p<? super SharedPreferences.Editor, ? super T, e0> pVar) {
        return x0.a(t10, new b(this, pVar, null));
    }

    public final v0<String> a(String str, String str2) {
        t.e(str, "key");
        t.e(str2, "default");
        String string = this.f23948a.getString(str, str2);
        if (string != null) {
            str2 = string;
        }
        return b(str2, new a(str));
    }

    public final SharedPreferences c() {
        return this.f23948a;
    }
}
