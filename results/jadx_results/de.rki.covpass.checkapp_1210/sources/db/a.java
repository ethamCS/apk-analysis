package db;

import bb.l;
import io.ktor.utils.io.h;
import io.ktor.utils.io.k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\u0003\u000b\u0010B\t\b\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Ldb/a;", BuildConfig.FLAVOR, "Lbb/c;", "b", "()Lbb/c;", "contentType", BuildConfig.FLAVOR, "a", "()Ljava/lang/Long;", "contentLength", "Lbb/l;", "c", "()Lbb/l;", "headers", "<init>", "()V", "d", "Ldb/a$b;", "Ldb/a$c;", "Ldb/a$d;", "Ldb/a$a;", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class a {

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Ldb/a$a;", "Ldb/a;", BuildConfig.FLAVOR, "d", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 6, 0})
    /* renamed from: db.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0130a extends a {
        public AbstractC0130a() {
            super(null);
        }

        public abstract byte[] d();
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldb/a$b;", "Ldb/a;", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static abstract class b extends a {
        public b() {
            super(null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Ldb/a$c;", "Ldb/a;", "Lio/ktor/utils/io/h;", "d", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static abstract class c extends a {
        public c() {
            super(null);
        }

        public abstract h d();
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Ldb/a$d;", "Ldb/a;", "Lio/ktor/utils/io/k;", "channel", "Ltb/e0;", "d", "(Lio/ktor/utils/io/k;Lxb/d;)Ljava/lang/Object;", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static abstract class d extends a {
        public d() {
            super(null);
        }

        public abstract Object d(k kVar, xb.d<? super e0> dVar);
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Long a() {
        return null;
    }

    public bb.c b() {
        return null;
    }

    public l c() {
        return l.Companion.a();
    }
}
