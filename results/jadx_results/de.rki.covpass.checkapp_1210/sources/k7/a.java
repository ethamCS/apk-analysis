package k7;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lk7/a;", BuildConfig.FLAVOR, "Landroid/app/Activity;", "a", "Landroid/app/Application;", "b", "()Landroid/app/Application;", "application", "Landroid/content/Context;", "localeRespectingContext$delegate", "Lkotlin/Lazy;", "c", "()Landroid/content/Context;", "localeRespectingContext", "Lk7/t;", "resourceProvider$delegate", "d", "()Lk7/t;", "resourceProvider", "<init>", "()V", "android-utils_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a */
    private final Lazy f14635a = tb.l.a(new C0213a());

    /* renamed from: b */
    private final Lazy f14636b = tb.l.a(new b());

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Context;", "b", "()Landroid/content/Context;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: k7.a$a */
    /* loaded from: classes.dex */
    public static final class C0213a extends hc.v implements gc.a<Context> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0213a() {
            super(0);
            a.this = r1;
        }

        /* renamed from: b */
        public final Context invoke() {
            return q.Companion.b(a.this.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lk7/t;", "b", "()Lk7/t;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<t> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            a.this = r1;
        }

        /* renamed from: b */
        public final t invoke() {
            return v.a(a.this.c());
        }
    }

    public abstract Activity a();

    public abstract Application b();

    public Context c() {
        return (Context) this.f14635a.getValue();
    }

    public t d() {
        return (t) this.f14636b.getValue();
    }
}
