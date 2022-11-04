package jb;

import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ljb/i;", BuildConfig.FLAVOR, "<init>", "()V", "a", "b", "c", "Ljb/i$a;", "Ljb/i$b;", "Ljb/i$c;", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class i {

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Ljb/i$a;", "Ljb/i;", "Ljb/h;", "relativeTo", "Ljb/h;", "a", "()Ljb/h;", "<init>", "(Ljb/h;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends i {

        /* renamed from: a */
        private final h f14273a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super(null);
            t.e(hVar, "relativeTo");
            this.f14273a = hVar;
        }

        public final h a() {
            return this.f14273a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljb/i$b;", "Ljb/i;", "Ljb/h;", "relativeTo", "<init>", "(Ljb/h;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends i {

        /* renamed from: a */
        private final h f14274a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar) {
            super(null);
            t.e(hVar, "relativeTo");
            this.f14274a = hVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljb/i$c;", "Ljb/i;", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends i {

        /* renamed from: a */
        public static final c f14275a = new c();

        private c() {
            super(null);
        }
    }

    private i() {
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
