package bb;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001\bB\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lbb/j;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "name", "c", "toString", "content", "Ljava/lang/String;", "a", "()Ljava/lang/String;", BuildConfig.FLAVOR, "Lbb/i;", "parameters", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class j {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f5840a;

    /* renamed from: b */
    private final List<i> f5841b;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbb/j$a;", BuildConfig.FLAVOR, "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(String str, List<i> list) {
        hc.t.e(str, "content");
        hc.t.e(list, "parameters");
        this.f5840a = str;
        this.f5841b = list;
    }

    public final String a() {
        return this.f5840a;
    }

    public final List<i> b() {
        return this.f5841b;
    }

    public final String c(String str) {
        Object obj;
        boolean v10;
        hc.t.e(str, "name");
        Iterator<T> it = this.f5841b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            v10 = bf.x.v(((i) obj).c(), str, true);
            if (v10) {
                break;
            }
        }
        i iVar = (i) obj;
        if (iVar == null) {
            return null;
        }
        return iVar.d();
    }

    public String toString() {
        boolean b10;
        if (this.f5841b.isEmpty()) {
            return this.f5840a;
        }
        int length = this.f5840a.length();
        int i10 = 0;
        int i11 = 0;
        for (i iVar : this.f5841b) {
            i11 += iVar.c().length() + iVar.d().length() + 3;
        }
        StringBuilder sb2 = new StringBuilder(length + i11);
        sb2.append(a());
        int size = b().size();
        while (i10 < size) {
            int i12 = i10 + 1;
            i iVar2 = b().get(i10);
            String a10 = iVar2.a();
            String b11 = iVar2.b();
            sb2.append("; ");
            sb2.append(a10);
            sb2.append("=");
            b10 = k.b(b11);
            if (b10) {
                b11 = k.d(b11);
            }
            sb2.append(b11);
            i10 = i12;
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "{\n            val size =…   }.toString()\n        }");
        return sb3;
    }
}
