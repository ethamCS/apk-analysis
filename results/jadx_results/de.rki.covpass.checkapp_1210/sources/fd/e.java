package fd;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public final class e implements Serializable {
    public static final a Companion = new a(null);

    /* renamed from: q */
    private static final e f10174q = new e(-1, -1);

    /* renamed from: c */
    private final int f10175c;

    /* renamed from: d */
    private final int f10176d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return e.f10174q;
        }
    }

    public e(int i10, int i11) {
        this.f10175c = i10;
        this.f10176d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f10175c == eVar.f10175c && this.f10176d == eVar.f10176d;
    }

    public int hashCode() {
        return (this.f10175c * 31) + this.f10176d;
    }

    public String toString() {
        return "Position(line=" + this.f10175c + ", column=" + this.f10176d + ')';
    }
}
