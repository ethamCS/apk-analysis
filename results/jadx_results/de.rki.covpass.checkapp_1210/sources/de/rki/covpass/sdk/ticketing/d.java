package de.rki.covpass.sdk.ticketing;

import gc.l;
import hc.t;
import hc.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
import ua.c;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lde/rki/covpass/sdk/ticketing/d;", BuildConfig.FLAVOR, "Lna/a;", "httpClient", "<init>", "(Lna/a;)V", "Companion", "a", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d {
    private static final a Companion = new a(null);

    /* renamed from: a */
    private final na.a f8821a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lde/rki/covpass/sdk/ticketing/d$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "AUTHORIZATION_HEADER", "Ljava/lang/String;", "X_VERSION_HEADER", "X_VERSION_VALUE", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lna/b;", "Ltb/e0;", "b", "(Lna/b;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends v implements l<na.b<?>, e0> {

        /* renamed from: c */
        public static final b f8822c = new b();

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lua/c$a;", "Ltb/e0;", "b", "(Lua/c$a;)V"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends v implements l<c.a, e0> {

            /* renamed from: c */
            public static final a f8823c = new a();

            a() {
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

        b() {
            super(1);
        }

        public final void b(na.b<?> bVar) {
            t.e(bVar, "$this$config");
            bVar.j(ua.c.f23330d, a.f8823c);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(na.b<?> bVar) {
            b(bVar);
            return e0.f22152a;
        }
    }

    public d(na.a aVar) {
        t.e(aVar, "httpClient");
        this.f8821a = aVar.f(b.f8822c);
    }
}
