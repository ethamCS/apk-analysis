package wf;

import hc.t;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H&J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H&J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0014"}, d2 = {"Lwf/l;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "streamId", BuildConfig.FLAVOR, "Lwf/c;", "requestHeaders", BuildConfig.FLAVOR, "a", "responseHeaders", "last", "b", "Leg/e;", "source", "byteCount", "c", "Lwf/b;", "errorCode", "Ltb/e0;", "d", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface l {
    public static final a Companion = a.f25075a;

    /* renamed from: a */
    public static final l f25074a = new a.C0444a();

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\b"}, d2 = {"Lwf/l$a;", BuildConfig.FLAVOR, "Lwf/l;", "CANCEL", "Lwf/l;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f25075a = new a();

        @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0016J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u0016"}, d2 = {"Lwf/l$a$a;", "Lwf/l;", BuildConfig.FLAVOR, "streamId", BuildConfig.FLAVOR, "Lwf/c;", "requestHeaders", BuildConfig.FLAVOR, "a", "responseHeaders", "last", "b", "Leg/e;", "source", "byteCount", "c", "Lwf/b;", "errorCode", "Ltb/e0;", "d", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* renamed from: wf.l$a$a */
        /* loaded from: classes3.dex */
        private static final class C0444a implements l {
            @Override // wf.l
            public boolean a(int i10, List<c> list) {
                t.e(list, "requestHeaders");
                return true;
            }

            @Override // wf.l
            public boolean b(int i10, List<c> list, boolean z10) {
                t.e(list, "responseHeaders");
                return true;
            }

            @Override // wf.l
            public boolean c(int i10, eg.e eVar, int i11, boolean z10) {
                t.e(eVar, "source");
                eVar.skip(i11);
                return true;
            }

            @Override // wf.l
            public void d(int i10, b bVar) {
                t.e(bVar, "errorCode");
            }
        }

        private a() {
        }
    }

    boolean a(int i10, List<c> list);

    boolean b(int i10, List<c> list, boolean z10);

    boolean c(int i10, eg.e eVar, int i11, boolean z10);

    void d(int i10, b bVar);
}
